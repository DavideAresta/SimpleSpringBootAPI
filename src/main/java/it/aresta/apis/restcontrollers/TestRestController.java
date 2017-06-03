package it.aresta.apis.restcontrollers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@CrossOrigin(value = "http://localhost:4000")
	@RequestMapping("test")
	public ResponseEntity<Boolean> test() {
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}

}
