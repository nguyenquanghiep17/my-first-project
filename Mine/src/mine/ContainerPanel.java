/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mine;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import javax.swing.JPanel;
import static mine.Game.column;
import static mine.Game.row;

/**
 *
 * @author Admin
 */
public class ContainerPanel extends JPanel {

    private Options options;
    private Menu menu;
    public Game game;
    private static final String TAG_MENU = "tag_menu";
    private static final String TAG_OPTIONS = "tag_options";
    private static final String TAG_GAME = "tag_game";

    private CardLayout cardLayout;
    public Frame _frame;
    public ContainerPanel(Frame frame){
        _frame = frame;
        setPreferredSize(new Dimension(column * 45, row * 45));
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        game = new Game(this);
        menu = new Menu(this);
        options = new Options(this);
        add(menu, TAG_MENU);
        add(options, TAG_OPTIONS);
        add(game, TAG_GAME);
        showMenu();
        
    }

    public void showMenu() {
        cardLayout.show(ContainerPanel.this, TAG_MENU);
        menu.requestFocus();
    }
    
    public void showOptions() {
        cardLayout.show(ContainerPanel.this, TAG_OPTIONS);
        options.requestFocus();
    }
    public void showGame() {
        cardLayout.show(ContainerPanel.this, TAG_GAME);
        game.requestFocus();
        game.run();
    }


}
