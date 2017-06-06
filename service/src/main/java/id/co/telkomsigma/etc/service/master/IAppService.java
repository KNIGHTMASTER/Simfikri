package id.co.telkomsigma.etc.service.master;

import java.util.List;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public interface IAppService<DATA> {

    /*****************************INQUIRY********************************/
    
    /**
     * 
     * @return List<DATA>
     */
    List<DATA> findAll();


    /*****************************TRANSACTION********************************/

    /**
     *
     * @param p_DATA param to insert
     */
    void insert(DATA p_DATA);
}
