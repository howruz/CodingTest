class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i] > height){
                answer = array.length - i;
                break;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}