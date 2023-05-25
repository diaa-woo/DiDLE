import javax.swing.*;

public class Editor extends JFrame {
    private EditorPanel ep = new EditorPanel();
    private EditorBar eb = new EditorBar();

    Editor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SmallEditor");
        setSize(500, 500);

        setJMenuBar(eb);
        this.add(ep);
        this.setVisible(true);
    }
}
