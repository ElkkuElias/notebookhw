package Model;
import java.util.ArrayList;
public class NoteBook {

    public ArrayList<Note> notes;
    public NoteBook(){
        this.notes = new ArrayList<Note>();
    }
    public void add(Note note){
        this.notes.add(note);
    }
    public ArrayList<Note> getNotes(){
        return this.notes;
    }
    public void remove(int index){
        this.notes.remove(index);
    }
    public int size(){
        return this.notes.size();
    }
}
