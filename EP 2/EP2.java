import java.nio.file.*;
import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EP2 {
    
    public static void main(String[] args) throws IOException {
        
        FileWriter arq = new FileWriter("\\Users\\gutof\\OneDrive\\Documentos\\3º semestre\\AED II\\GrafoDaAlegria.txt");
        PrintWriter saida = new PrintWriter(arq);

            String caminho = "\\Users\\gutof\\OneDrive\\Documentos\\3º semestre\\AED II\\OD_graph.txt";
 
            File graph = new File(caminho);
            Scanner sc = new Scanner(graph);
                
        LinkedList<LinkedList<Integer>> nosss = new LinkedList<LinkedList<Integer>>();
        
        for(int i = 0; i < 86319; i++) nosss.add(new LinkedList<Integer>());
        
        sc.nextLine();
        sc.nextLine();
        int j = 0;
        
        while(sc.hasNext()){
            
            String afff = sc.nextLine();
            String [] saco = afff.split(" ");
            
            int maria = Integer.parseInt(saco[1]);
            
            nosss.get(maria).add(1);
            j++;
            System.out.println(j);
        }
        sc.close();
       
        System.out.println("---Fim da Leitura do Arquivo---");
        
        for(int meu = 0; meu < 86319; meu++){
            
            int jorge = nosss.get(meu).size();            
           
            saida.println(jorge);  
        }
        saida.close();  
    }
}          
            
            
                