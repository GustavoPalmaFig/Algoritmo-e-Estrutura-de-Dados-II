import java.io.IOException;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Ep3 {
    public static void main(String[] args) throws IOException{
        
        LinkedList<LinkedList<Integer>> grafo = ProcessaDados();

        FileWriter arq = new FileWriter("Tamanhos_Componentes1.txt");
        PrintWriter saida = new PrintWriter(arq);
        
        Collection<Integer> visitados = new HashSet<Integer>();

        for(int i = 0; i < 86319; i++){
            int tamanho_inicial = visitados.size();
            
            Busca(grafo, visitados, i); 
            
            int tamanho_final = visitados.size();
            int tamanho_nova_componente = tamanho_final - tamanho_inicial;
            
            saida.println(tamanho_nova_componente);
        }
        saida.close();
    }


    private static LinkedList<LinkedList<Integer>> ProcessaDados() throws IOException{

        String caminho = "\\Users\\gutof\\OneDrive\\Documentos\\3º semestre\\AED II\\EP 3\\OD_graph.txt"; 

        File graph = new File(caminho);
        Scanner sc = new Scanner(graph);
                
        LinkedList<LinkedList<Integer>> nosss = new LinkedList<LinkedList<Integer>>();
        
        for(int i = 0; i < 86319; i++) nosss.add(new LinkedList<Integer>());
                
        sc.nextLine();
        sc.nextLine();
        int m = 0;
        while(sc.hasNext()){
         
            String afff = sc.nextLine();
            String [] saco = afff.split(" ");
            
            int maria = Integer.parseInt(saco[1]);
            
            nosss.get(maria).add(Integer.parseInt(saco[0]));
            m++;
            System.out.println(m);
        }
        sc.close();

        return nosss;   
    }

    private static void Busca(LinkedList<LinkedList<Integer>> grafo, Collection<Integer> visitados, int no_atual){

        visitados.add(no_atual);

        for(int i : grafo.get(no_atual)){
            if(!visitados.contains(i)){    
                Busca(grafo, visitados, i);
            }
        }
    }
}