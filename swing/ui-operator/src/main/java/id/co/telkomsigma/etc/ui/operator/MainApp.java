package id.co.telkomsigma.etc.ui.operator;

import id.co.telkomsigma.etc.ui.operator.component.view.frame.MainFrame;
import id.co.telkomsigma.etc.ui.operator.component.view.splash.SplashScreen;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
public class MainApp {
    /**
     * Application main() method.
     *
     * Uses the fluent {@link SpringApplicationBuilder} to create and run the
     * {@link SpringApplication} object.
     *
     * The options specified:
     *
     * <ul>
     * <li>headless(false) - allow AWT classes to be instantiated</li>
     * <li>web(false) - prevents the bundling of Tomcat or other Web components
     * </ul>
     *
     * Execution is picked up by the {@link Runner} class, which implements
     * {@link CommandLineRunner}.
     *
     * @param args
     */
    public static void main(String[] args) {
        new SpringApplicationBuilder(MainApp.class)
                .headless(false)
                .web(false)
                .run(args);
    }

    /**
     * Creates the {@link MainFrame} object and returns it.
     *
     * This @Bean could have been replaced by a @Component annotation being
     * added to the {@link MainFrame} class.
     *
     * @return the application window
     */
    @Bean
    public MainFrame frame() {
        return new MainFrame();
    }
    
    @Bean
    public SplashScreen splashScreen(){
        return new SplashScreen();
    }
}