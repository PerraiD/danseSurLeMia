package com.mia.banque.ui.controler.swt;
import com.mia.banque.model.IBanque;
import com.mia.banque.ui.controler.IBanqueControler;
import com.mia.banque.ui.view.swt.BanqueView;
import org.eclipse.swt.widgets.Display;


public class  BanqueControler  implements IBanqueControler {
		private BanqueView view;
	private IBanque model;
	public BanqueControler(com.mia.banque.model.IBanque model) {
		this.model = model;
	}
	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new BanqueView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}	
	public void afficherClient(){
	// Start of user code for afficherClient
	// End of user code
}
public void quitter(){
	// Start of user code for quitter
	// End of user code
}

	
}