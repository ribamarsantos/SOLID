package isp;

import java.util.List;

import lsp.Veiculo;
import ocp.IDAOContribuinte;
import ocp.JDBCDAO;
import srp.Contribuinte;
import srp.Genero;
/**
// @author Ribamar
// @category Interface Segregation Principle
// Caso a fachada preciso implementar algum outro metodo ou
// conjunto de metodos, Criar uma nova Interface e Implementa-la
// Exemplo: Separação do CRUD de Automovel, Contribuinte e uma para tratar Filtros de Contribuinte
// Funções separados onde quem precisa de um CRUD de contribuintes não precise implementar os filtros. 
// 
**/
public class Fachada implements IDAOVeiculo, IDAOContribuinte, IDAOFiltrosContribuinte {
	private IDAOVeiculo daoVeiculo;
	private IDAOContribuinte daoContribuinte;
	private IDAOFiltrosContribuinte daoFiltroContribuinte;
	
	public Fachada(){
		daoContribuinte = new JDBCDAO();
		daoVeiculo    = new JDBCDAOVeiculo();
		daoFiltroContribuinte = new JDBCDAOContribuinteFiltro();
	}
	public List<Contribuinte> getContribuintesPorGenerero(Genero genero) {
		
		return daoFiltroContribuinte.getContribuintesPorGenerero(genero);
	}

	@Override
	public List<Contribuinte> getContribuintesPorAnoNascimento(int anoNascimento) {
		return daoFiltroContribuinte.getContribuintesPorAnoNascimento(anoNascimento);
	}

	@Override
	public void create(Contribuinte contribuinte) {
		daoContribuinte.create(contribuinte);
	}

	@Override
	public void update(Contribuinte contribuinte) {
		daoContribuinte.update(contribuinte);

	}

	@Override
	public void delete(Contribuinte contribuinte) {
		daoContribuinte.delete(contribuinte);
	}

	@Override
	public void create(Veiculo veiculo) {
		daoVeiculo.create(veiculo);

	}

	@Override
	public void update(Veiculo veiculo) {
		daoVeiculo.update(veiculo);
	}
	@Override
	public Contribuinte retrieve() {
		return daoContribuinte.retrieve();
	}
	@Override
	public Veiculo retrieveVeiculo() {
		return daoVeiculo.retrieveVeiculo();
	}
	@Override
	public void deleteVeiculo(Veiculo veiculo) {
		daoVeiculo.deleteVeiculo(veiculo);
		
	}




}
