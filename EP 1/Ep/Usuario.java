package Ep;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.File;
import java.util.*;

public class Usuario {
    

    
    public static void main(String[] args) throws IOException {
        
        Reader reader = Files.newBufferedReader(Paths.get("C:/Users/gutof/OneDrive/Documentos/3º semestre/AED II/EP 1/Ep/Tabela.csv"));
 

        File csvFile = new File("C:/Users/gutof/OneDrive/Documentos/3º semestre/AED II/EP 1/Ep/Tabela.csv");
        Scanner sc = new Scanner(csvFile);
        sc.nextLine();
        LinkedList<Lugar> lugares = new LinkedList<Lugar>();
        
                while(sc.hasNextLine()){
                    
                    String tudo = sc.nextLine();
                    String [] linha = tudo.split(",");
                    
                    for(int i = 1; i < linha.length; i+=2){
                        Lugar lugar = new Lugar(linha[i],linha[i+1]);
                        int indice = Procurar(lugares, lugar.getCoord());
                        
                        if(indice == -1) lugares.add(lugar);
                        else lugares.get(indice).setQtd();
                    }    
                }

                
    }

    public static int Procurar(LinkedList<Lugar> c, String coordenada){

        for(int i = 0; i < c.size(); i++){
            if(c.get(i).getCoord().equals(coordenada)) return i;
        }
        
        return -1;
    }    
}    