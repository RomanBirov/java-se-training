package oop.task_TimerSwingJ;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class TimerSwing1 extends JFrame {

    private JLabel timeLabel;
    private Timer timer1, timer2;
    private JButton start1, start2;
    private  int countdown1, countdown2;
    private String eventname1,eventname2;


    public TimerSwing1() {
        eventname1 = "Заказать пиццу";
        countdown1 = 120;

        eventname2 = "Встретить Машу";
        countdown2 = 3750;

        setTitle("Таймер");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 15));

        timer1 = new Timer(1000, new TimerTick1());

        start1 = new JButton("Начать отсчёт << Заказать пиццу >>");
        start1.addActionListener (new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                remove(start1);
                add(timeLabel);
                validate();
                repaint();
                timer1.start();
            }
        });

        timer2 = new Timer(1000, new TimerTick2());

        start2 = new JButton("Начать отсчёт << Встретить Машу >>");
        start2.addActionListener (new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                remove(start2);
                add(timeLabel);
                validate();
                repaint();
                timer2.start();
            }
        });


        add(start1);
        add(start2);
        setPreferredSize(new Dimension(600, 300));
        //setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args) {
        new TimerSwing1().setVisible(true);
    }

    class TimerTick1 implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            countdown1--;
            timeLabel.setText(String.valueOf("tmr" + countdown1 + "s: " + "<<" + eventname1 + ">>"));
        }
    }

    class TimerTick2 implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            countdown2--;

            int hour = countdown2 / 3600;
            int minute = (countdown2 % 3600) / 60;
            int second = (countdown2 % 3600) % 60;

            timeLabel.setText(String.valueOf("tmr" + hour + "h" + minute + "m" + second  + "s:" + "<<" + eventname2 + ">>"));
        }
    }
}