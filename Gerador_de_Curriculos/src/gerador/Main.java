package gerador;

import java.io.IOException;

public class Main {
	public static void main(String[]args) throws IOException {
		String path = "C:\\Users\\gusta\\OneDrive\\Área de Trabalho\\programas\\programas original\\Gerador de Curriculos\\curriculo.txt";
		
		LeitorCurriculo.escrita(path);
		LeitorCurriculo.leitura(path);
	}

}
