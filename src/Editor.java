import File.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Editor extends JFrame{
    private JPanel editorPanel;
    private JTextArea editorTextArea;
    private JScrollPane editorScroll;
    private JButton saveButton;
    private JButton openButton;

    public Editor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SmallEditor");
        setSize(350, 250);
        this.setLayout(new FlowLayout());

        // textEditor
        editorPanel = new JPanel();
        editorTextArea = new JTextArea(20, 30);
        editorScroll = new JScrollPane(editorTextArea);

        // Save Button 생성
        saveButton = new JButton("save");
        saveButton.addActionListener(new PushAction());

        // Open Button 생성
        openButton = new JButton("open");
        openButton.addActionListener(new PushAction());

        editorPanel.add(editorScroll);
        editorPanel.add(saveButton);
        editorPanel.add(openButton);

        this.add(editorPanel);
        this.setVisible(true);
    }

    public class PushAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == saveButton) {
                try {
                    Path path = Paths.get("C:\\Users\\SW2148\\project\\DiDLE\\src\\out\\test.txt");
                    Files.write(path, editorTextArea.getText().getBytes());
                } catch (Exception error) {
                    error.printStackTrace();
                }
            }
            else if(e.getSource() == openButton) {
                try {
                    String str = Files.readString(Paths.get("C:\\Users\\SW2148\\project\\DiDLE\\src\\out\\test.txt"));
                    editorTextArea.setText(str);
                } catch (IOException error) {
                    error.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Editor e = new Editor();
    }
}
