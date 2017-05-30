package com.peterfranza.gwt.jaxb.client.parser.utils;

import com.google.gwt.xml.client.Element;

public class XMLContentParser {
	public static XMLContent getXmlContent(Element element){
		return new XMLContentImpl(element);
	}
}
