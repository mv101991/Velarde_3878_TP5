package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Usuario;

/**
 * Interface que nos permitira desarrollar la lógica de negocio de nuestro
 * proyecto y a su vez conectarse con los datos que se encuentran almacenados en
 * algún repositorio de datos.
 * 
 * @author Marcia Velarde
 *
 */
public interface IUsuarioService {

	// Declaracion de métodos necesarios que serán implementados por la lógica de
	// negocios de nuestro proyecto.
	public void guardar();

	public Usuario mostrar();

	public void eliminar();

	public Usuario modificar();

}
