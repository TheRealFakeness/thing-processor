import java.util.Scanner;

/** Allows the user to perform different operations on a set of values, entered by the user, whose data type is also chosen by the user.
 * @author Juan José Bohórquez Jaramillo
 * @author juanjo312003@gmail.com
 * @version 1.0
*/
public class Lab1 {
		private static Scanner sc = new Scanner(System.in);
		private static int menu;
		
		/** Gets the data type from the user.
		@return An integer representing the option chosen.
		*/
		public static int getOption(){
		System.out.println("Ingrese una opcion: \n 1: Ingresar tres cadenas \n 2: Ingresar dos numeros \n 3: Ingresar tres arreglos de numeros enteros");
		menu = sc.nextInt();
		sc.nextLine();
		
		return menu;
		}
		
		/** Executes the option chosen by the user, stored in the variable "menu".
		*/
		public static void menu(){
		switch(menu) {
			case 1:
				case1();
				break;
			case 2:
				case2();
				break;
			case 3:
				case3();
				break;
			default:
			System.out.println("No ha ingresado una opcion valida");
			break;
			}
		}
		
		/**Asks the user for three character strings. Then it gives the user three options:
		* 1. Show the strings, separated by a space.
		* 2. Display the character of each string in a position the user chooses.
		* 3. Display the length of each string.
		*/
		public static void case1(){
			System.out.println("Ingrese tres cadenas de texto:");
				String cadena1 = sc.next();
				sc.nextLine();
				String cadena2 = sc.next();
				sc.nextLine();
				String cadena3 = sc.next();
				sc.nextLine();
				
				System.out.println("Ingrese una opcion:");
				System.out.println("1: Concatenar las tres cadenas");
				System.out.println("2: Mostrar el caracter en la posicion que ingrese");
				System.out.println("3: Mostrar la longitud de cada cadena");
				
				menu = sc.nextInt();
				sc.nextLine();
			
				switch(menu) {
				case 1:
				System.out.println(cadena1+" "+cadena2+" "+cadena3);
				break;

				case 2:
				System.out.println("Ingrese la posicion del caracter:");
				int caracter = sc.nextInt();
				sc.nextLine();
				if(caracter>cadena1.length() || caracter>cadena2.length() || caracter>cadena3.length()){
					System.out.println("Posicion no valida");
				break;
				}else {
					System.out.println(cadena1.charAt(caracter-1) + " " + cadena2.charAt(caracter-1) + " " + cadena3.charAt(caracter-1));
				break;
				}
				
				case 3:
				System.out.println("Cadena 1: "+cadena1.length()+"\n"+"Cadena 2: "+cadena2.length()+"\n"+"Cadena 3: "+cadena3.length());
				break;
				}
		}
		
		/** Asks the user for two integer numbers. Then it gives the user two options:
		* 1. Display the quotient of the numbers.
		* 2. Display the integer quotient and remainder of the numbers.
		*/
		public static void case2(){
			System.out.println("Ingrese dos numeros enteros:");
				int num1 = sc.nextInt();
				sc.nextLine();
				int num2 = sc.nextInt();
				sc.nextLine();
				
				if(num1 <= 0 || num2 <= 0){
					System.out.println("Numero no valido");
				}
				
				System.out.println("Ingrese una opcion:");
				System.out.println("1: Mostrar la division de los numeros");
				System.out.println("2: Mostrar la division entera y residuo de los numeros:");
				
				menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu) {
					case 1:
					double num1d = num1, num2d = num2;
					System.out.println("Division: " + (num1d / num2d));
					break;
					
					case 2:
					System.out.println("Division: "+ (num1 / num2) +"\n"+"Residuo: "+ (num1 % num2));
					break;
				}
				
				
		}
		
		/**Asks the user for three arrays of integer numbers: first, their lengths and then their elements. Then, it gives the user nine options:
		*1. Display the arrays.
		*2. Display the average of any chosen array.
		*3. Display the greatest value of any chose array.
		*4. Create and display a new array consisting of the result of a chosen operation done to any two chosen arrays.
		*5. Combine and display the arrays.
		*6. Combine and display the arrays, skipping elements already shown.
		*7. Create and display a new array consisting of the interception of the arrays.
		*8. Move a given number of positions any chosen array.
		*9. Organize any chosen array from smallest to greatest.
		*/
		public static void case3(){
			System.out.println("Ingrese la longitud de cada arreglo (mayor a 0):");
				int inputA;
				inputA = sc.nextInt();
				sc.nextLine();
				int[] array1 = new int[inputA];
				inputA = sc.nextInt();
				sc.nextLine();
				int[] array2 = new int[inputA];
				inputA = sc.nextInt();
				sc.nextLine();
				int[] array3 = new int[inputA];
				int i=0;
				
				for(i=0; i<array1.length; i++){
					System.out.println("Ingrese el numero "+(i+1)+" del primer arreglo.");
					array1[i] = sc.nextInt();
					sc.nextLine();
				}
				
				for(i=0; i<array2.length; i++){
					System.out.println("Ingrese el numero "+(i+1)+" del segundo arreglo.");
					array2[i] = sc.nextInt();
					sc.nextLine();
				}
				
				for(i=0; i<array3.length; i++){
					System.out.println("Ingrese el numero "+(i+1)+" del tercer arreglo.");
					array3[i] = sc.nextInt();
					sc.nextLine();
				}
				
				System.out.println("Que desea hacer ahora?: \n 1. Mostrar los arreglos \n 2. Mostrar el promedio de un arreglo \n 3. Mostrar el mayor valor de un arreglo \n 4. Crear un nuevo arreglo con dos de los ingresados, con una operacion \n 5. Combinar los arreglos (con elementos repetidos) \n 6. Combinar los arreglos (sin elementos repetidos) \n 7. Crear un arreglo con la intercepcion de los tres \n 8. Girar un numero de posiciones un arreglo \n 9. Ordene un arreglo de mayor a menor");
				menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu){
					case 1:
					System.out.println("Arreglo 1:");
					for (i=0; i<array1.length-1; i++){
						System.out.print(array1[i]+", ");
					}
					System.out.println(array1[i]);
					
					System.out.println();
					System.out.println("Arreglo 2:");
					for (i=0; i<array2.length-1; i++){	
						System.out.print(array2[i]+", ");
					}
					System.out.println(array2[i]);
					
					System.out.println();
					System.out.println("Arreglo 3:");
					for (i=0; i<array3.length-1; i++){
						System.out.print(array3[i]+", ");
					}
					System.out.println(array3[i]);
					break;
					
					case 2:
					double num1 = 0;
					menu = 0;
					while(menu<1 || menu>4){
					System.out.println("Que arreglo desea escoger? (1, 2 o 3)");
					menu = sc.nextInt();
					}
					
					if(menu == 1){
						for(i=0;i<array1.length; i++){
							num1 = num1 + array1[i];
						}
						System.out.println("El promedio es: "+(num1/array1.length));
					} else if(menu == 2){
						for(i=0;i<array2.length; i++){
							num1 = num1 + array2[i];
						}
						System.out.println("El promedio es: "+(num1/array2.length));
					}else if(menu == 3){
						for(i=0;i<array3.length; i++){
							num1 = num1 + array3[i];
						}
						System.out.println("El promedio es: "+(num1/array3.length));
					}
					break;
					
					case 3:
					menu = 0;
					while(menu<1 || menu>4){
					System.out.println("Que arreglo desea escoger? (1, 2 o 3)");
					menu = sc.nextInt();
					}
					int max = 0;
					if(menu == 1){
						for(i=0;i<array1.length; i++){
							if(array1[i]>max){
								max = array1[i];
							}
						}
					}else if(menu == 2){
						for(i=0;i<array2.length; i++){
							if(array2[i]>max){
								max = array2[i];
							}
						}
					}else if(menu == 3){
						for(i=0;i<array3.length; i++){
							if(array3[i]>max){
								max = array3[i];
							}
						}
					}
					System.out.println("El mayor es: "+max);
					break;
					
					case 4:
					int num;
					int[] arrayX1;
					int[] arrayX2;
					System.out.println("Que arreglos desea utilizar? (1, 2 o 3)");
					arrayX1 = new int[1];
					arrayX2 = new int[1];
					
					num = sc.nextInt();
					sc.nextLine();
					if (num == 1){
						arrayX1 = new int[array1.length];
						arrayX1 = array1;
					}else if (num == 2){
						arrayX1 = new int[array2.length];
						arrayX1 = array2;
					}else if (num == 3){
						arrayX1 = new int[array3.length];
						arrayX1 = array3;
					}
					
					num = sc.nextInt();
					sc.nextLine();
					if (num == 1){
						arrayX2 = new int[array1.length];
						arrayX2 = array1;
					}else if (num == 2){
						arrayX2 = new int[array2.length];
						arrayX2 = array2;
					}else if (num == 3){
						arrayX2 = new int[array3.length];
						arrayX2 = array3;
					}
					
					System.out.println("Que operacion desea hacer con lo elementos de los arreglos? \n 1. Suma \n 2. Resta \n 3. Multiplicacion");
					int result = 0;
					menu = sc.nextInt();
					sc.nextLine();
					
					if(menu==1){
						for(i=0; i<arrayX1.length; i++) {
						result = result + arrayX1[i];
					}
					for(i=0; i<arrayX2.length; i++) {
						result = result + arrayX2[i];
					}
					}else if (menu==2){
					for(i=0; i<arrayX1.length; i++) {
						result = result - arrayX1[i];
					}
					for(i=0; i<arrayX2.length; i++) {
						result = result - arrayX2[i];
					}
					}else if (menu==3){
					result = 1;
					for(i=0; i<arrayX1.length; i++) {
						result = result * arrayX1[i];
					}
					for(i=0; i<arrayX2.length; i++) {
						result = result * arrayX2[i];
					}	
					}
					
					System.out.println("El resultado es: "+result);
					break;
					
					case 5:
					int[] array4 = new int[array1.length + array2.length + array3.length];
					
					for(i=0; i<array1.length; i++){
						array4[i] = array1[i];
					}
					
					for(i=0; i<array2.length; i++){
						array4[i+array1.length] = array2[i];
					}
					
					for(i=0; i<array3.length; i++){
						array4[i+array1.length+array2.length] = array3[i];
					}
					
					for(i=0; i<array4.length-1; i++){
						System.out.print(array4[i]);
						System.out.print(", ");
					}
					System.out.print(array4[i]);
					System.out.print(".");
					break;
					
					case 6:
					int[] array5 = new int[array1.length + array2.length + array3.length];
					
					for(i=0; i<array1.length; i++){
						array5[i] = array1[i];
					}
					
					for(i=0; i<array2.length; i++){
						array5[i+array1.length] = array2[i];
					}
					
					for(i=0; i<array3.length; i++){
						array5[i+array1.length+array2.length] = array3[i];
					}
					
					int i2=0;
					boolean repeated = false;
					for(i=0; i<array5.length-1; i++){
						repeated = false;
						for(i2=0; i2<i-1; i2++){
							if(array5[i]==array5[i2]){
								repeated = true;
							}
						}
						if(repeated == false){
							System.out.print(array5[i]);
							System.out.print(" ");
						}
					}
					
					for(i2=0; i2<i; i2++){
							if(array5[i]==array5[i2]){
								repeated = true;
							}
						}
						if(repeated == false){
							System.out.print(array5[i]);
						}
					break;
					
					case 7:
					i2=0;
					int interceptCount;
					for(i=0; i<array1.length;i++){
						interceptCount = 0;
						for(i2=0; i2<array2.length; i2++){
							if(array1[i]==array2[i2]){
								interceptCount++;
								break;
							}
						}
						
						for(i2=0; i2<array3.length; i2++){
							if(array1[i]==array3[i2]){
								interceptCount++;
								break;
							}
						}	
						
						if(interceptCount == 2){
							System.out.print(array1[i]+" ");
						}
					}
					
					break;
					
					case 8:
					System.out.println("Que arreglo desea usar? (1, 2 o 3):");	
					num = sc.nextInt();
					sc.nextLine();
					
					arrayX1 = new int[1];
					if (num == 1){
						arrayX1 = new int[array1.length];
						arrayX1 = array1;
					}else if (num == 2){
						arrayX1 = new int[array2.length];
						arrayX1 = array2;
					}else if (num == 3){
						arrayX1 = new int[array3.length];
						arrayX1 = array3;
					}
					
					System.out.println("Cuantas posiciones desea girar?:");
					int positions = sc.nextInt();
					sc.nextLine();
					
					if(positions>arrayX1.length){
							int temp = positions/arrayX1.length;
							positions = positions - (arrayX1.length*temp);
						}
						
					int[] swap = new int[arrayX1.length];
					
					for(i=0; i<arrayX1.length; i++){
						int newPos;
						newPos = i+positions;
						if(newPos > arrayX1.length-1){
							newPos = newPos - (arrayX1.length);
						}
						
						swap[newPos] = arrayX1[i];
					}
					
					for(i=0; i<swap.length; i++){
						System.out.print(swap[i]+" ");
					}
					break;
					
					case 9:
					System.out.println("Que arreglo desea usar? (1, 2 o 3):");	
					num = sc.nextInt();
					sc.nextLine();
					
					arrayX1 = new int[1];
					if (num == 1){
						arrayX1 = new int[array1.length];
						arrayX1 = array1;
					}else if (num == 2){
						arrayX1 = new int[array2.length];
						arrayX1 = array2;
					}else if (num == 3){
						arrayX1 = new int[array3.length];
						arrayX1 = array3;
					}
					
					for (i = 0; i < arrayX1.length-1; i++) 
						for (i2 = 0; i2 < arrayX1.length-i-1; i2++) 
							if (arrayX1[i2] > arrayX1[i2+1]) { 
								int temp = arrayX1[i2]; 
								arrayX1[i2] = arrayX1[i2+1]; 
								arrayX1[i2+1] = temp; 
							} 
					
					for(i=0; i<arrayX1.length; i++){
						System.out.print(arrayX1[i]+" ");
					}
					break;
				}
		}			
		
		public static void main(String args[]){
			getOption();
			menu();
		}
	}