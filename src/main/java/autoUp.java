import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class autoUp {

    public static void main(String[] args) {
        JFrame j = new JFrame("csdn半自动图片上传工具");
        j.setLayout(new FlowLayout());
        j.setAlwaysOnTop(true);
        j.setLocation(50,150);
        j.setSize(250,100);
        //j.setUndecorated(true);
        //1、事件源jb按钮就是事件源，因为要点击它
        JButton jb = new JButton("1开始)]");
        JButton ja = new JButton("2开始)");
        //2、事件处理程序ClickAction表示事件处理程序
        ClickActionB b = new ClickActionB();
        ClickActionA a = new ClickActionA();
        ClickActionC c = new ClickActionC();
        ClickActionD d = new ClickActionD();

        //3、关联，将事件源和事件处理程序a关联起来，意思是发生点击执行a
        jb.addActionListener(d);
        ja.addActionListener(c);
        //将jb源事件添加到窗口中。

        j.add(jb,BorderLayout.WEST);
        j.add(ja,BorderLayout.EAST);

        j.getContentPane().add(jb);
        j.getContentPane().add(ja);
        j.pack();
        j.setVisible(true);
    }
}

//事件处理程序，点击就是一个Action事件
class ClickActionB implements ActionListener {

    //@Override
    public void actionPerformed(ActionEvent e) {
        select select = new select();
        try {
//            Thread t = Thread.currentThread();
//            t.sleep(2000);
            select.toSelectB();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ClickActionD implements ActionListener {

    //@Override
    public void actionPerformed(ActionEvent e) {
        select1 select = new select1();
        Thread t = Thread.currentThread();

        try {
            t.sleep(2000);
            select.toSelectB();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class ClickActionA implements ActionListener {

    //@Override
    public void actionPerformed(ActionEvent e) {
        select select = new select();
        try {
            select.toSelectA();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }
    }
}


class ClickActionC implements ActionListener {

    //@Override
    public void actionPerformed(ActionEvent e) {
        downUpUtil d= new downUpUtil();
            Thread t = Thread.currentThread();

        try {
            t.sleep(2000);
            d.toMoveMouseToInputUploadTest();
        } catch (AWTException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}