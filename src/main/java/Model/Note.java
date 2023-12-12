package Model;

public class Note {
    public String title;
    public String text;

    public Note(){
        this.title = "";
        this.text = "";
    }

    public void setText(String text){
        this.text = text;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public String getText(){
        return this.text;
    }
}
