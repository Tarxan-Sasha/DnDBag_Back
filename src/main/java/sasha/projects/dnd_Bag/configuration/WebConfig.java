package sasha.projects.dnd_Bag.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")//Указывает для каких маршрутов включон CORS, тут для всех сейчас.
                // "/spells/**" - вот такой вариант, по сути все запросы которые начинаються на spells будут обрабатыватсья.
                .allowedOrigins("http://localhost:5173")//Адрес Фронт(Реакт) приложения, мы указываем откуда будем принимать запросы на наш сервер.
                // Это буквально значит что клиент в лице фронт приложения на порте 5173 может отправлять запросы на сервер бека 8080
                .allowedMethods("GET","POST","PUT","DELETE")//Какие методы HTTP мы будем обрабатывать
                .allowedHeaders("*")//Разрешаем любыае заголовки в запросах(тут лучше почиатьь дополнительно про них)
                .allowCredentials(true);//разрешение куков, если они есть и нужны
    }
}
