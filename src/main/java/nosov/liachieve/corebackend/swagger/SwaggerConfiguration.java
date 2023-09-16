package nosov.liachieve.corebackend.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("Api")
                .packagesToScan("nosov.liachieve.corebackend")
                .build();
    }

    @Bean
    public OpenAPI springShopOpenAPI(@Value("${nosov.liachieve.corebackend.documentation.version:1}") String apiVersion) {
        return new OpenAPI().info(new Info()
                .title("API for 'Life as achieve' core backend'")
                .version(apiVersion)
        );
    }
}

