package ui;


import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import model.location.City;
import model.location.Community;
import model.location.House;
import model.patient.Patient;
import model.patient.PatientDirectory;
import model.patient.PatientGenerator;
import model.person.Person;
import model.person.PersonDirectory;
import model.records.Encounter;
import model.records.EncounterHistory;
import model.records.VitalSigns;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bhavinbhatia
 */
public class NavFrame extends javax.swing.JFrame {

    /**
     * Creates new form NavFrame
     */
    
    Patient patient;
    PatientDirectory patientDirectory;
    Person person;
    PersonDirectory personDirectoryDifferentName;
    City city;
    Community community;
    House house;
    VitalSigns vitalSigns;
    Encounter encounter;
    EncounterHistory encounterHistory;
    

    public NavFrame() {
        initComponents();
       
        setSize(1000,800);
        
        PatientGenerator generator = new PatientGenerator();
        this.personDirectoryDifferentName = generator.getRandomPersonDirectory(20);
        this.patientDirectory = 
                generator.getRandomPatientDirectory(personDirectoryDifferentName,
                        10);
        
       
        Patient tempPatient = new Patient(123, 
                personDirectoryDifferentName.getPersons().get(0));
        this.patientDirectory.addPatient(tempPatient);
  
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        OptionPannel = new javax.swing.JPanel();
        btnAddVitals = new javax.swing.JButton();
        btnPatient = new javax.swing.JButton();
        btnViewPatients = new javax.swing.JButton();
        btnPerson = new javax.swing.JButton();
        btnAddEncounter = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        PanelWorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        OptionPannel.setBackground(new java.awt.Color(0, 153, 153));

        btnAddVitals.setText("Add Vitals");
        btnAddVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalsActionPerformed(evt);
            }
        });

        btnPatient.setText("Patient");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnViewPatients.setText("Search Patients");
        btnViewPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPatientsActionPerformed(evt);
            }
        });

        btnPerson.setText("Person");
        btnPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonActionPerformed(evt);
            }
        });

        btnAddEncounter.setText("Encounter History");
        btnAddEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEncounterActionPerformed(evt);
            }
        });

        jButton1.setText("Over view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OptionPannelLayout = new javax.swing.GroupLayout(OptionPannel);
        OptionPannel.setLayout(OptionPannelLayout);
        OptionPannelLayout.setHorizontalGroup(
            OptionPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OptionPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddEncounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(OptionPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OptionPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddVitals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewPatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OptionPannelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddEncounter, btnAddVitals, btnPatient, btnPerson, btnViewPatients, jButton1});

        OptionPannelLayout.setVerticalGroup(
            OptionPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OptionPannelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnPerson)
                .addGap(18, 18, 18)
                .addComponent(btnPatient)
                .addGap(18, 18, 18)
                .addComponent(btnViewPatients)
                .addGap(18, 18, 18)
                .addComponent(btnAddVitals)
                .addGap(18, 18, 18)
                .addComponent(btnAddEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        OptionPannelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddEncounter, btnAddVitals, btnPatient, btnPerson, btnViewPatients, jButton1});

        jSplitPane1.setLeftComponent(OptionPannel);

        javax.swing.GroupLayout PanelWorkAreaLayout = new javax.swing.GroupLayout(PanelWorkArea);
        PanelWorkArea.setLayout(PanelWorkAreaLayout);
        PanelWorkAreaLayout.setHorizontalGroup(
            PanelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        PanelWorkAreaLayout.setVerticalGroup(
            PanelWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(PanelWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
        CreateNewPatient viewPatientsPanel = new CreateNewPatient(
                personDirectoryDifferentName, patientDirectory);
        jSplitPane1.setRightComponent(viewPatientsPanel);
        
        
        
        
    }//GEN-LAST:event_btnPatientActionPerformed

    private void btnViewPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPatientsActionPerformed
        // TODO add your handling code here:
        SearchPatients searchPatients = new SearchPatients(this.patientDirectory);
        jSplitPane1.setRightComponent(searchPatients);
        
    }//GEN-LAST:event_btnViewPatientsActionPerformed

    private void btnAddVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalsActionPerformed
        // TODO add your handling code here:
        AddVitals addVitals = new AddVitals(this.patientDirectory);
        jSplitPane1.setRightComponent(addVitals);
        
      
        
       
        
    }//GEN-LAST:event_btnAddVitalsActionPerformed

    private void btnPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonActionPerformed
 
        CreateNewPerson createNewPersonPane = new CreateNewPerson( personDirectoryDifferentName);
        jSplitPane1.setRightComponent(createNewPersonPane);
        
        
    }//GEN-LAST:event_btnPersonActionPerformed

    private void btnAddEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEncounterActionPerformed
    
        // TODO add your handling code here:
        ViewEncounterHistory patientEncounter =
                new ViewEncounterHistory(patientDirectory);
        jSplitPane1.setRightComponent(patientEncounter);
    }//GEN-LAST:event_btnAddEncounterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        OverView overView = new OverView(patientDirectory);
        jSplitPane1.setRightComponent(overView);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OptionPannel;
    private javax.swing.JPanel PanelWorkArea;
    private javax.swing.JButton btnAddEncounter;
    private javax.swing.JButton btnAddVitals;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnPerson;
    private javax.swing.JButton btnViewPatients;
    private javax.swing.JButton jButton1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}