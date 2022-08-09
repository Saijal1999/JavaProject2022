package Problem1;

import java.util.ArrayList;

public  class Castles implements peaksAndValleys{


    /*Assumptions:
 Assumption1: if the List contains only one element,
                 it is assumed that number of castles on peaks and valleys will be 1 in this case.
 Assumption2: In the case of castles on Peaks, if the first element in the arraylist is bigger than the second element, it is equivalent
                  to the construction of one castle. Similarly, if the last element of the list is bigger than the second last element, it is also
                 equivalent to the construction of one castle.
 Assumption3: In the case of castles on valleys, if the first element in the arraylist is smaller than the second element, it is equivalent
                 to the construction of one castle. Similarly, if the last element of the list is smaller  than the second last element, it is also
                  equivalent to the construction of one castle.
   */

   private int count;

    public Castles(int count) {
        this.count = count;

}

public ArrayList<Integer> removeDuplication(ArrayList<Integer> A) {
        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i : A) {
            if (newlist.size() == 0) {
                newlist.add(i);
            } else if (newlist.get(newlist.size() - 1) != i) {
                newlist.add(i);
            }
        }
        return newlist;
    }

    @Override
    public int getNumberOfPeaks(ArrayList<Integer> newlist) {
        int count = 0;
        for (int i = 0; i < newlist.size(); i++) {
            if (newlist.size() == 1) {
                count++;
            } else if (i == 0 && newlist.get(i) > newlist.get(i + 1)) {
                count++;
            } else if
            (i > 0 && i < newlist.size() - 1 && newlist.get(i - 1) < newlist.get(i) && newlist.get(i) > newlist.get(i + 1)) {
                count++;
            } else if (i == newlist.size() - 1 && newlist.get(i) > newlist.get(i - 1)) {
                count++;
            } else
                count = count + 0;

        }


        return count;
    }

    @Override
    public int getNumberOfValleys(ArrayList<Integer> newlist) {
        int count = 0;
        for (int i = 0; i < newlist.size(); i++) {
            if (newlist.size() == 1) {
                count++;
            } else if (i == 0 && newlist.get(i) < newlist.get(i + 1)) {
                count++;
            } else if ((i > 0 && i < newlist.size() - 1) && newlist.get(i) < newlist.get(i + 1) && newlist.get(i) <
                    newlist.get(i - 1)) {
                count++;
            } else if (i == newlist.size() - 1 && newlist.get(i) < newlist.get(i - 1)) {
                count++;

            }
        }
        return count;
    }
}
