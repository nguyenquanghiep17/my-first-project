/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mine;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static mine.Game.column;
import static mine.Game.row;

/**
 *
 * @author Admin
 */
public class Options extends JPanel {

    private JLabel rowLabel;
    private JLabel columnLabel;
    private JLabel mineLabel;
    private JLabel backJLabel;
    private JLabel save;
    private JTextField rowTextField;
    private JTextField columnTextField;
    private JTextField mineTextField;
    private ContainerPanel containerPanel;
    public Options(ContainerPanel containerPanel) {
        this.containerPanel = containerPanel;
        setLayout(null);
        rowLabel = new JLabel("Row");
        columnLabel = new JLabel("Colume");
        mineLabel = new JLabel("Mine");

        rowTextField = new JTextField();
        columnTextField = new JTextField();
        mineTextField = new JTextField();

        backJLabel = new JLabel("Back");
        backJLabel.setFont(new Font("Arial", Font.PLAIN, 30));
        backJLabel.setForeground(Color.BLACK);
        backJLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                containerPanel.showMenu();
            }

        });

        save = new JLabel("Save");
        save.setFont(new Font("Arial", Font.PLAIN, 30));
        save.setForeground(Color.BLACK);
        save.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Game.row = Integer.valueOf(rowTextField.getText());
                System.out.println(Game.row);
                Game.column = Integer.valueOf(columnTextField.getText());
                System.out.println(Game.column);
                Game.mine = Integer.valueOf(mineTextField.getText());
                System.out.println(Game.mine);

                containerPanel._frame.setSize(new Dimension(column * 45 + 5, row * 45 + 28));
                containerPanel._frame.setLocationRelativeTo(null);
                containerPanel.setPreferredSize(new Dimension(column * 45, row * 45));
                
                setBounds();
            }

        });
        add(rowLabel);
        add(columnLabel);
        add(mineLabel);
        add(backJLabel);
        add(rowTextField);
        add(columnTextField);
        add(mineTextField);
        add(save);

        rowTextField.setBounds(300, 110, 100, 20);
        columnTextField.setBounds(300, 210, 100, 20);
        mineTextField.setBounds(300, 310, 100, 20);

        rowLabel.setBounds(150, 100, 100, 50);
        columnLabel.setBounds(150, 200, 100, 50);
        mineLabel.setBounds(150, 300, 100, 50);
        setBounds();
    }
    
    private void setBounds() {
        backJLabel.setBounds(containerPanel.getPreferredSize().width - 100 , containerPanel.getPreferredSize().height - 50, 100, 50);
        save.setBounds(100, containerPanel.getPreferredSize().height - 50, 100, 50);

    }

}
