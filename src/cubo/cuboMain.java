package cubo;

import java.util.Scanner;

public class cuboMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner entrada = new Scanner(System.in);

		
	    System.out.print("Informe os valores da area e do rendimento");
	    float area = entrada.nextFloat();
	    float rendimento = entrada.nextFloat();
	    System.out.print("Informe o tipo da tinta a ser utilizada, 1-R$101.90, 2-R$212.45 e 3-R$345.56");
	    int tipo = entrada.nextInt();
	    
	    cubo areaCubo = new cubo(area, rendimento, tipo);
	    System.out.println(areaCubo);
	    
	    entrada.close();
	}

}
