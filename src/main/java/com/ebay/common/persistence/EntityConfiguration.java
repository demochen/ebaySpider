package com.ebay.common.persistence;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component("ebayEntityConfiguration")
public class EntityConfiguration implements ApplicationContextAware {
	private static final Log LOG = LogFactory.getLog(EntityConfiguration.class);
	
	private ApplicationContext webApplicationContext;

	@javax.annotation.Resource(name = "eMergedEntityContexts")
	protected Set<String> mergedEntityContexts;
	private Resource[] entityContexts;

	public ApplicationContext getApplicationcontext() {
		return applicationcontext;
	}

	public void setApplicationcontext(ApplicationContext applicationcontext) {
		this.applicationcontext = applicationcontext;
	}

	@PostConstruct
	public void configureMergedItems() {
		Set<Resource> temp = new LinkedHashSet<Resource>();
		if (mergedEntityContexts != null && !mergedEntityContexts.isEmpty()) {
			for (String location : mergedEntityContexts) {
				temp.add(webApplicationContext.getResource(location));
			}
		}
		if (entityContexts != null) {
			for (Resource resource : entityContexts) {
				temp.add(resource);
			}
		}
		entityContexts = temp.toArray(new Resource[temp.size()]);
		applicationcontext = new GenericXmlApplicationContext(entityContexts);
	}

	private ApplicationContext applicationcontext;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.webApplicationContext = applicationContext;
	}

	public Object createEntityInstance(String beanId) {
		Object bean = applicationcontext.getBean(beanId);
		if (LOG.isDebugEnabled()) {
			LOG.debug("Returning instance of class ("
					+ bean.getClass().getName() + ") configured with bean id ("
					+ beanId + ')');
		}
		return bean;
	}
}
