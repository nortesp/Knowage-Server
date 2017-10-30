package it.eng.spagobi.metadata.metadata;

// Generated 12-apr-2016 10.43.25 by Hibernate Tools 3.4.0.CR1

import it.eng.spagobi.commons.metadata.SbiHibernateModel;

import java.util.HashSet;
import java.util.Set;

/**
 * SbiMetaTableColumn generated by hbm2java
 */
public class SbiMetaTableColumn extends SbiHibernateModel {

	private Integer columnId;
	private SbiMetaTable sbiMetaTable;
	private String name;
	private String type;
	private boolean deleted;

	private Set sbiMetaBcAttributes = new HashSet(0);

	public SbiMetaTableColumn() {
	}

	public SbiMetaTableColumn(SbiMetaTable sbiMetaTable, String name, String type, boolean deleted) {
		this.sbiMetaTable = sbiMetaTable;
		this.name = name;
		this.type = type;
		this.deleted = deleted;
	}

	public SbiMetaTableColumn(SbiMetaTable sbiMetaTable, String name, String type, boolean deleted, Set sbiMetaBcAttributes) {
		this.sbiMetaTable = sbiMetaTable;
		this.name = name;
		this.type = type;
		this.deleted = deleted;
		this.sbiMetaBcAttributes = sbiMetaBcAttributes;
	}

	public Integer getColumnId() {
		return this.columnId;
	}

	public void setColumnId(Integer columnId) {
		this.columnId = columnId;
	}

	public SbiMetaTable getSbiMetaTable() {
		return this.sbiMetaTable;
	}

	public void setSbiMetaTable(SbiMetaTable sbiMetaTable) {
		this.sbiMetaTable = sbiMetaTable;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Set getSbiMetaBcAttributes() {
		return this.sbiMetaBcAttributes;
	}

	public void setSbiMetaBcAttributes(Set sbiMetaBcAttributes) {
		this.sbiMetaBcAttributes = sbiMetaBcAttributes;
	}

}