package lsp;

public abstract class Veiculo {
	private String placa;
	private String modelo; // We could create an Modelo and Marca Class just for example
	private String marca;
	private int potencia;
	private int anoFabricacao;
	private String uf;
	private double precoVenal;
	
	public abstract double getValorIpva();
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}


	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public double getPrecoVenal() {
		return precoVenal;
	}

	public void setPrecoVenal(double precoVenal) {
		this.precoVenal = precoVenal;
	}
}
