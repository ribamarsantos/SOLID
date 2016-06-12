/**
 * 
 */
package srp;

/**
 * @author Ribamar
 * @category Open Close principle
 * You Can extends Calculo Contribuinte but Can't modify CalculoContribuinte
 */
public class CalculoContribuinteMulher extends CalculoContribuinte {

	public CalculoContribuinteMulher(ContribuinteMulher contribuinte) {
		super(contribuinte);

	}

	private static final int TEMPO_CONTRIBUICAO_MULHER = 30;	
	private static final int IDADE_CALCULO_MULHER = 85;
	
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
		int tempoRestante = TEMPO_CONTRIBUICAO_MULHER -  contribuinte.getTempoContribuicao();
		if ( tempoRestante < 0  ) tempoRestante = 0;
		
		int idadeRestante = IDADE_CALCULO_MULHER - (tempoRestante + CalculoDataContribuinte.getIdadeContribuinte(contribuinte));
						
		return idadeRestante;		
	}

}
