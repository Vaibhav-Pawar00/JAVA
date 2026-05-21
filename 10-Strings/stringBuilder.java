public class stringBuilder {

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
        
    }

    public static String stringCompression(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static String stringBuilderCompress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count=1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;             
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){

        /*
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
        */

        /* // Converting first letter of each word 
        String str = "hi, i am vaibhav pawar";
        System.out.println(toUpperCase(str));
        */

        String str = "aaabbcccdd";
        // System.out.println(stringCompression(str));
        System.out.println(stringBuilderCompress(str));
    }
}
