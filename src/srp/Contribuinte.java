package srp;

public abstract class Contribuinte {
	private String nome;
	private int anoNascimento;
	private int tempoContribuicao;
	protected Genero genero;
	
	public Contribuinte(String nome, int anoNascimento, int tempoContribuicao) {		
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.tempoContribuicao = tempoContribuicao;
	}
	
	public Contribuinte(){
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


    public int getTempoContribuicao() {
		return tempoContribuicao;
	}


	public void setTempoContribuicao(int tempoContribuicao) {
		this.tempoContribuicao = tempoContribuicao;
	}
	
	protected void setGenero(Genero genero){
		this.genero  = genero;
	}

	public Genero getGenero() {
		// TODO Auto-generated method stub
		return this.genero;
	};
		
}
