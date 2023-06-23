package model;

import java.util.ArrayList;

public class MatkulAjar extends Matakuliah{
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public MatkulAjar(String kode, int sks, String nama, ArrayList<PresensiStaff>listPresensiStaff) {
        super(kode, sks, nama);
        this.listPresensiStaff = listPresensiStaff;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "MatkulAjar{" + "listPresensiStaff=" + listPresensiStaff + '}';
    }
    
    
}
