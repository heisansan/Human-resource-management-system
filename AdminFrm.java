package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.FontUIResource;

import utils.LoginConfig;
import view.MenAddFrm;
import view.MenMangerFrm;
import view.BumenAddFrm;
import view.BumenMangerFrm;
import view.infoFrm;
import java.awt.Font;

public class AdminFrm extends JFrame {
	//主界面
	private JPanel cc;
	private JDesktopPane table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFrm frame = new AdminFrm();
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
	public AdminFrm() {
		setTitle("\u4E3B\u754C\u9762");//主界面
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 799);
		
		InitGlobalFont(new Font("SimSun", Font.PLAIN, 15));  //统一设置字体
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//菜单栏：基本数据维护
		JMenu menu = new JMenu("\u57FA\u672C\u6570\u636E\u7EF4\u62A4");
		menu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuBar.add(menu);
		
		JMenu mnNewMenu = new JMenu("\u90E8\u95E8\u7BA1\u7406");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mnNewMenu.setIcon(null);
		menu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u90E8\u95E8\u6DFB\u52A0");
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		mntmNewMenuItem.setIcon(null);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BumenAddFrm b = new BumenAddFrm();
				b.setVisible(true);
				table.add(b);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem menuItem = new JMenuItem("\u90E8\u95E8\u7EF4\u62A4");
		menuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem.setIcon(null);
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 部门维护
				BumenMangerFrm bmf = new BumenMangerFrm();
				bmf.setVisible(true);
				table.add(bmf);
			}
		});
		mnNewMenu.add(menuItem);
		
		JMenu mnNewMenu_1 = new JMenu("\u4EBA\u5458\u7BA1\u7406");
		mnNewMenu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menu.add(mnNewMenu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("\u4EBA\u5458\u6DFB\u52A0");
		menuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenAddFrm b = new MenAddFrm();
				b.setVisible(true);
				table.add(b);
			}
		});
		mnNewMenu_1.add(menuItem_1);

		JMenuItem menuItem_2 = new JMenuItem("\u5458\u5DE5\u7EF4\u62A4");
		menuItem_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenMangerFrm bm = new MenMangerFrm();
				bm.setVisible(true);
				table.add(bm);
			}
		});
		mnNewMenu_1.add(menuItem_2);
		
		JMenuItem menuItem_7 = new JMenuItem("\u5458\u5DE5\u5217\u8868");
		menuItem_7.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenListFrm MenSelect = new MenListFrm();
				MenSelect.setVisible(true);
				table.add(MenSelect);
			}
		});
		mnNewMenu_1.add(menuItem_7);

		JMenuItem menuItem_4 = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		menuItem_4.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExitActionPerformed(e);
			}
		});
		
		JMenuItem menuItem_5 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem_5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 修改密码
				UpdatePwdFrm userupdatePwd = new UpdatePwdFrm();
				userupdatePwd.setVisible(true);
				table.add(userupdatePwd);
			}
		});
		
		JMenu menu_2 = new JMenu("\u57F9\u8BAD\u8BFE\u7A0B");
		menu_2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menu.add(menu_2);
		
		JMenuItem menuItem_6 = new JMenuItem("\u57F9\u8BAD\u5386\u53F2");
		menuItem_6.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassHistoryFrm history = new ClassHistoryFrm();
				history.setVisible(true);
				table.add(history);
			}
		});
		
		JMenuItem menuItem_8 = new JMenuItem("\u5F00\u59CB\u57F9\u8BAD");
		menuItem_8.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassStartFrm kaoqin = new ClassStartFrm();
				kaoqin.setVisible(true);
				table.add(kaoqin);
			}
		});
		menu_2.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("\u7ED3\u675F\u57F9\u8BAD");
		menuItem_9.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClassEndFrm end = new ClassEndFrm();
				end.setVisible(true);
				table.add(end);
			}
		});
		menu_2.add(menuItem_9);
		menu_2.add(menuItem_6);
		menu.add(menuItem_5);
		menu.add(menuItem_4);
		//菜单栏：关于系统
		JMenu menu_1 = new JMenu("\u5176\u4ED6");
		menu_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_3 = new JMenuItem("关于系统");
		menuItem_3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				infoFrm i = new infoFrm();
				i.setVisible(true);
				table.add(i);
			}
		});
		menu_1.add(menuItem_3);
		cc = new JPanel();
		cc.setForeground(Color.WHITE);
		cc.setBorder(new EmptyBorder(5, 5, 5, 5));
		cc.setLayout(new BorderLayout(0, 0));
		setContentPane(cc);

		table = new JDesktopPane();
		table.setBackground(Color.WHITE);
		cc.add(table, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);// 居中显示
	}

	protected void ExitActionPerformed(ActionEvent e) {
		dispose();
		LoginConfig.clean();
	}
	
	private void InitGlobalFont(Font font) {
		// TODO Auto-generated method stub
		FontUIResource fontRes = new FontUIResource(font);
		for (Enumeration<Object> keys = UIManager.getDefaults().keys();
		keys.hasMoreElements(); ) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource) {
				UIManager.put(key, fontRes);
				}
			}
	}
}

	
