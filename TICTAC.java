/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projects;

/**
 *
 * @author amito
 */
public class TICTAC extends javax.swing.JFrame {

    /**
     * Creates new form TICTAC
     */
    public TICTAC() {
        initComponents();
    }
    String a;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        L = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        L2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        L3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        L4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        L5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        L6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        L7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        L8 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        L9 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("By Amitoshdeep");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(65, 105, 225));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.orange);
        setMinimumSize(new java.awt.Dimension(300, 355));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC TOE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 260, -1));

        L.setFont(new java.awt.Font("Segoe UI", 2, 30)); // NOI18N
        L.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L.setText("Press \"Start\"");
        getContentPane().add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 36));

        L1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 59));
        L1.setVisible(false);

        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 80, 40));

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 60, 60));
        jButton2.setVisible(false);

        L2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 59));
        L2.setVisible(false);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 60, 60));
        jButton3.setVisible(false);

        L3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 59));
        L3.setVisible(false);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 60, 60));
        jButton4.setVisible(false);

        L4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 59));
        L4.setVisible(false);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 60, 60));
        jButton5.setVisible(false);

        L5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 59));
        L5.setVisible(false);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 60));
        jButton6.setVisible(false);

        L6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, 59));
        L6.setVisible(false);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, 60));
        jButton7.setVisible(false);

        L7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, 59));
        L7.setVisible(false);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, 60));
        jButton8.setVisible(false);

        L8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 59));
        L8.setVisible(false);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 60, 60));
        jButton9.setVisible(false);

        L9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        L9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, 59));
        L9.setVisible(false);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 60, 60));
        jButton10.setVisible(false);

        jButton11.setText("X");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 80, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    L.setText("X Turn");
    jButton1.setVisible(false);
    jButton2.setVisible(true);
    L1.setVisible(true);
    L2.setVisible(true);
    L3.setVisible(true);
    L4.setVisible(true);
    L5.setVisible(true);
    L6.setVisible(true);
    L7.setVisible(true);
    L8.setVisible(true);
    L9.setVisible(true);
    jButton3.setVisible(true);
    jButton4.setVisible(true);
    jButton5.setVisible(true);
    jButton6.setVisible(true);
    jButton7.setVisible(true);
    jButton8.setVisible(true);
    jButton9.setVisible(true);
    jButton10.setVisible(true);
    
    L1.setText("");
    L2.setText("");
    L3.setText("");
    L4.setText("");
    L5.setText("");
    L6.setText("");
    L7.setText("");
    L8.setText("");
    L9.setText("");
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L1.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L1.setText("O");
        L.setText("X Turn");
    }
    jButton2.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(A=="X" && D=="X" && G=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(A=="O" && D=="O" && G=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L2.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L2.setText("O");
        L.setText("X Turn");
    }
    jButton3.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(A=="X" && D=="X" && G=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(A=="O" && D=="O" && G=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
    else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L3.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L3.setText("O");
        L.setText("X Turn");
    }
    jButton4.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(A=="X" && D=="X" && G=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(A=="O" && D=="O" && G=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
    else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L4.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L4.setText("O");
        L.setText("X Turn");
    }
    jButton5.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
      
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
    else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L5.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L5.setText("O");
        L.setText("X Turn");
    }
    jButton6.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
    else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L6.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L6.setText("O");
        L.setText("X Turn");
    }
    jButton7.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
       
}
    else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L7.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L7.setText("O");
        L.setText("X Turn");
    }
    jButton8.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
        
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L8.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L8.setText("O");
        L.setText("X Turn");
    }
    jButton9.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
       
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
       
}
else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    a=L.getText();
    if(a=="X Turn"){
        L9.setText("X");
        L.setText("O Turn");
    }
    else if(a=="O Turn"){
        L9.setText("O");
        L.setText("X Turn");
    }
    jButton10.setVisible(false);
    
    //Winn
    String A,B,C,D,E,F,G,H,I;
    A=L1.getText();
    B=L2.getText();
    C=L3.getText();
    D=L4.getText();
    E=L5.getText();
    F=L6.getText();
    G=L7.getText();
    H=L8.getText();
    I=L9.getText();
    
    if((A=="X" && B=="X" && C=="X")||(B=="X" && E=="X"&&H=="X")||(A=="X" && D=="X" && G=="X")||(A=="X" && E=="X" && I=="X")||(C=="X" && F=="X" && I=="X")||(C=="X" && E=="X" && G=="X")||(D=="X" && E=="X" && F=="X")||(G=="X" && H=="X" && I=="X")){
	
	L.setText("Player X Wins");
	jButton1.setVisible(true);
       
}
else if((A=="O" && B=="O" && C=="O")||(B=="O" && E=="O"&&H=="O")||(A=="O" && D=="O" && G=="O")||(A=="O" && E=="O" && I=="O")||(C=="O" && F=="O" && I=="O")||(C=="O" && E=="O" && G=="O")||(D=="O" && E=="O" && F=="O")||(G=="O" && H=="O" && I=="O")){
	
	L.setText("Player O Wins");
	jButton1.setVisible(true);
        
}
else if ((A==""||B==""||C==""||D==""||E==""||F==""||G==""||H==""||I=="")){
    
    }
else{
    L.setText("Its a Draw");
    	jButton1.setVisible(true);
}
    
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    System.exit(WIDTH);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(TICTAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
