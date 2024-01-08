package com.mmee;

import javax.swing.*;
import java.awt.event.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class KeyLogger extends JFrame implements MouseListener,KeyListener{
    private static final JFrame frame = new JFrame();
    KeyLogger() {
        createFrame();
    }
    public void createFrame() {
        frame.setSize(30,30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("MousePointer");
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.addMouseListener(this);
        frame.addKeyListener(this);
    }
    public static void main(String[] args) {
        new KeyLogger();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println(mouseEvent.paramString());
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println(keyEvent.getKeyText(keyEvent.getKeyCode()));
        processKeyEvent(keyEvent);
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}