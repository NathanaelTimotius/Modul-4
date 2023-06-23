package model;

import java.util.ArrayList;

public class Karyawan extends Staff {

    private double salary;
    private ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public Karyawan(double salary, String NIK, String nama, String alamat, String TTL, String telepon,  ArrayList<PresensiStaff>listPresensiStaff) {
        super(NIK, nama, alamat, TTL, telepon);
        this.salary = salary;
        this.listPresensiStaff = listPresensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "Karyawan{" + "salary=" + salary + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

}
