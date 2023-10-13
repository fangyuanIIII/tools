package com.lt.document;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.lt.document.util.JsonObject;

public class DocumentParse {
	public static void main(String[] args) {
		DocumentParse obj = new DocumentParse();
		URL url = JsonObject.class.getClassLoader().getResource("templates/poi.xml");	
		obj.parseDocument(url.getPath());
	}
	
	public void parseDocument(String path) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(new File(path));
			System.out.println(( new DocumentParse()).transformXMLToString(doc));
			NodeList nodeList = doc.getChildNodes();
			for(int i = 0,len = nodeList.getLength(); i < len; i++) {
				Node node = nodeList.item(i);
				node.getChildNodes();
				
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/***
	* 将Document对象转换成String
	* @param document
	* @return
	*/
	public String transformXMLToString(Document doc) {
		TransformerFactory   tf   =   TransformerFactory.newInstance();
		try {
			Transformer t = tf.newTransformer();
			t.setOutputProperty("encoding","UTF8");//解决中文问题，试过用GBK不行
			ByteArrayOutputStream   bos   =   new   ByteArrayOutputStream();
			t.transform(new DOMSource(doc), new StreamResult(bos));
			return bos.toString();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Document transformStringToXML(String xmlStr) {
		StringReader sr = new StringReader(xmlStr);
		InputSource is = new InputSource(sr);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
			Document doc = builder.parse(is);
			return doc;
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
