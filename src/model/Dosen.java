package model;

import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private ArrayList<MatkulAjar> listMkAjar = new ArrayList<MatkulAjar>();
    private String departemen;

    public Dosen(String departemen, String NIK, String nama, String alamat, String TTL, String telepon) {
        super(NIK, nama, alamat, TTL, telepon);
        this.departemen = departemen;
    }

    public ArrayList<MatkulAjar> getListMkAjar() {
        return listMkAjar;
    }

    public void setListMkAjar(ArrayList<MatkulAjar> listMkAjar) {
        this.listMkAjar = listMkAjar;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString() + "Dosen{" + "listMkAjar=" + listMkAjar + ", departemen=" + departemen + '}';
    }
    
    
}
