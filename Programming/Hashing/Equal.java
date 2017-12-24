        // ARRAYLIST OF SOLUTIONS
        ArrayList<ArrayList<Integer>> solutions = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                int sum = a.get(i) + a.get(j);
                // IF CONTAINS WE WILL ADD IT TO LIST
                if (hash.containsKey(sum)) {
                    int x = hash.get(sum) / a.size();
                    int y = hash.get(sum) % a.size();
                    if (x < i && y != j && y != i) {
                        ArrayList<Integer> indices = new ArrayList<>();
                        indices.add(x);
                        indices.add(y);
                        indices.add(i);
                        indices.add(j);
                        solutions.add(indices);
                    }
                }
                // ELSE WE ADD IT TO HASH MAP
                else {
                    hash.put(sum, i * a.size() + j);
                }
            }
        }
        // IF LIST IS EMPTY THEN WE RETURN EMPTY LIST
        if(solutions.size() == 0){return new ArrayList<>();}
        // ELSE WE SORT THEM IN LEXICOGRAPHICALLYD USING COMPARATOR CLASS
        Collections.sort(solutions, new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> s1, ArrayList<Integer> s2){
                if(s1.get(0) != s2.get(0)){
                    return s1.get(0).compareTo(s2.get(0));
                }
                else if(s1.get(1) != s2.get(1)){
                    return s1.get(1).compareTo(s2.get(1));
                }
                else if(s1.get(2) != s2.get(2)){
                    return s1.get(2).compareTo(s2.get(2));
                }
                else{
                    return s1.get(3).compareTo(s2.get(3));
                }
            }
        });
        //RETURN THE FIRST LIST
        return solutions.get(0);
    }
}
