package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class GajiStaffScreen {

    public GajiStaffScreen() {
        showGajiStaff();
    }
    
    private void showGajiStaff(){
        Controller control = new Controller();
        String nik = JOptionPane.showInputDialog(null, "Masukkan NIK : ", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, control.printGS(nik, Main.listUser));
    }
}