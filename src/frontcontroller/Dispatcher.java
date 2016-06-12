package frontcontroller;

public class Dispatcher {
	private MarcaJSP marcajsp;
	private VeiculoJSP veiculojsp;
	
	public Dispatcher(){
		marcajsp = new MarcaJSP();
		veiculojsp = new VeiculoJSP();
	}
	public void dispatch(String request){
		System.out.println("página " + request + "Foi requisitada");
		if (request.equalsIgnoreCase("MARCA")){
			marcajsp.show();
		}else if ( request.equalsIgnoreCase("VEICULO")){
			veiculojsp.show();
		}
	}

}
