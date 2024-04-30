import java.util.List;

public class NotesManager {

    public String getNotesInAFormattedWay()
    {
        String formattedText = "";
        for (Note note : Main.list)
        {
            formattedText += note.toString() + "\n";
        }
        return formattedText;
    }

    public void deleteNote(String id)
    {
        boolean isExist = false;
        for (Note note : Main.list)
        {
            if (note.getId().equals(id))
            {
                Main.list.remove(note);
                isExist = true;
                System.out.println("You have deleted the note with id: "
                        + note.getId());
                break;
            }
        }
        if (!isExist)
        {
            System.out.println("Id You provided does not exist");
        }
    }
}
