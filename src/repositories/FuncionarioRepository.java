package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepository {
	
	//método = função
	//método = para gravar os dados de um funcionário em arquivo
	//void = é uma função que não retornar nada
	//repository = criar uma função
	
	public void exportar(Funcionario funcionario) throws Exception {
		//throws Exception = tratamento da função (porque pode dá erro) somente o Program
		
		//TODO = que falta fazer
		
		//criando um arquivo em modo de escrita
		PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("c:\\clientes\\funcionario.txt"), true));
		
		//escrever o conteudo do arquivo
		printWriter.write("\nDADOS DO FUNCIONÁRIO:");
		printWriter.write("\nID............. : " + funcionario.getIdFuncionario( ));
		printWriter.write("\nNOME........... : " + funcionario.getNome( ));
		printWriter.write("\nMATRICULA...... : " + funcionario.getMatricula( ));
		printWriter.write("\nCPF............ : " + funcionario.getCpf());
		
		
		// salvar o arquivo
		printWriter.flush();
		
		// fechar o arquivo
		printWriter.close();
		
	}
	
	
}
