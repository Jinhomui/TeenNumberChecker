public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if ((a <= 19 && a >= 13) ||
                (b <= 19 && b >= 13) ||
                (c <= 19 && c >= 13)){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }

    public static boolean isTeen(int d){
        if(d<=19 && d>=13){
            System.out.println(true);
            return true;
        }else{
            System.out.println(false);
            return false;
        }
    }
}
