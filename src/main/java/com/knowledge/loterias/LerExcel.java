package com.knowledge.loterias;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

public class LerExcel {
    
    static final String fileName = "C:\\Users\\kal_e\\Documents\\Lotofacil_teste.xlsx";
    
    public static void main(String[] args) throws IOException {

        List<Lotofacil> premiados = new ArrayList();

        try {
            FileInputStream arquivo = new FileInputStream(new File(LerExcel.fileName));
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
                premiados.add(facil);
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
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo Excel não encontrado!");
        }
        
        if (premiados.size() == 0) {
            System.out.println("Nenhum resultado encontrado!");
        } else {
            for (Lotofacil premiado : premiados){
                 System.out.println(
                 "| "+
                 premiado.getCel1()+"| "+
                 premiado.getCel2()+"| "+
                 premiado.getCel3()+"| "+
                 premiado.getCel4()+"| "+
                 premiado.getCel5()+"| "+
                 premiado.getCel6()+"| "+
                 premiado.getCel7()+"| "+
                 premiado.getCel8()+"| "+
                 premiado.getCel9()+"| "+
                 premiado.getCel10()+"| "+
                 premiado.getCel11()+"| "+
                 premiado.getCel12()+"| "+
                 premiado.getCel13()+"| "+
                 premiado.getCel14()+"| "+
                 premiado.getCel15()+"| "+
                 premiado.getGan()+" |"
                );
            }
        }
        
    }
}