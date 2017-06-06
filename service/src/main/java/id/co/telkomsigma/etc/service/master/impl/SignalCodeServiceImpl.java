package id.co.telkomsigma.etc.service.master.impl;

import id.co.telkomsigma.etc.dao.SignalCodeDAO;
import id.co.telkomsigma.etc.data.master.SignalCode;
import id.co.telkomsigma.etc.service.master.ISignalCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class SignalCodeServiceImpl implements ISignalCodeService{

    @Autowired
    SignalCodeDAO signalCodeDAO;
    
    @Override
    public List<SignalCode> findAll() {
        return signalCodeDAO.findAll();
    }

    @Override
    public void insert(SignalCode p_DATA) {
        signalCodeDAO.save(p_DATA);
    }
}
