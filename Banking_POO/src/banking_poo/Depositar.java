package banking_poo;

import Classes.Depositos;
import Classes.Sessao;
import Classes.Utilizador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Depositar extends javax.swing.JFrame {

    private String utilizadorLogado;
    public Depositar() {
    initComponents(); // Para o GUI builder funcionar no NetBeans
}

    public Depositar(String utilizador) {
        initComponents();
        this.utilizadorLogado = utilizador;
    }
    
    String logUtilizador = Sessao.getUtilizador();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ttl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valorDeposito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        numConta = new javax.swing.JTextField();
        senha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Depositar");

        ttl.setText("Numero da conta");

        jLabel3.setText("senha");

        jLabel5.setText("Valor do Deposito");

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Depositar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttl)
                                    .addComponent(jLabel3)
                                    .addComponent(numConta, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(valorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                        .addComponent(ttl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numConta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
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
        try {
            FileWriter open = new FileWriter("Depositos.txt", true);
            BufferedWriter openning = new BufferedWriter(open);

            //LER PARA COMPARAR O NUMERO DA CONTA E CASO EXISTA, APENAS AUMENTAR 
            //O VALOR EXISTENTE
            FileReader abrir = new FileReader("Depositos.txt");
            BufferedReader ler = new BufferedReader(abrir);
            ArrayList<Depositos> list = new ArrayList();

            String[] lista;
            String linha = ler.readLine();

            while (linha != null) {
                lista = linha.split(";");

                int numConta = Integer.parseInt(lista[0]);
                String senha = lista[1];
                double saldo = Double.parseDouble(lista[2]);
                String historico = lista[3];
                list.add(new Depositos(numConta, senha, saldo, historico));
                linha = ler.readLine();
            }

            for (int i = 0; i < list.size(); i++) {
                Depositos validar = list.get(i);
                double getsaldo = validar.getSaldo();
                String saldoActual = String.valueOf(getsaldo);

                int numCont = Integer.parseInt(numConta.getText());
                String senhas = senha.getText();
                

                //verifica se o nr conta ja exixte.
                //se sim ele apenas adiciona ao valor ja existente na conta
                if(validar.getNumConta() == numCont) {

                    // Atualizar o valor do saldo
                    double novoDeposito = Double.parseDouble(valorDeposito.getText());
                    double saldoAtualizado = validar.getSaldo() + novoDeposito;
                    validar.setSaldo(saldoAtualizado);

                    // Atualizar a data do histórico
                    Date data = new Date();
                    validar.setHistorico(data.toString());

                    // Reescrever todo o arquivo com os dados atualizados
                    BufferedWriter reescrever = new BufferedWriter(new FileWriter("Depositos.txt", false));
                    for (Depositos d : list) {
                        reescrever.write(d.getNumConta() + ";" + d.getSenha() + ";" + d.getSaldo() + ";" + d.getHistorico());
                        reescrever.newLine();
                    }
                    reescrever.close();        

                    JOptionPane.showMessageDialog(null, "DEPÓSITO ATUALIZADO COM SUCESSO!");
                    
                    //gravacao da auditoria
                    BufferedWriter auditoria = new BufferedWriter(new FileWriter("Auditoria.txt", true));
                    Date agora = new Date();
                    String log = "Utilizador: " + logUtilizador + " fez um depósito de " + valorDeposito.getText()+".00 MZN"
                                 + " na conta " + numConta.getText() + " em " + agora.toString();
                    auditoria.write(log);
                    auditoria.newLine();
                    auditoria.close();


                    MainFrame menu = new MainFrame();
                    menu.setVisible(true);
                    this.hide();
                    break;

                } else {

                    //Get Current data
                    Date data = new Date();

                    String valor = valorDeposito.getText();
                    int valorDepisits = Integer.parseInt(valor);

                    for (int x = 1; x == x; x++) {
                        if (numConta.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "INSIRA O NUMERO DA CONTA");

                        } else if (senha == null) {
                            JOptionPane.showMessageDialog(null, "INSIRA A SENHA");
                            break;

                        } else if (valorDeposito.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "INSIRA O VALOR DO DEPOSITO");
                            break;

                        } else if (valorDepisits > 10 && valorDepisits < 1000000) {

                            JOptionPane.showMessageDialog(null, "CONCLUIDO");
                            openning.write(numConta.getText() + ";" + senha.getText() + ";" + valorDeposito.getText() + ";" + data);
                            openning.newLine();
                            openning.close();
                            open.close();
                                                        
                            //Auditoria
                            BufferedWriter auditoria = new BufferedWriter(new FileWriter("Auditoria.txt", true));
                            Date agora = new Date();
                            String log = "Utilizador: " + logUtilizador + " fez um depósito de " + valorDeposito.getText()
                                         + " na conta " + numConta.getText() + " em " + agora.toString();
                            auditoria.write(log);
                            auditoria.newLine();
                            auditoria.close();

                            MainFrame menu = new MainFrame();
                            menu.setVisible(true);
                            this.hide();
                            break;

                        } else {
                            JOptionPane.showMessageDialog(null, "O DEPOSITO FORA DOS PADROES[>10 E <1M]");
                            break;
                        }

                    }//fim da conducao de verificacao de conta exixstente ou antes do deposisto

                }

            }//filereader Loop
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainFrame menu = new MainFrame();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Depositar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Depositar(utilizadorLogado).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numConta;
    private javax.swing.JTextField senha;
    private javax.swing.JLabel ttl;
    private javax.swing.JTextField valorDeposito;
    // End of variables declaration//GEN-END:variables
}
