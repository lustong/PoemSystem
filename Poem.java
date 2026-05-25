public class Poem {
    private int poemId;
    private String title;
    private String author;
    private String dynasty;
    private String content;
    private String remark;

    public Poem(int poemId, String title, String author, String dynasty, String content, String remark) {
        this.poemId = poemId;
        this.title = title;
        this.author = author;
        this.dynasty = dynasty;
        this.content = content;
        this.remark = remark;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getDynasty() { return dynasty; }
    public String getContent() { return content; }
    public String getRemark() { return remark; }
}