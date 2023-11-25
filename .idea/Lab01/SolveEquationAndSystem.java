package Lab01;

import javax.swing.*;

public class SolveEquationAndSystem {
    public static void main(String[] args) {
        String i;
        double cs;
        String a,b,c,d,e,f;
        double res=0,a1,b1,c1,d1,e1,f1;
        do {
            i=JOptionPane.showInputDialog(null,"Chooose equation/system: \n" +
                    "Exit: Button 0\n"+
                    "The first-degree equation with one variable: Button 1\n" +
                    "The second-degree equation with one variable: Button 2\n" +
                    "The system of first-degree equations with two variables: Button 3\n ","Choose",JOptionPane.INFORMATION_MESSAGE);
            cs = Double.parseDouble(i);
            if (cs ==0)
            {
                System.exit(0);
            }
            else if (cs == 1) {
                a = JOptionPane.showInputDialog(null, "ax + b = 0\nEnter a:", "Input a", JOptionPane.INFORMATION_MESSAGE);
                b = JOptionPane.showInputDialog(null, "ax + b = 0\nEnter b:", "Input b", JOptionPane.INFORMATION_MESSAGE);
                a1 = Double.parseDouble(a);
                b1 = Double.parseDouble(b);
                if (a1 != 0) {
                    res = -b1 / a1;
                    JOptionPane.showMessageDialog(null, "Solution of equation " + a1 + "x + " + b1 + " = 0 is " + res, "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (a1 == 0 && b1 == 0)
                {
                    JOptionPane.showMessageDialog(null, "Solution of equation " + a1 + "x + " + b1 + " = 0 is\n INFINITE solutions. ", "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Solution of equation " + a1 + "x + " + b1 + " = 0 is\n NO solutions. ", "Solution", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else if( cs ==2)
            {
                a = JOptionPane.showInputDialog(null,"ax^2 + bx + c = 0\nEnter a:","Input a",JOptionPane.INFORMATION_MESSAGE);
                b = JOptionPane.showInputDialog(null,"ax^2 + bx + c = 0\nEnter b:","Input b",JOptionPane.INFORMATION_MESSAGE);
                c = JOptionPane.showInputDialog(null,"ax^2 + bx + c = 0\nEnter c:","Input c",JOptionPane.INFORMATION_MESSAGE);
                a1 = Double.parseDouble(a);
                b1 = Double.parseDouble(b);
                c1 = Double.parseDouble(c);
                double delta = b1*b1-4*a1*c1;
                if (a1==0)
                {
                    if (b1 != 0) {
                        res = -c1 / b1;
                        JOptionPane.showMessageDialog(null, "Solution of equation " + b1 + "x + " + c1 + " = 0 is " + res, "Solution", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (c1 == 0 && b1 == 0)
                    {
                        JOptionPane.showMessageDialog(null, "Solution of equation " + b1 + "x + " + c1 + " = 0 is\n INFINITE solutions. ", "Solution", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Solution of equation " + b1 + "x + " + c1 + " = 0 is\n NO solutions. ", "Solution", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                else
                {
                    if (delta > 0)
                    {
                        double x1 = (-b1 + Math.sqrt(delta))/(2*a1);
                        double x2 = (-b1 - Math.sqrt(delta))/(2*a1);
                        JOptionPane.showMessageDialog(null,"Solution of equation "+a1+"x^2 + "+b1+"x + "+c+" = 0 is \n" +
                                "x1 = "+x1+"\n" +
                                "x2 = "+x2+"\n","Solution",JOptionPane.INFORMATION_MESSAGE);

                    }
                    else if (delta ==0)
                    {
                        double x = -b1/(2*a1);
                        JOptionPane.showMessageDialog(null,"Solution of equation "+a1+"x^2 + "+b1+"x + "+c+" = 0 is \n" +
                                "x = "+x,"Solution",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else JOptionPane.showMessageDialog(null,"No solution","Solution",JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else if (cs==3)
            {
                a = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter a:","Input a",JOptionPane.INFORMATION_MESSAGE);
                b = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter b:","Input b",JOptionPane.INFORMATION_MESSAGE);
                c = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter c:","Input c",JOptionPane.INFORMATION_MESSAGE);
                d = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter d:","Input d",JOptionPane.INFORMATION_MESSAGE);
                e = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter e:","Input e",JOptionPane.INFORMATION_MESSAGE);
                f = JOptionPane.showInputDialog(null,"ax1 + bx2 + c = 0\ndx1 + ex2 + f=0\nEnter f:","Input f",JOptionPane.INFORMATION_MESSAGE);

                a1 = Double.parseDouble(a);
                b1 = Double.parseDouble(b);
                c1 = Double.parseDouble(c);
                d1 = Double.parseDouble(d);
                e1 = Double.parseDouble(e);
                f1 = Double.parseDouble(f);

                double D = a1 * e1 - d1 * b1;
                if(D!=0)
                {
                    double Dx = c1 * e1 - f1 * b1;
                    double Dy = a1 * f1 - d1 * c1;
                    double x1 = Dx / D;
                    double x2 = Dy / D;
                    JOptionPane.showMessageDialog(null,"Solution of system of equations\n "+a1+"x1 + "+b1+"x2 + "+c+" = 0\n" +
                            d1+"x1 + "+e1+"x2 + "+f1+" = 0  is \n" +
                            "x1 = "+x1+"\n" +
                            "x2 = "+x2+"\n","Solution",JOptionPane.INFORMATION_MESSAGE);

                }
                else if (D==0 && a1/d1 == c1/f1)
                {
                    JOptionPane.showMessageDialog(null,"Solution of system of equations\n "+a1+"x1 + "+b1+"x2 + "+c+" = 0\n" +
                            d1+"x1 + "+e1+"x2 + "+f1+" = 0  is \nINFINITE solutions. ","Solution",JOptionPane.INFORMATION_MESSAGE);
                }
                else JOptionPane.showMessageDialog(null,"Solution of system of equations\n "+a1+"x1 + "+b1+"x2 + "+c+" = 0\n" +
                            d1+"x1 + "+e1+"x2 + "+f1+" = 0  is \nNO solutions. ","Solution",JOptionPane.INFORMATION_MESSAGE);
            }

        }
        while (cs!=0);
    }
}
