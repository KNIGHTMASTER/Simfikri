package com.tamam.simfikri.core.service.ftp;

/**
 *
 * @author Ladies Man
 */
public interface IFTPConnection {

    void contractConnection();
    
    /**
     * 1 = connected
     * 0 = not connected
     * @return 
     */
    int isConnected();
}
