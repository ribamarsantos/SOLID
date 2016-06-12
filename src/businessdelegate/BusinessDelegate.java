package businessdelegate;

public class BusinessDelegate {
	private BusinessLookup lookupService = new BusinessLookup();
	private IBusinessService servico;
	private Service tipoServico;
	
	public void execute(Service tipoServico){
		this.tipoServico = tipoServico;
	}
	
	public void cadastrar(){
		servico = lookupService.getBusinessService(tipoServico);
		servico.cadastrar();
	}
	

}
