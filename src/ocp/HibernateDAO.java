/**
 * 
 */
package ocp;

import srp.Contribuinte;

/**
 * @author Ribamar
 *
 */
public class HibernateDAO implements IDAOContribuinte {

	public void create(Contribuinte contribuinte) {
		System.out.println("contribuinte Created - Oracle" + contribuinte.getNome());

	}

	@Override
	public void update(Contribuinte contribuinte) {
		System.out.println("Object using Oracle Updated ");

	}

	@Override
	public Contribuinte  retrieve() {
		System.out.println("Selecting object from dataBase using - Oracle");
		return null;
	}

	@Override
	public void delete(Contribuinte contribuinte) {
		System.out.println("Deleting object using Oracle");

	}

	

}
