/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



package Juego;  //FUNCIONA CORRECTAMENTE 22-10-12





public class Combinacion {
    
   
    
    private char[] elementos=null;//=new char [4];
    
    //  CONSTRUCTORAS
    
    
    public Combinacion (String clave){
        elementos=new char [clave.length()];
        char[]aux;
        aux=clave.toCharArray();
        for (int i=0;i<aux.length;i++){
            elementos[i]=aux[i];
        }
    
        System.out.println(elementos);   // **************************
    }
    
    //METODOS

    public char [] getElementos() {
        return elementos;
    }

    public void setElementos(char[] elementos) {
        this.elementos = elementos;
    }

   
    
    public void copia(Combinacion c){
        for(int i=0; i<c.elementos.length;i++) {
           elementos[i]=c.elementos[i];
           }
        
    }
    
    
    
    
    public String toString(){
        String aux="";
        for(int i=0;i<elementos.length;i++)
            aux=aux+elementos[i]+" ";
        return aux;
    }
    public boolean sonIguales(Combinacion c){
        boolean aux = true;
        int i=0;
        while (aux && i<c.elementos.length) {
            aux = (c.elementos[i]==elementos[i]);
            ++i;
        }
        return aux;
    }
    
 // ! char [] aux; String cad = aux.toString(); NO SE PUEDE PASAR UN ARRAY A STRING
  
    public int numAciertos(Combinacion c){
      int total=0;
      boolean encontrado;
      char aux [];
      aux=elementos.clone();
      int h; 
      for(int i=0; i<c.elementos.length;i++){
          encontrado=false;
          h=0;
          while ((!encontrado)&&(h<aux.length)) {
           if (aux[h]==c.elementos[i]) {
               total++;
               aux[h]=' ';
               encontrado=true;
           }    
           else {
               h++;
           }
          }
      }
    
        return total;
    }
    
    public int numColocados (Combinacion c){
        int total=0;
        for(int i=0; i<c.elementos.length;i++){
            if (c.elementos[i]==elementos[i]){
                total++;
            }
        }
        return total;
        }
    
    
        
     
}

