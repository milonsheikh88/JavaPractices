package java_8.forEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> gamesList = new ArrayList<String>();
        gamesList.add("Football");
        gamesList.add("Cricket");
        gamesList.add("Chess");
        gamesList.add("Hocky");
        System.out.println("------------ForEach Iterating by passing lambda expression--------------");
        gamesList.forEach((game) -> System.out.println(game));
    }

}
