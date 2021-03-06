package todoApp2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Input {

    public void handleInput(String[] args) {

        if (args == null || args.length < 1) {
            printUsage();
            return;
        }


        switch (args[0]) {
            case "-l": {
                if (args.length > 1) {
                    System.out.println("Unsupported argument");
                    break;
                }

                ListTask list = new ListTask();
                list.listTask();
                break;
            }
            case "-a": {
                if (args.length == 1) {
                    System.out.println("Unable to add: no task provided");
                    break;
                }
                AddTask add = new AddTask();
                add.setTask(getString(args));
                break;
            }
            case "-r": {
                rmTask(args);
                break;
            }
            case "-c": {
                checkTask(args);
                break;
            }
            default: {
                System.out.println("Unsupported argument\n");
                printUsage();
            }
        }
    }

    private void printUsage() {
        System.out.println("Command Line Todo application");
        System.out.println("=============================");
        System.out.println();
        System.out.println("Command line arguments:");
        System.out.println(" -l   Lists all the tasks");
        System.out.println(" -a   Adds a new task");
        System.out.println(" -r   Removes an task");
        System.out.println(" -c   Completes an task");
    }

    private String getString(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }

        return sb.toString();
    }

    private void rmTask(String[] args) {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            if (args.length == 1) {
                System.out.println("Unable to remove: no index provided");
                return;
            }

            try {
                int index = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Unable to remove: index is not a number");
                return;
            }

            int index = Integer.parseInt(args[1]) - 1;
            List<String> taskList = Files.readAllLines(path);

            try {
                taskList.remove(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to remove: index is out of bound");
                return;
            }

            taskList.remove(index);
            Files.write(path, taskList);

        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }
    }

    private void checkTask(String[] args) {
        Path path = Paths.get("todo/task/tasks.txt");
        try {
            if (args.length == 1) {
                System.out.println("Unable to check: no index provided");
                return;
            }

            try {
                int index = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Unable to check: index is not a number");
                return;
            }

            int index = Integer.parseInt(args[1]) - 1;
            List<String> taskList = Files.readAllLines(path);

            try {
                taskList.remove(index);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Unable to check: index is out of bound");
                return;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(taskList.get(index));
            sb.replace(0, 3, "[x]");
            taskList.remove(index);
            taskList.add(index, sb.toString());
            Files.write(path, taskList);

        } catch (IOException e) {
            System.out.println("Can't find file path!");
        }

    }


}