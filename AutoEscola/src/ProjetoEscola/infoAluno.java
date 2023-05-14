package ProjetoEscola;

import javax.swing.JOptionPane;

public class infoAluno {
	
	public static void main(String[] args) {
		
		
		
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
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setAltura(Double.parseDouble(altura));*/
	
	
	
	
	}

}
 	