package com.peterfranza.gwt.jaxb.client.objs;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.peterfranza.gwt.jaxb.client.JAXBExamples.TESTENUM;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class TestBean {

	@XmlAttribute
	public String attrone = "defaultone";
	
	@XmlAttribute(name="attrtwo")
	protected String attr2 = "defaulttwo";
	
	@XmlAttribute
	private String attrthree = "defaultthree";
	
	@XmlAttribute 
	public int attrint = 2;
	
	@XmlAttribute 
	public Integer attrinteger = 3;
	
	@XmlAttribute 
	public long attrlong = 4L;
	
	@XmlAttribute 
	public Long attrLong = 5L;
	
	@XmlAttribute
	public short attrshort = 6;
	
	@XmlAttribute 
	public Short attrShort = 7;
	
	@XmlAttribute 
	public float attrfloat = 8.0f;
	
	@XmlAttribute 
	public Float attrFloat = 9.0f;
	
	@XmlAttribute 
	public double attrdouble = 10.0;
	
	@XmlAttribute 
	public Double attrDouble = 11.0;
	
	@XmlAttribute 
	public boolean attrboolean = true;
	
	@XmlAttribute 
	public Boolean attrBoolean = true;
	
	@XmlElement
	public TestSubObject publicSubObject;
	
	@XmlElement
	public ArrayList<TestSubObject> objectList;
	
	@XmlElement
	public ArrayList<TestSubObject> namedList;
	
	@XmlElement
	public ArrayList<String> stringsList;
	
	@XmlTransient
	public String transfield;
	
	@XmlElement
	public TestStringValue value;
	
	@XmlAttribute
	public TESTENUM attrEnum;
	
	@XmlElement
	public TESTENUM elemEnum;
	
	@XmlElement
	public String elemString;
	
	@XmlElement 
	public TestAbstObject abstractObj;	
	
	
	public String getAttr2() {
		return attr2;
	}
	
	public void setAttr2(String attr2){
		this.attr2 = attr2;
	}
	
	public String getAttrthree() {
		return attrthree;
	}
	
	public void setAttrthree(String attrthree) {
		this.attrthree = attrthree;
	}
	
}
