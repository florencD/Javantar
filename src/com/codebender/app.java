package com.codebender;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class app {

    private JPanel panel;
    private JLabel help1;
    private JLabel help2;
    private JLabel help3;
    private JLabel point;
    private JTextField A;
    private JTextField B;
    private JTextField C;
    private JTextField D;
    private JButton go;
    private JTextField q;

    int callq;

    public void init(){
        callq = 0 ;
    }
// image
    int count = 0;
    String[] img = {"../panel1.png"};

    int peopel = 0;
    String[] imgpeopel = {"/peopelx.png"};

    int x50 = 0;
    String[] img50 = {"/50x.png"};

    int phone;
    String[] imgphone = {"/phonex.png"};



    int correct1 = 0;
    String[] imgcorrect1 = {"/panel1.png"};

    int correct2 = 0;
    String[] imgcorrect2 = {"/panel2.png"};

    int correct3 = 0;
    String[] imgcorrect3 = {"/panel3.png"};

    int correct4 = 0;
    String[] imgcorrect4 = {"/panel4.png"};

    int correct5 = 0;
    String[] imgcorrect5 = {"/panel5.png"};

    int correct6 = 0;
    String[] imgcorrect6 = {"/panel6.png"};

    int correct7 = 0;
    String[] imgcorrect7 = {"/panel7.png"};

    int correct8 = 0;
    String[] imgcorrect8 = {"/panel8.png"};

    int correct9 = 0;
    String[] imgcorrect9 = {"/panel9.png"};

    int correct10 = 0;
    String[] imgcorrect10 = {"/panel10.png"};

    int correct11 = 0;
    String[] imgcorrect11 = {"/panel11.png"};

    int correct12 = 0;
    String[] imgcorrect12 = {"/panel12.png"};

    int correct13 = 0;
    String[] imgcorrect13 = {"/panel13.png"};

    int correct14 = 0;
    String[] imgcorrect14 = {"/panel14.png"};

    int correct15 = 0;
    String[] imgcorrect15 = {"/panel15.png"};

//end of img


    public app() {

        q.setText("Welcome to Javantar");
        A.setText("                    ");
        B.setText("                    ");
        C.setText("                    ");
        D.setText("                    ");

        go.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);
                callq = callq + 1;

                if (callq == 1) {
                    q.setText("what is 1");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 2) {
                    q.setText("what is 2");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 3) {
                    q.setText("what is 3");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 4) {
                    q.setText("what is 4");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 5) {
                    q.setText("what is 5");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 6) {
                    q.setText("what is 6");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 7) {
                    q.setText("what is 7");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 8) {
                    q.setText("what is 8");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 9) {
                    q.setText("what is 9");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 10) {
                    q.setText("what is 10");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 11) {
                    q.setText("what is 11");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 12) {
                    q.setText("what is 12");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 13) {
                    q.setText("what is 13");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 14) {
                    q.setText("what is 14");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }

                if (callq == 15) {
                    q.setText("what is 15");
                    A.setText("A:         9           ");
                    B.setText("B:         6           ");
                    C.setText("C:         7           ");
                    D.setText("D:         10          ");
                }


            }

        }); // mouse listener

        // help 1
        help1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                super.mouseClicked(e);

                ImageIcon[] list = new ImageIcon[1];
                ImageIcon[] imagelist1 = new ImageIcon[1];
                for (int i=0;i< imagelist1.length;i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + img50[i]));
                }

                if(x50<0 ) {
                    x50 =1;
                }
                if(x50 >= 0 && x50 < img50.length){
                    help1.setIcon(imagelist1[x50]);
                    x50++;
                }

            }
        });

        help2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                ImageIcon[] list = new ImageIcon[1];
                ImageIcon[] imagelist1 = new ImageIcon[1];
                for (int i=0;i< imagelist1.length;i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgpeopel[i]));
                }

                if(peopel<0 ) peopel =1;
                if(peopel >= 0 && peopel < imgpeopel.length){
                    help2.setIcon(imagelist1[peopel]);
                    peopel++;
                }


            }
        });
        A.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if ( callq == 1 && A.isFocusable()){
                    A.setOpaque(true);
                    A.setForeground(Color.BLACK);
                    A.setBackground(Color.GREEN);

                    B.setOpaque(true);
                    B.setForeground(Color.WHITE);
                    B.setBackground(Color.BLACK);

                    C.setOpaque(true);
                    C.setForeground(Color.WHITE);
                    C.setBackground(Color.BLACK);

                    D.setOpaque(true);
                    D.setForeground(Color.WHITE);
                    D.setBackground(Color.BLACK);

                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i=0;i< imagelist1.length;i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect1[i]));
                    }

                    if(correct1<0) correct1 =1;
                    if(correct1 >= 0 && correct1 < imgcorrect1.length){
                        point.setIcon(imagelist1[correct1]);
                        correct1++;
                    }
                }
            }
        });
        help3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                ImageIcon[] list = new ImageIcon[1];
                ImageIcon[] imagelist1 = new ImageIcon[1];
                for (int i=0;i< imagelist1.length;i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgphone[i]));
                }

                if(phone<0 ) {
                    phone =1;
                }
                if(phone >= 0 && phone < imgphone.length){
                    help3.setIcon(imagelist1[phone]);
                    phone++;
                }
            }
        });
    } // end app

    public static void main(String[] args){
        JFrame frame = new JFrame("app");
        frame.setContentPane(new app().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
