package paqueteJavaDoc;
/** 
 * La clase PruebaCancion es la principal del programa(main)
 * @author grupo2,Sardina
 * @version 2.0
 * @since 16-02-2022
 * 
 *
 */
public class PruebaCancion {
	/**
	 * En el main se van a ejecutar una serie de argumentos y para ello en ciertas ocasiones llamará a las otras clases
	 * y sus constructores
	 * @param args Le dice al programa como ejecutar el codigo(argumento por argumento, separados por punto y coma)
	 * @see Cancion#Cancion(), {@link Cancion#Cancion(String, int)} Crea el constructor
	 * {@link Cancion#reproducirCancion()}
	 * {@link Cancion#pararCancion()}
	 * {@link Cancion#MismaCancion(Cancion)}
	 * 
	 */
	public static void main(String[] args) {

		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);

		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);

		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420,
				false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };

		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}
	/**
	 * Este método nos servirá para mostrar la canción que se está reproduciendo 
	 * y la siguiente canción que se va a reproducir con el título de ambas
	 * {@link PruebaCancion#mostrarSiguienteCancion(Cancion, Cancion[])}
	 * @param miCancion
	 * @param canciones
	 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}
	/**
	 * Este método nos mostrará la canción más larga de todas las existentes
	 * Utilizando Cancion.MayorDurancion(canciones) de la clase Cancion
	 * {@link PruebaCancion#mostrarCancionMasLarga(Cancion[])}
	 * @param canciones
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}
	/**
	 * Este método nos mostrará el título de la canción actual y su autor correspondiente
	 * {@link PruebaCancion#mostrarCancionesyAutor(Cancion[])}
	 * @param canciones
	 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}

}
