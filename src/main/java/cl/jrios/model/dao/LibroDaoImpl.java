package cl.jrios.model.dao;

import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.jrios.model.dao.mapper.LibroMapper;
import cl.jrios.model.entity.LibroEntity;

@Repository
public class LibroDaoImpl implements ILibroDao {

	private static final Logger logger = LoggerFactory.getLogger(LibroDaoImpl.class);

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public LibroDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<LibroEntity> getAllLibros() {
		String consulta = "select id, titulo, autor, imprenta, anio_pub from libro";

		return jdbcTemplate.query(consulta, new LibroMapper());
	}

	@Override
	public LibroEntity findByTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LibroEntity findByAutor(String autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("deprecation")
	@Override
	public LibroEntity findById(int id) {
		String consulta = "select id, titulo, autor, imprenta, anio_pub from libro where id=? ";

		Object[] parametros = new Object[] { id };

		LibroMapper mapaLibro = new LibroMapper();

		LibroEntity resultado = null;

		try {
			resultado = jdbcTemplate.queryForObject(consulta, parametros, mapaLibro);
		} catch (EmptyResultDataAccessException e) {
			logger.warn("Consulta: " + consulta);
			logger.error("Error: " + e.getMessage());
		}

		return resultado;
	}

	@Override
	public int delete(LibroEntity libro) {
		String consulta = "delete from libro where id=?";

		return jdbcTemplate.update(consulta, libro.getId());
	}

	@Override
	public int update(LibroEntity libro) {
		String consulta = "update libro set titulo=?, autor=?, imprenta=?, anio_pub=? where id=?";

		return jdbcTemplate.update(consulta, libro.getTitulo(), libro.getAutor(), libro.getImprenta(),
				libro.getAnio_pub(), libro.getId());
	}

	@Override
	public int add(LibroEntity libro) {
		String consulta = "insert into libro (titulo, autor, imprenta, anio_pub) values (?, ?, ?, ?)";

		return jdbcTemplate.update(consulta, libro.getTitulo(), libro.getAutor(), libro.getImprenta(),
				libro.getAnio_pub());
	}

}
