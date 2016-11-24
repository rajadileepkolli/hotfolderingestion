package com.hotfolder.otmm.ingestion.service.impl;

import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;
import com.hotfolder.otmm.ingestion.service.IngestService;
import com.hotfolder.otmm.metadata.processor.factory.MetadataFactory;
import com.hotfolder.otmm.metadata.processor.factory.MetadataFactory.MetadataSourceType;
import com.hotfolder.otmm.metadata.processor.service.MetadataProcessor;

public class IngestionServiceImpl implements IngestService {

	@Override
	public boolean startIngestion(List<AssetMetadataInfo> listAssetMetadata) {
		System.out.println("Inside startIngestion");
		// TODO Auto-generated method stub
		// write code here
		System.out.println("Exit startIngestion");
		return false;
	}

	@Override
	public List<AssetMetadataInfo> getAssetMetadata(Object object, MetadataSourceType type) {
		// TODO Auto-generated method stub
		System.out.println("Inside getAssetMetadata");
		 MetadataProcessor metadataProcessor = MetadataFactory.createMetadataProcessor(type);
		 System.out.println("Exit getAssetMetadata");
		 return metadataProcessor.getAssetMetadataInfo(object);
	
	}

}
