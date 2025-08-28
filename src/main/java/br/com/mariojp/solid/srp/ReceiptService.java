package br.com.mariojp.solid.srp;

public class ReceiptService {
	@SuppressWarnings("unused")
	private final TaxCalculator taxCalculator;
	
	public ReceiptService() {
		this.taxCalculator = new TaxCalculator();
	}
	
	public String generate(Order order) {
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		
		double tax = taxCalculator.calculateTax(subtotal);
		double total = subtotal + tax;
		
		ReceiptFormatter textFormat = new ReceiptFormatter();
		return textFormat.receiptTextFormat(order, subtotal, total, tax);
	}
}