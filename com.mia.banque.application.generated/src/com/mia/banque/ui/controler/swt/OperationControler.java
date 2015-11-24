package com.mia.banque.ui.controler.swt;
import com.mia.banque.model.IOperation;
import com.mia.banque.ui.controler.IOperationControler;
import com.mia.banque.ui.view.swt.OperationView;
import org.eclipse.swt.widgets.Display;


public class  OperationControler  implements IOperationControler {
		private OperationView view;
	private IOperation model;
	public OperationControler(com.mia.banque.model.IOperation model) {
		this.model = model;
	}
	public void initView() {
		Display display = Display.getDefault();
		
		
		this.view = new OperationView(display, this.model, this);
		this.view.open();
		this.view.layout();
		
		while (!this.view.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}

	}	
	public void quitter(){
	// Start of user code for quitter
	// End of user code
}

	
}