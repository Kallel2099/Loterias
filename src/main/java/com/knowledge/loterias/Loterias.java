package com.knowledge.loterias;

import com.knowledge.loterias.controls.soNumeros;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Loterias extends javax.swing.JFrame{
    
    String fileName = "C:\\Users\\kal_e\\Documents\\Lotofacil_01.07.23.xlsx";
    List<Lotofacil> sorteios = new ArrayList();
    List<Lotofacil> sorteios2 = new ArrayList();
    List result = new ArrayList();
    ArrayList temp = new ArrayList();
    ArrayList excluir = new ArrayList();
    ArrayList ref = new ArrayList();
    ArrayList buscar = new ArrayList();
    Lotofacil teste = new Lotofacil();
    ArrayList dez = new ArrayList();
    ArrayList cinco = new ArrayList();
    ArrayList nao = new ArrayList();
    DefaultTableModel Tabela;
    int tot = 0;
    int gan = 0;
    int comp = 0;
    int qtd = 0;
    int comb = 0;
    //int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y = 0;
    int n, p, v = 0;
    
    public Loterias() {
        initComponents();
        Tabela = (DefaultTableModel) jTable1.getModel();
        jTextField1.requestFocus();
    }
    
    public List buscar() throws IOException{
        try {
            FileInputStream arquivo = new FileInputStream(new File(fileName));
            XSSFWorkbook workbook = new XSSFWorkbook(arquivo);
            Sheet sheetLF = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheetLF.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                if(row.getRowNum() == 0){
                    continue;
                }
                Iterator<Cell> cellIterator = row.cellIterator();
                Lotofacil facil = new Lotofacil();
                sorteios.add(facil);
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getColumnIndex()) {
                    case 0:
                        facil.setCel1((int) cell.getNumericCellValue());
                        break;
                    case 1:
                        facil.setCel2((int) cell.getNumericCellValue());
                        break;
                    case 2:
                        facil.setCel3((int) cell.getNumericCellValue());
                        break;
                    case 3:
                        facil.setCel4((int) cell.getNumericCellValue());
                        break;
                    case 4:
                        facil.setCel5((int) cell.getNumericCellValue());
                        break;
                    case 5:
                        facil.setCel6((int) cell.getNumericCellValue());
                        break;
                    case 6:
                        facil.setCel7((int) cell.getNumericCellValue());
                        break;
                    case 7:
                        facil.setCel8((int) cell.getNumericCellValue());
                        break;
                    case 8:
                        facil.setCel9((int) cell.getNumericCellValue());
                        break;
                    case 9:
                        facil.setCel10((int) cell.getNumericCellValue());
                        break;
                    case 10:
                        facil.setCel11((int) cell.getNumericCellValue());
                        break;
                    case 11:
                        facil.setCel12((int) cell.getNumericCellValue());
                        break;
                    case 12:
                        facil.setCel13((int) cell.getNumericCellValue());
                        break;
                    case 13:
                        facil.setCel14((int) cell.getNumericCellValue());
                        break;
                    case 14:
                        facil.setCel15((int) cell.getNumericCellValue());
                        break;
                    case 15:
                        facil.setGan((int) cell.getNumericCellValue());
                        break;
                    }
                }
            }
            arquivo.close();
            //System.out.println(sorteios);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        }
        return sorteios;
    }
    
    public List combina(){
        comb = 17;
        /*buscar.add(1);
        buscar.add(2);
        buscar.add(3);
        buscar.add(4);
        buscar.add(5);
        buscar.add(6);
        buscar.add(7);
        buscar.add(8);
        buscar.add(9);
        buscar.add(10);
        buscar.add(11);
        buscar.add(12);
        buscar.add(13);
        buscar.add(14);
        buscar.add(15);
        buscar.add(16);
        buscar.add(17);*/
        for (int i = 1; i <= comb; i++) {
            buscar.add(i);
        }
        System.out.println(buscar);
        for (int i = 0; i < comb; i++) {
            temp.add(0);
        }
        
        //for (int i = 0; i < 8; i++) {
            for (int j = 0; j < buscar.size(); j++) {
                temp.set(0, buscar.get(j));
                for (int k = 0; k < buscar.size(); k++) {
                    if (k > j) {
                        temp.set(1, buscar.get(k));
                    }
                    for (int l = 0; l < buscar.size(); l++) {
                        if (l > k) {
                            temp.set(2, buscar.get(l));
                        } else {
                            //continue;
                        }
                        for (int m = 0; m < buscar.size(); m++) {
                            if (m > l) {
                                temp.set(3, buscar.get(m));
                            } else {
                                //continue;
                            }
                            for (int n = 0; n < buscar.size(); n++) {
                                if (n > m) {
                                    temp.set(4, buscar.get(n));
                                } else {
                                    //continue;
                                }
                                for (int o = 0; o < buscar.size(); o++) {
                                    if (o > n) {
                                        temp.set(5, buscar.get(o));
                                    } else {
                                        //break;
                                    }
                                    for (int p = 0; p < buscar.size(); p++) {
                                        if (p > o) {
                                            temp.set(6, buscar.get(p));
                                        }
                                        
                                        for (int q = 0; q < buscar.size(); q++) {
                                            if (q > p) {
                                                temp.set(7, buscar.get(q));
                                            }
                                            
                                            for (int r = 0; r < buscar.size(); r++) {
                                                if (r > q) {
                                                    temp.set(8, buscar.get(r));
                                                }
                                                
                                                for (int s = 0; s < buscar.size(); s++) {
                                                    if (s > r) {
                                                        temp.set(9, buscar.get(s));
                                                    }
                                                    
                                                    for (int t = 0; t < buscar.size(); t++) {
                                                        if (t > s) {
                                                            temp.set(10, buscar.get(t));
                                                        }
                                                        
                                                        for (int u = 0; u < buscar.size(); u++) {
                                                            if (u > t) {
                                                                temp.set(11, buscar.get(u));
                                                            }
                                                            
                                                            for (int v = 0; v < buscar.size(); v++) {
                                                                if (v > u) {
                                                                    temp.set(12, buscar.get(v));
                                                                }
                                                                
                                                                for (int w = 0; w < buscar.size(); w++) {
                                                                    if (w > v) {
                                                                        temp.set(13, buscar.get(w));
                                                                    }
                                                                    
                                                                    for (int x = 0; x < buscar.size(); x++) {
                                                                        if (x > w) {
                                                                            temp.set(14, buscar.get(x));
                                                                            System.out.println(temp);
                                                                            temp.clear();
                                                                            //result.add(temp.clone());
                                                                        }
                                                                        
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            //temp.clear();
        //}
        System.out.println(temp);
        return result;
    }
    
    public List tendencia(){
        try {
            buscar();
        } catch (IOException ex) {
            Logger.getLogger(Loterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        dez.clear();
        cinco.clear();
        nao.clear();
        for (int z = 0; z < 25; z++) {
            dez.add(0);
            cinco.add(0);
            nao.add(z + 1);
        }
        for(Lotofacil achei : sorteios){
            n++;
            temp.add(achei.getCel1());
            temp.add(achei.getCel2());
            temp.add(achei.getCel3());
            temp.add(achei.getCel4());
            temp.add(achei.getCel5());
            temp.add(achei.getCel6());
            temp.add(achei.getCel7());
            temp.add(achei.getCel8());
            temp.add(achei.getCel9());
            temp.add(achei.getCel10());
            temp.add(achei.getCel11());
            temp.add(achei.getCel12());
            temp.add(achei.getCel13());
            temp.add(achei.getCel14());
            temp.add(achei.getCel15());
            //Tendencia nos últimos 10 jogos.
            for (int z = 0; z < 15; z++) {
                for (int z1 = 0; z1 < 25; z1++) {
                    if ((int)temp.get(z) == z1 + 1) {
                        int z2 = (int)dez.get(z1)+1;
                        dez.set(z1, z2);
                    }
                }
            }
            //Tendencia nos últimos 5 jogos.
            if (n > 5) {
                for (int z = 0; z < 15; z++) {
                    for (int z1 = 0; z1 < 25; z1++) {
                        if ((int)temp.get(z) == z1 + 1) {
                            int z2 = (int)cinco.get(z1)+1;
                            cinco.set(z1, z2);
                        }
                    }
                }  
            }
            //Números não sorteados no último jogo.
            if (n == 10) {
                for (int z = 0; z < 15; z++) {
                    for (int i = 0; i < 25; i++) {
                        if ((int)temp.get(z) == i + 1) {
                            nao.set(i, 0);
                        }
                    }
                }
            }
            temp.clear();
        }
        System.out.println(dez);
        System.out.println(cinco);
        System.out.println(nao);
        return result;
    }
    
    public void limpar(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jLabel1.setText("");
        jLabel4.setText("");
        while (Tabela.getRowCount() != 0){
            Tabela.removeRow(0);
        }
        jTextField1.requestFocus();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new soNumeros(2);
        jTextField2 = new soNumeros(2);
        jTextField3 = new soNumeros(2);
        jTextField4 = new soNumeros(2);
        jTextField5 = new soNumeros(2);
        jTextField6 = new soNumeros(2);
        jTextField7 = new soNumeros(2);
        jTextField8 = new soNumeros(2);
        jTextField9 = new soNumeros(2);
        jTextField10 = new soNumeros(2);
        jTextField11 = new soNumeros(2);
        jTextField12 = new soNumeros(2);
        jTextField13 = new soNumeros(2);
        jTextField14 = new soNumeros(2);
        jTextField15 = new soNumeros(2);
        Localizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Sorteados = new javax.swing.JButton();
        Acertadores = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Limpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setNextFocusableComponent(jTextField2);

        jTextField2.setNextFocusableComponent(jTextField3);

        jTextField3.setNextFocusableComponent(jTextField4);

        jTextField4.setNextFocusableComponent(jTextField5);

        jTextField5.setNextFocusableComponent(jTextField6);

        jTextField6.setNextFocusableComponent(jTextField7);

        jTextField7.setNextFocusableComponent(jTextField8);

        jTextField8.setNextFocusableComponent(jTextField9);

        jTextField9.setNextFocusableComponent(jTextField10);

        jTextField10.setNextFocusableComponent(jTextField11);

        jTextField11.setNextFocusableComponent(jTextField12);

        jTextField12.setNextFocusableComponent(jTextField13);

        jTextField13.setNextFocusableComponent(jTextField14);

        jTextField14.setNextFocusableComponent(jTextField15);

        jTextField15.setNextFocusableComponent(Localizar);

        Localizar.setText("Localizar");
        Localizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalizarActionPerformed(evt);
            }
        });

        jLabel1.setEnabled(false);

        jLabel2.setText("Numeros Sorteados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "nº de Sorteios", "Ganhadores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(25);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(1).setMinWidth(25);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(2).setMinWidth(25);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(3).setMinWidth(25);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(4).setMinWidth(25);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(5).setMinWidth(25);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(6).setMinWidth(25);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(7).setMinWidth(25);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(7).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(8).setMinWidth(25);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(8).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(9).setMinWidth(25);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(9).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(10).setMinWidth(25);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(10).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(11).setMinWidth(25);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(11).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(12).setMinWidth(25);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(12).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(13).setMinWidth(25);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(13).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(14).setMinWidth(25);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(25);
            jTable1.getColumnModel().getColumn(14).setMaxWidth(25);
            jTable1.getColumnModel().getColumn(15).setMinWidth(80);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(15).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(16).setMinWidth(70);
            jTable1.getColumnModel().getColumn(16).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(16).setMaxWidth(70);
        }

        Sorteados.setText("Mais Sorteados");
        Sorteados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SorteadosActionPerformed(evt);
            }
        });

        Acertadores.setText("Maior nº de Acertadores");
        Acertadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcertadoresActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Lotofacil");

        Limpar.setText("Limpar");
        Limpar.setMaximumSize(new java.awt.Dimension(73, 23));
        Limpar.setMinimumSize(new java.awt.Dimension(73, 23));
        Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 402, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Sorteados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Acertadores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                        .addComponent(Localizar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sorteados)
                            .addComponent(Acertadores))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Localizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sair))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(562, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalizarActionPerformed
        if (jTextField1.getText().equalsIgnoreCase("") ||
            jTextField2.getText().equalsIgnoreCase("") ||
            jTextField3.getText().equalsIgnoreCase("") ||
            jTextField4.getText().equalsIgnoreCase("") ||
            jTextField5.getText().equalsIgnoreCase("") ||
            jTextField6.getText().equalsIgnoreCase("") ||
            jTextField7.getText().equalsIgnoreCase("") ||
            jTextField8.getText().equalsIgnoreCase("") ||
            jTextField9.getText().equalsIgnoreCase("") ||
            jTextField10.getText().equalsIgnoreCase("") ||
            jTextField11.getText().equalsIgnoreCase("") ||
            jTextField12.getText().equalsIgnoreCase("") ||
            jTextField13.getText().equalsIgnoreCase("") ||
            jTextField14.getText().equalsIgnoreCase("") ||
            jTextField15.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "<html><center>São necessários 15 números para localizar!", "", JOptionPane.DEFAULT_OPTION);
        } else {
            buscar.add(Integer.parseInt(jTextField1.getText()));
            buscar.add(Integer.parseInt(jTextField2.getText()));
            buscar.add(Integer.parseInt(jTextField3.getText()));
            buscar.add(Integer.parseInt(jTextField4.getText()));
            buscar.add(Integer.parseInt(jTextField5.getText()));
            buscar.add(Integer.parseInt(jTextField6.getText()));
            buscar.add(Integer.parseInt(jTextField7.getText()));
            buscar.add(Integer.parseInt(jTextField8.getText()));
            buscar.add(Integer.parseInt(jTextField9.getText()));
            buscar.add(Integer.parseInt(jTextField10.getText()));
            buscar.add(Integer.parseInt(jTextField11.getText()));
            buscar.add(Integer.parseInt(jTextField12.getText()));
            buscar.add(Integer.parseInt(jTextField13.getText()));
            buscar.add(Integer.parseInt(jTextField14.getText()));
            buscar.add(Integer.parseInt(jTextField15.getText()));
            try {
                buscar();
            } catch (IOException ex) {
                Logger.getLogger(Loterias.class.getName()).log(Level.SEVERE, null, ex);
            }
            tot = 0;
            gan = 0;
            result.clear();
            jLabel4.setText("");
            while (Tabela.getRowCount() != 0){
                Tabela.removeRow(0);
            }
            if (sorteios.isEmpty()) {
                JOptionPane.showMessageDialog(null, "<html><center>Nenhuma sorteio encontrado!", "", JOptionPane.DEFAULT_OPTION);
            } else {
                for(Lotofacil achei : sorteios){
                    temp.add((int)(long) achei.getCel1());
                    temp.add((int)(long) achei.getCel2());
                    temp.add((int)(long) achei.getCel3());
                    temp.add((int)(long) achei.getCel4());
                    temp.add((int)(long) achei.getCel5());
                    temp.add((int)(long) achei.getCel6());
                    temp.add((int)(long) achei.getCel7());
                    temp.add((int)(long) achei.getCel8());
                    temp.add((int)(long) achei.getCel9());
                    temp.add((int)(long) achei.getCel10());
                    temp.add((int)(long) achei.getCel11());
                    temp.add((int)(long) achei.getCel12());
                    temp.add((int)(long) achei.getCel13());
                    temp.add((int)(long) achei.getCel14());
                    temp.add((int)(long) achei.getCel15());
                    temp.add((int)(long) achei.getGan());
                    for (int i = 0; i < 15; i++) {
                        if (temp.get(i).equals(buscar.get(i))) {
                            if (i == 14) {
                                result.add(temp.clone());
                                tot++;
                                gan = gan + (Integer.parseInt(temp.get(15).toString()));
                                temp.clear();
                            }
                        } else {
                            temp.clear();
                            break;
                        }
                    }
                }
                if (tot > 1) {
                    jLabel1.setText("Encontrados "+tot+" resultados, com "+gan+" ganhadores no total!");
                } else if (tot == 1 && gan > 1) {
                    jLabel1.setText("Encontrado um único resultado, com "+gan+" ganhadores no total!");
                } else if (tot == 1 && gan == 1) {
                    jLabel1.setText("Encontrado um único resultado, com um único ganhador!");
                } else {
                    jLabel1.setText("Nenhum resultado encontrado. Essa sequencia nunca foi sorteada!");
                }
                buscar.clear();
                result.clear();
                sorteios.clear();
                temp.clear();
            }
        }
    }//GEN-LAST:event_LocalizarActionPerformed

    private void LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_LimparActionPerformed

    private void SorteadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SorteadosActionPerformed
        limpar();
        try {
            buscar();
        } catch (IOException ex) {
            Logger.getLogger(Loterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        comp = 0;
        gan = 0;
        qtd = 0;
        while (Tabela.getRowCount() != 0){
            Tabela.removeRow(0);
        }
        if (sorteios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><center>Nenhuma sorteio encontrado!", "", JOptionPane.DEFAULT_OPTION);
        } else {
            while (!sorteios.isEmpty()){
                ref.clear();
                ref.add((int)(long) sorteios.get(0).getCel1());
                ref.add((int)(long) sorteios.get(0).getCel2());
                ref.add((int)(long) sorteios.get(0).getCel3());
                ref.add((int)(long) sorteios.get(0).getCel4());
                ref.add((int)(long) sorteios.get(0).getCel5());
                ref.add((int)(long) sorteios.get(0).getCel6());
                ref.add((int)(long) sorteios.get(0).getCel7());
                ref.add((int)(long) sorteios.get(0).getCel8());
                ref.add((int)(long) sorteios.get(0).getCel9());
                ref.add((int)(long) sorteios.get(0).getCel10());
                ref.add((int)(long) sorteios.get(0).getCel11());
                ref.add((int)(long) sorteios.get(0).getCel12());
                ref.add((int)(long) sorteios.get(0).getCel13());
                ref.add((int)(long) sorteios.get(0).getCel14());
                ref.add((int)(long) sorteios.get(0).getCel15());
                for (Lotofacil achei : sorteios){
                    temp.clear();
                    temp.add((int)(long) achei.getCel1());
                    temp.add((int)(long) achei.getCel2());
                    temp.add((int)(long) achei.getCel3());
                    temp.add((int)(long) achei.getCel4());
                    temp.add((int)(long) achei.getCel5());
                    temp.add((int)(long) achei.getCel6());
                    temp.add((int)(long) achei.getCel7());
                    temp.add((int)(long) achei.getCel8());
                    temp.add((int)(long) achei.getCel9());
                    temp.add((int)(long) achei.getCel10());
                    temp.add((int)(long) achei.getCel11());
                    temp.add((int)(long) achei.getCel12());
                    temp.add((int)(long) achei.getCel13());
                    temp.add((int)(long) achei.getCel14());
                    temp.add((int)(long) achei.getCel15());
                    temp.add((int)(long) achei.getGan());
                    for (int i = 0; i < 15; i++) {
                        if (temp.get(i).equals(ref.get(i))) {
                            if (i == 14) {
                                gan = gan + (Integer.parseInt(temp.get(15).toString()));
                                qtd++;
                                int index = sorteios.indexOf(achei);
                                excluir.add(index);
                            }
                        } else {
                            break;
                        }
                    }
                }
                teste = new Lotofacil();
                teste.setCel1(sorteios.get(0).getCel1());
                teste.setCel2(sorteios.get(0).getCel2());
                teste.setCel3(sorteios.get(0).getCel3());
                teste.setCel4(sorteios.get(0).getCel4());
                teste.setCel5(sorteios.get(0).getCel5());
                teste.setCel6(sorteios.get(0).getCel6());
                teste.setCel7(sorteios.get(0).getCel7());
                teste.setCel8(sorteios.get(0).getCel8());
                teste.setCel9(sorteios.get(0).getCel9());
                teste.setCel10(sorteios.get(0).getCel10());
                teste.setCel11(sorteios.get(0).getCel11());
                teste.setCel12(sorteios.get(0).getCel12());
                teste.setCel13(sorteios.get(0).getCel13());
                teste.setCel14(sorteios.get(0).getCel14());
                teste.setCel15(sorteios.get(0).getCel15());
                teste.setQtd(qtd);
                teste.setGan(gan);
                sorteios2.add(teste);
                for (int i = 0; i < excluir.size(); i++) {
                    if (comp == 0) {
                        sorteios.remove((int)excluir.get(i));
                        comp++;
                    } else {
                        sorteios.remove((int)excluir.get(i)-comp);
                        comp++;
                    }
                }
                qtd = 0;
                gan = 0;
                comp = 0;
                excluir.clear();
            }
            Collections.sort(sorteios2, Collections.reverseOrder());
            for(Lotofacil s : sorteios2){
                Object[] conteudo = {s.getCel1(), s.getCel2(), s.getCel3(), s.getCel4()
                , s.getCel5(), s.getCel6(), s.getCel7(), s.getCel8(), s.getCel9(), s.getCel10()
                , s.getCel11(), s.getCel12(), s.getCel13(), s.getCel14(), s.getCel15()
                , s.getQtd(), s.getGan()};
                Tabela.addRow(conteudo);
            }
            String t = String.valueOf(Tabela.getRowCount());
            jLabel4.setText(t+" resultados.");
            tot = 0;
            gan = 0;
        }
        temp.clear();
        buscar.clear();
        sorteios.clear();
        sorteios2.clear();
    }//GEN-LAST:event_SorteadosActionPerformed

    private void AcertadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcertadoresActionPerformed
        //combina();
        tendencia();
        System.out.println(result);
        
        /*
        try {
            buscar();
        } catch (IOException ex) {
            Logger.getLogger(Loterias.class.getName()).log(Level.SEVERE, null, ex);
        }
        int comp = 0;
        int gan = 0;
        int qtd = 0;
        while (Tabela.getRowCount() != 0){
            Tabela.removeRow(0);
        }
        if (sorteios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "<html><center>Nenhuma sorteio encontrado!", "", JOptionPane.DEFAULT_OPTION);
        } else {
            while (!sorteios.isEmpty()){
                ref.clear();
                ref.add((int)(long) sorteios.get(0).getCel1());
                ref.add((int)(long) sorteios.get(0).getCel2());
                ref.add((int)(long) sorteios.get(0).getCel3());
                ref.add((int)(long) sorteios.get(0).getCel4());
                ref.add((int)(long) sorteios.get(0).getCel5());
                ref.add((int)(long) sorteios.get(0).getCel6());
                ref.add((int)(long) sorteios.get(0).getCel7());
                ref.add((int)(long) sorteios.get(0).getCel8());
                ref.add((int)(long) sorteios.get(0).getCel9());
                ref.add((int)(long) sorteios.get(0).getCel10());
                ref.add((int)(long) sorteios.get(0).getCel11());
                ref.add((int)(long) sorteios.get(0).getCel12());
                ref.add((int)(long) sorteios.get(0).getCel13());
                ref.add((int)(long) sorteios.get(0).getCel14());
                ref.add((int)(long) sorteios.get(0).getCel15());
                for (Lotofacil achei : sorteios){
                    temp.clear();
                    temp.add((int)(long) achei.getCel1());
                    temp.add((int)(long) achei.getCel2());
                    temp.add((int)(long) achei.getCel3());
                    temp.add((int)(long) achei.getCel4());
                    temp.add((int)(long) achei.getCel5());
                    temp.add((int)(long) achei.getCel6());
                    temp.add((int)(long) achei.getCel7());
                    temp.add((int)(long) achei.getCel8());
                    temp.add((int)(long) achei.getCel9());
                    temp.add((int)(long) achei.getCel10());
                    temp.add((int)(long) achei.getCel11());
                    temp.add((int)(long) achei.getCel12());
                    temp.add((int)(long) achei.getCel13());
                    temp.add((int)(long) achei.getCel14());
                    temp.add((int)(long) achei.getCel15());
                    temp.add((int)(long) achei.getGan());
                    for (int i = 0; i < 15; i++) {
                        if (temp.get(i).equals(ref.get(i))) {
                            if (i == 14) {
                                gan = gan + (Integer.parseInt(temp.get(15).toString()));
                                qtd++;
                                int index = sorteios.indexOf(achei);
                                excluir.add(index);
                            }
                        } else {
                            break;
                        }
                    }
                }
                teste = new Lotofacil();
                teste.setCel1(sorteios.get(0).getCel1());
                teste.setCel2(sorteios.get(0).getCel2());
                teste.setCel3(sorteios.get(0).getCel3());
                teste.setCel4(sorteios.get(0).getCel4());
                teste.setCel5(sorteios.get(0).getCel5());
                teste.setCel6(sorteios.get(0).getCel6());
                teste.setCel7(sorteios.get(0).getCel7());
                teste.setCel8(sorteios.get(0).getCel8());
                teste.setCel9(sorteios.get(0).getCel9());
                teste.setCel10(sorteios.get(0).getCel10());
                teste.setCel11(sorteios.get(0).getCel11());
                teste.setCel12(sorteios.get(0).getCel12());
                teste.setCel13(sorteios.get(0).getCel13());
                teste.setCel14(sorteios.get(0).getCel14());
                teste.setCel15(sorteios.get(0).getCel15());
                teste.setQtd(qtd);
                teste.setGan(gan);
                sorteios2.add(teste);
                for (int i = 0; i < excluir.size(); i++) {
                    if (comp == 0) {
                        sorteios.remove((int)excluir.get(i));
                        comp++;
                    } else {
                        sorteios.remove((int)excluir.get(i)-comp);
                        comp++;
                    }
                }
                qtd = 0;
                gan = 0;
                comp = 0;
                excluir.clear();
            }
            Collections.sort(sorteios2, Collections.reverseOrder());
            for(Lotofacil s : sorteios2){
                Object[] conteudo = {s.getCel1(), s.getCel2(), s.getCel3(), s.getCel4()
                , s.getCel5(), s.getCel6(), s.getCel7(), s.getCel8(), s.getCel9(), s.getCel10()
                , s.getCel11(), s.getCel12(), s.getCel13(), s.getCel14(), s.getCel15()
                , s.getQtd(), s.getGan()};
                Tabela.addRow(conteudo);
            }
        }
        buscar.clear();
        sorteios.clear();
        sorteios2.clear();*/
    }//GEN-LAST:event_AcertadoresActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        int sair = JOptionPane.showConfirmDialog(rootPane, "<html><center>Deseja encerrar a aplicação?<br>", "", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_SairActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loterias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acertadores;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton Localizar;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Sorteados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
