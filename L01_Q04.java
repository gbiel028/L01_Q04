import java.util.Scanner;
public class L01_Q04 {

	public static void main(String[] args) {
		String NomeProd;
		int QuantProd;
		double VlrUndProd, TotComp;
		
		Scanner LerProd = new Scanner(System.in);

		Scanner LerQuantProd = new Scanner(System.in);

		Scanner LerVlrProd = new Scanner(System.in);
		
		System.out.println("Produto: ");
		NomeProd = LerProd.nextLine();
		
		System.out.println("Quant.: ");
		QuantProd = LerQuantProd.nextInt();
		
		System.out.println("Valor Unit.: ");
		VlrUndProd = LerVlrProd.nextDouble();
		
		TotComp = VlrUndProd * QuantProd;
		
		if (TotComp <= 100) {
			System.out.println("Produto: " + NomeProd);
			System.out.println("Quant.: " + QuantProd);
			System.out.printf("Unit.: %.2f", VlrUndProd);
			System.out.printf("\nTotal: %.2f", TotComp);
	}else {
		System.out.println("Produto: " + NomeProd);
		System.out.println("Quant.: " + QuantProd);
		System.out.printf("Unit.: %.2f", VlrUndProd);
		System.out.printf("\nTotal: %.2f", TotComp);
		System.out.printf("\nDesc. %.2f", TotComp * 0.1);
		System.out.printf("\nTotal Final: %.2f", TotComp - (TotComp * 0.1));
	}
	LerProd.close();
	LerQuantProd.close();
	LerVlrProd.close();
	}
}
