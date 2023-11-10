import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercicio3IOCaracter {
    public static void main(String[] args) {
        try {
            adicionarInfoEmArquivo();
        } catch (IOException e) {
            System.out.println("Erro ao adicionar informações em arquivo: " + e.getMessage());
        }
    }

    private static void adicionarInfoEmArquivo() throws IOException {
        File file = new File("filmes.txt");
        String arquivoNome = file.getName();

        // Reader reader = new FileReader(arquivoNome);
        // BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivoNome));
        String line = bufferedReader.readLine();

        String arquivoNomeCopia = arquivoNome.substring(0, arquivoNome.indexOf(".")).concat("-copia.txt");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoNomeCopia));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = bufferedReader.readLine();
        } while (line != null);

        bufferedReader.close();

        System.out.println("Arquivo " + arquivoNome + " copiado com sucesso!");
        System.out.println("Arquivo " + arquivoNomeCopia + " criado com sucesso!");

    }
}
