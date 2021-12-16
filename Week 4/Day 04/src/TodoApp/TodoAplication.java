package TodoApp;

public class TodoAplication {
    public void handleImput(String[] args) {

        if (args == null || args.length < 1) {
            System.out.println("Command Line Todo application");
            System.out.println("=============================");
            System.out.println();

            System.out.println("-l = Lists all the tasks");
            System.out.println("-a = Add new task");
            System.out.println("-r = removes an task");
            System.out.println("-c = Copmletes an task");

            return;
        }

        switch (args[0]) {
            case "-l": {
                System.out.println("List all the tasks: ");
            }
            case "-a": {
                System.out.println("Add new task: ");
                System.out.println(args[1]);
                break;
            }
            case "-r": {
                System.out.println("Remote task: ");
                System.out.println(args[1]);
                break;
            }


        }


    }

}
