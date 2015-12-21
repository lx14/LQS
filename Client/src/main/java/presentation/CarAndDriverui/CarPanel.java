package presentation.CarAndDriverui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import presentation.Receiptsui.LoadingPanel;
import presentation.Userui.MainPanel;
import presentation.mainui.PictureButton;
import businessLogic.CarAndDriverbl.CarAndDriverbl;
import businessLogicService.CarAndDriverblService.CarAndDriverblService;
import businessLogicService.UserblService.UserblService;
import vo.CarVO;
import vo.CheckVO;
import vo.HallVO;

public class CarPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton add;
	JButton delete;
	JButton back;
	JTable table;
	private CarAndDriverblService bl;
	private DefaultTableModel defaultModel;
	private UserblService user;
	private int buttonNum;
	int padding = 10;
	int label_width = 200;
	int label_height = 30;
	int box_width = 120;
	int box_height = 30;
	int button_width = 80;
	int button_height = 30;
	public CarPanel(UserblService user,int buttonNum){
		this.setLayout(null);
		this.setBorder(null);
		this.setOpaque(false);
		this.user = user;
		this.buttonNum = buttonNum;
		bl = new CarAndDriverbl();
		init();
	}
	
	private void init() {
		// TODO Auto-generated method stub
		Font font = new Font("黑体",Font.PLAIN,16);
		Vector<String> name = new Vector<String>();
		name.add("车辆代号");
		name.add("车牌号");
		name.add("服役时间");
		
		Vector<CarVO> data = new Vector<CarVO>();		
		defaultModel = new DefaultTableModel(data,name);
		table = new JTable(defaultModel){		
			private static final long serialVersionUID = 1L;
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		table.setRowHeight(35);
		table.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.getTableHeader().setBackground(new Color(200, 200, 200));
		table.setBackground(new Color(255,255,255,100));
		table.getTableHeader().setReorderingAllowed(false);
		table.setOpaque(false);
		table.setRowSorter(new TableRowSorter<DefaultTableModel>(defaultModel));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(padding, padding, 884, 490);
		scrollPane.getViewport().add(table);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		
		add = new JButton();
		add.setBorder(null);
		add.setOpaque(false);
		add.setFocusPainted(false);
		add.setContentAreaFilled(false);
		add.setBounds(660, 510, 70, 30);
		PictureButton.setIcon("src/main/java/image/addButton_unclicked.png",add);
		add.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new addCar(user,bl,defaultModel).setVisible(true);
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/addButton_clicked.png",add);
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/addButton_unclicked.png",add);
			}
			
		});
		delete = new JButton();
		delete.setBorder(null);
		delete.setOpaque(false);
		delete.setFocusPainted(false);
		delete.setContentAreaFilled(false);
		delete.setBounds(740, 510, 70, 30);
		PictureButton.setIcon("src/main/java/image/deleteButton_unclicked.png",delete);
		delete.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int index = table.convertRowIndexToModel(table.getSelectedRow());
				if(index == -1){
					JOptionPane.showMessageDialog(null, "请选中要删除的车辆信息！","", JOptionPane.ERROR_MESSAGE);
					return;
				}
				int n = JOptionPane.showConfirmDialog(null, "确定删除改信息?", "确认框",JOptionPane.YES_NO_OPTION);
				//System.out.println(index);
				if (n == 1) return;
				
				CarVO vo = (CarVO)defaultModel.getDataVector().elementAt(index);
				bl.deleteCarInfo(vo);
				defaultModel.removeRow(index);
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/deleteButton_clicked.png",delete);
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/deleteButton_unclicked.png",delete);
			}
			
		});
		back = new JButton();
		back.setBorder(null);
		back.setOpaque(false);
		back.setFocusPainted(false);
		back.setContentAreaFilled(false);
		back.setBounds(820, 510, 70, 30);
		PictureButton.setIcon("src/main/java/image/backButton_unclicked.png",back);
		back.addMouseListener(new MouseListener(){

			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				CarPanel.this.setVisible(false);
				MainPanel.closeButton(buttonNum);
			}

			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/backButton_clicked.png",back);
			}

			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				PictureButton.setIcon("src/main/java/image/backButton_unclicked.png",back);
			}
			
		});
		initTable();
		
		this.add(scrollPane);
		this.add(add);
		this.add(back);
		this.add(delete);
	}

	public void setValue(CarVO info) {
		// TODO Auto-generated method stub
		
	}
	
	private void initTable() {
		// TODO Auto-generated method stub
		List<CarVO> list = bl.findAllCarInfo(user.getHallId());
		for (CarVO vo : list) defaultModel.addRow(vo);
	}

}
