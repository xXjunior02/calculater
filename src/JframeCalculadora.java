import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.MatteBorder;


public class JframeCalculadora extends JFrame {

    private JPanel panel_calculadora;
    private JButton boton_C;
    private JButton boton_divicion;
    private JButton boton_multiplicar;
    private JPanel caja_botones;
    private JButton boton_borrar;
    private JButton num_7;
    private JButton num_8;
    private JButton num_9;
    private JButton boton_resta;
    private JButton num_4;
    private JButton num_1;
    private JButton boton_porcentaje;
    private JButton num_5;
    private JButton num_2;
    private JButton num_cero;
    private JButton num_6;
    private JButton num_3;
    private JButton punto;
    private JButton boton_suma;
    private JButton boton_igual;
    private JTextField mostrar_operaciones;
    private JPanel caja_mostrar;
    private JLabel respuesta_nueva;

    private JLabel respuesta_antigua;

    //float primer_numero = 0;
    //float segundo_numero = 0;
    String operador_aritmeticos = "";
    //float resultado = 0;
    float acumulado = 0;
    String operacion_actual = "";

    public JframeCalculadora() {
        setContentPane(panel_calculadora);
        setTitle("bienvenido");
        setSize(350, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        mostrar_operaciones.setBorder(new MatteBorder(0, 0, 0, 0, Color.BLACK));
        boton_C.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_1.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_2.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_3.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_4.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_5.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_6.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_7.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_8.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_9.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_multiplicar.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_divicion.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_suma.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_borrar.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_resta.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_igual.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_porcentaje.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        punto.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        num_cero.setBorder(BorderFactory.createLineBorder(Color.decode("#2B2A2B")));
        boton_suma.setBorder(null);
        num_cero.setBorder(null);
        num_1.setBorder(null);
        num_2.setBorder(null);
        num_3.setBorder(null);
        num_4.setBorder(null);
        num_5.setBorder(null);
        num_6.setBorder(null);
        num_7.setBorder(null);
        num_8.setBorder(null);
        num_9.setBorder(null);
        boton_porcentaje.setBorder(null);
        boton_igual.setBorder(null);
        boton_resta.setBorder(null);
        boton_suma.setBorder(null);
        boton_borrar.setBorder(null);
        boton_divicion.setBorder(null);
        boton_C.setBorder(null);
        boton_multiplicar.setBorder(null);
        punto.setBorder(null);
        boton_suma.setBorderPainted(false);
        boton_suma.setFocusPainted(false);
        boton_C.setBorderPainted(false);
        num_1.setBorderPainted(false);
        num_2.setBorderPainted(false);
        num_3.setBorderPainted(false);
        num_4.setBorderPainted(false);
        num_5.setBorderPainted(false);
        num_6.setBorderPainted(false);
        num_7.setBorderPainted(false);
        num_8.setBorderPainted(false);
        num_9.setBorderPainted(false);
        boton_multiplicar.setBorderPainted(false);
        boton_divicion.setBorderPainted(false);
        boton_suma.setBorderPainted(false);
        boton_borrar.setBorderPainted(false);
        boton_resta.setBorderPainted(false);
        boton_igual.setBorderPainted(false);
        boton_porcentaje.setBorderPainted(false);
        punto.setBorderPainted(false);
        num_cero.setBorderPainted(false);
        boton_C.setFocusPainted(false);
        num_1.setFocusPainted(false);
        num_2.setFocusPainted(false);
        num_3.setFocusPainted(false);
        num_4.setFocusPainted(false);
        num_5.setFocusPainted(false);
        num_6.setFocusPainted(false);
        num_7.setFocusPainted(false);
        num_8.setFocusPainted(false);
        num_9.setFocusPainted(false);
        boton_multiplicar.setFocusPainted(false);
        boton_divicion.setFocusPainted(false);
        boton_suma.setFocusPainted(false);
        boton_borrar.setFocusPainted(false);
        boton_resta.setFocusPainted(false);
        boton_igual.setFocusPainted(false);
        boton_porcentaje.setFocusPainted(false);
        punto.setFocusPainted(false);
        num_cero.setFocusPainted(false);

        num_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float uno = Float.parseFloat(num_1.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) uno));

            }
        });
        num_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float dos = Float.parseFloat(num_2.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) dos));
            }
        });
        num_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float tres = Float.parseFloat(num_3.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) tres));
            }
        });
        num_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cuatro = Float.parseFloat(num_4.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) cuatro));
            }
        });
        num_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cinco = Float.parseFloat(num_5.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) cinco));
            }
        });
        num_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float seis = Float.parseFloat(num_6.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) seis));
            }
        });
        num_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float siete = Float.parseFloat(num_7.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) siete));
            }
        });
        num_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float ocho = Float.parseFloat(num_8.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) ocho));
            }
        });
        num_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float nueve = Float.parseFloat(num_9.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) nueve));
            }
        });
        num_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cero = Float.parseFloat(num_cero.getText());
                mostrar_operaciones.setText(mostrar_operaciones.getText() + ((int) cero));
            }
        });

        boton_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acumulado += Float.parseFloat(mostrar_operaciones.getText());
                operacion_actual += mostrar_operaciones.getText() + "+";
                operador_aritmeticos = "+";
                mostrar_operaciones.setText("");
            }
        });

        boton_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acumulado += Float.parseFloat(mostrar_operaciones.getText());
                operacion_actual += mostrar_operaciones.getText() + "-";
                operador_aritmeticos = "-";
                mostrar_operaciones.setText("");
            }
        });

        boton_multiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acumulado = (acumulado == 0) ? Float.parseFloat(mostrar_operaciones.getText()) : acumulado * Float.parseFloat(mostrar_operaciones.getText());
                operacion_actual += mostrar_operaciones.getText() + "x";
                operador_aritmeticos = "x";
                mostrar_operaciones.setText("");
            }
        });

        boton_divicion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float divisor = Float.parseFloat(mostrar_operaciones.getText());
                if (divisor != 0) {
                    acumulado = (acumulado == 0) ? 1 : acumulado / divisor;
                    operacion_actual += mostrar_operaciones.getText() + "/";
                    operador_aritmeticos = "/";
                    mostrar_operaciones.setText("");
                } else {
                    // Manejar división por cero si es necesario
                    System.out.println("Error: División por cero");
                }
            }
        });

        boton_igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float segundo_numero = Float.parseFloat(mostrar_operaciones.getText());

                switch (operador_aritmeticos) {
                    case "+":
                        acumulado += segundo_numero;
                        break;
                    case "-":
                        acumulado -= segundo_numero;
                        break;
                    case "x":
                        acumulado *= segundo_numero;
                        break;
                    case "/":
                        if (segundo_numero != 0) {
                            acumulado /= segundo_numero;
                        } else {
                            // Manejar división por cero si es necesario
                            System.out.println("Error: División por cero");
                        }
                        break;
                    case "%":
                        acumulado *= segundo_numero;
                    default:
                        System.out.println("Operador no reconocido");
                        break;
                }

                respuesta_nueva.setText(String.valueOf((int) acumulado));
                respuesta_antigua.setText(operacion_actual + mostrar_operaciones.getText());

                //mostrar_operaciones.setText(String.valueOf((int) acumulado));
                mostrar_operaciones.setText("0");

                // Reiniciar para la siguiente operación
                acumulado = 0;
                operador_aritmeticos = "";
                operacion_actual = "";
            }
        });
        boton_C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrar_operaciones.setText("");
            }
        });
        boton_borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoActual = mostrar_operaciones.getText();
                if (!textoActual.isEmpty()) {
                    String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
                    mostrar_operaciones.setText(nuevoTexto);
                }
            }
        });


        boton_porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero_ingresado = Integer.parseInt(mostrar_operaciones.getText());
                acumulado = (float) numero_ingresado / 100;
                operador_aritmeticos = "%";
                mostrar_operaciones.setText("");
            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(JframeCalculadora::new);
    }
}
