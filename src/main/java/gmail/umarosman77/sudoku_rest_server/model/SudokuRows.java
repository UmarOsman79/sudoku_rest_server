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
public class SudokuRows {

	@Size(max = 9)
	@Schema(description = "Each item in the cells list can be a maximum of one character in length")
	private List<Character> cells;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
