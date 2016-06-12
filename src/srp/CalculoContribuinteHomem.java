package srp;
/**
 * 
 * @author Ribamar
 * @category Open-Closed Principle Example
 *  Using the class
 */
public class CalculoContribuinteHomem  extends CalculoContribuinte{
	
	private static final int TEMPO_CONTRIBUICAO_HOMEM = 35;	
	private static final int IDADE_CALCULO_HOMEM = 95;
	
	
	public CalculoContribuinteHomem(ContribuinteHomem contribuinte) {
		super(contribuinte);

	}
	
	@Override
	protected int CalculaAnoAposentadoria() {


		return getAnoAposentadoria();
	}
	// Applying Simple Responsability Principle
	private int getAnoAposentadoria(){
		return CalculoDataContribuinte.getCurrentYear() + getTempoRestante();
	}
	
	// only example not exctaly the right value of Year Use the Government Site for more info.	
	private int getTempoRestante() {
		int tempoRestante = TEMPO_CONTRIBUICAO_HOMEM -  contribuinte.getTempoContribuicao();
		if ( tempoRestante < 0  ) tempoRestante = 0;
		
		int idadeRestante = IDADE_CALCULO_HOMEM - (tempoRestante + CalculoDataContribuinte.getIdadeContribuinte(contribuinte));
						
		return idadeRestante;		
	}
	

}
