package id.co.telkomsigma.etc.dao;

import id.co.telkomsigma.etc.data.master.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Repository
public interface PriceDAO extends JpaRepository<Price, Long>{
}
