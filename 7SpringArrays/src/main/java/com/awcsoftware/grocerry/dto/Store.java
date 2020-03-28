package com.awcsoftware.grocerry.dto;

import java.util.Arrays;

public class Store {
	private String storeName;
	private Items[] items;
	public Store() {
	}
	public Store(String storeName, Items[] items) {
		super();
		this.storeName = storeName;
		this.items = items;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Items[] getItems() {
		return items;
	}
	public void setItems(Items[] items) {
		this.items = items;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(items);
		result = prime * result + ((storeName == null) ? 0 : storeName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (!Arrays.equals(items, other.items))
			return false;
		if (storeName == null) {
			if (other.storeName != null)
				return false;
		} else if (!storeName.equals(other.storeName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", items=" + Arrays.toString(items) + "]";
	}
	
}
