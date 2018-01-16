package com.codebender;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class app {
//var
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
    private JButton reset;

    int callq = 0;

    public void init(){
        callq = 0 ;
    }

    //end of var


    // image

    int count = 0;
    String[] img = {"/panel1.png"};

    int over = 0;
    String[] imgover = {"/panel.png"};

    int peopel = 0;
    String[] imgpeopel = {"peopelx.png"};

    int x50 = 0;
    String[] img50 = {"/50x.png"};

    int phone;
    String[] imgphone = {"/phonex.png"};

    int peopelr = 0;
    String[] imgpeopelr = {"/peopel.png"};

    int x50r = 0;
    String[] img50r = {"/50.png"};

    int phoner;
    String[] imgphoner = {"/phone.png"};


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

    //end of image


    // format the field of the button

    public void format (){
    A.setOpaque(true);
    A.setForeground(Color.YELLOW);
    A.setBackground(Color.BLUE);

    B.setOpaque(true);
    B.setForeground(Color.YELLOW);
    B.setBackground(Color.BLUE);

    C.setOpaque(true);
    C.setForeground(Color.YELLOW);
    C.setBackground(Color.BLUE);

    D.setOpaque(true);
    D.setForeground(Color.YELLOW);
    D.setBackground(Color.BLUE);

    q.setOpaque(true);
    q.setForeground(Color.WHITE);
    q.setBackground(Color.BLACK);
}

    public void GameOver(){
        q.setForeground(Color.RED);
        q.setText("Game Over");
        callq = 1 ;

        ImageIcon[] list = new ImageIcon[1];
        ImageIcon[] imagelist1 = new ImageIcon[1];
        for (int i = 0; i < imagelist1.length; i++) {
            imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgover[i]));
        }

        if (over < 0) {
            over = 1;
        }
        if (over >= 0 && over < imgover.length) {
            point.setIcon(imagelist1[over]);
            over++;
        }


    }
    // end of the field
    //todov
    muzike
    //Functions

    public void Atrue(){

    A.setOpaque(true);
        callq = callq + 1;


        A.setForeground(Color.gray);
        A.setBackground(Color.GREEN);
        //[221,213,202]
        B.setOpaque(true);
        B.setForeground(Color.WHITE);
        B.setBackground(Color.BLACK);

        C.setOpaque(true);
        C.setForeground(Color.WHITE);
        C.setBackground(Color.BLACK);

        D.setOpaque(true);
        D.setForeground(Color.WHITE);
        D.setBackground(Color.BLACK);
    }

    public void aClickedBtrue(){

        B.setOpaque(true);
        B.setForeground(Color.gray);
        B.setBackground(Color.GREEN);
        //[221,213,202]
        A.setOpaque(true);
        A.setForeground(Color.RED);
        A.setBackground(Color.BLACK);

        C.setOpaque(true);
        C.setForeground(Color.WHITE);
        C.setBackground(Color.BLACK);

        D.setOpaque(true);
        D.setForeground(Color.WHITE);
        D.setBackground(Color.BLACK);

        GameOver();
    }

    public void aClickedCtrue(){

        C.setOpaque(true);
        C.setForeground(Color.gray);
        C.setBackground(Color.GREEN);
        //[221,213,202]
        B.setOpaque(true);
        B.setForeground(Color.WHITE);
        B.setBackground(Color.BLACK);

        A.setOpaque(true);
        A.setForeground(Color.RED);
        A.setBackground(Color.BLACK);

        D.setOpaque(true);
        D.setForeground(Color.WHITE);
        D.setBackground(Color.BLACK);

        GameOver();
    }

    public void aClickedDtrue(){

        D.setOpaque(true);
        D.setForeground(Color.gray);
        D.setBackground(Color.GREEN);
        //[221,213,202]
        B.setOpaque(true);
        B.setForeground(Color.WHITE);
        B.setBackground(Color.BLACK);

        C.setOpaque(true);
        C.setForeground(Color.WHITE);
        C.setBackground(Color.BLACK);

        A.setOpaque(true);
        A.setForeground(Color.RED);
        A.setBackground(Color.BLACK);

        GameOver();
    }

    public void Btrue(){
        callq = callq + 1;

        B.setOpaque(true);
        B.setForeground(Color.gray);
        B.setBackground(Color.GREEN);
        //[221,213,202]
        A.setOpaque(true);
        A.setForeground(Color.WHITE);
        A.setBackground(Color.BLACK);

        C.setOpaque(true);
        C.setForeground(Color.WHITE);
        C.setBackground(Color.BLACK);

        D.setOpaque(true);
        D.setForeground(Color.WHITE);
        D.setBackground(Color.BLACK);


    }

    public void bClickedAtrue(){

        A.setOpaque(true);
        A.setForeground(Color.BLACK);
        A.setBackground(Color.GREEN);

        B.setOpaque(true);
        B.setForeground(Color.RED);
        B.setBackground(Color.BLACK);

        C.setOpaque(true);
        C.setForeground(Color.WHITE);
        C.setBackground(Color.BLACK);

        D.setOpaque(true);
        D.setForeground(Color.WHITE);
        D.setBackground(Color.BLACK);

        GameOver();
        }

    public void bClickedCtrue(){

            C.setOpaque(true);
            C.setForeground(Color.gray);
            C.setBackground(Color.GREEN);
            //[221,213,202]
            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

            B.setOpaque(true);
            B.setForeground(Color.RED);
            B.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.WHITE);
            D.setBackground(Color.BLACK);

            GameOver();
            }

    public void bClickedDtrue(){
            if (callq == 1 && B.isFocusable()) {
            D.setOpaque(true);
            D.setForeground(Color.gray);
            D.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.RED);
            B.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.WHITE);
            C.setBackground(Color.BLACK);

            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);



                GameOver();
            }
            }

    public void Ctrue(){
        callq = callq + 1;

        C.setOpaque(true);
            C.setForeground(Color.gray);
            C.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.WHITE);
            D.setBackground(Color.BLACK);



            }

    public void cClikedAtrue(){

            A.setOpaque(true);
            A.setForeground(Color.gray);
            A.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.RED);
            C.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.WHITE);
            D.setBackground(Color.BLACK);

             GameOver();
            }

    public void cClikedBtrue(){

            B.setOpaque(true);
            B.setForeground(Color.gray);
            B.setBackground(Color.GREEN);
            //[221,213,202]
            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.RED);
            C.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.WHITE);
            D.setBackground(Color.BLACK);

             GameOver();
            }

    public void cClikedDtrue(){

            D.setOpaque(true);
            D.setForeground(Color.gray);
            D.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.RED);
            C.setBackground(Color.BLACK);

            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

                 GameOver();
            }

    public void Dtrue(){
        callq = callq + 1;

        D.setOpaque(true);
            D.setForeground(Color.gray);
            D.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.WHITE);
            C.setBackground(Color.BLACK);

            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);


            }

    public void dClikedAtrue(){

            A.setOpaque(true);
            A.setForeground(Color.gray);
            A.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.WHITE);
            C.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.RED);
            D.setBackground(Color.BLACK);

             GameOver();
            }

    public void dClikedBtrue(){

            B.setOpaque(true);
            B.setForeground(Color.gray);
            B.setBackground(Color.GREEN);
            //[221,213,202]
            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

            C.setOpaque(true);
            C.setForeground(Color.WHITE);
            C.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.RED);
            D.setBackground(Color.BLACK);

             GameOver();
            }

    public void dClikedCtrue(){

            C.setOpaque(true);
            C.setForeground(Color.gray);
            C.setBackground(Color.GREEN);
            //[221,213,202]
            B.setOpaque(true);
            B.setForeground(Color.WHITE);
            B.setBackground(Color.BLACK);

            A.setOpaque(true);
            A.setForeground(Color.WHITE);
            A.setBackground(Color.BLACK);

            D.setOpaque(true);
            D.setForeground(Color.RED);
            D.setBackground(Color.BLACK);

              GameOver();
            }

    //End Functions

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
                if(callq == 0){
                    callq = 1;
                } else if (callq == 1) {
                    format();
                    q.setText("What is correct syntax for main method of a java class?");
                    A.setText("A: public static int main(String[] args");
                    B.setText("B: public static void main(String args)");
                    C.setText("C: *public static void main(String[] args)");
                    D.setText("D: private static void main(String[] args)");

                }

               else if (callq == 2) {
                    format();
                    q.setText("String is an___?");
                    A.setText("A: *Class");
                    B.setText("B: Variable");
                    C.setText("C: Array");
                    D.setText("D: Data type");
                }

                else if (callq == 3) {
                    format();
                    q.setText("Which of these operators is used to allocate memory to array variable in Java?");
                    A.setText("A: malloc");
                    B.setText("B: alloc");
                    C.setText("C: *new");
                    D.setText("D: new malloc");
                }

                else if (callq == 4) {
                    format();
                    q.setText("Which of the following is not OOPS concept in Java?");
                    A.setText("A: Inheritance");
                    B.setText("B: Encapsulation");
                    C.setText("C: Polymorphism");
                    D.setText("D: *Compilation");
                }

                else if (callq == 5) {
                    format();
                    q.setText("What is the process of defining more than one method in a class differentiated by method signature?");
                    A.setText("A: Function overriding");
                    B.setText("B: *Function overloading");
                    C.setText("C: Function doubling");
                    D.setText("D: None of the mentioned");
                }

                else if (callq == 6) {
                    format();
                    q.setText("Which of this access specifies can be used for a class so that its members can be accessed by a different class in the same package?");
                    A.setText("A: Public");
                    B.setText("B: Protected");
                    C.setText("C: No Modifier");
                    D.setText("D: *All of the mentioned ");
                }

                else if (callq == 7) {
                    format();
                    q.setText("Which of the following is correct way of importing an entire package ëpkgí?");
                    A.setText("A:import pkg");
                    B.setText("B:Import pkg");
                    C.setText("C: *import pkg.* ");
                    D.setText("D:Import pkg.* ");
                }

                else if (callq == 8) {
                    format();
                    q.setText("What would be behaviour if constructor has a return type?");
                    A.setText("A: *Compilation error");
                    B.setText("B: Runtime error");
                    C.setText("C: Compilation and runs successfully");
                    D.setText("D: Only String return type is allowed");
                }

                else if (callq == 9) {
                    format();
                    q.setText("Which of these can not be used for a variable name in Java?");
                    A.setText("A: identifier");
                    B.setText("B: *keywords");
                    C.setText("C: identifier and keywords");
                    D.setText("D: none of the above");
                }

                else if (callq == 10) {
                    format();
                    q.setText("Which of these have highest precedence?");
                    A.setText("A: ()"); // correct
                    B.setText("B: ++");
                    C.setText("C: *");
                    D.setText("D: >>");
                }

                else if (callq == 11) {
                    format();
                    q.setText("Where is array stored in memory?");
                    A.setText("A: *heap space");
                    B.setText("B: stack space");
                    C.setText("C: heap space and stack space");
                    D.setText("D: first generation memory");
                }

                else if (callq == 12) {
                    format();
                    q.setText("Which of these is not a correct statement?");
                    A.setText("A: Every class containing abstract method must be declared abstract");
                    B.setText("B: Abstract class defines only the structure of the class not its implementation");
                    C.setText("C: *Abstract class can be initiated by new operator");
                    D.setText("D: Abstract class can be inherited");
                }

                else if (callq == 13) {
                    format();
                    q.setText("Which function is used to perform some action when the object is to be destroyed?");
                    A.setText("A: *finalize()");
                    B.setText("B: delete()");
                    C.setText("C: main()");
                    D.setText("D: none of the above");
                }

                else if (callq == 14) {
                    format();
                    q.setText("Which of these cannot be declared static?");
                    A.setText("A: class");
                    B.setText("B: *object");
                    C.setText("C: variable");
                    D.setText("D: method");
                }

                else if (callq == 15) {
                    format();
                    q.setText("Which of the following package stores all the simple data types in java?");
                    A.setText("A: *lang");
                    B.setText("B: java");
                    C.setText("C: util");
                    D.setText("D: java.packages");
                } else{

                    format();
                    q.setText("You Are the New Javantar!");
                    A.setText("    ");
                    B.setText("    ");
                    C.setText("    ");
                    D.setText("    ");
                    callq = 0;
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
                for (int i = 0; i < imagelist1.length; i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + img50[i]));
                }

                if (x50 < 0) {
                    x50 = 1;
                }
                if (x50 >= 0 && x50 < img50.length) {
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
                for (int i = 0; i < imagelist1.length; i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgpeopel[i]));
                }

                if (peopel < 0) peopel = 1;
                if (peopel >= 0 && peopel < imgpeopel.length) {
                    help2.setIcon(imagelist1[peopel]);
                    peopel++;
                }


            }
        });

        help3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                ImageIcon[] list = new ImageIcon[1];
                ImageIcon[] imagelist1 = new ImageIcon[1];
                for (int i = 0; i < imagelist1.length; i++) {
                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgphone[i]));
                }

                if (phone < 0) {
                    phone = 1;
                }
                if (phone >= 0 && phone < imgphone.length) {
                    help3.setIcon(imagelist1[phone]);
                    phone++;
                }
            }
        });

        A.addMouseListener(new MouseAdapter() {
            //todov
            @Override
            public void mouseClicked(MouseEvent e) {
                if (callq == 1 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect1[i]));
                    }

                    if (correct1 < 0) {
                        correct1 = 1;
                    }
                    if (correct1 >= 0 && correct1 < imgcorrect1.length) {
                        point.setIcon(imagelist1[correct1]);
                        correct1++;
                    }

                } else if (callq == 2 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect2[i]));
                    }

                    if (correct2 < 0) {
                        correct2 = 1;
                    }
                    if (correct2 >= 0 && correct2 < imgcorrect2.length) {
                        point.setIcon(imagelist1[correct2]);
                        correct2++;
                    }

                } else if (callq == 3 && A.isFocusable()) {

                    aClickedCtrue();

                }else if (callq == 4 && A.isFocusable()) {

                    aClickedDtrue();

                } else if (callq == 5 && A.isFocusable()) {

                    aClickedBtrue();

                } else if (callq == 6 && A.isFocusable()) {

                    aClickedDtrue();

                } else if (callq == 7 && A.isFocusable()) {

                    aClickedCtrue();

                } else if (callq == 8 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect8[i]));
                    }

                    if (correct8 < 0) {
                        correct8 = 1;
                    }
                    if (correct8 >= 0 && correct8 < imgcorrect8.length) {
                        point.setIcon(imagelist1[correct8]);
                        correct8++;
                    }
                } else if (callq == 9 && A.isFocusable()) {

                        aClickedBtrue();

                } else if (callq == 10 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect10[i]));
                    }

                    if (correct10 < 0) {
                        correct10 = 1;
                    }
                    if (correct10 >= 0 && correct10 < imgcorrect10.length) {
                        point.setIcon(imagelist1[correct10]);
                        correct10++;
                    }

                } else if (callq == 11 && A.isFocusable()) {
                        Atrue();
                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect11[i]));
                    }

                    if (correct11 < 0) {
                        correct11 = 1;
                    }
                    if (correct11 >= 0 && correct11 < imgcorrect11.length) {
                        point.setIcon(imagelist1[correct11]);
                        correct11++;
                    }
                } else if (callq == 12 && A.isFocusable()) {

                    aClickedCtrue();

                } else if (callq == 13 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect13[i]));
                    }

                    if (correct13 < 0) {
                        correct13 = 1;
                    }
                    if (correct13 >= 0 && correct13 < imgcorrect13.length) {
                        point.setIcon(imagelist1[correct13]);
                        correct13++;
                    }

                } else if (callq == 14 && A.isFocusable()) {

                    aClickedBtrue();

                } else if (callq == 15 && A.isFocusable()) {

                    Atrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect15[i]));
                    }

                    if (correct15 < 0) {
                        correct15 = 1;
                    }
                    if (correct15 >= 0 && correct15 < imgcorrect15.length) {
                        point.setIcon(imagelist1[correct15]);
                        correct15++;
                    }

                }
            }
        });

        B.addMouseListener(new MouseAdapter() {
            // todov
            @Override
            public void mouseClicked(MouseEvent e) {
               if (callq == 1 && B.isFocusable()) {

                   bClickedAtrue();

                } else if (callq == 2 && B.isFocusable()) {

                   bClickedAtrue();

                } else if (callq == 3 && B.isFocusable()) {

                    bClickedCtrue();

                }else if (callq == 4 && B.isFocusable()) {

                    bClickedDtrue();

                } else if (callq == 5 && B.isFocusable()) {

                    Btrue();

                   super.mouseClicked(e);

                   ImageIcon[] list = new ImageIcon[1];
                   ImageIcon[] imagelist1 = new ImageIcon[1];
                   for (int i = 0; i < imagelist1.length; i++) {
                       imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect5[i]));
                   }

                   if (correct5 < 0) {
                       correct5= 1;
                   }
                   if (correct5 >= 0 && correct5 < imgcorrect5.length) {
                       point.setIcon(imagelist1[correct5]);
                       correct5++;
                   }

                } else if (callq == 6 && B.isFocusable()) {
                    bClickedDtrue();

                } else if (callq == 7 && B.isFocusable()) {

                   bClickedCtrue();

                } else if (callq == 8 && B.isFocusable()) {

                    bClickedAtrue();

                } else if (callq == 9 && B.isFocusable()) {

                   Btrue();

                   super.mouseClicked(e);

                   ImageIcon[] list = new ImageIcon[1];
                   ImageIcon[] imagelist1 = new ImageIcon[1];
                   for (int i = 0; i < imagelist1.length; i++) {
                       imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect9[i]));
                   }

                   if (correct9 < 0) {
                       correct9 = 1;
                   }
                   if (correct9 >= 0 && correct9 < imgcorrect9.length) {
                       point.setIcon(imagelist1[correct9]);
                       correct9++;
                   }

                } else if (callq == 10 && B.isFocusable()) {

                   bClickedAtrue();

                } else if (callq == 11 && B.isFocusable()) {

                    bClickedAtrue();

                } else if (callq == 12 && B.isFocusable()) {

                    bClickedCtrue();

                } else if (callq == 13 && B.isFocusable()) {

                    bClickedAtrue();

                } else if (callq == 14 && B.isFocusable()) {

                   Btrue();

                   super.mouseClicked(e);

                   ImageIcon[] list = new ImageIcon[1];
                   ImageIcon[] imagelist1 = new ImageIcon[1];
                   for (int i = 0; i < imagelist1.length; i++) {
                       imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect14[i]));
                   }

                   if (correct14 < 0) {
                       correct14 = 1;
                   }
                   if (correct14 >= 0 && correct14 < imgcorrect14.length) {
                       point.setIcon(imagelist1[correct14]);
                       correct14++;
                   }

                } else if (callq == 15 && B.isFocusable()) {

                    bClickedAtrue();

                }
            }
        });

    //todog

        C.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (callq == 1 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 2 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 3 && C.isFocusable()) {

                    Ctrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect3[i]));
                    }

                    if (correct3 < 0) {
                        correct3 = 1;
                    }
                    if (correct3 >= 0 && correct3 < imgcorrect3.length) {
                        point.setIcon(imagelist1[correct3]);
                        correct3++;
                    }

                }else if (callq == 4 && C.isFocusable()) {

                    cClikedDtrue();

                } else if (callq == 5 && C.isFocusable()) {

                    cClikedDtrue();

                } else if (callq == 6 && C.isFocusable()) {

                    cClikedDtrue();

                } else if (callq == 7 && C.isFocusable()) {

                    Ctrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect7[i]));
                    }

                    if (correct7 < 0) {
                        correct7 = 1;
                    }
                    if (correct7 >= 0 && correct7 < imgcorrect7.length) {
                        point.setIcon(imagelist1[correct7]);
                        correct7++;
                    }

                } else if (callq == 8 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 9 && C.isFocusable()) {

                    cClikedBtrue();

                } else if (callq == 10 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 11 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 12 && C.isFocusable()) {

                    Ctrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect12[i]));
                    }

                    if (correct12 < 0) {
                        correct12 = 1;
                    }
                    if (correct12 >= 0 && correct12 < imgcorrect12.length) {
                        point.setIcon(imagelist1[correct12]);
                        correct12++;
                    }

                } else if (callq == 13 && C.isFocusable()) {

                    cClikedAtrue();

                } else if (callq == 14 && C.isFocusable()) {

                    cClikedBtrue();

                } else if (callq == 15 && C.isFocusable()) {

                    cClikedAtrue();

                }
            }
        });

        D.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (callq == 1 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 2 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 3 && D.isFocusable()) {

                    dClikedCtrue();

                }else if (callq == 4 && D.isFocusable()) {

                    Dtrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect4[i]));
                    }

                    if (correct4 < 0) {
                        correct4 = 1;
                    }
                    if (correct4 >= 0 && correct4 < imgcorrect4.length) {
                        point.setIcon(imagelist1[correct4]);
                        correct4++;
                    }

                } else if (callq == 5 && D.isFocusable()) {

                    dClikedBtrue();

                } else if (callq == 6 && D.isFocusable()) {

                    Dtrue();

                    super.mouseClicked(e);

                    ImageIcon[] list = new ImageIcon[1];
                    ImageIcon[] imagelist1 = new ImageIcon[1];
                    for (int i = 0; i < imagelist1.length; i++) {
                        imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgcorrect6[i]));
                    }

                    if (correct6 < 0) {
                        correct6 = 1;
                    }
                    if (correct6 >= 0 && correct6 < imgcorrect6.length) {
                        point.setIcon(imagelist1[correct6]);
                        correct6++;
                    }

                } else if (callq == 7 && D.isFocusable()) {

                    dClikedCtrue();

                } else if (callq == 8 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 9 && D.isFocusable()) {

                    dClikedBtrue();

                } else if (callq == 10 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 11 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 12 && D.isFocusable()) {

                    dClikedCtrue();

                } else if (callq == 13 && D.isFocusable()) {

                    dClikedAtrue();

                } else if (callq == 14 && D.isFocusable()) {

                    dClikedBtrue();

                } else if (callq == 15 && D.isFocusable()) {

                    dClikedBtrue();

                }
            }
        });

// todof
//        // reset the game
//        reset.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                callq = 0;
//                format();
//                q.setText("Game Reset");
//                A.setText("A:");
//                B.setText("B:");
//                C.setText("C:");
//                D.setText("D");
//                        // reset help button 2
//                ImageIcon[] imagelist1 = new ImageIcon[1];
//                for (int i = 0; i < imagelist1.length; i++) {
//                    imagelist1[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + imgpeopelr[i]));
//                }
//
//                if (peopelr < 0) peopelr = 1;
//                if (peopelr >= 0 && peopelr < imgpeopelr.length) {
//                    help2.setIcon(imagelist1[peopelr]);
//                    peopelr++;
//                }
//
//                //end of the reset help button 2
//
//                // reset help button 1
//                ImageIcon[] list = new ImageIcon[1];
//                for (int i = 0; i < list.length; i++) {
//                    list[i] = new ImageIcon(getClass().getResource("/com/codebender/img/" + img50r[i]));
//                }
//
//                if (x50r< 0) x50r = 1;
//                if (x50r>= 0 && x50r < img50r.length) {
//                    help1.setIcon(list[x50r]);
//                    x50r++;
//                }
//
//        //end of the reset help button 1
//
//            }
//      });
        //
        //end of the reset code


    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Javantar");
        frame.setContentPane(new app().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
