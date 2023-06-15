package ProjetoEscola;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cadAluno.Aluno;
import cadAluno.Materia;

public class infoAluno {
	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 0 ; qtd <= 1 ; qtd++) {
			
	
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String email = JOptionPane.showInputDialog("Qual o email?");
		String celular = JOptionPane.showInputDialog("Qual o celular?");
		String endereco = JOptionPane.showInputDialog("Qual seu endereço?");		
		String cpf = JOptionPane.showInputDialog("Qual seu CPF?");
		String rg = JOptionPane.showInputDialog("Qual seu RG?");
		String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula");
		String nomeMae = JOptionPane.showInputDialog("Qual nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual nome do pai?");*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setEmail(email);
		aluno1.setCelular(celular);
		aluno1.setEndereco(endereco);
		aluno1.setCpf(cpf);
		aluno1.setRg(rg);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);*/
		
		for (int posi = 1 ;posi <= 2; posi++) {
			String nomeMateria = JOptionPane.showInputDialog("Qual é a matéria"+posi+"?");
			String nomeNota = JOptionPane.showInputDialog("Qual a nota" +posi+ "?");
			
			Materia materia = new Materia ();
			materia.setMateria(nomeMateria);
			materia.setNota(Double.valueOf(nomeNota));
			
			aluno1.getMaterias().add(materia);
		}
			
			System.out.println("Aluno = " + aluno1.getNome());
			/*System.out.println("A idade é = " + aluno1.getIdade());
			System.out.println("O email cadastrado = " + aluno1.getEmail());
			System.out.println("O celular cadastrado = " + aluno1.getCelular());
			System.out.println("O endereço = " + aluno1.getEndereco());
			System.out.println("O CPF = " + aluno1.getCpf());
			System.out.println("O RG = " + aluno1.getRg());
			System.out.println("A data de nascimento = " + aluno1.getDataNascimento());
			System.out.println("A data da matricula = " + aluno1.getDataMatricula());
			System.out.println("O nome da mãe é = " + aluno1.getNomeMae());
			System.out.println("O nome do pai é = " + aluno1.getNomePai());
			System.out.println("_______________________________________");*/


		
		
		
	
		}
	
	
	}

}
 	