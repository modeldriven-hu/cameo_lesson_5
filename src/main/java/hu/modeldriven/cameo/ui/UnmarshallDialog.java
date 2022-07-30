package hu.modeldriven.cameo.ui;

import javax.swing.*;
import java.awt.*;

public class UnmarshallDialog extends JDialog {

    private final UnmarshallPanel panel;

    public UnmarshallDialog(Frame parent) {
        super(parent, "Unmarshall action", false);

        this.panel = new UnmarshallPanel();

        this.setContentPane(panel);
        this.pack();

        this.setLocationRelativeTo(parent);
        this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
    }

}
