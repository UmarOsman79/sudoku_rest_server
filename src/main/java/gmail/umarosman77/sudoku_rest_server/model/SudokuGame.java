package gmail.umarosman77.sudoku_rest_server.model;

import com.google.gson.Gson;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Builder
@Schema(description = "Represents a standard 9x9 Sudoku game")
public class SudokuGame {

	@Size(max = 9)
	@Schema(description = "A SudokuRow object represents 1 row")
	private List<SudokuRows> sudokuRowsList;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
