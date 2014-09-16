package com.ebay.util.kmeans;

import java.util.ArrayList;
import java.util.List;

import com.ebay.domain.price.PriceDot;

public class Kmeans {
    final static String RANDOMTYPE="1";
    final static String ORDERTYPE="2";
    /**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
        List<PriceDot>  list=new ArrayList<PriceDot>();
        PriceDot dot = new PriceDot(0, 2);
        PriceDot dot1 = new PriceDot(0, 0);
        PriceDot dot2 = new PriceDot(1.5, 0);
        PriceDot dot3 = new PriceDot(5, 0);
        PriceDot dot4 = new PriceDot(5, 2);
		list.add(dot);
		list.add(dot1);
		list.add(dot2);
		list.add(dot3);
		list.add(dot4);
		List<PriceDot>  ini=getIntiDots(list,2);
		List<PriceDot> firstCu=new ArrayList<PriceDot>();
		firstCu.add(ini.get(0));
		List<PriceDot> secCu=new ArrayList<PriceDot>();
		secCu.add(ini.get(1));
		List<PriceDot>  first=list.subList(2, list.size());
		List<Double> compare=new ArrayList<Double>();
		for(int i=0;i<ini.size();i++){
			for(int j=0;j<first.size();j++){
				double E=caclautePerPoint(first.get(j),ini.get(i));
				compare.add(E);
			}
		}
		for(int j=0;j<first.size();j++){
			if(compare.get(j)<compare.get(j+first.size())){
				firstCu.add(first.get(j));
			}else{
				secCu.add(first.get(j));
			}
		}
		double e1=getESqrt(firstCu,firstCu.get(0));
		double e2=getESqrt(secCu,secCu.get(0));
		PriceDot newcu1=new PriceDot(getCenterDot(firstCu).price, getCenterDot(firstCu).count);
		PriceDot newcu2=new PriceDot(getCenterDot(secCu).price, getCenterDot(secCu).count);
	}

	public static double caclautePerPoint(PriceDot ndot, PriceDot orid) {
		double x1 = (ndot.price - orid.price) * (ndot.price - orid.price);
		double y1 = (ndot.count - orid.count) * (ndot.count - orid.count);
		return Math.sqrt(x1+y1);
	}
	public static double caclauteCPerPoint(PriceDot ndot, PriceDot orid) {
		double x1 = (ndot.price - orid.price) * (ndot.price - orid.price);
		double y1 = (ndot.count - orid.count) * (ndot.count - orid.count);
		return x1+y1;
	}

	public static PriceDot getCenterDot( List<PriceDot> olddot) {
		double x1 = 0.00;
		double y1 = 0.00;
		for (PriceDot pd : olddot) {
			x1 = x1 + pd.price;
			y1 = y1 + pd.count;
		}
		double x = x1  / olddot.size();
		double y = y1  / olddot.size();
		PriceDot dot = new PriceDot(x, new Double(y).longValue());
		return dot;
	}
	
	public static List<PriceDot> getIntiDots(List<PriceDot> olddot,int count){
		List<PriceDot> alist=olddot.subList(0, count);
		return alist;
	}
	
	public static double getESqrt(List<PriceDot> olddot ,PriceDot center){
		
		double E=0;
		for(int i=0;i<olddot.size();i++){
			E=E+caclauteCPerPoint(olddot.get(i),center);
		}
		return E;
	}
  public  static double[]  dealDots(List<PriceDot>  list ){
	  double[] resultarray=new double[2];
	  List<PriceDot> result=new ArrayList<PriceDot>();
	  List<PriceDot>  ini=getIntiDots(list,2);
		List<PriceDot> firstCu=new ArrayList<PriceDot>();
		firstCu.add(ini.get(0));
		List<PriceDot> secCu=new ArrayList<PriceDot>();
		secCu.add(ini.get(1));
		List<PriceDot>  first=list.subList(2, list.size());
		List<Double> compare=new ArrayList<Double>();
		for(int i=0;i<ini.size();i++){
			for(int j=0;j<first.size();j++){
				double E=caclautePerPoint(first.get(j),ini.get(i));
				compare.add(E);
			}
		}
		for(int j=0;j<first.size();j++){
			if(compare.get(j)<compare.get(j+first.size())){
				firstCu.add(first.get(j));
			}else{
				secCu.add(first.get(j));
			}
		}
		double e1=getESqrt(firstCu,firstCu.get(0));
		double e2=getESqrt(secCu,secCu.get(0));
		double e3=e1+e2;
		
		resultarray[0]=getCenterDot(firstCu).price;
//		resultarray[1]=getCenterDot(secCu).price;
//		PriceDot newcu1=new PriceDot(getCenterDot(firstCu).price, getCenterDot(firstCu).count);
//		PriceDot newcu2=new PriceDot(getCenterDot(secCu).price, getCenterDot(secCu).count);
//		result.add(newcu1);
//		result.add(newcu2);
		return resultarray;
		
  }
}
