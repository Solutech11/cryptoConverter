/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author Solutech
 */
public class converter extends javax.swing.JDialog {
public String input1;
public String dropdown1;
public String dropdown22;
public Integer input22;
public double BTC= 18112009.86;
public double Eth= 1335902.91;
public double Bnb= 180398.84;
public double tron = 26.55;
public double Sol = 48334.72;
    /**
     * Creates new form converter
     */
    public converter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        inputdrop = new javax.swing.JComboBox<>();
        dropdown2 = new javax.swing.JComboBox<>();
        convert = new javax.swing.JButton();
        inputer = new javax.swing.JSpinner();
        inputer2 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Currency convertor");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Crypto Converter");

        inputdrop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Etherium", "Smart Chain", "Tron", "Solana" }));
        inputdrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputdropActionPerformed(evt);
            }
        });

        dropdown2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitcoin", "Etherium", "Smart Chain", "Tron", "Solana" }));
        dropdown2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropdown2ActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        convert.setText("Convert");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        inputer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        inputer2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputer2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Group 1");

        jLabel3.setText("Anyawu Divine, Akhigbe Deborah, Ekwonu Theresa, Shamsudeen Mohammed, Adigwerex Soludo,Ezema David, Uligwe Benjamin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(inputer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(153, 153, 153)
                                    .addComponent(inputer2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(inputdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(32, 32, 32)
                                            .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(137, 137, 137)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputer2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convert, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputdropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputdropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputdropActionPerformed

    private void dropdown2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropdown2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dropdown2ActionPerformed

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertActionPerformed
//input1= inputer.getValue().toString();
//System.out.print(input1);    
//System.out.print(String.valueOf(inputdrop.getSelectedItem()));
//Bitcoin
//Etherium
//Smart Chain
//Tron
//Solana
String drop1= String.valueOf(inputdrop.getSelectedItem());
String drop2= String.valueOf(dropdown2.getSelectedItem());      // TODO add your handling code here:
if(drop1=="Bitcoin" && drop2=="Bitcoin"){
inputer2.setValue(inputer.getValue());
}else if(drop1=="Etherium" && drop2=="Etherium"){
inputer2.setValue(inputer.getValue());
}else if(drop1=="Smart Chain" && drop2=="Smart Chain"){
inputer2.setValue(inputer.getValue());
}else if(drop1=="Tron" && drop2=="Tron"){
inputer2.setValue(inputer.getValue());
}else if(drop1=="Solana" && drop2=="Solana"){
inputer2.setValue(inputer.getValue());
}else if(drop1=="Bitcoin" && drop2=="Etherium"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((BTC*cllect)/Eth);
}else if(drop1=="Etherium" && drop2=="Bitcoin"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Eth*cllect)/BTC);
}else if(drop1=="Bitcoin" && drop2=="Smart Chain"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((BTC*cllect)/Bnb);
}
else if(drop1=="Bitcoin" && drop2=="Tron"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((BTC*cllect)/tron);
}else if(drop1=="Bitcoin" && drop2=="Solana"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((BTC*cllect)/Sol);
}else if(drop1=="Etherium" && drop2=="Smart Chain"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Eth*cllect)/Bnb);
}else if(drop1=="Etherium" && drop2=="Tron"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Eth*cllect)/tron);
}else if(drop1=="Etherium" && drop2=="Solana"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Eth*cllect)/Sol);
}else if(drop1=="Smart Chain" && drop2=="Bitcoin"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Bnb*cllect)/BTC);
}else if(drop1=="Smart Chain" && drop2=="Etherium"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Bnb*cllect)/Eth);
}else if(drop1=="Smart Chain" && drop2=="Tron"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Bnb*cllect)/tron);
}else if(drop1=="Smart Chain" && drop2=="Solana"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Bnb*cllect)/Sol);
}else if(drop1=="Tron" && drop2=="Bitcoin"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((tron*cllect)/BTC);
}else if(drop1=="Tron" && drop2=="Etherium"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((tron*cllect)/Eth);
}else if(drop1=="Tron" && drop2=="Smart Chain"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((tron*cllect)/Bnb);
}else if(drop1=="Tron" && drop2=="Solana"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((tron*cllect)/Sol);
}else if(drop1=="Solana" && drop2=="Bitcoin"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Sol*cllect)/BTC);
}else if(drop1=="Solana" && drop2=="Smart Chain"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Sol*cllect)/Bnb);
}else if(drop1=="Solana" && drop2=="Etherium"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Sol*cllect)/Eth);
}else if(drop1=="Solana" && drop2=="Tron"){
int cllect = (int) inputer.getValue();
//double a= (BTC*inputer.getValue())/Eth;
inputer2.setValue((Sol*cllect)/tron);
}

    }//GEN-LAST:event_convertActionPerformed

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
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(converter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                converter dialog = new converter(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> dropdown2;
    private javax.swing.JComboBox<String> inputdrop;
    private javax.swing.JSpinner inputer;
    private javax.swing.JSpinner inputer2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
