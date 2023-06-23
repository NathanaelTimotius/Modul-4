package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class NAScreen {

    public NAScreen() {
        showNilaiAkhir();
    }
    
    private void showNilaiAkhir(){
        Controller control = new Controller();
        String NIM = JOptionPane.showInputDialog(null, "Masukkan nim : ", JOptionPane.QUESTION_MESSAGE);
        String kodeMk = JOptionPane.showInputDialog(null, "Masukkan Kode MK : ", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, control.printNilaiAkhir(NIM, kodeMk, Main.listUser));
    }
}
