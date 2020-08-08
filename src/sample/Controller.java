package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.util.Date;

public class Controller {
    @FXML
    Canvas canvas;
    private final int canvasSize = 800;
    Game game;
    public Controller() {
        canvas = new Canvas(canvasSize, canvasSize);
        game = new Game();
    }

    public void draw () {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        // draw cells
        for (int y = 0;y < canvasSize;y += 100) {
            for (int x = 0;x < canvasSize;x += 100) {
                if ((y / 100 + x / 100) % 2 == 0) {
                    graphicsContext.setFill(Color.WHITE);
                } else {
                    graphicsContext.setFill(Color.LIGHTBLUE);
                }
                graphicsContext.fillRect(x, y, canvasSize >> 3, canvasSize >> 3);
            }
        }

        // draw figures
        for (int y = 0;y < game.height;y++) {
            for (int x = 0;x < game.width;x++) {
                Figure type = game.getValue(x, y);
                if (type != Figure.EMPTY) {
                    graphicsContext.drawImage(Icons.getImage(type), x * 100, y * 100, 100, 100);
                }
            }
        }
    }

    boolean wasSelected = false;
    int selectedX;
    int selectedY;

    public void mouseTouch (MouseEvent event) {

        if (!wasSelected) {

            int x = (int) event.getX() + 10;
            int y = (int) event.getY() + 10;

            int startX = (x / 100) * 100;
            int startY = (y / 100) * 100;
            int finishX = (x / 100) * 100 + 100;
            int finishY = (y / 100) * 100 + 100;

            selectedX = startX / 100;
            selectedY = startY / 100;

            if (game.firstNext) {
                System.out.println("first now");
                if (!Icons.isWhite(game.getValue(startX / 100, startY / 100))) {
                    System.out.println("not white selected");
                    return;
                }
            }
            if (!game.firstNext) {
                System.out.println("second now");
                if (!Icons.isBlack(game.getValue(startX / 100, startY / 100))) {
                    System.out.println("not black selected");
                    return;
                }
            }

            System.out.println("Correct select");

            game.drawWays(this, selectedX, selectedY);

            selectSell(startX, startY, finishX, finishY, Color.GREEN);

            wasSelected = true;
        } else {
            wasSelected = false;

            int x = (int) event.getX() + 10;
            int y = (int) event.getY() + 10;

            x /= 100;
            y /= 100;

            if (game.isCorrectWay(x, y)) {
                game.move(selectedX, selectedY, x, y);
                draw();
            } else {
                draw();
                mouseTouch(event);
            }

        }


    }

    public void selectSell (int startX, int startY, int finishX, int finishY, Color color) {
        startX += 2;
        startY += 2;
        finishX -= 2;
        finishY -= 2;

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        graphicsContext.setStroke(color);
        graphicsContext.setLineWidth(5);
        graphicsContext.strokeLine(startX, startY, startX, finishY);
        graphicsContext.strokeLine(startX, startY, finishX, startY);
        graphicsContext.strokeLine(startX, finishY, finishX, finishY);
        graphicsContext.strokeLine(finishX, startY, finishX, finishY);
    }

}
