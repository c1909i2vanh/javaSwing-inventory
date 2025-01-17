/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlkh.testView;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import qlkh.entities.Category;
import qlkh.entities.Products;
import qlkh.entities.Supliers;
import qlkh.entities.Unit;
import qlkh.views.IView;
import qlkh.utils.Constants;
import qlkh.utils.Utils;
import qlkh.utils.pagination.ObjectTableModel;
import qlkh.utils.pagination.PaginatedTableDecorator;
import qlkh.utils.pagination.PaginationDataProvider;

/**
 *
 * @author GIANG
 */
public class ProductsView extends javax.swing.JFrame implements IView {

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userRoleMainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        errName = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUnit = new javax.swing.JLabel();
        messageProduct = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        cbbSuplier = new javax.swing.JComboBox<Supliers>();
        lblSuplier = new javax.swing.JLabel();
        cbbUnit = new javax.swing.JComboBox<Unit>();
        cbbCategory = new javax.swing.JComboBox<Category>();
        lblCate = new javax.swing.JLabel();
        errSuplier = new javax.swing.JLabel();
        errCate = new javax.swing.JLabel();
        errUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userRoleMainPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerPanel.setBackground(new java.awt.Color(51, 0, 51));

        headerLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setText("Product");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1109, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        name.setNextFocusableComponent(cbbUnit);

        btnAdd.setBackground(new java.awt.Color(0, 255, 204));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/add_text_32px.png"))); // NOI18N
        btnAdd.setText(bundle.getString("btnAdd"));
        btnAdd.setActionCommand("Add Unit");
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(204, 255, 204));
        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/edit_40.png"))); // NOI18N
        btnEdit.setText(bundle.getString("btnEdit")
        );
        btnEdit.setFocusPainted(false);
        btnEdit.setMaximumSize(new java.awt.Dimension(134, 40));
        btnEdit.setMinimumSize(new java.awt.Dimension(134, 40));

        btnClear.setBackground(new java.awt.Color(51, 153, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlkh/images/clear_40.png"))); // NOI18N
        btnClear.setText(bundle.getString("btnClear")
        );
        btnClear.setFocusPainted(false);
        btnClear.setMaximumSize(new java.awt.Dimension(134, 40));
        btnClear.setMinimumSize(new java.awt.Dimension(134, 40));

        errName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText(bundle.getString("name")
        );

        lblUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUnit.setText(bundle.getString("cbbUnit"));

        id.setForeground(new java.awt.Color(240, 240, 240));
        id.setOpaque(true);
        id.setRequestFocusEnabled(false);

        cbbSuplier.setNextFocusableComponent(cbbCategory);

        lblSuplier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuplier.setText(bundle.getString("cbbSuplier"));

        cbbUnit.setNextFocusableComponent(cbbSuplier);

        lblCate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCate.setText(bundle.getString("cbbCategory"));

        errSuplier.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        errCate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        errUnit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSuplier))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(errName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(lblCate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(errUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errCate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(messageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblName)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSuplier)
                                    .addComponent(cbbSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnit)
                            .addComponent(cbbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCate)
                            .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errCate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout userRoleMainPanelLayout = new javax.swing.GroupLayout(userRoleMainPanel);
        userRoleMainPanel.setLayout(userRoleMainPanelLayout);
        userRoleMainPanelLayout.setHorizontalGroup(
            userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        userRoleMainPanelLayout.setVerticalGroup(
            userRoleMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userRoleMainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userRoleMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userRoleMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<Category> cbbCategory;
    private javax.swing.JComboBox<Supliers> cbbSuplier;
    private javax.swing.JComboBox<Unit> cbbUnit;
    private javax.swing.JLabel errCate;
    private javax.swing.JLabel errName;
    private javax.swing.JLabel errSuplier;
    private javax.swing.JLabel errUnit;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel id;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblCate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSuplier;
    private javax.swing.JLabel lblUnit;
    private javax.swing.JLabel messageProduct;
    private javax.swing.JTextField name;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JPanel userRoleMainPanel;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form GiangTestFrame
     */
    ResourceBundle bundle;
    private static Map<Integer, String> suplierMap = new HashMap<>();
    private static Map<Integer, String> unitMap = new HashMap<>();
    private static Map<Integer, String> cateMap = new HashMap<>();
    private static int[] pageSizes = new int[]{10, 20, 50, 75, 100};
    private static final int defaultPageSize = pageSizes[0];
    //button để hiện phân trang maximum 7
    private static final int maxPagingCompToShow = 7;
    private static List<Products> products = new ArrayList<>();
    private static List<Unit> listUnits = new ArrayList<>();
    private static List<Category> listCategories = new ArrayList<>();
    private static List<Supliers> listSupliers = new ArrayList<>();

    JTable tblProducts;
    PaginatedTableDecorator<Products> paginatedDecorator;

    public ProductsView() {
        //  Locale local = Utils.getLocale();
        Locale local = Utils.getLocale();
        setResourceBundle(local);
        initComponents();

    }

    // Show view with list Suplier on Suplier Table
    public void showView(List<Products> products) {
        this.setVisible(true);
        setEnableBtnEdit(true);
        setEnableBtnEdit(false);
        loadAllProducts(products);

    }

    private static TableModel createObjectDataModel() {
        return new ObjectTableModel<Products>() {
            @Override
            public Object getValueAt(Products product, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return product.getId();
                    case 1:
                        return product.getName();
                    case 2:
                        return suplierMap.get(product.getIdSuplier());
                    case 3:
                        return cateMap.get(product.getIdCate());
                    case 4:
                        return unitMap.get(product.getIdUnit());
                }
                return null;
            }

            @Override
            public int getColumnCount() {
                return Constants.HEADER_PRODUCT_TABLE.length;
            }

            @Override
            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return Constants.HEADER_PRODUCT_TABLE[0];
                    case 1:
                        return Constants.HEADER_PRODUCT_TABLE[1];
                    case 2:
                        return Constants.HEADER_PRODUCT_TABLE[2];
                    case 3:
                        return Constants.HEADER_PRODUCT_TABLE[3];
                    case 4:
                        return Constants.HEADER_PRODUCT_TABLE[4];
                }
                return null;
            }

        };
    }

    private static PaginationDataProvider<Products> createDataProvider() {

        return new PaginationDataProvider<Products>() {
            String searchText;

            @Override
            public String getSearchText() {
                return searchText;
            }

            @Override
            public void setSearchText(String searchText) {
                this.searchText = searchText;
            }

            @Override
            public int getTotalRowCount(boolean isSearch) {
                return (isSearch == false ? products.size() : getListsSearchByText().size());
            }

            @Override
            public List<Products> getRows(int startIndex, int endIndex, boolean isSearch) {

                if (startIndex < endIndex) {
                    if (isSearch == false) {
                        return products.subList(startIndex, endIndex);
                    } else {
                        List<Products> newLists = getListsSearchByText();
                        return newLists.subList(startIndex, endIndex);
                    }
                }
                return new ArrayList<>();
            }

            @Override
            public List<Products> getListsSearchByText() {

                List<Products> newLists = new ArrayList<>();
                for (Products em : products) {
                    if (String.valueOf(em.getId()).contains(searchText) || em.getName().contains(searchText) ) {
                        newLists.add(em);
                    }
                }
                return newLists;
            }

            @Override
            public void setList(List<Products> lists) {
                products = lists;
            }

        };

    }

    public void loadAllUnits(List<Unit> units) {
        if (listUnits.isEmpty() == true) {
            listUnits = units;
        }
        Unit numberOneUnit = new Unit(0, "");
        cbbUnit.addItem(numberOneUnit);
        for (Unit un : units) {

            if (un.getStatus() > 0) {
                cbbUnit.addItem(un);
            }
            unitMap.put(un.getId(), un.getName());
        }
    }

    public void loadAllSupliers(List<Supliers> supliers) {
        if (listSupliers.isEmpty() == true) {
            listSupliers = supliers;
        }
        Supliers numberOneSuplier = new Supliers(0, "");
        cbbSuplier.addItem(numberOneSuplier);
        for (Supliers sup : supliers) {
            if (sup.getStatus() > 0) {
                cbbSuplier.addItem(sup);
            }
            suplierMap.put(sup.getId(), sup.getName());
        }

    }

    public void loadAllCategories(List<Category> categories) {
        if (listCategories.isEmpty() == true) {
            listCategories = categories;
        }
        Category numberOneCate = new Category(0, "");
        cbbCategory.addItem(numberOneCate);
        for (Category cate : categories) {
            if (cate.getStatus() > 0) {
                cbbCategory.addItem(cate);
            }
            cateMap.put(cate.getId(), cate.getName());

        }
    }
 

    // Set ResourceBundle to this view
    private void setResourceBundle(Locale locale) {
        //Set Resources Bundle theo local 
        bundle = ResourceBundle.getBundle("qlkh/utils/languages", locale);

    }

    @Override
    public List<Object> getElements(boolean isInsert) {
        List<Object> objects = new ArrayList<>();
        // set Name text field
        id.setName("id");
        name.setName("name");
        cbbSuplier.setName("suplier");
        cbbUnit.setName("unit");
        cbbCategory.setName("category");
        // add object to map
        objects.add(id);
        objects.add(name);
        objects.add(cbbSuplier);
        objects.add(cbbUnit);
        objects.add(cbbCategory);

        return objects;
    }

    @Override
    public void showErrors(Map<String, String> errors) {
        //get error messages
        String errorNameMsg = ((errors.get("name") == null) ? "" : errors.get("name"));
        String errUnitMsg = ((errors.get("unit") == null) ? "" : errors.get("unit"));
        String errSuplierMsg = ((errors.get("suplier") == null) ? "" : errors.get("suplier"));
        String errCateMsg = ((errors.get("category") == null) ? "" : errors.get("category"));
        //Show messages
        showErrorMessage(errName, errorNameMsg);
        showErrorMessage(errUnit, errUnitMsg);
        showErrorMessage(errSuplier, errSuplierMsg);
        showErrorMessage(errCate, errCateMsg);

    }

    public Products getProduct(boolean isInsert, String productId) {
        Unit unit = (Unit) cbbUnit.getSelectedItem();
        Supliers suplier = (Supliers) cbbSuplier.getSelectedItem();
        Category category = (Category) cbbCategory.getSelectedItem();
        String proId = category.getCharacters() + suplier.getCharacters() + productId;
        Products product = new Products();
        product.setId((isInsert == true) ? proId : id.getText());
        product.setName(name.getText());
        product.setIdUnit(unit.getId());
        product.setIdSuplier(suplier.getId());
        product.setIdCate(category.getId());
        return product;
    }

    public void showErrorMessage(JLabel label, String err) {
        label.setText(err);
        label.setForeground(Color.red);
    }

    // Load list Unit on Unit Table
    public void loadAllProducts(List<Products> pros) {
        // set data for List<Product> lists
        this.products = pros;
        tblProducts = new JTable(createObjectDataModel());
        tblProducts.setAutoCreateRowSorter(true);
        PaginationDataProvider<Products> dataProvider = createDataProvider();
        paginatedDecorator = PaginatedTableDecorator.decorate(tblProducts,
                dataProvider, pageSizes, defaultPageSize, maxPagingCompToShow);
        tablePanel.removeAll();
        tablePanel.setLayout(new CardLayout());
        tablePanel.add(paginatedDecorator.getContentPanel());
    }

    // Add event to button addNewUnit
    public void addBtnAddAction(ActionListener listener) {
        btnAdd.addActionListener(listener);
    }

    public void addBtnEditAction(ActionListener listener) {
        btnEdit.addActionListener(listener);
    }

    public void addBtnClearAction(ActionListener listener) {
        btnClear.addActionListener(listener);
    }

    public void addTableMouseListener(MouseListener listener) {
        paginatedDecorator.addTableMouseListener(listener);
    }

    public void addComboboxStateChangedListener(ItemListener listener) {
        cbbUnit.addItemListener(listener);
    }
   
    // Get text from txtNewUnitField
    private void showErrMess(String message, int color) {
        errName.setText(bundle.getString(message));
        errName.setForeground((color == Constants.FLAG_SUCCESS) ? Constants.COLOR_SUCCESS : Constants.COLOR_ERROR);
    }

    public void showMessage(String message, int color) {
        messageProduct.setText(bundle.getString(message));
        messageProduct.setForeground((color == Constants.FLAG_SUCCESS) ? Constants.COLOR_SUCCESS : Constants.COLOR_ERROR);
    }

    public void focusTxtUnitField() {
        name.requestFocus();
    }

//    public Unit getEditUnit() {
//        int row = tblSuplier.getSelectedRow();
//        if (row < 0) {
//            return null;
//        }
//        return (Unit) tblSuplier.getModel().getValueAt(row, 1);
//    }
    public String getEditProductId() {
        int row = tblProducts.getSelectedRow();
        if (row < 0) {
            return null;
        }
        return tblProducts.getModel().getValueAt(row, 0).toString();
    }

    private void setEnableBtnAddNew(boolean value) {
        btnAdd.setEnabled(value);
    }

    private void setEnableBtnEdit(boolean value) {
        btnEdit.setEnabled(value);
    }


    public int showDialog(JFrame frame, String message, String title, int typeIcon) {
        int iconNumber = (typeIcon == JOptionPane.QUESTION_MESSAGE) ? JOptionPane.QUESTION_MESSAGE : JOptionPane.ERROR_MESSAGE;
        return JOptionPane.showConfirmDialog(frame, bundle.getString(message), bundle.getString(title), JOptionPane.OK_CANCEL_OPTION, iconNumber);
    }

    public void clearView(boolean clearAll) {
        setEnableBtnAddNew(true);
        setEnableBtnEdit(false);
        if (clearAll == true) {
            messageProduct.setText("");
        }
        id.setText("");
        name.setText("");
        cbbUnit.setSelectedIndex(0);
        cbbSuplier.setSelectedIndex(0);
        cbbCategory.setSelectedIndex(0);
        name.requestFocus();
    }

    public void clearError() {
        errName.setText("");
        errCate.setText("");
        errSuplier.setText("");
        errUnit.setText("");
        messageProduct.setText("");
         name.requestFocus();
    }

    public void showUpdateProduct(Products product) {
        id.setText(product.getId());
        name.setText(product.getName());
        int unitId = product.getIdUnit();
        int suplierId = product.getIdSuplier();
        int categoryId = product.getIdCate();

        for (Unit un : listUnits) {
            if (un.getId() == unitId && un.getStatus() > 0) {
                cbbUnit.setSelectedItem(un);
                break;
            } else {
                cbbUnit.setSelectedIndex(0);
            }
        }
        for (Supliers sup : listSupliers) {
            if (sup.getId() == suplierId && sup.getStatus() > 0) {
                cbbSuplier.setSelectedItem(sup);
                break;
            } else {
                cbbSuplier.setSelectedIndex(0);
            }
        }
        for (Category cate : listCategories) {
            if (cate.getId() == categoryId && cate.getStatus() > 0) {
                cbbCategory.setSelectedItem(cate);
                break;
            } else {
                cbbCategory.setSelectedIndex(0);
            }
        }
        setEnableBtnAddNew(false);
        setEnableBtnEdit(true);
    }

    public String getEditId() {
        return id.getText();

    }
}
