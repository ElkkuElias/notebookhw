package controller;
import Model.Note;
import Model.NoteBook;
import javafx.scene.layout.Pane;
import view.NotebookView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.util.Locale;
import javafx.scene.control.Label;
public class NoteController {
    @FXML
    public Button btn;
    @FXML
    public TextField text;
    @FXML
    public TextArea title;

    @FXML
    public Pane notes;

    @FXML
    public NoteBook noteBook = new NoteBook();


    @FXML
    private void addNote(){
        String titleText = title.getText();
        String content = text.getText();
        if(titleText.length() == 0 || content.length() == 0){
            return;
        }
        Note note = new Note();
        note.setTitle(titleText);
        note.setText(content);
        noteBook.add(note);
        Label noteLabel = new Label("Title: " + note.getText()+ "\n" + "Content: " + note.getTitle());
        notes.getChildren().add(noteLabel);
        text.setText("");
        title.setText("");
    }
    public static void main(String[] args) {
        NotebookView.launch(NotebookView.class);
    }

}
