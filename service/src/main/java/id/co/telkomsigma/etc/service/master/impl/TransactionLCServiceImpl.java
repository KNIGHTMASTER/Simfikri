package id.co.telkomsigma.etc.service.master.impl;

import id.co.telkomsigma.etc.dao.TransactionLCDAO;
import id.co.telkomsigma.etc.data.transaction.Transaction;
import id.co.telkomsigma.etc.service.master.ITransactionLCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created on 6/5/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class TransactionLCServiceImpl implements ITransactionLCService{

    @Autowired
    TransactionLCDAO transactionLCDAO;

    @Override
    public List<Transaction> findAll() {
        return transactionLCDAO.findAll();
    }

    @Override
    public void insert(Transaction p_DATA) {
        transactionLCDAO.save(p_DATA);
    }
}
