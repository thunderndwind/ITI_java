package lab10.GUITask.GUIUtils.app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

public class DateTimeApp extends JFrame implements Runnable {
    Thread th;
    Date d = new Date();
    JLabel timeLabel = new JLabel();
    JLabel marqueLabel = new JLabel();
    BallPanel ballPanel = new BallPanel();

    int marqueLabelYPosition = 10;
    int marqueLabelXPosition = 10;

    public DateTimeApp() {
        this.setTitle("Date & Time Frame Application");
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        timeLabel.setText(d.toString());

        marqueLabel.setText("Java ITI");
        marqueLabel.setBounds(marqueLabelXPosition, marqueLabelYPosition, 50, 30);
        marqueLabel.setBackground(Color.BLACK);

        this.add(marqueLabel);
        this.add(ballPanel);
        this.add(timeLabel, BorderLayout.CENTER);

        th = new Thread(this);
        th.start();
    }

    public static void main(String[] args) {
        DateTimeApp app = new DateTimeApp();
        app.setBounds(0, 0, 400, 400);
        app.setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            d = new Date();
            timeLabel.setText(d.toString());

            marqueLabelXPosition++;
            if (marqueLabelXPosition >= this.getWidth()) {
                marqueLabelXPosition = 20;
            }

            marqueLabel.setBounds(marqueLabelXPosition, marqueLabelYPosition, 50, 30);
            ballPanel.moveBall();
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// import javax.swing.*;
// import java.awt.*;

// public class BouncingBallApp extends JFrame {

// private BallPanel ballPanel;

// public BouncingBallApp() {
// this.setTitle("Bouncing Ball");
// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setSize(800, 600);

// ballPanel = new BallPanel();
// this.add(ballPanel);

// this.setVisible(true);

// // Start the animation
// Thread animationThread = new Thread(ballPanel);
// animationThread.start();
// }

// public static void main(String[] args) {
// new BouncingBallApp();
// }
// }

// class BallPanel extends JPanel implements Runnable {
// private int x = 100; // Initial x position
// private int y = 100; // Initial y position
// private int diameter = 30; // Diameter of the ball
// private int xSpeed = 5; // Speed in x direction
// private int ySpeed = 5; // Speed in y direction

// @Override
// protected void paintComponent(Graphics g) {
// super.paintComponent(g);
// g.setColor(Color.BLUE);
// g.fillOval(x, y, diameter, diameter); // Draw the ball
// }

// @Override
// public void run() {
// while (true) {
// // Update ball position
// x += xSpeed;
// y += ySpeed;

// // Check for collisions with panel borders
// if (x <= 0 || x + diameter >= getWidth()) {
// xSpeed = -xSpeed; // Reverse direction in x
// }
// if (y <= 0 || y + diameter >= getHeight()) {
// ySpeed = -ySpeed; // Reverse direction in y
// }

// // Repaint the panel to show the updated position
// repaint();

// // Pause for smooth animation
// try {
// Thread.sleep(30);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }

// --------------------------------=-========================================

// import javax.swing.*;
// import java.awt.*;
// import java.util.Random;

// public class AnimationBallApp extends JFrame {
// public AnimationBallApp() {
// add(new BallPanel());
// }

// public static void main(String[] args) {
// SwingUtilities.invokeLater(() -> {
// AnimationBallApp app = new AnimationBallApp();
// app.setBounds(50, 50, 400, 400);
// app.setVisible(true);
// });
// }
// }

// class BallPanel extends JPanel implements Runnable {
// private double ballX = 100;
// private double ballY = 100;
// private final int BALL_SIZE = 30;
// private double dx = 3;
// private double dy = 3;

// private Thread animationThread;

// private final int DELAY = 16;
// private Color ballColor;

// public BallPanel() {
// ballColor = Color.GREEN;

// animationThread = new Thread(this);
// animationThread.start();
// }

// @Override
// protected void paintComponent(Graphics g) {
// super.paintComponent(g);
// Graphics2D g2d = (Graphics2D) g;

// g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
// RenderingHints.VALUE_ANTIALIAS_ON);

// GradientPaint gradient = new GradientPaint(
// (float) ballX, (float) ballY, ballColor,
// (float) (ballX + BALL_SIZE), (float) (ballY + BALL_SIZE),
// Color.ORANGE);
// g2d.setPaint(gradient);

// g2d.fillOval((int) ballX, (int) ballY, BALL_SIZE, BALL_SIZE);

// g2d.setColor(new Color(255, 255, 255, 100));
// g2d.fillOval((int) (ballX + BALL_SIZE / 4),
// (int) (ballY + BALL_SIZE / 4),
// BALL_SIZE / 4, BALL_SIZE / 4);
// }

// private void moveBall() {
// ballX += dx;
// ballY += dy;

// if (ballX <= 0) {
// ballX = 0;
// dx = Math.abs(dx);
// changeDirection();
// } else if (ballX >= getWidth() - BALL_SIZE) {
// ballX = getWidth() - BALL_SIZE;
// dx = -Math.abs(dx);
// changeDirection();
// }

// if (ballY <= 0) {
// ballY = 0;
// dy = Math.abs(dy);
// changeDirection();
// } else if (ballY >= getHeight() - BALL_SIZE) {
// ballY = getHeight() - BALL_SIZE;
// dy = -Math.abs(dy);
// changeDirection();
// }
// }

// private void changeDirection() {

// Random rand = new Random();
// dx += (rand.nextDouble() - 0.5) * 0.5;
// dy += (rand.nextDouble() - 0.5) * 0.5;

// double speed = Math.sqrt(dx * dx + dy * dy);
// if (speed > 6) {
// dx = (dx / speed) * 6;
// dy = (dy / speed) * 6;
// } else if (speed < 2) {
// dx = (dx / speed) * 2;
// dy = (dy / speed) * 2;
// }
// }

// @Override
// public void run() {
// while (true) {
// try {
// moveBall();
// repaint();
// Thread.sleep(DELAY);
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// }
// }
