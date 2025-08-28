package br.com.mariojp.solid.srp;

public class TaxCalculator {
private double rateTax;
	
	public TaxCalculator() {
		String rateString = System.getProperty("tax.rate", "0.10");
		this.rateTax = Double.parseDouble(rateString);
	}
	
	public double calculateTax(double subTotal) {		
		return subTotal * this.rateTax;
	}
	
	public double getTax() {
		return this.rateTax;
	}
	
	public void setTax(double tax) {
		this.rateTax = tax;
	}
}
