package PRESENTACION;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LOGICA.Producto;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class frmInicio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxProducto;
	private JTextField tbxCantidad;
	private JTextField tbxCategoria;

	Producto pr1=new Producto();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmInicio frame = new frmInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HELADERÍA \"PINGUIS\"");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 196, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(frmInicio.class.getResource("/RESOURCES/heladeria.png")));
		lblNewLabel_1.setBounds(392, 11, 32, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Producto");
		lblNewLabel_2.setBounds(10, 54, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cantidad");
		lblNewLabel_3.setBounds(10, 98, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Categoría");
		lblNewLabel_4.setBounds(10, 150, 71, 14);
		contentPane.add(lblNewLabel_4);
		
		tbxProducto = new JTextField();
		tbxProducto.setBounds(91, 51, 115, 20);
		contentPane.add(tbxProducto);
		tbxProducto.setColumns(10);
		
		tbxCantidad = new JTextField();
		tbxCantidad.setBounds(91, 95, 115, 20);
		contentPane.add(tbxCantidad);
		tbxCantidad.setColumns(10);
		
		tbxCategoria = new JTextField();
		tbxCategoria.setBounds(91, 147, 115, 20);
		contentPane.add(tbxCategoria);
		tbxCategoria.setColumns(10);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pr1.setNombre(tbxProducto.getText());
				pr1.setCantidad(Integer.parseInt(tbxCantidad.getText()));
				pr1.setCategoria(tbxCategoria.getText());
			    pr1.registrarProducto2();
			}
		});
		btnRegistrar.setBounds(10, 211, 85, 23);
		contentPane.add(btnRegistrar);
		
		
		
		JTextArea txaContenido = new JTextArea();
		txaContenido.setBounds(245, 49, 179, 201);
		contentPane.add(txaContenido);

		JButton btnLeer = new JButton("Leer");
		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String datos=pr1.leerProductos();
				txaContenido.setText(datos);
			}
		});
		btnLeer.setBounds(121, 211, 85, 23);
		contentPane.add(btnLeer);
	}
}
