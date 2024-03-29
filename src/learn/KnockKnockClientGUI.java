/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KnockKnockClientGUI.java
 *
 * Created on Mar 20, 2012, 3:28:58 PM
 */

package learn;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gautamsumu
 */
public class KnockKnockClientGUI extends javax.swing.JFrame {

    /** Creates new form KnockKnockClientGUI */

    Socket kkSocket = null;
    PrintWriter out = null;
    BufferedReader in = null;
    String fromServer;
    String fromUser;

    public KnockKnockClientGUI() {
        initComponents();
        portField.requestFocusInWindow();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        portField = new javax.swing.JTextField();
        serverPortLabel = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        interactionField = new javax.swing.JTextArea();
        inputTextField = new javax.swing.JTextField();
        separator = new javax.swing.JSeparator();
        menuBar = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BASIC APPLICATION EXAMPLE");
        setBackground(new java.awt.Color(101, 184, 237));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Bitstream Charter", 1, 10));

        start.setFont(new java.awt.Font("DejaVu Sans", 1, 13));
        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        portField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        serverPortLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 13)); // NOI18N
        serverPortLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serverPortLabel.setText("Server Port");

        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        interactionField.setColumns(20);
        interactionField.setEditable(false);
        interactionField.setRows(5);
        interactionField.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                interactionFieldCaretUpdate(evt);
            }
        });
        scrollPanel.setViewportView(interactionField);

        inputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTextFieldActionPerformed(evt);
            }
        });

        file.setText("File");
        menuBar.add(file);

        help.setText("Help");
        menuBar.add(help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(start)
                        .addGap(67, 67, 67)
                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(serverPortLabel)
                        .addGap(20, 20, 20)))
                .addGap(73, 73, 73)
                .addComponent(stop)
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(separator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(start)
                        .addComponent(stop))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serverPortLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        try {
                // TODO add your handling code here:
                int port = Integer.parseInt(portField.getText());
                interactionField.setText("");
                kkSocket = new Socket("", port);
                out = new PrintWriter(kkSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(kkSocket.getInputStream()));
                portField.setText("");
                inputTextField.setText("");
                inputTextField.requestFocusInWindow();
                fromServer = in.readLine();
                writeToTextArea("Server: " + fromServer +"\n");
                
        } catch (IOException ex) {
            Logger.getLogger(KnockKnockClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startActionPerformed

    private void interactionFieldCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_interactionFieldCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_interactionFieldCaretUpdate

    private void inputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTextFieldActionPerformed
        try {
            // TODO add your handling code here:
            fromUser = inputTextField.getText();
            if (fromUser != null) {
                writeToTextArea("Client: " + fromUser + "\n");
                out.println(fromUser);
                inputTextField.setText("");
            }
            fromServer = in.readLine();
            if (fromServer != null) {
                writeToTextArea("Server: " + fromServer + "\n");
                if (fromServer.equals("Bye.")) {
                    stop();
                }
            }
            inputTextField.requestFocusInWindow();
        } catch (IOException ex) {
            Logger.getLogger(KnockKnockClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_inputTextFieldActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        try {
            out.close();
            in.close();
            kkSocket.close();
            writeToTextArea("\n" + "Disconnected..." + "\n");
            System.exit(1);
        } catch (IOException ex) {
            Logger.getLogger(KnockKnockClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KnockKnockClientGUI().setVisible(true);
            }
        });
    }

    private void writeToTextArea(String s){
        interactionField.append(s);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu file;
    private javax.swing.JMenu help;
    private javax.swing.JTextField inputTextField;
    private javax.swing.JTextArea interactionField;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField portField;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSeparator separator;
    private javax.swing.JLabel serverPortLabel;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    private void stop() {
        try {
            out.close();
            in.close();
            kkSocket.close();
            writeToTextArea("\n" + "Disconnected..." + "\n");
        } catch (IOException ex) {
            Logger.getLogger(KnockKnockClientGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}