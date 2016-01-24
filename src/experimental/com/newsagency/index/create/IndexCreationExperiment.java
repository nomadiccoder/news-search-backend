package com.newsagency.index.create;

/**
 * @author bikash
 *
 */

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.CloudSolrClient;
import org.apache.solr.common.SolrInputDocument;

public class IndexCreationExperiment {
	
	
	public static void main(String[] args) {
		CloudSolrClient client = new CloudSolrClient("localhost:9983");
		client.setDefaultCollection("newsapp");
		SolrInputDocument doc = new SolrInputDocument();
		doc.addField("author", "sasmita");
		doc.addField("topic", "family");
		try {
			client.add(doc);
			client.commit();
			client.close();
		} catch (SolrServerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
