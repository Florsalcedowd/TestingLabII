package ventas;


public class Balance {
 float ganancia=0;
 
    float ganancia(Factura v[], Gastos g){
       for(int i=0; i<v.length ;i++)
           ganancia += v[i].getTotal();
        
        ganancia -= g.getGastos();
        
       return ganancia;   
    }
    
}
