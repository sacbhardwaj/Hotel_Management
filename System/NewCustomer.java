package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber,textName,textCountry,textDeposite;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton add,back;
    NewCustomer(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma",Font.BOLD,20));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelID.setForeground(Color.WHITE);
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Passport","Aadhar Card","Voter ID","Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
        panel.add(comboBox );

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelNumber.setForeground(Color.WHITE);
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel Name = new JLabel("Name :");
        Name.setBounds(35,151,200,14);
        Name.setFont(new Font("Tahoma",Font.PLAIN,14));
        Name.setForeground(Color.WHITE);
        panel.add(Name);
        textName = new JTextField();
        textName.setBounds(271,151,150,20);
        panel.add(textName);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(35,191,200,14);
        gender.setFont(new Font("Tahoma",Font.PLAIN,14));
        gender.setForeground(Color.WHITE);
        panel.add(gender);

        r1 =new JRadioButton("Male");
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        panel.add(r1);

        r2 =new JRadioButton("Female");
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,80,12);
        panel.add(r2);

        JLabel country = new JLabel("Country :");
        country.setBounds(35,231,200,14);
        country.setFont(new Font("Tahoma",Font.PLAIN,14));
        country.setForeground(Color.WHITE);
        panel.add(country);
        textCountry = new JTextField();
        textCountry.setBounds(271,231,150,20);
        panel.add(textCountry);

        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelRoom.setForeground(Color.WHITE);
        panel.add(labelRoom);

        c1 = new Choice();
        try{
            conn c = new conn();
            ResultSet resultSet  = c.statement.executeQuery("select * from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,316,200,14);
        labelCIS.setFont(new Font("Tahoma",Font.PLAIN,14));
        labelCIS.setForeground(Color.WHITE);
        panel.add(labelCIS);

        Date date1 = new Date();


        date = new JLabel(""+date1);
        date.setBounds(271,316,200,14);
        date.setFont(new Font("Tahoma",Font.PLAIN,14));
        date.setForeground(Color.WHITE);
        panel.add(date);

        JLabel deposite = new JLabel("Deposite :");
        deposite.setBounds(35,359,200,14);
        deposite.setFont(new Font("Tahoma",Font.PLAIN,14));
        deposite.setForeground(Color.WHITE);
        panel.add(deposite);
        textDeposite = new JTextField();
        textDeposite.setBounds(271,359,150,20);
        panel.add(textDeposite);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            conn c = new conn();
            String radioBTn = null;
            if(r1.isSelected()){
                radioBTn = "Male";
            } else if(r2.isSelected()){
                radioBTn ="Female";
            }

            String s1 = (String)comboBox.getSelectedItem();
            String s2 = textFieldNumber.getText();
            String s3 = textName.getText();
            String s4 = radioBTn;
            String s5 = textCountry.getText();
            String s6 = c1.getSelectedItem();
            String s7 = date.getText();
            String s8 = textDeposite.getText();

            try{
                String q = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
                //String sql = "INSERT INTO customers (name, date, amount) VALUES ('" + name + "', '" + date + "', '" + amount + "')";

                String q1 = "update room set availability = 'Occupied' where roomnumber = "+s6;
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"added Successfully");

            }catch(Exception E){
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
