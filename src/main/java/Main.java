import Move.CorrectMove;
import PrintGameBoard.PrintGame;
import UserInput.UserInputReader;
import map.map1;
//import java.sql.SQLException;
import java.util.Scanner;
import static UserInput.UserInputReader.FirstName;

public class Main {
    public static void main(String[] args)  {

        UserInputReader Inp = new UserInputReader();
       map1 map = new map1();
        PrintGame printMap = new PrintGame();
        CorrectMove correctMove = new CorrectMove();
        Inp.begin();
        map.create();

        Scanner sc = new Scanner(System.in);
        String input;
        String balFel = "bal fel";
        String jobbFel = "jobb fel";
        String balLe = "bal le";
        String jobbLe = "jobb le";
        String exit = "esc";
        String Start = "y";
        int score = 0;

        boolean stepped;

        int foxRow = map.getFoxPlace()[0];
        int foxCol = map.getFoxPlace()[1];
        if (Start.matches(Inp.getInput().toLowerCase())) {
            do {
                printMap.printMap(map.getGameBoard());
                System.out.print("Add meg merre szeretnél lépni [jobb/bal le/fel] => ");
                input = sc.nextLine();


                if (balFel.matches(input.toLowerCase()) && (foxRow != 0 && foxCol != 0) && correctMove.moveCheck(map.getGameBoard(), foxRow - 1, foxCol - 1)) {
                    map.setFoxPlace(foxRow - 1, foxCol - 1);
                    map.setBoard(foxRow - 1, foxCol - 1, 1);
                    map.setBoard(foxRow, foxCol, 0);
                    foxRow--;
                    foxCol--;
                    stepped = true;
                } else if (jobbFel.matches(input.toLowerCase()) && (foxRow != 0 && foxCol != 7) && correctMove.moveCheck(map.getGameBoard(), foxRow - 1, foxCol + 1)) {
                    map.setFoxPlace(foxRow - 1, foxCol + 1);
                    map.setBoard(foxRow - 1, foxCol + 1, 1);
                    map.setBoard(foxRow, foxCol, 0);
                    foxRow--;
                    foxCol++;
                    stepped = true;
                } else if (balLe.matches(input.toLowerCase()) && (foxRow != 7 && foxCol != 0) && correctMove.moveCheck(map.getGameBoard(), foxRow + 1, foxCol - 1)) {
                    map.setFoxPlace(foxRow + 1, foxCol - 1);
                    map.setBoard(foxRow + 1, foxCol - 1, 1);
                    map.setBoard(foxRow, foxCol, 0);
                    foxRow++;
                    foxCol--;
                    stepped = true;
                } else if (jobbLe.matches(input.toLowerCase()) && (foxRow != 7 && foxCol != 7) && correctMove.moveCheck(map.getGameBoard(), foxRow + 1, foxCol + 1)) {
                    map.setFoxPlace(foxRow + 1, foxCol + 1);
                    map.setBoard(foxRow + 1, foxCol + 1, 1);
                    map.setBoard(foxRow, foxCol, 0);
                    foxRow++;
                    foxCol++;
                    stepped = true;
                } else if (exit.matches(input.toLowerCase())) {
                    break;
                } else {
                    System.out.println("It's not a correct step, try again");
                    stepped = false;
                }

                if (stepped) {
                    boolean houndstep;
                    int HoundCol;
                    int HoundRow;
                    do {
                        houndstep = true;
                        int houndNumber = (int) (Math.random() * 4) + 1;
                        int whereToMove = (int) (Math.random() * 2) + 1;
                        if (houndNumber == 1) {
                            HoundRow = map.getHound1Place()[0];
                            HoundCol = map.getHound1Place()[1];
                            if (whereToMove % 2 == 0 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol - 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol - 1, 2);
                                map.setHound1Place(HoundRow - 1, HoundCol - 1);
                            } else if (whereToMove % 2 == 1 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol + 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol + 1, 2);
                                map.setHound1Place(HoundRow - 1, HoundCol + 1);
                            } else {
                                houndstep = false;
                            }
                        } else if (houndNumber == 2) {
                            HoundRow = map.getHound2Place()[0];
                            HoundCol = map.getHound2Place()[1];
                            if (whereToMove % 2 == 0 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol - 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol - 1, 2);
                                map.setHound2Place(HoundRow - 1, HoundCol - 1);
                            } else if (whereToMove % 2 == 1 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol + 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol + 1, 2);
                                map.setHound2Place(HoundRow - 1, HoundCol + 1);
                            } else {
                                houndstep = false;
                            }
                        } else if (houndNumber == 3) {
                            HoundRow = map.getHound3Place()[0];
                            HoundCol = map.getHound3Place()[1];
                            if (whereToMove % 2 == 0 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol - 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol - 1, 2);
                                map.setHound3Place(HoundRow - 1, HoundCol - 1);
                            } else if (whereToMove % 2 == 1 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol + 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol + 1, 2);
                                map.setHound3Place(HoundRow - 1, HoundCol + 1);
                            } else {
                                houndstep = false;
                            }
                        } else if (houndNumber == 4) {
                            HoundRow = map.getHound4Place()[0];
                            HoundCol = map.getHound4Place()[1];
                            if (whereToMove % 2 == 0 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol - 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol - 1, 2);
                                map.setHound4Place(HoundRow - 1, HoundCol - 1);
                            } else if (whereToMove % 2 == 0 && correctMove.botMoveCheck(map.getGameBoard(), HoundRow - 1, HoundCol + 1)) {
                                map.setBoard(HoundRow, HoundCol, 0);
                                map.setBoard(HoundRow - 1, HoundCol + 1, 2);
                                map.setHound4Place(HoundRow - 1, HoundCol + 1);
                            } else {
                                houndstep = false;
                            }
                        }

                    } while (!houndstep);

                }
                if (map.getFoxPlace()[0] == 7) {
                    System.out.println("Congratulation! You won!");
                    score=1;
                    System.out.println("Dear"+ FirstName +" Your score: "+ score);
                    System.out.println("+" + score + " score saved!");
                    break;

                }

            } while (!exit.matches(input.toLowerCase()));

        } else {
            System.out.println("Sorry, The bot was more clever than you");
            score = -1;
            System.out.println("Dear"+ FirstName +" Your score: "+ score);
        }
    }}



