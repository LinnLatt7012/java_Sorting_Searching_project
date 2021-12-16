/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUICSV_Search_SortLinnLattOo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class GUIeventDrivenAPP extends javax.swing.JFrame {
        static int low=0;
        static String format= "|%-20s|%13s|%5d|%8s |\n";
        static String divider="=======================================================";
        
        static Scanner Str= new Scanner(System.in);
        static Scanner in= new Scanner(System.in);
        static List<Customer> Customers = new ArrayList<>();        
        static boolean Fileisnotfound=false;
        static MergeSort s1=new MergeSort();
        static BinarySearch s3 = new BinarySearch();
        static String url="G:\\school\\Programming\\Programming assignment\\";
        
        static char checkForsearch='0';
    /**
     * Creates new form GUIeventDrivenAPP
     */
        
    
    public GUIeventDrivenAPP() {
        initComponents();
    }
        
    public void SearchDisplayName(List<Customer> Customers,String key,int index){
    
        DefaultTableModel SearchTable =  (DefaultTableModel) TblSname.getModel();
        String[] Cols={"No","Name","Phone.No","Age","Gender"};
        SearchTable.setRowCount(0);
        SearchTable.setColumnIdentifiers(Cols);
        TblSname.getColumnModel().getColumn(0).setPreferredWidth(40);
        TblSname.getColumnModel().getColumn(1).setPreferredWidth(200);
        TblSname.getColumnModel().getColumn(2).setPreferredWidth(150);
        TblSname.getColumnModel().getColumn(3).setPreferredWidth(50);
        TblSname.getColumnModel().getColumn(4).setPreferredWidth(100);
        int fchk = index;
        int schk = index;
        int Row_counter=0;
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            JOptionPane.showMessageDialog(null,key+ " is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getName())|| key.equalsIgnoreCase(Customers.get(index+1).getName())){
            if(key.equalsIgnoreCase(Customers.get(index-1).getName())){
            do{
                    SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(fchk).getName(),Customers.get(fchk).getPh_no(),Customers.get(fchk).getAge(),Customers.get(fchk).getGender()});
                    Row_counter++;
            fchk=fchk-1;        
            if(fchk==-1)
                break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getName()));
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getName())){  
                do{
                    if(fchk==index){
                        SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(schk).getName(),Customers.get(schk).getPh_no(),Customers.get(schk).getAge(),Customers.get(schk).getGender()});
                        Row_counter++;
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getName()));
            }     
        }else {
            SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        }else{ 
           SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        NoOfresults.setText("Number of Results:   :"+Row_counter);
    } 
    public void SearchDisplayGender(List<Customer> Customers,String key,int index){
    
        DefaultTableModel SearchTable =  (DefaultTableModel) TblSname.getModel();
        String[] Cols={"No","Name","Phone.No","Age","Gender"};
        SearchTable.setRowCount(0);
        SearchTable.setColumnIdentifiers(Cols);
        TblSname.getColumnModel().getColumn(0).setPreferredWidth(40);
        TblSname.getColumnModel().getColumn(1).setPreferredWidth(200);
        TblSname.getColumnModel().getColumn(2).setPreferredWidth(150);
        TblSname.getColumnModel().getColumn(3).setPreferredWidth(50);
        TblSname.getColumnModel().getColumn(4).setPreferredWidth(100);
        int fchk = index;
        int schk = index;
        int Row_counter=0;
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            JOptionPane.showMessageDialog(null,key+ " is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getGender())|| key.equalsIgnoreCase(Customers.get(index+1).getGender())){
            if(key.equalsIgnoreCase(Customers.get(index-1).getGender())){
            do{
                    SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(fchk).getName(),Customers.get(fchk).getPh_no(),Customers.get(fchk).getAge(),Customers.get(fchk).getGender()});
                    Row_counter++;
            fchk=fchk-1;        
            if(fchk==-1)
                break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getGender()));
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getGender())){  
                do{
                    if(fchk==index){
                        SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(schk).getName(),Customers.get(schk).getPh_no(),Customers.get(schk).getAge(),Customers.get(schk).getGender()});
                        Row_counter++;
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getGender()));
            }     
        }else {
            SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        }else{
           SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        NoOfresults.setText("Number of Results:   :"+Row_counter);
    } 
    public void SearchDisplayPhoneNo(List<Customer> Customers,String key,int index){
    
        DefaultTableModel SearchTable =  (DefaultTableModel) TblSname.getModel();
        String[] Cols={"No","Name","Phone.No","Age","Gender"};
        SearchTable.setRowCount(0);
        SearchTable.setColumnIdentifiers(Cols);
        TblSname.getColumnModel().getColumn(0).setPreferredWidth(40);
        TblSname.getColumnModel().getColumn(1).setPreferredWidth(200);
        TblSname.getColumnModel().getColumn(2).setPreferredWidth(150);
        TblSname.getColumnModel().getColumn(3).setPreferredWidth(50);
        TblSname.getColumnModel().getColumn(4).setPreferredWidth(100);
        int fchk = index;
        int schk = index;
        int Row_counter=0;
        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            JOptionPane.showMessageDialog(null,key+ " is not found");
        }else if( key.equalsIgnoreCase(Customers.get(index-1).getPh_no())|| key.equalsIgnoreCase(Customers.get(index+1).getPh_no())){
            if(key.equalsIgnoreCase(Customers.get(index-1).getPh_no())){
            do{
                    SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(fchk).getName(),Customers.get(fchk).getPh_no(),Customers.get(fchk).getAge(),Customers.get(fchk).getGender()});
                    Row_counter++;
            fchk=fchk-1;        
            if(fchk==-1)
                break;
            }while(key.equalsIgnoreCase(Customers.get(fchk).getPh_no()));
            }
            if(key.equalsIgnoreCase(Customers.get(index+1).getPh_no())){  
                do{
                    if(fchk==index){
                        SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(schk).getName(),Customers.get(schk).getPh_no(),Customers.get(schk).getAge(),Customers.get(schk).getGender()});
                        Row_counter++;
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(key.equalsIgnoreCase(Customers.get(schk).getPh_no()));
            }     
        }else {
            SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        }else{
           SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        NoOfresults.setText("Number of Results:   :"+Row_counter);
    }  
    public void SearchDisplayAge(List<Customer> Customers,int key,int index){
        DefaultTableModel SearchTable =  (DefaultTableModel) TblSname.getModel();
        String[] Cols={"No","Name","Phone.No","Age","Gender"};
        SearchTable.setRowCount(0);
        SearchTable.setColumnIdentifiers(Cols);
        TblSname.getColumnModel().getColumn(0).setPreferredWidth(40);
        TblSname.getColumnModel().getColumn(1).setPreferredWidth(200);
        TblSname.getColumnModel().getColumn(2).setPreferredWidth(150);
        TblSname.getColumnModel().getColumn(3).setPreferredWidth(50);
        TblSname.getColumnModel().getColumn(4).setPreferredWidth(100);
        int fchk = index;
        int schk = index;
        int Row_counter=0;

        if(index!=0&&index!=Customers.size()-1){
        if(index==-1){
            JOptionPane.showMessageDialog(null,key+ " is not found");
        }else if( Customers.get(index-1).getAge()==key ||Customers.get(index+1).getAge()==key){
            
            if(Customers.get(index-1).getAge()==key){
                do{
                    SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(fchk).getName(),Customers.get(fchk).getPh_no(),Customers.get(fchk).getAge(),Customers.get(fchk).getGender()});
                    Row_counter++;
                    fchk=fchk-1;
                    if(fchk==-1)
                        break;
                }while(Customers.get(fchk).getAge()==key );
            }
            if(Customers.get(index+1).getAge()==key){  
                do{
                     if(fchk==index){
                        SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(schk).getName(),Customers.get(schk).getPh_no(),Customers.get(schk).getAge(),Customers.get(schk).getGender()});
                        Row_counter++;
                     }
                    fchk=index;
                    schk=schk+1;
                    if(schk==Customers.size())
                        break;
                }while(Customers.get(schk).getAge()==key );
            }
        }else {
            SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        }else{
           SearchTable.addRow(new Object[]{Row_counter+1,Customers.get(index).getName(),Customers.get(index).getPh_no(),Customers.get(index).getAge(),Customers.get(index).getGender()});
        Row_counter++;
        }
        NoOfresults.setText("Number of Results:   :"+Row_counter);
    }
    

    public void ShowDataAfterSort(){
        DefaultTableModel dtm =  (DefaultTableModel) jTable1.getModel();
        String[] Cols={"No","Name","Phone.No","Age","Gender"};
        dtm.setRowCount(0);
        dtm.setColumnIdentifiers(Cols);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        for(int i=0; i<Customers.size();i++)
         dtm.addRow(new Object[]{i+1,Customers.get(i).getName(),Customers.get(i).getPh_no(),Customers.get(i).getAge(),Customers.get(i).getGender()});
        
        NoOfRows.setText("Total Number of Customers :    :"+Customers.size());
          
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NameSort = new javax.swing.JButton();
        GenderSort = new javax.swing.JButton();
        PhoneSort = new javax.swing.JButton();
        AgeSort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        NoOfRows = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        NameSearch = new javax.swing.JButton();
        GenderSearch = new javax.swing.JButton();
        PhoneSearch = new javax.swing.JButton();
        AgeSearch = new javax.swing.JButton();
        SInput = new javax.swing.JPanel();
        SearchTxtField = new javax.swing.JTextField();
        Sreachlabel = new javax.swing.JLabel();
        SButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblSname = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        NoOfresults = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Sort By");

        NameSort.setBackground(new java.awt.Color(204, 204, 255));
        NameSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameSort.setText("Name");
        NameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSortActionPerformed(evt);
            }
        });

        GenderSort.setBackground(new java.awt.Color(204, 204, 255));
        GenderSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GenderSort.setText("Gender");
        GenderSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderSortActionPerformed(evt);
            }
        });

        PhoneSort.setBackground(new java.awt.Color(204, 204, 255));
        PhoneSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneSort.setText("Phone_No");
        PhoneSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneSortActionPerformed(evt);
            }
        });

        AgeSort.setBackground(new java.awt.Color(204, 204, 255));
        AgeSort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgeSort.setText("Age");
        AgeSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeSortActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jTable1.setGridColor(new java.awt.Color(255, 204, 255));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("List of Customer");

        NoOfRows.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NoOfRows.setText("Number of Customers :   :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NameSort, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PhoneSort, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AgeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(GenderSort, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoOfRows)
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(NameSort)
                .addGap(18, 18, 18)
                .addComponent(GenderSort)
                .addGap(18, 18, 18)
                .addComponent(PhoneSort)
                .addGap(18, 18, 18)
                .addComponent(AgeSort)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NoOfRows))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sorting", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Search By");

        NameSearch.setBackground(new java.awt.Color(204, 204, 255));
        NameSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameSearch.setText("Name");
        NameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSearchActionPerformed(evt);
            }
        });

        GenderSearch.setBackground(new java.awt.Color(204, 204, 255));
        GenderSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GenderSearch.setText("Gender");
        GenderSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderSearchActionPerformed(evt);
            }
        });

        PhoneSearch.setBackground(new java.awt.Color(204, 204, 255));
        PhoneSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PhoneSearch.setText("Phone_No");
        PhoneSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneSearchActionPerformed(evt);
            }
        });

        AgeSearch.setBackground(new java.awt.Color(204, 204, 255));
        AgeSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AgeSearch.setText("Age");
        AgeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeSearchActionPerformed(evt);
            }
        });

        SInput.setBackground(new java.awt.Color(204, 255, 255));
        SInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SearchTxtField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Sreachlabel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        SButton.setBackground(new java.awt.Color(204, 204, 255));
        SButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SButton.setText("Search");
        SButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SInputLayout = new javax.swing.GroupLayout(SInput);
        SInput.setLayout(SInputLayout);
        SInputLayout.setHorizontalGroup(
            SInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SInputLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(Sreachlabel)
                .addGap(90, 90, 90)
                .addComponent(SearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SInputLayout.setVerticalGroup(
            SInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sreachlabel)
                    .addComponent(SButton))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        TblSname.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TblSname);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("List of results");

        NoOfresults.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NoOfresults.setText("Number of Results:    :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(SInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(GenderSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63)
                                    .addComponent(PhoneSearch)
                                    .addGap(77, 77, 77)
                                    .addComponent(AgeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(116, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NoOfresults)
                        .addGap(214, 214, 214))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameSearch)
                    .addComponent(GenderSearch)
                    .addComponent(PhoneSearch)
                    .addComponent(AgeSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NoOfresults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Searching", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSortActionPerformed
        s1.sort(Customers,low,Customers.size()-1,"name");
        ShowDataAfterSort();
        SInput.hide();
    }//GEN-LAST:event_NameSortActionPerformed

    private void GenderSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderSortActionPerformed
        s1.sort(Customers,low,Customers.size()-1,"gender");
        ShowDataAfterSort();
        SInput.hide();
    }//GEN-LAST:event_GenderSortActionPerformed

    private void PhoneSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneSortActionPerformed
      s1.sort(Customers,low,Customers.size()-1,"Ph_no");
        ShowDataAfterSort();
        SInput.hide();
    }//GEN-LAST:event_PhoneSortActionPerformed

    private void AgeSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeSortActionPerformed
        s1.sort(Customers,low,Customers.size()-1,"age");
        ShowDataAfterSort();
        SInput.hide();
    }//GEN-LAST:event_AgeSortActionPerformed

    private void NameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSearchActionPerformed
        // TODO add your handling code here:
        checkForsearch='1';
        s1.sort(Customers,low,Customers.size()-1,"name");
        Sreachlabel.setText("Name");
        SearchTxtField.setText("");
        SInput.show();
    }//GEN-LAST:event_NameSearchActionPerformed

    private void GenderSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderSearchActionPerformed
        // TODO add your handling code here:
        checkForsearch='2';
        s1.sort(Customers,low,Customers.size()-1,"gender");
        Sreachlabel.setText("Gender");
        SearchTxtField.setText("");
        SInput.show();
    }//GEN-LAST:event_GenderSearchActionPerformed

    private void PhoneSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneSearchActionPerformed
        // TODO add your handling code here:
        checkForsearch='3';
        s1.sort(Customers,low,Customers.size()-1,"phone no");
        Sreachlabel.setText("Phone.No");
        SearchTxtField.setText("");
        SInput.show();
    }//GEN-LAST:event_PhoneSearchActionPerformed

    private void AgeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeSearchActionPerformed
        // TODO add your handling code here:
//        s2.bubbleSortInt(age,name,Gender,ph_no);
        s1.sort(Customers,low,Customers.size()-1,"age");
        checkForsearch='4';
        Sreachlabel.setText("Age");
        SearchTxtField.setText("");
        SInput.show();
    }//GEN-LAST:event_AgeSearchActionPerformed

    private void SButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SButtonActionPerformed
        // TODO add your handling code here:
        String StrSearchData;
        int IntSearchData;
        int index;
        if(SearchTxtField.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Please write the Data that you want to search");
        }else{
            if(checkForsearch=='1'||checkForsearch=='2'||checkForsearch=='3'){
                StrSearchData=SearchTxtField.getText();
                if(checkForsearch=='1'){
                    index= s3.binarySearchName(Customers,low,Customers.size()-1,StrSearchData);
                    //               System.out.println("Index"+index+"\nSearch="+StrSearchData);
                    SearchDisplayName(Customers,StrSearchData,index);
                }else if(checkForsearch=='2'){
                    index= s3.binarySearchGender(Customers,low,Customers.size()-1,StrSearchData);
                    SearchDisplayGender(Customers,StrSearchData,index);
                }else{
                    index= s3.binarySearchPhoneNo(Customers,low,Customers.size()-1,"09-"+StrSearchData);
                    SearchDisplayPhoneNo(Customers,"09-"+StrSearchData,index);
                }

            }else{
                IntSearchData= Integer.parseInt(SearchTxtField.getText());
                index= s3.binarySearchAge(Customers,low,Customers.size()-1,IntSearchData);
                SearchDisplayAge(Customers,IntSearchData,index);
            }
        }
    }//GEN-LAST:event_SButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUIeventDrivenAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIeventDrivenAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIeventDrivenAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIeventDrivenAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        CSVRead ObjforCSVRead=new CSVRead();
        ObjforCSVRead.readBooksFromCSV(url+"Customer.csv");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(Fileisnotfound)
                JOptionPane.showMessageDialog(null,"your File(Customer.csv) doesn't have in supported location \""+url+"\"");
                if(!Fileisnotfound)
                new GUIeventDrivenAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgeSearch;
    private javax.swing.JButton AgeSort;
    private javax.swing.JButton GenderSearch;
    private javax.swing.JButton GenderSort;
    private javax.swing.JButton NameSearch;
    private javax.swing.JButton NameSort;
    private javax.swing.JLabel NoOfRows;
    private javax.swing.JLabel NoOfresults;
    private javax.swing.JButton PhoneSearch;
    private javax.swing.JButton PhoneSort;
    private javax.swing.JButton SButton;
    private javax.swing.JPanel SInput;
    private javax.swing.JTextField SearchTxtField;
    private javax.swing.JLabel Sreachlabel;
    private javax.swing.JTable TblSname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
