package br.com.homecare.commons;

import java.io.Serializable;

import org.modelmapper.ModelMapper;

public abstract class AbstractDTO<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Override
	public abstract boolean equals(Object obj);

	public <E> E toEntity(Class<E> classe, T obj) {
		return new ModelMapper().map(obj, classe);
	}

	@SuppressWarnings("unchecked")
	public boolean equals(Object obj, Object id) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTOSerializable<T> other = (DTOSerializable<T>) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@SuppressWarnings("hiding")
	private class DTOSerializable<T> {
		private Long id;
	}
}
