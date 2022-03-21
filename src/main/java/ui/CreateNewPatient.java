/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.patient.Patient;
import model.patient.PatientDirectory;
import model.person.Person;
import model.person.PersonDirectory;

/**
 *
 * @author bhavinbhatia
 */
public class CreateNewPatient extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewPatient
     */
    Patient patient;
    PatientDirectory patientDirectory;
    Person person;
    PersonDirectory personDirectory;
    
    
   
    public CreateNewPatient(PersonDirectory personDirectory, 
                PatientDirectory patientDirectory)
    {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;

        displayPerson();
    }

    

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientRecords = new javax.swing.JTable();
        btnAddPatientId = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        titlePanel = new javax.swing.JPanel();
        btnDeletePatient = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        lblHouse = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        txtHouse = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 153, 153));

        tblPatientRecords.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        tblPatientRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "City", "Community", "House"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientRecords);

        btnAddPatientId.setText("Select");
        btnAddPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientIdActionPerformed(evt);
            }
        });

        lblPatientName.setText("Name");

        lblPatientId.setText("Id");

        txtPatientName.setEditable(false);
        txtPatientName.setBackground(new java.awt.Color(204, 204, 204));

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        txtAge.setEditable(false);
        txtAge.setBackground(new java.awt.Color(204, 204, 204));

        txtGender.setEditable(false);
        txtGender.setBackground(new java.awt.Color(204, 204, 204));

        lblCity.setText("City");

        txtCity.setEditable(false);
        txtCity.setBackground(new java.awt.Color(204, 204, 204));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        titlePanel.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        btnDeletePatient.setText("Delete Person");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community");

        lblHouse.setText("House");

        txtCommunity.setBackground(new java.awt.Color(204, 204, 204));

        txtHouse.setEditable(false);
        txtHouse.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHouse)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(btnAddPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeletePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCity)
                                    .addComponent(lblAge)
                                    .addComponent(lblPatientId)
                                    .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCommunity))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCommunity)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHouse))))
                        .addGap(193, 193, 193))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCity, lblGender, lblPatientId, lblPatientName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPatientId, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnDeletePatient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouse)
                    .addComponent(txtHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddPatientId, btnCreate, btnDeletePatient});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblAge, lblCity, lblGender, lblPatientId, lblPatientName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCity, txtCommunity, txtHouse});

    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
         String newPatientStr = txtPatientId.getText();
   
           if (!validateNotNull(
                newPatientStr
        )) {
            return;
        }
        
            int newPatientId = Integer.valueOf(newPatientStr);
         Patient newPatient = new Patient(newPatientId, person);
         this.patientDirectory.addPatient(newPatient);
          JOptionPane.showMessageDialog( this, "Patient Created");
         

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnAddPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientIdActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblPatientRecords.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog( this, "Please select the row first");
        }
        DefaultTableModel personModel = (DefaultTableModel) tblPatientRecords.getModel();
        this.person = (Person) personModel.getValueAt(selectedRowIndex, 0);

        txtPatientName.setText(person.getName());
        txtAge.setText(String.valueOf(person.getAge()));
        txtGender.setText(person.getGender());
        txtCity.setText(person.getResidence().getCity().getCityName());
        txtCommunity.setText(person.getResidence().getCommunity().getCommunityName());
        txtHouse.setText(String.valueOf(person.getResidence().getHouse().getHouseNumber()));
        
        
        
        
    }//GEN-LAST:event_btnAddPatientIdActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPatientRecords.getSelectedRow();
        
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select the row to delete");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatientRecords.getModel();
        this.personDirectory.deletePerson(selectedRowIndex);


        JOptionPane.showMessageDialog(this, "Person record deleted");
        displayPerson();
    }//GEN-LAST:event_btnDeletePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatientId;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHouse;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblPatientRecords;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHouse;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
     
    
    
   public void displayPerson(){

        DefaultTableModel model = (DefaultTableModel) tblPatientRecords.getModel();
        model.setRowCount(0);
        
        for (Person person : this.personDirectory.getPersons()){
            Object [] row = new Object[6];
            row[0]= person;
            row[1]= person.getAge();
            row[2]= person.getGender();
            row[3] = person.getResidence().getCity().getCityName();
            row[4] = person.getResidence().getCommunity().getCommunityName();
            row[5] = person.getResidence().getHouse().getHouseNumber();
            
            model.addRow(row);
            
        
        }

    }
   
    public boolean validateNotNull(String... input){
      for (String inp : input) {
          if(inp.isEmpty()){
              JOptionPane.showMessageDialog(this, "All fields are required.");
              return false;
          }
            
      }
      return true;
     }
    
   




}