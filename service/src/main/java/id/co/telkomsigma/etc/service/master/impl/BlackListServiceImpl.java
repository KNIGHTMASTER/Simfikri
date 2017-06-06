package id.co.telkomsigma.etc.service.master.impl;

import id.co.telkomsigma.etc.dao.BlackListDAO;
import id.co.telkomsigma.etc.data.master.BlackList;
import id.co.telkomsigma.etc.service.master.IBlackListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class BlackListServiceImpl implements IBlackListService{

    @Autowired
    BlackListDAO blackListDAO;
    
    @Override
    public List<BlackList> findAll() {
        return blackListDAO.findAll();
    }

    @Override
    public void insert(BlackList p_DATA) {
        blackListDAO.save(p_DATA);
    }

}
