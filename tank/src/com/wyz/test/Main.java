package com.wyz.test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(800,800);
        f.setTitle("坦克大战");
        //添加窗口点击关闭事件
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setResizable(false);
        f.setVisible(true);
    }
}
