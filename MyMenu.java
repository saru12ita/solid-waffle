import javax.swing.*;
class MyMenu
{
    JFrame f;
    JMenuBar bar;
    JMenu file,edit,n;
    JMenuItem save,exit,pdf;
    public MyMenu()
    {
        f=new JFrame();
        f.setSize(500,600);
        bar=new JMenuBar();
        f.setJMenuBar(bar);
        file=new JMenu("file");
        bar.add(file);
        edit=new JMenu("edit");
        bar.add(edit);
        n=new JMenu("new");
        file.add(n);
        save=new JMenuItem("save");
        file.add(save);
        file.addSeparator();
        exit=new JMenuItem("exit");
        file.add(exit);
        pdf=new JMenuItem("pdf");
        n.add(pdf);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args)
    {
        new MyMenu();
    }
}