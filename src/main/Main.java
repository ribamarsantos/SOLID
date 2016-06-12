package main;

import dip.MarcaBO;
import dip.MarcaDAO;
import frontcontroller.FrontController;
import isp.Fachada;
import lsp.Automovel;
import lsp.Caminhonete;
import lsp.Moto;
import lsp.Veiculo;
import ocp.HibernateDAO;
import ocp.IDAOContribuinte;
import ocp.JDBCDAO;
import srp.CalculoContribuinte;
import srp.CalculoContribuinteHomem;
import srp.CalculoContribuinteMulher;
import srp.Contribuinte;
import srp.ContribuinteHomem;
import srp.ContribuinteMulher;

public class Main {

	public static void main(String[] args) {
	    // Classe CalculContribuinte definida com principio Open Close
		// Aberta para implementar o calculo do Contribuinte do Genero Masculino e Feminino
		// Aberta para implementar o calculo de  um Contribuinte Tipo X por exemplo MasculinoSetorPublico
		
		Contribuinte brasileiro = new ContribuinteHomem();
		brasileiro.setAnoNascimento(1989);
		brasileiro.setNome("Ribamar Marcos");
		brasileiro.setTempoContribuicao(7);
		
		CalculoContribuinte calc =new CalculoContribuinteHomem((ContribuinteHomem) brasileiro);
		
		
		System.out.println("Calculando aposentadoria de ");
		System.out.println("Nome: " + brasileiro.getNome());
		System.out.println(brasileiro.getGenero());
		System.out.println("Nascimento: " + brasileiro.getAnoNascimento());
		
		System.out.println("Ano aposentadoria: " + calc.GetAnoAposentadoria());
		
		brasileiro = new ContribuinteMulher();
		brasileiro.setAnoNascimento(1969);
		brasileiro.setNome("Fulana ");
		brasileiro.setTempoContribuicao(20);
		
		calc = new CalculoContribuinteMulher((ContribuinteMulher) brasileiro);
		System.out.println("Calculando aposentadoria de ");
		System.out.println("Nome: " + brasileiro.getNome());
		System.out.println(brasileiro.getGenero());
		System.out.println("Nascimento: " + brasileiro.getAnoNascimento());
		
		System.out.println("Ano aposentadoria: " + calc.GetAnoAposentadoria());
		
		// Open Close Principle Example
		
		IDAOContribuinte dao = new HibernateDAO();
		dao.create(brasileiro);
		
		
		dao = new JDBCDAO();
		
		dao.delete(brasileiro );
		
		//Liskov Substitution Principle Example
		
		Veiculo titan = new Moto();
		titan.setMarca("Honda");
		titan.setModelo("Titan XR");
		titan.setPrecoVenal(7000);
		System.out.println(titan.getValorIpva());
		
		Veiculo gol = new Automovel();
		
		gol.setMarca("VW");
		gol.setModelo("Gol Special");
		gol.setPrecoVenal(34000);
		System.out.println(gol.getValorIpva());
		
		Veiculo s10 = new Caminhonete();
		s10.setMarca("Chevrolet S10");
		s10.setModelo("Turbo Diesel");
		s10.setPrecoVenal(120000);
		System.out.println(s10.getValorIpva());
		
		// Interface Segregation Principle 
		
		Fachada fachada = new Fachada();
		fachada.create(brasileiro);
		fachada.create(gol);
		gol = fachada.retrieveVeiculo();
		System.out.println("Busca do Veiculo" + gol.getMarca());
		
		// Dependency Inversion Principle
		
		String marca = "Adidas";
		MarcaBO marcaBO = new MarcaBO(new MarcaDAO());
		marcaBO.cadatrarMarca(marca);


		// FRONT controller example
		System.out.println("=========================");
		System.out.println("FRONT CONTROLLER EXAMPLE");
		System.out.println("=========================");
		FrontController controller = new FrontController();
		// recebendo requisição para pagina veiculo.jsp
		controller.dispatchRequest("VEICULO");
		// recebendo requisição para pagina .jsp
		controller.dispatchRequest("MARCA");
		
	}

}
