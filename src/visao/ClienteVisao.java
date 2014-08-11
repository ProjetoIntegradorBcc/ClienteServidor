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
import vo.AulaVO;
import vo.DisciplinaVO;
import vo.ProfessorVO;
import vo.SalaVO;

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
    private ArrayList<AulaVO> listaAula = null;
    /**
     * Creates new form ClienteVisao.
     */
    public ClienteVisao() {
        initComponents();
        iniciaConexao();
        pesquisaCamposParaInserirComboBox();
    }
    /**
     * Definições de layout.
     */
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
        jPanel1 = new javax.swing.JPanel();
        IdSala = new javax.swing.JTextField();
        Computadores = new javax.swing.JTextField();
        Departamento = new javax.swing.JTextField();
        Capacidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btInserirSalas = new javax.swing.JButton();
        btEditarSalas = new javax.swing.JButton();
        btExcluirSalas = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Recursos = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Descricao = new javax.swing.JTextArea();
        jpAulas = new javax.swing.JPanel();
        jpProfessor1 = new javax.swing.JPanel();
        jLabelPesquisarProfessor1 = new javax.swing.JLabel();
        jLabelRAProfessor1 = new javax.swing.JLabel();
        jLabelNomeProfessor1 = new javax.swing.JLabel();
        jLabelIdadeProfessor1 = new javax.swing.JLabel();
        tPesquisarAula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableAula = new javax.swing.JTable();
        tNumAlunos = new javax.swing.JTextField();
        jLabelCodigoProfessor1 = new javax.swing.JLabel();
        btExcluirAula = new javax.swing.JButton();
        btInserirAula = new javax.swing.JButton();
        btEditarAula = new javax.swing.JButton();
        btPesquisarAula = new javax.swing.JButton();
        cbDisciplinaAula = new javax.swing.JComboBox();
        cbSalaAula = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tConteudo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Aulas.setMaximumSize(new java.awt.Dimension(900, 600));
        Aulas.setMinimumSize(new java.awt.Dimension(900, 600));
        Aulas.setPreferredSize(new java.awt.Dimension(950, 600));
        Aulas.setRequestFocusEnabled(false);

        jpAlunos.setLayout(new java.awt.BorderLayout());
        Aulas.addTab("Alunos", jpAlunos);

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

        btInserirSalas.setText("Inserir");
        btInserirSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirSalasActionPerformed(evt);
            }
        });

        btEditarSalas.setText("Editar");

        btExcluirSalas.setText("Excluir");

        Recursos.setColumns(20);
        Recursos.setRows(5);
        jScrollPane5.setViewportView(Recursos);

        Descricao.setColumns(20);
        Descricao.setRows(5);
        jScrollPane6.setViewportView(Descricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Departamento)
                                .addComponent(Capacidade, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                            .addComponent(Computadores, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdSala, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btInserirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btEditarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btExcluirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 475, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Computadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jpSalas.add(jPanel1, java.awt.BorderLayout.CENTER);

        Aulas.addTab("Salas", jpSalas);

        jpAulas.setLayout(new java.awt.BorderLayout());

        jpProfessor1.setPreferredSize(new java.awt.Dimension(950, 370));
        jpProfessor1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesquisarProfessor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPesquisarProfessor1.setText("Pesquisar");
        jpProfessor1.add(jLabelPesquisarProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        jLabelRAProfessor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRAProfessor1.setText("Sala Associada: ");
        jpProfessor1.add(jLabelRAProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, -1));

        jLabelNomeProfessor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNomeProfessor1.setText("Alunos Presentes: ");
        jpProfessor1.add(jLabelNomeProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, -1));

        jLabelIdadeProfessor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIdadeProfessor1.setText("Conteúdo Programático: ");
        jpProfessor1.add(jLabelIdadeProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        tPesquisarAula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor1.add(tPesquisarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 200, 30));

        tableAula.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tableAula);

        jpProfessor1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 290, 380));

        tNumAlunos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jpProfessor1.add(tNumAlunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 50, -1));

        jLabelCodigoProfessor1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCodigoProfessor1.setText("Disciplina Associada: ");
        jpProfessor1.add(jLabelCodigoProfessor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btExcluirAula.setText("Excluir");
        jpProfessor1.add(btExcluirAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 120, 50));

        btInserirAula.setText("Inserir");
        btInserirAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirAulaActionPerformed(evt);
            }
        });
        jpProfessor1.add(btInserirAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 120, 50));

        btEditarAula.setText("Editar");
        jpProfessor1.add(btEditarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 120, 50));

        btPesquisarAula.setText("Pesquisar");
        btPesquisarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarAulaActionPerformed(evt);
            }
        });
        jpProfessor1.add(btPesquisarAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 90, 30));

        jpProfessor1.add(cbDisciplinaAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jpProfessor1.add(cbSalaAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        tConteudo.setColumns(20);
        tConteudo.setRows(5);
        jScrollPane4.setViewportView(tConteudo);

        jpProfessor1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 320, 200));

        jpAulas.add(jpProfessor1, java.awt.BorderLayout.CENTER);

        Aulas.addTab("Aulas", jpAulas);

        getContentPane().add(Aulas, java.awt.BorderLayout.CENTER);

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
                atualizaTabelaProfessor();
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
        atualizaTabelaProfessor();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void btInserirAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirAulaActionPerformed
       
        AulaVO avo = new AulaVO();

        avo.setDisciplina(cbDisciplinaAula.getSelectedItem().toString());
        avo.setSala(cbSalaAula.getSelectedItem().toString());
        avo.setAlunosPresentes(tNumAlunos.getText());
        avo.setConteudoProgramatico(tConteudo.getText());
        
        String resposta = (crn.insereAula(avo));

        switch (resposta) {
            case "0#":
                atualizaTabelaProfessor();
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
    }//GEN-LAST:event_btInserirAulaActionPerformed

    private void btPesquisarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarAulaActionPerformed
        atualizaTabelaAula();
    }//GEN-LAST:event_btPesquisarAulaActionPerformed

    private void btInserirSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirSalasActionPerformed
        // TODO add your handling code here:
        SalaVO svo = new SalaVO();

        svo.setDescricao(Descricao.getText());
        svo.setNumComputadores(Computadores.getText());
        svo.setRecursos(Recursos.getText());
        svo.setDepartamento(Departamento.getText());
        svo.setCapacidade(Capacidade.getText());
        
        String resposta = (crn.insereSalas(svo));

        switch (resposta) {
            case "0#":
                atualizaTabelaProfessor();
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
    }//GEN-LAST:event_btInserirSalasActionPerformed

    private void pesquisaCamposParaInserirComboBox(){
        //Trocar quando pesquisaDisciplina e pesquisaSala estiverem funcionando
        //buscaDisciplina();
        cbDisciplinaAula.addItem("Escolha uma Disciplina");
        cbDisciplinaAula.addItem("Mod 2");
        cbDisciplinaAula.addItem("Análise de Algoritmos");
        cbDisciplinaAula.addItem("Teoria dos Grafos");
        cbDisciplinaAula.addItem("PLP");
        
        //buscaSala();
        cbSalaAula.addItem("Escolha uma Sala");
        cbSalaAula.addItem("C204");
        cbSalaAula.addItem("C202");
        cbSalaAula.addItem("L011");
        cbSalaAula.addItem("L007");
    }
    
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

    private void atualizaTabelaProfessor() {

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
    
    private void atualizaTabelaAula() {
        listaAula = crn.buscaAula();
        if (listaAula == null) {
            DefaultTableModel tabela = (DefaultTableModel) tableAula.getModel();
            tabela.setNumRows(0);
        } else {
            DefaultTableModel tabela = (DefaultTableModel) tableAula.getModel();
            tabela.setNumRows(0);
            for (AulaVO item : listaAula) {
                Object[] linha = {item.getDisciplina()+""+item.getSala()};
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
    private javax.swing.JTextArea Descricao;
    private javax.swing.JTextField IdSala;
    private javax.swing.JTextArea Recursos;
    private javax.swing.JButton btEditarAula;
    private javax.swing.JButton btEditarSalas;
    private javax.swing.JButton btExcluirAula;
    private javax.swing.JButton btExcluirSalas;
    private javax.swing.JButton btInserirAula;
    private javax.swing.JButton btInserirSalas;
    private javax.swing.JButton btPesquisarAula;
    private javax.swing.JComboBox cbDisciplinaAula;
    private javax.swing.JComboBox cbSalaAula;
    private javax.swing.JButton jButtonEditarProfessor;
    private javax.swing.JButton jButtonExcluirProfessor;
    private javax.swing.JButton jButtonInserirProfessor;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelCodigoProfessor;
    private javax.swing.JLabel jLabelCodigoProfessor1;
    private javax.swing.JLabel jLabelDepartamentoProfessor;
    private javax.swing.JLabel jLabelDisciplinasProfessor;
    private javax.swing.JLabel jLabelEnderecoProfessor;
    private javax.swing.JLabel jLabelIdadeProfessor;
    private javax.swing.JLabel jLabelIdadeProfessor1;
    private javax.swing.JLabel jLabelNomeProfessor;
    private javax.swing.JLabel jLabelNomeProfessor1;
    private javax.swing.JLabel jLabelPesquisaProfessor;
    private javax.swing.JLabel jLabelPesquisarProfessor;
    private javax.swing.JLabel jLabelPesquisarProfessor1;
    private javax.swing.JLabel jLabelRAProfessor;
    private javax.swing.JLabel jLabelRAProfessor1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
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
    private javax.swing.JPanel jpProfessor1;
    private javax.swing.JPanel jpSalas;
    private javax.swing.JTextArea tConteudo;
    private javax.swing.JTextField tNumAlunos;
    private javax.swing.JTextField tPesquisarAula;
    private javax.swing.JTable tableAula;
    // End of variables declaration//GEN-END:variables
}
