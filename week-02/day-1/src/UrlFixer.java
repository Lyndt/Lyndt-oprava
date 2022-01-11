public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it in more than one way using different String functions!

        System.out.println(url);
        oddsNotBots();
    }

    private static void oddsNotBots() {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        String urlNew = url.replace("bots", "odds");


        String component = urlNew.replace("https//", "https://");
        System.out.println(component);
        return;

    }





}