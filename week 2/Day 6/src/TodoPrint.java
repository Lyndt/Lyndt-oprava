public class TodoPrint {
    public static void main(String... args){
        String text = " - Buy milk\n";

        // Add "My todo:" to the beginning of the `todoText`
        // Add " - Download games" to the end of the `todoText`
        // Add " - Diablo" to the end of the `todoText` applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


        StringBuilder sb = new StringBuilder();
        sb.append("My todo:\n").append(text).append(" - Download games\n\t - Diablo"); ///(v poradi 1. n, 2. t)
        System.out.println(text);
        System.out.println(sb);
    }


}