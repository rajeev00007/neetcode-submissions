
class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(int i = 0; i < strs.size();i++){
            String current = strs.get(i);
            int length =  current.length();
            res = res + length + "#" + current;
        }
        return res;

    }

    public List<String> decode(String str) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        for(i = 0; i < str.length();){
             int delimiter = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i, delimiter));
        int start = delimiter + 1;
        int end = start + length;
        String ans = str.substring(start,end);
        result.add(ans);
        i = end;
        }
        return result;
    }
}
