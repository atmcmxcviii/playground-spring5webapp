package hu.atsoft.playground.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hu.atsoft.playground.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		
		/* Return a view name for Thymeleaf */
		return "books";
	}
}
