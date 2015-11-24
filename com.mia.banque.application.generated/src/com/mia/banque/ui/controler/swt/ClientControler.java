package com.mia.banque.ui.controler.swt;
import com.mia.banque.model.IClient;
import com.mia.banque.ui.controler.IClientControler;
import com.mia.banque.ui.view.swt.ClientView;
import org.eclipse.swt.widgets.Display;


public class  ClientControler  implements IClientControler {
		private ClientView view;
	private IClient model;
	public ClientControler(com.mia.banque.model.IClient model) {
		this.model = model;
	}
	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new ClientView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}	
	public void afficherCompte(){
	// Start of user code for afficherCompte
	// End of user code
}
public void quitter(){
	// Start of user code for quitter
	// End of user code
}

	
}