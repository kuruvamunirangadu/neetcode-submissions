class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> a=new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String b=new String(c);
            a.putIfAbsent(b,new ArrayList<>());
            a.get(b).add(s);
        }
        return new ArrayList<>(a.values());
    }
}
