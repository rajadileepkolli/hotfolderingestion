package com.hotfolder.otmm.metadata.processor.service.impl;

import java.io.File;
import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;
import com.hotfolder.otmm.metadata.processor.service.MetadataProcessor;

public class XlsMetadataProcessor implements MetadataProcessor {

	@Override
	public List<AssetMetadataInfo> getAssetMetadataInfo(Object object) {
		System.out.println("Inside XlsMetadataProcessor");
		List<AssetMetadataInfo> listAssetMetadataInfo=null;
		// TODO Auto-generated method stub
		String xlsPath=(String) object;
		
	
		
		if(new File(xlsPath).exists()){
			//read xls and set metadata
		}
		
		return listAssetMetadataInfo;
	}

}
