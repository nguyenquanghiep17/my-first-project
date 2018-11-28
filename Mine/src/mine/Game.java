/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mine;

import java.awt.Dimension;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Admin
 */
public class Game extends JPanel {

    public static int row = 10;
    public static int column = 20;
    public static int mine = 10;
    
    private static char[][] map;
    private static int[][] mapNumber;
    private static int[][] density;
    private static JButton[][] listButton;
    private static final ArrayList<Location> listLocations = new ArrayList<>();
    private final ContainerPanel containerPanel;
    private static int cnt = 0;
    Game(ContainerPanel containerPanel) {
        this.containerPanel = containerPanel;
        setLayout(null);
        setVisible(true);

    }

    private void print(int i, int j) {

        if (map[i][j] == 'M') {

            for (int x = 0; x < row; x++) {
                for (int y = 0; y < column; y++) {
                    if (map[x][y] == 'M') {
                        listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\mine.png"));
                    }
                }
            }
            Object[] options1 = {"New Game", "Back to Menur", "Exit"};

            int result = JOptionPane.showOptionDialog(null,
                    "Selection",
                    "You Lost",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options1,
                    null);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    reload();
                    break;
                case JOptionPane.NO_OPTION:
                    this.removeAll();
                    listLocations.clear();
                    containerPanel.showMenu();
                    break;
                default:
                    System.exit(0);
            }
        } else {
            
            update(i, j);
            for (int x = 0; x < row; x++) {
                for (int y = 0; y < column; y++) {
                    switch (mapNumber[x][y]) {
                        case 0:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\open.png"));
                            break;

                        case 1:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des1.png"));
                            break;
                        case 2:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des2.png"));
                            break;
                        case 3:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des3.png"));
                            break;
                        case 4:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des4.png"));
                            break;
                        case 5:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des5.png"));
                            break;
                        case 6:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des6.png"));
                            break;
                        case 7:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des7.png"));
                            break;
                        case 8:
                            listButton[x][y].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\des8.png"));
                            break;
                        default:
                            break;
                    }
                }

            }
            System.out.println(cnt);
            if (cnt == column * row - mine) {
                            Object[] options1 = {"New Game", "Back to Menur", "Exit"};

            int result = JOptionPane.showOptionDialog(null,
                    "Selection",
                    "You Win",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options1,
                    null);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    reload();
                    break;
                case JOptionPane.NO_OPTION:
                    this.removeAll();
                    listLocations.clear();
                    containerPanel.showMenu();
                    break;
                default:
                    System.exit(0);
            }
            }
        }

    }

    private int counting(int x, int y) {
        int cnt = 0;
        int top = x - 1;
        int bot = x + 1;
        int left = y - 1;
        int right = y + 1;
        if (top == -1) {
            top = 0;
        }
        if (left == -1) {
            left = 0;
        }
        if (bot == row) {
            bot = row - 1;
        }
        if (right == column) {
            right = column - 1;
        }
        for (int i = top; i <= bot; i++) {
            for (int j = left; j <= right; j++) {
                if (map[i][j] == 'M') {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void saveDensity() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (map[i][j] != 'M') {
                    density[i][j] = counting(i, j);
                }
            }
        }
    }

    private void update(int x, int y) {
        if (x < 0 || x >= row || y < 0 || y >= column || mapNumber[x][y] != -1) {
            return;
        }
        cnt ++;
        mapNumber[x][y] = density[x][y];

        if (density[x][y] == 0) {
            update(x - 1, y - 1);
            update(x - 1, y);
            update(x - 1, y + 1);
            update(x, y - 1);
            update(x, y + 1);
            update(x + 1, y - 1);
            update(x + 1, y);
            update(x + 1, y + 1);
        }
    }

    public void run() {
        cnt = 0;
        map = new char[row][column];
        mapNumber = new int[row][column];
        density = new int[row][column];
        listButton = new JButton[row][column];
        setPreferredSize(new Dimension(column * 45, row * 45));
        listLocations.clear();

        while (listLocations.size() < mine) {
            Location location = new Location(row, column);
            if (!listLocations.contains(location)) {
                listLocations.add(location);
                map[location.x][location.y] = 'M';
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                listButton[i][j] = new JButton();
                listButton[i][j].setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Mine\\close.png"));

                listButton[i][j].addMouseListener(new Mouse(i, j) {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        print(i, j);

                    }
                });
                mapNumber[i][j] = -1;
                density[i][j] = -1;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                listButton[i][j].setBounds(j * 45, i * 45, 45, 45);
                this.add(listButton[i][j]);
            }
        }

        saveDensity();


    }

    public void reload() {
        cnt = 0;
        this.removeAll();
        listLocations.clear();
        run();
        this.repaint();
    }
}
