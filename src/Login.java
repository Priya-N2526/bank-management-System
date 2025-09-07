package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login,login1,login2;
    JTextField CardTextField;
    JPasswordField PinField;
    Login(){
        setTitle("ATM Login page");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);//any component if i need place in frame use add function in it
        getContentPane().setBackground(Color.WHITE);
        
        JLabel text=new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,500,40);
        add(text);
        
        JLabel Cardno=new JLabel("CARD NO: ");
        Cardno.setFont(new Font("Raleway",Font.BOLD,25));
        Cardno.setBounds(100,30,200,310);
        add(Cardno);

        CardTextField=new JTextField();
        CardTextField.setBounds(240,170,300,35);
        add(CardTextField);

        JLabel Pin=new JLabel("PIN :");
        Pin.setFont(new Font("Raleway",Font.BOLD,25));
        Pin.setBounds(120,50,200,400);
        add(Pin);

        PinField=new JPasswordField();
        PinField.setBounds(240,230,300,35);
        add(PinField);

        login=new JButton("SIGN IN");
        login.setBounds(220,330,100,40);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        login1=new JButton("SIGN UP");
        login1.setBounds(430,330,100,40);
        login1.setBackground(Color.BLACK);
        login1.setForeground(Color.WHITE);
        login1.addActionListener(this);
        add(login1);

        login2=new JButton("CLEAR");
        login2.setBounds(330,400,100,40);
        login2.setBackground(Color.BLACK);
        login2.setForeground(Color.WHITE);
        login2.addActionListener(this);
        add(login2);

        setSize(800,580);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login2){
            CardTextField.setText("");
            PinField.setText("");
        }
        else if(ae.getSource()==login1){
            setVisible(false);
            new signup().setVisible (true);
        }
        else if(ae.getSource()==login){

        }
    }
    public static void main(String args[]){
        new Login();
    }    
}
