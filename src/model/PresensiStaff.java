package model;

public class PresensiStaff extends Presensi{
    int jam;

    public PresensiStaff(int jam, String tanggal, int status) {
        super(tanggal, status);
        this.jam = jam;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return super.toString() + "PresensiStaff{" + "jam=" + jam + '}';
    }

    
    
}
