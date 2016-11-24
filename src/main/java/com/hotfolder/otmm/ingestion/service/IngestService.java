package com.hotfolder.otmm.ingestion.service;

import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;
import com.hotfolder.otmm.metadata.processor.factory.MetadataFactory.MetadataSourceType;


public interface IngestService {

	public boolean startIngestion(List<AssetMetadataInfo> listAssetMetadata);
	

	public List<AssetMetadataInfo> getAssetMetadata(Object object, MetadataSourceType type);
	
}
