package banking_poo;

import Classes.Sessao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date;
import javax.swing.JOptionPane;

public class CriarConta extends javax.swing.JFrame {

    public CriarConta() {
        initComponents();
    }
    String logUtilizador = Sessao.getUtilizador();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        numeroConta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tipoConta = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        numConta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Criar conta");

        numeroConta.setText("Numero da conta");

        jLabel3.setText("Tipo de conta");

        jLabel5.setText("ID Cliente");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Criar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tipoConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Tipo de Conta", "Conta corrente", "Conta prazo" }));
        tipoConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoContaActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numeroConta)
                                        .addComponent(jLabel3)
                                        .addComponent(tipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numConta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(98, 98, 98)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numeroConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoConta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        FileWriter open = new FileWriter("CentroContas.txt", true);
        BufferedWriter openning = new BufferedWriter(open); 
                
        //Get Current data
        Date data = new Date();
        
         String id = idCliente.getText();
         int idClient = Integer.parseInt(id);
        
    for(int x = 1; x == x; x++){
    if(numConta.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "INSIRA O NUMERO DA CONTA");    
        
        }else if(tipoConta == null){
             JOptionPane.showMessageDialog(null, "SELECIONE O TIPO DE CONTA"); 
             break;
                 
            }else if(idCliente.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "INSIRA O ID ");  
                  break;
                                
                    }else if(idClient != 0 && idClient > 0){
                  
                        JOptionPane.showMessageDialog(null, "CONCLUIDO");
                            openning.write(numConta.getText()+";"+tipoContas+";"+idCliente.getText()+";"+data);        
                            openning.newLine();
                            openning.close();
                            open.close();
                            
                            //Auditoria
                            BufferedWriter auditoria = new BufferedWriter(new FileWriter("Auditoria.txt", true));
                            Date agora = new Date();
                            String log = "Utilizador: " + logUtilizador + " criou a conta " + numConta.getText()
                                        + " do tipo Conta " + tipoContas + " em " + agora.toString();
                            auditoria.write(log);
                            auditoria.newLine();
                            auditoria.close();

                        MainFrame menu = new MainFrame();
                        menu.setVisible(true);
                        this.hide();
                        break; 
                          
        }else{
               JOptionPane.showMessageDialog(null, "OCORREU UM ERRO");
               break;
        }   
        }
            }catch(Exception e){
                
                }     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainFrame menu = new MainFrame();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tipoContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoContaActionPerformed
        // TODO add your handling code here:
        if(tipoConta.getSelectedIndex() == 1){
            tipoContas = "ContaCorrente";   
        }else if(tipoConta.getSelectedIndex() == 2){
            tipoContas = "ContaPrazo";
        }
    }//GEN-LAST:event_tipoContaActionPerformed
    String tipoContas;
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numConta;
    private javax.swing.JLabel numeroConta;
    private javax.swing.JComboBox<String> tipoConta;
    // End of variables declaration//GEN-END:variables
}
