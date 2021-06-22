package java_lessons.lesson_18;

import java.util.Scanner;

public class SimpleBot {

    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[] {
            new CommandAndResult("/help", "Help of the bot..."),
            new CommandAndResult("/start", "Bot started"),
            new CommandAndResult("/stop", "Bot stopped")
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commands = "Available commands: \n";
        for (CommandAndResult item: COMMAND_AND_RESULTS) {
            commands += item.command + "\n";
        }
//        println(commands);
        COMMAND_AND_RESULTS[0] = new CommandAndResult(COMMAND_AND_RESULTS[0].command, commands);

        String input;
        boolean found;

        while (true) {
            input = scanner.nextLine();
            found = false;
            for (CommandAndResult commandAndResult : COMMAND_AND_RESULTS) {
                if (commandAndResult.command.equals(input)) {
                    println(commandAndResult.result);
                    found = true;
                    break;
                }
            }
            if (COMMAND_AND_RESULTS[COMMAND_AND_RESULTS.length - 1].command.equals(input)) {
                break;
            }

            if (!found) {
                println("No commands found! Try again please. Help command: "
                        + COMMAND_AND_RESULTS[0].command);
            }
        }
    }

    public static void println(String arg) {
        System.out.println(arg);
    }

}
