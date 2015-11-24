package com.mia.banque.model.impl;
import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IBanque;

public class Banque implements IBanque{
	
	private List<com.mia.banque.model.IClient> listClient;
	
	
public List<com.mia.banque.model.IClient> getClient(){
	if (this.listClient == null) {
			this.listClient = new ArrayList<com.mia.banque.model.IClient>();
		}
		return this.listClient;
}
public void setClient(List<com.mia.banque.model.IClient> newValue){
	this.listClient = newValue;
}
	
}