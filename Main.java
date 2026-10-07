public class Main {
    public static void main(String[] args) {
        GerenciadorDeArquivoTexto.CriaArquivo("MeuArquivoTeste.txt");
        GerenciadorDeArquivoTexto.EscreveArquivo("MeuArquivoTeste.txt", "Testando um texto dentro do meu arquivo");
        GerenciadorDeArquivoTexto.LeArquivo("MeuArquivoTeste.txt");
        
        GerenciadorDeArquivoCSV.CriaArquivoCSV("MeuArquivoTesteCSV.csv");
        GerenciadorDeArquivoCSV.EscreveCSV("MeuArquivoTesteCSV.csv", "Nome, Nota \n"+"Joao, 8,6\n"+"Vicente, 10,0");
        GerenciadorDeArquivoCSV.LeArquivoCSV("MeuArquivoTesteCSV.csv");
    }
}