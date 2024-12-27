package lab10.GUITask.GUIUtils.app;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

class BallPanel extends JPanel {
    int ballXPosition = 100, ballYPosition = 100;
    int ballXSpeed = 2, ballYSpeed = 2;

    private int ballSize = 40;

    private final int DELAY = 16;
    private BufferedImage ballImage;

    public BallPanel() {
        setBackground(Color.WHITE);
        loadBallImage();

    }

    private void loadBallImage() {
        try {

            ballImage = ImageIO.read(new File("lab10/GUITask/GUIUtils/app/ball1.png"));

            ballSize = Math.max(ballImage.getWidth(), ballImage.getHeight());
        } catch (Exception e) {
            System.err.println("Error loading ball image: " + e.getMessage());

            ballImage = createDefaultBallImage();
        }
    }

    private BufferedImage createDefaultBallImage() {
        BufferedImage defaultImage = new BufferedImage(ballSize, ballSize, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = defaultImage.createGraphics();
        g2.setColor(Color.RED);
        g2.fillOval(0, 0, ballSize, ballSize);
        g2.dispose();
        return defaultImage;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        g2d.drawImage(ballImage, (int) ballXPosition, (int) ballYPosition, ballSize, ballSize, null);
    }

    public void moveBall() {

        ballXPosition += ballXSpeed;
        ballYPosition += ballYSpeed;

        if (ballXPosition <= 0 || ballXPosition >= this.getWidth() - ballSize) {
            ballXSpeed = -ballXSpeed;
        }

        if (ballYPosition <= 0 || ballYPosition >= this.getHeight() - ballSize) {
            ballYSpeed = -ballYSpeed;
        }
    }

}