package com.awcsoftware.mechanical.dto;

import org.springframework.beans.factory.annotation.Required;

public class Engine {
	private int capacity;
	private String modelName;
	public Engine() {
		
	}
	public Engine(int capacity, String modelName) {
		super();
		this.capacity = capacity;
		this.modelName = modelName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getModelName() {
		return modelName;
	}
	@Required
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
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
		Engine other = (Engine) obj;
		if (capacity != other.capacity)
			return false;
		if (modelName == null) {
			if (other.modelName != null)
				return false;
		} else if (!modelName.equals(other.modelName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", modelName=" + modelName + "]";
	}
	
}
