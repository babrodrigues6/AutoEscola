package ProjetoEscola;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cadAluno.Aluno;

public class infoAluno {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1 ; qtd <= 2 ; qtd++) {
			
	
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String email = JOptionPane.showInputDialog("Qual o email?");
		String celular = JOptionPane.showInputDialog("Qual o celular?");
		String endereco = JOptionPane.showInputDialog("Qual seu endereço?");		
		String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
		String rg = JOptionPane.showInputDialog("Qual seu RG?");
		String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula");
		String nomeMae = JOptionPane.showInputDialog("Qual nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual nome do pai?");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setEmail(email);
		aluno1.setCelular(celular);
		aluno1.setEndereco(endereco);
		aluno1.setCpf(cpf);
		aluno1.setRg(rg);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		
		
		
	
		}
	
	
	}

}
 	