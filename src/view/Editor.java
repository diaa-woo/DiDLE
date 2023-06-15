package view;

import javax.swing.*;
import java.awt.*;

public class Editor extends JFrame {
    private EditorBar eb = new EditorBar();
    private Container myContainer = null;

    public Editor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SmallEditor");
        setSize(500, 500);
        setLayout(new BorderLayout());

        // Look & Feel
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch(Exception e) {
            e.printStackTrace();
        }

        setJMenuBar(eb);

        final JTextArea myText = new JTextArea();
        myText.setLineWrap(true);
        JScrollPane myScroll = new JScrollPane(myText);

        myContainer = this.getContentPane();
        myContainer.setLayout(new BorderLayout());
        myContainer.add(myScroll, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
