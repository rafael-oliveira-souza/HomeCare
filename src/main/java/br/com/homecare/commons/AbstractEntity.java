package br.com.homecare.commons;

import java.io.Serializable;

public abstract class AbstractEntity<T> implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Override
	public abstract boolean equals(Object obj);

	@SuppressWarnings("unchecked")
	public  boolean equals(Object obj, Object id) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntitySerializable<T> other = (EntitySerializable<T>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	@SuppressWarnings("hiding")
	private class EntitySerializable<T> {
		private Long id;
	}
}
