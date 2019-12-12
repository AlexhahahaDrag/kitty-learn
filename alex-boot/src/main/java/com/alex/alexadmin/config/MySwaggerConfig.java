package com.alex.alexadmin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description: swagger配置类
 * @Author:     alex
 * @CreateDate: 2019/12/12 9:19
 * @Version:    1.0
 *
 */
@Configuration
@EnableSwagger2
public class MySwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                //api接口包扫描路径
                .apis(RequestHandlerSelectors.any())
                //可以根据url路径设置那些请求加入文档
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //设置文档标题
                .title("alex api doc")
                //设置文档描述
                .description("this is a restful api document of alex")
                //设置文档版本
                .version("1.0")
                //设置文档的license信息
                .termsOfServiceUrl("www.alex.com")
                .build();
    }
}
