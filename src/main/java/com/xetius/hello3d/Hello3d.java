package com.xetius.hello3d;

import com.jogamp.newt.event.WindowAdapter;
import com.jogamp.newt.event.WindowEvent;
import com.jogamp.newt.opengl.GLWindow;

import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;

public class Hello3d {
    public Hello3d() {
        GLProfile profile = GLProfile.getDefault();
        GLCapabilities capabilities = new GLCapabilities(profile);

        GLWindow window = GLWindow.create(capabilities);

        GLCanvas canvas = new GLCanvas(capabilities);
        window.setSize(300, 300);
        window.setVisible(true);
        window.setTitle("NEWT Window Test");

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Hello3d();
    }

}
