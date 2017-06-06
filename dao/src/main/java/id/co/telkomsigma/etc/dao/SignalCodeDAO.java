package id.co.telkomsigma.etc.dao;

import id.co.telkomsigma.etc.data.master.SignalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 5/29/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Repository
public interface SignalCodeDAO extends JpaRepository<SignalCode, Long>{
}
