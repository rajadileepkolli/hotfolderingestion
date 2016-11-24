package com.hotfolder.otmm.metadata.processor.factory;

import com.hotfolder.otmm.metadata.processor.service.MetadataProcessor;
import com.hotfolder.otmm.metadata.processor.service.impl.DBMetadataProcessor;
import com.hotfolder.otmm.metadata.processor.service.impl.XlsMetadataProcessor;
import com.hotfolder.otmm.metadata.processor.service.impl.XmlMetadataProcessor;

public class MetadataFactory
{

    // A helper enum that clients will use to create game objects
    public enum MetadataSourceType
    {
        XML, XLS, DB;
    }

    private MetadataFactory()
    {

    }

    public static MetadataProcessor createMetadataProcessor(
            MetadataFactory.MetadataSourceType type)
    {
        System.out.println("Inside createMetadataProcessor");

        switch (type) {
        case XML:
            return new XmlMetadataProcessor();
        case XLS:
            return new XlsMetadataProcessor();
        case DB:
            return new DBMetadataProcessor();
        default:
            throw new IllegalArgumentException("No such metadataSource processor");
        }

    }

}
