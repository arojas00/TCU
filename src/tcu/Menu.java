/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tcu;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

/**
 *
 * @author Lenovo
 */
public class Menu extends javax.swing.JFrame {
    
    String[][] questions = {{"What is this sport/activity?",
                             "What is this sport/activity?",
                             "What is this sport/activity?",
                             "What is this sport/activity?"},
                            
                            {"_______ Randall like surfing? Yes, he ______ ",
                            "_______ your friends enjoy skate boarding? No, they _______",
                            "_______ Amanda love boxing? Yes, she ______",
                            "_______ you play baseball? No, I _______"},
                            
                            {"Cleats are an equipment used in _______",
                             "A helmet is an equipment used in _______",
                             "Goggles are an equipment used in _______",
                             "Gloves are an equipment used in _______"}};
    
    String[][][] options = {{{"Skate boarding","Cycling","Boxing","Swimming","Cycling"},
                             {"Running","Surfing","Gymnastics","Martial arts","Running"},
                             {"Baseball","Walking","Soccer","Boxing","Soccer"},
                             {"Surfing","Volleyball","Baseball","Gymnastics","Volleyball"}},
        
                            {{"Do – do","Does – do","Does – does","Do - Does","Does – does"},
                             {"Do – do not","Does – do","Does – does","Do – Does not","Do – do not"},
                             {"Do – do","Does – does","Do - Does","Does – do","Does – does"},
                             {"Does – does","Do – Does","Do – do not","Does – do not","Do – do not"}},
                            
                            {{"Skate boarding","Martial arts","Surfing","Soccer","Soccer"},
                             {"Cycling","Running","Gymnastics","Volleyball","Cycling"},
                             {"Baseball","Boxing","Swimming","Gymnastics","Swimming"},
                             {"Running","Boxing","Surfing","Swimming","Boxing"}}};
    
    boolean greenTurn = true, tab1Enabled = true, tab2Enabled = true, tab3Enabled = true;//, tab4Enabled = true;
    int index = 0, difficulty = 0, questionNumber = 0, points = 0, redPoints = 0, greenPoints = 0, lvlOneQuestions = 0, lvlTwoQuestions = 0, lvlThreeQuestions = 0;//, lvlFourQuestions = 0;
    ButtonGroup bg = new ButtonGroup();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        jButtonFinish.setVisible(false);
    }
    
    public void getSelectedOption(JRadioButton rbtn)
    {
        tab1.setBackground(Color.gray);
        tab2.setBackground(Color.gray);
        tab3.setBackground(Color.gray);
        //tab4.setBackground(Color.gray);
        
        LblQuestion.setIcon(null);
        
        if(lvlOneQuestions < questions[0].length){
            tab1Enabled = true;
            tab1.setBackground(new Color(204,204,255));
        }
        if(lvlTwoQuestions < questions[1].length){
            tab2Enabled = true;
            tab2.setBackground(new Color(204,204,255));
        }
        if(lvlThreeQuestions < questions[2].length){
            tab3Enabled = true;
            tab3.setBackground(new Color(204,204,255));
        }
//        if(lvlFourQuestions < questions[3].length){
//            tab4Enabled = true;
//            tab4.setBackground(new Color(204,204,255));
//        }
        
        if(rbtn.getText().equals(options[difficulty][questionNumber][4]))
        {
            if(greenTurn == true){
                greenPoints += points;
                LblGreenPts.setText("Green Team: " + greenPoints);
            } else {
                redPoints += points;
                LblRedPts.setText("Red Team: " + redPoints);
            }
            LblQuestion.setText("Correct!");
        }
        else{
            LblQuestion.setText("Incorrect.");
        }
        index++;
        enableRbuttons(false);
        if(index == questions.length*questions[0].length){
            jButtonFinish.setVisible(true);
        }else{
            if(greenTurn == true){
                greenTurn = false;
                LblTurn.setText("Turn: Red Team");
            } else{
                greenTurn = true;
                LblTurn.setText("Turn: Green Team");
            }
        }
    }

    // enable/ disable radiobuttons
    public void enableRbuttons(boolean yes_or_no)
    {
        jRadioButton1.setEnabled(yes_or_no);
        jRadioButton2.setEnabled(yes_or_no);
        jRadioButton3.setEnabled(yes_or_no);
        jRadioButton4.setEnabled(yes_or_no);
    }
    
    public void disableTabs()
    {
        tab1Enabled = false;
        tab2Enabled = false;
        tab3Enabled = false;
        //tab4Enabled = false;

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tab2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tab3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelQContainer = new javax.swing.JPanel();
        LblQuestion = new javax.swing.JLabel();
        LblTurn = new javax.swing.JLabel();
        LblGreenPts = new javax.swing.JLabel();
        LblRedPts = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButtonFinish = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        tab1.setBackground(new java.awt.Color(204, 204, 255));
        tab1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("100");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab2.setBackground(new java.awt.Color(204, 204, 255));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("200");

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab3.setBackground(new java.awt.Color(204, 204, 255));
        tab3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("300");

        javax.swing.GroupLayout tab3Layout = new javax.swing.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sports Trivia!");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcu/LOGO TCU-658 PROPUESTA 1(1) (1).png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcu/Indentificador_horizontal (1).png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tcu/firma-promocional-con-texto-celeste.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jPanelQContainer.setBackground(new java.awt.Color(204, 204, 204));

        LblQuestion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblQuestion.setText("Let's start!");

        LblTurn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LblTurn.setText("Turn: Green Team");

        LblGreenPts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LblGreenPts.setText("Green Team: 0");

        LblRedPts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        LblRedPts.setText("Red Team: 0");

        javax.swing.GroupLayout jPanelQContainerLayout = new javax.swing.GroupLayout(jPanelQContainer);
        jPanelQContainer.setLayout(jPanelQContainerLayout);
        jPanelQContainerLayout.setHorizontalGroup(
            jPanelQContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelQContainerLayout.createSequentialGroup()
                        .addComponent(LblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelQContainerLayout.createSequentialGroup()
                        .addComponent(LblTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblGreenPts, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblRedPts, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelQContainerLayout.setVerticalGroup(
            jPanelQContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelQContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelQContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTurn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelQContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblRedPts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblGreenPts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButtonFinish.setBackground(new java.awt.Color(255, 102, 0));
        jButtonFinish.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonFinish.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinish.setText("Finish");
        jButtonFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelQContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelQContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jButtonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tab1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab1MouseClicked
        if(tab1Enabled == true){
            enableRbuttons(true);
            bg.clearSelection();

            tab1.setBackground(Color.white);

            disableTabs();

            difficulty = 0;
            points = 100;
            LblQuestion.setText(questions[difficulty][lvlOneQuestions]);
            switch(lvlOneQuestions){
                case 0:
                    LblQuestion.setIcon(new ImageIcon(getClass().getResource("/tcu/1.jpg")));
                    break;
                case 1:
                    LblQuestion.setIcon(new ImageIcon(getClass().getResource("/tcu/2.jpg")));
                    break;
                case 2:
                    LblQuestion.setIcon(new ImageIcon(getClass().getResource("/tcu/3.jpg")));
                    break;
                case 3:
                    LblQuestion.setIcon(new ImageIcon(getClass().getResource("/tcu/4.jpg")));
                    break;
                default:
                    LblQuestion.setIcon(null);
            }
            jRadioButton1.setText(options[difficulty][lvlOneQuestions][0]);
            jRadioButton2.setText(options[difficulty][lvlOneQuestions][1]);
            jRadioButton3.setText(options[difficulty][lvlOneQuestions][2]);
            jRadioButton4.setText(options[difficulty][lvlOneQuestions][3]);
            questionNumber = lvlOneQuestions;
            lvlOneQuestions++;
        }
    }//GEN-LAST:event_tab1MouseClicked

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        if(tab2Enabled == true){
            enableRbuttons(true);
            bg.clearSelection();

            tab2.setBackground(Color.white);

            disableTabs();

            difficulty = 1;
            points = 200;
            LblQuestion.setText(questions[difficulty][lvlTwoQuestions]);
            jRadioButton1.setText(options[difficulty][lvlTwoQuestions][0]);
            jRadioButton2.setText(options[difficulty][lvlTwoQuestions][1]);
            jRadioButton3.setText(options[difficulty][lvlTwoQuestions][2]);
            jRadioButton4.setText(options[difficulty][lvlTwoQuestions][3]);
            questionNumber = lvlTwoQuestions;
            lvlTwoQuestions++;
        }
    }//GEN-LAST:event_tab2MouseClicked

    private void jButtonFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinishActionPerformed
        if(index == questions.length*questions[0].length)
        {
            if(greenPoints > redPoints)
            {
               LblQuestion.setText("The winner is: Green team!");
               jPanelQContainer.setBackground(Color.green);
            }
            else{
                if(redPoints > greenPoints)
                {
                   LblQuestion.setText("The winner is: Red team!");
                   jPanelQContainer.setBackground(new Color(255,102,102));
                }
                else{
                    LblQuestion.setText("It's a tie!");
                }
            }
        }
    }//GEN-LAST:event_jButtonFinishActionPerformed

    private void tab3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab3MouseClicked
        if(tab3Enabled == true){
            enableRbuttons(true);
            bg.clearSelection();
        
            tab3.setBackground(Color.white);

            disableTabs();

            difficulty = 2;
            points = 300;
            LblQuestion.setText(questions[difficulty][lvlThreeQuestions]);
            jRadioButton1.setText(options[difficulty][lvlThreeQuestions][0]);
            jRadioButton2.setText(options[difficulty][lvlThreeQuestions][1]);
            jRadioButton3.setText(options[difficulty][lvlThreeQuestions][2]);
            jRadioButton4.setText(options[difficulty][lvlThreeQuestions][3]);
            questionNumber = lvlThreeQuestions;
            lvlThreeQuestions++;
        }
    }//GEN-LAST:event_tab3MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        getSelectedOption(jRadioButton1);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        getSelectedOption(jRadioButton2);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        getSelectedOption(jRadioButton3);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        getSelectedOption(jRadioButton4);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblGreenPts;
    private javax.swing.JLabel LblQuestion;
    private javax.swing.JLabel LblRedPts;
    private javax.swing.JLabel LblTurn;
    private javax.swing.JButton jButtonFinish;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelQContainer;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    // End of variables declaration//GEN-END:variables
}
