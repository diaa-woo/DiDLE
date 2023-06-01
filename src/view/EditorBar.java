package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
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
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        // TODO: event add
        fileMenu.add(openMenuItem);

        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        // TODO: event add
        fileMenu.add(saveMenuItem);

        setVisible(true);
    }
}
