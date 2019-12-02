package programacao_funcional;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloButtonApp2 {

    private final Button button = new Button();

    public HelloButtonApp2() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent e) {
                System.out.println("Hello There: event received:" + e);
            }
        });
    }

}
