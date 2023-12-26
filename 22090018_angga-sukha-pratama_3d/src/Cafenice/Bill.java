/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Cafenice;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */


public class Bill extends javax.swing.JFrame {
    
    private CameraQr cameraFrame;
    
      DefaultTableModel tableModel = new DefaultTableModel(
          new Object[][]{},
           new String[]{"No", "Nama", "Harga", "Quantity", "Seller", "Tanggal", "Total"} 
              
    );
         public void setCameraFrame(CameraQr cameraFrame) {
        this.cameraFrame = cameraFrame;
         }
    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
         tbltagihan.setModel(tableModel);
         loadDataFromFile();
         
          cameraFrame = new CameraQr();
    cameraFrame.setBillFrame(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltagihan = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();
        btngenerate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtalatgeneratescan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txthslprint = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Sellingto = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnscankamera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbltagihan.setFont(new java.awt.Font("Segoe UI Variable", 0, 14)); // NOI18N
        tbltagihan.setGridColor(new java.awt.Color(255, 255, 255));
        tbltagihan.setRowHeight(29);
        tbltagihan.setSelectionBackground(new java.awt.Color(153, 153, 153));
        tbltagihan.setShowHorizontalLines(true);
        jScrollPane2.setViewportView(tbltagihan);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 504, 240));

        btnprint.setBackground(new java.awt.Color(0, 204, 204));
        btnprint.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setText("Print");
        btnprint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel1.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 178, 34));

        btngenerate.setBackground(new java.awt.Color(0, 204, 204));
        btngenerate.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        btngenerate.setForeground(new java.awt.Color(255, 255, 255));
        btngenerate.setText("Generate barcode");
        btngenerate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });
        jPanel1.add(btngenerate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 160, 32));

        btnhapus.setBackground(new java.awt.Color(0, 204, 204));
        btnhapus.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("Hapus ");
        btnhapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        jPanel1.add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 128, 34));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BILL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        txtalatgeneratescan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalatgeneratescanActionPerformed(evt);
            }
        });
        jPanel1.add(txtalatgeneratescan, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 10, 200, 32));

        txthslprint.setColumns(20);
        txthslprint.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txthslprint.setRows(5);
        jScrollPane1.setViewportView(txthslprint);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 381, 290));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRINT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        Sellingto.setBackground(new java.awt.Color(255, 255, 255));
        Sellingto.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        Sellingto.setForeground(new java.awt.Color(255, 255, 255));
        Sellingto.setText("Selling");
        Sellingto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellingtoMouseClicked(evt);
            }
        });
        jPanel1.add(Sellingto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGOUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bill");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        btnscankamera.setText("Scan Kamera");
        btnscankamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscankameraActionPerformed(evt);
            }
        });
        jPanel1.add(btnscankamera, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1087, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  private int currentID = 1;
    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
    
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.showOpenDialog(null);

    File file = fileChooser.getSelectedFile();
    if (file != null) {
        try {
            BufferedImage image = ImageIO.read(file);
            Result result = readBarcode(image);
            if (result != null) {
                String barcodeData = result.getText();
                JOptionPane.showMessageDialog(this, "Scanned Barcode: " + barcodeData);
                String[] components = barcodeData.split("_");

                if (components.length == 7) {
                    String nama = components[1];
                    double harga = Double.parseDouble(components[3]);
                    int quantity = Integer.parseInt(components[4]);
                    String seller = components[2];
                    String tanggal = components[6];
                    double total = Double.parseDouble(components[5]);

                   
                    Object[] rowData = {
                        currentID++,
                        nama,
                        harga,
                        quantity,
                        seller,
                        tanggal,
                        total
                    };

                    tableModel.addRow(rowData);
                    saveDataToFile();                 } else {
                    JOptionPane.showMessageDialog(this, "Invalid barcode format.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Tidak ada Barcode yang ditemukan pada gambar.");
            }
        } catch (IOException | NotFoundException | NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Tidak dapat membaca barcode: " + ex.getMessage());
        }
    }
    }


   private Result readBarcode(BufferedImage image) throws NotFoundException {
        LuminanceSource source = new BufferedImageLuminanceSource(image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        Reader reader = new MultiFormatReader();
        try {
            return reader.decode(bitmap);
        } catch (ChecksumException ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FormatException ex) {
            Logger.getLogger(Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }//GEN-LAST:event_btngenerateActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
         int selectedRow = tbltagihan.getSelectedRow();
    if (selectedRow != -1) {
        tableModel.removeRow(selectedRow);
        saveDataToFile(); 
    } else {
        JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus.");
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
       printReceipt();
    }//GEN-LAST:event_btnprintActionPerformed

    private void txtalatgeneratescanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalatgeneratescanActionPerformed
         connectToBarcodeScanner();
    }//GEN-LAST:event_txtalatgeneratescanActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void SellingtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellingtoMouseClicked
    Selling sellpage = new Selling();
    sellpage.setVisible(true);
    this.dispose();         
    }//GEN-LAST:event_SellingtoMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    Login login = new Login();
    login.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void btnscankameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscankameraActionPerformed
cameraFrame.setVisible(true);  
                      
    }//GEN-LAST:event_btnscankameraActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sellingto;
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnscankamera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbltagihan;
    private javax.swing.JTextField txtalatgeneratescan;
    private javax.swing.JTextArea txthslprint;
    // End of variables declaration//GEN-END:variables

    
    private void loadDataFromFile() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.dat"))) {
            Vector<Vector<Object>> dataVector = (Vector<Vector<Object>>) ois.readObject();
            for (Vector<Object> rowData : dataVector) {
                tableModel.addRow(rowData.toArray());
            }
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    
    private void saveDataToFile() {
       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.dat"))) {
            oos.writeObject(tableModel.getDataVector());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void printReceipt() {
       StringBuilder receipt = new StringBuilder();
       receipt.append("============ CAFENICE RECEIPT ============\n\n");
       receipt.append(String.format("%-5s %-20s %-10s %-10s %-15s %-15s %-10s\n",
             "No", "Nama", "Harga", "Quantity", "Seller", "Tanggal", "Total"));

    for (int i = 0; i < tableModel.getRowCount(); i++) {
        Object[] rowData = new Object[tableModel.getColumnCount()];
        for (int j = 0; j < tableModel.getColumnCount(); j++) {
            rowData[j] = tableModel.getValueAt(i, j);
        }
        receipt.append(String.format("%-5s %-20s %-10s %-10s %-15s %-15s %-10s\n",
                rowData[0], rowData[1], rowData[2], rowData[3], rowData[4], rowData[5], rowData[6]));
    }

    double totalAmount = 0.0;
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        try {
            totalAmount += Double.parseDouble(tableModel.getValueAt(i, 6).toString());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Kesalahan menghitung jumlah total:"+ e.getMessage());
        }
    }
    receipt.append("\nTotal: " + totalAmount);

    
    txthslprint.setText(receipt.toString());
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
    String timestamp = dateFormat.format(new Date());
    String filePath = "D:\\Print/CafeniceReceipt_" + timestamp + ".txt";

    try (FileWriter fileWriter = new FileWriter(filePath)) {
        fileWriter.write(receipt.toString());
        JOptionPane.showMessageDialog(this, "Receipt simpan ke file: " + filePath, "Receipt", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error tidak dapat menyimpan receipt ke file: " + e.getMessage());
    }  
    }

    
    private void connectToBarcodeScanner() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(null);
        File file = fileChooser.getSelectedFile();
        if (file != null) {
            try {
                BufferedImage image = ImageIO.read(file);
                Result result = readBarcode(image);

                if (result != null) {
                    String barcodeData = result.getText();
                    JOptionPane.showMessageDialog(this, "Scanned Barcode: " + barcodeData);
                    String[] components = barcodeData.split("_");
                    if (components.length == 7) {
                        
                        String nama = components[1];
                        double harga = Double.parseDouble(components[3]);
                        int quantity = Integer.parseInt(components[4]);
                        String seller = components[2];
                        String tanggal = components[6];
                        double total = Double.parseDouble(components[5]);

                        Object[] rowData = {
                            currentID++, 
                            nama,
                            harga,
                            quantity,
                            seller,
                            tanggal,
                            total
                        };

                        tableModel.addRow(rowData);
                        saveDataToFile();
                    } else {
                        JOptionPane.showMessageDialog(this, "Invalid barcode format.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Tidak ada Barcode yang ditemukan pada gambar.");
                }
            } catch (IOException | NotFoundException | NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Tidak dapat membaca barcode: " + ex.getMessage());
            }
        }
        
    }


    void handleScannedResult(String result) {
       try {
            String[] components = result.split("_");

            if (components.length == 7) {
                String nama = components[1];
                double harga = Double.parseDouble(components[3]);
                int quantity = Integer.parseInt(components[4]);
                String seller = components[2];
                String tanggal = components[6];
                double total = Double.parseDouble(components[5]);

                Object[] rowData = {
                    currentID++,
                    nama,
                    harga,
                    quantity,
                    seller,
                    tanggal,
                    total
                };

                tableModel.addRow(rowData);
                saveDataToFile();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid barcode format.");
            }
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error processing scanned result: " + ex.getMessage());
        }
    }
    }
