package ProjectMain;

import Problem1.Castles;

import java.util.*;

public class ProjectDriver {

    public static void main(String[]args){

        Castles q= new Castles(0);
        System.out.println("***********Sample1 Implementation**********"+"\n");
        ArrayList<Integer> SAMPLE1= new ArrayList<>();
        SAMPLE1.add(2);
        SAMPLE1.add(6);
        SAMPLE1.add(6);
        SAMPLE1.add(6);
        SAMPLE1.add(3);
        System.out.println("ArrayList after removing duplicates: "+q.removeDuplication(SAMPLE1)+"\n");
        System.out.println("Count of Castles on Peaks: "+q.getNumberOfPeaks(q.removeDuplication(SAMPLE1)));
        System.out.println("Count of Castles on Valleys: "+q.getNumberOfValleys(q.removeDuplication(SAMPLE1))+"\n");



        System.out.println("***********Sample2 Implementation**********"+"\n");
        ArrayList<Integer> SAMPLE2= new ArrayList<>();
        SAMPLE2.add(6);
        SAMPLE2.add(1);
        SAMPLE2.add(4);

        System.out.println("ArrayList after removing duplicates: "+q.removeDuplication(SAMPLE2)+"\n");
        System.out.println("Count of Castles on Peaks: "+q.getNumberOfPeaks(q.removeDuplication(SAMPLE2)));
        System.out.println("Count of Castles on Valleys: "+q.getNumberOfValleys(q.removeDuplication(SAMPLE2))+"\n");


        System.out.println("***********Sample3 Implementation**********"+"\n");
        ArrayList<Integer> SAMPLE3= new ArrayList<>();
        SAMPLE3.add(6);


        System.out.println("ArrayList after removing duplicates: "+q.removeDuplication(SAMPLE3)+"\n");
        System.out.println("Count of Castles on Peaks: "+q.getNumberOfPeaks(q.removeDuplication(SAMPLE3)));
        System.out.println("Count of Castles on Valleys: "+q.getNumberOfValleys(q.removeDuplication(SAMPLE3))+"\n");






        ArrayList<Integer> landValues= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the input to build to build an array : ");
        while(in.hasNextInt()){
            landValues.add(in.nextInt());
        }

        Castles s= new Castles(0);

        System.out.printf("Non duplicated array: "+s.removeDuplication(landValues)+"\n");

        System.out.println("Count of Castles on Peaks: " + s.getNumberOfPeaks(s.removeDuplication(landValues)));
        System.out.println("Count of Castles on Vallyes: " +s.getNumberOfValleys(s.removeDuplication(landValues)));
        }



    }





