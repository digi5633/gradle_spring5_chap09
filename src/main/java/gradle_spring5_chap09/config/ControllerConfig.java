package gradle_spring5_chap09.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "gradle_spring5_chap09.controller" })
public class ControllerConfig {

}
