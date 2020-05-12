/*
Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.

Input: "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  
The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
*/

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> adj = new Stack<Character>();
        int i;
        String res="",finres="";
        for(i=0;i<S.length();i++){
            if(adj.empty()){
                adj.push(S.charAt(i));
            }
            else if(adj.peek()==S.charAt(i)){
                adj.pop();
            }
            else{
                adj.push(S.charAt(i));
            }
        }
        while(!adj.empty()){
            res += adj.pop();
        }
        for(i=res.length()-1;i>=0;i--){
            finres+=res.charAt(i);
        }
        return finres;
    }
}
