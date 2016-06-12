package businessdelegate;

public class MarcaClient {
	private BusinessDelegate businessService;
	
	public MarcaClient(BusinessDelegate businessService){
		this.businessService = businessService;
		
	}
	public void cadastrar(){
		businessService.cadastrar();
	}

}
