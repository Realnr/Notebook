import control.NoteController;
import control.UserController;
import view.MainView;

public class MainProgramm {

    public static void main(String[] args){
        UserController userController=new UserController();
        NoteController noteController=new NoteController();
        MainView mainView = new MainView(userController, noteController);
    }
}

