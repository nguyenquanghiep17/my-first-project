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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class Menu extends JPanel {
    
    private JLabel newGame;
    private JLabel options;
    private JLabel exit;

    public Menu(ContainerPanel containerPanel) {

        setLayout(null);
        setPreferredSize(new Dimension(Game.column, Game.row));

        newGame = new JLabel("New Game");
        options = new JLabel("Options");
        exit = new JLabel("Exit");
        
        newGame.setBounds(350, 150, 150, 50);
        newGame.setFont(new Font("Arial", Font.PLAIN, 30));
        newGame.setForeground(Color.BLACK);
        newGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                containerPanel.showGame();
            }
            
        });
        
        options.setBounds(350, 225, 150, 50);
        options.setFont(new Font("Arial", Font.PLAIN, 30));
        options.setForeground(Color.BLACK);
        options.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                containerPanel.showOptions();
            }
            
        });
        
        exit.setBounds(350, 300, 150, 50);
        exit.setFont(new Font("Arial", Font.PLAIN, 30));
        exit.setForeground(Color.BLACK);
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
            
        });
        
        add(newGame);
        add(options);
        add(exit);
    }
    
    
    
    
}
