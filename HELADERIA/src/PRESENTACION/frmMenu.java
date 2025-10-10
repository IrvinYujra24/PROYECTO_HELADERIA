package PRESENTACION;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu frame = new frmMenu();
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
	public frmMenu() {
		setType(Type.UTILITY);
		setTitle("INICIO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnClientes = new JButton("CLIENTES");
		btnClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCliente frm=new frmCliente();
				frm.setVisible(true);
			}
		});
		btnClientes.setForeground(Color.DARK_GRAY);
		btnClientes.setFont(new Font("Raleway Black", Font.PLAIN, 12));
		btnClientes.setIcon(new ImageIcon(frmMenu.class.getResource("/RESOURCES/icons8_add_user_group_man_woman_64px.png")));
		btnClientes.setBounds(10, 11, 175, 87);
		contentPane.add(btnClientes);
		
		JButton btnVentas = new JButton("VENTAS");
		btnVentas.setIcon(new ImageIcon(frmMenu.class.getResource("/RESOURCES/icons8_sell_64px.png")));
		btnVentas.setForeground(Color.DARK_GRAY);
		btnVentas.setFont(new Font("Raleway Black", Font.PLAIN, 12));
		btnVentas.setBounds(10, 109, 175, 87);
		contentPane.add(btnVentas);
		
		JButton btnProductos = new JButton("PRODUCTOS");
		btnProductos.setIcon(new ImageIcon(frmMenu.class.getResource("/RESOURCES/icons8_new_product_64px.png")));
		btnProductos.setForeground(Color.DARK_GRAY);
		btnProductos.setFont(new Font("Raleway Black", Font.PLAIN, 12));
		btnProductos.setBounds(249, 11, 175, 87);
		contentPane.add(btnProductos);
		
		JButton btnVendedor = new JButton("VENDEDOR");
		btnVendedor.setIcon(new ImageIcon(frmMenu.class.getResource("/RESOURCES/icons8_identification_documents_64px.png")));
		btnVendedor.setForeground(Color.DARK_GRAY);
		btnVendedor.setFont(new Font("Raleway Black", Font.PLAIN, 12));
		btnVendedor.setBounds(249, 109, 175, 87);
		contentPane.add(btnVendedor);

	}

}
