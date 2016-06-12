package lsp;

public class Automovel extends Veiculo {

	@Override
	public double getValorIpva() {
		System.out.println("Calculando valor do " + getClass().getSimpleName() +" " +
                getMarca() +" " + getModelo());
		
		return getPrecoVenal() * 0.03;
	}
	

}
