package dio.webapi.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private Contact contact() {
        return new Contact(
                "Lucas Ferreira",
                "http://localhost:8080",
                "lks_ferreira@hotmail.com");
    }

    private ApiInfoBuilder informacoesAPI() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("API-REST");
        apiInfoBuilder.description("API para gerenciamento de pessoas");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");

        apiInfoBuilder.version("1.0.0");
        apiInfoBuilder.license("Apache License Version 2.0");
        apiInfoBuilder.licenseUrl("https://www.apache.org/licenses/LICENSE-2.0");
        apiInfoBuilder.contact(contact());
        return apiInfoBuilder;
    }

    @Bean
    Docket detalhesAPI() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket.select()
                .apis(RequestHandlerSelectors.basePackage("dio.webapi.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(informacoesAPI().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }

}
