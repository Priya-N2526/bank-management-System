package src;
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener{
    JTextField textNameField, textFatherField, textDobField, 
            textEmailField, textAddressField, textStateField, textPincodeField;
    JButton submit;
    JRadioButton male,female,yes,No;
    long random;
    public signup() {
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        setTitle("SIGN UP");
        setLayout(null);
        setLocation(350, 200);
        setSize(1000, 800);

        JLabel text = new JLabel("APPLICATION FORM NO : " + random);
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(180, 20, 600, 40);
        add(text);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 25));
        personalDetails.setBounds(350, 80, 500, 40);
        add(personalDetails);

        // Full Name
        JLabel name = new JLabel("Full Name :");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(200, 140, 150, 30);
        add(name);

        textNameField = new JTextField();
        textNameField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textNameField.setBounds(370, 140, 300, 30);
        add(textNameField);

        // Father Name
        JLabel fatherName = new JLabel("Father Name :");
        fatherName.setFont(new Font("Arial", Font.BOLD, 20));
        fatherName.setBounds(200, 190, 150, 30);
        add(fatherName);

        textFatherField = new JTextField();
        textFatherField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textFatherField.setBounds(370, 190, 300, 30);
        add(textFatherField);

        // Date of Birth
        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(200, 240, 150, 30);
        add(dob);


        textDobField = new JTextField();
        textDobField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textDobField.setBounds(370, 240, 300, 30);
        add(textDobField);

        // Gender
        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(200, 300, 150, 30);
        add(gender);

         male=new JRadioButton("Male");
        male.setBounds(370,300,70,30);
        male.setFont(new Font("Arial",Font.ITALIC,15));
        add(male);

         female=new JRadioButton("Female");
        female.setBounds(450,300,90,30);
        female.setFont(new Font("Arial",Font.ITALIC,15));
        add(female);

        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);
        
        // Email
        JLabel email = new JLabel("Email :");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(200, 360, 150, 30);
        add(email);

        textEmailField = new JTextField();
        textEmailField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textEmailField.setBounds(370, 360, 300, 30);
        add(textEmailField);

        // Marital Status
        JLabel maritalStatus = new JLabel("Marital Status :");
        maritalStatus.setFont(new Font("Arial", Font.BOLD, 20));
        maritalStatus.setBounds(200, 420, 150, 30);
        add(maritalStatus);

        yes=new JRadioButton("YES");
        yes.setBounds(370,420,70,30);
        yes.setFont(new Font("Arial",Font.ITALIC,15));
        add(yes);

         No=new JRadioButton("NO");
         No.setBounds(450,420,90,30);
         No.setFont(new Font("Arial",Font.ITALIC,15));
        add( No);

        ButtonGroup marriagestatus=new ButtonGroup();
        marriagestatus.add(yes);
        marriagestatus.add(No);


        // Address
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(200, 480, 150, 30);
        add(address);

        textAddressField = new JTextField();
        textAddressField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textAddressField.setBounds(370, 480, 300, 30);
        add(textAddressField);

        // State
        JLabel state = new JLabel("State :");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(200, 540, 150, 30);
        add(state);

        textStateField = new JTextField();
        textStateField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textStateField.setBounds(370, 540, 300, 30);
        add(textStateField);

        // Pincode
        JLabel pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Arial", Font.BOLD, 20));
        pincode.setBounds(200, 600, 150, 30);
        add(pincode);

        textPincodeField = new JTextField();
        textPincodeField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textPincodeField.setBounds(370, 600, 300, 30);
        add(textPincodeField);

        submit=new JButton("NEXT");
        submit.setBounds(450,660,100,50);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        // finally make visible
        setVisible(true);
    }
       
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;

    // Text field values
    String name = textNameField.getText();
    String fname = textFatherField.getText();
    String dob = textDobField.getText();

    // Gender
    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    }

    String email = textEmailField.getText();

    // Marital Status
    String marital = null;
    if (yes.isSelected()) {
        marital = "Married";
    } else if (No.isSelected()) {
        marital = "Unmarried";
    }

    String address = textAddressField.getText();
    String state = textStateField.getText();
    String pincode = textPincodeField.getText();
    try{
        if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Name is Required");
        }
        else{
            jdbcconnection c=new jdbcconnection();
            String query="insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital
            +"','"+address+"','"+state+"','"+pincode+"')";
            c.s.executeUpdate(query);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    public static void main(String[] args) {
        new signup();
    }
}
