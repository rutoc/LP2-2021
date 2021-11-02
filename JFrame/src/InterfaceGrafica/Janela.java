package InterfaceGrafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame implements ActionListener{

    JButton jb = new JButton("Enviar");
    JLabel label = new JLabel("Raphael Siqueira Azevedo - HT3006379");
    JTextField caixa = new JTextField(30);


    public void actionPerformed(ActionEvent e) {
        System.out.println(caixa.getText());
        JOptionPane.showMessageDialog(null, caixa.getText());
    }

    public Janela() {

        setTitle("Uso de Interface Gráfica");
        setSize(450, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(new FlowLayout());

        add(caixa);
        jb.addActionListener(this);
        jb.setBounds(300, 200, 100, 60);
        add(jb);

        label.setBounds(10, 5, 300, 20);
        add(label);
    }

    public static void main(String[] args){

        new Janela();

    }
}
