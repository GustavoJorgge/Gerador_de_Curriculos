package gerador;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class LeitorCurriculo {
	
	public static void leitura(String path) throws IOException{
		//Este objeto realiza a leitura do arquivo especificado
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		
		while(true) {
			if(linha!=null) {
				System.out.print(linha);
			}else {
				break;
			}
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	
	public static void escrita(String path) throws IOException{
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		
		//BLOCO DOS DADOS PESSOAIS
		String nome = JOptionPane.showInputDialog("Entre com seu nome:");
		String endereco = JOptionPane.showInputDialog("Entre com seu endereço:");
		String contato = JOptionPane.showInputDialog("Entre com o numero de contato:");
		String email = JOptionPane.showInputDialog("Entre com seu e-mail:");
		buffWrite.append("--------------DADOS PESSOAIS-----------------\n");
		buffWrite.append(nome + "\n" + endereco + "\n" + contato + "\n" + email);		
		
		//BLOCO DAS HABILIDADES PESSOAIS
		String habilidade1 = JOptionPane.showInputDialog("Entre com 1/3 skills que voce mais se destaca:");
		String habilidade2 = JOptionPane.showInputDialog("Entre com 2/3 skills que voce mais se destaca:");
		String habilidade3 = JOptionPane.showInputDialog("Entre com 3/3 skills que voce mais se destaca:");
		buffWrite.append("\n--------------HABILIDADES PESSOAIS-----------------\n");
		buffWrite.append(habilidade1 + "\n" + habilidade2 + "\n" + habilidade3);	
		
		//BLOCO DOS CONHECIMENTOS PROFISSIONAIS
		habilidade1 = JOptionPane.showInputDialog("Entre com 1/3 stacks de seu dominio:");
		habilidade2 = JOptionPane.showInputDialog("Entre com 2/3 stacks de seu dominio:");
		habilidade3 = JOptionPane.showInputDialog("Entre com 3/3 stacks de seu dominio:");
		buffWrite.append("\n--------------APTIDÕES PROFISSIONAIS-----------------\n");
		buffWrite.append(habilidade1 + "\n" + habilidade2 + "\n" + habilidade3);
		
		//BLOCO FORMAÇÕES
		int qtdFormacao = Integer.parseInt(JOptionPane.showInputDialog("Adicione suas formações\n Quantas formacoes deseja adicionar em seu curriculo?"));
		String formacao [] = new String[qtdFormacao];
		String totalFormacao = "";
		//LOOP PARA ADICIONAR A QUANTIDADE DE FORMAÇÕES QUE O USUARIO DESEJAR
		for( int i = 0 ; i < qtdFormacao ; i++) {
			String curso = JOptionPane.showInputDialog("Digite o nome do curso:");
			String instituicao = JOptionPane.showInputDialog("Entre com a instituição de formação:");
			String data = JOptionPane.showInputDialog("Digite a data de inicio e fim de sua formação:");
			formacao[i] = curso + "\n" + instituicao + "\n" + data;
			totalFormacao = totalFormacao + "\n" + formacao[i]; //ADICIONANDO EM APENAS UMA STRING TODAS AS FORMAÇÕES
		}		
		buffWrite.append("\n-------------------FORMAÇÕES----------------------");
		buffWrite.append(totalFormacao);
		
		//BLOCO EXPERIENCIAS PROFISSIONAIS
		int qtdExperiencias = Integer.parseInt(JOptionPane.showInputDialog("Adicione suas experiencias profissionais \n Quantas experiencias deseja adicionar em seu curriculo?"));
		String experiencias [] = new String[qtdExperiencias];
		String totalExperiencias = "";
		//LOOP PARA ADICIONAR A QUANTIDADE DE EXPERIENCIAS QUE O USUARIO DESEJAR
		for( int i = 0 ; i < qtdExperiencias ; i++) {
			String empresa = JOptionPane.showInputDialog("Entre com o nome da Empresa:");
			String cargo = JOptionPane.showInputDialog("Entre com o nome do cargo:");
			String data = JOptionPane.showInputDialog("Entre com a data de inicio e fim:");
			experiencias[i] = empresa + "\n" + cargo + "\n" + data;
			totalExperiencias = totalExperiencias + "\n" + experiencias[i]; //ADICIONANDO EM APENAS UMA STRING TODAS AS EXPERIENCIAS
		}		
		buffWrite.append("\n ---------------EXPERIENCIAS PROFISSIONAIS------------------");
		buffWrite.append(totalExperiencias);
		
		buffWrite.close();
	}
}