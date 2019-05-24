
package asiap_sport;

import javax.swing.table.DefaultTableModel;

public class Model_booking {

  
    private DefaultTableModel tabel = new DefaultTableModel();
    public Model_booking(){
        
        getTabel().addColumn("Lapangan");
        getTabel().addColumn("Durasi");
        getTabel().addColumn("Waktu");
        getTabel().addColumn("Nama");
        getTabel().addColumn("Team");
        getTabel().addColumn("No HP");
        getTabel().addColumn("Sisa Pembayaran");
        getTabel().addColumn("Harga");
       
    }
    
  


    /**
     * @return tabel
     */
    public DefaultTableModel getTabel() {
        return tabel;
    }

    /**
     * @param tabel the tabel to set
     */
    public void setTabel(DefaultTableModel tabel) {
        this.tabel = tabel;
    }
 
    
     
}

