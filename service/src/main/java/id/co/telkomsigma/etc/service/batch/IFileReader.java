package id.co.telkomsigma.etc.service.batch;

/**
 * Created on Jun 5, 2017
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * 
 * @param <OUTPUT>
 */
public interface IFileReader<OUTPUT> {

    void read(String p_SourcePath);
    
    OUTPUT getOutput();
}
