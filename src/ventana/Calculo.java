/*
Creado por Emmanuel Acoltzi Bautista
Fecha de creacion: 31-03-2024
email: basedeemma@gmail.com
*/
package ventana;

public class Calculo {
//double p1,p2,p3,p4,p5,p6,p7,p8,p9;
    double a=0;
    double b=0;
    double det=0;
    String Adjunta="";
    String Inversa="";
    Double Matriz[][]=new Double[5][3];
    Double MatrizVolteada[][]=new Double[3][3];
    Double MatrizAdjunta[][]=new Double[3][3];
    Double MatrizInversa[][]=new Double[3][3];
  
    public Calculo(double p1,double p2,double p3,double p4,double p5,double p6,double p7,double p8,double p9){
    //Relleno la matriz
        this.Matriz[0][0]=p1;
        this.Matriz[0][1]=p2;
        this.Matriz[0][2]=p3;
        
        this.Matriz[1][0]=p4;
        this.Matriz[1][1]=p5;
        this.Matriz[1][2]=p6;
        
        this.Matriz[2][0]=p7;
        this.Matriz[2][1]=p8;
        this.Matriz[2][2]=p9;
        
        this.Matriz[3][0]=p1;
        this.Matriz[3][1]=p2;
        this.Matriz[3][2]=p3;
        
        this.Matriz[4][0]=p4;
        this.Matriz[4][1]=p5;
        this.Matriz[4][2]=p6;
       
        
        
}
    public void Determinante(){
        //aplico el metodo de sarros
     int pos=0;
     int bandera=0;
     double a1;
     double a2=1;
        while(bandera==0){
    
            for(int i=0;i<=2;i++){
            a1=Matriz[i+pos][i];
            a2=a2*a1;
            
             }
            a=a+a2;
           a2=1;
            pos=pos+1;
            if(pos==3){
                bandera=1;
            }
            
            }
        System.out.println("a="+a);
        
        //lo mismo pero del otro lado
        
      pos=0;
      bandera=0;
      a1=0;
      a2=1;
        while(bandera==0){
    
            for(int i=2;i>=0;i--){
              //  System.out.println(Matriz[pos][i]);
            a1=Matriz[pos][i];
        
              pos=pos+1;

                      a2=a2*a1;
            
             }
            b=b+a2;
            a2=1;
            pos=pos-2;
           
            if(pos==3){
                bandera=1;
            }
            
            }
       System.out.println("b="+b);
        //calculo el determinante
        det=a-b;
        System.out.println("El determinante es: "+det);
        
    }
    
    
    
    
    //volteo la matriz osea las filas se vuelven columnas
    
    
    public void Volteo(){
    for(int i=0;i<=2;i++){
    for(int i2=0;i2<=2;i2++){
        MatrizVolteada[i][i2]=Matriz[i2][i];  
    }
    }
       
    }
    
    
    
    
    
    
    
    
    
    public void Adjunta(){
    //realizo las operacion para saacar la adjunta
        
        MatrizAdjunta[0][0]=+((MatrizVolteada[1][1])*MatrizVolteada[2][2]-(MatrizVolteada[2][1]*MatrizVolteada[1][2]));
        MatrizAdjunta[0][1]=-((MatrizVolteada[1][0])*MatrizVolteada[2][2]-(MatrizVolteada[1][2]*MatrizVolteada[2][0]));
        MatrizAdjunta[0][2]=+((MatrizVolteada[1][0])*MatrizVolteada[2][1]-(MatrizVolteada[1][1]*MatrizVolteada[2][0]));
        MatrizAdjunta[1][0]=-((MatrizVolteada[0][1])*MatrizVolteada[2][2]-(MatrizVolteada[0][2]*MatrizVolteada[2][1]));
        MatrizAdjunta[1][1]=+((MatrizVolteada[0][0])*MatrizVolteada[2][2]-(MatrizVolteada[2][0]*MatrizVolteada[0][2]));
        MatrizAdjunta[1][2]=-((MatrizVolteada[0][0])*MatrizVolteada[2][1]-(MatrizVolteada[2][0]*MatrizVolteada[0][1]));
        MatrizAdjunta[2][0]=+((MatrizVolteada[0][1])*MatrizVolteada[1][2]-(MatrizVolteada[1][1]*MatrizVolteada[0][2]));
        MatrizAdjunta[2][1]=-((MatrizVolteada[0][0])*MatrizVolteada[1][2]-(MatrizVolteada[1][0]*MatrizVolteada[0][2]));
        MatrizAdjunta[2][2]=+((MatrizVolteada[0][0])*MatrizVolteada[1][1]-(MatrizVolteada[1][0]*MatrizVolteada[0][1]));
        
        //lo agrego a una variable para despues imprimir
     for(int i=0;i<=2;i++){
     for(int i2=0;i2<=2;i2++){
         Adjunta+="["+MatrizAdjunta[i][i2]+"] ";
     }
         Adjunta+="\n";
     }   


    }

     
     public void Inversa(){
//ahora divido por la determinante
         for(int i=0;i<=2;i++){
             for(int i2=0;i2<=2;i2++){
             MatrizInversa[i][i2]=(MatrizAdjunta[i][i2]/det);
             
             
             }
         }

//lo mismo que hice con la adjunto lo pido para despues imprimir
     for(int i=0;i<=2;i++){
     for(int i2=0;i2<=2;i2++){
         Inversa+="["+MatrizInversa[i][i2]+"] ";
     }
         Inversa+="\n";
     }   

         
         
         
         
     }
     
        
    
  
    
        
    
    
    
    
    
    
    
    
    
    
    
}
