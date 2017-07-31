import models.MusicStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 7/31/17.
 */
public class AppForMusic {
    public static void main(String[] args) {

        boolean programRunning = true;


        while (programRunning) {

            MusicStore prince = new MusicStore("Prince", "Purple Rain", 1984, 20);
            MusicStore beatles = new MusicStore("Beatles", "Sg.Peppers Lonely Hearts Club Band", 1967, 25);
            MusicStore daftPunk = new MusicStore("Daft Punk", "Discovery", 2001, 15);
            MusicStore Lorde = new MusicStore("Lorde", "Melodrama", 2017, 35);

            MusicStore[] allMusics = {prince, beatles, daftPunk, Lorde};

        try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to our Music Store. What would you like to do? To see All albums or Enter one of the following options: All albums, Search artist , Search Price or Search Year  ");

                String inputUserData = bufferedReader.readLine();

                if (inputUserData.equals("All albums")) {
                    for (MusicStore individualMusic : allMusics) {
                        System.out.println("------------------");
                        System.out.println(individualMusic.albumName);
                        System.out.println(individualMusic.artistName);
                        System.out.println(individualMusic.year);
                        System.out.println(individualMusic.price);
                    }
                } else if (inputUserData.equals("Search Price")) {

                    System.out.println("Please, enter the price you interested in");

                    String userInputString = bufferedReader.readLine();

                    int userInputVal = Integer.parseInt(userInputString);

                    for (MusicStore individualMusic : allMusics) {

                        if (individualMusic.askForPrice(userInputVal)) {
                            System.out.println("****************");
                            System.out.println(individualMusic.albumName);
                            System.out.println(individualMusic.artistName);
                            System.out.println(individualMusic.year);
                            System.out.println(individualMusic.price);

                        }
                    }

                } else if (inputUserData.equals("Search Year")) {

                    System.out.println("Which Year are you Looking for?????");

                    String userInputString = bufferedReader.readLine();

                    int userInputValueforYear = Integer.parseInt(userInputString);

                    for (MusicStore individualMusic : allMusics) {
                        if (individualMusic.askForYear(userInputValueforYear)) {
                            System.out.println("##########");
                            System.out.println(individualMusic.albumName);
                            System.out.println(individualMusic.artistName);
                            System.out.println(individualMusic.year);
                            System.out.println(individualMusic.price);
                        }
                    }

                } else if (inputUserData.equals("Search Artist Name")) {
                    for (MusicStore individualMusic : allMusics) {
                        System.out.println("Can you please enter the name of the artist?");

                        String userInputString = bufferedReader.readLine();

                        if (individualMusic.askForArtist(userInputString)) {
                            System.out.println("----------------");

                            System.out.println(individualMusic.artistName);
                            System.out.println(individualMusic.year);
                            System.out.println(individualMusic.price);
                        }

                    }
                } else {
                    System.out.println("Sorry");
                }


            }
        catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
