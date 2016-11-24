/**
 * 
 */
package com.hotfolder.otmm.ingestion.app;

import java.util.List;

import com.hotfolder.otmm.ingestion.bean.AssetMetadataInfo;
import com.hotfolder.otmm.ingestion.service.IngestService;
import com.hotfolder.otmm.ingestion.service.impl.IngestionServiceImpl;
import com.hotfolder.otmm.metadata.processor.factory.MetadataFactory;
import com.hotfolder.otmm.metadata.processor.factory.MetadataFactory.MetadataSourceType;

/**
 * @author rajakolli
 *
 */
public class StartIngestion
{
    public static void main(String args[])
    {

        String metadataSourceInfo = args[1];

        MetadataSourceType metadataSourceType = null;

        if ("XML".equalsIgnoreCase(args[0])) {
            metadataSourceType = MetadataFactory.MetadataSourceType.XML;
        }
        else if ("XLS".equalsIgnoreCase(args[0])) {
            metadataSourceType = MetadataFactory.MetadataSourceType.XLS;
        }
        else if ("DB".equalsIgnoreCase(args[0])) {
            metadataSourceType = MetadataFactory.MetadataSourceType.DB;
        }

        if (metadataSourceType != null) {
            IngestService ingestService = new IngestionServiceImpl();
            List<AssetMetadataInfo> listAssetMetadataInfo = ingestService
                    .getAssetMetadata(metadataSourceInfo, metadataSourceType);
            ingestService.startIngestion(listAssetMetadataInfo);
        }
        else {
            System.out.println("Metadata source is NULL or invalid");
        }

    }

}
