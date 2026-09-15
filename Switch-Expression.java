// class SwitchExprssn{
//     public static void main(String[] args){
//         String day = "Sunday";
//         String result = "";

//         switch(day){
//             case "Saturday","Sunday" -> System.out.println("6am");
//             case "Monday" -> System.out.println("8am");
//             default -> System.out.println("7am");
//         }

//     }
// }


// class SwitchExprssn{
//     public static void main(String[] args){
//         String day = "Sunday";
//         String result = "";

//         result = switch(day){
//             case "Saturday","Sunday" -> "6am";
//             case "Monday" -> "8am";
//             default -> "7am";
//         };
//         System.out.println(result);

//     }
// }



//    using switch as an exprssn using yield
class SwitchExprssn{
    public static void main(String[] args){
        String day = "Sunday";
        String result = "";

        result = switch(day){

            case "Saturday","Sunday" : yield  "6am";
            case "Monday" : yield "8am";
            default : yield "7am";
        };
        System.out.println(result);

    }
}
