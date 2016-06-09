package com.tamam.simfikri.core.service.auth;

import com.tamam.data.security.User;
import com.tamam.simfikri.core.repo.RepoUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class AuthServiceImpl implements IAuthService{

    @Autowired
    RepoUser repoUser;
    
    @Override
    public int login(String p_Code, String p_Password) {
        int result = 0;
        List<User> users = repoUser.authenticateUser(p_Code, p_Password);
        if (users.size() == 1){
            result = 1;
        }
        return result;
    }

}
