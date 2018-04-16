//Hacer un programa en JAVA que tenga el metodo principal, que muestre una tabla de multiplicar Una lista .. 2x2 = 4... asi
package tablamultiplicar;

public class TablaMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero=2;
        int resultado=0;
        
        for(int i=0; i<=10; i++){
            
            resultado=i*numero;
            
           // System.out.println(i+"x"+numero+"="+resultado);
            System.out.println(numero+"x"+i+"="+resultado);
            
            //numero++;
        }
        
        
    }
    
}
