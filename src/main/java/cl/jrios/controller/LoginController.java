package cl.jrios.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.jrios.model.dto.LibroDto;
import cl.jrios.model.entity.LibroEntity;
import cl.jrios.service.ILibroService;

@Controller
@RequestMapping(value = "/")
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private ILibroService service;

	@RequestMapping(value = { "", "/" })
	public String login() {
		return "index";
	}

	@RequestMapping(value = "/dologin")
	public String doLogin(HttpSession session, ModelMap modelo, @ModelAttribute(name = "libro") LibroEntity libro) {
		String vista = "libro";

		LibroDto dto = service.obtenerLibros();
		service.defaultVo(dto);
		session.setAttribute("currentLibro", dto.getLibro());

		modelo.put("libroVo", dto);

		return vista;
	}
}
