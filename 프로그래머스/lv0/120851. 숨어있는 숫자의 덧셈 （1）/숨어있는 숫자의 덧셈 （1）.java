class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = new char[my_string.length()];
        arr = my_string.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] - 'A' < 0){
                answer += Integer.parseInt(String.valueOf(arr[i]));
            }
        }
        return answer;
    }
}