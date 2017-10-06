/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class MayorMenorDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int amd;
        
        int arreglo[] = {90,80,70,60,-10};
    
        //bloque de comparacion 1  
            if (arreglo[0] > arreglo[1]) {
                    amd = arreglo[0];
                    arreglo[0] = arreglo[1];
                  arreglo[1] = amd; 
                }
            
            if (arreglo[0] >arreglo[2]) {
                    amd = arreglo[0];
                    arreglo[0] = arreglo[2];
                  arreglo[2] = amd; 
                }
            if (arreglo[0] > arreglo[3]) {
                    amd = arreglo[0];
                    arreglo[0] = arreglo[3];
                  arreglo[3] = amd; 
                }if (arreglo[0] > arreglo[4]) {
                    amd = arreglo[0];
                    arreglo[0] = arreglo[4];
                  arreglo[4] = amd; 
                }    
        //bloque de comparacion 2
         if (arreglo[1] > arreglo[2]) {
                    amd = arreglo[1];
                    arreglo[1] = arreglo[2];
                  arreglo[2] = amd; 
                }
            
            if (arreglo[1] > arreglo[3]) {
                    amd = arreglo[1];
                    arreglo[1] = arreglo[3];
                  arreglo[3] = amd; 
                }
            if (arreglo[1] > arreglo[4]) {
                    amd = arreglo[1];
                    arreglo[1] = arreglo[4];
                  arreglo[4] = amd; 
                }    
        //bloque de comparacion 3 
         if (arreglo[2] > arreglo[3]) {
                    amd = arreglo[2];
                    arreglo[2] = arreglo[3];
                  arreglo[3] = amd; 
                }
            
            if (arreglo[2] > arreglo[4]) {
                    amd = arreglo[2];
                    arreglo[2] = arreglo[4];
                  arreglo[4] = amd; 
                }
   
        //bloque de comparacion 4
         if (arreglo[3] > arreglo[4]) {
                    amd = arreglo[3];
                    arreglo[3] = arreglo[4];
                  arreglo[4] = amd; 
                }
     
        
         System.out.print("\n");
        
         for (int i = 0; i < arreglo.length; i++) {
          System.out.print(arreglo[i] + " ");
       }
       
         
       
      
         return  ;
        
        }
    
       
      

   }
    
     
    


    

     
    
             

                    



