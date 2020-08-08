package sample;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Game {
    Figure[][] board;
    // 0 - empty

    boolean firstNext = true;

    public Game() {
        board = new Figure[][]{
                {Figure.BLACK_ROOK, Figure.BLACK_KNIGHT, Figure.BLACK_BISHOP, Figure.BLACK_QUEEN, Figure.BLACK_KING, Figure.BLACK_BISHOP, Figure.BLACK_KNIGHT, Figure.BLACK_ROOK},
                {Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN, Figure.BLACK_PAWN},

                {Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY},
                {Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY},

                {Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY},
                {Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY, Figure.EMPTY},

                {Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN, Figure.WHITE_PAWN},
                {Figure.WHITE_ROOK, Figure.WHITE_KNIGHT, Figure.WHITE_BISHOP, Figure.WHITE_QUEEN, Figure.WHITE_KING, Figure.WHITE_BISHOP, Figure.WHITE_KNIGHT, Figure.WHITE_ROOK}
        };

        isGameOver = false;
    }

    int width = 8, height = 8;

    boolean isGameOver;

    private void kingSteps (int x, int y, boolean whiteColor) {
        Figure figure = getValue(x - 1, y - 1);
        if (whiteColor) {
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 1, y - 1});
            }
            figure = getValue(x - 1, y + 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 1, y + 1});
            }
            figure = getValue(x + 1, y + 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 1, y + 1});
            }
            figure = getValue(x + 1, y - 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 1, y - 1});
            }

            figure = getValue(x, y - 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x, y - 1});
            }
            figure = getValue(x, y + 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x, y + 1});
            }
            figure = getValue(x - 1, y);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 1, y});
            }
            figure = getValue(x + 1, y);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 1, y});
            }

        } else {
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 1, y - 1});
            }
            figure = getValue(x - 1, y + 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 1, y + 1});
            }
            figure = getValue(x + 1, y + 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 1, y + 1});
            }
            figure = getValue(x + 1, y - 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 1, y - 1});
            }

            figure = getValue(x, y - 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x, y - 1});
            }
            figure = getValue(x, y + 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x, y + 1});
            }
            figure = getValue(x - 1, y);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 1, y});
            }
            figure = getValue(x + 1, y);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 1, y});
            }

        }


    }
    private void knightSteps (int x, int y, boolean whiteColor) {

        Figure figure = getValue(x + 2, y - 1);
        if (whiteColor) {
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 2, y - 1});
            }
            figure = getValue(x + 2, y + 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 2, y + 1});
            }
            figure = getValue(x - 2, y - 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 2, y - 1});
            }
            figure = getValue(x - 2, y + 1);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 2, y + 1});
            }
            figure = getValue(x + 1, y - 2);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 1, y - 2});
            }
            figure = getValue(x + 1, y + 2);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x + 1, y + 2});
            }
            figure = getValue(x - 1, y - 2);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 1, y - 2});
            }
            figure = getValue(x - 1, y + 2);
            if (figure != null && !Icons.isWhite(figure)) {
                listOfWays.add(new int[]{x - 1, y + 2});
            }

        } else {
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 2, y - 1});
            }
            figure = getValue(x + 2, y + 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 2, y + 1});
            }
            figure = getValue(x - 2, y - 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 2, y - 1});
            }
            figure = getValue(x - 2, y + 1);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 2, y + 1});
            }
            figure = getValue(x + 1, y - 2);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 1, y - 2});
            }
            figure = getValue(x + 1, y + 2);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x + 1, y + 2});
            }
            figure = getValue(x - 1, y - 2);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 1, y - 2});
            }
            figure = getValue(x - 1, y + 2);
            if (figure != null && !Icons.isBlack(figure)) {
                listOfWays.add(new int[]{x - 1, y + 2});
            }
        }

    }
    private void pawnSteps (int x, int y, boolean whiteColor) {
        if (whiteColor) {
            // y --
            if (y == 6) {
                if (getValue(x, y - 1) == Figure.EMPTY && getValue(x, y - 2) == Figure.EMPTY) {
                    listOfWays.add(new int[]{x, y - 2});
                }
            }
            if (getValue(x, y - 1) == Figure.EMPTY) {
                listOfWays.add(new int[]{x, y - 1});
            }
            if (getValue(x - 1, y - 1) != null && Icons.isBlack(getValue(x - 1, y - 1))) {
                listOfWays.add(new int[]{x - 1, y - 1});
            }
            if (getValue(x + 1, y - 1) != null && Icons.isBlack(getValue(x + 1, y - 1))) {
                listOfWays.add(new int[]{x + 1, y - 1});
            }
        } else {
            // y ++
            if (y == 1) {
                if (getValue(x, y + 1) == Figure.EMPTY && getValue(x, y + 2) == Figure.EMPTY) {
                    listOfWays.add(new int[]{x, y + 2});
                }
            }
            if (getValue(x, y + 1) == Figure.EMPTY) {
                listOfWays.add(new int[]{x, y + 1});
            }
            if (getValue(x - 1, y + 1) != null && Icons.isWhite(getValue(x - 1, y + 1))) {
                listOfWays.add(new int[]{x - 1, y + 1});
            }
            if (getValue(x + 1, y + 1) != null && Icons.isWhite(getValue(x + 1, y + 1))) {
                listOfWays.add(new int[]{x + 1, y + 1});
            }
        }
    }
    private void bishopSteps (int x, int y, boolean whiteColor) {

        if (whiteColor) {
            Figure figure;

            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY--;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY++;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY--;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY++;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }

        } else {
            Figure figure;

            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY--;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY++;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY--;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY++;
                figure = getValue(posX, posY);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
        }
    }
    private void rookSteps (int x, int y, boolean whiteColor) {

        if (whiteColor) {
            Figure figure;

            for (int i = x + 1;i < 8;i++) {
                figure = getValue(i, y);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = x - 1;i >= 0;i--) {
                figure = getValue(i, y);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = y + 1;i < 8;i++) {
                figure = getValue(x, i);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
            for (int i = y - 1;i >= 0;i--) {
                figure = getValue(x, i);
                if (figure == null || Icons.isWhite(figure)) {
                    break;
                }
                if (Icons.isBlack(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
        } else {
            Figure figure;

            for (int i = x + 1;i < 8;i++) {
                figure = getValue(i, y);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = x - 1;i >= 0;i--) {
                figure = getValue(i, y);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = y + 1;i < 8;i++) {
                figure = getValue(x, i);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
            for (int i = y - 1;i >= 0;i--) {
                figure = getValue(x, i);
                if (figure == null || Icons.isBlack(figure)) {
                    break;
                }
                if (Icons.isWhite(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
        }

    }
    private void queenSteps (int x, int y, boolean whiteColor) {
        rookSteps(x, y, whiteColor);
        bishopSteps(x, y, whiteColor);
    }

    private void pawnAttacks (int x, int y, boolean whiteColor) {
        if (whiteColor) {
            // y --
            if (getValue(x - 1, y - 1) != null) {
                listOfWays.add(new int[]{x - 1, y - 1});
            }
            if (getValue(x + 1, y - 1) != null) {
                listOfWays.add(new int[]{x + 1, y - 1});
            }
        }
        if (!whiteColor) {
            // y ++
            if (getValue(x - 1, y + 1) != null) {
                listOfWays.add(new int[]{x - 1, y + 1});
            }
            if (getValue(x + 1, y + 1) != null) {
                listOfWays.add(new int[]{x + 1, y + 1});
            }
        }
    }
    private void kingAttacks(int x, int y) {
        Figure figure = getValue(x - 1, y - 1);
        if (figure != null) {
            listOfWays.add(new int[]{x - 1, y - 1});
        }
        figure = getValue(x - 1, y + 1);
        if (figure != null) {
            listOfWays.add(new int[]{x - 1, y + 1});
        }
        figure = getValue(x + 1, y + 1);
        if (figure != null) {
            listOfWays.add(new int[]{x + 1, y + 1});
        }
        figure = getValue(x + 1, y - 1);
        if (figure != null) {
            listOfWays.add(new int[]{x + 1, y - 1});
        }

        figure = getValue(x, y - 1);
        if (figure != null) {
            listOfWays.add(new int[]{x, y - 1});
        }
        figure = getValue(x, y + 1);
        if (figure != null) {
            listOfWays.add(new int[]{x, y + 1});
        }
        figure = getValue(x - 1, y);
        if (figure != null) {
            listOfWays.add(new int[]{x - 1, y});
        }
        figure = getValue(x + 1, y);
        if (figure != null) {
            listOfWays.add(new int[]{x + 1, y});
        }

    }
    private void knightAttacks(int x, int y) {

        Figure figure = getValue(x + 2, y - 1);
        if (figure != null) {
            listOfWays.add(new int[]{x + 2, y - 1});
        }
        figure = getValue(x + 2, y + 1);
        if (figure != null) {
            listOfWays.add(new int[]{x + 2, y + 1});
        }
        figure = getValue(x - 2, y - 1);
        if (figure != null) {
            listOfWays.add(new int[]{x - 2, y - 1});
        }
        figure = getValue(x - 2, y + 1);
        if (figure != null) {
            listOfWays.add(new int[]{x - 2, y + 1});
        }
        figure = getValue(x + 1, y - 2);
        if (figure != null) {
            listOfWays.add(new int[]{x + 1, y - 2});
        }
        figure = getValue(x + 1, y + 2);
        if (figure != null) {
            listOfWays.add(new int[]{x + 1, y + 2});
        }
        figure = getValue(x - 1, y - 2);
        if (figure != null) {
            listOfWays.add(new int[]{x - 1, y - 2});
        }
        figure = getValue(x - 1, y + 2);
        if (figure != null) {
            listOfWays.add(new int[]{x - 1, y + 2});
        }

    }
    private void bishopAttacks (int x, int y, boolean whiteColor) {

        if (whiteColor) {
            Figure figure;

            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY--;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY++;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY--;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY++;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }

        } else {
            Figure figure;

            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY--;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY++;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX++; posY--;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
            for (int posX = x, posY = y;posX >= 0 && posY >= 0 && posX < 8 && posY < 8;) {
                posX--; posY++;
                figure = getValue(posX, posY);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{posX, posY});
                    break;
                }
                listOfWays.add(new int[]{posX, posY});
            }
        }
    }
    private void rookAttacks (int x, int y, boolean whiteColor) {

        if (whiteColor) {
            Figure figure;

            for (int i = x + 1;i < 8;i++) {
                figure = getValue(i, y);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = x - 1;i >= 0;i--) {
                figure = getValue(i, y);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = y + 1;i < 8;i++) {
                figure = getValue(x, i);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
            for (int i = y - 1;i >= 0;i--) {
                figure = getValue(x, i);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.BLACK_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
        } else {
            Figure figure;

            for (int i = x + 1;i < 8;i++) {
                figure = getValue(i, y);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = x - 1;i >= 0;i--) {
                figure = getValue(i, y);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{i, y});
                    break;
                }
                listOfWays.add(new int[]{i, y});
            }
            for (int i = y + 1;i < 8;i++) {
                figure = getValue(x, i);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
            for (int i = y - 1;i >= 0;i--) {
                figure = getValue(x, i);
                if (figure == null) {
                    break;
                }
                if (!Icons.isEmpty(figure) && figure != Figure.WHITE_KING) {
                    listOfWays.add(new int[]{x, i});
                    break;
                }
                listOfWays.add(new int[]{x, i});
            }
        }

    }
    private void queenAttacks (int x, int y, boolean whiteColor) {
        rookAttacks(x, y, whiteColor);
        bishopAttacks(x, y, whiteColor);
    }


    public void move (int x1, int y1, int x2, int y2) {
        Figure figure = getValue(x1, y1);
        setValue(x1, y1, Figure.EMPTY);
        setValue(x2, y2, figure);

        // Cмена хода
        firstNext = !firstNext;

        System.out.printf("%s (%d : %d) -> (%d : %d)\n", figure.toString(), x1, y1, x2, y2);

        isGameOver();

        if (isGameOver) {
            System.out.println("GAME OVER");
        }
    }

    List<int[]> tempWays;
    List<int[]> listOfWays;
    public void drawWays (Controller controller, int x, int y) {

        // fill ways
        searchAllWays(x, y);

        // fill attacks
        deleteIncorrectWays(x, y);

        listOfWays = tempWays;

        for (int[] array : listOfWays) {
            if ( ( firstNext && Icons.isBlack(getValue(array[0], array[1])) ) || ( !firstNext && Icons.isWhite(getValue(array[0], array[1])) )) {
                controller.selectSell(array[0] * 100, array[1] * 100, array[0] * 100 + 100, array[1] * 100 + 100, Color.RED);
            } else {
                controller.selectSell(array[0] * 100, array[1] * 100, array[0] * 100 + 100, array[1] * 100 + 100, Color.YELLOW);
            }
        }
    }

    private void searchAllWays (int x, int y) {
        listOfWays = new ArrayList<>();
        Figure figure = getValue(x, y);
        if (Icons.isBlack(figure)) {

            if (figure == Figure.BLACK_KING) {
                kingSteps(x, y, false);
            } else if (figure == Figure.BLACK_BISHOP) {
                bishopSteps(x, y, false);
            } else if (figure == Figure.BLACK_PAWN) {
                pawnSteps(x, y, false);
            } else if (figure == Figure.BLACK_KNIGHT) {
                knightSteps(x, y, false);
            } else if (figure == Figure.BLACK_QUEEN) {
                queenSteps(x, y, false);
            } else if (figure == Figure.BLACK_ROOK) {
                rookSteps(x, y, false);
            }else {
                System.out.println("ERROR draw ways");
            }

        }
        if (Icons.isWhite(figure)) {

            if (figure == Figure.WHITE_KING) {
                kingSteps(x, y, true);
            } else if (figure == Figure.WHITE_BISHOP) {
                bishopSteps(x, y, true);
            } else if (figure == Figure.WHITE_PAWN) {
                pawnSteps(x, y, true);
            } else if (figure == Figure.WHITE_KNIGHT) {
                knightSteps(x, y, true);
            } else if (figure == Figure.WHITE_QUEEN) {
                queenSteps(x, y, true);
            } else if (figure == Figure.WHITE_ROOK) {
                rookSteps(x, y, true);
            }else {
                System.out.println("ERROR draw ways");
            }

        }
        tempWays = listOfWays;
    }
    private void deleteIncorrectWays (int x, int y) {
        Figure figure = getValue(x, y);

        if (figure == Figure.BLACK_KING) {
            attacksOfWhite();

            for (int i = 0; i < tempWays.size(); i++) {
                int[] ways = tempWays.get(i);

                for (int[] attacks : listOfWays) {
                    if (ways[0] == attacks[0] && ways[1] == attacks[1]) {
                        tempWays.remove(i--);
                        break;
                    }
                }
            }
        } else if (figure == Figure.WHITE_KING) {
            attacksOfBlack();

            for (int i = 0; i < tempWays.size(); i++) {
                int[] ways = tempWays.get(i);

                for (int[] attacks : listOfWays) {
                    if (ways[0] == attacks[0] && ways[1] == attacks[1]) {
                        tempWays.remove(i--);
                        break;
                    }
                }
            }
        } else {
            for (int i = 0;i < tempWays.size();i++) {
                int[] array = tempWays.get(i);
                if (!canNotKingGoToThisCell(x, y, array[0], array[1])) {
                    tempWays.remove(i--);
                }
            }
        }
    }

    public boolean isCorrectWay (int x, int y) {
        for (int[] array : listOfWays) {
            if (array[0] == x && array[1] == y) {
                System.out.println("correct way");
                return true;
            }
        }
        System.out.println("don't correct way");
        return false;
    }

    public void attacksOfBlack () {
        listOfWays = new ArrayList<>();

        for (int x = 0;x < 8;x++) {
            for (int y = 0;y < 8;y++) {
                Figure figure = getValue(x, y);

                if (Icons.isBlack(figure)) {
                    if (figure == Figure.BLACK_KING) {
                        kingAttacks(x, y);
                    } else if (figure == Figure.BLACK_BISHOP) {
                        bishopAttacks(x, y, false);
                    } else if (figure == Figure.BLACK_PAWN) {
                        pawnAttacks(x, y, false);
                    } else if (figure == Figure.BLACK_KNIGHT) {
                        knightAttacks(x, y);
                    } else if (figure == Figure.BLACK_QUEEN) {
                        queenAttacks(x, y, false);
                    } else if (figure == Figure.BLACK_ROOK) {
                        rookAttacks(x, y, false);
                    }else {
                        System.out.println("ERROR attacksOfBlack");
                    }
                }

            }
        }
    }
    public void attacksOfWhite () {
        listOfWays = new ArrayList<>();

        for (int x = 0;x < 8;x++) {
            for (int y = 0;y < 8;y++) {
                Figure figure = getValue(x, y);

                if (Icons.isWhite(figure)) {

                    if (figure == Figure.WHITE_KING) {
                        kingAttacks(x, y);
                    } else if (figure == Figure.WHITE_BISHOP) {
                        bishopAttacks(x, y, true);
                    } else if (figure == Figure.WHITE_PAWN) {
                        pawnAttacks(x, y, true);
                    } else if (figure == Figure.WHITE_KNIGHT) {
                        knightAttacks(x, y);
                    } else if (figure == Figure.WHITE_QUEEN) {
                        queenAttacks(x, y, true);
                    } else if (figure == Figure.WHITE_ROOK) {
                        rookAttacks(x, y, true);
                    }else {
                        System.out.println("ERROR attacksOfWhite");
                    }
                }

            }
        }
    }

    public boolean canNotKingGoToThisCell (int x1, int y1, int x2, int y2) {

        Figure figure = getValue(x1, y1);
        Figure was = getValue(x2, y2);
        setValue(x1, y1, Figure.EMPTY);
        setValue(x2, y2, figure);

        if (Icons.isWhite(figure)) {
            attacksOfBlack();
            for (int[] array : listOfWays) {
                if (getValue(array[0], array[1]) == Figure.WHITE_KING) {
                    setValue(x1, y1, figure);
                    setValue(x2, y2, was);
                    return false;
                }
            }
        } else {
            attacksOfWhite();
            for (int[] array : listOfWays) {
                if (getValue(array[0], array[1]) == Figure.BLACK_KING) {
                    setValue(x1, y1, figure);
                    setValue(x2, y2, was);
                    return false;
                }
            }
        }

        setValue(x1, y1, figure);
        setValue(x2, y2, was);

        return true;
    }

    public Figure getValue (int x, int y) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            //System.out.println("getValue exception x = " + x + " y = " + y);
            return null;
        }
        return board[y][x];
    }
    public void setValue (int x, int y, Figure value) {
        if (x < 0 || y < 0 || x >= width || y >= height) {
            System.out.println("Some error with setValue. x = " + x + " y = " + y);
            return;
        }
        board[y][x] = value;
    }

    public void isGameOver () {
        if (firstNext) {
            for (int x = 0;x < width;x++) {
                for (int y = 0;y < height;y++) {

                    listOfWays = new ArrayList<>();
                    Figure figure = getValue(x, y);

                    if (Icons.isWhite(figure)) {

                        if (figure == Figure.WHITE_KING) {
                            kingSteps(x, y, true);
                        } else if (figure == Figure.WHITE_BISHOP) {
                            bishopSteps(x, y, true);
                        } else if (figure == Figure.WHITE_PAWN) {
                            pawnSteps(x, y, true);
                        } else if (figure == Figure.WHITE_KNIGHT) {
                            knightSteps(x, y, true);
                        } else if (figure == Figure.WHITE_QUEEN) {
                            queenSteps(x, y, true);
                        } else if (figure == Figure.WHITE_ROOK) {
                            rookSteps(x, y, true);
                        }else {
                            System.out.println("ERROR draw ways");
                        }

                    }

                    tempWays = listOfWays;

                    deleteIncorrectWays(x, y);

                    if (tempWays.size() > 0) {
                        return;
                    }
                }
            }
        } else {
            for (int x = 0;x < width;x++) {
                for (int y = 0;y < height;y++) {

                    listOfWays = new ArrayList<>();
                    Figure figure = getValue(x, y);

                    if (Icons.isBlack(figure)) {

                        if (figure == Figure.BLACK_KING) {
                            kingSteps(x, y, false);
                        } else if (figure == Figure.BLACK_BISHOP) {
                            bishopSteps(x, y, false);
                        } else if (figure == Figure.BLACK_PAWN) {
                            pawnSteps(x, y, false);
                        } else if (figure == Figure.BLACK_KNIGHT) {
                            knightSteps(x, y, false);
                        } else if (figure == Figure.BLACK_QUEEN) {
                            queenSteps(x, y, false);
                        } else if (figure == Figure.BLACK_ROOK) {
                            rookSteps(x, y, false);
                        }else {
                            System.out.println("ERROR draw ways");
                        }

                    }

                    tempWays = listOfWays;

                    deleteIncorrectWays(x, y);

                    if (tempWays.size() > 0) {
                        return;
                    }
                }
            }
        }

        isGameOver = true;
    }
}
