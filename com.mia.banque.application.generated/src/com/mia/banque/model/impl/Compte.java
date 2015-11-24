package com.mia.banque.model.impl;
import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.ICompte;

public class Compte implements ICompte{
	private String Numero;

	private List<com.mia.banque.model.IOperation> listOperation;
		public String getNumero(){
		return this.Numero;
	}
	
	public void setNumero(String newValue){
		this.Numero = newValue;
	}
	
	
public List<com.mia.banque.model.IOperation> getOperation(){
	if (this.listOperation == null) {
			this.listOperation = new ArrayList<com.mia.banque.model.IOperation>();
		}
		return this.listOperation;
}
public void setOperation(List<com.mia.banque.model.IOperation> newValue){
	this.listOperation = newValue;
}
	
}