

package Matriz;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;

public class Task {

    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Selecione a pasta a ser organizada");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int userSelection = chooser.showOpenDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFolder = chooser.getSelectedFile();
            try {
                organizarArquivos(selectedFolder);
                JOptionPane.showMessageDialog(null, "Arquivos organizados com sucesso!");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao organizar os arquivos: " + e.getMessage());
            }
        }
    }

    public static void organizarArquivos(File folder) throws IOException {
        File[] files = folder.listFiles();

        if (files != null) {
            Map<String, File> extensaoPastaMap = new HashMap<>();

            for (File file : files) {
                if (file.isFile()) {
                    String extensao = obterExtensao(file.getName());
                    File pastaDestino = extensaoPastaMap.computeIfAbsent(extensao, k -> new File(folder, k));
                    pastaDestino.mkdirs();

                    Path origem = file.toPath();
                    Path destino = new File(pastaDestino, file.getName()).toPath();

                    Files.move(origem, destino, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }

    public static String obterExtensao(String nomeArquivo) {
        int indexPonto = nomeArquivo.lastIndexOf('.');
        if (indexPonto > 0 && indexPonto < nomeArquivo.length() - 1) {
            return nomeArquivo.substring(indexPonto + 1).toLowerCase();
        }
        return "";
    }
}

