package six_kyu;


//class Diamond {
//    public static String print(int n) {
//        for (int i = 1; i <= n; i++ ) {
//            for (int j = n/2; j > i; j-- ) {
//                System.out.print(" ");
//            }
//            System.out.println("*");
//        }
//        return "*";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(print(5));
//    }
//}

class Diamond {
    public static String multiTable(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i < 10; i++ ) {
            result.append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n");
        }
        result.append(10).append(" * ").append(num).append(" = ").append(10 * num);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiTable(5));
    }
}