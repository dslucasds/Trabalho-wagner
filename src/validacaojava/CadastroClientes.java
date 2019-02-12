/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacaojava;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroClientes extends javax.swing.JPanel {
    
    String salvar = "";
    
    public CadastroClientes() {
        initComponents();
        //pro box por os estados aq
        boxEstados.addItem("AC");
        boxEstados.addItem("AL");
        boxEstados.addItem("AP");
        boxEstados.addItem("AM");
        boxEstados.addItem("BA");
        boxEstados.addItem("CE");
        boxEstados.addItem("DF");
        boxEstados.addItem("ES");
        boxEstados.addItem("GO");
        boxEstados.addItem("MA");
        boxEstados.addItem("MT");
        boxEstados.addItem("MS");
        boxEstados.addItem("MG");
        boxEstados.addItem("PA");
        boxEstados.addItem("PB");
        boxEstados.addItem("PR");
        boxEstados.addItem("PE");
        boxEstados.addItem("RJ");
        boxEstados.addItem("RN");
        boxEstados.addItem("RS");
        boxEstados.addItem("RO");
        boxEstados.addItem("RR");
        boxEstados.addItem("SC");
        boxEstados.addItem("SE");
        boxEstados.addItem("TO");
        
        jNomeEmpresa.setText("");
        FormatedCnpj.setText("");
        jInscricaoEstadual.setText("");
        jCidade.setText("");
        FormatedCep.setText("");
        jBairro.setText("");
        jRua.setText("");
        jNumeroCasa.setText("");
        jEmail.setText("");
        formatedTelefone.setText("");
        FormatedCelu.setText("");
        
        cpfCliente.setText("");
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNomeEmpresa = new javax.swing.JTextField();
        ButtonEnviar = new javax.swing.JButton();
        boxEstados = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cpfCliente = new javax.swing.JFormattedTextField();
        FormatedCelu = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        FormatedCnpj = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jInscricaoEstadual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FormatedCadastroDay = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FormatedCep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jNumeroCasa = new javax.swing.JFormattedTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        formatedTelefone = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro de Empresas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Empresa:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cpf:");

        jNomeEmpresa.setText("nomeEmpresa");
        jNomeEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeEmpresaActionPerformed(evt);
            }
        });
        jNomeEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNomeEmpresaKeyPressed(evt);
            }
        });

        ButtonEnviar.setText("Salvar");
        ButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnviarActionPerformed(evt);
            }
        });

        boxEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Selecione)" }));
        boxEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });

        try {
            FormatedCelu.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormatedCelu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatedCeluActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CNPJ:");

        try {
            FormatedCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormatedCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatedCnpjActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Inscrição Estadual");

        jInscricaoEstadual.setText("IncriçaoEstadual");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Data de Cadastro:");

        try {
            FormatedCadastroDay.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormatedCadastroDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatedCadastroDayActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cidade:");

        jCidade.setText("Cidade");
        jCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCidadeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("CEP:");

        try {
            FormatedCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FormatedCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormatedCepActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Bairro:");

        jBairro.setText("Bairro");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Rua:");

        jRua.setText("Rua");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Num:");

        jNumeroCasa.setText("num da casa");
        jNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumeroCasaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("E-mail:");

        jEmail.setText("e-mail");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Telefone:");

        try {
            formatedTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Celular:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jInscricaoEstadual))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(79, 79, 79)
                                .addComponent(FormatedCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FormatedCadastroDay))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FormatedCep))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonEnviar)
                            .addComponent(jNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FormatedCelu, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(formatedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jNomeEmpresa)
                        .addComponent(jLabel6)
                        .addComponent(FormatedCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(FormatedCadastroDay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(FormatedCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(formatedTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FormatedCelu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonEnviar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeEmpresaActionPerformed

    private void ButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnviarActionPerformed

        //dar os nomes pras variaveis e poder chmar aq
        boolean Validado = false;
        String strNomeEmpresa = jNomeEmpresa.getText();
        String strCnpj = FormatedCnpj.getText();
        String strIncris = jInscricaoEstadual.getText();
        String DayofToday = FormatedCadastroDay.getText();
        String Cidadex = jCidade.getText();
        String Cep = FormatedCep.getText();
        String bairroDjow = jBairro.getText();
        String ruaDjow = jRua.getText();
        String NumeroHouse = jNumeroCasa.getText();
        String elEmail = jEmail.getText();
        String teleCara = formatedTelefone.getText();  
        String strCelu = FormatedCelu.getText();
        
        String strCpf = cpfCliente.getText();

        //validar se os dados foram inseridos
        CPFValidator validator = new CPFValidator();
                //isso eh pra quando eh formatado ai da pra salvar de boas
                //pro cnpj nao dar pau
                strCnpj = strCnpj.replaceAll(" . ", "");
                strCnpj = strCnpj.replaceAll("/", "");
                strCnpj = strCnpj.replaceAll("-", "");
                //pra formatar a data atual
                DayofToday = DayofToday.replaceAll(" /", "");
                //pro telefone nao dar pau
                teleCara = teleCara.replaceAll("-", "");
                //pro Celular nao dar pau
                strCelu = strCelu.replaceAll("-", "");
                //pro Cep nao dar pau
                Cep = Cep.replaceAll("-", "");
                try {
        //validacção do nome da empresa pra ver se nao tem nada escrito
        if(strNomeEmpresa.trim().equals("")){//essa função trim eh pra tirar os espaços em brando
            JOptionPane.showMessageDialog(null, "informe o Nome da Empresa");
            Validado = false;
        }else if(strCnpj.trim().equals("")){//validação pra ver se nao tem nada no cnpj
            JOptionPane.showMessageDialog(null, "informe o CNPJ da Empresa");
            Validado = false;
        }else if(strIncris.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a Inscriçao Estadual");
            Validado = false;
        }else if(DayofToday.trim().equals("")){//dia do dia
            JOptionPane.showMessageDialog(null, "Informe a Data Atual");
            Validado = false;
        }else if(boxEstados.getSelectedItem().equals("(Selecione)")){
            JOptionPane.showMessageDialog(null, "Selecione o Estado");
            Validado = false;
        }else if(Cidadex.trim().equals("")){
            JOptionPane.showMessageDialog(null, "informe sua Cidade");
            Validado = false;
        }else if(Cep.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe seu Cep");
            Validado = false;
        }else if(bairroDjow.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe seu Bairro");
            Validado = false;
        }else if(ruaDjow.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a sua Rua");
            Validado = false;
        }else if(NumeroHouse.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o numero da sua casa");
            Validado = false;
        }else if(elEmail.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o seu E-mail");
            Validado = false;
        }else if(teleCara.trim().equals("") | teleCara.trim().equals("()")){
            JOptionPane.showMessageDialog(null, "Informe o seu telefone");
            Validado = false;
        }else if(strCelu.trim().equals("") | strCelu.trim().equals("()")){
            JOptionPane.showMessageDialog(null, "coloque um celular valido");
            Validado = false;
        }else{
            Validado =  true;
        }
	validator.assertValid(cpfCliente.getText());
        
} catch (InvalidStateException e) { // exception lançada quando o documento é inválido
	JOptionPane.showMessageDialog(null, "o cpf insrido eh invalido");
        Validado = false;
}

        //aqui eh so pra salvar no blovo de notas
        if(Validado){//vai ver se todos os dados foram validados certos e vai salvar
        this.salvar = " Nome da empresa: " + strNomeEmpresa + "CPNJ: " + strCnpj +"\n" ;
        ManipulacaoDeArquivo Man = new ManipulacaoDeArquivo("C:\\Users\\Suporte\\Desktop","cadastro.txt");
        String salvar = this.salvar;
        
        try {
            Man.gravar(salvar);
        } catch (IOException ex) {
            Logger.getLogger(CadastroClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //JOptionPane.showMessageDialog(null, boxSexo.getSelectedItem());
        JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }
    }//GEN-LAST:event_ButtonEnviarActionPerformed

    
    private void jNomeEmpresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNomeEmpresaKeyPressed
        
    }//GEN-LAST:event_jNomeEmpresaKeyPressed

    private void boxEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEstadosActionPerformed

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfClienteActionPerformed

    private void FormatedCeluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatedCeluActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatedCeluActionPerformed

    private void FormatedCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatedCnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatedCnpjActionPerformed

    private void FormatedCadastroDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatedCadastroDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatedCadastroDayActionPerformed

    private void jCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCidadeActionPerformed

    private void jNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumeroCasaActionPerformed

    private void FormatedCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormatedCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormatedCepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnviar;
    private javax.swing.JFormattedTextField FormatedCadastroDay;
    private javax.swing.JFormattedTextField FormatedCelu;
    private javax.swing.JFormattedTextField FormatedCep;
    private javax.swing.JFormattedTextField FormatedCnpj;
    private javax.swing.JComboBox<String> boxEstados;
    private javax.swing.JFormattedTextField cpfCliente;
    private javax.swing.JFormattedTextField formatedTelefone;
    private javax.swing.JTextField jBairro;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jInscricaoEstadual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNomeEmpresa;
    private javax.swing.JFormattedTextField jNumeroCasa;
    private javax.swing.JTextField jRua;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
