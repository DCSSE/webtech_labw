package kz.iitu.csse241.burkutbayeva;
import kz.iitu.csse241.burkutbayeva.config.ApplicationConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationConfigTest {
    @Test
    public void testLifecycleBeanCreation() {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class)) {
            ApplicationConfig.CustomLifecycleBean bean = context.getBean(ApplicationConfig.CustomLifecycleBean.class);
            assertNotNull(bean);
        }
    }
}
