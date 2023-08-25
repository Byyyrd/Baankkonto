package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankkontoView {
    private JButton einzahlenButton;
    private JButton auszahlenButton;
    private JPanel mainPanel;
    private JTextField betragText;
    private JLabel kontostandText;
    private Bankkonto bankkonto;
    private BankkontoController bc;


    public BankkontoView(BankkontoController pBc) {
        JFrame frame = new JFrame("BankkontoView");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        bc = pBc;
        bankkonto = bc.getBankkonto();
        kontostandText.setText(Double.toString(bankkonto.getKontostand()));
        einzahlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bc.veraendereKontostand(Double.parseDouble(betragText.getText()));
                kontostandText.setText(Double.toString(bankkonto.getKontostand()));
            }
        });
        auszahlenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bc.veraendereKontostand(-Double.parseDouble(betragText.getText()));
                kontostandText.setText(Double.toString(bankkonto.getKontostand()));
            }
        });
    }
}
