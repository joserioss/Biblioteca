package cl.jrios.model.dao;

import java.util.List;

import cl.jrios.model.entity.LibroEntity;

public interface ILibroDao {

	List<LibroEntity> getAllLibros();
	LibroEntity findByTitulo(String titulo);
	LibroEntity findByAutor(String autor);
	LibroEntity findById(int id);
	int delete(LibroEntity libro);
	int update(LibroEntity libro);
	int add(LibroEntity libro);
	
}
