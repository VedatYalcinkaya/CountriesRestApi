package com.yalcinkayavedat.countries_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yalcinkayavedat.countries_app"))
                .paths(PathSelectors.regex("/api.*"))
                .build()
                .apiInfo(info());
    }
    private ApiInfo info() {
        return new ApiInfoBuilder()
                .title("Vedat Yalçınkaya deneme")
                .description("Vedat Yalçınkaya deneme")
                .termsOfServiceUrl("https://opensource.org.licences/MIT")
                .license("MIT License")
                .version("1.12.3")
                .licenseUrl("https://opensource.org/license/MIT")
                .build();
    }

}
