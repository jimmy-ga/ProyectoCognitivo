/**
 * 
 */
package factory;
import integracionWatson.IntegracionWatson;

/**
 * @author Jimmy
 *
 */
public class FactoryWatson {
	
	public static IntegracionWatson ejecutarAPI()
	{
		IntegracionWatson temporal=new IntegracionWatson();
		return temporal;
	}
}
