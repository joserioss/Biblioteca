package cl.jrios.model.dto;

import java.util.ArrayList;
import java.util.List;

import cl.jrios.model.entity.LibroEntity;

public class LibroDto {

	private String fecha;
	private LibroEntity libro;
	private List<LibroEntity> libros;

	public LibroDto() {
		libro = new LibroEntity();
		libros = new ArrayList<>();
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public LibroEntity getLibro() {
		return libro;
	}

	public void setLibro(LibroEntity libro) {
		this.libro = libro;
	}

	
	public void setLibro(RegistroDto libro){
		this.libro = new LibroEntity(
			libro.getId(),
			libro.getTitulo(),
			libro.getAutor(),
			libro.getImprenta(),
			libro.getAnio_pub()
			);
	}
	
	
	public List<LibroEntity> getLibros() {
		return libros;
	}

	public void setLibros(List<LibroEntity> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "LibroDto [fecha=" + fecha + ", libro=" + libro + ", libros=" + libros + "\n]";
	}

}
