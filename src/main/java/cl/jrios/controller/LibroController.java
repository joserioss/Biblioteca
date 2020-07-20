package cl.jrios.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cl.jrios.model.dto.LibroDto;
import cl.jrios.model.dto.RegistroDto;
import cl.jrios.model.entity.LibroEntity;
import cl.jrios.service.ILibroService;

@Controller
@RequestMapping(value = "/libro")
public class LibroController {

	@Autowired
	private ILibroService servicio;

	/**
	 * Ventana Principal del mantendor de libros
	 **/
	@RequestMapping(value = { "", "/" })
	public String libro(HttpSession session, ModelMap modelo) {
		LibroDto dto = servicio.obtenerLibros();
		String vista = "libro";

		dto.setLibro((LibroEntity) session.getAttribute("currentLibro"));

		if (dto.getLibro() == null) {
			return "/libro";
		}

		dto = servicio.defaultVo(dto);
		
		modelo.put("libroVo", dto);

		return vista;
	}

	
	/**
	 * Carga vista de registro de libros
	 **/	
	@RequestMapping(value = "/registrar")
	public String registrar(ModelMap modelo) {
		modelo.put("libroVo", new LibroDto());
		return "registrar";
		
	}

	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	public String registrar(
			ModelMap modelo,
			@ModelAttribute(name = "libro") RegistroDto registroVo
			) {
		
		LibroDto dto = new LibroDto();
		dto.setLibro(registroVo);
		
		servicio.registrarLibro(dto);
		
		modelo.put("libroVo", dto);
		
		return "redirect:/libro/";
	}
	
	
	/**
	 * Implementa funcion eliminar
	 **/
	@RequestMapping(value = "/eliminar")
	public String eliminar(
			ModelMap modelo,
			@RequestParam(name = "id")Integer id,
			RedirectAttributes attributes
			){
		LibroDto libroVo = servicio.eliminarLibro(id);
	
		return "redirect:/libro/";
	}
	
	/**
	 * Implementa funcion actualizar
	 **/
	@RequestMapping(value = "/actualizar", method = RequestMethod.GET)
	public String actualizar(
			ModelMap modelo,
			@RequestParam(name = "id") Integer id
			) {
		modelo.put("libroVo",servicio.obtenerPorId(id));
		
		return "actualizar";
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST)
	public String hacerActualizar(
			 ModelMap modelo,
			 @ModelAttribute(name = "libro") RegistroDto registroVo,
			 RedirectAttributes attributes
			){
		
		LibroDto dto = new LibroDto();
		
		dto.setLibro(registroVo);
		
		servicio.actualizarLibro(dto);
		
		return "redirect:/libro/";
		
	}
	
	
}
