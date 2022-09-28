package EOI;

import java.util.Scanner;

public class EjerciciosTema01 {

	public static void main(String[] args) {

		menu();
	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("--ELIGE UN EJERCICIO--" + 
							"\n1-Ejercicio 01" + 
							"\n2-Ejercicio 02" + 
							"\n3-Ejercicio 03" + 
							"\n4-Ejercicio 04" + 
							"\n5-Ejercicio 05" +
							"\n6-Ejercicio 06" + 
							"\n7-Ejercicio 07" + 
							"\n8-Ejercicio 08" + 
							"\n9-Ejercicio 09" + 
							"\n10-Ejercicio 10" + 
							"\n11-Ejercicio 11" + 
							"\n12-Ejercicio 12" + 
							"\n13-Ejercicio 13" + 
							"\n14-Ejercicio 14" + 
							"\n15-Ejercicio 15" + 
							"\n20-Ejercicio 20" + 
							"\n21-Ejercicio 21");
		
		switch(opcion = sc.nextInt()) {
			
		case 1:{
			
			Ejercicio01();
			break;
		}
		
		case 2:{
			Ejercicio02();
			break;		
		}
		
		case 3:{
			Ejercicio03();
			break;		
		}
		
		case 4:
		{
			Ejercicio04();
			break;
		}
		
		case 5:
		{
			Ejercicio05();
			break;
		}
		
		case 6:
		{
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
		
		case 10:{
			Ejercicio10();
			break;
		}
		
		case 11:{
			Ejercicio11();
			break;
		}
		
		case 12:{
			Ejercicio12();
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
		
		case 15:{
			Ejercicio15();
			break;
		}
		
		case 20:{
			Ejercicio20();
		}
		
		case 21:{
			Ejercicio21();
			break;
		}
		
		
		}// FIN DEL SWITCH	
	}// FIN DEL MENU
	
	
	public static void Ejercicio01() {
		int numeroA = 0, numeroB = 0, resultado = 0;
		numeroA = 36;
		numeroB = 27;
		resultado = numeroA + numeroB;
		System.out.println(numeroA + " + " + numeroB + " = " + resultado);
	}
	
	public static void Ejercicio02() {
		int numeroA = 0, numeroB = 0, resultado = 0;
		numeroA = 15;
		numeroB = 4;
		// SUMA
		resultado = numeroA + numeroB;
		System.out.println(numeroA + " + " + numeroB + " = " + resultado);
		// RESTA
		resultado = numeroA - numeroB;
		System.out.println(numeroA + " - " + numeroB + " = " + resultado);
		// DIVISIÓN
		resultado = numeroA / numeroB;
		System.out.println(numeroA + " / " + numeroB + " = " + resultado);
		// MULTIPLICACIÓN
		resultado = numeroA * numeroB;
		System.out.println(numeroA + " * " + numeroB + " = " + resultado);
		// RESTO
		resultado = numeroA % numeroB;
		System.out.println(numeroA + " % " + numeroB + " = " + resultado);						
	}
	
	public static void Ejercicio03() {
		
		int variable1 = 5, variable2 = 5;
		boolean comprobar = false;
		
		if(variable1 < variable2) {
			comprobar = true;
			System.out.println(variable1 + " es menor que " + variable2 + ": " + comprobar);
		}else {
			comprobar = false;
			System.out.println(variable1 + " no es menor que " + variable2 + ": " + comprobar);
		}
		
		if(variable1 == variable2) {
			comprobar = true;
			System.out.println(variable1 + " es igual a " + variable2 + ": " + comprobar);
		}else {
			comprobar = false;
			System.out.println(variable1 + " es igual a " + variable2 + ": " + comprobar);
		}
		
		if(variable1 >= variable1) {
			comprobar = true;
			System.out.println(variable1 + " es mayor o igual a " + variable2 + ": " + comprobar);
		}else {
			comprobar = false;
			System.out.println(variable1 + " es mayor o igual a " + variable2 + ": " + comprobar);
		}			
	}
	
	public static void Ejercicio04() {
		double variable1 = 5.5, variable2 = 6.7, variable3 = 8.2, variable4 = 2.1;
		double resultado = 0;
		// MOSTRAR VARIABLES
		System.out.println(variable1 + " " + variable2 + " " + variable3 + " " + variable4);
		
		resultado = (variable1 + variable2) * variable3 / variable4;
		resultado = variable1 + variable2;
		System.out.println(resultado);
		resultado = resultado * variable3;
		System.out.println(resultado);
		resultado = resultado / variable4;
		System.out.println(resultado);
		
		// OPERACIONES JUNTAS
		System.out.println(resultado = (variable1 + variable2) * variable3 / variable4);

	}
	
	public static void Ejercicio05() {
		int N = 1, resultado = 0;
		System.out.println("Valor inicial de N = " + N);
		resultado = N + 77;
		System.out.println(N + " + " + 77 + " = " + resultado );
		resultado = resultado - 3;
		System.out.println(N + " - " + 3 + " = " + resultado) ;
		resultado = resultado * 2;
		System.out.println(N + " * " + 2 + " = " + resultado);
	}
	
	public static void Ejercicio06() {
		int A = 1, B = 2, C = 3, D = 4,auxiliarA, auxiliarB;
		System.out.println("Valores iniciales: " + "A = " + A + "," + "B = " + B + "," + "C = " + C + "," + "D = " + D);
		auxiliarA = A;
		auxiliarB = B;		
		System.out.println(B = C);
		System.out.println(C = A);
		System.out.println(auxiliarA = D);
		System.out.println(D = auxiliarB);						
	}
	
	public static void Ejercicio07() {
		
		char caracter1 = 'b';
		char caracter2 = 'k';
		int diferencia = 0;
		System.out.println(caracter1 + "  tiene la posición " + (int)caracter1);
		System.out.println(caracter2 + "  tiene la posición " + (int)caracter2);
		diferencia = (int)caracter2 - (int)caracter1;
		System.out.println("Diferencia entre 'b' y 'k' : " + diferencia);
	}
	
	public static void Ejercicio08() {
		
		
		 
		
	}
	
	public static void Ejercicio09() {
		String nombre = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
		
	}
	
	public static void Ejercicio10() {
		int leerNumero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		leerNumero = sc.nextInt();
		System.out.println(leerNumero * 2);
		System.out.println(leerNumero * 3);

		
	}
	
	public static void Ejercicio11() {
		double gradosC = 0, F = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los grados");
		gradosC = sc.nextDouble();
		F = 32 + (9*gradosC/5);
		System.out.println(F);
		
	}
	
	public static void Ejercicio12() {
		int numeroTresCifras = 0, numero1 = 0,numero2 = 0,numero3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero de 3 cifras");
		numeroTresCifras = sc.nextInt();
		
		numero3 = numeroTresCifras % 10;
		numero2 = (numeroTresCifras / 10) % 10;
		numero1 = numeroTresCifras / 100;
		//System.out.println(numero3);
		//System.out.println(numero2);
		System.out.println("Cifra número 1: " + numero1);
		System.out.println("Cifra número 2: " + numero2);
		System.out.println("Cifra número 3: " + numero3);


	}
	
	public static void Ejercicio13() {
		Scanner sc = new Scanner(System.in);
		int dia = 0, mes = 0, anyo = 0, sumatorio = 0, numSuerte = 0,numero2= 0,numero3=0,numero4=0;
		
		System.out.println("--FECHA DE NACIMIENTO--");
		System.out.println("nIntroduce día");
		dia = sc.nextInt();	
		System.out.println("Introduce mes");
		mes = sc.nextInt();
		System.out.println("Introduce anyo");
		anyo = sc.nextInt();
		
		sumatorio = dia + mes + anyo;
		
		numero4 = sumatorio % 10;
		
		sumatorio = sumatorio / 10;
		numero3 = sumatorio % 10;

		sumatorio = sumatorio / 10;
		numero2 = sumatorio % 10;

		sumatorio = sumatorio / 10;

		numSuerte = numero4 + numero3 + numero2 + sumatorio;
		System.out.println("Número de la suerte: " + numSuerte);
		
	}
	
	public static void Ejercicio14() {
		
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		
		System.out.println("Dentro de 15 anyos tendrás " + (edad + 15));
		
	}

	public static void Ejercicio15() {
		
		Scanner sc = new Scanner(System.in);
		String nombreP1 = "", nombreP2 = "", nombreP3 = "";
		double precioP1 = 0, precioP2 = 0, precioP3 = 0;
		
		System.out.println("Introduce el nombre del producto 1");
		nombreP1 = sc.nextLine();
		System.out.println("Introduce el precio del producto 1");
		precioP1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Introduce el nombre del producto 2");
		nombreP2 = sc.nextLine();
		System.out.println("Introduce el precio del producto 2");
		precioP2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Introduce el nombre del producto 3");
		nombreP3 = sc.nextLine();
		System.out.println("Introduce el precio del producto 3");
		precioP3 = sc.nextDouble();
		
		System.out.printf("%-15s%12s%12s\n", "NOMBRE", "PRECIO", "CON IVA");
		System.out.printf("%-15s%11.2f€%11.2f€\n", nombreP1, precioP1, (precioP1 * 1.21));
		System.out.printf("%-15s%11.2f€%11.2f€\n", nombreP2, precioP2, (precioP2 * 1.21));
		System.out.printf("%-15s%11.2f€%11.2f€\n", nombreP3, precioP3, (precioP3 * 1.21));
		
		
	}
	
	public static void Ejercicio20() {
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		
		System.out.println("Introduce el número 1");
		num1 = sc.nextInt();
		System.out.println("Introduce el número 2");
		num2 = sc.nextInt();
		System.out.println("Introduce el número 3");
		num3 = sc.nextInt();
		
		System.out.println("Has escrito: " + num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void Ejercicio21() {
		
		Scanner sc = new Scanner(System.in);
		String nombre = "";
		int edad = 0;
		
		System.out.println("Introduce tu nombre");
		nombre = sc.nextLine();
		
		System.out.println("Introduce tu edad");
		edad = sc.nextInt();
		
		System.out.println("Estos son tus datos\n" + 
							"\tNombre: " + nombre + "\n" +
							"\tEdad: " + edad);
		
		
		
		
		
	}
	

}


