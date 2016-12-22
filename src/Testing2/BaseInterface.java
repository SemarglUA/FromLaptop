package Testing2;

public interface BaseInterface extends SecondInterface {
    int i = 10;

    default int sum(){
       return 15;
    }

    void hello();

    static void text(){
        System.out.println("Hello");
    }
}
