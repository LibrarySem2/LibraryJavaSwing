/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.managerment_library.views;

import com.managerment_library.controller.PositionController;
import com.managerment_library.controller.StaffController;
import com.managerment_library.entity.PositionEntity;
import com.managerment_library.entity.StaffEntity;
import com.managerment_library.repository.PositionDAO;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Manager extends javax.swing.JFrame {

    private final StaffController staffController = new StaffController();
    private final PositionController positionController = new PositionController();

    Vector table_tieuDe = new Vector();
    Vector table_duLieu = new Vector();
    private String role;

    /**
     * Creates new form Manager
     */
    public Manager(String role) {
        this.role = role;
        initComponents();
        staff_JDialogNew_staffId.setVisible(false);
        myCardLayout.add(cardLayout_Staff, "panelStaff");
        myCardLayout.add(cardLayout_Book, "panelMembercard");
        myCardLayout.add(cardLayout_memberCard, "panelBooks");
        myCardLayout.add(jPanel1, "emtry");
        CardLayout layout = (CardLayout) myCardLayout.getLayout();
        layout.show(myCardLayout, "emtry");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staff_JDialog_NewANDEdit = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        staff_JComboxPosition = new javax.swing.JComboBox<>();
        staff_JDialogNew_staffName = new javax.swing.JTextField();
        staff_JDialogNew_staffAddress = new javax.swing.JTextField();
        staff_JDialogNew_staffBirthDay = new javax.swing.JTextField();
        staff_JDialogNew_staffPhone = new javax.swing.JTextField();
        staff_JDialogNew_staffEmail = new javax.swing.JTextField();
        staff_JRadio_Male = new javax.swing.JRadioButton();
        staff_JRadio_Female = new javax.swing.JRadioButton();
        staff_JRadio_other = new javax.swing.JRadioButton();
        staff_JDialogNew_btnAdd = new javax.swing.JButton();
        staff_JDialogNew_staffId = new javax.swing.JTextField();
        staff_btn_GroupGender = new javax.swing.ButtonGroup();
        myCardLayout = new javax.swing.JPanel();
        cardLayout_Staff = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        staff_jtextFieldSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        staff_btn_Search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Staff = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        panelStaff_btn_addStaff = new javax.swing.JButton();
        panelStaff_btn_updateStaff = new javax.swing.JButton();
        panelStaff_btn_detailStaff = new javax.swing.JButton();
        panelStaff_btn_delStaff = new javax.swing.JButton();
        cardLayout_Book = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        panelStaff_btn_addStaff1 = new javax.swing.JButton();
        panelStaff_btn_updateStaff1 = new javax.swing.JButton();
        panelStaff_btn_detail1 = new javax.swing.JButton();
        panelStaff_btn_delStaff1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Staff1 = new javax.swing.JTable();
        cardLayout_memberCard = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Staff2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        panelStaff_btn_addStaff2 = new javax.swing.JButton();
        panelStaff_btn_updateStaff2 = new javax.swing.JButton();
        panelStaff_btn_detail2 = new javax.swing.JButton();
        panelStaff_btn_delStaff2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Manager = new javax.swing.JMenu();
        jMenuItem_Satff = new javax.swing.JMenuItem();
        jMenuItem_memberCard = new javax.swing.JMenuItem();
        jMenuItem_Books = new javax.swing.JMenuItem();
        jMenu_Statistical = new javax.swing.JMenu();

        jLabel6.setText("Chức vụ");

        jLabel7.setText("Giới tính");

        jLabel8.setText("Ngày sinh");

        jLabel9.setText("Số điện thoại ");

        jLabel10.setText("Email");

        jLabel11.setText("Tên nhân viên");

        jLabel12.setText("Địa chỉ nhân viên");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        staff_JComboxPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        staff_JComboxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JComboxPositionActionPerformed(evt);
            }
        });

        staff_JDialogNew_staffBirthDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JDialogNew_staffBirthDayActionPerformed(evt);
            }
        });

        staff_btn_GroupGender.add(staff_JRadio_Male);
        staff_JRadio_Male.setText("Nam");
        staff_JRadio_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JRadio_MaleActionPerformed(evt);
            }
        });

        staff_btn_GroupGender.add(staff_JRadio_Female);
        staff_JRadio_Female.setText("Nữ");
        staff_JRadio_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JRadio_FemaleActionPerformed(evt);
            }
        });

        staff_btn_GroupGender.add(staff_JRadio_other);
        staff_JRadio_other.setText("Khác");
        staff_JRadio_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JRadio_otherActionPerformed(evt);
            }
        });

        staff_JDialogNew_btnAdd.setText("Lưu nhân viên");
        staff_JDialogNew_btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_JDialogNew_btnAddActionPerformed(evt);
            }
        });

        staff_JDialogNew_staffId.setText("-1");

        javax.swing.GroupLayout staff_JDialog_NewANDEditLayout = new javax.swing.GroupLayout(staff_JDialog_NewANDEdit.getContentPane());
        staff_JDialog_NewANDEdit.getContentPane().setLayout(staff_JDialog_NewANDEditLayout);
        staff_JDialog_NewANDEditLayout.setHorizontalGroup(
            staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staff_JDialogNew_staffAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_JDialogNew_staffBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staff_JDialogNew_staffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                        .addComponent(staff_JRadio_Male)
                        .addGap(18, 18, 18)
                        .addComponent(staff_JRadio_Female)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JRadio_other))
                    .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(staff_JComboxPosition, javax.swing.GroupLayout.Alignment.LEADING, 0, 280, Short.MAX_VALUE)
                        .addComponent(staff_JDialogNew_staffName, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                            .addComponent(staff_JDialogNew_btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(staff_JDialogNew_staffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(staff_JDialogNew_staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        staff_JDialog_NewANDEditLayout.setVerticalGroup(
            staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staff_JDialog_NewANDEditLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(staff_JComboxPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JDialogNew_staffName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JDialogNew_staffAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JDialogNew_staffBirthDay, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JDialogNew_staffPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staff_JDialogNew_staffEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staff_JRadio_Male)
                            .addComponent(staff_JRadio_Female)
                            .addComponent(staff_JRadio_other))
                        .addGap(18, 18, 18)
                        .addGroup(staff_JDialog_NewANDEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staff_JDialogNew_btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff_JDialogNew_staffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        myCardLayout.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Tên nhân viên");

        staff_btn_Search.setText("Tìm Kiếm");
        staff_btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_btn_SearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(staff_jtextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(staff_btn_Search)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staff_btn_Search)
                    .addComponent(staff_jtextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable_Staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_Staff);

        panelStaff_btn_addStaff.setText("Thêm nhân viên");
        panelStaff_btn_addStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelStaff_btn_addStaffActionPerformed(evt);
            }
        });

        panelStaff_btn_updateStaff.setText("Sửa thông tin nhân viên");
        panelStaff_btn_updateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelStaff_btn_updateStaffActionPerformed(evt);
            }
        });

        panelStaff_btn_detailStaff.setText("Xem thông tin chi tiết");

        panelStaff_btn_delStaff.setText("Xóa nhân viên");
        panelStaff_btn_delStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelStaff_btn_delStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelStaff_btn_detailStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_delStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_addStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_updateStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStaff_btn_addStaff)
                .addGap(2, 2, 2)
                .addComponent(panelStaff_btn_updateStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_detailStaff)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_delStaff)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardLayout_StaffLayout = new javax.swing.GroupLayout(cardLayout_Staff);
        cardLayout_Staff.setLayout(cardLayout_StaffLayout);
        cardLayout_StaffLayout.setHorizontalGroup(
            cardLayout_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout_StaffLayout.createSequentialGroup()
                .addGroup(cardLayout_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout_StaffLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardLayout_StaffLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardLayout_StaffLayout.setVerticalGroup(
            cardLayout_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout_StaffLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardLayout_StaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        myCardLayout.add(cardLayout_Staff, "card2");

        jLabel2.setText("Tên sách");

        jButton2.setText("Tìm Kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên tác giả");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Thể loại");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(16, 16, 16))
        );

        panelStaff_btn_addStaff1.setText("Thêm sách");

        panelStaff_btn_updateStaff1.setText("Sửa thông tin sách");
        panelStaff_btn_updateStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelStaff_btn_updateStaff1ActionPerformed(evt);
            }
        });

        panelStaff_btn_detail1.setText("Xem thông tin chi tiết");

        panelStaff_btn_delStaff1.setText("Xóa sách");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelStaff_btn_detail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_delStaff1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_addStaff1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_updateStaff1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStaff_btn_addStaff1)
                .addGap(2, 2, 2)
                .addComponent(panelStaff_btn_updateStaff1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_detail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_delStaff1)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jTable_Staff1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable_Staff1);

        javax.swing.GroupLayout cardLayout_BookLayout = new javax.swing.GroupLayout(cardLayout_Book);
        cardLayout_Book.setLayout(cardLayout_BookLayout);
        cardLayout_BookLayout.setHorizontalGroup(
            cardLayout_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardLayout_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout_BookLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardLayout_BookLayout.setVerticalGroup(
            cardLayout_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout_BookLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cardLayout_BookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        myCardLayout.add(cardLayout_Book, "card3");

        jTable_Staff2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable_Staff2);

        panelStaff_btn_addStaff2.setText("Tạo thẻ ");

        panelStaff_btn_updateStaff2.setText("Sửa thông tin thẻ");

        panelStaff_btn_detail2.setText("Xem thông tin chi tiết");

        panelStaff_btn_delStaff2.setText("Xóa thẻ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelStaff_btn_detail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_delStaff2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_addStaff2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStaff_btn_updateStaff2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStaff_btn_addStaff2)
                .addGap(2, 2, 2)
                .addComponent(panelStaff_btn_updateStaff2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_detail2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStaff_btn_delStaff2)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jLabel3.setText("Tên chủ thẻ");

        jButton3.setText("Tìm Kiếm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cardLayout_memberCardLayout = new javax.swing.GroupLayout(cardLayout_memberCard);
        cardLayout_memberCard.setLayout(cardLayout_memberCardLayout);
        cardLayout_memberCardLayout.setHorizontalGroup(
            cardLayout_memberCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout_memberCardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardLayout_memberCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardLayout_memberCardLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1007, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardLayout_memberCardLayout.setVerticalGroup(
            cardLayout_memberCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLayout_memberCardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardLayout_memberCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        myCardLayout.add(cardLayout_memberCard, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1214, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        myCardLayout.add(jPanel1, "card5");

        jMenuBar1.setMargin(new java.awt.Insets(0, 0, 0, 40));

        jMenu_Manager.setText("Quản lý");

        jMenuItem_Satff.setText("Quản lý nhân viên");
        jMenuItem_Satff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_SatffActionPerformed(evt);
            }
        });
        jMenu_Manager.add(jMenuItem_Satff);

        jMenuItem_memberCard.setText("Quản lý thẻ thành viên");
        jMenuItem_memberCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_memberCardActionPerformed(evt);
            }
        });
        jMenu_Manager.add(jMenuItem_memberCard);

        jMenuItem_Books.setText("Quản lý sách");
        jMenuItem_Books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_BooksActionPerformed(evt);
            }
        });
        jMenu_Manager.add(jMenuItem_Books);

        jMenuBar1.add(jMenu_Manager);

        jMenu_Statistical.setText("Thống kê");
        jMenu_Statistical.setInheritsPopupMenu(true);
        jMenuBar1.add(jMenu_Statistical);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(myCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(myCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_SatffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SatffActionPerformed
        table_tieuDe.clear();
        table_tieuDe.add("STT");
        table_tieuDe.add("ID nhân viên");
        table_tieuDe.add("Tên nhân viên");
        table_tieuDe.add("Chức vụ");
        table_tieuDe.add("Địa chỉ");
        table_tieuDe.add("Số điện thoại");
        table_tieuDe.add("Giới tính");
        table_tieuDe.add("Ngày sinh");
        table_tieuDe.add("Email");
        table_duLieu.clear();
        List<StaffEntity> staffEntitys = staffController.getAll();
        PositionEntity position = null;
        for (int i = 0; i < staffEntitys.size(); i++) {
            Vector temp = new Vector();
            temp.add(i + 1);
            temp.add(staffEntitys.get(i).getId());
            temp.add(staffEntitys.get(i).getFullName());
            position = staffEntitys.get(i).getPosition();
            temp.add(position.getPosision());
            temp.add(staffEntitys.get(i).getAddress());
            temp.add(staffEntitys.get(i).getPhone());
            temp.add(staffEntitys.get(i).getGender());
            temp.add(staffEntitys.get(i).getBirthday());
            temp.add(staffEntitys.get(i).getEmail());
            table_duLieu.add(temp);
        }
        DefaultTableModel model = new DefaultTableModel(table_duLieu, table_tieuDe) {
            @Override
            public boolean isCellEditable(int i, int i1) {
//                    if ((i1 == 0) || (i1 == 2)) {
//                        return true;
//                    } else {
//                        return false;
//                    }
                return false;
            }
        };
        jTable_Staff.setModel(model);
        if (role.equals("ADMIN")) {
            CardLayout layout = (CardLayout) myCardLayout.getLayout();
            layout.show(myCardLayout, "panelStaff");
        } else {
            JOptionPane.showMessageDialog(null, "Bạn khong co quyen", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem_SatffActionPerformed

    private void jMenuItem_memberCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_memberCardActionPerformed
        CardLayout layout = (CardLayout) myCardLayout.getLayout();
        layout.show(myCardLayout, "panelMembercard");
    }//GEN-LAST:event_jMenuItem_memberCardActionPerformed

    private void jMenuItem_BooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_BooksActionPerformed
        CardLayout layout = (CardLayout) myCardLayout.getLayout();
        layout.show(myCardLayout, "panelBooks");
    }//GEN-LAST:event_jMenuItem_BooksActionPerformed

    private void staff_btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_btn_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_btn_SearchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void panelStaff_btn_updateStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelStaff_btn_updateStaff1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelStaff_btn_updateStaff1ActionPerformed

    private void staff_JComboxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JComboxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_JComboxPositionActionPerformed

    private void staff_JRadio_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JRadio_MaleActionPerformed
        staff_JRadio_Male.setActionCommand("nam");
    }//GEN-LAST:event_staff_JRadio_MaleActionPerformed

    private void staff_JDialogNew_staffBirthDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JDialogNew_staffBirthDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staff_JDialogNew_staffBirthDayActionPerformed

    private void panelStaff_btn_addStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelStaff_btn_addStaffActionPerformed
        Map<Long, String> positionMap = positionController.getPositionMap();
        staff_JComboxPosition.removeAllItems();
        positionMap.forEach((k, v) -> staff_JComboxPosition.addItem(v));
        staff_JDialogNew_staffAddress.setText("");
        staff_JDialogNew_staffBirthDay.setText("");
        staff_JDialogNew_staffEmail.setText("");
        staff_JDialogNew_staffName.setText("");
        staff_JDialogNew_staffPhone.setText("");
        staff_JRadio_Male.setSelected(true);
        staff_JRadio_Male.doClick();
        staff_JDialog_NewANDEdit.pack();
        staff_JDialog_NewANDEdit.setLocationRelativeTo(this);
        staff_JDialog_NewANDEdit.setVisible(true);
    }//GEN-LAST:event_panelStaff_btn_addStaffActionPerformed

    private void staff_JRadio_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JRadio_otherActionPerformed
        staff_JRadio_other.setActionCommand("khác");
    }//GEN-LAST:event_staff_JRadio_otherActionPerformed

    private void staff_JDialogNew_btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JDialogNew_btnAddActionPerformed
        if (staff_JDialogNew_staffName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên nhân viên", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            staff_JDialogNew_staffName.requestFocus();
        } else if (staff_JDialogNew_staffName.getText().trim().length() > 100) {
            JOptionPane.showMessageDialog(this, "Tên sinh viên không được vượt quá 100 kí tự", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffName.requestFocus();
            staff_JDialogNew_staffName.selectAll();
        } else if (staff_JDialogNew_staffAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập địa chỉ", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffAddress.requestFocus();
        } else if (staff_JDialogNew_staffEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập Email", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffEmail.requestFocus();
        } else if (staff_JDialogNew_staffBirthDay.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập ngày sinh", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffBirthDay.requestFocus();
        } else if (staff_JDialogNew_staffPhone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffPhone.requestFocus();
        } else if (staff_JDialogNew_staffPhone.getText().trim().length() > 15) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không hợp lệ", "THÔNG BÁO", JOptionPane.WARNING_MESSAGE);
            staff_JDialogNew_staffPhone.requestFocus();
            staff_JDialogNew_staffPhone.selectAll();
        } else {
          /*  StaffEntity staffEntity = new StaffEntity();
            staffEntity.setAddress(staff_JDialogNew_staffAddress.getText());
            staffEntity.setBirthday(staff_JDialogNew_staffBirthDay.getText());
            staffEntity.setFullName(staff_JDialogNew_staffName.getText());
            staffEntity.setEmail(staff_JDialogNew_staffEmail.getText());
            staffEntity.setGender(staff_btn_GroupGender.getSelection().getActionCommand());
            staffEntity.setPhone(staff_JDialogNew_staffPhone.getText());
            String position = staff_JComboxPosition.getSelectedItem().toString();
            Long positionId = null;
            Map<Long, String> positionMap = positionController.getPositionMap();
            for (Map.Entry<Long, String> entry : positionMap.entrySet()) {
                if (position.equals(entry.getValue())) {
                    positionId = entry.getKey();
                }
            } */
            StaffEntity staffEntity = getInfoFromForm();
            String position = staff_JComboxPosition.getSelectedItem().toString();
            Long positionId = null;
            Map<Long, String> positionMap = positionController.getPositionMap();
            for (Map.Entry<Long, String> entry : positionMap.entrySet()) {
                if (position.equals(entry.getValue())) {
                    positionId = entry.getKey();
                }
            }
            StaffEntity result = null;
            if (staffEntity.getId() == null ) {
                result = staffController.saveStaff(staffEntity, positionId);
            } else {
                result = staffController.updateStaff(staffEntity, positionId);
            }
            if (result != null) {
                JOptionPane.showMessageDialog(null, "Thêm thành công", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            }
            jMenuItem_Satff.doClick();
            panelStaff_btn_addStaff.doClick();
        }
    }//GEN-LAST:event_staff_JDialogNew_btnAddActionPerformed

    private StaffEntity getInfoFromForm() {
        StaffEntity staffEntity = new StaffEntity();
        if (-1 != Long.parseLong(staff_JDialogNew_staffId.getText())) {
            staffEntity.setId(Long.parseLong(staff_JDialogNew_staffId.getText()));
        }
        staffEntity.setAddress(staff_JDialogNew_staffAddress.getText());
        staffEntity.setBirthday(staff_JDialogNew_staffBirthDay.getText());
        staffEntity.setFullName(staff_JDialogNew_staffName.getText());
        staffEntity.setEmail(staff_JDialogNew_staffEmail.getText());
        staffEntity.setGender(staff_btn_GroupGender.getSelection().getActionCommand());
        staffEntity.setPhone(staff_JDialogNew_staffPhone.getText());
    /*    String position = staff_JComboxPosition.getSelectedItem().toString();
        Long positionId = null;
        Map<Long, String> positionMap = positionController.getPositionMap();
        for (Map.Entry<Long, String> entry : positionMap.entrySet()) {
            if (position.equals(entry.getValue())) {
                positionId = entry.getKey();
            }
        } */
        return staffEntity;
    }

    private void panelStaff_btn_updateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelStaff_btn_updateStaffActionPerformed
        int count = jTable_Staff.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn nhân viên muốn sửa", "THÔNG BÁO", HEIGHT);
        } else {
            Map<Long, String> positionMap = positionController.getPositionMap();
            staff_JComboxPosition.removeAllItems();
            positionMap.forEach((k, v) -> staff_JComboxPosition.addItem(v));
            staff_JComboxPosition.setSelectedItem(jTable_Staff.getValueAt(count,3).toString());
            staff_JDialogNew_staffAddress.setText(jTable_Staff.getValueAt(count,4).toString());
            staff_JDialogNew_staffName.setText(jTable_Staff.getValueAt(count,2).toString());
            staff_JDialogNew_staffPhone.setText(jTable_Staff.getValueAt(count,5).toString());
            staff_JDialogNew_staffBirthDay.setText(jTable_Staff.getValueAt(count,7).toString());
            staff_JDialogNew_staffEmail.setText((String) jTable_Staff.getValueAt(count,8));
            staff_JDialogNew_staffId.setText(jTable_Staff.getValueAt(count,1).toString());
            String gender = jTable_Staff.getValueAt(count, 6).toString();
            switch (gender) {
                case "nam":
                    staff_JRadio_Male.setSelected(true);
                    staff_JRadio_Male.doClick();
                    break;
                case "nu":
                    staff_JRadio_Female.setSelected(true);
                    staff_JRadio_Female.doClick();
                    break;
                default:
                    staff_JRadio_other.setSelected(true);
                    staff_JRadio_other.doClick();
                    break;
            }
            staff_JDialog_NewANDEdit.pack();
            staff_JDialog_NewANDEdit.setLocationRelativeTo(this);
            staff_JDialog_NewANDEdit.setVisible(true);
        }
    }//GEN-LAST:event_panelStaff_btn_updateStaffActionPerformed

    private void staff_JRadio_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_JRadio_FemaleActionPerformed
        staff_JRadio_Female.setActionCommand("nu");
    }//GEN-LAST:event_staff_JRadio_FemaleActionPerformed

    private void panelStaff_btn_delStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelStaff_btn_delStaffActionPerformed
        int[] countStaff = jTable_Staff.getSelectedRows();
        int count = 0;
    //    String studentId = "";
        if (countStaff.length == 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn nhân viên cần xóa", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
        } else {
       /*     boolean flag = false;
            for (int i = 0; i < countStudents.length; i++) {
                if (userController.findByStudentId(tableStudent.getValueAt(countStudents[i], 1).toString())) {
                    studentId = tableStudent.getValueAt(countStudents[i], 1).toString();
                    flag = false;
                    break;
                } else {
                    studentController.delStudent(tableStudent.getValueAt(countStudents[i], 1).toString());
                    count++;
                    flag = true;
                }
            } */
            Long[] staffIds = new Long[countStaff.length];
            for (int i = 0; i < countStaff.length; i++) {
                staffIds[i] = Long.parseLong(jTable_Staff.getValueAt(countStaff[i], 1).toString());
            }
            boolean flag = staffController.delStaffById(staffIds);
            if (flag == true) {
                JOptionPane.showMessageDialog(null, "Xóa thành công", "THÔNG BÁO", HEIGHT);
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại", "THÔNG BÁO", HEIGHT);
            }
        }
        jMenuItem_Satff.doClick();
    }//GEN-LAST:event_panelStaff_btn_delStaffActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cardLayout_Book;
    private javax.swing.JPanel cardLayout_Staff;
    private javax.swing.JPanel cardLayout_memberCard;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Books;
    private javax.swing.JMenuItem jMenuItem_Satff;
    private javax.swing.JMenuItem jMenuItem_memberCard;
    private javax.swing.JMenu jMenu_Manager;
    private javax.swing.JMenu jMenu_Statistical;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable_Staff;
    private javax.swing.JTable jTable_Staff1;
    private javax.swing.JTable jTable_Staff2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel myCardLayout;
    private javax.swing.JButton panelStaff_btn_addStaff;
    private javax.swing.JButton panelStaff_btn_addStaff1;
    private javax.swing.JButton panelStaff_btn_addStaff2;
    private javax.swing.JButton panelStaff_btn_delStaff;
    private javax.swing.JButton panelStaff_btn_delStaff1;
    private javax.swing.JButton panelStaff_btn_delStaff2;
    private javax.swing.JButton panelStaff_btn_detail1;
    private javax.swing.JButton panelStaff_btn_detail2;
    private javax.swing.JButton panelStaff_btn_detailStaff;
    private javax.swing.JButton panelStaff_btn_updateStaff;
    private javax.swing.JButton panelStaff_btn_updateStaff1;
    private javax.swing.JButton panelStaff_btn_updateStaff2;
    private javax.swing.JComboBox<String> staff_JComboxPosition;
    private javax.swing.JButton staff_JDialogNew_btnAdd;
    private javax.swing.JTextField staff_JDialogNew_staffAddress;
    private javax.swing.JTextField staff_JDialogNew_staffBirthDay;
    private javax.swing.JTextField staff_JDialogNew_staffEmail;
    private javax.swing.JTextField staff_JDialogNew_staffId;
    private javax.swing.JTextField staff_JDialogNew_staffName;
    private javax.swing.JTextField staff_JDialogNew_staffPhone;
    private javax.swing.JDialog staff_JDialog_NewANDEdit;
    private javax.swing.JRadioButton staff_JRadio_Female;
    private javax.swing.JRadioButton staff_JRadio_Male;
    private javax.swing.JRadioButton staff_JRadio_other;
    private javax.swing.ButtonGroup staff_btn_GroupGender;
    private javax.swing.JButton staff_btn_Search;
    private javax.swing.JTextField staff_jtextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
