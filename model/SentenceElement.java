package model;

public class SentenceElement {
	int valueField;
	String engField;
	String chiField;
	
	public SentenceElement(int valueField, String engField, String chiField) {
		this.valueField = valueField;
		this.engField = engField;
		this.chiField = chiField;
	}
	
	public String getEng(){ return engField;}
	public String getChi(){ return chiField;}
	public int getValue(){ return valueField;}
	
	public String toString() { return valueField + " " + engField + " " + chiField; }
}
