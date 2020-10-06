package Ep;

import java.util.LinkedList;

public class Lugar {

    private String x;
    private String y;
    private int qtd;
    private LinkedList<String> ids;
    
        public Lugar(String x, String y){
    
            setCoord(x,y);
            this.qtd = 0;
        }  
     
        protected void setCoord(String x, String y){
    
            this.x = x;
            this.y = y;
        }  
        
        protected void setID(String id) {
            ids.add(id);
        }    
    
        protected void setQtd() {
            qtd++;
        }
     
        protected String getCoord(){
            return x + "," + y;
        } 
     
        protected int getQtd(){
            return qtd;
        }   
    
    }
    