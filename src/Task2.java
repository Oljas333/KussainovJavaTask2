import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Task2 extends JFrame {

    public static void main(String[] args) {
        Task2 app = new Task2();
        app.setVisible(true);
    }

    public Task2(GraphicsConfiguration gc) {
        super(gc);
    }

    public JButton button = new JButton("Результат");
    public JTextField input = new JTextField("", 5);
    public JTextField output = new JTextField("", 5);
    public JLabel labelInput = new JLabel("Ввод");
    public JLabel labelOutput = new JLabel("Вывод");

    public Task2() {
        super("Task2");
        {
            this.setBounds(700, 450, 250, 200);
            this.setDefaultCloseOperation(3);
            Container container = this.getContentPane();
            container.setLayout(new BoxLayout(this.getContentPane(), 1));
            container.add(this.labelInput);
            container.add(this.input);
            container.add(this.labelOutput);
            container.add(this.output);
            button.addActionListener(new MyClass());
            container.add(this.button);
        }
    }

    public class MyClass implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button) {

                try {
                    output.setText(result(input.getText()));
                } catch (Exception except) {
                    output.setText("Ошибка, введите имя");
                }

                input.setText(null);

            }
        }

        public String result(String name) {
            String str = name.toLowerCase();
            if (str.equals("вячеслав")) {
                str = "Привет, Вячеслав";
            } else {
                str = "Нет такого имени";
            }
            return str;
        }
    }
}