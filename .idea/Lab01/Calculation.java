package Lab01;

import javax.swing.*;

public class Calculation {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String cs;
        double add, sub, mul, div, choose=1;
        String output;
        do
        {
            cs = JOptionPane.showInputDialog(null,"Choose calculation: \n Exit: Button 0\n Addition: Button 1\n Subtraction: Button 2\n Multiplication: Button 3\n Division: Button 4\n","Choose calculation: ",JOptionPane.INFORMATION_MESSAGE );
            choose = Double.parseDouble(cs);
            if (choose ==0) {
                break;
            } else if (choose == 1)
            {
                strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
                strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);
                add = num1 + num2;
                JOptionPane.showMessageDialog(null,"Addition:\n"+num1+" + "+num2+" = "+add,"Addtion",JOptionPane.INFORMATION_MESSAGE);
            } else if (choose == 2) {
                strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
                strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);
                sub = num1 - num2;
                JOptionPane.showMessageDialog(null,"Subtraction:\n"+num1+" - "+num2+" = "+sub,"Subtraction",JOptionPane.INFORMATION_MESSAGE);
            } else if (choose == 3) {
                strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
                strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);
                mul = num1*num2;
                JOptionPane.showMessageDialog(null,"Multiplication:\n"+num1+" * "+num2+" = "+mul,"Multiplication",JOptionPane.INFORMATION_MESSAGE);
            }
            else if (choose == 4) {
                strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
                strNum2=JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);
                div = num1 / num2;
                JOptionPane.showMessageDialog(null,"Division:\n"+num1+" / "+num2+" = "+div,"Division",JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,"Your calculation is not valid! Try again.","Error",JOptionPane.INFORMATION_MESSAGE);
            }

        }
        while (choose!=0);



    }
}
