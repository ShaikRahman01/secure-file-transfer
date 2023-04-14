package Sender;

import Receiver.*;
import Splitter.Split;
import enc.DBS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.PrintStream;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

public class SendFile extends JFrame
{

    static Thread t;
    static Thread t1;
    private JButton jButton1;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem8;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;

    public SendFile(Thread t)
    {
        SendFile _tmp = this;
        t = t;
        initComponents();
    }

    private void initComponents()
    {
        jButton1 = new JButton();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel2 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu3 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem8 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem4 = new JMenuItem();
        setDefaultCloseOperation(3);
        setTitle("File Splitter");
        setResizable(false);
        jButton1.setFont(new Font("Arial Unicode MS", 1, 14));
        jButton1.setText("Select File");
        jButton1.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Century", 1, 12));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jButton3.setFont(new Font("Arial Unicode MS", 1, 14));
        jButton3.setText("Encrypt File");
        jButton3.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jButton4.setFont(new Font("Arial Unicode MS", 1, 14));
        jButton4.setText("Split File");
        jButton4.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jButton4ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jButton5.setFont(new Font("Arial Unicode MS", 1, 14));
        jButton5.setText("Send Files");
        jButton5.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jButton5ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jLabel1.setFont(new Font("Century", 1, 12));
        jLabel3.setFont(new Font("Century", 1, 12));
        jLabel4.setFont(new Font("Century", 1, 12));
        jLabel5.setFont(new Font("Century", 1, 12));
        jLabel6.setFont(new Font("Century", 1, 12));
        jLabel7.setFont(new Font("Century", 1, 12));
        jLabel8.setFont(new Font("Century", 1, 12));
        jLabel9.setFont(new Font("Century", 1, 12));
        jLabel2.setFont(new Font("Century", 1, 12));
        jMenu3.setText("File");
        jMenu3.setFont(new Font("Century", 1, 12));
        jMenuItem5.setFont(new Font("Century", 1, 12));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem5ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenu3.add(jMenuItem5);
        jMenuBar1.add(jMenu3);
        jMenu1.setText("Services");
        jMenu1.setFont(new Font("Century", 1, 12));
        jMenu1.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu1ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenuItem1.setFont(new Font("Century", 1, 12));
        jMenuItem1.setText("Send Files");
        jMenuItem1.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenu1.add(jMenuItem1);
        jMenuItem2.setFont(new Font("Century", 1, 12));
        jMenuItem2.setText("Recieved Files");
        jMenuItem2.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenu1.add(jMenuItem2);
        jMenuBar1.add(jMenu1);
        jMenu4.setText("Server");
        jMenu4.setFont(new Font("Century", 1, 12));
        jMenu4.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenuItem8.setFont(new Font("Century", 1, 12));
        jMenuItem8.setText("Start Server");
        jMenuItem8.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem8ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenu4.add(jMenuItem8);
        jMenuBar1.add(jMenu4);
        jMenu2.setText("Help");
        jMenu2.setFont(new Font("Century", 1, 12));
        jMenu2.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu2ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenuItem4.setFont(new Font("Century", 1, 12));
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new ActionListener() {

            final SendFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }

            
            {
                this$0 = SendFile.this;
                super();
            }
        });
        jMenu2.add(jMenuItem4);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(292, 292, 292).add(jLabel6, -2, 711, -2)).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(1).add(layout.createParallelGroup(2).add(layout.createParallelGroup(1).add(jButton1, -2, 219, -2).add(jButton3, -2, 219, -2)).add(jButton4, -2, 219, -2)).add(jButton5, -2, 219, -2)).addPreferredGap(0).add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(63, 63, 63).add(layout.createParallelGroup(1).add(jLabel1, -2, 768, -2).add(jLabel3, -2, 717, -2).add(jLabel9, -2, 567, -2).add(jLabel7, -2, 687, -2).add(jLabel5, -2, 849, -2).add(jLabel8, -2, 799, -2).add(jLabel2, -2, 775, -2)).add(58, 58, 58)).add(layout.createSequentialGroup().add(72, 72, 72).add(jLabel4, -1, 898, 32767)))).add(jScrollPane1, -2, 1199, -2)).addContainerGap(172, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().addContainerGap().add(layout.createParallelGroup(3).add(jButton1, -2, 39, -2).add(jLabel1, -2, 36, -2)).add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(35, 35, 35).add(jButton3, -2, 38, -2)).add(layout.createSequentialGroup().add(6, 6, 6).add(jLabel6, -2, 28, -2).add(21, 21, 21).add(jLabel4, -2, 29, -2))).add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(14, 14, 14).add(jLabel3, -2, 34, -2).add(17, 17, 17).add(jLabel9, -2, 29, -2)).add(layout.createSequentialGroup().add(34, 34, 34).add(jButton4, -2, 37, -2))).add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(22, 22, 22).add(jButton5, -2, 38, -2)).add(layout.createSequentialGroup().add(14, 14, 14).add(jLabel7, -2, 32, -2).addPreferredGap(0).add(jLabel5, -2, 32, -2))).addPreferredGap(0).add(jLabel8, -2, 32, -2).addPreferredGap(0).add(jLabel2, -2, 26, -2).add(17, 17, 17).add(jScrollPane1, -2, 188, -2).add(22, 22, 22)));
        pack();
    }

    private void jMenu4ActionPerformed(ActionEvent actionevent)
    {
    }

    private void jMenuItem8ActionPerformed(ActionEvent evt)
    {
        if(!ReceiverServer.serverstatus)
        {
            t = new ServerThread();
            t.start();
            JOptionPane.showMessageDialog(null, "Server Started", "Message", 1);
            jTextArea1.append("\nServer Started");
        } else
        {
            JOptionPane.showMessageDialog(null, "Server Already Started Mode", "Message", 1);
            jTextArea1.append("\nServer in Started mode");
        }
    }

    private void jMenu2ActionPerformed(ActionEvent actionevent)
    {
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt)
    {
        JLabel jLabel2 = null;
        boolean flag = (new DBS()).DBST(3, "", jLabel2);
    }

    private void jMenu1ActionPerformed(ActionEvent actionevent)
    {
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt)
    {
        (new ReceivedFile(t)).setVisible(true);
        dispose();
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt)
    {
        (new SendFile(t)).setVisible(true);
        dispose();
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt)
    {
        ReceiverServer.serverstatus = false;
        System.exit(0);
    }

    private void jButton5ActionPerformed(ActionEvent evt)
    {
        if(t1 != null && t1.isAlive())
        {
            try
            {
                System.out.println("Thread is alive");
                t1.join(2000L);
            }
            catch(Exception e) { }
        }
        t1 = new ReceiverClient(jLabel2, t);
        t1.run();
    }

    private void jButton4ActionPerformed(ActionEvent evt)
    {
        try
        {
            FileInputStream fis1 = new FileInputStream(jLabel1.getText());
            int size = fis1.available();
            fis1.close();
            String s1 = (new StringBuilder()).append("").append((double)size / 1048576D).toString();
            String s2 = s1;
            s1 = s1.substring(0, s1.lastIndexOf("."));
            s1 = (new StringBuilder()).append(s1).append(s2.substring(s2.indexOf("."), s1.length() + 3)).toString();
            String fsplitsize = "";
            float actualsize = Float.parseFloat(s1);
            float splitsize = 0.0F;
            do
            {
                fsplitsize = JOptionPane.showInputDialog("Enter Size to Split in MB: ");
                splitsize = Float.parseFloat(fsplitsize);
                System.out.println((new StringBuilder()).append(actualsize).append("---").append(fsplitsize).toString());
                if(splitsize <= 30F && actualsize % splitsize >= 0.0F && splitsize <= actualsize)
                {
                    break;
                }
                JOptionPane.showMessageDialog(new SendFile(t), "Split size must be below the Actual Size\n\nNot Greaterthan 35 MB");
            } while(true);
            FileDialog filedialog = new FileDialog(new ReceivedFile(t), "select the File", 0);
            filedialog.show();
            String encfile = "";
            if(filedialog.getFile() != null)
            {
                encfile = (new StringBuilder()).append(filedialog.getDirectory()).append(filedialog.getFile()).toString();
            }
            jLabel3.setText((new StringBuilder()).append("Split Size is :").append(fsplitsize).append(" MB").toString());
            jTextArea1.append((new StringBuilder()).append("\nSplit Size is :").append(fsplitsize).append(" MB").toString());
            jLabel5.setText("Splitting File........");
            jTextArea1.append("\nSplitting File........");
            if(JOptionPane.showConfirmDialog(new SendFile(t), "Do You Want to split") == 0)
            {
                int i = (new Split()).splitFile(encfile, fsplitsize, jTextArea1);
                jLabel5.setText("File Splitting Compleated");
                jTextArea1.append("\nFile Splitting Compleated");
                jLabel7.setText((new StringBuilder()).append("File Splitted into ").append(i).append(" Files").toString());
                jTextArea1.append((new StringBuilder()).append("\nFile Splitted into ").append(i).append(" Files").toString());
                jLabel8.setText((new StringBuilder()).append(" Stored in the path : ").append(jLabel1.getText().substring(0, jLabel1.getText().lastIndexOf("."))).toString());
                jTextArea1.append((new StringBuilder()).append("\n Stored in the path : ").append(jLabel1.getText().substring(0, jLabel1.getText().lastIndexOf("."))).toString());
            }
        }
        catch(Exception e) { }
    }

    private void jButton3ActionPerformed(ActionEvent evt)
    {
        jLabel4.setText("File Encrypting.......");
        jTextArea1.append("\nFile Encrypting.......");
        String filepath = jLabel1.getText();
        boolean flag = (new DBS()).DBST(1, jLabel1.getText(), jLabel9);
        if(flag)
        {
            jLabel4.setText("File Successfully Encrypted");
            jTextArea1.append("\nFile Successfully Encrypted");
        } else
        {
            jLabel4.setText("File Encryption failed");
            jTextArea1.append("\nFile Encryption failed");
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt)
    {
        FileDialog filedialog = new FileDialog(new SendFile(t), "Select the File", 0);
        filedialog.show();
        String name = "";
        if(filedialog.getFile() != null)
        {
            name = (new StringBuilder()).append(filedialog.getDirectory()).append(filedialog.getFile()).toString();
        }
        jLabel1.setText(name);
        jTextArea1.append((new StringBuilder()).append("\nFile Selected is:").append(name).toString());
        try
        {
            FileInputStream fis1 = new FileInputStream(jLabel1.getText());
            int size = fis1.available();
            fis1.close();
            String s1 = (new StringBuilder()).append("").append((double)size / 1048576D).toString();
            String s2 = s1;
            s1 = s1.substring(0, s1.lastIndexOf("."));
            s1 = (new StringBuilder()).append(s1).append(s2.substring(s2.indexOf("."), s1.length() + 3)).toString();
            jLabel6.setText((new StringBuilder()).append("File Size is :").append(s1).append(" MB").toString());
            jTextArea1.append((new StringBuilder()).append("\nFile Size is :").append(s1).append(" MB").toString());
            fis1.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new SendFile(SendFile.t)).setVisible(true);
            }

        });
    }












}
