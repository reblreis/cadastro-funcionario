package principal;

import java.util.Scanner;

import entities.Funcionario;
import repositories.FuncionarioRepository;

public class Program {

	public static void main(String[] args) {
		
		//syso + CRTL + espaço
		System.out.println("\n ***CADASTRO DE FUNCIONÁRIO*** \n");

		Funcionario funcionario = new Funcionario();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entre com o ID do funcionário...: ");
		funcionario.setIdFuncionario(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Entre com o nome do funcionário...: ");
		funcionario.setNome(scanner.nextLine()); //o scanner leia diretamente 
		
		System.out.print("Entre com a matrícula............: ");
		funcionario.setMatricula(scanner.nextLine());
		
		System.out.print("Entre com o CPF..................: ");
		funcionario.setCpf(scanner.nextLine());
		
		
		try {
			
			//criando um objeto para a classe FuncionarioRepository
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			
			//gravando os dados do funcionario em arquivo
			funcionarioRepository.exportar(funcionario);
			
			//imprimindo
			System.out.println("\nDADOS DO FUNCIONÁRIO:");
			System.out.println("\tID..........: " + funcionario.getIdFuncionario());
			System.out.println("\tNOME........: " + funcionario.getNome());
			System.out.println("\tMATRICULA...: " + funcionario.getMatricula());
			System.out.println("\tCPF.........: " + funcionario.getCpf());
					
		}
		
		catch(Exception e) {
			
			//imprimindo...
			System.out.println("\nFALHA AO CADASTRAR FUNCIONÁRIO!");
			
			//imprimir o log do erro
			e.printStackTrace();
		}
		
	}
}
