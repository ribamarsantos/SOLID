package isp;

import lsp.Moto;
import lsp.Veiculo;

public class JDBCDAOVeiculo implements IDAOVeiculo {

	@Override
	public void create(Veiculo veiculo) {
		System.out.println(veiculo.getMarca() + " Created. - JDBC");
		
	}

	@Override
	public void update(Veiculo veiculo) {
		System.out.println(veiculo.getMarca() + " Updated. - JDBC");
	}

	@Override
	public Veiculo retrieveVeiculo() {
		Veiculo retorno = new Moto();
		retorno.setMarca("HONDA");
		retorno.setModelo("BR");
		
		return retorno;
	}

	@Override
	public void deleteVeiculo(Veiculo veiculo) {
		System.out.println("veiculo " + veiculo.getMarca() + " deleted - jdbc");
		
	}


}
