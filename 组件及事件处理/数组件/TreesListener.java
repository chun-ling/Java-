package 数组件;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreesListener implements TreeSelectionListener {
	TreeWin win ;
	public void setView(TreeWin win) {
		this.win = win;
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)win.tree.getLastSelectedPathComponent();
		if(node == null) {
			return;
		}
		if(node.isLeaf()) {
			Goods s = (Goods)node.getUserObject();
			win.showText.append(s.name + "," + s.price + "元\n");
		}else {
			win.showText.setText(null);
		}
		
	}

}
