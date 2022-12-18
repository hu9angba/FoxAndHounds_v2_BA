package map;

import java.util.Map;
import java.util.StringJoiner;

public class map1
{
    int[][] GameBoard;

    public int[] getFoxPlace() {
        return foxPlace;
    }

    public void setFoxPlace(int foxPlaceRow, int foxPlaceColumn) {
        this.foxPlace = new int[]{foxPlaceRow, foxPlaceColumn};
    }

    public int[] getHound1Place() {
        return hound1Place;
    }

    public void setHound1Place(int houndPlaceRow, int houndPlaceCol) {
        this.hound1Place = new int[]{houndPlaceRow, houndPlaceCol};
    }

    public int[] getHound2Place() {
        return hound2Place;
    }

    public void setHound2Place(int houndPlaceRow, int houndPlaceCol) {
        this.hound2Place = new int[]{houndPlaceRow, houndPlaceCol};
    }

    public int[] getHound3Place() {
        return hound3Place;
    }

    public void setHound3Place(int houndPlaceRow, int houndPlaceCol) {
        this.hound3Place = new int[]{houndPlaceRow, houndPlaceCol};
    }

    public int[] getHound4Place() {
        return hound4Place;
    }

    public void setHound4Place(int houndPlaceRow, int houndPlaceCol) {
        this.hound4Place = new int[]{houndPlaceRow, houndPlaceCol};
    }

    int[] foxPlace = {0,0};
    int[] hound1Place = {7,1};
    int[] hound2Place = {7,3};
    int[] hound3Place = {7,5};
    int[] hound4Place = {7,7};

    @Override
    public String toString() {
        return new StringJoiner(", ", Map.class.getSimpleName() + "[", "]")
                .toString();
    }

    public int[][] getGameBoard() {
        return GameBoard;
    }

    public void setBoard(int row, int column, int value) {
        this.GameBoard[row][column] = value;
    }

    public void create()
    {
        GameBoard = new int[8][8];

        GameBoard[0][0] = 1;
        GameBoard[7][1] = 2;
        GameBoard[7][3] = 2;
        GameBoard[7][5] = 2;
        GameBoard[7][7] = 2;
    }


}

