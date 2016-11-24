package com.hotfolder.otmm.metadata.processor.service.impl;

import java.io.File;
import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;
import com.hotfolder.otmm.metadata.processor.service.MetadataProcessor;

public class XmlMetadataProcessor implements MetadataProcessor {

	@Override
	public List<AssetMetadataInfo> getAssetMetadataInfo(Object object) {
		
		System.out.println("Inside XmlMetadataProcessor");
		List<AssetMetadataInfo> listAssetMetadataInfo=null;
		// TODO Auto-generated method stub
		String xmlPath=(String) object;
		
		System.out.println("Inside XmlMetadataProcessor xmlPath is : "+xmlPath);
		
		if(new File(xmlPath).exists()){
			//parse xml and read metadata
		}
		
		return listAssetMetadataInfo;
	}

}
