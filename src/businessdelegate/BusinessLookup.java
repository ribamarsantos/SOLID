package businessdelegate;

public class BusinessLookup {
	public IBusinessService getBusinessService(Service service){
		if (service.equals(Service.JSONSERVICE)){
			return new JSONService();
		}else{
			return new XMLService();
		}
	}
}
