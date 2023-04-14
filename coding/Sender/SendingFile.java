package Sender;

import Receiver.*;
import enc.DBS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.jdesktop.layout.GroupLayout;

// Referenced classes of package Sender:
//            SendFile

public class SendingFile extends JFrame
{

    static Thread t;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenu jMenu3;
    private JMenu jMenu4;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem8;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea1;

    public SendingFile(Thread t)
    {
        SendingFile _tmp = this;
        t = t;
        initComponents();
        Thread t1 = new ReceiverClient(jLabel1, t);
        t1.run();
    }

    private void initComponents()
    {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();
        jMenuBar1 = new JMenuBar();
        jMenu3 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenu4 = new JMenu();
        jMenuItem8 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem4 = new JMenuItem();
        setDefaultCloseOperation(3);
        jLabel1.setFont(new Font("Century", 1, 12));
        jLabel1.setText("Host Name :");
        jLabel2.setFont(new Font("Century", 1, 12));
        jLabel2.setText("Status :");
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new Font("Century", 1, 12));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        jMenu3.setText("File");
        jMenu3.setFont(new Font("Century", 1, 12));
        jMenuItem5.setFont(new Font("Century", 1, 12));
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem5ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu3.add(jMenuItem5);
        jMenuBar1.add(jMenu3);
        jMenu1.setText("Services");
        jMenu1.setFont(new Font("Century", 1, 12));
        jMenu1.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu1ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenuItem1.setFont(new Font("Century", 1, 12));
        jMenuItem1.setText("Split File");
        jMenuItem1.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu1.add(jMenuItem1);
        jMenuItem3.setFont(new Font("Century", 1, 12));
        jMenuItem3.setText("Send Files");
        jMenuItem3.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem3ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu1.add(jMenuItem3);
        jMenuItem2.setFont(new Font("Century", 1, 12));
        jMenuItem2.setText("Recieved Files");
        jMenuItem2.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem2ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu1.add(jMenuItem2);
        jMenuBar1.add(jMenu1);
        jMenu4.setText("Server");
        jMenu4.setFont(new Font("Century", 1, 12));
        jMenu4.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenuItem8.setFont(new Font("Century", 1, 12));
        jMenuItem8.setText("Start Server");
        jMenuItem8.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem8ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu4.add(jMenuItem8);
        jMenuBar1.add(jMenu4);
        jMenu2.setText("Help");
        jMenu2.setFont(new Font("Century", 1, 12));
        jMenu2.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenu2ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenuItem4.setFont(new Font("Century", 1, 12));
        jMenuItem4.setText("Help");
        jMenuItem4.addActionListener(new ActionListener() {

            final SendingFile this$0;

            public void actionPerformed(ActionEvent evt)
            {
                jMenuItem4ActionPerformed(evt);
            }

            
            {
                this$0 = SendingFile.this;
                super();
            }
        });
        jMenu2.add(jMenuItem4);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(144, 144, 144).add(layout.createParallelGroup(1).add(jLabel2, -2, 369, -2).add(jLabel1, -2, 505, -2))).add(jScrollPane1, -2, 1199, -2)).addContainerGap(20, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(1).add(layout.createSequentialGroup().add(130, 130, 130).add(jLabel1, -2, 35, -2).add(33, 33, 33).add(jLabel2, -2, 28, -2).addPreferredGap(0, 65, 32767).add(jScrollPane1, -2, 188, -2)));
        pack();
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt)
    {
        ReceiverServer.serverstatus = false;
        System.exit(0);
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt)
    {
        (new SendFile(t)).setVisible(true);
        dispose();
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt)
    {
        (new SendingFile(t)).setVisible(true);
        dispose();
    }

    private void jMenuItem2ActionPerformed(ActionEvent evt)
    {
        (new ReceivedFile(t)).setVisible(true);
        dispose();
    }

    private void jMenu1ActionPerformed(ActionEvent actionevent)
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

    private void jMenu4ActionPerformed(ActionEvent actionevent)
    {
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt)
    {
        JLabel jLabel2 = null;
        boolean flag = (new DBS()).DBST(3, "", jLabel2);
    }

    private void jMenu2ActionPerformed(ActionEvent actionevent)
    {
    }

    public static void main(String args[])
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                (new SendingFile(SendingFile.t)).setVisible(true);
            }

        });
    }









}
