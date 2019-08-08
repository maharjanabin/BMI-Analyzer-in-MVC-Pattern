package bmi.view;

import bmi.controller.BMIController;
import bmi.controller.IView;
import bmi.model.BMIModel;
import bmi.model.Update;
import bmi.model.data.Record;
import java.sql.SQLException;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BMIView extends javax.swing.JFrame implements IView, Observer {
    
    //attributes
    BMIModel m;
    BMIController c;
    String msg;
    Boolean flag = false;
    
    //creates new BMIView
    public BMIView(BMIModel m, BMIController c) {
        
        super("BMI Analyser");
        initComponents();
        disableNext();
        disablePrevious();
        setVisible(true);
        setSize(500,400);
        setResizable(false);
        
        this.c = c;
        
        m.addObserver(this);
       
    }
    
    //Observer interface implementation
    @Override
    public void update(Observable obs, Object obj){
        
        Update update = (Update) obj;
        Record r = update.getRecord();
        String msg = update.getMessage();
        
        if(r == null){
            nextButton.setEnabled(false);
            previousButton.setEnabled(false);
            subjectTextField.setText("");
            heightTextField.setText("");
            weightTextField.setText("");
            bmiTextField.setText("");
            categoryTextField.setText("");
            messageTextArea.setText(" There are no records! \n Please try again!");
            return;
        }
        
        subjectTextField.setText("" + r.getSubjectID());
        heightTextField.setText("" + r.getHeight());
        weightTextField.setText("" + r.getWeight());
        bmiTextField.setText("" +  r.getBmi());
        categoryTextField.setText("" + r.getCategory());
        messageTextArea.setText(msg);
        
    }//end of override method update
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        browseLabel = new javax.swing.JLabel();
        subjectLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        bmiLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        heightTextField = new javax.swing.JTextField();
        weightTextField = new javax.swing.JTextField();
        bmiTextField = new javax.swing.JTextField();
        categoryTextField = new javax.swing.JTextField();
        messagesLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        allRecordsButton = new javax.swing.JButton();
        recordsInRangeButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        lowerRangeTextField = new javax.swing.JTextField();
        upperRangeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        browseLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        browseLabel.setText("Browse");

        subjectLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subjectLabel.setText("Subject");

        heightLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        heightLabel.setText("Height (m)");

        weightLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        weightLabel.setText("Weight (kg)");

        bmiLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bmiLabel.setText("BMI");

        categoryLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        categoryLabel.setText("Category");

        messagesLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        messagesLabel.setText("Messages");

        nextButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        previousButton.setText("Previous");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        allRecordsButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        allRecordsButton.setText("All Records");
        allRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allRecordsButtonActionPerformed(evt);
            }
        });

        recordsInRangeButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        recordsInRangeButton.setText("Records In Range");
        recordsInRangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordsInRangeButtonActionPerformed(evt);
            }
        });

        calculateButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        calculateButton.setText("Calculate BMI");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane1.setViewportView(messageTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(browseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(messagesLabel)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nextButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculateButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allRecordsButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(subjectLabel)
                                            .addComponent(heightLabel)
                                            .addComponent(weightLabel)
                                            .addComponent(bmiLabel)
                                            .addComponent(categoryLabel))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(categoryTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(subjectTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                                .addComponent(heightTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(weightTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bmiTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recordsInRangeButton)
                                .addGap(18, 18, 18)
                                .addComponent(lowerRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(upperRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browseLabel)
                    .addComponent(messagesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subjectLabel)
                            .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightLabel)
                            .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bmiLabel)
                            .addComponent(bmiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryLabel)
                            .addComponent(categoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previousButton)
                        .addComponent(nextButton)))
                .addGap(37, 37, 37)
                .addComponent(allRecordsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordsInRangeButton)
                    .addComponent(lowerRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upperRangeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculateButton)
                    .addComponent(exitButton))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allRecordsButtonActionPerformed

        c.browseAllRecords();
    }//GEN-LAST:event_allRecordsButtonActionPerformed

    private void recordsInRangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordsInRangeButtonActionPerformed
        
        int lower;
        int upper;
        
        //calling method to check the lower and upper bounds
        int check = validatingInputs(getLowerRangeTextField(), getUpperRangeTextField());
        
        //switch case for different cases of inputs from user
        switch(check){
            case 0:
                break;
            case 1:
                lower = 0;
                upper = Integer.parseInt(getUpperRangeTextField());
                c.browseRecordsInRange(lower, upper);
                break;
            case 2:
                lower = Integer.parseInt(getLowerRangeTextField());
                upper = lower;
                c.browseRecordsInRange(lower, upper);
                break;
            case 3:
                lower = Integer.parseInt(getLowerRangeTextField());
                upper = Integer.parseInt(getUpperRangeTextField());
                c.browseRecordsInRange(lower, upper);
                break;    
        }
    }//GEN-LAST:event_recordsInRangeButtonActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        
        try {
            c.updateAllRecords();
        } catch (SQLException ex) {
            Logger.getLogger(BMIView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_calculateButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        
        c.nextRecord();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        
        c.previousRecord();
    }//GEN-LAST:event_previousButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        try {
            c.closeConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BMIView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        
        nextButton.setEnabled(false);
        previousButton.setEnabled(false);
        subjectTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        bmiTextField.setText("");
        categoryTextField.setText("");
        messageTextArea.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allRecordsButton;
    private javax.swing.JLabel bmiLabel;
    private javax.swing.JTextField bmiTextField;
    private javax.swing.JLabel browseLabel;
    private javax.swing.JButton calculateButton;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lowerRangeTextField;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JLabel messagesLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JButton recordsInRangeButton;
    private javax.swing.JLabel subjectLabel;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTextField upperRangeTextField;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JTextField weightTextField;
    // End of variables declaration//GEN-END:variables
    
    //method to display message if there are no records 
    //within the range of bmi the user input
    @Override
    public void display(String s){
        
        this.msg = s;
        clear();
        messageTextArea.setText(msg);
    }//end of override method display
    
    //method to browse the records 
    //by enabling next and previous button
    @Override
    public void browsing(boolean flag){
       if(flag==true){
           enableNext();
           enablePrevious();
       }
    }// end of override method browsing
    
    //methods for enabling and disabling Next and Previous Buttons
    public void enableNext(){
        
        nextButton.setEnabled(true);
    }
    
    public void disableNext(){
        
        nextButton.setEnabled(false);
    }
    
    public void enablePrevious(){
        
        previousButton.setEnabled(true);
    }
    
    public void disablePrevious(){
        
        previousButton.setEnabled(false);
    }
    
    //getter for upper bound and lower bound of BMI
    public String getLowerRangeTextField() {
        return lowerRangeTextField.getText();
    }

    public String getUpperRangeTextField() {
        return upperRangeTextField.getText();
    }
    
    public void clear(){
        
        nextButton.setEnabled(false);
        previousButton.setEnabled(false);
        subjectTextField.setText("");
        heightTextField.setText("");
        weightTextField.setText("");
        bmiTextField.setText("");
        categoryTextField.setText("");
        messageTextArea.setText("");
    }// end of method clear
    
    public void showMessageDialog(String s1, String s2){
        
        JOptionPane.showMessageDialog(this, s1, s2, JOptionPane.PLAIN_MESSAGE);
    }//end of method showMessageDialog
    
    //method for validating the inputs for getting the records in range
    //return 0 means break 
    //return 1 means there is no input in lower bound of bmi
    //return 2 means there is no input in upper bound of bmi
    //return 3 means the given inputs for range of bmi is ok
    public int validatingInputs(String lower, String upper){
        
        String lowerbound = lower;
        String upperbound = upper;
        
        if(("".equals(lowerbound)) && ("".equals(upperbound))){
            
           clear();
           messageTextArea.setText("Please Enter the inputs for range of bmi");
           return 0;
        }
        else if(lowerbound.equals("")){
            lower=null;
            return 1;
        }
        else if(upperbound.equals("")){
            upper = lower;
            return 2;
        }
        else if(Integer.parseInt(lowerbound)>Integer.parseInt(upperbound)){
            
            clear();
            messageTextArea.setText(" Please enter lower bound of bmi \n smaller than the upper bound \n of bmi");
            return 0;  
        }
        else{
           return 3; 
        }
        
    }//end of method validatingInputs
}
