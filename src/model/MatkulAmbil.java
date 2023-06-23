package model;

import java.util.ArrayList;

public class MatkulAmbil extends Matakuliah {

    private ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    private double n1, n2, n3;

    public MatkulAmbil(double n1, double n2, double n3, String kode, int sks, String nama, ArrayList<Presensi> listPresensi) {
        super(kode, sks, nama);
        this.listPresensi = listPresensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString() + "listPresensi=" + listPresensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}' + "\n";
    }
    
    
}
