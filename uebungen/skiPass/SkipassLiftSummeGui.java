package uebungen.skiPass;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import javax.swing.JFileChooser;

public class SkipassLiftSummeGui {

    public static void main(String[] args) throws IOException {

        // Выбор файла через JFileChooser
        List<String> inhalt = Files.readAllLines(dateiWaehlen().toPath(), StandardCharsets.ISO_8859_1);

        String zielSkipass = "30201"; // можно заменить на ввод с консоли или через GUI
        int summeLiftlaenge = 0;

        for (int i = 1; i < inhalt.size(); i++) { // начинаем с 1, пропускаем заголовок
            String[] zeile = inhalt.get(i).split(";");
            if (zeile.length >= 6 && zeile[2].equals(zielSkipass)) {
                int liftlaenge = Integer.parseInt(zeile[5]);
                summeLiftlaenge += liftlaenge;
            }
        }

        System.out.println("Gesamte Liftlänge für Skipass " + zielSkipass + ": " + summeLiftlaenge + " Meter");
    }

    // Метод выбора файла
    static File dateiWaehlen() {
        File quelle = new File("");
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Bitte Log-Date wählen");
        int returnWert = file.showDialog(null, "OK");

        if (returnWert == JFileChooser.APPROVE_OPTION) {
            quelle = file.getSelectedFile();
            System.out.println("Sie haben die Datei " + quelle + " gewählt!");
        } else {
            System.out.println("Keine Datei gewählt. Standarddatei wird verwendet.");
            quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\uebungen\\skiPass\\LogSkipassProblem.txt"); // fallback
        }

        return quelle;
    }
}

