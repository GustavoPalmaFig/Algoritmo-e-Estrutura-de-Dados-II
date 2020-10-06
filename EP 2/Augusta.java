import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Augusta {

    public static void main(String[] args) throws IOException {

        FileWriter arq = new FileWriter("\\Users\\gutof\\OneDrive\\Documentos\\3º semestre\\AED II\\AiComoEuQueriaSairTambem.txt");
        PrintWriter saida = new PrintWriter(arq);

    
        String caminho = "\\Users\\gutof\\OneDrive\\Documentos\\3º semestre\\AED II\\GrafoDaAlegria.txt";
        Reader reader = Files.newBufferedReader(Paths.get(caminho));
    

        File graph = new File(caminho);
        Scanner sc = new Scanner(graph);

        int [] nossa = new int [233];
    
        int m = 0;

        while(sc.hasNext()){

            int senhora = sc.nextInt();

            nossa[senhora]++;
            System.out.println(m++);
        }

        sc.close();

        saida.println("X pessoas encontraram Y");

        for(int minha = 0; minha < nossa.length; minha++){
            if(nossa[minha] != 0) saida.println(nossa[minha] + " " + minha);
        }

        saida.close();
    }
}