public class app {
	public static String saludar(String nombre) {

		String saludo = "Hola. Bienvenido " + nombre;

		return saludo;
	}

	public static String error(String nombre) {

		String error = "Ups. No pudimos validar tus datos. " + nombre + " es tu usuario?";

		return error;
	}

	public static void verificar(String usuario, String contrasenia) {
		String usuarioValido = "Juliansilvit";

		String contraseniaValida = "contraseña";

		if (usuarioValido.equals(usuario) && contraseniaValida.equals(contrasenia)) {

			System.out.println(saludar(usuario));
			return;
		}

		System.out.println(error(usuario));
	}

	public static void main(String[] args) {
		String usuario = "Juliansilvit";
		String contrasenia = "contraseña";

		verificar(usuario, contrasenia);

	}
}
