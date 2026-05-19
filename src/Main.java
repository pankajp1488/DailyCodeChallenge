//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int num = 5;
        if (EvenNumberUtil.isEven(num)){
            System.out.println(num+ " is even number");
        }else{
            System.out.println(num+ " is odd number");
        }
    }
}