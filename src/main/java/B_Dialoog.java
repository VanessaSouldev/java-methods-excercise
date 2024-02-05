public class B_Dialoog {

    public static void main(String[] args) {

        bertSays("Hey");
        ernieSays("Hey"); //Ernie
        bertSays("Welcome to this wonderful conversation");
        ernieSays("Thnx, I'm looking forward to it");
        bertSays("How about this weather?");
        ernieSays("I really don't mind the cold....");
        bertSays("And did you see that random program on that random channel?");
        ernieSays("Well... I did watch a random program on a random channel...");
        bertSays("Thank you for a wonderful conversation!");
        ernieSays("Cya");
    }

    public static void bertSays(String text) {
        System.out.println("Bert says: " + text);
    }
    public static void ernieSays(String text) {
        System.out.println(text + " says Ernie");
    }
    }
