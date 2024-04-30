import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Note> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Note note1 = new Note("z123", "Work", "12344321");
        list.add(note1);
        Note note2 = new Note("z234", "Rest", "pleasure");
        list.add(note2);
        Note note3 = new Note("z345", "Entertainment", "22ww22ww");
        list.add(note3);

        System.out.println("Type id of the note you would like to delete: ");
        System.out.println("To stop removing notes, type word 'stop'");

        NotesManager notesManager = new NotesManager();

        Scanner sc = new Scanner(System.in);
        String usersInput = sc.next();

        while(!usersInput.equals("stop")){
            notesManager.deleteNote(usersInput);
            usersInput = sc.next();
        }

        System.out.println("List with remaining notes: ");
        System.out.println(notesManager.getNotesInAFormattedWay());
    }
}
