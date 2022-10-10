/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Augusto
 */
public class Ejercicio1 {

   
    public static void main(String[] args) {
        /**
         Primera parte:
        Llamar a la función en el main y darle valores.
        int num1 = 5;
        int num2 = 5;
        int num3 = 5;
        //Mostrar el resultado:
        System.out.println("El resultado de la operacion es " + suma(num1,num2,num3));
     */
        
    
    //Segunda parte: Crear un objeto miCoche en el main y añadirle una puerta.
    Coche miCoche = new Coche();
    miCoche.aumentarPuertas();
    miCoche.aumentarPuertas();
    //Mostrar el número de puertas que tiene el objeto.
    System.out.println(miCoche.puertas);
      
     
        
    }
    
    //public static int suma(int a,int b,int c){
      
        //Primera Parte:
        //Crear una función con tres parámetros que sean números que se suman entre sí.
        //return a + b + c;
        
        
    }
    
//Segunda Parte: Crear una clase coche
    class Coche{
        //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
        public int puertas = 5;
        
        //Una función que incremente el número de puertas que tiene el coche.
        public void aumentarPuertas(){
            this.puertas++;
        }
    }
    
}

