package oop.task_TimerSwingJ;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;


public class TimerSwing extends JFrame {

    private JLabel timeLabel;
    private Timer timer;
    private JButton start;
    private  int countdown;
    private String eventname;

    public TimerSwing() {
        System.out.println("Напишите название события");
        Scanner sc = new Scanner(System.in);
        eventname = sc.nextLine();

        System.out.println("Введите длительность таймера через ентер часов/минут/секунд");
        int hourevent = sc.nextInt();
        int minutevent = sc.nextInt();
        int secondevent = sc.nextInt();
        countdown = hourevent * 3600 + minutevent * 60 + secondevent;

        setTitle("Таймер");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Monospaced", Font.BOLD, 15));

        timer = new Timer(1000, new TimerTick());

        start = new JButton("Начать отсчёт");
        start.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                remove(start);
                add(timeLabel);
                validate();
                repaint();
                timer.start();
            }
        });

        add(start);
        setPreferredSize(new Dimension(600, 300));
        setLocationRelativeTo(null);
        pack();
    }

    public static void main(String[] args) {
        new TimerSwing().setVisible(true);
    }

    class TimerTick implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            countdown--;
            int hour = countdown / 3600;
            int minute = (countdown % 3600) / 60;
            int second = (countdown % 3600) % 60;
            timeLabel.setText(String.valueOf(eventname + " Осталось Часов:" + hour + " Минут:" + minute + " Секунд:" + second));
        }

    }
}
