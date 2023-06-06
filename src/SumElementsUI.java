// Name: Rahim
// Surname: Rzayev
/* Description: An application has been provided for summing even numbers, odd numbers, or both, displaying the result on a JTextArea.
Users must enter numbers in the TextField using the "Add" button.
Clicking the "Sums" button will compute the result, shown in the JTextArea.
To remove numbers or make changes, users can utilize the "Remove" button. The "List" button displays the added items on the JTextArea.
For a complete reset, the "Reset" button clears all added items and messages. 
Finally, the "Exit" button closes the application.
*/


//Import java classes. 
import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class SumElementsUI extends javax.swing.JFrame {

    // Declare list. 
    List<Integer> a = new ArrayList<>();

    // Declare global variables. 
    int sumOdd;
    int sumEven;
    int sumAll;

    public SumElementsUI() {
        initComponents();

        // Error label is not visible. 
        labelError.setVisible(false);
        labelError1.setVisible(false);

        // I added this code in order to change colour of application's background.
        getContentPane().setBackground(Color.yellow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldOutput = new javax.swing.JTextArea();
        btnExit = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        labelElements = new javax.swing.JLabel();
        txtboxElements = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        btnSums = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        labelError1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SumElements by Rahim");

        labelTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        labelTitle.setText("SUM ELEMENTS ");

        fieldOutput.setEditable(false);
        fieldOutput.setBackground(new java.awt.Color(204, 255, 204));
        fieldOutput.setColumns(20);
        fieldOutput.setRows(5);
        jScrollPane2.setViewportView(fieldOutput);

        btnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 0, 0));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        labelElements.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labelElements.setText("ENTER ARRAY ELEMENTS (POSITIVE INTS):");

        txtboxElements.setBackground(new java.awt.Color(0, 255, 255));
        txtboxElements.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        labelError.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError.setText("ERROR, PLEASE INPUT A POSTIVE INTEGER.");

        btnSums.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnSums.setText("SUMS");
        btnSums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumsActionPerformed(evt);
            }
        });

        btnList.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnList.setText("LIST");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        labelError1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        labelError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelError1.setText("ERROR, You have added a non-existent number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2)
                                    .addComponent(labelElements, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtboxElements, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSums, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnList, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelError1)
                                    .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelElements)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtboxElements, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(11, 11, 11)
                        .addComponent(btnSums)
                        .addGap(11, 11, 11)
                        .addComponent(btnRemove)
                        .addGap(11, 11, 11)
                        .addComponent(btnList)
                        .addGap(6, 6, 6)
                        .addComponent(btnReset)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelError1)
                        .addGap(8, 8, 8)
                        .addComponent(labelError))
                    .addComponent(btnExit))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        try {
            // This code clears added items from the outputField.
            fieldOutput.setText("");

            // Get value from textbox.
            String addElement = (txtboxElements.getText());
            // Convert string to int.
            int addElementAsInt = Integer.parseInt(addElement);

            // If input is a positive integer. 
            if (addElementAsInt > 0) {
                // Input is valid, error label is not visible.
                labelError.setVisible(false);
                labelError1.setVisible(false);

                // Add int to array.
                a.add(addElementAsInt);

                // Reset text box. 
                txtboxElements.setText("");
                //Puts focus back on elements text field. 
                txtboxElements.requestFocus();

                // Sort list. 
                Collections.sort(a);

                // List output. 
                fieldOutput.setText("INTEGER ADDED, LIST UPDATED:" + "\n"); // When you click "List" button, it shows this message on TextArea. 

                // List for loop. 
                for (int i = 0; i < a.size(); i++) {
                    fieldOutput.append(a.get(i) + "\n");
                }
            } else {
                // Input is invalid, display error message. 
                // Error label is visible. 
                labelError.setVisible(true);
                labelError1.setVisible(false);
                // Reset text box. 
                txtboxElements.setText("");
                //Puts focus back on elements text field. 
                txtboxElements.requestFocus();
            }
        } catch (Exception e) {

            // Input is invalid, display error message. 
            // Error label is visible. 
            labelError.setVisible(true);
            labelError1.setVisible(false);
            // Reset text box. 
            txtboxElements.setText("");
            //Puts focus back on elements text field. 
            txtboxElements.requestFocus();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed

        try {
            // Get value from textbox. 
            String removeElement = (txtboxElements.getText());
            // Convert string to int.
            int removeElementAsInt = Integer.parseInt(removeElement);
            // Find int position in list. 
            int index = Collections.binarySearch(a, removeElementAsInt);

            // If input is a positive integer. 
            if (index > -1) {
                // Input is valid, error label is not visible. 
                labelError.setVisible(false);
                labelError1.setVisible(false);
                // Removes int from array.
                a.remove(index);

                // Reset text box. 
                txtboxElements.setText("");
                // Puts focus back on elements text field. 
                txtboxElements.requestFocus();

                // Sort list.
                Collections.sort(a);

                fieldOutput.setText("INTEGER REMOVED, LIST UPDATED:" + "\n"); // When you click "Remove" button, it shows this message on TextArea. 

                // List for loop. 
                for (int i = 0; i < a.size(); i++) {
                    fieldOutput.append(a.get(i) + "\n");
                }
            } else {
                // Input is invalid, display error message. 
                // Error label is visible. 
                
                labelError1.setVisible(true);
                // Reset text box. 
                txtboxElements.setText("");
                //Puts focus back on elements text field. 
                txtboxElements.requestFocus();
            }
        } catch (Exception e) {
            // Input is invalid, display error message. 
            // Error label is visible. 
            
            labelError1.setVisible(true);
            // Reset text box. 
            txtboxElements.setText("");
            //Puts focus back on elements text field. 
            txtboxElements.requestFocus();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit program. 
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumsActionPerformed

        // Clear out the previous info from the outputField
        fieldOutput.setText("");

        // Odd and even sums for loop.
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                sumEven += a.get(i);
            } else {
                sumOdd += a.get(i);
            }
        }

        // All sums for loop. 
        for (int i = 0; i < a.size(); i++) {
            sumAll += a.get(i);
        }

        // Output sums. 
        fieldOutput.setText("SUM OF ALL INTEGERS: " + sumAll); // When you click "Sum" button, it shows this message on TextArea. 
        fieldOutput.append("\n" + "SUM OF EVEN INTEGERS: " + sumEven); // When you click "Sum" button, it shows this message on TextArea. 
        fieldOutput.setText(fieldOutput.getText() + "\n" + "SUM OF ODD INTEGERS: " + sumOdd); // When you click "Sum" button, it shows this message on TextArea. 
    }//GEN-LAST:event_btnSumsActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // Clear out the previous info from the outputField.
        fieldOutput.setText("");

        // Sort list. 
        Collections.sort(a);

        // List output. 
        fieldOutput.setText("INTEGERS LIST:" + "\n");
        // List for loop. 
        for (int i = 0; i < a.size(); i++) {
            fieldOutput.append(a.get(i) + "\n");
        }
    }//GEN-LAST:event_btnListActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        // Error label is not visible. 
        labelError.setVisible(false);

        // Reset text box. 
        txtboxElements.setText("");
        //Puts focus back on elements text field. 
        txtboxElements.requestFocus();
        // Clear out the previous info from the outputField.
        fieldOutput.setText("");

        // Clear array. 
        a.clear();
        fieldOutput.setText("RESET COMPLETE."); // When you click "Reset" button, it shows this message on TextArea. 
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(SumElementsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SumElementsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SumElementsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SumElementsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SumElementsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSums;
    private javax.swing.JTextArea fieldOutput;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelElements;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelError1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JTextField txtboxElements;
    // End of variables declaration//GEN-END:variables
}