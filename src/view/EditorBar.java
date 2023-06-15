package view;

import function.File.Open;
import function.File.Save;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class EditorBar extends JMenuBar {
    private JMenu fileMenu, editMenu, viewMenu;
    private JMenuItem newMenuItem, openMenuItem, saveMenuItem, exitMenuItem;
    private JMenuItem copyMenuItem, pasteMenuItem, cutMenuItem, selectAllMenuItem;
    private ButtonGroup group = new ButtonGroup();

    EditorBar() {
        // Initialize function.File Menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_I);    // 단축기 설정
        this.add(fileMenu);

        // Create function.File Menu Field
        // New!
        newMenuItem = new JMenuItem("New");
        fileMenu.add(newMenuItem);

        // Open!
        openMenuItem = new JMenuItem("Open");
        openMenuItem.addActionListener(new FilePushAction());
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        fileMenu.add(openMenuItem);

        // Save!
        saveMenuItem = new JMenuItem("Save");
        saveMenuItem.addActionListener(new FilePushAction());
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        fileMenu.add(saveMenuItem);

        fileMenu.addSeparator();

        // Exit
        exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);


        // Initialize function.Edit Menu
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);    // 단축기 설정
        this.add(editMenu);

        // Create function.Edit Menu Field
        // Copy
        copyMenuItem = new JMenuItem("Copy");
        copyMenuItem.addActionListener(new EditPushAction());
        editMenu.add(copyMenuItem);

        // Paste
        pasteMenuItem = new JMenuItem("Paste");
        pasteMenuItem.addActionListener(new EditPushAction());
        editMenu.add(pasteMenuItem);

        // Cut
        cutMenuItem = new JMenuItem("Cut");
        cutMenuItem.addActionListener(new EditPushAction());
        editMenu.add(cutMenuItem);

        // Select All
        selectAllMenuItem = new JMenuItem("Select All");
        selectAllMenuItem.addActionListener(new EditPushAction());
        editMenu.add(selectAllMenuItem);

        setVisible(true);
    }

    public class FilePushAction implements ActionListener {
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

    public class EditPushAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == copyMenuItem)
                Editor.myText.copy();
            else if(e.getSource() == pasteMenuItem)
                Editor.myText.paste();
            else if(e.getSource() == cutMenuItem)
                Editor.myText.cut();
            else if(e.getSource() == selectAllMenuItem) {
                if(Editor.myText.getText().length() >= 0) {
                    Editor.myText.select(0, Editor.myText.getText().length());
                    System.out.println(Editor.myText.getText() + "/" + Editor.myText.getText().length());
                }
            }

        }
    }
}
