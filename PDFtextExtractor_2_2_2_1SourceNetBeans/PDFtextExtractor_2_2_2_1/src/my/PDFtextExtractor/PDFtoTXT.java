/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PDFtextExtractor;

/**
 *
 * @author Vladimir Yesipov
 */
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class PDFtoTXT {

   static String pdftoText(File file) throws IOException {

      //Loading an existing document
      PDDocument document = PDDocument.load(file);
      //System.out.println(file.getName());

      //Instantiate PDFTextStripper class
      PDFTextStripper pdfStripper = new PDFTextStripper();

      //Retrieving text from PDF document
      String text = pdfStripper.getText(document);
      //System.out.println(text);
      
      //Closing the document
      document.close();
      return text;     
   }
}
