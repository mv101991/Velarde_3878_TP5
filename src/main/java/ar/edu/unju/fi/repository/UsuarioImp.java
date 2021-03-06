package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Velarde3878Tp5Application;
import ar.edu.unju.fi.model.Usuario;


/**
 * Clase que implementará los métodos de la interface IUsuario.
 * 
 * @author Marcia Velarde
 *
 */
//Esta anotación está indicando que se trata de un bean de Spring que se encargará de manipular los datos 
//almacenados en algún repositorio
@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	// Realizaremos la inyeccion de los bean necesarios para usar un objeto de tipo
	// Usuario
	@Autowired
	private Usuario usuario;

	// Vamos a utilizar una variable estática que funcionará para simular las
	// acciones de los métodos. Utilizaremos la librería de trazas de Log, Log4j que
	// fue incorporada entre las dependencias que descargó maven para nuestro
	// proyecto.
	public static Logger LOG = LoggerFactory.getLogger(Velarde3878Tp5Application.class);

	@Override
	public void guardar() {
		// Acción ejecutada para guardar un objeto Usuario en la BD
		LOG.info("El usuario fue guardado " + usuario.getApellido() + ", " + usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// Se recuperan todos los datos del usuario
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Usuario de la red
		LOG.info("Se elimino los datos del usuario");
	}

	@Override
	public Usuario modificar() {
		// Se modifican los datos del usuario
		LOG.info("Mostrar los datos del usuario modificado");
		return usuario;
	}

}
