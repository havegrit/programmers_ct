package com.ll.level0.P120822;

public class Main {
    public static void main(String[] args) {

    }
}
class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length()-1; i >= 0; i--) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}