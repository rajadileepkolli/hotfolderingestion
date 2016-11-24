package com.hotfolder.otmm.ingestion.bean;

public class AssetMetadataInfo {
	private String fileName;
	private String description;
	private String metadataModelId;
	private String folderId;
	private String propertyTemplateId;
	//Other metadata attributes
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMetadataModelId() {
		return metadataModelId;
	}
	public void setMetadataModelId(String metadataModelId) {
		this.metadataModelId = metadataModelId;
	}
	public String getFolderId() {
		return folderId;
	}
	public void setFolderId(String folderId) {
		this.folderId = folderId;
	}
	public String getPropertyTemplateId() {
		return propertyTemplateId;
	}
	public void setPropertyTemplateId(String propertyTemplateId) {
		this.propertyTemplateId = propertyTemplateId;
	}
	
	

}
