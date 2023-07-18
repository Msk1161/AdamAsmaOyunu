package adamAsmaca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cizim extends JFrame {
    public Timer timer;
    public Cizim(){
        setTitle("Adam Asmaca");
        setSize(300, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        AdamAsmaMethods czm=new AdamAsmaMethods();
       int cznSayi= czm.hataSayisi;
        //int cznSayi=9;
        switch (cznSayi){
            case 1:
                g.drawLine(50, 40, 250, 40);
                break;
            case 2:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                break;
            case 3:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                break;
            case 4:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                break;
            case 5:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                g.drawRect(90, 240, 120, 150);
                break;
            case 6:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                g.drawRect(90, 240, 120, 150);
                g.drawLine(90,240,50,370); //solKol
                g.drawLine(50,370,30,390); //SolParmak
                g.drawLine(50,370,50,390); //SolParmak
                g.drawLine(50,370,65,390); //SolParmak
                break;
            case 7:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                g.drawRect(90, 240, 120, 150);
                g.drawLine(90,240,50,370); //solKol
                g.drawLine(50,370,30,390); //SolParmak
                g.drawLine(50,370,50,390); //SolParmak
                g.drawLine(50,370,65,390); //SolParmak
                g.drawLine(210,240,250,370); //sagKol
                g.drawLine(250,370,230,390); //SagParmak
                g.drawLine(250,370,250,390); //SagParmak
                g.drawLine(250,370,265,390); //SagParmak

                break;
            case 8:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                g.drawRect(90, 240, 120, 150);
                g.drawLine(90,240,50,370); //solKol
                g.drawLine(50,370,30,390); //SolParmak
                g.drawLine(50,370,50,390); //SolParmak
                g.drawLine(50,370,65,390); //SolParmak
                g.drawLine(210,240,250,370); //sagKol
                g.drawLine(250,370,230,390); //SagParmak
                g.drawLine(250,370,250,390); //SagParmak
                g.drawLine(250,370,265,390); //SagParmak
                g.drawRect(90,390,15,150); //SolAyak
                g.drawLine(90,540,60,550); //SolAyak
                g.drawLine(105,540,75,550); //SolAyak
                g.drawLine(60,550,75,550); //SolAyak
                break;
            case 9:
                g.drawLine(50, 40, 250, 40);
                g.drawLine(150, 40, 150, 90);
                g.drawOval(100,90,100,120);
                g.drawRect(130, 210, 40, 30);
                g.drawRect(90, 240, 120, 150);
                g.drawLine(90,240,50,370); //solKol
                g.drawLine(50,370,30,390); //SolParmak
                g.drawLine(50,370,50,390); //SolParmak
                g.drawLine(50,370,65,390); //SolParmak
                g.drawLine(210,240,250,370); //sagKol
                g.drawLine(250,370,230,390); //SagParmak
                g.drawLine(250,370,250,390); //SagParmak
                g.drawLine(250,370,265,390); //SagParmak
                g.drawRect(90,390,15,150); //SolAyak
                g.drawLine(90,540,60,550); //SolAyak
                g.drawLine(105,540,75,550); //SolAyak
                g.drawLine(60,550,75,550); //SolAyak
                g.drawRect(195,390,15,150); //SagAyak
                g.drawLine(195,540,165,550);  //SagAyak
                g.drawLine(210,540,180,550); //SagAyak
                g.drawLine(165,550,180,550);  //SagAyak

                break;
            default:
                System.out.println("Henuz Hata yapmadiniz");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Cizim();
            }
        });
    }

}
