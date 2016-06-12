package srp;
/**
 * 
 * @author Ribamar
 * @category Open-Closed Principle Example
 * 
 */
public abstract class CalculoContribuinte   {
	protected Contribuinte contribuinte;
	
	public CalculoContribuinte( Contribuinte contribuinte){
		this.contribuinte  = contribuinte;
	}
	public int GetAnoAposentadoria(){
		return CalculaAnoAposentadoria();
	}

	protected abstract int CalculaAnoAposentadoria();

	
}
