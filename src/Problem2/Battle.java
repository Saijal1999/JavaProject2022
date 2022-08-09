package Problem2;

import java.util.ArrayList;
public class Battle implements BasicRulesAndSpecialRules {
    int TotalAutobots = 0;
    int TotalDeception = 0;

    public void theSurvivingMembers(ArrayList<Deception> D, ArrayList<Autobots> A) {

        ArrayList<TheTransformationCompany> SkippedMembers = new ArrayList<>();

        while (A.size() > D.size()) {
            if (TotalAutobots<TotalDeception){
            SkippedMembers.add(A.get(A.size() - 1));}
            A.remove(A.size() - 1);
        }
        while (A.size() < D.size()) {
            if (TotalAutobots>TotalDeception){
            SkippedMembers.add(D.get(D.size() - 1));}
            D.remove(D.size() - 1);
        }

        for (TheTransformationCompany i : SkippedMembers) {
            System.out.println(i.getName());
        }
    }
    static ArrayList<TheTransformationCompany> AutobotsWinners=new ArrayList<>();
    static ArrayList<TheTransformationCompany> DeceptionWinners=new ArrayList<>();


   /*Explanation: Comparison of courage and Strength method compares the courage and Strength attribute  of both Autobots and Deception List.
    Based on the comparison, if the Autobot member is winner, it is added to the list of AutobotsWinners and the specific transformer is removed from
    original List. Similarly, if Deception member is winner, it is added to the List of DeceptionWinner and the specific transformer is removed from
    original List. It also keeps the record of number of battles amongst each transformer. Therefore, it returns the count of battles.
    */


    @Override
    public void comparisonOfCourageAndStrength(ArrayList<Deception> D, ArrayList<Autobots> A) {
        int Battle = 0;

        for (int i = 0; i < Math.min(A.size(),D.size()); i++) {
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

    /*Explanation: Comparison of skill method compares the skill attribute  of both Autobots and Deception List.
   Based on the comparison, if the Autobot member is winner, it is added to the list of AutobotsWinners and the specific transformer is removed from
   original List. Similarly, if Deception member is winner, it is added to the List of DeceptionWinner and the specific transformer is removed from
   original List.*/

    @Override
    public void comparisonOfSkill(ArrayList<Deception> D, ArrayList<Autobots> A) {
        for (int i = 0; i <Math.min(A.size(),D.size()); i++) {
            if (A.get(i).getSkill() - D.get(i).getSkill() >= 3) {
                AutobotsWinners.add(A.get(i));
                D.remove(i); A.remove(i);
            } else if (D.get(i).getSkill() - A.get(i).getSkill() >= 3) {
                DeceptionWinners.add(D.get(i));
                D.remove(i); A.remove(i);
            }
        }
    }


/*Explanation: This method compares the overallRating attribute of each transformer of both Autobots and Deception.Based on the comparison, if the Autobot member has higher rating, it is added to the list of AutobotsWinners and the specific transformer is removed from
original List. Similarly, if Deception member has higher rating, it is added to the List of DeceptionWinner and the specific transformer is removed from
original List.*/

    @Override
    public void overallRating(ArrayList<Deception> D, ArrayList<Autobots> A) {
        for (int i = 0; i < Math.min(A.size(),D.size()); i++) {
            if (D.get(i).getOverallRating() > A.get(i).getOverallRating()) {
                DeceptionWinners.add(D.get(i));
                D.remove(i); A.remove(i);
            } else if (D.get(i).getOverallRating() < A.get(i).getOverallRating()) {
                AutobotsWinners.add(A.get(i));
                D.remove(i); A.remove(i);
            } else if (D.get(i).getOverallRating()==A.get(i).getOverallRating()){
                System.out.println("[Overall] Draw");
                D.remove(i);
                A.remove(i);

            }
        }
    }


    /*Explanation: This method is used to maintain the count of autobots winners and deception winners.
    After comparing the counts of each transformer, it helps to determine the winning team and
    displays the name of the members of winning Team*/
    @Override
    public void highestOverallRating(ArrayList<TheTransformationCompany> D, ArrayList<TheTransformationCompany> A) {

        for (int i = 0; i < A.size(); i++) {
            TotalAutobots++;
        }
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
        if (TotalDeception==TotalAutobots){
            System.out.println("Draw");
        }
    }

    @Override
    public void checkingSpecialNames(ArrayList<Deception> D, ArrayList<Autobots> A) {
        for(int i =0;i<Math.min(A.size(),D.size());i++) {
            if (A.get(i).getName().equals("Optimus Prime") && D.get(i).getName().equals("Predaking")) {
                AutobotsWinners = new ArrayList<>();
                DeceptionWinners = new ArrayList<>();
                System.out.println("Draw");
            }
            if (A.get(i).getName() == "Optimus Prime"){
                AutobotsWinners.add(A.get(i));
            }
            if (D.get(i).getName() == "Predaking") {
                DeceptionWinners.add(A.get(i));
            }
        }


    }



}
