package cl.jrios.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.jrios.model.dao.ILibroDao;
import cl.jrios.model.dto.LibroDto;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroDao dao;

	
	@Override
	public LibroDto obtenerLibros() {
		LibroDto dto = new LibroDto();
		dto.setLibros(dao.getAllLibros());
		return dto;
	}

	@Override
	public int registrarLibro(LibroDto libro) {
		return dao.add(libro.getLibro());
	}

	@Override
	public LibroDto eliminarLibro(Integer id) {
		LibroDto dto = new LibroDto();
		dto.setLibro(dao.findById(id));
		
		dao.delete(dto.getLibro());
		return dto;
	}

	@Override
	public LibroDto actualizarLibro(LibroDto dto) {
		dao.update(dto.getLibro());
		return dto;
	}

	@Override
	public LibroDto defaultVo(LibroDto dto) {
		LibroDto aux = new LibroDto();
		aux.setLibro(dto.getLibro());
		
		 LocalDate localDate = LocalDate.now();
	        Locale spanishLocale = new Locale("es", "ES");
	        String dateInSpanish = localDate.format(
	            DateTimeFormatter.ofPattern("EEEE, dd MMMM, yyyy", spanishLocale)
	        );
	        aux.setFecha(dateInSpanish);
	        
	        aux.setLibros(dao.getAllLibros());
		
		return aux;
	}

	@Override
	public LibroDto obtenerPorId(Integer id) {
		LibroDto aux = new LibroDto();
		aux.setLibro(dao.findById(id));
		return aux;
	}

}
