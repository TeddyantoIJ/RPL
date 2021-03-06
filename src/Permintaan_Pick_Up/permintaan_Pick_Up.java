/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Permintaan_Pick_Up;

import MainMenu.MainMenu;
import connection.DBConnect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Polman
 */
public class permintaan_Pick_Up extends javax.swing.JFrame {

    /**
     * Creates new form permintaan_Pick_Up
     */
    private DefaultTableModel model;
    private DefaultTableModel model1;

    public permintaan_Pick_Up() {
        initComponents();

        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        tableDriver.setModel(model);
        tableDetail.setModel(model1);

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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rbTidak = new javax.swing.JRadioButton();
        rbAktif = new javax.swing.JRadioButton();
        rbSemua = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDriver = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDetail = new javax.swing.JTable();
        txtid_driver = new javax.swing.JLabel();
        txtnama_driver = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        txtid_barang = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pilih Driver");

        jLabel2.setText("Daftar Driver");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Status Pick Up Driver");

        rbTidak.setText("Tidak Aktif");
        rbTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTidakActionPerformed(evt);
            }
        });

        rbAktif.setText("Aktif");
        rbAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAktifActionPerformed(evt);
            }
        });

        rbSemua.setSelected(true);
        rbSemua.setText("Semua");
        rbSemua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSemuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbAktif)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTidak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbSemua)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAktif)
                    .addComponent(rbTidak)
                    .addComponent(rbSemua))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableDriver.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableDriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDriverMouseClicked(evt);
            }
        });
        tableDriver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableDriverKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableDriver);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBatalMouseClicked(evt);
            }
        });
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Driver");

        jLabel5.setText("Nama");

        tableDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tableDetail);

        txtStatus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        txtid_barang.setText("BRG-001");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBatal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSimpan))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtid_driver)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtnama_driver)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStatus)
                                        .addGap(163, 163, 163))))
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(182, 182, 182)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(txtid_barang)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBatal, btnSimpan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtid_driver))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtnama_driver))
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSimpan)
                                    .addComponent(btnBatal))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStatus)
                                .addGap(173, 173, 173))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid_barang)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void penjemputan() {
        Object[] options = {"Yaa, simpan",
            "Tidak, batal"};
        int n;
        penjemputan:
        {
            n = JOptionPane.showOptionDialog(this,
                    "Penjemputan barang akan dilakukan oleh :\n"
                    + "ID Driver  : " + txtid_driver.getText()
                    + "\nNama       : " + txtnama_driver.getText(),
                    "Pertanyaan",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[1]);
        }
        if (n == 0) {
            JOptionPane.showMessageDialog(this,
                    "Driver dipilih!");
            inputPickUp();
        } else if (n == 1) {
            batalPenjemputan();
        }
    }

    private void batalPenjemputan() {
        int n;
        Object[] options1 = {"Ya, batal",
            "Tidak, lanjutkan"};
        n = JOptionPane.showOptionDialog(this,
                "Yakin akan membatalkan pemilihan?",
                "Pertanyaan",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options1,
                options1[1]);

        if (n == 1) {
            penjemputan();
        }
    }
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:

        if (txtStatus.getText() == "" || txtStatus.getText().equals("Aktif")) {
            JOptionPane.showMessageDialog(this,
                    "Pilih Driver dengan benar!");
        } else {
            penjemputan();
        }


    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBatalMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnBatalMouseClicked

    private void rbAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAktifActionPerformed
        // TODO add your handling code here:
        rbTidak.setSelected(false);
        rbSemua.setSelected(false);
        if (rbAktif.isSelected() == true) {
            model.getDataVector().removeAllElements();

            model.fireTableDataChanged();

            try {
                DBConnect connection = new DBConnect();
                connection.stat = connection.conn.createStatement();
                String query = "select * from Driver";
                connection.result = connection.stat.executeQuery(query);

                while (connection.result.next()) {
                    Object[] obj = new Object[3];
                    obj[0] = connection.result.getString("ID_Staff");
                    obj[1] = connection.result.getString("nama_staff");
                    obj[2] = connection.result.getString("Status_pickup");

                    if (obj[2].equals("Aktif")) {
                        model.addRow(obj);
                    }
                }
                connection.stat.close();
                connection.result.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal111!\n" + e.toString());
            }
        } else {
            rbAktif.setSelected(true);
        }
    }//GEN-LAST:event_rbAktifActionPerformed

    private void inputPickUp() {
        DBConnect connection = new DBConnect();
        try {
            String query = "insert into detailPickUp values (?,?,'Belum')";
            connection.pstat = connection.conn.prepareStatement(query);
            connection.pstat.setString(1, txtid_barang.getText());
            connection.pstat.setString(2, txtid_driver.getText());

            connection.pstat.executeUpdate();
            connection.pstat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal!\n" + e.toString());
        }
    }
    private void rbTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTidakActionPerformed
        // TODO add your handling code here:
        rbAktif.setSelected(false);
        rbSemua.setSelected(false);
        if (rbTidak.isSelected() == true) {
            model.getDataVector().removeAllElements();

            model.fireTableDataChanged();

            try {
                DBConnect connection = new DBConnect();
                connection.stat = connection.conn.createStatement();
                String query = "select * from Driver";
                connection.result = connection.stat.executeQuery(query);

                while (connection.result.next()) {
                    Object[] obj = new Object[3];
                    obj[0] = connection.result.getString("ID_Staff");
                    obj[1] = connection.result.getString("nama_staff");
                    obj[2] = connection.result.getString("Status_pickup");

                    if (obj[2].equals("Tidak aktif")) {
                        model.addRow(obj);
                    }
                }
                connection.stat.close();
                connection.result.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal111!\n" + e.toString());
            }
        } else {
            rbTidak.setSelected(true);
        }
    }//GEN-LAST:event_rbTidakActionPerformed

    private void rbSemuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSemuaActionPerformed
        // TODO add your handling code here:
        rbTidak.setSelected(false);
        rbAktif.setSelected(false);
        if (rbSemua.isSelected() == true) {
            model.getDataVector().removeAllElements();

            model.fireTableDataChanged();

            try {
                DBConnect connection = new DBConnect();
                connection.stat = connection.conn.createStatement();
                String query = "select * from Driver";
                connection.result = connection.stat.executeQuery(query);

                while (connection.result.next()) {
                    Object[] obj = new Object[3];
                    obj[0] = connection.result.getString("ID_Staff");
                    obj[1] = connection.result.getString("nama_staff");
                    obj[2] = connection.result.getString("Status_pickup");

                    model.addRow(obj);

                }
                connection.stat.close();
                connection.result.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal111!\n" + e.toString());
            }
        } else {
            rbSemua.setSelected(true);
        }
    }//GEN-LAST:event_rbSemuaActionPerformed

    private void tableDriverKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableDriverKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_tableDriverKeyPressed

    private void tableDriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDriverMouseClicked
        // TODO add your handling code here:
        int i = tableDriver.getSelectedRow();
        if (i == 1) {
            return;
        }
        txtid_driver.setText((String) model.getValueAt(i, 0));
        txtnama_driver.setText((String) model.getValueAt(i, 1));
        txtStatus.setText((String) model.getValueAt(i, 2));
        
        fillTableDetail();
    }//GEN-LAST:event_tableDriverMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBatalActionPerformed
    public void fillTableDetail(){
            model1.getDataVector().removeAllElements();

            model1.fireTableDataChanged();

            try {
                DBConnect connection = new DBConnect();
                connection.stat = connection.conn.createStatement();
                String query = "select * from detailPickUp where ID_Staff = '"+txtid_driver.getText()+"'";
                connection.result = connection.stat.executeQuery(query);

                while (connection.result.next()) {
                    Object[] obj = new Object[3];
                    obj[0] = connection.result.getString("id_pemesanan");
                    obj[1] = "-";
                    obj[2] = connection.result.getString("keterangan");


                    model1.addRow(obj);

                }
                connection.stat.close();
                connection.result.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal111!\n" + e.toString());
            }
    }
    public void loadData() {
        model.getDataVector().removeAllElements();

        model.fireTableDataChanged();

        try {
            DBConnect connection = new DBConnect();
            connection.stat = connection.conn.createStatement();
            String query = "select * from Driver";
            connection.result = connection.stat.executeQuery(query);

            while (connection.result.next()) {
                Object[] obj = new Object[3];
                obj[0] = connection.result.getString("ID_Staff");
                obj[1] = connection.result.getString("nama_staff");
                obj[2] = connection.result.getString("Status_pickup");

                model.addRow(obj);

            }
            connection.stat.close();
            connection.result.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal111!\n" + e.toString());
        }
    }

    public void addColomn() {
        model.addColumn("ID Driver");
        model.addColumn("Nama Driver");
        model.addColumn("Status Pick Up");

        model1.addColumn("ID Barang");
        model1.addColumn("Tempat Penjemputan");
        model1.addColumn("Keterangan");
    }

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
            java.util.logging.Logger.getLogger(permintaan_Pick_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(permintaan_Pick_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(permintaan_Pick_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(permintaan_Pick_Up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permintaan_Pick_Up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbAktif;
    private javax.swing.JRadioButton rbSemua;
    private javax.swing.JRadioButton rbTidak;
    private javax.swing.JTable tableDetail;
    private javax.swing.JTable tableDriver;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtid_barang;
    private javax.swing.JLabel txtid_driver;
    private javax.swing.JLabel txtnama_driver;
    // End of variables declaration//GEN-END:variables
}
