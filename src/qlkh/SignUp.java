/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import qlkh.entities.Users;
import qlkh.utils.Constants;

/**
 *
 * @author user
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    private static Locale locale;
    private static ResourceBundle bundle;
    public SignUp(Locale local) {
        this.locale = local;
        setResourceBundle(local);
        initComponents();
    }
    
    public void addBtnSignUpActionListener(ActionListener listener) {
        btnSignUp.addActionListener(listener);
    }
    //hàm set bundle khi truyền vào
    public void setResourceBundle(Locale local){
        bundle = ResourceBundle.getBundle("qlkh/utils/languages", local);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new keeptoo.KButton();
        jLabel10 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        lblErrFullname = new javax.swing.JLabel();
        lblErrEmail = new javax.swing.JLabel();
        lblErrPassword = new javax.swing.JLabel();
        lblErrUsername = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setGradientFocus(600);
        kGradientPanel1.setStartColor(new java.awt.Color(153, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setForeground(new java.awt.Color(102, 102, 102));
        txtFullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(bundle.getString("signUpFullname"));
        jLabel5.setToolTipText("");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(bundle.getString("signUpTitle4"));
        jLabel6.setToolTipText("");
        jLabel6.setAlignmentY(0.0F);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("EMAIL");
        jLabel7.setToolTipText("");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText(bundle.getString("signUpUsername"));
        jLabel8.setToolTipText("");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(bundle.getString("signUpPassword"));
        jLabel9.setToolTipText("");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setToolTipText("");
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        btnSignUp.setText(bundle.getString("signUpBtnContinue"));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setkBorderRadius(40);
        btnSignUp.setkEndColor(new java.awt.Color(0, 204, 204));
        btnSignUp.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        btnSignUp.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        btnSignUp.setkStartColor(new java.awt.Color(204, 0, 204));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(bundle.getString("signUpRePassword"));
        jLabel10.setToolTipText("");

        txtRePassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRePassword.setForeground(new java.awt.Color(102, 102, 102));
        txtRePassword.setToolTipText("");
        txtRePassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(12, 91, 160)));

        lblErrFullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrFullname.setForeground(new java.awt.Color(255, 0, 0));

        lblErrEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblErrPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrPassword.setForeground(new java.awt.Color(255, 0, 0));

        lblErrUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblErrUsername.setForeground(new java.awt.Color(255, 0, 0));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                        .addComponent(txtFullname)
                        .addComponent(lblErrFullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail)
                        .addComponent(lblErrEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsername)
                        .addComponent(lblErrUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword)
                        .addComponent(lblErrPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRePassword)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblErrPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kGradientPanel1.add(jPanel1);
        jPanel1.setBounds(590, 50, 480, 690);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(bundle.getString("signUpTitle3"));
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(50, 220, 370, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(bundle.getString("signUpTitle1"));
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(50, 60, 230, 40);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText(bundle.getString("signUpTitle2"));
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(50, 190, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/grap.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(30, 340, 390, 210);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText(bundle.getString("signUpLanguages"));
        jLabel11.setToolTipText("");
        kGradientPanel1.add(jLabel11);
        jLabel11.setBounds(940, 10, 80, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VI", "EN" }));
        kGradientPanel1.add(jComboBox1);
        jComboBox1.setBounds(1040, 10, 50, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1122, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

    /**
     * @param args the command line arguments
     */
    //hiển thị thông báo fullname
    public void showErrFullname(String message, Color color){
        lblErrFullname.setText(message);
        lblErrFullname.setForeground(color);
    }
    //hiển thị thông báo email
    public void showErrEmail(String message, Color color){
        lblErrEmail.setText(message);
        lblErrEmail.setForeground(color);
    }
    //hiển thị thông báo username
    public void showErrUsername(String message, Color color){
        lblErrUsername.setText(message);
        lblErrUsername.setForeground(color);
    }
    //hiển thị thông báo password
    public void showErrPassword(String message, Color color) {
        lblErrPassword.setText(message);
        lblErrPassword.setForeground(color);
    }
    //hiển thị thông báo repassword
    public void showErrRePassword(String message, Color color){
        jLabel16.setText(message);
        jLabel16.setForeground(color);
    }
    //hàm lấy dữ liệu
    public Users getData(){
        String fullname = txtFullname.getText();
        String email = txtEmail.getText();
        String password = String.valueOf(txtPassword.getPassword());
        String username = txtUsername.getText();
        String repassword = String.valueOf(txtRePassword.getPassword());
        Users users = new Users(fullname, username, password, email,repassword);
        return users;
    }
    //hàm check dữ liệu có bị trống hay không
    public boolean checkDataField(){
        return (txtFullname.getText().equals("") ==false  
                && txtFullname.getText() != null 
                && txtEmail.getText().equals("") ==false
                && txtEmail.getText() != null
                && txtUsername.getText().equals("") == false
                && txtUsername.getText() != null
                && String.valueOf(txtPassword.getPassword()).equals("") == false 
                && String.valueOf(txtPassword.getPassword()) != null
                && String.valueOf(txtRePassword.getPassword()).equals("") == false
                && String.valueOf(txtRePassword.getPassword()) != null);
    }
    //hàm show view
    public void showView(){
        this.setVisible(true);
    }
    public boolean validateData(){
        //tạo biến check
        boolean check = true;
        //lấy dữ liệu từ các ô text về
        Users users = this.getData();
        //tạo 2 thực thể để regex
        Pattern p;
        Matcher m;
        //chuỗi regex name: Tên không được có số và các kí tự đặc biệt
        String regex_name = "^[a-zA-Z\\s]+$";
        //chuổi regex email: đúng định dạng email
        String regex_email = "^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        //chuỗi regex username: phải lớn hơn 10 kí tự và nhỏ hơn 30 kí tự. 
        String regex_username = "^[\\w]{10,30}$";
        //chuôi regex password: Tối thiểu tám ký tự, ít nhất một ký tự hoa, một ký tự viết thường, một số và một ký tự đặc biệt
        String regex_password = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        
        
        //xử lý fullname
        p = Pattern.compile(regex_name);
        m = p.matcher(users.getName());
        if(!m.matches()){
            check = false;
            this.showErrFullname(Constants.SIGN_UP_ERR_FULL_NAME, Color.red);
        }
        else{
            this.showErrFullname(Constants.MSG_EMPTY, Color.yellow);
        }
        //xử lý email
        p = Pattern.compile(regex_email);
        m = p.matcher(users.getEmail());
        if(!m.matches()){
            check = false;
            this.showErrEmail(Constants.SIGN_UP_ERR_EMAIL, Color.red);
        }
        else{
            this.showErrEmail(Constants.MSG_EMPTY, Color.yellow);
        }
        //xử lý username
        p = Pattern.compile(regex_username);
        m = p.matcher(users.getUserName());
        if(!m.matches()){
            check = false;
            this.showErrUsername(Constants.SIGN_UP_ERR_USERNAME, Color.red);
        }
        else{
            this.showErrUsername(Constants.MSG_EMPTY, Color.yellow);
        }
        //xử lý password
        p = Pattern.compile(regex_password);
        m = p.matcher(users.getPassword());
        if(!m.matches()){
            check = false;
            this.showErrPassword(Constants.SIGN_UP_ERR_PASSWORD, Color.red);
        }
        else{
            this.showErrPassword(Constants.MSG_EMPTY, Color.yellow);
        }
        //xử lý repassword
        if(!users.getRePassword().equals(users.getPassword())){
            check = false;
            this.showErrRePassword(Constants.SIGN_UP_ERR_RE_PASSWORD, Color.red);
        }
        else{
            this.showErrRePassword(Constants.MSG_EMPTY, Color.yellow);
        }
        return check;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnSignUp;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblErrEmail;
    private javax.swing.JLabel lblErrFullname;
    private javax.swing.JLabel lblErrPassword;
    private javax.swing.JLabel lblErrUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
