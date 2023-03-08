import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class newMenu extends JFrame {
    private JButton cadastrarProdutoButton;
    private JButton cadastrarUsuarioButton;
    private JPanel pnlMenu;

    public newMenu() {
        initComponents();
        createListener();
    }

    public void createListener() {
        cadastrarProdutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadProduct product = new cadProduct();
                product.setVisible(true);
                dispose();
            }
        });

        cadastrarUsuarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadUser user = new cadUser();
                user.setVisible(true);
                dispose();
            }
        });
    }

    public void initComponents() {
        setTitle("Tela de Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pnlMenu);
        setVisible(true);

    }

    public static void main(String[] args) {
        newMenu telaMenu = new newMenu();
    }
}
