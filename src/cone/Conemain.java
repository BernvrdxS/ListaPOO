package cone;
import java.util.Scanner;


public class Conemain {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);

		
	    System.out.print("Informe os valores do raio e da altura");
	    float raio = entrada.nextFloat();
	    float altura = entrada.nextFloat();
	    System.out.print("Informe o tipo da tinta a ser utilizada, 1-R$238.90, 2-R$467.98 e 3-R$758.34");
	    int tipo = entrada.nextInt();
	    
	    Cone raioCone = new Cone(raio, altura, tipo);
	    System.out.println(raioCone);
	    
	    entrada.close();
	}
}

