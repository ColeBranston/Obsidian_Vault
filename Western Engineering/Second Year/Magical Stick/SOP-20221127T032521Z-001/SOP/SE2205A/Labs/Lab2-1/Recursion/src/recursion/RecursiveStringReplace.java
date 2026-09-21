package recursion;
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to) {
        String result = null;
        if (s.length() == 0) {
            result = "";
        }
        else if (s.length() == 1) {
            char first = s.charAt(0);
            if(first == from) {
                result = String.valueOf(to);
            }
            else {
                result = String.valueOf(first);
            }
        }
        else {  
            char first = s.charAt(0);
            String rest = s.substring(1);
            if (first == from) {
                result = String.valueOf(to) + replace(rest, from, to);
            } 
            else {
                result = String.valueOf(first) + replace(rest, from, to);
            }
        }
        return result;
    }


}
