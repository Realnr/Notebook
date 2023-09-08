package model;

public class ToDoNote extends Note {


    private boolean completed;

    public ToDoNote(String title, String content) {
        super(title,content);
    }

    /**
     * Erzeugt aus allen Informationen einen Ausgabestring in der Form:
     * "[Titel]: [Inhalt]. Erstellt am: [Datum]. Fertiggestellt: [Ja/Nein]"
     * @return Ausgabestring für eine einzelne ToDoNotiz
     */
    @Override
    public String display() {
        String JaorNe;
        if (isCompleted()) {
            JaorNe = "Ja";
        } else{
            JaorNe = "nein";
        }
        return getTitle() + ": " + getContent() + ". " + "Erstellt am: " + getCreationDate() + ". " + "Fertiggestellt: " + JaorNe;

    }

    public void invertCompleted(){
        completed=!completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}