package ar.edu.unju.fi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

/**
 * Clase que va a implementar la interface IUsuarioService.
 * 
 * @author Marcia Velarde
 *
 */
@Repository
public class UsuarioServiceImp implements IUsuarioService {

	// Inyección de un objeto implementador de la clase IUsuario para la conexión
	// con la capa repository
	@Autowired
	private IUsuario iusuario;

	@Override
	public void guardar() {
		// Acción ejecutada para implementar el metodo guardar()
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		// Acción ejecutada para implementar el metodo mostrar()
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}

	@Override
	public void eliminar() {
		// Acción ejecutada para implementar el metodo eliminar()
		iusuario.eliminar();
	}

	@Override
	public Usuario modificar() {
		// Acción ejecutada para implementar el metodo modificar()
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
