package fr.lucassmirnoff.junote.ui;

public class Note {
    private String Content;
    private String Color;
    private Integer Id;
    private String Title;
    private String Icon;

    public Note() {}

    public Note(String content, String color, String title, String icon) {
        this.Title = title;
        this.Content = content;
        this.Color = color;
        this.Icon = icon;
    }

    public String getContent() {
        return this.Content;
    }

    public String getColor() {
        return this.Color;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getTitre() {
        return this.Title;
    }

    public void setContent(String newContent) {
        this.Content = newContent;
    }

    public void setColor(String newColor) {
        this.Color = newColor;
    }

    public void setId(Integer newId) {
        this.Id = newId;
    }

    public void setTitle(String newTitle) {
        this.Title = newTitle;
    }

    public String toString() {
        return "ID : " + this.Id + "\nTitre : " + this.Title + "\nContenu : " + this.Content + "\nCouleur : " + this.Color;
    }
}
