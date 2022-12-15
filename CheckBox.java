package javalab;

import javax.swing.*;

public class test4 {  
     public static void main(String[] args) {
    	 JFrame f= new JFrame("CheckBox Example");  
         JCheckBox checkBox1 = new JCheckBox("C++");  
         checkBox1.setBounds(100,100, 100,50);  
         JCheckBox checkBox2 = new JCheckBox("Java");  
         checkBox2.setBounds(100,150, 100,50);
         JCheckBox checkBox3 = new JCheckBox("Python", true);  
         checkBox3.setBounds(100,200, 100,50);
         f.add(checkBox1);  
         f.add(checkBox2);
         f.add(checkBox3);
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);
     }
}  
