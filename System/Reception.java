package Hotel.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1070,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,820);
        panel1.setBackground(new Color(3,45,48));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i2 = i1.getImage().getScaledInstance(700,700,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i2);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(370,20,700,700);
        panel.add(label);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i22 = i11.getImage().getScaledInstance(240,240,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i22);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(5,490,240,240);
        panel1.add(label1);

        JButton btnNCF = new JButton("New Customer");
        btnNCF.setBounds(30,20,200,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.white);
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try{
                   new NewCustomer();

               }catch(Exception E){
                   E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,60,200,30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();

                }catch(Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,100,200,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();

                }catch(Exception E){

                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,140,200,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                  new Employee();
                }catch(Exception E){

                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,180,200,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CustomerInfo();
                }catch(Exception E){

                }
            }
        });
        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,220,200,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ManagerInfo();
                }catch(Exception E){}
            }
        });
        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,260,200,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();

                }catch(Exception E){

                }
            }
        });
        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30,300,200,30);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateCheck();

                }catch(Exception E){

                }
            }
        });
        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,340,200,30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateRoom();

                }catch(Exception E){

                }
            }
        });
        JButton btnPUS = new JButton("Pick up Service");
        btnPUS.setBounds(30,380,200,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new PickUp();

                }catch(Exception E){

                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,420,200,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();

                }catch(Exception E){

                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,460,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    System.exit(500);

                }catch(Exception E){

                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,460,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel1.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    setVisible(false);
                    new Dashboard();

                }catch(Exception E){

                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1900,1090);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Reception();
    }
}
