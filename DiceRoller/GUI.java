package DiceRoller;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    Dice x = new Dice();
    private JButton d100Button;
    private JButton d20Button;
    private JButton d12Button;
    private JButton d10Button;
    private JButton d8Button;
    private JButton d6Button;
    private JButton d4Button;
    private JLabel resultLabel;
    private JPanel panel;
    private JFrame frame;

    public GUI() {

        d100Button = new JButton("Roll d100");
        d20Button = new JButton("Roll d20");
        d12Button = new JButton("Roll d12");
        d10Button = new JButton("Roll d10");
        d8Button = new JButton("Roll d8");
        d6Button = new JButton("Roll d6");
        d4Button = new JButton("Roll d4");
        d100Button.addActionListener(this);
        d20Button.addActionListener(this);
        d12Button.addActionListener(this);
        d10Button.addActionListener(this);
        d8Button.addActionListener(this);
        d6Button.addActionListener(this);
        d4Button.addActionListener(this);

        resultLabel = new JLabel("Result: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        panel.setLayout(new GridLayout(0, 7));
        panel.add(d100Button);
        panel.add(d20Button);
        panel.add(d12Button);
        panel.add(d10Button);
        panel.add(d8Button);
        panel.add(d6Button);
        panel.add(d4Button);
        panel.add(resultLabel);

        frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("DiceRoller");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
        public void actionPerformed(ActionEvent e) {
        Integer i = 0;
        if (e.getSource() == d100Button) {
            i = x.d100();
        }
        if (e.getSource() == d20Button) {
            i = x.d20();
        }
        if (e.getSource() == d12Button) {
            i = x.d12();
        }
        if (e.getSource() == d10Button) {
                i = x.d10();
        }
        if (e.getSource() == d8Button) {
                i = x.d8();
        }
        if (e.getSource() == d6Button) {
                i = x.d6();
        }
        if (e.getSource() == d4Button) {
            i = x.d4();
        }
        resultLabel.setText("Result: " + String.valueOf(i));
    }

    public static void main(String[] args) {
        new GUI();
    }
}
