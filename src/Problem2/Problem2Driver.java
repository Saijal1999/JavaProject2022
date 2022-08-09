package Problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import static Problem2.Battle.AutobotsWinners;
import static Problem2.Battle.DeceptionWinners;

public class Problem2Driver{
    public static void main(String[] args) {

        // [Sample Instance 1  of Deception]
        ArrayList<Deception> DeceptionList1 = new ArrayList<>();
        Deception d1 = new Deception("Abominus", "D", 10, 1, 3, 10, 5, 10, 8, 4);
        Deception d2 = new Deception("Apeface", "D", 10, 9, 9, 8, 6, 7, 7, 7);
        Deception d3 = new Deception("Astrotrain", "D", 9, 7, 10, 7, 6, 7, 6, 8);
        Deception d4 = new Deception("Blot", "D", 9, 2, 2, 10, 4, 10, 6, 5);

        DeceptionList1.add(d1);
        DeceptionList1.add(d2);
        DeceptionList1.add(d3);
        DeceptionList1.add(d4);

        //[Sample Instance 1 of Autobots]
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
        Battle S = new Battle();
        S.checkingSpecialNames(DeceptionList1, AutobotsList1);
        S.comparisonOfCourageAndStrength(DeceptionList1, AutobotsList1);
        S.comparisonOfSkill(DeceptionList1, AutobotsList1);
        S.overallRating(DeceptionList1, AutobotsList1);
        S.highestOverallRating(DeceptionWinners, AutobotsWinners);
        System.out.println("The surviving Members of the losing Team: ");
        S.theSurvivingMembers(DeceptionList1,AutobotsList1);
        System.out.println("\n");


        DeceptionWinners = new ArrayList<>();
        AutobotsWinners = new ArrayList<>();

        //[Sample Instance 2 Of Deception]

        ArrayList<Deception> DeceptionList2 = new ArrayList<>();
        Deception q1= new Deception("Soundwave","D",8,9,2,6,7,5,6,10);
        Deception q2= new Deception("Cliffjumper","D",8,9,2,6,7,5,6,10);


        DeceptionList2.add(q1);
        DeceptionList2.add(q2);

        //[Sample Instance 2 Of Autobots]

        ArrayList<Autobots> AutobotsList2 = new ArrayList<>();

        Autobots w1 = new Autobots("Bluestreak","A",6,6,7,9,5,2,9,7);
        Autobots w2 = new Autobots("Hubcap","A",4,4,4,4,4,4,4,4);


        AutobotsList2.add(w1);
        AutobotsList2.add(w2);


        // Both the lists are being sorted on the basis of the ranks of each transformer.

        Comparator<Autobots> CompareByRank2=Comparator.comparing(i->i.getRank() * -1);
        Comparator<Deception> RankComparison2= Comparator.comparing(i->i.getRank() * -1);
        Collections.sort(AutobotsList2,CompareByRank2);
        Collections.sort(DeceptionList2,RankComparison2);


        System.out.println("===================Second Battle==================");
        Battle I = new Battle();
        I.checkingSpecialNames(DeceptionList2,AutobotsList2);
        I.comparisonOfCourageAndStrength(DeceptionList2, AutobotsList2);
        I.comparisonOfSkill(DeceptionList2, AutobotsList2);
        I.overallRating(DeceptionList2, AutobotsList2);
        I.highestOverallRating(DeceptionWinners, AutobotsWinners);
        System.out.println("The surviving Members of the losing Team: ");
        I.theSurvivingMembers(DeceptionList1,AutobotsList1);
        System.out.println("\n");
        DeceptionWinners = new ArrayList<>();
        AutobotsWinners = new ArrayList<>();


        //[Sample Instance 3 Of Deception]

        ArrayList<Deception> DeceptionList3 = new ArrayList<>();
        Deception r1= new Deception("Soundwave","D",8,9,2,6,7,5,6,10);
        Deception r2= new Deception("Cliffjumper","D",8,9,3,5,3,4,8,10);

        DeceptionList3.add(r1);
        DeceptionList3.add(r2);

        //[Sample Instance 3 Of Autobots]

        ArrayList<Autobots> AutobotsList3 = new ArrayList<>();

        Autobots z1 = new Autobots("Bluestreak","A",6,6,7,9,5,2,9,7);
        AutobotsList3.add(z1);



        // Both the lists are being sorted on the basis of the ranks of each transformer.

        Comparator<Autobots> CompareByRank3=Comparator.comparing(i->i.getRank() * -1);
        Comparator<Deception> RankComparison3= Comparator.comparing(i->i.getRank() * -1);
        Collections.sort(AutobotsList3,CompareByRank3);
        Collections.sort(DeceptionList3,RankComparison3);

        System.out.println("===================Third Battle==================");
        Battle O = new Battle();
        O.checkingSpecialNames(DeceptionList3,AutobotsList3);
        O.comparisonOfCourageAndStrength(DeceptionList3, AutobotsList3);
        O.comparisonOfSkill(DeceptionList3, AutobotsList3);
        O.overallRating(DeceptionList3, AutobotsList3);
        O.highestOverallRating(DeceptionWinners, AutobotsWinners);
        System.out.println("The surviving Members of the losing Team: ");
        O.theSurvivingMembers(DeceptionList1,AutobotsList1);
        System.out.println("\n");
        DeceptionWinners = new ArrayList<>();
        AutobotsWinners = new ArrayList<>();


        //[Sample Instance 4 Of Deception]

        ArrayList<Deception> DeceptionList4 = new ArrayList<>();
        Deception g1= new Deception("Soundwave","D",8,9,2,6,7,5,6,10);
        Deception g2= new Deception("Predaking","D",8,9,3,5,3,4,8,10);

        DeceptionList3.add(g1);
        DeceptionList3.add(g2);

        //[Sample Instance 4 Of Autobots]

        ArrayList<Autobots> AutobotsList4 = new ArrayList<>();

        Autobots g3 = new Autobots("Optimus Prime","A",6,6,7,9,5,2,9,7);
        AutobotsList3.add(g3);



        // Both the lists are being sorted on the basis of the ranks of each transformer.

        Comparator<Autobots> CompareByRank4=Comparator.comparing(i->i.getRank() * -1);
        Comparator<Deception> RankComparison4= Comparator.comparing(i->i.getRank() * -1);
        Collections.sort(AutobotsList3,CompareByRank3);
        Collections.sort(DeceptionList3,RankComparison3);

        System.out.println("===================Fourth Battle==================");
        Battle g = new Battle();
        g.checkingSpecialNames(DeceptionList4,AutobotsList4);
        g.comparisonOfCourageAndStrength(DeceptionList4, AutobotsList4);
        g.comparisonOfSkill(DeceptionList4, AutobotsList4);
        g.overallRating(DeceptionList4, AutobotsList4);
        g.highestOverallRating(DeceptionWinners, AutobotsWinners);
        System.out.println("The surviving Members of the losing Team: ");
        g.theSurvivingMembers(DeceptionList4,AutobotsList4);
        System.out.println("\n");

        //Error Handling!!
        File input= new File("transformers.txt");
        try{
            Scanner in=new Scanner(input);
        } catch (FileNotFoundException e){
            System.out.println("The File does not exist");
            return;
        }









    }

}

