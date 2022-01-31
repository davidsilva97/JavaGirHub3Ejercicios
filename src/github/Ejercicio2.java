package github;
import java.util.Scanner;


public class Ejercicio2 {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int tipo,cantidad;
		double resultado= 0;
		do {
			System.out.println("\n\n1.Normal\n2.Niño\n3.Adulto Mayor\n4.Continuar\nIngresa el tipo de boleto a comprar:");
			tipo = entrada.nextInt();
			
			
			switch(tipo) {
			case 1:
				System.out.print("Cuantos boletos adulto vas a comprar: ");
				cantidad = entrada.nextInt();
				System.out.print("Boletos Adultos cantidad: "+cantidad);
				resultado+= cantidad*50;
				break;
			case 2:
				System.out.print("\nCuantos boletos Niño vas a comprar: ");
				cantidad = entrada.nextInt();
				System.out.print("\nBoletos Niño cantidad: "+cantidad);
				resultado+=(cantidad*50)-((cantidad*50)*0.60) ;
				break;
			case 3:
				System.out.print("Cuantos boletos Adulto mayor vas a comprar: ");
				cantidad = entrada.nextInt();
				System.out.print("Boletos Adulto cantidad: "+cantidad);
				resultado+= (cantidad*50)-((cantidad*50)*0.55) ;
				break;
				
			case 4:
				System.out.print("Total a pagar: $"+resultado);
				break;
			default:
				System.out.print("Opcion no correcta");
			}
			
				
		}while(tipo!=4);
		
		
		
	}
}
