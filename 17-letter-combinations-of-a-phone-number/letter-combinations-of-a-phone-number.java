class Solution {
    public static List<String> letterCombinations(String digits) {
    List<String> answer = new ArrayList<>();
    String[][] myStrings = {
    {"a", "b", "c"},        // 2
    {"d", "e", "f"},        // 3
    {"g", "h", "i"},        // 4
    {"j", "k", "l"},        // 5
    {"m", "n", "o"},        // 6
    {"p", "q", "r", "s"},   // 7
    {"t", "u", "v"},        // 8
    {"w", "x", "y", "z"}    // 9
};
    List<List<String>> lists = new ArrayList<>();
    for (int i = 0; i < digits.length(); i++) {
        int num = Character.getNumericValue(digits.charAt(i));
        System.out.println(myStrings[num-2]);
        lists.add(Arrays.asList(myStrings[num-2]));
    }
    generatePermutations(lists,answer,0,"");        
    return answer;
    }
static void generatePermutations(List<List<String>> lists, List<String> result, int depth, String current) {
    if (depth == lists.size()) {
        result.add(current);
        return;
    }

    for (int i = 0; i < lists.get(depth).size(); i++) {
        generatePermutations(lists, result, depth + 1, current + lists.get(depth).get(i));
    }
}
}