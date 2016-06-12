package isp;

import java.util.ArrayList;
import java.util.List;

import srp.Contribuinte;
import srp.ContribuinteHomem;
import srp.ContribuinteMulher;
import srp.Genero;

public class JDBCDAOContribuinteFiltro implements IDAOFiltrosContribuinte {
	 private List<Contribuinte> listaContribuintes;
	@Override
	public List<Contribuinte> getContribuintesPorGenerero(Genero genero) {
		System.out.println("Buscando contribuinte por Genero" + genero);
		System.out.println("Contribuintes atuais são...");
		
		listaContribuintes = new ArrayList<Contribuinte>();
		Contribuinte e = new ContribuinteHomem();
		e.setAnoNascimento(1989);
		e.setNome("Ribamar");
		e.setTempoContribuicao(9);
		
	
		
		listaContribuintes.add(e);
		
		e = new ContribuinteMulher();
		e.setAnoNascimento(1990);
		e.setNome("Maria");
		e.setTempoContribuicao(15);
		
	
		
		listaContribuintes.add(e);
			
		
		
		return listaContribuintes; 
	}

	@Override
	public List<Contribuinte> getContribuintesPorAnoNascimento(int anoNascimento) {
		System.out.println("Buscando contribuinte por Ano de Nascimento" + anoNascimento);
		System.out.println("Contribuintes atuais são...");
		
		listaContribuintes = new ArrayList<Contribuinte>();
		Contribuinte e = new ContribuinteHomem();
		e.setAnoNascimento(1989);
		e.setNome("Ribamar");
		e.setTempoContribuicao(9);
		
	
		
		listaContribuintes.add(e);
		
		e = new ContribuinteMulher();
		e.setAnoNascimento(1990);
		e.setNome("Maria");
		e.setTempoContribuicao(15);
		
	
		
		listaContribuintes.add(e);
			
		
		return listaContribuintes; 
	}

}
