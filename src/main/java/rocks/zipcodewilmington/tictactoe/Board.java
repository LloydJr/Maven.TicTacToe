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
        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
//        return null;
        List<String> list = new ArrayList<String>();
        list.add(Character.toString(matrix[0][0]) + (matrix[0][1]) + (matrix[0][2]));
        list.add(Character.toString(matrix[1][0]) + (matrix[1][1]) + (matrix[1][2]));
        list.add(Character.toString(matrix[2][0]) + (matrix[2][1]) + (matrix[2][2]));



    }

}
