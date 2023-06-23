package main;

import java.util.ArrayList;
import model.DosenHonorer;
import model.DosenTetap;
import model.InterfaceStatus;
import model.Karyawan;
import model.MahasiswaDoktor;
import model.MahasiswaMagister;
import model.MahasiswaSarjana;
import model.MatkulAmbil;
import model.Matakuliah;
import model.MatakuliahPilihan;
import model.MatkulAjar;
import model.Presensi;
import model.PresensiStaff;
import model.User;
import view.MainMenu;

public class Main {

    public static ArrayList<User> listUser = new ArrayList<>();        
        
    public static void main(String[] args) {
        ArrayList<Presensi> listPresensi = new ArrayList<>();
        ArrayList<Presensi> listPresensi2 = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<>();
        ArrayList<PresensiStaff> listPresensiStaff2 = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
        ArrayList<MatkulAmbil> listMatkulAmbil2 = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar = new ArrayList<>();
        ArrayList<MatkulAjar> listMatkulAjar2 = new ArrayList<>();

        Matakuliah mk1 = new Matakuliah("IF-201", 2, "Strukdat");
        Matakuliah mk2 = new Matakuliah("IF-202", 3, "Algoritma");
        Matakuliah mk3 = new Matakuliah("IF-203", 1, "Basdat");
        MatakuliahPilihan mk4 = new MatakuliahPilihan(10, "IF-204", 2, "Kalkulus");

        System.out.println(mk1.toString());
        System.out.println(mk2.toString());
        System.out.println(mk3.toString());
        System.out.println(mk4.toString());

        Presensi ps1 = new Presensi("5-19-2023", InterfaceStatus.HADIR);
        Presensi ps2 = new Presensi("5-20-2023", InterfaceStatus.ALPHA);
        Presensi ps3 = new Presensi("5-21-2023", InterfaceStatus.HADIR);
        Presensi ps11 = new Presensi("5-19-2023", InterfaceStatus.ALPHA);
        Presensi ps22 = new Presensi("5-20-2023", InterfaceStatus.ALPHA);
        Presensi ps33 = new Presensi("5-21-2023", InterfaceStatus.HADIR);
        PresensiStaff ps4 = new PresensiStaff(2, "5-19-2023", InterfaceStatus.HADIR);
        PresensiStaff ps5 = new PresensiStaff(3, "5-20-2023", InterfaceStatus.HADIR);
        PresensiStaff ps6 = new PresensiStaff(1, "5-21-2023", InterfaceStatus.ALPHA);
        PresensiStaff ps44 = new PresensiStaff(2, "5-19-2023", InterfaceStatus.HADIR);
        PresensiStaff ps55 = new PresensiStaff(2, "5-20-2023", InterfaceStatus.HADIR);
        PresensiStaff ps66 = new PresensiStaff(3, "5-21-2023", InterfaceStatus.HADIR);

        System.out.println();
        System.out.print(ps1.toString());
        System.out.print(ps2.toString());
        System.out.print(ps3.toString());
        System.out.println(ps4.toString());
        System.out.println(ps5.toString());
        System.out.println(ps6.toString());
        
        listPresensi.add(ps1);
        listPresensi.add(ps2);
        listPresensi.add(ps3);
        listPresensi2.add(ps11);
        listPresensi2.add(ps22);
        listPresensi2.add(ps33);
        listPresensiStaff.add(ps4);
        listPresensiStaff.add(ps5);
        listPresensiStaff.add(ps6);
        listPresensiStaff2.add(ps44);
        listPresensiStaff2.add(ps55);
        listPresensiStaff2.add(ps66);

        listMatkulAmbil.add(new MatkulAmbil(80.8, 90.1, 71.2, "IF-201", 2, "Strukdat", listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(81.8, 91.1, 72.2, "IF-202", 3, "Algoritma", listPresensi));
        listMatkulAmbil.add(new MatkulAmbil(82.8, 92.1, 73.2, "IF-203", 1, "Basdat", listPresensi));
        listMatkulAmbil2.add(new MatkulAmbil(44.2, 50.7, 67.5, "IF-201", 2, "Strukdat", listPresensi2));
        listMatkulAmbil2.add(new MatkulAmbil(20, 50, 90.6, "IF-202", 3, "Algoritma", listPresensi2));
        listMatkulAmbil2.add(new MatkulAmbil(30, 60, 37, "IF-203", 1, "Basdat", listPresensi2));

        MahasiswaSarjana matthew = new MahasiswaSarjana("1122001", "Informatika", "Matthew", "Jl. Kopo", "Bandung, 17 Juli 2004", "0852152151", listMatkulAmbil);
        MahasiswaMagister joy = new MahasiswaMagister("Bahaya Gadget", "1122002", "Informatika", "Joy", "Jl. TKI 3", "Bandung, 1 Februari 2004", "0851729512", listMatkulAmbil2);
        MahasiswaDoktor marvel = new MahasiswaDoktor("AI di masa depan", 100, 95.2, 87.5, "1122003", "Informatika", "Marvel", "Jl. Aceh", "Jakarta, 25 Desember 2003", "0857258198");

        System.out.println();
        System.out.println(matthew.toString() + "\n");
        System.out.println(joy.toString() + "\n");
        System.out.println(marvel.toString() + "\n");

        listMatkulAjar.add(new MatkulAjar("IF-201", 2, "Strukdat", listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar("IF-202", 3, "Algoritma", listPresensiStaff));
        listMatkulAjar.add(new MatkulAjar("IF-203", 1, "Basdat", listPresensiStaff));
        listMatkulAjar2.add(new MatkulAjar("IF-201", 2, "Strukdat", listPresensiStaff2));
        listMatkulAjar2.add(new MatkulAjar("IF-202", 3, "Algoritma", listPresensiStaff2));
        listMatkulAjar2.add(new MatkulAjar("IF-203", 1, "Basdat", listPresensiStaff2));

        DosenHonorer hegbert = new DosenHonorer(375000, "Informatika", "1219501", "Hegbert", "Jl. Cibadak", "Bandung, 15 Maret 1987", "2985871821", listMatkulAjar);
        DosenTetap william = new DosenTetap(1500000, "Sistem-Informasi", "1219502", "William", "Jl. Gardujati", "Garut, 19 April 1965", "512809510", listMatkulAjar2);
        Karyawan budi = new Karyawan(250000, "1220707", "Budi", "Jl. Garuda", "Tangerang, 10 Oktober 1980", "151028591", listPresensiStaff2);
        
        System.out.println();
        System.out.println(hegbert.toString() + "\n\n");
        System.out.println(william.toString() + "\n\n");
        
        listUser.add(matthew);
        listUser.add(joy);
        listUser.add(marvel);
        listUser.add(hegbert);
        listUser.add(william);
        listUser.add(budi);
        
        new MainMenu();
    }

}
