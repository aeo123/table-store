package com.hannea.tablestore;

import com.hannea.constant.PrimaryKeyTypeObject;
import com.hannea.constant.PrimaryKeyTypeOption;

public class PrimaryKeyValueObject {
	private Object value;
	// raw bytes for utf-8 string
	private byte[] rawData;
	private PrimaryKeyTypeObject type;
	private PrimaryKeyTypeOption option;
	/**
	 * 从0开始越到越后，保证主键顺序
	 */
	private int sort;

	public PrimaryKeyValueObject(Object value, PrimaryKeyTypeObject type, PrimaryKeyTypeOption option, int sort) {
		super();
		this.value = value;
		this.type = type;
		this.option=option;
		this.sort = sort;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public byte[] getRawData() {
		return rawData;
	}

	public void setRawData(byte[] rawData) {
		this.rawData = rawData;
	}

	public PrimaryKeyTypeObject getType() {
		return type;
	}

	public void setType(PrimaryKeyTypeObject type) {
		this.type = type;
	}

	public PrimaryKeyTypeOption getOption() {
		return option;
	}

	public void setOption(PrimaryKeyTypeOption option) {
		this.option = option;
	}
}
