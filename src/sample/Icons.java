package sample;

import javafx.scene.image.Image;

public class Icons {
    public static Image getImage (Figure figure) {
        switch (figure) {
            case BLACK_BISHOP -> {return new Image("sample\\images\\black_bishop.png");}
            case BLACK_KING -> {return new Image("sample\\images\\black_king.png");}
            case BLACK_KNIGHT -> {return new Image("sample\\images\\black_knight.png");}
            case BLACK_PAWN -> {return new Image("sample\\images\\black_pawn.png");}
            case BLACK_QUEEN -> {return new Image("sample\\images\\black_queen.png");}
            case BLACK_ROOK -> {return new Image("sample\\images\\black_rook.png");}

            case WHITE_BISHOP -> {return new Image("sample\\images\\white_bishop.png");}
            case WHITE_KING -> {return new Image("sample\\images\\white_king.png");}
            case WHITE_KNIGHT -> {return new Image("sample\\images\\white_knight.png");}
            case WHITE_PAWN -> {return new Image("sample\\images\\white_pawn.png");}
            case WHITE_QUEEN -> {return new Image("sample\\images\\white_queen.png");}
            case WHITE_ROOK -> {return new Image("sample\\images\\white_rook.png");}
        }
        return null;
    }

    public static boolean isWhite (Figure figure) {
        switch (figure) {
            case BLACK_BISHOP, BLACK_PAWN, BLACK_QUEEN, BLACK_ROOK, BLACK_KNIGHT, BLACK_KING, EMPTY -> {return false;}
        }
        return true;
    }
    public static boolean isBlack (Figure figure) {
        switch (figure) {
            case WHITE_BISHOP, WHITE_PAWN, WHITE_QUEEN, WHITE_ROOK, WHITE_KNIGHT, WHITE_KING, EMPTY -> {return false;}
        }
        return true;
    }
    public static boolean isEmpty (Figure figure) {
        return figure == Figure.EMPTY;
    }
}
