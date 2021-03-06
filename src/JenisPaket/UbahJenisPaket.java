/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JenisPaket;

import MainMenu.MainMenu;
import connection.DBConnect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author putri ramadani rais
 */
public class UbahJenisPaket extends javax.swing.JFrame {

    /**
     * Creates new form UbahJenisPaket
     */
    
    DBConnect connection = new DBConnect();
    private DefaultTableModel model;
    String ID;
    String nama;
    String est;
    String harga;
    
    public UbahJenisPaket() {
        initComponents();
        
         //membuat tabel model
        model = new DefaultTableModel();
        
        //menambahkan table model ke table
        tblDataDepartemen.setModel(model);
        
        //memanggil method addColumn dan method loadData
        addColomn();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnUbah = new javax.swing.JButton();
        txtharga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnKembali = new javax.swing.JButton();
        btnNavTambah = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDataDepartemen = new javax.swing.JTable();
        cmbEst = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Jenis Paket");

        jLabel2.setText("Nama Jenis Paket");

        jLabel4.setText("Estimasi");

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        jLabel5.setText("Harga");

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthargaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("UBAH JENIS PAKET");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnNavTambah.setText("Tambah");
        btnNavTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNavTambah, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(btnNavTambah)
                .addGap(130, 130, 130)
                .addComponent(btnKembali)
                .addGap(20, 20, 20))
        );

        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblDataDepartemen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Departemen", "Nama Departemen"
            }
        ));
        tblDataDepartemen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataDepartemenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDataDepartemen);

        cmbEst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "3", "7" }));

        jLabel6.setText("Hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnUbah)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbEst, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel6))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUbah)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addColomn() {
        model.addColumn("ID Jenis Paket");
        model.addColumn("Nama Jenis Paket");
        model.addColumn("Estimasi");
        model.addColumn("Harga");
    }
    
    public void loadData() {
        // menghapus seluruh data ditamp
        model.getDataVector().removeAllElements();
        
        // memberi tahu data telah kosong
        model.fireTableDataChanged();
        
        try {
           
            connection.stat = connection.conn.createStatement();
            String query = "SELECT * FROM JenisPaket";
            connection.result = connection.stat.executeQuery(query);
            
            // lakukan perbaris data
            while (connection.result.next()) {
                 Object[] obj = new Object[4];
                obj[0] = connection.result.getString("jns_id");
                obj[1] = connection.result.getString("jns_nama");
                obj[2] = connection.result.getString("jns_est");
                obj[3] = connection.result.getString("jns_harga");
                model.addRow(obj);
            }
            connection.stat.close();
            connection.result.close();
        } catch (Exception e) {
            System.out.println("Terjadi error saat load data Jenis Paket: " + e);
        }
    }
    
    public void clear() {
        txtid.setText("");
        txtNama.setText("");
        cmbEst.setSelectedItem("");
        txtharga.setText("");
    }
    
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ID = txtid.getText();
        nama = txtNama.getText();
        est = cmbEst.getSelectedItem().toString();
        harga = txtharga.getText();

        try {

            String query = "UPDATE JenisPaket SET jns_nama=?, jns_est=?, jns_harga=? WHERE jns_id=?";
            connection.pstat = connection.conn.prepareStatement(query);
            connection.pstat.setString(1, nama);
            connection.pstat.setString(2, est);
            connection.pstat.setString(3, harga);
            connection.pstat.setString(4, ID);

            connection.pstat.executeUpdate();
            connection.result.close();

            loadData();
            JOptionPane.showMessageDialog(this, "Ubah data Jenis Paket berhasil");
            clear();
        }
        catch (Exception e) {
            System.out.println("Terjadi error saat load data jenis paket: " + e);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnNavTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavTambahActionPerformed
        TambahJenisPaket dpt = new TambahJenisPaket();
        dpt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNavTambahActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        //menghapus seluruh data ditamp
        model.getDataVector().removeAllElements();

        //memberi tahu data telah kosong
        model.fireTableDataChanged();

        try{
            connection.stat = connection.conn.createStatement();
            String query = "SELECT * FROM JenisPaket WHERE jns_id LIKE '%" +
            txtid.getText() + "%'";
            connection.result = connection.stat.executeQuery(query);
            //lakukan perbaris data
            while(connection.result.next()){
                Object[] obj = new Object[4];
                obj[0] = connection.result.getString("jns_id");
                obj[1] = connection.result.getString("jns_nama");
                obj[2] = connection.result.getString("jns_est");
                obj[3] = connection.result.getString("jns_harga");
                model.addRow(obj);
            }
            //jika di table tidak ada data yg dicari
            if(model.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Data Jenis Paket tidak ditemukan");
            }
            connection.stat.close();
            connection.result.close();
        }
        catch(Exception e){
            System.out.println("Terjadi error saat load Data Jenis Paket: "+e);
        }
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        //menghapus seluruh data ditamp
        model.getDataVector().removeAllElements();

        //memberi tahu data telah kosong
        model.fireTableDataChanged();

        try{
            connection.stat = connection.conn.createStatement();
            String query = "SELECT * FROM JenisPaket WHERE jns_id LIKE '%" +
            txtid.getText() + "%'";
            connection.result = connection.stat.executeQuery(query);
            //lakukan perbaris data
            while(connection.result.next()){
                Object[] obj = new Object[4];
                obj[0] = connection.result.getString("jns_id");
                obj[1] = connection.result.getString("jns_nama");
                obj[2] = connection.result.getString("jns_est");
                obj[3] = connection.result.getString("jns_harga");
                model.addRow(obj);
            }
            //jika di table tidak ada data yg dicari
            if(model.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Data Jenis Paket tidak ditemukan");
            }
            connection.stat.close();
            connection.result.close();
        }
        catch(Exception e){
            System.out.println("Terjadi error saat load Data Jenis Paket: "+e);
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblDataDepartemenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataDepartemenMouseClicked
        int i = tblDataDepartemen.getSelectedRow();

        txtid.setText((String) model.getValueAt(i, 0));
        txtNama.setText((String) model.getValueAt(i, 1));
        cmbEst.setSelectedItem((String) model.getValueAt(i, 2));
        txtharga.setText((String) model.getValueAt(i, 3));
    }//GEN-LAST:event_tblDataDepartemenMouseClicked

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        char enter = evt.getKeyChar();
            if(!Character.isLetter(enter) && !Character.isISOControl(enter) && !Character.isWhitespace(enter)){
                evt.consume();
                
            }  
    }//GEN-LAST:event_txtNamaKeyTyped

    private void txthargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyTyped
        char enter = evt.getKeyChar();
        if(!Character.isDigit(enter)){
            evt.consume();
        } 
    }//GEN-LAST:event_txthargaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UbahJenisPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UbahJenisPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UbahJenisPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UbahJenisPaket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UbahJenisPaket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnNavTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDataDepartemen;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
