package com.thirumal.pdf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class CompressPdf {
	
	public static void main(String[] args) throws IOException, DocumentException {
			
			
			PdfReader reader = new PdfReader(new FileInputStream("/Users/Thirumal/Downloads/Java Magazine MayJune 2018 Twitter(1).pdf"));
			PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("/Users/Thirumal/Downloads/th1234.pdf"));
			//PdfWriter writer = stamper.wr
			reader.removeFields();
			reader.removeUnusedObjects();
			
			int total = reader.getNumberOfPages() + 1;
			for ( int i=1; i<total; i++) {
			   reader.setPageContent(i + 1, reader.getPageContent(i + 1));
			}
			try {
				
				stamper.setFullCompression();
				stamper.close();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// TODO Auto-generated method stub
	
	}

}
