package gmail.umarosman77.sudoku_rest_server.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiTestConfig {

	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String applicationDescription, @Value("${application-version}") String applicationVersion) {
		return new OpenAPI()
				.info(new Info()
						.title("Sudoku")
						.version(applicationVersion)
						.description(applicationDescription));
	}
}
