package gmail.umarosman77.sudoku_rest_server.model;

import com.google.gson.Gson;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseMessage {

	private String message;

	@Override
	public String toString() {
		return new Gson().toJson(this);
	}
}
