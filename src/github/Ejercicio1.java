package github;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double comision;
		double total = 0;
		
		System.out.print("Ingresa el valor de la compra: ");
		int valor = entrada.nextInt();
		
		
		if(valor<=1000) {
			System.out.print("Comision no aplicada a compras menores a 1000 por lo tanto debe pagar: $"+valor+" pesos");
		}else if(valor>1000 && valor<5000){
			comision = valor*0.10;
			total = comision+valor;
			System.out.print("Compra: "+valor+"\nComision del 10%: $"+comision+"\nTotal a pagar: $"+total+" pesos");
		}
		else if(valor>=5000 && valor<10000){
			comision = valor*0.20;
			total = comision+valor;
			System.out.print("Compra: "+valor+"\nComision del 20%: $"+comision+"\nTotal a pagar: $"+total+" pesos");
		}else {
			comision = valor*0.30;
			total = comision+valor;
			System.out.print("Compra: "+valor+"\nComision del 30%: $"+comision+"\nTotal a pagar: $"+total+" pesos");
		}
	}
}
