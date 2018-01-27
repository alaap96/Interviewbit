public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K){
        Collections.sort(arrive);
        Collections.sort(depart);
        int size = depart.size();
        int present = 0;
        int arriving = 0;
        int departing = 0;
        // Idea is to sort and compare first number of both lists and for smaller number
        // event is done first and if at any time number of people present in hotel 
        // greater than K then return false else after loop return true
        while(arriving < arrive.size() && departing < depart.size()){
            if(arrive.get(arriving) < depart.get(departing)){
                present++;
                arriving++;
            }
            else{
                present--;
                departing++;
            }
            if(present > K){
                return false;
            }
        }
        return true;
    }
}
