package dip;

public class MarcaBO {
	private IMarcaDAO marcaDAO;
	
	public MarcaBO(IMarcaDAO marcaDAO){
		this.marcaDAO = marcaDAO;
	}
	public void cadatrarMarca(String marca){
		marcaDAO.cadastrar(marca);
	}

}
