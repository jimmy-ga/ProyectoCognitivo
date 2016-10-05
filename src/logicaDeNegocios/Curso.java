/**
 * 
 */
package logicaDeNegocios;

/**
 * @author Jimmy
 *
 */
public class Curso {
	private Catalogo miCatalogo;
	private String codigoCurso;
	private String nombreCurso;
	private String descripcion;

	public Curso(String pCodigoCurso, String pNombreCurso,String pDescripcion)
	{
		codigoCurso=pCodigoCurso;
		nombreCurso=pNombreCurso;
		descripcion=pDescripcion;
	}
	
	public String toString()
	{
		return codigoCurso+" "+nombreCurso+" "+descripcion;
	}

}