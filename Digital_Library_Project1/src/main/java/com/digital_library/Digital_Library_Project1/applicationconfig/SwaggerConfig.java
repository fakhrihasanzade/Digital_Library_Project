package com.digital_library.Digital_Library_Project1.applicationconfig;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI().info(
                new Info()
                        .title("Digital-Library Project")
                        .version("v1")
                        .description("This API provides backend services for managing students and" +
                                " teachers, including CRUD operations, search functionality," +
                                " and user authentication.")
                        .termsOfService("http://example.com/terms")
                        .contact(
                                new Contact()
                                        .url("https://www.linkedin.com/in/fakhri-hasanzade-873833330/")
                                        .email("fakhrihasanzade@gmail.com")
                                        .name("Fexri Hesenzade")

                        )
        );
    }
}