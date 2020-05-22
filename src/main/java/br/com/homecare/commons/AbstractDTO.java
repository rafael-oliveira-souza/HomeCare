package br.com.homecare.commons;

import java.io.Serializable;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractDTO<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public abstract boolean equals(Object obj);

	public <E> E toEntity(Class<E> classe, T obj) {
		return modelMapper.map(obj, classe);
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
