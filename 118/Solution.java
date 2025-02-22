import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> lst = new ArrayList<>();
        {
            ArrayList<Integer> aux = new ArrayList<Integer>();
            aux.add(1);
            lst.add(aux);
        }
        if (numRows > 1) {
            ArrayList<Integer> aux = new ArrayList<Integer>();
            aux.add(1);
            aux.add(1);
            lst.add(aux);
        }
        for (int i = 2; i < numRows; i++) {
            ArrayList<Integer> aux = new ArrayList<Integer>();
            aux.add(1);
            List<Integer> last = lst.get(i - 1);

            for(int j = 0; j < last.size() - 1; j++)
                aux.add(last.get(j) + last.get(j+1));

            lst.add(aux);
            aux.add(1);

        }
        return lst;
    }
}