package ocp;

import srp.Contribuinte;

/**
 * 
 * @author Ribamar
 * @category open-close principle
 * Interface closed to 
 */
public interface IDAOContribuinte {
	public void create(Contribuinte contribuinte);
	public void update(Contribuinte contribuinte);
	public Contribuinte  retrieve();
	public void delete(Contribuinte contribuinte);

}
