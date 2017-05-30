package com.peterfranza.gwt.jaxb.client.utils;

import java.lang.reflect.Field;

public class FieldUtil {

	private Object instance;

	private Class<?> clazz;

	public FieldUtil(Object instance) {
		this.instance = instance;
		this.clazz = this.instance.getClass();
	}

	public FieldUtil(Class<?> clazz) throws InstantiationException,
			IllegalAccessException {
		this.clazz = clazz;
		this.instance = this.clazz.newInstance();
	}

	public Object getFieldValue(String fieldName) {
		Object fieldValue = null;

		try {
			fieldValue = getFieldValue(clazz.getDeclaredField(fieldName));
		} catch (Exception e) {
			// silent
		}

		return fieldValue;
	}

	public Object getFieldValue(Field field) {
		Object fieldValue = null;

		try {
			if (!field.isAccessible()) {
				field.setAccessible(true);
			}
			fieldValue = field.get(instance);
		} catch (Exception e) {
			// silent
		}

		return fieldValue;
	}
}
