package ocp;

import srp.Contribuinte;
import srp.ContribuinteHomem;

public class JDBCDAO implements IDAOContribuinte {

	@Override
	public void create(Contribuinte contribuinte) {
		System.out.println("Object Created" +contribuinte.getNome());

	}

	@Override
	public void update(Contribuinte contribuinte) {
		System.out.println("Object using JDBC Updated" + contribuinte.getNome());

	}

	@Override
	public Contribuinte retrieve() {
		System.out.println("Selecting object from dataBase using JDBC");
		Contribuinte contribuinte = new ContribuinteHomem();
		return contribuinte;
	}

	@Override
	public void delete(Contribuinte contribuinte) {
		System.out.println("Deleting object using JDBC");

	}

}
