package pimero;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pimero {

    //https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-basicos-java/
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        /*
        int x=5,y=8;
        
        System.out.println("Suma de "+x+" + "+y+" = "+(x+y)+"\n"
                            +"Resta de "+x+" + "+y+" = "+(x-y)+"\n"
                            +"Multiplicacion de "+x+" + "+y+" = "+(x*y)+"\n"
                            +"Division de "+x+" + "+y+" = "+(x/y)+"\n"
                            +"Modulo de "+x+" + "+y+" = "+(x%y)+"\n");
        
         */
 /*
        int x=40,y=40;
        if (x>y) {
            System.out.println(x+" es mayor a "+y);
        }else if(x==y){
            System.out.println(x+" es igual a "+y);
        }else{
            System.out.println(x+" es menor a "+y);
        }
         */
 /*
        String nombre="Luis";
        System.out.println("Bienvenido "+nombre);
         */
 /*
        
        String nombre=JOptionPane.showInputDialog(null, "Cual es tu nombre");
        System.out.println("Bienvenido " + nombre);
         */
 
 /*
         String texto=JOptionPane.showInputDialog("Cuál es el radio");
         double radio=Double.parseDouble(texto);
         double area=Math.PI*Math.pow(radio, 2);
         System.out.println("El area es= "+area);
 */
 
 /*
        String numeroS =JOptionPane.showInputDialog("Qué número quiere revisar");
         int numero=Integer.parseInt(numeroS);
         if (numero%2==0) {
             System.out.println("El numero "+numero+" si es divisible entre 2");
        }else{
             System.out.println("El numero "+numero+" no es divisible entre 2");
         }
 */
 
 /*
        String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);
 
        //Pasamos el codigo a caracter
        char caracter=(char)codigo;
 
        System.out.println(caracter);
 */
 
 /*
        String texto=JOptionPane.showInputDialog("introduzca un caracter");
        char caracter= texto.charAt(0);
        
        int codigo=(int)caracter;
        System.out.println(codigo);
 */
        
 /*
        String numeroS=JOptionPane.showInputDialog("Ponga el valor del producto");
        double valor=Double.parseDouble(numeroS);
        
        double valorIva=valor+(valor*0.21);
        
        System.out.println("El valor del producto con un iva de 21&% es = "+valorIva);
 */
 
 /*    
         int contador=0;
        
        while(contador<=100){
            System.out.println(contador);
            contador+=1;
        }
 
 */
        
 /*
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
 */
        
 /*
        for (int i = 0; i <= 100; i++) {
            if(i%2==0 || i%3==0){
                System.out.println(i);
            }
        }
 */
 
 /*
        int suma=0;
        String ventasS=JOptionPane.showInputDialog("Cuántas ventas vas a registrar?");
        int numVentas=Integer.parseInt(ventasS);
        
        for (int i = 0; i < numVentas; i++) {
            String numeroS=JOptionPane.showInputDialog("venta #"+ (i+1));
            int numero=Integer.parseInt(numeroS);
            suma=suma+numero;
        }
        
        System.out.println("Suma total "+suma );
 */
 
 /* 
         int num=0;
        
        do{
            System.out.println("Introduzca un número mayor a 0");
            num=leer.nextInt();
        }while(num<=0);
        System.out.println(num);
 
 */
 
 /*
        int veces=3;
        String contraseña="Paco";
        boolean acierto=false;
        for (int i = 1; i <= veces && !acierto; i++) {
            String intento=JOptionPane.showInputDialog("Escribe la contraseña");
            if (intento.equals(contraseña)) {
            System.out.println("Enhorabuena");
            acierto=true;
            }
        }
 */
 
 /*
        String dia=JOptionPane.showInputDialog("Pon un día de la semana");
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Día libre hpt");
                break;
            default:
                 System.out.println("Introduce un dia de la semana");
        }
 */
 
 /*
        System.out.println("introduce dos numeros enteros");
        
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        
        for (int i = 0; i < 10; i++) {
            int numeroAl=(int)Math.floor(Math.random()*(numero1-numero2)+numero2);
            System.out.println(numeroAl);
        }
 */
 
 /*
        int contador=0;
        System.out.println("Introduce un numero");
        int numero=leer.nextInt();
        for (int i = numero; i>0 ; i/=10) {
            contador++;
        }
        
        System.out.println("El numero "+numero+ " tiene "+contador+" cifra");
 */
        
        
        
        } 
    }

