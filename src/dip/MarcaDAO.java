package dip;

public class MarcaDAO implements IMarcaDAO{

	@Override
	public void cadastrar(String marca) {
		System.out.println("Marca "+ marca + " Cadastrada com sucesso!");
	}
	

}
