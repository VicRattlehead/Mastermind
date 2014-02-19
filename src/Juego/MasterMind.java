/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;  //FUNCIONA CORRECTAMENTE 22-10-12

//esta con lineas de cogigo  inutil, se podria limpiar un poco

//¿es necesario un constructor de MasterMind sin argumentos?

/**
 *
 * @author ja.echeverrias
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class MasterMind {
    
    //private final int TAMAÑO = 4;
    
    //private final int INTENTOS=5;
    
    private final String COLORESVALIDOS="BbNnAaRrVvMm";
    
    
    
    private int tamaño=4;
    
    private int intentos=10;
    
    private int dificultad=1;
    
    private Combinacion cs = null;//combinacion secreta
    
    private ArrayList <Combinacion> miLista = null;
    
   
    
    //lista de combinaciones del usuario, porque en cada jugada se devuelve las 
    //  anteriores jugadas
    
    // CONSTRUCTORAS
    
  /*  public MasterMind () {   // Constructora por defecto que te crea algo inicializado a 0
        cs = null;
        miLista = null;
    }*/
    
    
    public MasterMind(int dificultad){
        String clave="";
        switch (dificultad) {
                case 1:tamaño=4;intentos=10;this.dificultad = dificultad;break;
                case 2:tamaño=5;intentos=8;this.dificultad = dificultad;break;
                case 3:tamaño=6;intentos=5;this.dificultad = dificultad;break;
                default:tamaño=4;intentos=10;this.dificultad = dificultad;break;
                
        }
            
            for(int i=0; i<tamaño;i++){
            int azar=(int) (Math.random()*6);
            switch (azar){
                 case 0: clave+='B'; break;
                 case 1: clave+='N'; break;
                 case 2: clave+='A'; break;
                 case 3: clave+='R'; break;
                 case 4: clave+='V'; break;
                 case 5: clave+='M'; break;
            }
        }
            
        cs = new Combinacion(clave);
        miLista= new ArrayList <Combinacion>();
      //  for(int i=0; i<INTENTOS; i++){
         //   miLista.add(i,new Combinacion());
      //  }
        
         }
    
      //METODOS

    public int getIntentos() {
        return intentos;
    }

    public int getTamaño() {
        return tamaño;
    }
    
     public Combinacion getCs() {
        return cs;
    }

    public ArrayList<Combinacion> getMiLista() {
        return miLista;
        
        
    }
    
     public void insertarJugada(Combinacion cj ) {
       miLista.add(cj);
    }
     
     
    public String toString(Combinacion comb){
        return (miLista.indexOf(comb)+1+".- "+comb+"   ACIERTOS: "+cs.numAciertos(comb)+"  COLOCADOS: "+cs.numColocados(comb));
    }
    
    
    private String leerCombinacion (){
        String clave = "";
        String aux ="x";
        char color=' ';
        Scanner kdb= new Scanner (System.in);
        for(int i=0;i<tamaño;i++){
        //char [] color = new char[1]; color = kdb.nextLine().toUpperCase().toCharArray();
           do{
            aux = kdb.nextLine();   }
           while (aux.length()==0);  //para ignorar los intros sin a ver introducido nada previamente
            
           color = aux.toUpperCase().charAt(0);
           
        if (COLORESVALIDOS.indexOf(color)>=0){
                clave+=color;
            }
            else {
                clave+='V';
            }
        }
        return clave;
        
    }
    
    
    
  /*  public void insertarJugada (int indice , Combinacion cj){
      miLista.add(indice,cj);
      //  miLista.get(indice).setColores(cj.getColores());
        //miLista.get(indice).copia(cj));
   
        }
    
      public void insertarJugada (Combinacion cj){
      miLista.add(cj);
     
        }
    */  
      
  

   
   public boolean jugada (){
        
         String clave;
         Combinacion cj;
         boolean acierto=false;
         int i=0;//contador
         
       //  if(juanan.leng)
        // Scanner stdin = new Scanner(System.in); para char
    //     MasterMind mm=new MasterMind();
         
         while((!acierto)&&( i<intentos)){
           
            clave=leerCombinacion();
            cj=new Combinacion(clave);
            this.insertarJugada(cj);
           // insertarJugada(i,cj);
            
            Iterator <Combinacion>h = miLista.iterator();
            Combinacion c=null;
            
            while(h.hasNext()){
                
                c=h.next();
            //System.out.println(h.next());
            //Combinacion comb = h.next();
            //System.out.println(comb + " ");1
                System.out.println(toString(c));
            }
           // System.out.println(i+1+".- "+cj+"   ACIERTOS: "+cs.numAciertos(this.getMiLista().get(i))+"  COLOCADOS: "+cs.numColocados(this.getMiLista().get(i)));
            if (cs.sonIguales(this.getMiLista().get(i))) {
                
                acierto=true;
            }
            else {
                i++;
            }
         }
         return acierto;
   }
       
    

}

    
