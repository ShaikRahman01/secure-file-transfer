package Sender;

import Receiver.ReceivedFile;
import Receiver.ReceiverClient;
import Receiver.ServerThread;
import Splitter.Split;
import java.awt.FileDialog;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

import enc.DBS;

/*
 * SendFile.java
 *
 * Created on October 2, 2007, 6:24 AM
 */

/**   
 *
 * @author  Administrator
 */
public class SendFile extends javax.swing.JFrame{ 
    static Thread t,t1;
    /** Creates new form SendFile */
    public SendFile(Thread t) {
        this.t=t;
       // System.out.println("Thread alive=="+t.isAlive());
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Splitter");
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Arial Unicode MS", 1, 14));
        jButton1.setText("Select File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Century", 1, 12));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setFont(new java.awt.Font("Arial Unicode MS", 1, 14));
        jButton3.setText("Encrypt File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial Unicode MS", 1, 14));
        jButton4.setText("Split File");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Arial Unicode MS", 1, 14));
        jButton5.setText("Send Files");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century", 1, 12));

        jLabel3.setFont(new java.awt.Font("Century", 1, 12));

        jLabel4.setFont(new java.awt.Font("Century", 1, 12));

        jLabel5.setFont(new java.awt.Font("Century", 1, 12));

        jLabel6.setFont(new java.awt.Font("Century", 1, 12));

        jLabel7.setFont(new java.awt.Font("Century", 1, 12));

        jLabel8.setFont(new java.awt.Font("Century", 1, 12));

        jLabel9.setFont(new java.awt.Font("Century", 1, 12));

        jLabel2.setFont(new java.awt.Font("Century", 1, 12));

        jMenu3.setText("File");
        jMenu3.setFont(new java.awt.Font("Century", 1, 12));

        jMenuItem5.setFont(new java.awt.Font("Century", 1, 12));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Services");
        jMenu1.setFont(new java.awt.Font("Century", 1, 12));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setFont(new java.awt.Font("Century", 1, 12));
        jMenuItem1.setText("Send Files");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Century", 1, 12));
        jMenuItem2.setText("Recieved Files");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Server");
        jMenu4.setFont(new java.awt.Font("Century", 1, 12));
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem8.setFont(new java.awt.Font("Century", 1, 12));
        jMenuItem8.setText("Start Server");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Century", 1, 12));
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Century", 1, 12));
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(292, 292, 292)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 711, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 219, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(63, 63, 63)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 768, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 717, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 567, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 687, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 849, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 799, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 775, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(58, 58, 58))
                            .add(layout.createSequentialGroup()
                                .add(72, 72, 72)
                                .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE))))
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(35, 35, 35)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(21, 21, 21)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(17, 17, 17)
                        .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(17, 17, 17)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
// TODO add your handling code here:
       
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
// TODO add your handling code here:
        if(Receiver.ReceiverServer.serverstatus==false)
        {
           t=new ServerThread();
           t.start();
           JOptionPane.showMessageDialog(null, "Server Started", "Message", 1);
           jTextArea1.append("\nServer Started");
        }
        else{
            JOptionPane.showMessageDialog(null, "Server Already Started Mode", "Message", 1);
            jTextArea1.append("\nServer in Started mode");
        }
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
// TODO add your handling code here:
        javax.swing.JLabel jLabel1;
        javax.swing.JLabel jLabel2=null;
        boolean flag = new enc.DBS().DBST(3,"",jLabel2);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
        new ReceivedFile(t).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
        new SendFile(t).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
// TODO add your handling code here:
        Receiver.ReceiverServer.serverstatus=false;
        System.exit(0);
        //this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
        if(t1!=null){
        if(t1.isAlive()){
            try{
                System.out.println("Thread is alive");
            t1.join(2000);
            }catch(Exception e){}
        }
        }
         t1=new ReceiverClient(jLabel2,t);
         t1.run();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
        try{
            FileInputStream fis1 = new FileInputStream(jLabel1.getText());
            int size=fis1.available();
            fis1.close();
            String s1=""+(((double)size)/(1024*1024));
            String s2=s1;
            s1=s1.substring(0,s1.lastIndexOf("."));
            s1+=s2.substring(s2.indexOf("."),(s1.length()+3));
            //jLabel2.setText("File Size is :"+(s1)+" MB");
            String fsplitsize="";
            float actualsize=Float.parseFloat(s1);
            float splitsize=0.0f;
            while(true){
                    fsplitsize=JOptionPane.showInputDialog("Enter Size to Split in MB: ");
                    splitsize=Float.parseFloat(fsplitsize);
                    System.out.println(actualsize+"---"+fsplitsize);
                    if(splitsize>30 || (actualsize%splitsize)<0 || splitsize>actualsize)
                        JOptionPane.showMessageDialog(new SendFile(t),"Split size must be below the Actual Size\n\nNot Greaterthan 35 MB");
                    else
                        break;
            }
             FileDialog filedialog = new FileDialog(new ReceivedFile(t), "select the File", 0);
             filedialog.show();
             String encfile="";
            if(filedialog.getFile() != null)
                 encfile= (new StringBuilder()).append(filedialog.getDirectory()).append(filedialog.getFile()).toString();
            jLabel3.setText("Split Size is :" +fsplitsize +" MB");
            jTextArea1.append("\nSplit Size is :" +fsplitsize +" MB");
            jLabel5.setText("Splitting File........");
            jTextArea1.append("\nSplitting File........");
           
           if((JOptionPane.showConfirmDialog(new SendFile(t),"Do You Want to split"))==0){
            
            int i=new Split().splitFile(encfile,fsplitsize,jTextArea1);
            
            jLabel5.setText("File Splitting Compleated");
            jTextArea1.append("\nFile Splitting Compleated");
            jLabel7.setText("File Splitted into "+i+" Files");
            jTextArea1.append("\nFile Splitted into "+i+" Files");
            jLabel8.setText(" Stored in the path : "+jLabel1.getText().substring(0,jLabel1.getText().lastIndexOf(".")));
            jTextArea1.append("\n Stored in the path : "+jLabel1.getText().substring(0,jLabel1.getText().lastIndexOf(".")));
           }
        }catch(Exception e){}
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
        jLabel4.setText("File Encrypting.......");
        jTextArea1.append("\nFile Encrypting.......");
        String filepath=jLabel1.getText();
        boolean flag=new DBS().DBST(1,jLabel1.getText(),jLabel9);
        if(flag)
        {
            jLabel4.setText("File Successfully Encrypted");
            jTextArea1.append("\nFile Successfully Encrypted");
        }
        else{ 
           jLabel4.setText("File Encryption failed");
           jTextArea1.append("\nFile Encryption failed");
        }
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        FileDialog filedialog = new FileDialog(new SendFile(t), "Select the File", 0);
        filedialog.show();
        String  name="";
        if(filedialog.getFile() != null)
             name = (new StringBuilder()).append(filedialog.getDirectory()).append(filedialog.getFile()).toString();
            jLabel1.setText(name);
            jTextArea1.append("\nFile Selected is:"+name);
            try{
            FileInputStream fis1 = new FileInputStream(jLabel1.getText());
            int size=fis1.available();
            fis1.close();
            String s1=""+(((double)size)/(1024*1024));
            String s2=s1;
            s1=s1.substring(0,s1.lastIndexOf("."));
            s1+=s2.substring(s2.indexOf("."),(s1.length()+3));
            jLabel6.setText("File Size is :"+(s1)+" MB");
            jTextArea1.append("\nFile Size is :"+(s1)+" MB");
            fis1.close();
            }catch(Exception e){e.printStackTrace();}
      
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendFile(t).setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
    
}