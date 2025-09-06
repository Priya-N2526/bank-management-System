import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class signup extends JFrame {
    JTextField textNameField, textFatherField, textDobField, textGenderField,
            textEmailField, textMaritalField, textAddressField, textStateField, textPincodeField;

    signup() {
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

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
        name.setBounds(200, 120, 150, 30);
        add(name);

        textNameField = new JTextField();
        textNameField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textNameField.setBounds(370, 120, 300, 30);
        add(textNameField);

        // Father Name
        JLabel fatherName = new JLabel("Father Name :");
        fatherName.setFont(new Font("Arial", Font.BOLD, 20));
        fatherName.setBounds(200, 180, 150, 30);
        add(fatherName);

        textFatherField = new JTextField();
        textFatherField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textFatherField.setBounds(370, 180, 300, 30);
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

        textGenderField = new JTextField();
        textGenderField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textGenderField.setBounds(370, 300, 300, 30);
        add(textGenderField);

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

        textMaritalField = new JTextField();
        textMaritalField.setFont(new Font("Raleway", Font.PLAIN, 15));
        textMaritalField.setBounds(370, 420, 300, 30);
        add(textMaritalField);

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

        // finally make visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new signup();
    }
}
