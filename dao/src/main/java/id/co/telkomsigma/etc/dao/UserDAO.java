package id.co.telkomsigma.etc.dao;

import id.co.telkomsigma.etc.data.security.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;

/**
 * 
 * @author <a href="fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Repository
public interface UserDAO extends PagingAndSortingRepository<User, BigInteger>{

    @Query("select a from User a where a.code = ?1 and a.password = ?2")
    List<User> authenticateUser(String p_Code, String p_Password);
    
}
