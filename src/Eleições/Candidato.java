package Eleições;

public class Candidato{
	private String nome;
	private String partidoPolitico;
	private int idade;
	private int numeroDeVotos;

	public Candidato(String nome, String partidoPolitico, int idade, int numeroDeVotos) {
		super();
		this.nome = nome;
		this.partidoPolitico = partidoPolitico;
		this.idade = idade;
		this.numeroDeVotos = numeroDeVotos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartidoPolitico() {
		return partidoPolitico;
	}
	public void setPartidoPolitico(String partidoPolitico) {
		this.partidoPolitico = partidoPolitico;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}
	public void setNumeroDeVotos(int numeroDeVotos) {
		this.numeroDeVotos = numeroDeVotos;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nome: "+nome+"   Partido Político: "+partidoPolitico+"   Idade: "+idade+"   Votos: "+numeroDeVotos);
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	}

