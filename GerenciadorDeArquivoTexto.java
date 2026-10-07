
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GerenciadorDeArquivoTexto {
    public static void CriaArquivo(String nomeArquivo) {
        Path caminho = Paths.get(nomeArquivo);
        
        try {
            if(!Files.exists(caminho)) {
                Files.createFile(caminho);
                System.out.println("Arquivo criado!"+caminho.toAbsolutePath());
            }
            else {
                System.out.println("O arquivo ja existe");
            }
        }
        catch(IOException e) {
            System.err.println("Erro ao criar arquivo" + e.getMessage());;
        }
    }

    public static void EscreveArquivo(String nomeArquivo, String texto) {
        Path caminho = Paths.get(nomeArquivo);
        try {
            Files.writeString(caminho, texto); 
            System.out.println("Texto adicionado com sucesso");
        }

        catch(IOException e) {
            System.err.println("Erro ao escrever no arquivo"+ e.getMessage());
        }

    }

    public static void LeArquivo(String nomeArquivo) {
        Path caminho = Paths.get(nomeArquivo);

        try {
            String textoEscrito = Files.readString(caminho);
            System.out.println(textoEscrito);
        }
        catch(IOException e) {
            System.err.println("Erro ao mostrar o conteudo do arquivo"+e.getMessage());
        }
    }
}
