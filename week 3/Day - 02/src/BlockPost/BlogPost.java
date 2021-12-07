package BlockPost;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String text, String title, String publicationDate, String authorName) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.text = text;
        this.authorName = authorName;


    }

    @Override
    public String toString() {
        return "BlockPost.BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
