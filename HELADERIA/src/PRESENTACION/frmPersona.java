package PRESENTACION;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import LOGICA.Persona;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class frmPersona extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tbxNombre;
	private JTextField tbxApellido;
	private JTextField tbxCi;
	private JTextField tbxEdad;

	
	private Persona sujeto=new Persona();
	private JTextField tbxId;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPersona frame = new frmPersona();
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
	public frmPersona() {
		setType(Type.UTILITY);
		setTitle("Administración de clientes");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de personas");
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Raleway Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 11, 182, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Raleway", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 51, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apeliidos");
		lblNewLabel_2.setFont(new Font("Raleway", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 76, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CI");
		lblNewLabel_3.setFont(new Font("Raleway", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 101, 100, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Edad");
		lblNewLabel_4.setFont(new Font("Raleway", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(10, 126, 100, 14);
		contentPane.add(lblNewLabel_4);
		
		tbxNombre = new JTextField();
		tbxNombre.setFont(new Font("Raleway", Font.PLAIN, 12));
		tbxNombre.setBounds(121, 48, 190, 20);
		contentPane.add(tbxNombre);
		tbxNombre.setColumns(10);
		
		tbxApellido = new JTextField();
		tbxApellido.setFont(new Font("Raleway", Font.PLAIN, 12));
		tbxApellido.setColumns(10);
		tbxApellido.setBounds(121, 73, 190, 20);
		contentPane.add(tbxApellido);
		
		tbxCi = new JTextField();
		tbxCi.setFont(new Font("Raleway", Font.PLAIN, 12));
		tbxCi.setColumns(10);
		tbxCi.setBounds(121, 98, 190, 20);
		contentPane.add(tbxCi);
		
		tbxEdad = new JTextField();
		tbxEdad.setFont(new Font("Raleway", Font.PLAIN, 12));
		tbxEdad.setColumns(10);
		tbxEdad.setBounds(121, 123, 190, 20);
		contentPane.add(tbxEdad);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 180, 301, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		JButton btnRegistrar = new JButton("");
		btnRegistrar.setToolTipText("Registrar cliente");
		btnRegistrar.setBounds(16, 0, 40, 40);
		panel.add(btnRegistrar);
		btnRegistrar.setIcon(new ImageIcon(frmPersona.class.getResource("/RESOURCES/icons8_create_document_32px.png")));
		
				JButton btnListar = new JButton("");
				btnListar.setToolTipText("Actualizar lista");
				btnListar.setBounds(72, 0, 40, 40);
				panel.add(btnListar);
				btnListar.setIcon(new ImageIcon(frmPersona.class.getResource("/RESOURCES/icons8_update_32px.png")));
												
				JButton btnEliminar = new JButton("");
				btnEliminar.setToolTipText("Eliminar cliente");
				btnEliminar.setBounds(184, 0, 40, 40);
				panel.add(btnEliminar);
				btnEliminar.setIcon(new ImageIcon(frmPersona.class.getResource("/RESOURCES/icons8_delete_file_32px.png")));
				
				JButton btnImprimir = new JButton("");
				btnImprimir.setToolTipText("Imprimir lista");
				btnImprimir.setBounds(240, 0, 40, 40);
				panel.add(btnImprimir);
				btnImprimir.setIcon(new ImageIcon(frmPersona.class.getResource("/RESOURCES/icons8_print_32px.png")));
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(320, 48, 205, 263);
				contentPane.add(scrollPane);
				
						
				JTextArea txaClientes = new JTextArea();
				scrollPane.setViewportView(txaClientes);
				txaClientes.setWrapStyleWord(true);
				txaClientes.setLineWrap(true);
				txaClientes.setFont(new Font("Raleway", Font.PLAIN, 13));
				txaClientes.setEditable(false);
				
				JLabel lblId = new JLabel("ID");
				lblId.setBounds(10, 250, 46, 14);
				contentPane.add(lblId);
				
				tbxId = new JTextField();
				tbxId.setBounds(121, 247, 190, 20);
				contentPane.add(tbxId);
				tbxId.setColumns(10);
				
				JButton btnActualizar = new JButton("Aceptar");
				btnActualizar.setBounds(10, 288, 89, 23);
				contentPane.add(btnActualizar);
				btnListar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String datos=sujeto.listar_personas();
						txaClientes.setText(datos);
					}
				});
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*pr.setNombre(tbxNombre.getText());
				pr.setApellidos(tbxApellido.getText());
				pr.setCi(tbxCi.getText());
				pr.setEdad(Integer.parseInt(tbxEdad.getText()));
								
				System.out.println(pr.toString());
				pr.registrar_persona();
				
				String datos=pr.listar_personas();
				txaClientes.setText(datos);*/


				sujeto.setNombre(tbxNombre.getText());
				sujeto.setApellidos(tbxApellido.getText());
				sujeto.setCi(tbxCi.getText());
				sujeto.setEdad(Integer.parseInt(tbxEdad.getText()));
				
				String resultado=sujeto.insertarPersona();
				
				JOptionPane.showMessageDialog(
	                    frmPersona.this, 
	                    resultado, 
	                    "Resultado", 
	                    JOptionPane.INFORMATION_MESSAGE
	                );
			}
		});
		
		JButton btnEditar = new JButton("");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				sujeto.setNombre(tbxNombre.getText());
				sujeto.setApellidos(tbxApellido.getText());
				sujeto.setCi(tbxCi.getText());
				sujeto.setEdad(Integer.parseInt(tbxEdad.getText()));
				sujeto.setId(Integer.parseInt(tbxId.getText()));
				
				
				String resultado=sujeto.editarPersona();
			}
		});
		btnEditar.setToolTipText("Editar cliente");
		btnEditar.setBounds(128, 0, 40, 40);
		panel.add(btnEditar);
		btnEditar.setIcon(new ImageIcon(frmPersona.class.getResource("/RESOURCES/icons8_edit_file_32px.png")));
		
		tbxNombre.setNextFocusableComponent(tbxApellido);
		tbxApellido.setNextFocusableComponent(tbxCi);
		tbxCi.setNextFocusableComponent(tbxEdad); 
		tbxEdad.setNextFocusableComponent(tbxNombre);
	}
}
