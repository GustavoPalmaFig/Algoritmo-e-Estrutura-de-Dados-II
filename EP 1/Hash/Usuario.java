import java.io.IOException;
import java.io.Reader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.*;

public class Usuario {
    public static void main(String[] args) throws IOException {

        FileWriter arq = new FileWriter("C:/Users/gutof/OneDrive/Documentos/3º semestre/AED II/EP 1/HashTesteHashSet.txt");
        PrintWriter saida = new PrintWriter(arq);


        String caminho = "C:/Users/gutof/OneDrive/Documentos/3º semestre/AED II/EP 1/Hashtabelatop.csv";
 

        File csvFile = new File(caminho);
        Scanner sc = new Scanner(csvFile);

        Collection<Lugar> lugares = new HashSet<>();
        int m = 0;

        while(sc.hasNextLine()){
            
            m++;
            System.out.println(m);

            String tudo = sc.nextLine();
            String [] linha = tudo.split(",");

            for(int i = 0; i < linha.length; i+=2){
                
                int qtd = Integer.parseInt(linha[i+1]);
                Lugar lugar = new Lugar(linha[i],qtd);
                if(!lugares.contains(lugar)) lugares.add(lugar);
            }
        }

        for(Lugar l : lugares) {

            saida.println(l.getCoord() + "      " + l.getQtd());
        }
    }
}
