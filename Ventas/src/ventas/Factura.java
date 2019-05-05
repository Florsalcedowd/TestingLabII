package ventas;


public class Factura {
   
    Producto p[];
    
    public Factura(Producto p[]){
        this.p = p;
    }
    
    public float getTotal(){
       float acu =0; 
    
       for(int i=0; i<p.length; i++)
               acu += p[i].getPrecio();
       
       return acu;
    }
    
}
