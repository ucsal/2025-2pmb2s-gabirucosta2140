package br.com.mariojp.solid.srp;

public class ReceiptFormatter {
	public String receiptTextFormat(Order order, double subtotal, double totalComTaxa, double tax) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("=== RECIBO ===\n");
		for (var item : order.getItems()) {
			sb.append(item.getName()).append(" x").append(item.getQuantity()).append(" = ").append(item.getQuantity() * item.getUnitPrice()).append("\n");
		}
		sb.append("Subtotal: ").append(subtotal).append("\n");
		sb.append("Tax: ").append(tax).append("\n");
		sb.append("Total: ").append(totalComTaxa).append("\n");
		
		return sb.toString();
	}
}
