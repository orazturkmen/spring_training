package bean_practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewConfig {
    @Bean("str1")
    String str1(){
        return "str1 printed";
    }

    @Bean("str2")
    String str2(){
        return "str2 printed";
    }
}
