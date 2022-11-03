package loops;

public class BreakStatementDemo1 {
    public static void main(String[] args) {
        //Syntax: for loop () if (break point){break;}{sop statement}
        for (int i=0; i<12; i++ ){
            if (i==6){
                break;
            }
            System.out.println("result of I after use break ..."+i);
        }
        // continue statement : After use continue statement it will not continue 6

        for (int j=0; j<12; j++ ){
            if (j==6){
                continue;
            }
            System.out.println(j);
        }

    }
}

