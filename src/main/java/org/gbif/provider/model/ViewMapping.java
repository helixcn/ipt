package org.gbif.provider.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ViewMapping {
	private Long id;	
	private OccurrenceResource resource;
	private StarExtension view;
	private String viewSql;
	private ArrayList<String> properties = new ArrayList<String>();
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@ManyToOne
	public OccurrenceResource getResource() {
		return resource;
	}
	public void setResource(OccurrenceResource resource) {
		this.resource = resource;
	}
	
	/**
	 * view is null for the darwin core mapping
	 * @return
	 */
	@ManyToOne
	public StarExtension getView() {
		return view;
	}
	public void setView(StarExtension view) {
		this.view = view;
	}
	
	public String getViewSql() {
		return viewSql;
	}
	public void setViewSql(String sql) {
		this.viewSql = sql;
	}
	
	@Lob
	public ArrayList<String> getProperties() {
		return properties;
	}
	public void setProperties(ArrayList<String> properties) {
		this.properties = properties;
	}
	
	
}
