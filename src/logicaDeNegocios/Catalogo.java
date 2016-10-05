/**
 * 
 */
package logicaDeNegocios;

/**
 * @author Jimmy
 *
 */
public class Catalogo implements iMostrarResultado{
	private String nombreCategoria;
	private String descripcionCategoria;
	
	public Catalogo(String pNombreCat, String pDescripcionCat)
	{
		nombreCategoria=pNombreCat;
		descripcionCategoria=pDescripcionCat;
	}
	
	public String toString()
	{
		return nombreCategoria+" "+descripcionCategoria;
	}

}
