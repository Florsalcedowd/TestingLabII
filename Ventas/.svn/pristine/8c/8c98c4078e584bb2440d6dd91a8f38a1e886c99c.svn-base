package ventas;

import java.util.ArrayList;


public class Gastos {
    private ArrayList valores;

    public float getGastos(){
      float acu=0;  
      for(int i=0; i<valores.size(); i++) {
          Float f = (Float)valores.get(i);
          acu += f;
      }
      
      return acu;
    }
    
    public Gastos(ArrayList val) {
       valores =val;
    }
   
    public ArrayList getValores() {
        return valores;
    }
  
    public void setValores(ArrayList valores) {
        this.valores = valores;
    }
    
}
