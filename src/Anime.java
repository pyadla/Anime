/* A small animation using java */

import java.applet.*;
import java.awt.*;


@SuppressWarnings("serial")

public class Anime extends Applet implements Runnable {


    Thread t;
    int x1=40,x2=400,m1=80; //x co-ordinates
    int y1=40,n1=55; //y co-ordinates
    public void init() {
        setSize(500,150);
        setBackground(Color.LIGHT_GRAY);
        t = new Thread(this);
        t.start();
    }

    public void run() {
        for(int i=0;i<30;i++){
          try{
            while(m1<x2-22){
                m1++;
                repaint();
                Thread.sleep(25);
            }
        }catch(Exception e){}
         m1=80;
        }
    }


    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x1, y1, 40,40);
        g.drawRect(x2, y1,40,40);
        g.drawRect(x1+41, n1-2, x2-x1-43,15);
        g.drawRect(x1+33, y1-3,7,6);
        g.fillRect(x2+33, y1-3,8,6);
        g.setColor(Color.YELLOW);
        g.fillRect(x1+1, y1+1,39, 39);
        g.fillRect(x1+34, y1-2,6,6);
        g.fillRect(x2+1, y1+1, 39, 39);
        g.fillRect(x2+34, y1-2,6,6);
        g.setColor(Color.WHITE);
        g.fillRect(x1+42, n1-1, x2-x1-44,14);
        g.setColor(Color.green);
        g.fillRoundRect(m1, n1, 20, 12, 4, 2);

    }


    // TODO overwrite start(), stop() and destroy() methods
}

