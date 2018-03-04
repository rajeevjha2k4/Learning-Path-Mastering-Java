package oop;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 1234567;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println(nf.format(amount));
		
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(nf.format(amount));
		
		nf = NumberFormat.getPercentInstance(Locale.FRANCE);
		System.out.println(nf.format(amount));
		
		System.out.println(nf.getClass().getName());
		
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1.getClass().getName());
		

	}

}
