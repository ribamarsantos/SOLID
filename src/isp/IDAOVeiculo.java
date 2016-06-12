package isp;

import lsp.Veiculo;

public interface IDAOVeiculo {
	public void create(Veiculo veiculo);
	public void update(Veiculo veiculo);
	public Veiculo  retrieveVeiculo();
	public void deleteVeiculo(Veiculo veiculo);

}
