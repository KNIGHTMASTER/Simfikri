package id.co.telkomsigma.etc.ui.operator.component.locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class SimpleMessageSource {

    @Autowired
    MessageSource messageSource;

    private String key;

    public String getMessage() throws Exception{
        return messageSource.getMessage(key, null, Locale.ENGLISH);
    }

    public String getMessage(String p_Key) throws Exception{
        return messageSource.getMessage(p_Key, null, Locale.ENGLISH);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
