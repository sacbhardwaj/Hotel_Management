package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton add, back;
    SearchRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new  JLabel("Search For Room");
        label.setBounds(250,11,186,31);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(label);

        JLabel rbt = new  JLabel("Room Bed Type:");
        rbt.setBounds(50,73,120,20);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rbt);

        JLabel rn = new  JLabel("Room Number");
        rn.setBounds(23,162,130,20);
        rn.setForeground(Color.WHITE);
        rn.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(rn);

        JLabel available = new  JLabel("Availability");
        available.setBounds(175,162,130,20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(available);

        JLabel cs = new  JLabel("Clean Status");
        cs.setBounds(306,162,130,20);
        cs.setForeground(Color.WHITE);
        cs.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(cs);

        JLabel price = new  JLabel("Price");
        price.setBounds(458,162,130,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(price);

        JLabel bt = new  JLabel("Bed Type");
        bt.setBounds(580,162,130,20);
        bt.setForeground(Color.WHITE);
        bt.setFont(new Font("Tahoma",Font.BOLD,14));
        panel.add(bt);

        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400,69,205,23);
        checkBox.setForeground(Color.WHITE);
        checkBox.setBackground(new Color(3,45,48));
        panel.add(checkBox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,70,120,20);
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,700,150);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            conn c = new conn();
            String q ="select * from room";
            ResultSet resultset = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultset));
        }catch(Exception e){
            e.printStackTrace();
        }

        add = new JButton("Search");
        add.setBounds(200,400,120,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLayout(null);
        setLocation(500,200);
        setSize(700,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==add){
            String Q ="select * from room where bed_type = '"+choice.getSelectedItem()+"'";
            String Q1 = "select * from room where availability = 'Available' And bed_type = '"+choice.getSelectedItem()+"'";
            try{
                conn c = new conn();
                ResultSet resultSet =c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if(checkBox.isSelected()){
                    ResultSet resultSet1 =c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }
            }catch(Exception E){
                E.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new SearchRoom();
    }
}
