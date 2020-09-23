
package ejer9;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ejer9 {

    public static void main(String[] args) {
        // probar en el nro3
        int opcion, n_alumnos;
        String  aux;
        
        n_alumnos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número total de alumnos: "));
        
        String arreglo[] = new String[n_alumnos]; 
        
        do{
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU"+
                    "\n1. Ingreso de nombres."+
                    "\n2. Ordenar nombres."+
                    "\n3. Mostrar Nombres."+
                    "\n4. Salir."));
            
            switch(opcion){
                
                case 1:
                    
                    for(int i=0 ; i<n_alumnos ; i++){
                        
                    arreglo[i] = JOptionPane.showInputDialog( (i+1) + ". Digite el nombre del alumno: ");
                    
                        System.out.println((i+1)+". "+arreglo[i]);
                    
                    }
                    
                    break;
                    
                case 2:
                    
                    //imortamos java.util.Arrays;  sirve para ordenar un arreglo
                    Arrays.sort(arreglo);
                    for (int i = 0 ; i<arreglo.length; i++){ 
                        System.out.println(arreglo[i]);
                    }
                    
                    break;
                    
                case 3:
                    
                    System.out.println("");
                    for(int i = 0 ; i<arreglo.length ; i++ ){
                                
                                System.out.println((i+1) +". "+ arreglo[i]);
                               
                            }
                    break;
                   
            }
           
        }while(opcion!=4);
        
        
        
    }
    
}
