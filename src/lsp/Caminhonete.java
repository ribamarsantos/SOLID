package lsp;

public class Caminhonete extends Veiculo {

	@Override
	public double getValorIpva() {
		System.out.println("Calculando valor da " + getClass().getSimpleName() +" " +
	                        getMarca() +" " + getModelo());
		
		return getPrecoVenal() * 0.025;
	}

}
