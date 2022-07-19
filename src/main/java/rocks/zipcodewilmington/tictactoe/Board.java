package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
//        return null;
        if (getWinner().equals("X"))
            return true;
        return false;
    }

    public Boolean isInFavorOfO() {
//        return null;
        if (getWinner().equals("O"))
            return true;
        return false;
    }

    public Boolean isTie() {
//        return null;
        if (getWinner().equals(""))
            return true;
        return false;
    }

    public String getWinner() {
//        return null;
        List<String> list = new ArrayList<String>();

        list.add(Character.toString(matrix[0][0]) + (matrix[0][1]) + (matrix[0][2]));
        list.add(Character.toString(matrix[1][0]) + (matrix[1][1]) + (matrix[1][2]));
        list.add(Character.toString(matrix[2][0]) + (matrix[2][1]) + (matrix[2][2]));

        list.add(Character.toString(matrix[0][0]) + (matrix[1][0]) + (matrix[2][0]));
        list.add(Character.toString(matrix[0][1]) + (matrix[1][1]) + (matrix[2][1]));
        list.add(Character.toString(matrix[0][2]) + (matrix[1][2]) + (matrix[2][2]));

        list.add(Character.toString(matrix[0][0]) + (matrix[1][1]) + (matrix[2][2]));
        list.add(Character.toString(matrix[2][0]) + (matrix[1][1]) + (matrix[0][2]));

        if (list.contains("XXX"))
            return "X";
        else if (list.contains("OOO"))
            return "O";
        else
            return "";
    }

}
