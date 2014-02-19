/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;  //FUNCIONA CORRECTAMENTE 23-10-12
// Mirar clase constructora MasterMind que inicialice a 0, 



import java.util.Scanner;




/**
 *
 * @author Juanan
 */
public class Juego {
  /*  private int nivel = 0; 

   public Juego(){
                
      
        System.out.println("ELIGE UN NIVEL DE DIFICULTAD:");
        System.out.println("1.- FACIL");
        System.out.println("2.- MEDIO");
        System.out.println("3.- DIFICIL");
        do{
        Scanner kdb= new Scanner (System.in);
        nivel = kdb.nextInt();}
        while((nivel<1)&&(nivel>3));
   }*/
     public static void main(String[] args) {
      //int nivel=MasterMind.dificultad();
      // MasterMind mm=new MasterMind(nivel);  
          int nivel = 0;
       
        System.out.println("ELIGE UN NIVEL DE DIFICULTAD:");
        System.out.println("1.- FACIL");
        System.out.println("2.- MEDIO");
        System.out.println("3.- DIFICIL");
        do{
        Scanner kdb= new Scanner (System.in);
        nivel = kdb.nextInt();}
        while((nivel<1)||(nivel>3));
       MasterMind mm=new MasterMind(nivel);
       System.out.println("CS: "+mm.getCs());
       System.out.println("Introduce claves de tamaño "+mm.getTamaño()+" ,tienes "+mm.getIntentos()+" intentos");
       if (mm.jugada()){
            System.out.println("¡ENHORABUENA, HAS ACERTADO!");
       }
       else{ 
           System.out.println("HAS PERDIDO, LA CLAVE ERA "+mm.getCs());
       }
       
     }
       
         
   
         
     }   
    

