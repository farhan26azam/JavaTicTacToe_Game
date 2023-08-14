package com.company.tictactoe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main implements ActionListener{
    JFrame frame;
    JButton[] buttons;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9;
    JButton resetButton;
    JCheckBox checkBox1,checkBox2;
    JLabel main_label,user1_label,user2_label;
    Font font = new Font("Comic Sans MS",Font.BOLD,30);
    Font short_font = new Font("Comic Sans MS",Font.BOLD,15);
    int user = 1;
    void GUI(){
        frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        main_label = new JLabel("TicTacToe");
        main_label.setFont(font);
        main_label.setBounds(30, 10, 200, 35);

        button1 = new JButton(" ");
        button2 = new JButton(" ");
        button3 = new JButton(" ");
        button4 = new JButton(" ");
        button5 = new JButton(" ");
        button6 = new JButton(" ");
        button7 = new JButton(" ");
        button8 = new JButton(" ");
        button9 = new JButton(" ");

        buttons = new JButton [9];
        buttons[0] = button1;
        buttons[1] = button2;
        buttons[2] = button3;
        buttons[3] = button4;
        buttons[4] = button5;
        buttons[5] = button6;
        buttons[6] = button7;
        buttons[7] = button8;
        buttons[8] = button9;


        for (int i=0;i<9;i++){
            if(i<3) {
                buttons[i].setBounds((i + 1) * 70, 50, 60, 60);
            }else if(i<6) {
                buttons[i].setBounds((i-2) * 70, 130, 60, 60);
            } else if(i<=8) {
                buttons[i].setBounds((i - 5) * 70, 210, 60, 60);
            }
            buttons[i].setBackground(Color.LIGHT_GRAY);
            buttons[i].addActionListener(this);
            buttons[i].setFocusable(false);
            buttons[i].setFont(font);
            frame.add(buttons[i]);
        }

        user1_label = new JLabel("User 1:");
        user1_label.setBounds(20, 290, 75, 15);
        user1_label.setFont(short_font);

        user2_label = new JLabel("User 2:");
        user2_label.setBounds(120, 290, 75, 15);
        user2_label.setFont(short_font);

        checkBox1 = new JCheckBox();
        checkBox1.setSelected(true);
        checkBox1.addActionListener(this);
        checkBox1.setBorderPaintedFlat(true);
        checkBox1.setBounds(80, 285, 20, 20);
        checkBox2 = new JCheckBox();
        checkBox2.addActionListener(this);
        checkBox2.setBounds(180, 285, 20, 20);

        resetButton = new JButton("Reset");
        resetButton.setFont(font);
        resetButton.setBounds(80, 320, 200, 35);
        resetButton.addActionListener(this);


        frame.add(checkBox1);
        frame.add(checkBox2);
        frame.add(main_label);
        frame.add(user1_label);
        frame.add(user2_label);
        frame.add(resetButton);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==checkBox1){
            user = 1;
            checkBox2.setSelected(false);
        }else if(e.getSource()==checkBox2){
            user = 2;
            checkBox1.setSelected(false);
        }
        for (int i = 0; i < 9; i++) {
            if(e.getSource()==buttons[i] && user == 1 && buttons[i].getText()==" "){
                buttons[i].setBackground(Color.green);
                buttons[i].setText("O");
                checkBox2.setSelected(true);
                checkBox1.setSelected(false);
                user = 2;
            }
            if(e.getSource()==buttons[i] && user == 2 && buttons[i].getText()==" "){
                buttons[i].setBackground(Color.orange);
                buttons[i].setText("X");
                checkBox2.setSelected(false);
                user = 1;
                checkBox1.setSelected(true);
            }

        }

        if(e.getSource()==resetButton){
            for (int i = 0; i < 9; i++) {
                buttons[i].setText(" ");
                buttons[i].setBackground(Color.LIGHT_GRAY);
            }
            main_label.setText("TicTacToe");
        }

        //Winning condition
        //user 2 button 1
        if(button1.getText()=="X" && button1.getText()==button2.getText()&& button1.getText()==button3.getText()){
            main_label.setText("User 2 Won");
        }else if(button1.getText()=="X" && button1.getText()==button5.getText()&& button1.getText()==button9.getText()){
            main_label.setText("User 2 Won");
        }else if(button1.getText()=="X" && button1.getText()==button4.getText()&& button1.getText()==button7.getText()){
            main_label.setText("User 2 Won");
        }
        //user 2 button 2
        if(button2.getText()=="X" && button2.getText()==button5.getText()&& button2.getText()==button8.getText()){
            main_label.setText("User 2 Won");
        }
        //button 3 user 2
        if(button3.getText()=="X" && button3.getText()==button5.getText()&& button3.getText()==button7.getText()){
            main_label.setText("User 2 Won");
        }else if(button3.getText()=="X" && button3.getText()==button6.getText()&& button3.getText()==button9.getText()){
            main_label.setText("User 2 Won");
        }
        //button 4 user 2
        if(button4.getText() == "X" && button4.getText()== button5.getText() && button4.getText()== button6.getText()){
            main_label.setText("User 2 Won");
        }

        //button 7 user 2
        if(button7.getText() == "X" && button7.getText()== button8.getText() && button7.getText()== button9.getText()){
            main_label.setText("User 2 Won");
        }

        //user 2 button 1
        if(button1.getText()=="X" && button1.getText()==button2.getText()&& button1.getText()==button3.getText()){
            main_label.setText("User 2 Won");
        }else if(button1.getText()=="X" && button1.getText()==button5.getText()&& button1.getText()==button9.getText()){
            main_label.setText("User 2 Won");
        }else if(button1.getText()=="X" && button1.getText()==button4.getText()&& button1.getText()==button7.getText()){
            main_label.setText("User 2 Won");
        }
        //user 2 button 2
        if(button2.getText()=="X" && button2.getText()==button5.getText()&& button2.getText()==button8.getText()){
            main_label.setText("User 2 Won");
        }
        //button 3 user 2
        if(button3.getText()=="X" && button3.getText()==button5.getText()&& button3.getText()==button7.getText()){
            main_label.setText("User 2 Won");
        }else if(button3.getText()=="X" && button3.getText()==button6.getText()&& button3.getText()==button9.getText()){
            main_label.setText("User 2 Won");
        }
        //button 4 user 2
        if(button4.getText() == "X" && button4.getText()== button5.getText() && button4.getText()== button6.getText()){
            main_label.setText("User 2 Won");
        }

        //button 7 user 2
        if(button7.getText() == "X" && button7.getText()== button8.getText() && button7.getText()== button9.getText()){
            main_label.setText("User 2 Won");
        }

        //Winning condition user 1
        //user 1 button 1
        if(button1.getText()=="O" && button1.getText()==button2.getText()&& button1.getText()==button3.getText()){
            main_label.setText("User 1 Won");
        }else if(button1.getText()=="O" && button1.getText()==button5.getText()&& button1.getText()==button9.getText()){
            main_label.setText("User 1 Won");
        }else if(button1.getText()=="O" && button1.getText()==button4.getText()&& button1.getText()==button7.getText()){
            main_label.setText("User 1 Won");
        }
        //user 1 button 2
        if(button2.getText()=="O" && button2.getText()==button5.getText()&& button2.getText()==button8.getText()){
            main_label.setText("User 1 Won");
        }
        //button 3 user 1
        if(button3.getText()=="O" && button3.getText()==button5.getText()&& button3.getText()==button7.getText()){
            main_label.setText("User 1 Won");
        }else if(button3.getText()=="O" && button3.getText()==button6.getText()&& button3.getText()==button9.getText()){
            main_label.setText("User 1 Won");
        }
        //button 4 user 1
        if(button4.getText() == "O" && button4.getText()== button5.getText() && button4.getText()== button6.getText()){
            main_label.setText("User 1 Won");
        }

        //button 7 user 1
        if(button7.getText() == "O" && button7.getText()== button8.getText() && button7.getText()== button9.getText()){
            main_label.setText("User 1 Won");
        }

        //user 1 button 1
        if(button1.getText()=="O" && button1.getText()==button2.getText()&& button1.getText()==button3.getText()){
            main_label.setText("User 1 Won");
        }else if(button1.getText()=="O" && button1.getText()==button5.getText()&& button1.getText()==button9.getText()){
            main_label.setText("User 1 Won");
        }else if(button1.getText()=="O" && button1.getText()==button4.getText()&& button1.getText()==button7.getText()){
            main_label.setText("User 1 Won");
        }
        //user 1 button 2
        if(button2.getText()=="O" && button2.getText()==button5.getText()&& button2.getText()==button8.getText()){
            main_label.setText("User 1 Won");
        }
        //button 3 user 1
        if(button3.getText()=="O" && button3.getText()==button5.getText()&& button3.getText()==button7.getText()){
            main_label.setText("User 1 Won");
        }else if(button3.getText()=="O" && button3.getText()==button6.getText()&& button3.getText()==button9.getText()){
            main_label.setText("User 1 Won");
        }
        //button 4 user 1
        if(button4.getText() == "O" && button4.getText()== button5.getText() && button4.getText()== button6.getText()){
            main_label.setText("User 1 Won");
        }

        //button 7 user 1
        if(button7.getText() == "O" && button7.getText()== button8.getText() && button7.getText()== button9.getText()){
            main_label.setText("User 1 Won");
        }

    }
}

class myMain{
    public static void main(String[] args) {
        Main m = new Main();
        m.GUI();
    }
}
