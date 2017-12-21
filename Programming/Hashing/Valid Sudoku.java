public class Solution {
	public int isValidSudoku(final List<String> a) {
	    // hash maps for coloum 
	    HashMap<Integer, Set<Character>> row = new HashMap<Integer, Set<Character>>();
	    // hash map for row
	    HashMap<Integer, Set<Character>> col = new HashMap<Integer, Set<Character>>();
	    // for loop for 9*9 matrix rows
	    for(int i = 0; i < 3; i++){
	        // for loop for 9*9 matrix coloumns
	        for(int j = 0; j < 3; j++){
	            Set<Character> set = new HashSet<Character>();
	            for(int m = 0; m < 3; m++){
	                for(int n = 0; n < 3; n++){
	                    // row number
	                    int r = 3 * j + n;
	                    // coloumn number
	                    int c = 3 * i + m;
	                    // charcter at that location
	                    char x = a.get(r).charAt(c);
	                    if(x == '.')continue;
	                    // check if row set already exists in hashmap if not add
	                    if(!col.containsKey(c)){
	                        col.put(c, new HashSet<>());
	                    }
	                    // check is coloumn set already exists in hashmap if not add
	                    if(!row.containsKey(r)){
	                        row.put(r, new HashSet<>());
	                    }
	                    // check if the number already exists in col or row or in 9*9 matrix
	                    if(set.contains(x) || row.get(r).contains(x) || col.get(c).contains(x)){
	                        return 0;
	                    }else{
	                        set.add(x);
	                        row.get(r).add(x);
	                        col.get(c).add(x);
	                    }
	                }
	            }
	        }
	    
	    }
	    return 1;
	}
}
