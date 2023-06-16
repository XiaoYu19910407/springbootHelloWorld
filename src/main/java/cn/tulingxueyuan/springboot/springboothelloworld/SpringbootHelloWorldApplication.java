package cn.tulingxueyuan.springboot.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication注解里的@SpringBootConfiguration注解 相当于spring.xml
 * @ComponentScan 相当于<context:component-scan basePackages="cn.tulingxueyuan.springboot.springboothelloworld"></context:component-scan>
 * Spring底层在解析配置类，会去解析@ComponentScan,读取basePackages,
 * 如果没有读取到，会将当前配置类所在的包当做扫描包
 * SpringBoot启动类要放在需要扫描包的根目录下面，或者所有Bean的顶层目录中
 */
@SpringBootApplication
public class SpringbootHelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloWorldApplication.class, args);
    }

}
