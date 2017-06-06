package id.co.telkomsigma.etc.service.master.impl;

import id.co.telkomsigma.etc.dao.PriceDAO;
import id.co.telkomsigma.etc.data.master.Price;
import id.co.telkomsigma.etc.service.master.IPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class PriceServiceImpl implements IPriceService{

    @Autowired
    PriceDAO priceDAO;
    
    @Override
    public List<Price> findAll() {
        return priceDAO.findAll();
    }

    @Override
    public void insert(Price p_DATA) {
        priceDAO.save(p_DATA);
    }
}
