package calculator;

/**
 * @author anish
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    public Calculator(String S) {
        super(S);
    }

    JLabel screen, small;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, bdot, badd, bsub, bmul, bdiv, bon, bclear, bequals, bdel;
    String s0, s1, s2;
    int on = 0, done = 0;

    public void setComponents() {
        screen = new JLabel("");
        small = new JLabel("");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        bdot = new JButton(".");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        bon = new JButton("ON/OFF");
        bclear = new JButton("C");
        bequals = new JButton("=");
        bdel = new JButton("<-");

        setLayout(null);
        screen.setBounds(10, 31, 335, 80);
        screen.setOpaque(true);
        Font f = new Font("Arial", Font.BOLD, 50);
        screen.setFont(f);
        screen.setForeground(Color.WHITE);
        screen.setBackground(Color.BLACK);
        screen.setHorizontalAlignment(SwingConstants.RIGHT);

        small.setBounds(10, 10, 335, 21);
        small.setOpaque(true);
        Font f1 = new Font("Arial", Font.BOLD, 15);
        small.setFont(f1);
        small.setForeground(Color.WHITE);
        small.setBackground(Color.BLACK);
        small.setHorizontalAlignment(SwingConstants.RIGHT);

        Font f2 = new Font("Arial", Font.BOLD, 25);
        bon.setBounds(10, 121, 165, 80);
        bon.setFocusable(false);
        bon.setBackground(Color.RED);
        bon.setForeground(Color.WHITE);
        bon.setFont(f2);
        bclear.setBounds(180, 121, 80, 80);
        bclear.setFocusable(false);
        bclear.setBackground(Color.DARK_GRAY);
        bclear.setForeground(Color.WHITE);
        bclear.setFont(f2);
        badd.setBounds(265, 206, 80, 80);
        badd.setFocusable(false);
        badd.setBackground(Color.ORANGE);
        badd.setForeground(Color.WHITE);
        badd.setFont(f2);
        b7.setBounds(10, 206, 80, 80);
        b7.setFocusable(false);
        b7.setBackground(Color.LIGHT_GRAY);
        b7.setForeground(Color.WHITE);
        b7.setFont(f2);
        b8.setBounds(95, 206, 80, 80);
        b8.setFocusable(false);
        b8.setBackground(Color.LIGHT_GRAY);
        b8.setForeground(Color.WHITE);
        b8.setFont(f2);
        b9.setBounds(180, 206, 80, 80);
        b9.setFocusable(false);
        b9.setBackground(Color.LIGHT_GRAY);
        b9.setForeground(Color.WHITE);
        b9.setFont(f2);
        bsub.setBounds(265, 291, 80, 80);
        bsub.setFocusable(false);
        bsub.setBackground(Color.ORANGE);
        bsub.setForeground(Color.WHITE);
        bsub.setFont(f2);
        b4.setBounds(10, 291, 80, 80);
        b4.setFocusable(false);
        b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.WHITE);
        b4.setFont(f2);
        b5.setBounds(95, 291, 80, 80);
        b5.setFocusable(false);
        b5.setBackground(Color.LIGHT_GRAY);
        b5.setForeground(Color.WHITE);
        b5.setFont(f2);
        b6.setBounds(180, 291, 80, 80);
        b6.setFocusable(false);
        b6.setBackground(Color.LIGHT_GRAY);
        b6.setForeground(Color.WHITE);
        b6.setFont(f2);
        bmul.setBounds(265, 376, 80, 80);
        bmul.setFocusable(false);
        bmul.setBackground(Color.ORANGE);
        bmul.setForeground(Color.WHITE);
        bmul.setFont(f2);
        b1.setBounds(10, 376, 80, 80);
        b1.setFocusable(false);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(f2);
        b2.setBounds(95, 376, 80, 80);
        b2.setFocusable(false);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(f2);
        b3.setBounds(180, 376, 80, 80);
        b3.setFocusable(false);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFont(f2);
        bdiv.setBounds(265, 461, 80, 80);
        bdiv.setFocusable(false);
        bdiv.setBackground(Color.ORANGE);
        bdiv.setForeground(Color.WHITE);
        bdiv.setFont(f2);
        bdot.setBounds(10, 461, 80, 80);
        bdot.setFocusable(false);
        bdot.setBackground(Color.MAGENTA);
        bdot.setForeground(Color.WHITE);
        bdot.setFont(f2);
        b10.setBounds(95, 461, 80, 80);
        b10.setFocusable(false);
        b10.setBackground(Color.LIGHT_GRAY);
        b10.setForeground(Color.WHITE);
        b10.setFont(f2);
        bequals.setBounds(180, 461, 80, 80);
        bequals.setFocusable(false);
        bequals.setBackground(Color.MAGENTA);
        bequals.setForeground(Color.WHITE);
        bequals.setFont(f2);
        bdel.setBounds(265, 121, 80, 80);
        bdel.setFocusable(false);
        bdel.setBackground(Color.MAGENTA);
        bdel.setForeground(Color.WHITE);
        bdel.setFont(f2);

        add(screen);
        add(small);
        add(bon);
        add(bclear);
        add(bdel);
        add(badd);
        add(bsub);
        add(bmul);
        add(bdiv);
        add(bequals);
        add(b7);
        add(b8);
        add(b9);
        add(b4);
        add(b5);
        add(b6);
        add(b1);
        add(b2);
        add(b3);
        add(bdot);
        add(b10);

        s0 = "";
        s1 = "";
        s2 = "";

        bon.addActionListener(new Handler());
        bclear.addActionListener(new Handler());
        badd.addActionListener(new Handler());
        b7.addActionListener(new Handler());
        b8.addActionListener(new Handler());
        b9.addActionListener(new Handler());
        bsub.addActionListener(new Handler());
        b4.addActionListener(new Handler());
        b5.addActionListener(new Handler());
        b6.addActionListener(new Handler());
        bmul.addActionListener(new Handler());
        b1.addActionListener(new Handler());
        b2.addActionListener(new Handler());
        b3.addActionListener(new Handler());
        bdiv.addActionListener(new Handler());
        bdot.addActionListener(new Handler());
        b10.addActionListener(new Handler());
        bequals.addActionListener(new Handler());
        bdel.addActionListener(new Handler());
    }

    public void calculate() {
        double t;
        switch (s1) {
            case "+":
                t = Double.parseDouble(s0) + Double.parseDouble(s2);
                s0 = t + "";
                s2 = "";
                screen.setText(t + " ");
                s1 = "";
                done = 1;
                break;
            case "-":
                t = Double.parseDouble(s0) - Double.parseDouble(s2);
                s0 = t + "";
                s2 = "";
                screen.setText(t + " ");
                s1 = "";
                done = 1;
                break;
            case "*":
                t = Double.parseDouble(s0) * Double.parseDouble(s2);
                s0 = t + "";
                s2 = "";
                screen.setText(t + " ");
                s1 = "";
                done = 1;
                break;
            case "/":
                t = Double.parseDouble(s0) / Double.parseDouble(s2);
                s0 = t + "";
                s2 = "";
                screen.setText(t + " ");
                s1 = "";
                done = 1;
                break;
        }
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = e.getActionCommand();

            if (s.equals("ON/OFF")) {
                if (on == 0) {
                    on = 1;
                    screen.setText("0 ");
                } else {
                    on = 0;
                    screen.setText("");
                    small.setText("");
                    s0 = "";
                    s1 = "";
                    s2 = "";
                }
            } else if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("=") || s.equals("C") || s.equals("<-")) {
                if (on != 0) {
                    if (s.equals("C")) {
                        s0 = "";
                        s1 = "";
                        s2 = "";
                        screen.setText("0 ");
                        small.setText("");
                    } else if (s.equals("=")) {
                        small.setText(s0 + " " + s1 + " " + s2 + " ");
                        calculate();
                    } else if (s.equals("<-")){
                        if(done == 1){
                            s0 = ""; s1= ""; s2 = "";
                            screen.setText(0+ " ");
                            small.setText("");
                            done = 0;
                        }
                        if(!s1.equals("")){
                            if(!s2.equals("") && s2.length() > 0){
                                s2 = s2.substring(0, s2.length() - 1);
                                if(!s2.equals(""))
                                    screen.setText(s2 + " ");
                                else{
                                    screen.setText(0 + " ");
                                    s2 = "0";
                                }
                            }
                        } else {
                            if(!s0.equals("") && s0.length() > 0){
                                s0 = s0.substring(0, s0.length() - 1);
                                if(!s0.equals(""))
                                    screen.setText(s0 + " ");
                                else{
                                    screen.setText(0 + " ");
                                    s0 = "0";
                                }
                            }
                        }
                    } else {
                        if (s0.equals("")) {
                            s0 = "0";
                        }
                        if (!s1.equals("")) {
                            calculate();
                        }
                        s1 = s;
                        screen.setText(s1 + " ");
                        small.setText(s0 + " ");
                    }
                }
            } else {
                if (on != 0) {
                    if (!s1.equals("")) {
                        s2 += s;
                        screen.setText(s2 + " ");
                        small.setText(s0 + " " + s1 + " ");
                    } else {
                        if(done == 1){
                            s0 = "";
                            small.setText("");
                            done = 0;
                        }
                        s0 += s;
                        screen.setText(s0 + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Calculator jf = new Calculator("Calculator                   © KingPin77");
        jf.setComponents();
        jf.setVisible(true);
        jf.setBackground(Color.blue);
        jf.setResizable(false);
        jf.setLocation(500, 80);
        jf.setSize(360, 581);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
