package lsp;

public class Moto extends Veiculo {


	public double getValorIpva() {
		System.out.println("Calculando valor da " + getClass().getSimpleName() +" " +
                getMarca() +" " + getModelo());

		
		return getPrecoVenal() * 0.02;
	}
	
	
	

}
