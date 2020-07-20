package cl.jrios.model.entity;

public class LibroEntity {
	private Integer id;
	private String titulo;
	private String autor;
	private String imprenta;
	private String anio_pub;

	public LibroEntity() {
	}

	public LibroEntity(Integer id, String titulo, String autor, String imprenta, String anio_pub) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.imprenta = imprenta;
		this.anio_pub = anio_pub;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getImprenta() {
		return imprenta;
	}

	public void setImprenta(String imprenta) {
		this.imprenta = imprenta;
	}

	public String getAnio_pub() {
		return anio_pub;
	}

	public void setAnio_pub(String anio_pub) {
		this.anio_pub = anio_pub;
	}

	@Override
	public String toString() {
		return "LibroEntity [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", imprenta=" + imprenta
				+ ", anio_pub=" + anio_pub + "]";
	}

}
