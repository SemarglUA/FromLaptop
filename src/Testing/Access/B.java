package Testing.Access;

public class B {

    enum Literal{T, F, G}

    public static void main(String[] args) {
        int i = 23;
        Integer b = 26;
        byte c = 18;
        double d = 27.26;
        float f = 45f;
        long l = 2321;
        boolean bool = true;

        switch(b){
            case (23):                                //use two same equal statements in case operator;
                System.out.println("23");
                break;
            case (27):
                System.out.println("56");
                break;
            default:                                    // default case? not must be in the end of switch statement; Default case take all values,
                System.out.println("Default statement");// and that will be dangerous, because all next operation do own job, if we don't initialized "break;"
                break;
            case (28):
                System.out.println("2321");
                break;
            case(26):
                System.out.println("true");
                break;
        }


        do {
            System.out.println("lol");
        } while(false);

        for( ; i < 10 ; ){
            i++;
        }

        for(int m = 1, m1 = 2; m < 20; m++, ++m1, i++){
            System.out.println("IncrementsMoreValues");
        }

    }
}