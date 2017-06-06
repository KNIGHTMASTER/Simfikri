package id.co.telkomsigma.etc.ui.operator.config;

import id.co.telkomsigma.etc.data.ApplicationConstant;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Configuration
@Import({BatchConfiguration.class})
@ComponentScan(ApplicationConstant.BASE_PACKAGE)
@EnableTransactionManagement
@EntityScan(basePackages = ApplicationConstant.BASE_PACKAGE)
@EnableJpaRepositories(basePackages = ApplicationConstant.BASE_PACKAGE)
public class AppConfiguration {
    /*@Bean
    public ParamCardPanelMaster paramCardPanelMaster(){
        ParamCardPanelMaster paramCardPanelMaster = new ParamCardPanelMaster();
        paramCardPanelMaster.setMainFrame(new MainFrame());
        paramCardPanelMaster.setDesktopPaneMain(new DesktopPaneMain());
        return paramCardPanelMaster;
    }*/
}
