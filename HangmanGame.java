import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HangmanGame extends JFrame {
    private JTextField guessField;
    private JLabel wordLabel;
    private JLabel messageLabel;
    private JLabel hangmanLabel;
    private JLabel wrongLettersLabel;
    private String wordToGuess;
    private char[] guessedWord;
    private int tries;
    private String category;
    private Set<Character> guessedLetters;
    private String[] hangmanStages = {
        " +---+\n     |\n     |\n     |\n    ===",
        " +---+\n O   |\n     |\n     |\n    ===",
        " +---+\n O   |\n |   |\n     |\n    ===",
        " +---+\n O   |\n/|   |\n     |\n    ===",
        " +---+\n O   |\n/|\\  |\n     |\n    ===",
        " +---+\n O   |\n/|\\  |\n/    |\n    ===",
        " +---+\n O   |\n/|\\  |\n/ \\  |\n    ==="
    };

    public HangmanGame() {
        setTitle("Adam Asmaca Oyunu");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] categories = {"Bitki", "Hayvan", "Şehir", "Ülke", "İsim"};
        category = (String) JOptionPane.showInputDialog(
                this,
                "Kategori seçin:",
                "Kategori Seçimi",
                JOptionPane.QUESTION_MESSAGE,
                null,
                categories,
                categories[0]
        );

        wordToGuess = getRandomWord(category);
        guessedWord = new char[wordToGuess.length()];
        Arrays.fill(guessedWord, '_');
        tries = 0;
        guessedLetters = new HashSet<>();

        hangmanLabel = new JLabel("<html><pre>" + hangmanStages[tries] + "</pre></html>");
        wordLabel = new JLabel(getFormattedWord());
        messageLabel = new JLabel("Bir harf tahmin edin:");
        wrongLettersLabel = new JLabel("Yanlış Harfler: ");
        guessField = new JTextField(5);
        guessField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });

        add(hangmanLabel);
        add(wordLabel);
        add(messageLabel);
        add(guessField);
        add(wrongLettersLabel);
    }

    private String getRandomWord(String category) {
        Map<String, String[]> words = new HashMap<>();
        words.put("Bitki", new String[]{"Menekşe", "Lale", "Gül", "Orkide", "Papatya", "Zambak", "Lavanta", "Karanfil", "Sümbül", "Begonya"});
        words.put("Hayvan", new String[]{"Kedi", "Köpek", "Aslan", "Fil", "Kaplumbağa", "Tavşan", "At", "İnek", "Koyun", "Tavuk"});
        words.put("Şehir", new String[]{"Ankara", "İstanbul", "İzmir", "Bolu", "Antalya", "Bursa", "Adana", "Gaziantep", "Diyarbakır", "Konya"});
        words.put("Ülke", new String[]{"Türkiye", "Almanya", "Fransa", "İtalya", "İspanya", "Japonya", "Çin", "Brezilya", "Rusya", "Kanada"});
        words.put("İsim", new String[]{"Ali", "Ahmet", "Ayşe", "Fatma", "Mehmet", "Elif", "Hüseyin", "Zeynep", "Mustafa", "Hatice"});

        Random rand = new Random();
        String[] selectedWords = words.get(category);
        return selectedWords[rand.nextInt(selectedWords.length)].toUpperCase();
    }

    private void checkGuess() {
        String guess = guessField.getText().toUpperCase();
        if (guess.length() != 1) {
            messageLabel.setText("Lütfen bir harf girin!");
            return;
        }

        char guessedChar = guess.charAt(0);
        if (guessedLetters.contains(guessedChar)) {
            messageLabel.setText("Bu harfi zaten tahmin ettiniz!");
            return;
        }

        guessedLetters.add(guessedChar);
        boolean correctGuess = false;

        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guessedChar) {
                guessedWord[i] = guessedChar;
                correctGuess = true;
            }
        }

        guessField.setText("");

        if (!correctGuess) {
            tries++;
            wrongLettersLabel.setText(wrongLettersLabel.getText() + " " + guessedChar + " ");
        }

        if (String.valueOf(guessedWord).equals(wordToGuess)) {
            messageLabel.setText("Tebrikler! Kelimeyi doğru bildiniz: " + wordToGuess);
            wordLabel.setText(getFormattedWord(true));
            hangmanLabel.setText("<html><pre>" + hangmanStages[hangmanStages.length - 1] + "</pre></html>");
        } else if (tries >= 6) {
            messageLabel.setText("Kaybettiniz! Kelime: " + wordToGuess);
            wordLabel.setText(wordToGuess);
            hangmanLabel.setText("<html><pre>" + hangmanStages[hangmanStages.length - 1] + "</pre></html>");
        } else {
            wordLabel.setText(getFormattedWord());
            messageLabel.setText("Bir harf tahmin edin:");
            hangmanLabel.setText("<html><pre>" + hangmanStages[tries] + "</pre></html>");
        }
    }

    private String getFormattedWord() {
        return getFormattedWord(false);
    }

    private String getFormattedWord(boolean showFull) {
        StringBuilder formattedWord = new StringBuilder();
        for (int i = 0; i < guessedWord.length; i++) {
            if (showFull || guessedWord[i] != '_') {
                formattedWord.append(wordToGuess.charAt(i)).append(" ");
            } else {
                formattedWord.append("_ ");
            }
        }
        return formattedWord.toString().trim();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HangmanGame().setVisible(true);
            }
        });
    }
}
