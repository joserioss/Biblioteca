package cl.jrios.service;

import cl.jrios.model.dto.LibroDto;

public interface ILibroService {

	LibroDto obtenerLibros();
	int registrarLibro(LibroDto libro);
	LibroDto eliminarLibro(Integer id);
	LibroDto actualizarLibro(LibroDto dto);
	LibroDto defaultVo(LibroDto dto);
	LibroDto obtenerPorId(Integer id);
}
