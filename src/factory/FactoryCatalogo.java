/**
 * 
 */
package factory;
import logicaDeNegocios.Catalogo;

/**
 * @author Jimmy
 *
 */
public class FactoryCatalogo {
	
	public static Catalogo crearCatalogo(String nombreCategoria,String descripcionCategoria)
	{
		Catalogo temporal=new Catalogo("nombre","descripcion");
		return temporal;
	}
}
