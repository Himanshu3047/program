
// Online IDE - Code Editor, Compiler, Interpreter

public class Main
{
    public static void main(String[] args) {
        String str="Nit Raipur";
        int i=0,j=str.length()-1;
        boolean ans=true;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                ans=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
