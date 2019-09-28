/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.PDFtextExtractor;

import java.io.File;

/**
 *
 * @author Vladimir Yesipov
 */
public class PDFfiles {
    public File[] selPDF;
    public File sel_f;
    //private File [] addPDF;
    
    public String[] getPDFnames(File[] selPDF){
        //---This method returns filenames array for JList model
        this.selPDF = selPDF;
        String[] pdf_names = new String[selPDF.length];
        if (selPDF.length==0){
            return pdf_names;
            
        }else{
            int i=0;
            for(File p : selPDF){
                pdf_names[i]=p.getName();
                i++;
            }return pdf_names;
        }
    }
    
    public File[] getPDFfiles(){
        //This method returns selected files array
        return selPDF;
    }
    
    public void clearPDFselection(){
        //This method clears file selection array
        this.selPDF = new File[0];
    }
    
    public File getPDFfile(String selected_name){
        //This method returns selected file name from files array
        try {
            for(File p : selPDF){
                if (selected_name == p.getName()){
                    final File sel_f = p;
                    break;
                }            
            }
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //catch the exception            
            System.err.println("Selected file is out of list bounds");
        }
        return sel_f;
    }
}


