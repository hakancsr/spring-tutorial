package com.mimaraslan;

import java.util.*;

public class Koleksiyonlar {

	private List<Object> listeler;
	private Set<Object> setler;
	private Map<Object, Object> mapler;
	private Properties propertiesler;

	public List<Object> getListeler() {
		return listeler;
	}

	public void setListeler(List<Object> listeler) {
		this.listeler = listeler;
	}

	public Set<Object> getSetler() {
		return setler;
	}

	public void setSetler(Set<Object> setler) {
		this.setler = setler;
	}

	public Map<Object, Object> getMapler() {
		return mapler;
	}

	public void setMapler(Map<Object, Object> mapler) {
		this.mapler = mapler;
	}

	public Properties getPropertiesler() {
		return propertiesler;
	}

	public void setPropertiesler(Properties propertiesler) {
		this.propertiesler = propertiesler;
	}

	@Override
	public String toString() {
		return "List =" + listeler + "\nSet =" + setler + "\nMap =" + mapler + "\nProperties =" + propertiesler;
	}
}
