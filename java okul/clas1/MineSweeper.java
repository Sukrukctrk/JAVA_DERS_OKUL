import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MineSweeper extends JFrame {
    private static final int SIZE = 10;
    private static final int MINES = 20;
    private JButton[][] buttons = new JButton[SIZE][SIZE];
    private boolean[][] mines = new boolean[SIZE][SIZE];
    private boolean[][] revealed = new boolean[SIZE][SIZE];

    public MineSweeper() {
        setLayout(new GridLayout(SIZE, SIZE));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        // Initialize buttons and mines
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addActionListener(new ButtonListener(i, j));
                add(buttons[i][j]);
                mines[i][j] = false;
                revealed[i][j] = false;
            }
        }

        // Place mines randomly
        Random rand = new Random();
        int placedMines = 0;
        while (placedMines < MINES) {
            int x = rand.nextInt(SIZE);
            int y = rand.nextInt(SIZE);
            if (!mines[x][y]) {
                mines[x][y] = true;
                placedMines++;
            }
        }

        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        private int x, y;

        public ButtonListener(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            reveal(x, y);
        }
    }

    private void reveal(int x, int y) {
        if (revealed[x][y]) {
            return;
        }

        revealed[x][y] = true;
        if (mines[x][y]) {
            buttons[x][y].setText("M");
            JOptionPane.showMessageDialog(this, "Game Over!");
            System.exit(0);
        } else {
            int adjacentMines = countAdjacentMines(x, y);
            buttons[x][y].setText(String.valueOf(adjacentMines));
            buttons[x][y].setEnabled(false);

            if (adjacentMines == 0) {
                // Reveal adjacent cells if no adjacent mines
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int nx = x + i, ny = y + j;
                        if (nx >= 0 && ny >= 0 && nx < SIZE && ny < SIZE) {
                            reveal(nx, ny);
                        }
                    }
                }
            }
        }
    }

    private int countAdjacentMines(int x, int y) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nx = x + i, ny = y + j;
                if (nx >= 0 && ny >= 0 && nx < SIZE && ny < SIZE && mines[nx][ny]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new MineSweeper();
    }
}
