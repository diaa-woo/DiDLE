package view;

import function.File.Open;
import function.File.Save;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorPanel extends JPanel{
    private JPanel editorPanel;
    private JTextArea editorTextArea;
    private JScrollPane editorScroll;
    private JButton saveButton;
    private JButton openButton;

    public EditorPanel() {
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
                Save.save(editorTextArea.getText());
            }
            else if(e.getSource() == openButton) {
                editorTextArea.setText(Open.open());
            }
        }
    }
}
