package br.com.lucasbentes.pokedex.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI springBlogPessoalOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Pokédex API")
                        .description("Uma API que retorna os dados de um pokémon")
                        .version("v1")
                        .license(new License()
                                .name("Lucas Bentes")
                                .url("https://github.com/lnbentes/PokedexAPI"))
                        .contact(new Contact()
                                .name("Lucas Bentes")
                                .url("https://github.com/lnbentes/PokedexAPI")
                                .email("lnbentes@gmail.com")))
                .externalDocs(new ExternalDocumentation()
                        .description("Github")
                        .url("https://github.com/lnbentes/PokedexAPI"));
    }
}
