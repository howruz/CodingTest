class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) == alp.charAt(0)) {
                int a = my_string.charAt(i) - 32;
                char b = (char)a;
                String result = my_string.replace(alp.charAt(0), b);
                answer = result;
                break;
            }
            
            if(i == my_string.length() - 1) {
                answer = my_string;
            }
        }
        
        return answer;
    }
}