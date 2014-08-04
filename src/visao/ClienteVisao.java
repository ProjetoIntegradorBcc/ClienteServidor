/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import regraDeNegocio.ClienteRN;
import vo.ProfessorVO;

/**
 *
 * @author lucas
 */
public class ClienteVisao extends javax.swing.JFrame {

    ClienteRN CRN = new ClienteRN();
    ArrayList<ProfessorVO> listaProfessor;

    /**
     * Creates new form ClienteVisao.
     */
    public ClienteVisao() {
        initComponents();
        iniciaConexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aulas = new javax.swing.JTabbedPane();
        jpAlunos = new javax.swing.JPanel();
        jpProfessor = new javax.swing.JPanel();
        jLabelPesquisarProfessor = new javax.swing.JLabel();
        jLabelRAProfessor = new javax.swing.JLabel();
        jLabelNomeProfessor = new javax.swing.JLabel();
        jLabelIdadeProfessor = new javax.swing.JLabel();
        jLabelEnderecoProfessor = new javax.swing.JLabel();
        jLabelDepartamentoProfessor = new javax.swing.JLabel();
        jLabelDisciplinasProfessor = new javax.swing.JLabel();
        jLabelPesquisaProfessor = new javax.swing.JLabel();
        jTextFieldEnderecoProfessor = new javax.swing.JTextField();
        jTextFieldCodigoProfessor = new javax.swing.JTextField();
        jTextFieldRAProfessor = new javax.swing.JTextField();
        jTextFieldPesquisarProfessor = new javax.swing.JTextField();
        jTextFieldIdadeProfessor = new javax.swing.JTextField();
        jTextFieldDepartamentoProfessor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisarProfessor = new javax.swing.JTable();
        jTextFieldNomeProfessor = new javax.swing.JTextField();
        jLabelCodigoProfessor = new javax.swing.JLabel();
        jTextFieldPesquisaProfessor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaDisciplinasProfessor = new javax.swing.JTextArea();
        jButtonExcluirProfessor = new javax.swing.JButton();
        jButtonInserirProfessor = new javax.swing.JButton();
        jButtonEditarProfessor = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jpDisciplinas = new javax.swing.JPanel();
        jpSalas = new javax.swing.JPanel();
        jpAulas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aulas.setMaximumSize(new java.awt.Dimension(900, 600));
        Aulas.setMinimumSize(new java.awt.Dimension(900, 600));
        Aulas.setPreferredSize(new java.awt.Dimension(950, 600));
        Aulas.setRequestFocusEnabled(false);

        jpAlunos.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Alunos", jpAlunos);

        jpProfessor.setMaximumSize(null);
        jpProfessor.setPreferredSize(new java.awt.Dimension(950, 370));
        jpProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesquisarProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPesquisarProfessor.setText("Pesquisar");
        jpProfessor.add(jLabelPesquisarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabelRAProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRAProfessor.setText("RA:");
        jpProfessor.add(jLabelRAProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 30, -1));

        jLabelNomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNomeProfessor.setText("Nome:");
        jpProfessor.add(jLabelNomeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 40, -1));

        jLabelIdadeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIdadeProfessor.setText("Idade:");
        jpProfessor.add(jLabelIdadeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, -1));

        jLabelEnderecoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEnderecoProfessor.setText("Endereço:");
        jpProfessor.add(jLabelEnderecoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, -1));

        jLabelDepartamentoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDepartamentoProfessor.setText("Departamento:");
        jpProfessor.add(jLabelDepartamentoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        jLabelDisciplinasProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelDisciplinasProfessor.setText("Disciplinas que ministra:");
        jpProfessor.add(jLabelDisciplinasProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, -1));

        jLabelPesquisaProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPesquisaProfessor.setText("Linhas de pesquisa:");
        jpProfessor.add(jLabelPesquisaProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 110, -1));

        jTextFieldEnderecoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldEnderecoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 350, -1));

        jTextFieldCodigoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldCodigoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 40, -1));

        jTextFieldRAProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldRAProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 150, -1));

        jTextFieldPesquisarProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldPesquisarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 200, 30));

        jTextFieldIdadeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldIdadeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 60, -1));

        jTextFieldDepartamentoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldDepartamentoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 350, -1));

        jTablePesquisarProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePesquisarProfessor);

        jpProfessor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 290, 380));

        jTextFieldNomeProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldNomeProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 350, -1));

        jLabelCodigoProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCodigoProfessor.setText("Código:");
        jpProfessor.add(jLabelCodigoProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextFieldPesquisaProfessor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor.add(jTextFieldPesquisaProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 350, -1));

        jTextAreaDisciplinasProfessor.setColumns(20);
        jTextAreaDisciplinasProfessor.setRows(5);
        jScrollPane3.setViewportView(jTextAreaDisciplinasProfessor);

        jpProfessor.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 350, -1));

        jButtonExcluirProfessor.setText("Excluir");
        jpProfessor.add(jButtonExcluirProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 120, 50));

        jButtonInserirProfessor.setText("Inserir");
        jButtonInserirProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInserirProfessorActionPerformed(evt);
            }
        });
        jpProfessor.add(jButtonInserirProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 120, 50));

        jButtonEditarProfessor.setText("Editar");
        jpProfessor.add(jButtonEditarProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 50));

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jpProfessor.add(jButtonPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 90, 30));

        Aulas.addTab("Professor", jpProfessor);

        jpDisciplinas.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Disciplinas", jpDisciplinas);

        jpSalas.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Salas", jpSalas);

        jpAulas.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Aulas", jpAulas);

        getContentPane().add(Aulas, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInserirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirProfessorActionPerformed
        ProfessorVO PVO = new ProfessorVO();

        PVO.setRa(jTextFieldRAProfessor.getText());
        PVO.setNome(jTextFieldNomeProfessor.getText());
        PVO.setIdade(jTextFieldIdadeProfessor.getText());
        PVO.setEndereco(jTextFieldEnderecoProfessor.getText());
        PVO.setDepartamento(jTextFieldDepartamentoProfessor.getText());
        PVO.setDisciplinas(jTextAreaDisciplinasProfessor.getText());
        PVO.setPesquisa(jTextFieldPesquisaProfessor.getText());

        String resposta = (CRN.insereProfessor(PVO));
        switch (resposta) {
            case "0#":
                JOptionPane.showMessageDialog(rootPane,
                        "Inserido com sucesso :)", "Inserção no Banco de dados", WIDTH);
                break;
            case "1#":
                JOptionPane.showMessageDialog(rootPane,
                        "Erro na insercao no Banco de dados",
                        "Inserção no Banco de dados", WIDTH);
                break;
            case "2#":
                JOptionPane.showMessageDialog(rootPane,
                        "Erro ao enviar o Datagrama",
                        "Transmissão do Datagrama", WIDTH);
                break;
            case "3#":
                JOptionPane.showMessageDialog(rootPane,
                        "Erro ao enviar o Datagrama - Tempo limite excedido",
                        "Transmissão do Datagrama", WIDTH);
                break;
            default:
                JOptionPane.showMessageDialog(rootPane,
                        "Erro inesperado: " + resposta,
                        "Insercao", WIDTH);
                break;
        }
        AtualizaTabela();
    }//GEN-LAST:event_jButtonInserirProfessorActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        AtualizaTabela();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void iniciaConexao() {

        String ip, porta, mensagemValidacaoConexao;
        mensagemValidacaoConexao = "Informe o ip do servidor";
        do {
            ip = JOptionPane.showInputDialog(mensagemValidacaoConexao);
            mensagemValidacaoConexao = CRN.validaIP(ip);
            if (!mensagemValidacaoConexao.isEmpty()) {
                System.out.println("Informe o ip do servidor " + mensagemValidacaoConexao);
            }
        } while (!mensagemValidacaoConexao.isEmpty());
        mensagemValidacaoConexao = "Informe a porta do servidor";
        do {
            porta = JOptionPane.showInputDialog(mensagemValidacaoConexao);
            mensagemValidacaoConexao = CRN.validaPorta(porta);
            if (!mensagemValidacaoConexao.isEmpty()) {
                System.out.println("Informe a porta do servidor " + mensagemValidacaoConexao);
            }
        } while (!mensagemValidacaoConexao.isEmpty());
        JOptionPane.showMessageDialog(rootPane, CRN.validaConexao(ip, porta), "Conexao", WIDTH);
    }

    private void AtualizaTabela() {

        listaProfessor = CRN.buscaProfessor();
        if (listaProfessor == null) {
            DefaultTableModel tabela = (DefaultTableModel) jTablePesquisarProfessor.getModel();
            tabela.setNumRows(0);
        } else {
            DefaultTableModel tabela = (DefaultTableModel) jTablePesquisarProfessor.getModel();
            tabela.setNumRows(0);
            for (ProfessorVO item : listaProfessor) {
                Object[] linha = {item.getNome()};
                tabela.addRow(linha);
            }
        }
    }

    private void RetornaCamposPesquisa(ArrayList<vo.ProfessorVO> lista) {

        DefaultTableModel model = (DefaultTableModel) jTablePesquisarProfessor.getModel();
        for (vo.ProfessorVO item : lista) {
            jTextFieldCodigoProfessor.setText(item.getCodigo());
            jTextFieldRAProfessor.setText(item.getRa());
            jTextFieldNomeProfessor.setText(item.getNome());
            jTextFieldIdadeProfessor.setText(item.getIdade());
            jTextFieldEnderecoProfessor.setText(item.getEndereco());
            jTextFieldDepartamentoProfessor.setText(item.getDepartamento());
            jTextAreaDisciplinasProfessor.setText(item.getDisciplinas());
            jTextFieldPesquisaProfessor.setText(item.getPesquisa());

        }
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
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteVisao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Aulas;
    private javax.swing.JButton jButtonEditarProfessor;
    private javax.swing.JButton jButtonExcluirProfessor;
    private javax.swing.JButton jButtonInserirProfessor;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabelCodigoProfessor;
    private javax.swing.JLabel jLabelDepartamentoProfessor;
    private javax.swing.JLabel jLabelDisciplinasProfessor;
    private javax.swing.JLabel jLabelEnderecoProfessor;
    private javax.swing.JLabel jLabelIdadeProfessor;
    private javax.swing.JLabel jLabelNomeProfessor;
    private javax.swing.JLabel jLabelPesquisaProfessor;
    private javax.swing.JLabel jLabelPesquisarProfessor;
    private javax.swing.JLabel jLabelRAProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePesquisarProfessor;
    private javax.swing.JTextArea jTextAreaDisciplinasProfessor;
    private javax.swing.JTextField jTextFieldCodigoProfessor;
    private javax.swing.JTextField jTextFieldDepartamentoProfessor;
    private javax.swing.JTextField jTextFieldEnderecoProfessor;
    private javax.swing.JTextField jTextFieldIdadeProfessor;
    private javax.swing.JTextField jTextFieldNomeProfessor;
    private javax.swing.JTextField jTextFieldPesquisaProfessor;
    private javax.swing.JTextField jTextFieldPesquisarProfessor;
    private javax.swing.JTextField jTextFieldRAProfessor;
    private javax.swing.JPanel jpAlunos;
    private javax.swing.JPanel jpAulas;
    private javax.swing.JPanel jpDisciplinas;
    private javax.swing.JPanel jpProfessor;
    private javax.swing.JPanel jpSalas;
    // End of variables declaration//GEN-END:variables
}
