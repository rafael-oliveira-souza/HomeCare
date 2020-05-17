package br.com.homecare.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.homecare.models.entities.Profile;
import br.com.homecare.repositories.ProfileRepository;

public class ProfileUtils {
	@Autowired
	private ProfileRepository repo;

	public List<Profile> getAll() {
		return repo.findAll();
	}
	
	public Integer getInteger(String obj) {
		return Integer.valueOf(obj);
	}

	public Long getLong(String obj) {
		return Long.valueOf(obj);
	}

	public String getString(String obj) {
		return obj;
	}

	public Object getObject(Object obj) {
		return obj;
	}

	public Double getDouble(String obj) {
		return Double.valueOf(obj);
	}
	
}
