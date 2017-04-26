package cn.zhang.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {
	public static void main(String[] args) {
		BigDecimal num1=new BigDecimal(555555.366);
		BigDecimal num2=new BigDecimal(23555555.366);
		BigDecimal num3=new BigDecimal(32555555.366);
		BigDecimal num4=new BigDecimal(55345555.366);
		BigDecimal total=num1.add(num2);
		System.out.println(total.floatValue());
		System.out.println("*****************************");
		BigDecimal a1=new BigDecimal(Double.toString(12.22));
		System.out.println(a1);
		BigDecimal a2=new BigDecimal("12.23");
		System.out.println(a2);
		 BigDecimal a =new BigDecimal("1.22");
	        System.out.println("construct with a String value: " + a);
	        BigDecimal b =new BigDecimal("2.22");
	        a.add(b);
	        System.out.println("aplus b is : " + a);
	        
	    System.out.println("*******************`*****--");
	    BigDecimal ww=BigDecimal.valueOf(23.666666622222222222222222222222);
	    ww.setScale(50,RoundingMode.HALF_UP);
	    BigDecimal ww2=BigDecimal.valueOf(23.2222222222222);
	    ww2.setScale(50);
	    System.out.println(ww.add(ww2).doubleValue());
	}
}
