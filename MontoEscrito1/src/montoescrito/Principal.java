
package montoescrito;

import javax.swing.JOptionPane;
import static montoescrito.MontoEscrito.centenas;
import static montoescrito.MontoEscrito.decenas;
import static montoescrito.MontoEscrito.decimasYcentecimas;
import static montoescrito.MontoEscrito.miles;
import static montoescrito.MontoEscrito.millones;
import static montoescrito.MontoEscrito.unidades;


public class Principal {
    
    
    public static String Digitos (double x){
        
        int r = 0 , c = (int) x;
        String k="";
        
        while(c>0){
           c = c/10;
           r++;
        }
        
              
        
       if(r==1||r==0){
          k =  unidades((int) x);
       }
       
       if(r==2){
           k=decenas((int) x);
       }
       
       if(r==3){
           k=centenas((int) x);
       }
       
       if(r>3&&r<7){
            k=miles((int) x);
       }
       
       if(r>6&&r<13){
           k=millones((int) x);
       }
       
       double n=x;
       int p = (int) n;
       n=n-p;
       if(n>0){
           k=k+decimasYcentecimas((float) n);
           
       }
       return k;   
    }
    
    
    
    
    public static void main(String[] args) {
        
        int c=0;
       
          do{    
              
        
        double p = Double.parseDouble(JOptionPane.showInputDialog(null,"Solo valores entre 0 y 99 millones 999 mil 999 (maximo 2 decimales)"));
        String x = (JOptionPane.showInputDialog(null,"¿Que cosa?"));
        
        if(p<0||p>99999999.9999999){
            JOptionPane.showMessageDialog(null,"Numero no valido");
        }
     
        System.out.print(p+":");
        System.out.println("");
        String n= Digitos(p);
        n=n+" "+x;
        System.out.print(n);
        System.out.println("\n");
        
          }while(c==0);
        
        
       
    }
    
    
    
    
    
}
