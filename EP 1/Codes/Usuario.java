package ep;

import java.util.LinkedList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
  
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
  

public class Usuario {

    public static void main(String [] args){

        LinkedList<Pessoa> p = new LinkedList<Pessoa>();     

        p.add(new Pessoa());
        p.add(new Pessoa());

        for(int i = 0; i < p.size(); i++){

            Pessoa pe = p.get(i);
            pe.setID(26+i);
            System.out.println(pe.getID());
        }        


    }

}