/**
 * 
 */
package factory;
import logicaDeNegocios.Curso;;

/**
 * @author Jimmy
 *
 */
public class FactoryCurso {
	
	public static Curso crearCurso(String codigoCurso,String nombreCurso,String descripcion)
	{
		Curso temporal=new Curso("TI 5501","Diseno de Software","Aprender a disenar software");
		return temporal;
	}
}
