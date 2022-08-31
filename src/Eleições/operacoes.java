package Eleições;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class operacoes {
	public void ordena(ArrayList<Candidato> candidatosPorIdade, ArrayList<Candidato> candidatosPorVoto) {
		
        Collections.sort(candidatosPorIdade, new Comparator<Candidato>() {
            public int compare(Candidato one, Candidato two) {
                return one.getIdade() - two.getIdade();
            }
        });
        Collections.sort(candidatosPorVoto, new Comparator<Candidato>() {
            public int compare(Candidato a, Candidato b) {
                return a.getNumeroDeVotos() - b.getNumeroDeVotos();
            }
        });
        }
		
	public void imprimeFila(ArrayList<Candidato> fila) {
		for(int i=0; i<fila.size(); i++) {
			System.out.println(fila.get(i).toString());
		}
		System.out.println();
	}
		
	public String imprimeCandidatoMaisNovo (ArrayList<Candidato> fila) {
		return fila.get(0).toString();
	}
	public String imprimeCandidatoMaisVelho (ArrayList<Candidato> fila) {
        return fila.get(fila.size()- 1).toString();
	}
	public String imprimeMaisVotado (ArrayList<Candidato> fila) {
        return fila.get(fila.size()- 1).toString();

	}
	public String imprimeMenosVotado (ArrayList<Candidato> fila) {
		return fila.get(0).toString();

	}
	public int totalVotos (ArrayList<Candidato> fila) {
		int total = 0;
		for(int i = 0; i<fila.size(); i++) {
			total += fila.get(i).getNumeroDeVotos();
		}
		return total;
	}
	public int mediaVotos (ArrayList<Candidato> fila) {
		int num = 0;
		for(int i = 0; i<fila.size(); i++) {
			num += fila.get(i).getNumeroDeVotos();
		}
		int total = num/5;
		return total;
	}
	
	}
	

