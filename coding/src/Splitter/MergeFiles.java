package Splitter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/*
 * MergeFiles.java
 *
 * Created on October 2, 2007, 2:25 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
 
/**
 *
 * @author Administrator
 */
public class MergeFiles {
    
    /** Creates a new instance of MergeFiles */
    public String mergeFile(String outdir) throws FileNotFoundException, IOException
    {
        System.gc(); System.gc(); System.gc();
        //Getting inputs from Stream    
        System.out.println("OutDir="+outdir);
        String outfile=null;
        //BufferedReader d= new BufferedReader(new InputStreamReader(System.in));
       // System.out.print("Enter File(s) Path (c:/Ex):");
       // String outdir=d.readLine();
       // System.out.print("Enter File Extention (exe/txt/doc...):");
       // String ext=d.readLine();
        String ext=JOptionPane.showInputDialog("Enter File Extention (exe/txt/doc/pdf......) ");
        System.out.println("ext=="+ext);
        String s12=outdir+"\\"+outdir.substring(outdir.lastIndexOf("\\")+1,outdir.length())+"."+ext;
        
        System.out.println("s12="+s12);
             
        
       System.out.println("Splitted Files stored in the path: "+outdir);
          System.out.println("\nADDING Splitted Files.................");
          int i=1;
         FileInputStream fis1=new FileInputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
          byte[] b=new byte[(fis1.available())];
          FileOutputStream fos = new FileOutputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_NEW"+s12.substring(s12.lastIndexOf("."),s12.length()),true);
           while(true){
               try{
                   
                    fis1=new FileInputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
                    if(b.length>fis1.available())  
                        b=new byte[(fis1.available())];
                    
                    fis1.read(b);
                    fos.write(b);
                    i++;
              }catch(Exception fnf){
                  break;
              }
               fis1.close();
               
               // System.gc();
          }
          fos.close();
             outfile=outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_NEW"+s12.substring(s12.lastIndexOf("."),s12.length());
             System.out.println("The Added file is saved in the path : "+outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_NEW"+s12.substring(s12.lastIndexOf("."),s12.length()));    
          
             return outfile; 
    }
}
