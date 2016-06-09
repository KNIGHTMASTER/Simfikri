package com.tamam.simfikri.core.repo;

import com.tamam.data.security.User;
import java.math.BigInteger;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface RepoUser extends PagingAndSortingRepository<User, BigInteger>{

    @Query("select a from User a where a.code = ?1 and a.password = ?2")
    List<User> authenticateUser(String p_Code, String p_Password);
    
}
