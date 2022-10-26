package questao_3_12;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice1 = new Invoice("1", "prestigio", 10, 1.50);
		Invoice invoice2 = new Invoice("2", "diamante negro", 15, 2.50);
		Invoice invoice3 = new Invoice("3", "laka", 2, 9.95);
		Invoice invoice4 = new Invoice("4", "caribe", -2, 4.00);

		double invoiceAmount1 = invoice1.getInvoiceAmount();
		double invoiceAmount2 = invoice2.getInvoiceAmount();
		double invoiceAmount3 = invoice3.getInvoiceAmount();
		double invoiceAmount4 = invoice4.getInvoiceAmount();
		
		System.out.printf("O valor de %d unidades de %s a %.2f a unidade é de %.2f%n", 
				invoice1.getQuantidade(), invoice1.getDescricao(), invoice1.getPreco(), invoiceAmount1);
		System.out.printf("O valor de %d unidades de %s a %.2f a unidade é de %.2f%n", 
				invoice2.getQuantidade(), invoice2.getDescricao(), invoice2.getPreco(), invoiceAmount2);
		System.out.printf("O valor de %d unidades de %s a %.2f a unidade é de %.2f%n", 
				invoice3.getQuantidade(), invoice3.getDescricao(), invoice3.getPreco(), invoiceAmount3);
		System.out.printf("O valor de %d unidades de %s a %.2f a unidade é de %.2f%n", 
				invoice4.getQuantidade(), invoice4.getDescricao(), invoice4.getPreco(), invoiceAmount4);
	}

}
