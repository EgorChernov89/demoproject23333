package com.example.demoproject23333.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;


@OpenAPIDefinition(
        info = @Info(
                title = "Титульник",
                description = "Тест",
                version = "3.0.0",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(
                        name = "Егор",
                        email = "a@a.ru",
                        url = "www.w.ww"
                )
        ),
        servers = @Server(url = "http://localhost:8096")
)
@SecurityScheme(
        name = "токен",
        description = "токен авторизации",
        paramName = "JWT",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "bearer",
        scheme = "bearer"
)
//http://localhost:8096/swagger-ui/index.html#/
public class OpenApiConfig {
}
