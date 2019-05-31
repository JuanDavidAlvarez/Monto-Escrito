

package montoescrito;

import static montoescrito.Principal.Digitos;

public class MontoEscrito {

    
    public static String decimasYcentecimas (float d){
        
        
        
        String k="";
               
         if(d>0&&d<0.1){
            d=d*100;
         k=" punto "+ " cero "+  Digitos((int) d);
      
        }
               
        if(d>=0.1&&d<1){
             d=d*10;
             int a=(int) d;
             float e = d-a;
             
             if(e>0){
                 d=d*10;
                  k=" punto "+Digitos(d);
             }
             if(e==0){
                 k=" punto "+Digitos(d);
             }
        }
        return k;
    }
    

    
    public static String unidades (int x){
        
        String k="";
        
        if(x==0){
            k=" cero ";
        }
        
        if(x==1){
            k=" uno ";
        }
        
        if(x==2){
           k=" dos ";
        }
        
        if(x==3){
            k=" tres ";
        }
        
        if(x==4){
            k=" cuatro ";
        }
        
        if(x==5){
           k=" cinco ";
        }
        
        if(x==6){
            k=" seis ";
        }
        
        if(x==7){
            k=" siete ";
        }
        
        if(x==8){
             k=" ocho ";
        }
        
        if(x==9){
             k=" nueve ";
        } 
        return k;
    }
    
    
    public static String decenas (int d){
        
        String k="";
        
        if(d==10){
             k=" diez ";
        } 
        
        if(d==11){
            k=" once ";
        } 
        
        if(d==12){
             k=" doce ";
        } 
        
        if(d==13){
             k=" trece ";
        } 
        
        if(d==14){
             k=" catorce ";
        } 
        
        if(d==15){
            k=" quince ";
        } 
        
        if(d==16){
          k=" dieciséis ";
        } 
        
        if(d==17){
            k=" diecisiete ";
        } 
        
        if(d==18){
            k=" dieciocho ";
        } 
        
        if(d==19){
            k=" diecinueve ";
        } 
        
        
        
         if(d>20&&d<30){
             k=" veinte y "+Digitos(d%10);
            
        } 
         
         if(d==20){
            k=" veinte ";
        }
        
         
         if(d>30&&d<40){
           k=" treinta y "+Digitos(d%10);
           
        } 
         
         if(d==30){
            k=" treinta ";
        }
        
          
           if(d>40&&d<50){
            k=" cuarenta y "+Digitos(d%10);
            
        } 
           
           if(d==40){
            k=" cuarenta ";
        }
        
           
            if(d>50&&d<60){
            k=" cincuenta y "+Digitos(d%10);
            
        } 
            
            if(d==50){
            k=" cincuenta ";
        }
        
            
             if(d>60&&d<70){
            k=" secenta y "+Digitos(d%10);
            
        } 
             
             if(d==60){
            k=" secenta ";
        }
        
             
              if(d>70&&d<80){
            k=" setenta y "+Digitos(d%10);
            
        } 
              
              if(d==70){
            k=" setenta "+Digitos(d%10);
        }
        
              
               if(d>80&&d<90){
            k=" ochenta y "+Digitos(d%10);
            
        } 
               
               if(d==80){
            k=" ochenta ";
        }
        
               
                if(d>90&&d<100){
            k=" noventa y "+Digitos(d%10);
            
        } 
                
                if(d==90){
            k=" noventa ";
        }
        return k;
    } 

    
    public static String centenas (int c){
        
        String k="";
        
        if(c==100){
       k=" cien ";
        } 
        
        if(c>100&&c<200){
        k=" ciento "+Digitos(c%100);
        
        } 
        
         if(c==200){
        k=" doscientos ";
        }
        
         if(c>=200&&c<300){
       k=" doscientos "+Digitos(c%100);
        
        } 
         
           if(c==300){
        k=" trecientos ";
        } 
         
          if(c>=300&&c<400){
        k=" trecientos "+Digitos(c%100);
        
        } 
          
            if(c==400){
       k=" cuantrocientos ";
        } 
           
           
            if(c>=400&&c<500){
        k=" cuantrocientos "+Digitos(c%100);
        
        } 
            
                 if(c==500){
        k=" quinientos ";
        }
            
             if(c>=500&&c<600){
       k=" quinientos "+ Digitos(c%100);
       
        } 
             
          if(c==600){
        k=" seiscientos ";
        } 
             
              if(c>=600&&c<700){
        k=" seiscientos "+Digitos(c%100);
        
        }
              
           if(c==700){
        k=" setecientos ";
        } 
              
               if(c>=700&&c<800){
        k=" setecientos "+Digitos(c%100);
        
        } 
               
          if(c==800){
        k=" ochocientos ";
        } 
               
                if(c>=800&&c<900){
        k=" ochocientos "+ Digitos(c%100);
       
        } 
                
                  if(c==900){
        k=" novecientos ";
        } 
                
                 if(c>=900&&c<1000){
        k=" novecientos "+decenas(c%100);
       
        } 
        return k;
                
    }
    
    public static String miles (int m){
        
        String k="";
        
       if(m==1000){
       k=" mil ";
       } 
        
       if(m>1000&&m<2000){
       k=" mil "+Digitos(m%1000);
       
       } 
       
       if(m>=2000&&m<10000){
           k=Digitos(m/1000)+" mil  "+Digitos(m%1000);
                    // escribe los numeros hasta el 9.999 
       }
       
       if(m>=10000&&m<100000){
           k=Digitos(m/1000)+" mil "+Digitos(m%1000);    
       }
      
        if(m>=100000&&m<1000000){
            k=centenas(m/1000)+" mil "+Digitos(m%1000);
   
        }
        return k;
    }
    
    
    public static String millones(int m){
        
        String k="";
        
        
        if(m==1000000){
            k=" un millon "; 
        }
        if(m>1000000&&m<2000000){
           k=" un millon "+Digitos(m%1000000); 
            
        }
        
        if(m>=2000000&&m<10000000){
            
            k=Digitos(m/1000000)+" millones "+Digitos(m%1000000);
               // numeros hasta el 9 millones 999 999 
        } 
        if(m>=10000000&&m<100000000){
            
            k=Digitos(m/1000000)+" millones "+Digitos(m%1000000);   
        }
        return k;
  
    }

}
