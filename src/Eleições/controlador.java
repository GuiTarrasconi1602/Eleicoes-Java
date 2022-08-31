package Eleições;

import java.util.ArrayList;
import java.util.Scanner;

public class controlador {
	Scanner leitor = new Scanner(System.in);

	public void aplicacao() {
		ArrayList<Candidato> candidatosPorIdade = new ArrayList<>();
		ArrayList<Candidato> candidatosPorVoto = new ArrayList<>();
		Candidato c1 = new Candidato("Claúdio Silva", "PJ", 60, 1204353);
		Candidato c2 = new Candidato("Angélica Duarte", "PN", 45, 1354571);
		Candidato c3 = new Candidato("Eugênio Bonaverde", "PI", 81, 1100254);
		Candidato c4 = new Candidato("Joana Pastos", "PL", 50, 1054423);
		Candidato c5 = new Candidato("Thais Thompson", "PV", 41, 1676771);
		
		candidatosPorIdade.add(c1);
		candidatosPorIdade.add(c2);
		candidatosPorIdade.add(c3);
		candidatosPorIdade.add(c4);
		candidatosPorIdade.add(c5);
		
		candidatosPorVoto.add(c1);
		candidatosPorVoto.add(c2);
		candidatosPorVoto.add(c3);
		candidatosPorVoto.add(c4);
		candidatosPorVoto.add(c5);
		
		operacoes op = new operacoes();
		op.ordena(candidatosPorIdade, candidatosPorVoto);
		System.out.println("Informações eleição:");
		System.out.println("Candidato mais jovem: ");
		System.out.println(op.imprimeCandidatoMaisNovo(candidatosPorIdade));
		System.out.println();
		
		System.out.println("Candidato mais velho:");
		System.out.println(op.imprimeCandidatoMaisVelho(candidatosPorIdade));
		System.out.println();
		
		System.out.println("Candidato mais votado:");
		System.out.println(op.imprimeMaisVotado(candidatosPorVoto));
		System.out.println();
		
		System.out.println("Candidato menos votado:");
		System.out.println(op.imprimeMenosVotado(candidatosPorVoto));
		System.out.println();
		
		System.out.println("Total de votos recebidos por todos candidatos:");
		System.out.println(op.totalVotos(candidatosPorIdade));
		System.out.println();
		
		System.out.println("Média de todos os votos:");
		System.out.println(op.mediaVotos(candidatosPorIdade));
		System.out.println();
		
		System.out.println("Informações de todos os candidatos:");
        op.imprimeFila(candidatosPorVoto);	
	
	}
}
