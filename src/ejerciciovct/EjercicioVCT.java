package ejerciciovct;

public class EjercicioVCT {

    public static void main(String[] args) {
       int numero1;
       int numero2;
       int suma;
       int edad;
       String nombre;
// Constante	
		final int NUMERO_3= 4;
// Ingreso los valores a la variables numero1 y numero2
		numero1 = 30;
		numero2 = 40;
// operación suma
                suma=numero1+numero2;
		
// Muestro en pantalla las dos variables y el resultado de la suma
                System.out.println("se ingresa numero1 : "+numero1);
                System.out.println("se ingresa numero2 : "+numero2);
	        System.out.println("la suma es : "+suma);

// Cambio los valores de numero1,numero2 y vuelvo a realizar la operación de suma
		numero1=100;
		numero2=50;
//operación suma
		suma=numero1+numero2;
// Muestro en pantalla las dos variables y el resultado de la suma
                System.out.println("se ingresa numero1 : "+numero1);
                System.out.println("se ingresa numero2 : "+numero2);
		System.out.println("la suma es : "+suma);

// Instancio y muestro en pantalla la variable nombre y su edad
		edad=18;
                nombre='pepe';
                
   System.out.print("la constante es: "+edad);
   System.out.print("la constante es: "+nombre);
// Muestro en pantalla la constante
       System.out.print("la constante es: "+NUMERO_3);
        }
    
}
