import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class registarAlimentos extends JFrame {
    private ArrayList<Alimento> alimentos;
    private DefaultListModel<String> listModel;
    private JList<String> list;
    private JTextField nomeField, caloriasField, tipoField, alcoolicaField, saborField;

    public registarAlimentos() {
        alimentos = new ArrayList<>();
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);

        setTitle("Registro de Alimentos");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Calorias:"));
        caloriasField = new JTextField();
        panel.add(caloriasField);

        panel.add(new JLabel("Tipo (Fruta):"));
        tipoField = new JTextField();
        panel.add(tipoField);

        panel.add(new JLabel("Alcoólica (Bebida):"));
        alcoolicaField = new JTextField();
        panel.add(alcoolicaField);

        panel.add(new JLabel("Sabor (Sabor):"));
        saborField = new JTextField();
        panel.add(saborField);

        JButton addButton = new JButton("Adicionar");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                adicionarAlimento();
            }
        });
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);
        add(new JScrollPane(list), BorderLayout.EAST);

        setVisible(true);
    }

    private void adicionarAlimento() {
        String nome = nomeField.getText();
        double calorias = Double.parseDouble(caloriasField.getText());
        String tipo = tipoField.getText();
        boolean alcoolica = Boolean.parseBoolean(alcoolicaField.getText());
        String sabor = saborField.getText();

        if (!tipo.isEmpty()) {
            Fruta fruta = new Fruta(nome, calorias, tipo);
            alimentos.add(fruta);
            listModel.addElement(fruta.toString());
        } else if (!sabor.isEmpty()) {
            Sabor suco = new Sabor(nome, calorias, alcoolica, sabor);
            alimentos.add(suco);
            listModel.addElement(suco.toString());
        } else {
            Bebida bebida = new Bebida(nome, calorias, alcoolica);
            alimentos.add(bebida);
            listModel.addElement(bebida.toString());
        }

        nomeField.setText("");
        caloriasField.setText("");
        tipoField.setText("");
        alcoolicaField.setText("");
        saborField.setText("");
    }

    public static void main(String[] args) {
        new registarAlimentos();
    }
}
