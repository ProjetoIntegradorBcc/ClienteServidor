/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import regraDeNegocio.ClienteRN;
import vo.ProfessorVO;

/**
 *
 * @author lucas
 */
public class ClienteVisao extends javax.swing.JFrame {

    /**
     * instanciacao de um objeto da classe ClienteRN.
     */
    private final ClienteRN crn = new ClienteRN();
    /**
     * Criação de um ArrayList de objeto ProfessorVO,
     * utilizado para armazenar os objetos que preenchem a jTable.
     */
    private ArrayList<ProfessorVO> listaProfessor = null;

    /**
     * Creates new form ClienteVisao.
     */
    public ClienteVisao() {
        initComponents();
        iniciaConexao();
    }
    /**
     * Definições de layout.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Aulas = new javax.swing.JTabbedPane();
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
        jPanel1 = new javax.swing.JPanel();
        IdSala = new javax.swing.JTextField();
        Descricao = new javax.swing.JTextField();
        Computadores = new javax.swing.JTextField();
        Recursos = new javax.swing.JTextField();
        Departamento = new javax.swing.JTextField();
        Capacidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpAulas = new javax.swing.JPanel();
        jpAlunos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aulas.setMaximumSize(new java.awt.Dimension(900, 600));
        Aulas.setMinimumSize(new java.awt.Dimension(900, 600));
        Aulas.setPreferredSize(new java.awt.Dimension(950, 600));
        Aulas.setRequestFocusEnabled(false);

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

        jLabel1.setText("Id Sala:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Número de computadores:");

        jLabel4.setText("Recursos didáticos:");

        jLabel5.setText("Departamento:");

        jLabel6.setText("Capacidade máxima:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recursos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Departamento)
                        .addComponent(Capacidade, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(Computadores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdSala, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 523, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Computadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Recursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jpSalas.add(jPanel1, java.awt.BorderLayout.CENTER);

        Aulas.addTab("Salas", jpSalas);

        jpAulas.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Aulas", jpAulas);

        jLabel7.setText("RA :");

        jLabel8.setText("Nome :");

        jLabel9.setText("Idade :");

        jLabel10.setText("Endereço :");

        jLabel11.setText("Curso :");

        jLabel12.setText("Ano de entrada :");

        jLabel13.setText("Disciplinas Matriculadas");

        jLabel14.setText("Disciplinas concluídas");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");

        jButton3.setText("Excluir");

        javax.swing.GroupLayout jpAlunosLayout = new javax.swing.GroupLayout(jpAlunos);
        jpAlunos.setLayout(jpAlunosLayout);
        jpAlunosLayout.setHorizontalGroup(
            jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlunosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlunosLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpAlunosLayout.createSequentialGroup()
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAlunosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(66, 66, 66)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpAlunosLayout.createSequentialGroup()
                                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlunosLayout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(260, 260, 260))))
            .addGroup(jpAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13)
                    .addGroup(jpAlunosLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAlunosLayout.setVerticalGroup(
            jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAlunosLayout.createSequentialGroup()
                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAlunosLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAlunosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpAlunosLayout.createSequentialGroup()
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(79, 79, 79)
                        .addGroup(jpAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        Aulas.addTab("Alunos", jpAlunos);

        getContentPane().add(Aulas, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Atribui ao objeto pvo os dados dos campos da tela.
     * Envia este objeto para a validacao pela regra de negocio.
     * caso algum campo esteja invalido,
     * uma mensagem será exibida informando o erro.
     * Caso todos estejam corretos, o objeto será enviado para o servidor.
     * @param evt clique do mouse
     */
    private void jButtonInserirProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInserirProfessorActionPerformed
        /*
            Criacao do objetto pvo.
        */
        ProfessorVO pvo = new ProfessorVO();

        /*
            Atribui ao objeto os valores dos campos JtextField
        */
        pvo.setRa(jTextFieldRAProfessor.getText());
        pvo.setNome(jTextFieldNomeProfessor.getText());
        pvo.setIdade(jTextFieldIdadeProfessor.getText());
        pvo.setEndereco(jTextFieldEnderecoProfessor.getText());
        pvo.setDepartamento(jTextFieldDepartamentoProfessor.getText());
        pvo.setDisciplinas(jTextAreaDisciplinasProfessor.getText());
        pvo.setPesquisa(jTextFieldPesquisaProfessor.getText());

        /*
            Envia o objeto para a regra de negocio.
            Recebe uma string com o código da resposta
            como definido no protocolo.
        */
        String resposta = (crn.insereProfessor(pvo));

        /*
            Informa ao usuario a resposta da regra de negocio.
            Caso a insercao seja efetuada com sucesso, a jTable sera atualizada.
        */
        switch (resposta) {
            case "0#":
                AtualizaTabela();
                JOptionPane.showMessageDialog(rootPane,
                        "Inserido com sucesso :)",
                        "Inserção no Banco de dados", WIDTH);
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
    }//GEN-LAST:event_jButtonInserirProfessorActionPerformed

    /**
     * Atualiza a jTable ao fazer uma pesquisa.
     * @param evt clique do mouse
     */
    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        AtualizaTabela();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void iniciaConexao() {

        String ip, porta, mensagemValidacaoConexao;
        mensagemValidacaoConexao = "Informe o ip do servidor";
        do {
            ip = JOptionPane.showInputDialog(mensagemValidacaoConexao);
            mensagemValidacaoConexao = crn.validaIP(ip);
            if (!mensagemValidacaoConexao.isEmpty()) {
                System.out.println("Informe o ip do servidor " + mensagemValidacaoConexao);
            }
        } while (!mensagemValidacaoConexao.isEmpty());
        mensagemValidacaoConexao = "Informe a porta do servidor";
        do {
            porta = JOptionPane.showInputDialog(mensagemValidacaoConexao);
            mensagemValidacaoConexao = crn.validaPorta(porta);
            if (!mensagemValidacaoConexao.isEmpty()) {
                System.out.println("Informe a porta do servidor " + mensagemValidacaoConexao);
            }
        } while (!mensagemValidacaoConexao.isEmpty());
        JOptionPane.showMessageDialog(rootPane, crn.validaConexao(ip, porta), "Conexao", WIDTH);
    }

    private void AtualizaTabela() {

        listaProfessor = crn.buscaProfessor();
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
    private javax.swing.JTextField Capacidade;
    private javax.swing.JTextField Computadores;
    private javax.swing.JTextField Departamento;
    private javax.swing.JTextField Descricao;
    private javax.swing.JTextField IdSala;
    private javax.swing.JTextField Recursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonEditarProfessor;
    private javax.swing.JButton jButtonExcluirProfessor;
    private javax.swing.JButton jButtonInserirProfessor;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCodigoProfessor;
    private javax.swing.JLabel jLabelDepartamentoProfessor;
    private javax.swing.JLabel jLabelDisciplinasProfessor;
    private javax.swing.JLabel jLabelEnderecoProfessor;
    private javax.swing.JLabel jLabelIdadeProfessor;
    private javax.swing.JLabel jLabelNomeProfessor;
    private javax.swing.JLabel jLabelPesquisaProfessor;
    private javax.swing.JLabel jLabelPesquisarProfessor;
    private javax.swing.JLabel jLabelRAProfessor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTablePesquisarProfessor;
    private javax.swing.JTextArea jTextAreaDisciplinasProfessor;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
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
