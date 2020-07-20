package cl.jrios.model.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.jrios.model.entity.LibroEntity;

public class LibroMapper implements RowMapper<LibroEntity>{
	
	private static final Logger logger = LoggerFactory.getLogger(LibroMapper.class);
	
	

	@Override
	public LibroEntity mapRow(ResultSet resultSet, int i) 
			throws SQLException {
		
		LibroEntity libro = new LibroEntity();
		
		Integer id = resultSet.getInt("id");
		String titulo = resultSet.getString("titulo");
		String autor = resultSet.getString("autor");
		String imprenta = resultSet.getString("imprenta");
		String anio_pub = resultSet.getString("anio_pub");
		
		libro.setId(id);
		libro.setTitulo(titulo);
		libro.setAutor(autor);
		libro.setImprenta(imprenta);
		libro.setAnio_pub(anio_pub);
		
		logger.info("Se ejecuta el mapRow con libro: " + libro);
		
		return libro;
	}
	
	

}
