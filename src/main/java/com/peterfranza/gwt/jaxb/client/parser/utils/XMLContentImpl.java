package com.peterfranza.gwt.jaxb.client.parser.utils;

import com.google.gwt.xml.client.Element;

public class XMLContentImpl implements XMLContent {
	private final Element value;
	public XMLContentImpl( Element element) {
		this.value = element;
	}

	/* (non-Javadoc)
	 * @see com.peterfranza.gwt.jaxb.client.parser.utils.XMLContent#getValue()
	 */
	@Override
	public Element getValue() {
		return value;
	}

}
