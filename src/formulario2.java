import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario2 {

    private JFrame frame;
    private JPanel paneliz,paneliz2, panelde, panelde2, panelButton, panelForm, panelContainer;
    private JLabel nombre, apellidos, telefono, ine, genero, carrera, semestre, matricula;
    private JTextField text1, text2, text3, text4, text5,text6,text7,text8 ;
    private JButton boton1, boton2;



    public formulario2() {
        EventClick eventClick = new EventClick();

        frame = new JFrame();
        paneliz = new JPanel();
        paneliz2 = new JPanel();
        panelde = new JPanel();
        panelde2 = new JPanel();
        panelButton = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        nombre = new JLabel();
        apellidos = new JLabel();
        telefono = new JLabel();
        ine = new JLabel();
        genero = new JLabel();
        carrera = new JLabel();
        semestre = new JLabel();
        matricula = new JLabel();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();
        boton1 = new JButton();
        boton2 = new JButton();


        frame.setTitle("Formulario Estudiantes");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(600, 220);

        nombre.setText("Nombre");
        apellidos.setText("Apellidos");
        telefono.setText("Telefono");
        ine.setText("INE");

        boton1.setText("Aceptar");
        boton2.setText("Cancelar");

        genero.setText("Genero");
        carrera.setText("Carrera");
        semestre.setText("Semestre");
        matricula.setText("matricula");

        paneliz.setLayout(new GridLayout(4, 0));
        paneliz.add(nombre);
        paneliz.add(apellidos);
        paneliz.add(telefono);
        paneliz.add(ine);


        panelde.setLayout(new GridLayout(4, 0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);

        paneliz2.setLayout(new GridLayout(4, 2));
        paneliz2.add(genero);
        paneliz2.add(carrera);
        paneliz2.add(semestre);
        paneliz2.add(matricula);


        panelde2.setLayout(new GridLayout(4, 2));
        panelde2.add(text5);
        panelde2.add(text6);
        panelde2.add(text7);
        panelde2.add(text8);

        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(500, 100));
        panelForm.add(paneliz);
        panelForm.add(panelde);
        panelForm.add(paneliz2);
        panelForm.add(panelde2);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(250, 50));
        panelButton.add(boton1);
        boton1.addActionListener(eventClick);

        panelButton.add(boton2);
        boton2.addActionListener(e -> {
                    text1.setText(" ");
                    text2.setText(" ");
                    text3.setText(" ");
                    text4.setText(" ");
                    text5.setText(" ");
                    text6.setText(" ");
                    text7.setText(" ");
                    text8.setText(" ");
                }
        );
        panelContainer.setLayout(new GridLayout(2, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelButton);

        frame.add(panelContainer);
    }


    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = text1.getText();
            String apellidos = text2.getText();
            String telefono = text3.getText();
            String ine = text4.getText();
            String genero = text5.getText();
            String carrera = text6.getText();
            String semestre = text7.getText();
            String matricula = text8.getText();
            System.out.println("Nombre: " + nombre + " Apellido: " + apellidos + " Tel: " + telefono + " Ine: "
                    + ine +" Genero: "+ genero+ " Carrera: " + carrera + " Semestre: " + semestre + " Matricula: "+ matricula);
        }
    }

}