import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import za.ac.wits.snake.DevelopmentAgent;

public class MyAgent extends DevelopmentAgent {

    public static void main(String args[]) {
        MyAgent agent = new MyAgent();
        MyAgent.start(agent, args);
    }

    @Override
    public void run() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String initString = br.readLine();
            String[] temp = initString.split(" ");
            int nSnakes = Integer.parseInt(temp[0]);

            while (true) {
                String line = br.readLine();
                if (line.contains("Game Over")) {
                    System.out.println("log" + "----------------GAME OVER NEW GAME----------------------");
                    break;
                }

                String apple1 = line;

                System.out.println("log APPLE @ :" + apple1);

                //do stuff with apples

                for (int zombie=0; zombie<6; zombie++) {
                    String zombieLine=br.readLine();
                    System.out.println("log ZOMBIES : " + zombieLine);
                }

                int mySnakeNum = Integer.parseInt(br.readLine());
                System.out.println("log MY SNAKE NUM :" + mySnakeNum);
                System.out.println("log OTHER SNAKES : ");
                for (int i = 0; i < nSnakes; i++) {
                    String snakeLine = br.readLine();

                    System.out.println("log" + snakeLine);
                    if (i == mySnakeNum) {

                        //hey! That's me :)
                    }
                    //do stuff with other snakes
                }
                //finished reading, calculate move:
                int move = new Random().nextInt(4);
                System.out.println(move);
                System.out.println("log MY SNAKE MAKES MOVE: " + move);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
