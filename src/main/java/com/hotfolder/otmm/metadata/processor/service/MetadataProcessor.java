package com.hotfolder.otmm.metadata.processor.service;

import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;

@FunctionalInterface
public interface MetadataProcessor {
	
	public List<AssetMetadataInfo> getAssetMetadataInfo(Object object);

}
