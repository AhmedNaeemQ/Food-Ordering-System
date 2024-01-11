
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author hp
 */
public class Login extends javax.swing.JPanel{

    /**
     * Creates new form Login
     */
    public Login() {
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        btnSignup = new com.k33ptoo.components.KButton();

        setOpaque(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(238, 9, 121));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 106, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon.png"))); // NOI18N

        kGradientPanel2.setkBorderRadius(30);
        kGradientPanel2.setkEndColor(new java.awt.Color(235, 244, 245));
        kGradientPanel2.setkStartColor(new java.awt.Color(235, 244, 245));
        kGradientPanel2.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 106, 0));
        jLabel2.setText("Login");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");

        txtUser.setActionCommand("<Not Set>");
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(238, 9, 121)));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(238, 9, 121)));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.setkEndColor(new java.awt.Color(69, 202, 255));
        btnLogin.setkHoverEndColor(new java.awt.Color(16, 55, 131));
        btnLogin.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnLogin.setkHoverStartColor(new java.awt.Color(16, 55, 131));
        btnLogin.setkStartColor(new java.awt.Color(255, 27, 107));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("New here?");

        btnSignup.setText("Signup");
        btnSignup.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUser)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showHome(){

            JFrame frame = new JFrame(" Food Ordering System - Home");
            
            Home home = new Home();
        
            // Add the panel to the frame
            frame.add(home);

            frame.setResizable(false); // Set if the frame is resizable
            frame.setUndecorated(true);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            
             // Dispose of the current window
            JFrame curr = (JFrame) SwingUtilities.getWindowAncestor(Login.this);
            curr.dispose();

            // Make the Home frame visible
            frame.setVisible(true);
    }
    
    private void checkCredentials(){
        if(txtUser.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(txtUser, "Enter Username!");
            return;
        }
        if(txtPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(txtUser, "Enter Password!");
            return;
        }
        if ("user".equals(txtUser.getText()) && "123".equals(txtPassword.getText())) {    
           showHome();
         } else {
             JOptionPane.showMessageDialog(txtUser, "Wrong Credentials!");
             txtUser.setText("");
             txtPassword.setText("");
             txtUser.grabFocus();
         }
    }

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        checkCredentials();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            checkCredentials();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            checkCredentials();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        
        // Create a new JFrame
        JFrame frame = new JFrame(" Food Ordering System - Signup");

        // Set up the frame
        frame.setSize(765, 530); // Set your preferred size
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setResizable(false); // Set if the frame is resizable
        //remove title bar
        frame.setUndecorated(true);
        
        Signup panel = new Signup();
        
         // Add the panel to the frame
        frame.add(panel);

        // Dispose of the current window
        JFrame curr = (JFrame) SwingUtilities.getWindowAncestor(Login.this);
        curr.dispose();
        
        // Make the frame visible
        frame.setVisible(true);
    }//GEN-LAST:event_btnSignupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btnLogin;
    private com.k33ptoo.components.KButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
