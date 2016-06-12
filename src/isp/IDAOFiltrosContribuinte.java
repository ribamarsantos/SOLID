package isp;

import java.util.List;

import srp.Contribuinte;
import srp.Genero;

public interface IDAOFiltrosContribuinte {
	
	List<Contribuinte> getContribuintesPorGenerero(Genero genero);
	List<Contribuinte> getContribuintesPorAnoNascimento( int anoNascimento);
}
