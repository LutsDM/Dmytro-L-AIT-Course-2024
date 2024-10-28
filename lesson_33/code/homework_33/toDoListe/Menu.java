package homework_33.toDoListe;

public enum Menu {

    ADD_TASK(1, "Add task"),
    VIEW_TASKS(2, "View all tasks"),
    DELETE_TASK(3, "Delete task"),
    EXIT(4, "Exit from menu");

    private final int number;
    private final String action;

    Menu(int number, String action) {
        this.number = number;
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public String getAction() {
        return action;
    }

    public static void printMenu() {
        System.out.println("Menu: ");
        Menu[] options = Menu.values();
        for (int i = 0; i < options.length ; i++) {
            System.out.println(options[i].getNumber() + " : " + options[i].getAction());
        }
    }


}
