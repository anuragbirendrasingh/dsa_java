package BackTracking;
//print all the possible cuts of the String
public class String_Partioning {
    public static void main(String[] args) {
        String ques = "nitin";
        Print(ques,"");
    }

    public static void Print(String ques,String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }

        for(int cut=1; cut<=ques.length();cut++){
            String s1 = ques.substring(0, cut);//left //ans
            String s2 = ques.substring(cut);  //right // que
            Print(s2, ans + s1 + "|");
        }
    }
}
