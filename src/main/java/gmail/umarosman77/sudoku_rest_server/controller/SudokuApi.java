package gmail.umarosman77.sudoku_rest_server.controller;

import gmail.umarosman77.sudoku_rest_server.model.SudokuGame;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value = "/sudoku", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public interface SudokuApi {

	@PostMapping("/new")
	ResponseEntity<SudokuGame> newGame();
}
