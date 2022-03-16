package paqueteJavaDoc;
/**
 * Esta es la clase Cancion donde vamos a encontrar sus atributos,constructores, métodos, setters y getters
 * @version 2.02
 * @author grupo2,Sardina
 * @since 16-02-2022
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
/**
 * Este constructor va a pasar los atributos, título, duración y canción sonando
 * pero vacío ya que no tiene ningún parámetro(todos vacíos)
 * 
 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/**
 * Este constructor con 2 parámetros (título y duración) va a pasar los atributos,título, duración y canción sonando(vacío)
 * @param titulo
 * @param duracion
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/**
 * Este constructor con 3 parámetros (título y duración y cancion sonando) va a pasar los atributos,título, duración y canción sonando
 * @param titulo
 * @param grupo
 * @param duracion
 * @param sonando
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
/**
 * Este método boolean, nos va a decir que la canción está sonando y una vez ha empezado,
 * va a pasar a ser false y cuando acabe pase a ser true para empezar de nuevo
 * @return
 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
/**
 * Este método boolean nos va a servir para parar la canción cuando esté sonando
 * y
 * @return
 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
/**
 * Este getter, nos va a permitir sacar el título introducido en ese objeto y printearlo en el main
 * (Todos funcionan igual)
 * @return
 */
	public String getTitulo() {
		return titulo;
	}
/**
 * Este setter, nos va a permitir introducir el título de ese objeto para despues sacarlo con el getter
 * (Todos funcionan igual)
 * @param titulo
 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
/**
 * Método con un parámetro(Constructor Cancion)
 * Este método nos va a checkear si el título de la canción es el correcto
 * y el grupo es el perteneciente a la cancion. Si esto se cumple será true, sino será false
 * @param cancion
 * @return
 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
/**
 * Método con una variable(array de canciones)
 * Este método va a guardar en una variable la duración de cada canción y comprobar si la siguiente es mayor,
 * guardando por lo tanto la duración más alta y pasando el método por todas las canciones.
 * Y el return devolverá el título de esa canción.
 * Así podrá saber cual es la canción más larga
 * @param canciones
 * @return
 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
/**
 * Este método nos va a servir para pasar de canción, con dos parámetros,(array de canciones y el título de ellas) comprobando que cuando esta acabe, le sumará 1 al contador
 * y pasará a la siguiente, verificando siempre que cuando llegue al final, el valor de la variable siguiente se
 * resetee a 0.
 * Finalmente obteniendo con el retur el título de la canción siguiente
 * @param canciones
 * @param titulo
 * @return
 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
/**
 * Este método sirve para pasar el método toString(), para que el return nos devuelva 
 * todos los atributos que queramos de el objeto que queramos en el main, sin tener que utilizar
 * el toString repetidas veces. 
 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}