package Problem2;

import com.sun.source.tree.WhileLoopTree;

import java.nio.channels.NonWritableChannelException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem2Driver implements TransformationCompanyInterface{

//The winning Team method is used to compare the sorted Autobots and Deception List. This method helps to
//    //compare the sizes of both of sorted lists and equalizes the lists by eliminating the last element.
        public void theSurvivingMembers(ArrayList<Deception> D, ArrayList<Autobots> A) {
            ArrayList<TheTransformationCompany> Skippedmembers = new ArrayList<>();
            while (A.size() > D.size()) {
                Skippedmembers.add(A.get(A.size() - 1));
                A.remove(A.size() - 1);
            }
            while (A.size() < D.size()) {
                Skippedmembers.add(D.get(D.size() - 1));
                D.remove(D.size() - 1);
            }
            for (TheTransformationCompany i : Skippedmembers) {
                System.out.println(i.getName());
            }
        }

    static ArrayList<TheTransformationCompany> AutobotsWinners=new ArrayList<>();
    static ArrayList<TheTransformationCompany> DeceptionWinners=new ArrayList<>();


    //Explanation: Comparison of courage and Strength method compares the courage and Strength attribute  of both Autobots and Deception List.
    //Based on the comparison, if the Autobot member is winner, it is added to the list of AutobotsWinners and the specific transformer is removed from
    // original List. Similarly, if Deception member is winner, it is added to the List of DeceptionWinner and the specific transformer is removed from
      // original List

    //It also keeps the record of number of battles amongst each transformer. Therefore, it returns the count of battles.


    @Override
    public void comparisonOfCourageAndStrength(ArrayList<Deception> D, ArrayList<Autobots> A) {
        int Battle = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i).getCourage() - D.get(i).getCourage() >= 4 && A.get(i).getStrength() - D.get(i).getStrength() >= 3) {
                AutobotsWinners.add(A.get(i));
                A.remove(i);
                D.remove(i);
            } else if (D.get(i).getCourage() - A.get(i).getCourage() >= 4 && D.get(i).getStrength() - A.get(i).getStrength() >= 3) {
                DeceptionWinners.add(D.get(i));
                D.remove(i); A.remove(i);
            }
            Battle++;
        }

        System.out.println("Number of Battles: " + Battle);
    }



    //Explanation: Comparison of skill method compares the skill attribute  of both Autobots and Deception List.
    //Based on the comparison, if the Autobot member is winner, it is added to the list of AutobotsWinners and the specific transformer is removed from
    // original List. Similarly, if Deception member is winner, it is added to the List of DeceptionWinner and the specific transformer is removed from
    // original List.
    @Override
    public void comparisonOfSkill(ArrayList<Deception> D, ArrayList<Autobots> A) {
        for (int i = 0; i < A.size(); i++) {
                if (A.get(i).getSkill() - D.get(i).getSkill() >= 3) {
                    AutobotsWinners.add(A.get(i));
                    D.remove(i); A.remove(i);
                } else if (D.get(i).getSkill() - A.get(i).getSkill() >= 3) {
                        DeceptionWinners.add(D.get(i));
                        D.remove(i); A.remove(i);
                    }
                }
        }


//Explanation: This method compares the overallRating attribute of each transformer of both Autobots and Deception.
    //Based on the comparison, if the Autobot member has higher rating, it is added to the list of AutobotsWinners and the specific transformer is removed from
    // original List. Similarly, if Deception member has higher rating, it is added to the List of DeceptionWinner and the specific transformer is removed from
    // original List.

    @Override
        public void overallRating(ArrayList<Deception> D, ArrayList<Autobots> A) {
            for (int i = 0; i < A.size(); i++) {
                    if (D.get(i).getOverallRating() > A.get(i).getOverallRating()) {
                        DeceptionWinners.add(D.get(i));
                        D.remove(i); A.remove(i);
                    } else if (D.get(i).getOverallRating() < A.get(i).getOverallRating()) {
                        AutobotsWinners.add(A.get(i));
                        D.remove(i); A.remove(i);
                    } else if (D.get(i).getOverallRating()==A.get(i).getOverallRating()){
                        D.remove(i);
                        A.remove(i);

                    }
                }
            }


// Explanation: This method is used to maintain the count of autobots winners and deception winners.
// After comparing the counts of each transformer, it helps to determine the winning team.
   @Override
        public void highestOverallRating(ArrayList<TheTransformationCompany> D, ArrayList<TheTransformationCompany> A) {
            int TotalAutobots = 0;
            for (int i = 0; i < A.size(); i++) {
                TotalAutobots++;
            }
            int TotalDeception = 0;
            for (int j = 0; j < D.size(); j++) {
                TotalDeception++;
            }

            if (TotalAutobots>TotalDeception){
                System.out.println("The Winning Teams-(Autobots):");
                for (TheTransformationCompany i:AutobotsWinners){
                    System.out.println(i.getName());}}
            if (TotalAutobots<TotalDeception){
                System.out.println("The Winning Teams-(Deception):");
                for (TheTransformationCompany i:DeceptionWinners){
                    System.out.println(i.getName());}}
        }

    //Surviving Team Assumption:  The surviving team is the one who wins the fights but is the part of losing team.
    // Explanation: The surviving team Method helps to determine the losing team by comparing the count of both Autobots winners
    // and Deception winner and finally prints the name of the members of the losing team.

    public static void main(String[] args) {

                    // [Instances of Deception]
        ArrayList<Deception> DeceptionList1 = new ArrayList<>();
        Deception d1 = new Deception("Abominus", "D", 10, 1, 3, 10, 5, 10, 8, 4);
        Deception d2 = new Deception("Apeface", "D", 10, 9, 9, 8, 6, 7, 7, 7);
        Deception d3 = new Deception("Astrotrain", "D", 9, 7, 10, 7, 6, 7, 6, 8);
        Deception d4 = new Deception("Blot", "D", 9, 2, 2, 10, 4, 10, 6, 5);



        DeceptionList1.add(d1);
        DeceptionList1.add(d2);
        DeceptionList1.add(d3);
        DeceptionList1.add(d4);



//                   [Instances of Autobots]
        ArrayList<Autobots> AutobotsList1 = new ArrayList<>();

        Autobots A1 = new Autobots("Afterburner", "A", 7, 6, 6, 6, 5, 9, 7, 7);
        Autobots A2 = new Autobots("Air Raid", "A", 5, 7, 9, 7, 5, 10, 8, 7);
        Autobots A3 = new Autobots("BlueStreak", "A", 6, 6, 7, 9, 5, 2, 9, 7);

        AutobotsList1.add(A1);
        AutobotsList1.add(A2);
        AutobotsList1.add(A3);

        // Both the lists are being sorted on the basis of the ranks of each transformer.
        Comparator<Autobots> CompareByRank=Comparator.comparing(i->i.getRank() * -1);
        Comparator<Deception> RankComparison= Comparator.comparing(i->i.getRank() * -1);

        Collections.sort(AutobotsList1,CompareByRank);
        Collections.sort(DeceptionList1,RankComparison);
        System.out.println("===================First Battle==================");
        Problem2Driver S = new Problem2Driver();
        S.comparisonOfCourageAndStrength(DeceptionList1, AutobotsList1);
        S.comparisonOfSkill(DeceptionList1, AutobotsList1);
        S.overallRating(DeceptionList1, AutobotsList1);
        S.highestOverallRating(DeceptionWinners, AutobotsWinners);

        System.out.println("The surviving Members of the losing Team: ");
        S.theSurvivingMembers(DeceptionList1,AutobotsList1);
        System.out.println("\n");


        DeceptionWinners = new ArrayList<>();
        AutobotsWinners = new ArrayList<>();
//        DeceptionWinners.removeAll(DeceptionWinners);
//        AutobotsWinners.removeAll(AutobotsWinners);


        ArrayList<Deception> DeceptionList2 = new ArrayList<>();
        Deception q1= new Deception("Soundwave","D",8,9,2,6,7,5,6,10);
        Deception q2= new Deception("Cliffjumper","D",8,9,2,6,7,5,6,10);


        DeceptionList2.add(q1);
        DeceptionList2.add(q2);

        ArrayList<Autobots> AutobotsList2 = new ArrayList<>();

        Autobots w1 = new Autobots("Bluestreak","A",6,6,7,9,5,2,9,7);
        Autobots w2 = new Autobots("Hubcap","A",4,4,4,4,4,4,4,4);


        AutobotsList2.add(w1);
        AutobotsList2.add(w2);


        // Both the lists are being sorted on the basis of the ranks of each transformer.
        Comparator<Autobots> CompareByRank2=Comparator.comparing(i->i.getRank());
        Comparator<Deception> RankComparison2= Comparator.comparing(i->i.getRank());

        Collections.sort(AutobotsList2,CompareByRank2);
        Collections.sort(DeceptionList2,RankComparison2);

        System.out.println("===================Second Battle==================");
        Problem2Driver I = new Problem2Driver();
        I.comparisonOfCourageAndStrength(DeceptionList2, AutobotsList2);
        I.comparisonOfSkill(DeceptionList2, AutobotsList2);
        I.overallRating(DeceptionList2, AutobotsList2);

        I.highestOverallRating(DeceptionWinners, AutobotsWinners);
        I.theSurvivingMembers(DeceptionList2,AutobotsList2);
        System.out.println("\n");

//        DeceptionWinners.clear();
//        AutobotsWinners.clear();
        ArrayList<Deception> DeceptionList3 = new ArrayList<>();
        Deception r1= new Deception("Soundwave","D",8,9,2,6,7,5,6,10);
        Deception r2= new Deception("Cliffjumper","D",8,9,3,5,3,4,8,10);

        ArrayList<Autobots> AutobotsList3 = new ArrayList<>();

        Autobots z1 = new Autobots("Bluestreak","A",6,6,7,9,5,2,9,7);
        // Both the lists are being sorted on the basis of the ranks of each transformer.
        Comparator<Autobots> CompareByRank3=Comparator.comparing(i->i.getRank());
        Comparator<Deception> RankComparison3= Comparator.comparing(i->i.getRank());

        Collections.sort(AutobotsList3,CompareByRank3);
        Collections.sort(DeceptionList3,RankComparison3);
        System.out.println("===================Third Battle==================");
        Problem2Driver O = new Problem2Driver();
        O.comparisonOfCourageAndStrength(DeceptionList3, AutobotsList3);
        O.comparisonOfSkill(DeceptionList3, AutobotsList3);
        O.overallRating(DeceptionList3, AutobotsList3);

        O.highestOverallRating(DeceptionWinners, AutobotsWinners);
        O.theSurvivingMembers(DeceptionList3, AutobotsList3);
        System.out.println("\n");









    }

    }

