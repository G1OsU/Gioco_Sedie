import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MC
 * @version 12/01/23
 * Modificato da:
 * @author Giosu
 * @version 16/01/2024
 * usando il metodo "scrivi" si passa un parametro "a" di tipo String e lo scrive in append nel file.
 *
 *
 */

public class Scrittore implements Runnable{

    String nomeFile;

    public Scrittore(String nomeFile){
        this.nomeFile = nomeFile;
    }

    @Override
    public void run() {
        //scrivi("scrivi ciao");
    }
    /**
     * Scrive un file di testo usando la classe BufferedWriter
     */
    public void scrivi(String a){
        BufferedWriter br=null;

        try {
            //1) apro il file
            br = new BufferedWriter(
                    new FileWriter(nomeFile,true));
            //2) scrivo nel buffer
            br.write(a);
            br.write("\n");
            //3) svuoto il buffer e salvo nel file i dati
            br.flush();
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (br!=null)
                try {
                    //4)chiudo lo stream in uscita
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    }
}