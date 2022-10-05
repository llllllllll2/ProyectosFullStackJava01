package eoi;

import java.util.Scanner;

public class EjerciciosTema02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*String palabra = "ordenador";
		for(int i = 0; i < palabra.length();i++) {
			System.out.println(palabra.charAt(i));
		}
		*/
	
		menu();
		
	}
	
	
	public static void menu(){
		
		int opcion = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
		
		System.out.println("\n0-Salir" + 
							"\n2-Ejercicio 02" + 
							"\n3-Ejercicio 03" + 
							"\n4-Ejercicio 04" + 
							"\n5-Ejercicio 05" +
							"\n6-Ejercicio 06" +
							"\n7-Ejercicio 07" +
							"\n8-Ejercicio 08" +
							"\n9-Ejercicio 09" + 
							"\n11-Ejercicio 11 " +
							"\n19-Ejercicio 19" +
							"\n40-Ejercicio 11.2" +
							"\n13-Ejercicio 13" +
							"\n14-Ejercicio 14" );
		switch(opcion = sc.nextInt()) {
		
		case 2:{
			
			Ejercicio02();
			break;
		}
		
		case 3:{
			
			Ejercicio03();
			break;
		}
		
		case 4:{
			Ejercicio04();
			break;
			
		}
		
		case 5:{
			Ejercicio05();
			break;
		}
		
		case 6:{
			Ejercicio06();
			break;
			
		}
		
		case 7:{
			Ejercicio07();
			break;
		}
		
		case 8:{
			Ejercicio08();
			break;
		}
		
		case 9:{
			Ejercicio09();
			break;
			
		}
		
		case 11:{
			Ejercicio11();
			break;
		}
		
		case 13:{
			Ejercicio13();
			break;
		}
		
		case 14:{
			Ejercicio14();
			break;
		}
		
		case 19:{
			Ejercicio19();
			break;
		}
		case 40:{
			Ejercicio11CalculadoraBasica();
			break;
		}
		

		}
		
		}while(opcion != 0);


	
	}	
	
	public static void Ejercicio02() {
		Scanner sc = new Scanner(System.in);
		int pedirNumero = 0;
		
		System.out.println("Introduce un numero");
		pedirNumero = sc.nextInt();
		
		if(pedirNumero % 10 == 0) {
			System.out.println("El numero " + pedirNumero + " es múltiplo de 10");
			
		}else {
			
			System.out.println("El numero " + pedirNumero + " no es múltiplo de 10");
		}
				
	}
	
	public static void Ejercicio03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escribe una letra y pulsa enter: ");
		char letra = sc.next().charAt(0);

		if (letra >= 'A' && letra <= 'Z') {
			System.out.println("La letra '" + letra + "' es mayúscula");
		} else {
			System.out.println("No es una letra mayúscula");
		}
		
	}
	
	public static void Ejercicio04() {
		
		Scanner sc = new Scanner(System.in);
		String cadena1 = "", cadena2 = "";
		System.out.println("Introduce una cadena");
		cadena1 = sc.nextLine();
		System.out.println("Introduce otra cadena");
		cadena2 = sc.nextLine();
		
		if(cadena1.equals(cadena2)) {
			System.out.println("Las cadenas de texto son iguales");
		}else {
			System.out.println("Las cadenas de texto no son iguales");
			
		}
		
	}
	
	public static void Ejercicio05() {
		
		Scanner sc = new Scanner(System.in);
		double numero1 = 0, numero2 = 0, resultado = 0;
		System.out.println("Introduce un núnmero");
		numero1 = sc.nextDouble();
		System.out.println("Introduce otro núnmero");
		numero2 = sc.nextDouble();
		if(numero2 == 0) {
			System.out.println("El número no puede ser 0");
		}else {
			
			resultado = numero1 / numero2;
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);
		}
		
		
		
		
		
	}
	
	public static void Ejercicio06() {
		Scanner sc = new Scanner(System.in);
		int numero1 = 0, numero2 = 0, numero3 = 0;
		System.out.println("Introduce el número 1");
		numero1 = sc.nextInt();
		System.out.println("Introduce el número 2");
		numero2 = sc.nextInt();
		System.out.println("Introduce el número 3");
		numero3 = sc.nextInt();
		
		if(numero1 > numero2) {
			if(numero1 > numero3) {
				System.out.println("El número mayor es el " + numero1);
			}else {
				System.out.println("El número mayor es el " + numero3);
				
			}
		}else {
			if(numero2 > numero3) {
				
				System.out.println("El número mayor es el " + numero2);
			}else {
				System.out.println("El número mayor es el " + numero3);
				
			}
			
		}
		
	}
	
	public static void Ejercicio07() {
		
	}
	
	public static void Ejercicio08() {
		
		Scanner sc = new Scanner(System.in);
		int variableA = 0;
		System.out.println("Introduce un numero");
		variableA = sc.nextInt();
		System.out.println(variableA % 2 == 0 ? "Es par" : "Es impar"  );
		
	}
	
	public static void Ejercicio09() {

		Scanner sc = new Scanner(System.in);
		int mes = 0;
		System.out.println("Introduce un mes en número");
		mes = sc.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("Enero tiene 31 días.");
			break;
		case 2:
			System.out.println("Febrero tiene 28 días.");
			break;
		case 3:
			System.out.println("Marzo tiene 31 días.");
			break;
		case 4:
			System.out.println("Abril tiene 30 días.");
			break;
		case 5:
			System.out.println("Mayo tiene 31 días.");
			break;
		case 6:
			System.out.println("Junio tiene 30 días.");
			break;
		case 7:
			System.out.println("Julio tiene 31 días.");
			break;
		case 8:
			System.out.println("Agosto tiene 31 días.");
			break;
		case 9:
			System.out.println("Septiembre tiene 30 días.");
			break;
		case 10:
			System.out.println("Octubre tiene 31 días.");
			break;
		case 11:
			System.out.println("Nomviembre tiene 30 días.");
			break;
		case 12:
			System.out.println("Diciembre tiene 31 días.");
			break;
		
		}
		
		
		
		
	}
	
	public static void Ejercicio11() {
		
		Scanner sc = new Scanner(System.in);
		double numero1 = 0, numero2 = 0, resultado = 0;
		int opcion = 0;
		
		System.out.println("Introduce un numero");
		numero1 = sc.nextDouble();
		
		System.out.println("Introduce un segundo numero");
		numero2 = sc.nextDouble();
		
		System.out.println("--ELIGE UNA OPCION" + 
							"\n1-Sumar " + 
							"\n2-Restar" + 
							"\n3-Multiplicar " + 
							"\n4.-Dividir");
		
		switch(opcion = sc.nextInt()) {
		
		case 1:{
			
			System.out.println("SUMA");
			resultado = numero1 + numero2;
			System.out.println("El resultado es " + resultado);
			break;
		}
		
		case 2:{
			System.out.println("RESTA");
			resultado = numero1 - numero2;
			System.out.println("El resultado es " + resultado);
			break;
			
		}
		
		case 3:{
			System.out.println("MULTIPLICACION");
			resultado = numero1 * numero2;
			System.out.println("El resultado es " + resultado);
			break;
			
		}
		
		case 4:{
			System.out.println("DIVION");
			if(numero2 == 0) {
				System.out.println("No se puede dividir entre 0 " + 
									"\nElige un nuevo numero");
				numero2 = sc.nextDouble();
				resultado = numero1 / numero2;
				System.out.println("El resultado es " + resultado);
			}else {
				
				resultado = numero1 / numero2;
				System.out.println("El resultado es " + resultado);
			}
			break;
			
		}
		
		}
		
		
		
		
	}
	
	public static void Ejercicio11CalculadoraBasica() {
		Scanner sc = new Scanner(System.in);
		double numero1 = 0, numero2 = 0, resultado = 0;
		int opcion = 0;
		
		do {
		
		
		System.out.println("--ELIGE UNA OPCION" + 
							"\n1-Sumar " + 
							"\n2-Restar" + 
							"\n3-Multiplicar " + 
							"\n4-Dividir" + 
							"\n0-Salir");
		opcion = sc.nextInt();
		if(opcion!= 0) {
			System.out.println("Introduce un numero");
			numero1 = sc.nextDouble();
			
			System.out.println("Introduce un segundo numero");
			numero2 = sc.nextDouble();
			
			switch(opcion) {
			
			case 1:{
				
				System.out.println("SUMA");
				resultado = numero1 + numero2;
				System.out.println("El resultado es " + resultado);
				break;
			}
			
			case 2:{
				System.out.println("RESTA");
				resultado = numero1 - numero2;
				System.out.println("El resultado es " + resultado);
				break;
				
			}
			
			case 3:{
				System.out.println("MULTIPLICACION");
				resultado = numero1 * numero2;
				System.out.println("El resultado es " + resultado);
				break;
				
			}
			
			case 4:{
				System.out.println("DIVION");
				if(numero2 == 0) {
					System.out.println("No se puede dividir entre 0 " + 
										"\nElige un nuevo numero");
					numero2 = sc.nextDouble();
					resultado = numero1 / numero2;
					System.out.println("El resultado es " + resultado);
				}else {
					
					resultado = numero1 / numero2;
					System.out.println("El resultado es " + resultado);
				}
				break;
				
			}
			}
		}
		
		
		
		
		}while(opcion != 0);
		
		
	}
	
	public static void Ejercicio13() {
		int numero = 20;
		System.out.println("Bucle while");
		while(numero >= 1){
			System.out.println(numero);
			numero--;
		}
		
		numero = 20;
		System.out.println("Bucle for");
		for(int i = numero; i >= 1;i--) {
			System.out.println(i);
		}
		
	}

	public static void Ejercicio14() {
		Scanner sc = new Scanner(System.in);
		int sumador = 0, pedirNumero = 0;
		
		do {
			System.out.println("Introduce un número");
			pedirNumero = sc.nextInt();
			sumador += pedirNumero;
			System.out.println("Sumador actual: " + sumador);
			
		}while(pedirNumero != 0);
		
		
		
	}

	public static void Ejercicio19() {
		Scanner sc = new Scanner(System.in);
		int numero  = 0;
		System.out.println("Introduce un número");
		numero = sc.nextInt();
		
		for(int i = 1;i <= numero;i++) {
			if(i < numero) {
				System.out.print(i + ",");
				
			}else {
				
				System.out.print(i);
			}
		}
		
		
		
	}
	
	
}



