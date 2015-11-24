package com.mia.banque.ui.controler.swt;
import com.mia.banque.model.ICompte;
import com.mia.banque.ui.controler.ICompteControler;
import com.mia.banque.ui.view.swt.CompteView;
import org.eclipse.swt.widgets.Display;


public class  CompteControler  implements ICompteControler {
		private CompteView view;
	private ICompte model;
	public CompteControler(com.mia.banque.model.ICompte model) {
		this.model = model;
	}
	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new CompteView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}	
	public void afficherOperation(){
	// Start of user code for afficherOperation
	// End of user code
}
public void quitter(){
	// Start of user code for quitter
	// End of user code
}

	
}