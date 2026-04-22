class Solution {
    List<List<Integer>> rs = new ArrayList<>();

    public void dfs(int[] nums, int index, List<Integer> path) {
        rs.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates at the same tree level
           if (i > index && nums[i] == nums[i - 1]) continue;

            path.add(nums[i]);
            dfs(nums, i + 1, path);
            path.remove(path.size() - 1); // backtrack
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort to bring duplicates together
        dfs(nums, 0, new ArrayList<>());
        return rs;
    }
}
