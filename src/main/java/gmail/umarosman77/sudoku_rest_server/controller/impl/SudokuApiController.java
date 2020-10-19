package gmail.umarosman77.sudoku_rest_server.controller.impl;

import gmail.umarosman77.sudoku_rest_server.controller.SudokuApi;
import gmail.umarosman77.sudoku_rest_server.model.SudokuGame;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SudokuApiController implements SudokuApi {

	@Override
	public ResponseEntity<SudokuGame> newGame() {
		return null;
	}
}
