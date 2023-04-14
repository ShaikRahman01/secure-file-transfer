package Splitter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryUsage;
/*
 * Split.java
 *
 * Created on September 24, 2007, 6:38 AM   
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Split {
    
    /** Creates a new instance of Split */
    public Split() {
    }
    public  int splitFile(String filename,String fsplitsize,javax.swing.JTextArea jTextArea1) throws FileNotFoundException, IOException
    {
        //Getting inputs from Stream     
        
        BufferedReader d
          = new BufferedReader(new InputStreamReader(System.in));
        /*System.out.print("Enter File Path (c:/Ex.Doc):");
        String s12=d.readLine();*/
        String s12=filename;
        System.out.println("Encrypted file name=="+s12);
        File f=new File(s12.substring(0,s12.lastIndexOf(".")));
        boolean mkdir = f.mkdir();
        
        String outdir=s12.substring(0,s12.lastIndexOf("."));
        
        FileInputStream fis1 = new FileInputStream(s12);
        int size=fis1.available();
        
        String s1=""+(((double)size)/(1024*1024));
        String s2=s1;
        s1=s1.substring(0,s1.lastIndexOf("."));
        s1+=s2.substring(s2.indexOf("."),(s1.length()+3));    
        
        //System.out.println("\nthe file size is="+(s1)+" MB");
         
        //System.out.print("\nEnter File Size to Split (1.04/700...) in MB:");
        //Double splitsize=Double.parseDouble(d.readLine());     
        Double splitsize=Double.parseDouble(fsplitsize);
        
        System.out.println("\nSplitting................");
        FileOutputStream fos =null;
        int i=0;
        boolean flag=false;
        long filesize=(long)(splitsize*1024*1024);
        //System.out.println("File size:"+filesize);
          
          //inbytes=(filesize);
          byte b[]=new byte[new Long(filesize).intValue()];
          //System.out.println("b:"+b);
       if(size>(filesize)){   
          for(i=0;i<(size/(filesize));i++){
                try{
                    //System.out.println("1");
                    fis1.read(b);
                    //System.out.println("2");
                    }catch(Exception e1){System.out.println("Read Error");e1.printStackTrace();}
                   try{
                       //System.out.println("3");
                    fos = new FileOutputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
                    jTextArea1.append("\nWriting the contents to the file "+outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
                   // System.out.println("4");
                    fos.write(b);
                   // System.out.println("5");
                    fos.close();
                   // System.out.println("6");
                    }catch(Exception e2){System.out.println("write Error");e2.printStackTrace();}
                    try{
                        //System.out.println("7");
                    if(fis1.available()<filesize){
                          //  System.out.println("8");
                        flag=true;
                    }
                    }catch(Exception e3){System.out.println("if Error");e3.printStackTrace();} 
                System.gc();System.gc();System.gc();
            }
       }
       else{
               b=new byte[(fis1.available())];
               fis1.read(b);
               fos = new FileOutputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
                jTextArea1.append("\nWriting the contents to the file "+outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
               fos.write(b);
               System.gc();
       }
           
       if(flag){
               //inbytes=(filesize);//*i;
              //getRuntime().freeMemory();
               byte b1[]=new byte[(fis1.available())];
               fis1.read(b1);
               fos = new FileOutputStream(outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
               jTextArea1.append("\nWriting the contents to the file "+outdir+"\\"+s12.substring(s12.lastIndexOf("\\")+1,s12.lastIndexOf("."))+"_PART-"+(i+1)+""+s12.substring(s12.lastIndexOf("."),s12.length()));
               fos.write(b1);
               
               i++;
            }
        
          jTextArea1.append("\nFile Splitted into "+i+" File(s)\n");
          jTextArea1.append("Splitted Files stored in the path: "+outdir);
          return i;         
    }
}
