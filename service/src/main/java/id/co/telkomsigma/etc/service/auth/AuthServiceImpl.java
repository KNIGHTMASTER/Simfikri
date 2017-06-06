package id.co.telkomsigma.etc.service.auth;

import id.co.telkomsigma.etc.dao.UserDAO;
import id.co.telkomsigma.etc.data.security.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class AuthServiceImpl implements IAuthService{

    @Autowired
    UserDAO userDAO;
    
    @Override
    public int login(String p_Code, String p_Password) {
        int result = 0;
        List<User> users = userDAO.authenticateUser(p_Code, p_Password);
        if (users.size() == 1){
            result = 1;
        }
        return result;
    }

}
