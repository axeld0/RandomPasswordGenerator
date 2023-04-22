public class Main {
    public static void main(String[] args) {
        System.out.println("lalalal");
        Password p1 = new Password(100);
        System.out.println(p1.generatePassword());
        if(p1.isStrong() == true)
        {
            System.out.println("Strong.");
        }
        else
        {
            System.out.println("Not strong.");
        }
    }
}