/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eka Pryhananto
 */
public class TabelModelPinjam extends AbstractTableModel{

    List<Pinjam> lstPinjam;
    
    public TabelModelPinjam(List<Pinjam> lstPinjam){
        this.lstPinjam = lstPinjam;
    }
    
    @Override
    public int getRowCount() {
        return this.lstPinjam.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID Anggota";
            case 1:
                return "Judul Buku";
            case 2:
                return "Tanggal Pinjam";
            case 3:
                return "Tanggal Kembali";
            case 4:
                return "Denda";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0:
                return lstPinjam.get(row).getId_anggota();
            case 1:
                return lstPinjam.get(row).getJudul_buku();
            case 2:
                return lstPinjam.get(row).getTanggal_pinjam();
            case 3:
                return lstPinjam.get(row).getTanggal_kembali();
            case 4:
                return lstPinjam.get(row).getDenda();
            default:
                return null;
        }
    }
    
}
