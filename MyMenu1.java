import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.event.*;
class MyMenu1 extends JFrame implements ActionListener
{
JMenu menu;
JMenuBar bar;
JTextArea t;
JMenuItem sa,copy,cut,paste,exit;
public MyMenu1()
{
    setSize(500,600);
    bar=new JMenuBar();
    setJMenuBar(bar);
    menu=new JMenu("menu");
    bar.add(menu);
    sa=new JMenuItem("Select All");
    menu.add(sa);
    copy=new JMenuItem("copy");
    menu.add(copy);
    cut=new JMenuItem("cut");
    menu.add(cut);
    paste=new JMenuItem("paste");
    menu.add(paste);
    menu.addSeparator();
    exit=new JMenuItem("exit");
    menu.add(exit);
    t=new JTextArea();
    add(t);
    t.setBounds(100,100,300,250);
    menu.add(t);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(null);
    setVisible(true);
    sa.addActionListener(this);
    copy.addActionListener(this);
    cut.addActionListener(this);
    paste.addActionListener(this);
    exit.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()=="sa")
    {
      t.selectAll();
    }
    else if(e.getSource()=="copy")
    {
        t.copy();
    }
    else if(e.getSource()=="cut")
    {
        t.cut();
    }
    else if(e.getSource()=="paste")
    {
        t.paste();
    }
    else 
    {
        t.exit(0);
    }
}
public static void main(String[] args)
{
    new MyMenu1();
}
}