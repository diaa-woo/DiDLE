package view;

import function.File.Open;
import function.File.Save;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EditorBar extends JMenuBar {
    private JMenu fileMenu, editMenu, viewMenu;
    private JMenuItem openMenuItem, saveMenuItem;
    private ButtonGroup group = new ButtonGroup();

    EditorBar() {
        // Initialize function.File Menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_I);    // 단축기 설정
        this.add(fileMenu);

        // Create function.File Menu Field
        openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new PushAction());
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        fileMenu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new PushAction());
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        fileMenu.add(saveMenuItem);

        setVisible(true);
    }

    public class PushAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == saveMenuItem) {
                // Save.save(editorTextArea.getText());
            }
            else if(e.getSource() == openMenuItem) {
                // editorTextArea.setText(Open.open());
            }
        }
    }
}
