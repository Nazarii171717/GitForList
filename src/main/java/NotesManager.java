import java.util.List;

public class NotesManager {

    public String getNotesInAFormattedWay(List<Note> list)
    {
        String formattedText = "";
        for (Note note : list)
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
            }
        }
        if (!isExist)
        {
            System.out.println("Id You provided does not exist");
        }
    }
}
