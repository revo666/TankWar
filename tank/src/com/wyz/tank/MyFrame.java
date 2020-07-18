package com.wyz.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame {
    private int x;
    private int y;
    public MyFrame() throws HeadlessException {
        this.setSize(800,800);
        this.setTitle("坦克大战");
        //添加窗口点击关闭事件
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(this.x, this.y, 100, 50);
        this.x += 10;
        this.y += 10;
    }
}
