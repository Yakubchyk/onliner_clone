package by.tms.onlinerclonec29onl;

import by.tms.onlinerclonec29onl.configuration.JdbcConfiguration;
import by.tms.onlinerclonec29onl.configuration.RootConfiguration;
import by.tms.onlinerclonec29onl.configuration.WebConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{RootConfiguration.class, WebConfiguration.class, JdbcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
