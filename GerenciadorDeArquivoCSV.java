    import java.io.IOException;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    public class GerenciadorDeArquivoCSV {
        public static void CriaArquivoCSV(String nomeArquivo) {
            Path caminho = Paths.get(nomeArquivo);

            try {
                if(!Files.exists(caminho)) {
                    Files.createFile(caminho);
                    System.out.println("CSV criado");
                }
                else {
                    System.out.println("Erro ao criar CSV");
                }
            }
            catch(IOException e) {
                System.err.println("Erro ao criar CSV" + e.getMessage());
            } 
        }

        public static void EscreveCSV(String nomeArquivo, String texto) {
            Path caminho = Paths.get(nomeArquivo);
            try {
                Files.writeString(caminho, texto);
                System.out.println("CSV adicionado!");
            }
            catch(IOException e) {
                System.err.println("Erro ao escrever CSV"+e.getMessage());
            }
        }
        public static void LeArquivoCSV(String nomeArquivo) {
            Path caminho = Paths.get(nomeArquivo);

            try {
                String textoCSV = Files.readString(caminho);
                System.out.println(textoCSV);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
