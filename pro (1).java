package com.startfirst;

import com.packclass.bike;
import com.packclass.car;
import com.packclass.multiaxle;
import com.packclass.personaldetails;
//imported the classes form different package
import java.io.*;
import java.util.*;
//input output
//

import static packA.ticketfaircalculator.calculate;
//interface of the calculator

class Dijkstras_Shortest_Path1 {
    public int[] distances;
    public Set<Integer> settled;
    public Set<Integer> unsettled;
    public int number_of_nodes;
    public int adjacencyMatrix[][];

    public Dijkstras_Shortest_Path1(int number_of_nodes) {
        this.number_of_nodes = number_of_nodes;
        distances = new int[number_of_nodes + 1];
        settled = new HashSet<Integer>();
        unsettled = new HashSet<Integer>();
        adjacencyMatrix = new int[number_of_nodes + 1][number_of_nodes + 1];
    }

    public void dijkstra_algorithm(int adjacency_matrix[][], int source) {
        int evaluationNode;
        for (int i = 1; i <= number_of_nodes; i++)
            for (int j = 1; j <= number_of_nodes; j++)
                adjacencyMatrix[i][j] = adjacency_matrix[i][j];

        for (int i = 1; i <= number_of_nodes; i++) {
            distances[i] = Integer.MAX_VALUE;
        }

        unsettled.add(source);
        distances[source] = 0;
        while (!unsettled.isEmpty()) {
            evaluationNode = getNodeWithMinimumDistanceFromUnsettled();
            unsettled.remove(evaluationNode);
            settled.add(evaluationNode);
            evaluateNeighbours(evaluationNode);
        }
    }

    public int[][] read(int N,String filename) throws Exception {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        int rows = N;
        int columns = N;
        int[][] myArray = new int[rows][columns];
        while (sc.hasNextLine()) {
            for (int i = 0; i < myArray.length; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    myArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        int adjacency_matrix1[][];

        adjacency_matrix1 = new int[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                adjacency_matrix1[i + 1][j + 1] = myArray[i][j];
                if (i + 1 == j + 1) {
                    adjacency_matrix1[i][j] = 0;
                    continue;
                }
                if (myArray[i][j] == 0) {
                    adjacency_matrix1[i + 1][j + 1] = Integer.MAX_VALUE;
                }
            }
        }

        return adjacency_matrix1;
}


    private int getNodeWithMinimumDistanceFromUnsettled() {
        int min;
        int node = 0;

        Iterator<Integer> iterator = unsettled.iterator();
        node = iterator.next();
        min = distances[node];
        for (int i = 1; i <= distances.length; i++) {
            if (unsettled.contains(i)) {
                if (distances[i] <= min) {
                    min = distances[i];
                    node = i;
                }
            }
        }
        return node;
    }

    private void evaluateNeighbours(int evaluationNode) {
        int edgeDistance = -1;
        int newDistance = -1;

        for (int destinationNode = 1; destinationNode <= number_of_nodes; destinationNode++) {
            if (!settled.contains(destinationNode)) {
                if (adjacencyMatrix[evaluationNode][destinationNode] != Integer.MAX_VALUE) {
                    edgeDistance = adjacencyMatrix[evaluationNode][destinationNode];
                    newDistance = distances[evaluationNode] + edgeDistance;
                    if (newDistance < distances[destinationNode]) {
                        distances[destinationNode] = newDistance;
                    }
                    unsettled.add(destinationNode);
                }
            }
        }
    }
}














class Statemodel{

    static ArrayList<String> klist=new ArrayList<String>();
    static ArrayList<String> mlist=new ArrayList<String>();
    static ArrayList<String> mplist=new ArrayList<String>();
    static ArrayList<String> glist=new ArrayList<String>();
    static ArrayList<String> uplist=new ArrayList<String>();

    public void list()
    {
        ArrayList<String> alist=new ArrayList<String>();
        alist.add("Karnataka");
        alist.add("Maharashtra");
        alist.add("Uttar pradesh");
        alist.add("Gujarat");
        alist.add("Madhya Pradesh");

        for(String str:alist)
            System.out.println(str);


    }

    public void Karnatakalist(){

        klist.add("Bengaluru");
        klist.add("Manglore");
        klist.add("Belgaum");
        klist.add("Udupi");
        klist.add("Mysore");
        klist.add("Hasan");

        for(String str:klist)
            System.out.println(str);

    }

    public void Maharashtralist(){

        mlist.add("Mumbai");
        mlist.add("Pune");
        mlist.add("Vasai");
        mlist.add("Dhadar");
        mlist.add("Nagpur");
        mlist.add("Nashik");
        for(String str:mlist)
            System.out.println(str);

    }

    public void Madhyapradeshlist(){

        mplist.add("Bhopal");
        mplist.add("Indore");
        mplist.add("Ujjain");
        mplist.add("Ratlam");
        mplist.add("Gwalior");
        mplist.add("Mandsaur");
        for(String str:mplist)
            System.out.println(str);
    }

    public void Gujaratlist(){

        glist.add("Ahemdabad");
        glist.add("Surat");
        glist.add("Vadodra");
        glist.add("Rann");
        glist.add("Godhra");
        glist.add("Piplod");
        for(String str:glist)
            System.out.println(str);
    }

    public void Uttarpradeshlist(){

        uplist.add("Lucknow");
        uplist.add("Allahabad");
        uplist.add("Varanasi");
        uplist.add("Amethi");
        uplist.add("Gorakhpur");
        uplist.add("Nag");
        for(String str:uplist)
            System.out.println(str);
    }

    }


public class pro extends Statemodel {

    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE VEHICLE BOOKING AREA");

        System.out.println("ENTER YOUR PERSONAL DETAILS : ");
        personaldetails P1 = new personaldetails();
        P1.getpersonaldetails();

        System.out.println("ENTER YOUR VEHICLE DETAILS : ");
        System.out.println("SELECT THE TYPE OF VEHICLE" +
                "\n1.PERSONAL" +
                "\n2.RENTED");

        int vehtype;
        String catstring = "";
        String regnum="";
        vehtype = sc.nextInt();

        switch (vehtype) {
            case 1:
                catstring = "PER";
                break;
            case 2:
                catstring = "REN";
                break;
            default:
                System.out.println("BY DEFAULT SELECTED AS PERSONAL");


        }

        System.out.println("ENTER FOR THE TYPE OF VEHICLE : " +
                "\n 1. Bike" +
                "\n 2. Car" +
                "\n 3. Multiexle Vehicle");

        int choiceveh;
        choiceveh = sc.nextInt();
        int flag = 0;
        bike B1;
        car C1;
        multiaxle M1;
        String wheelz;
        String vtype="";
        String rnumm="";
        String mnum="";

        switch (choiceveh) {
            case 1:
                flag = 1;
                wheelz="bike";
                B1 = new bike();
                B1.getvehicledetails();
                B1.settype(catstring);
                regnum=B1.getreg();
                vtype="Bike";
                mnum= B1.getmnum();
                try{
                    FileOutputStream f = new FileOutputStream(new File("vehdetails.txt"));
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(B1);
                    o.close();

                    
                }
                catch (FileNotFoundException e) {
                    System.out.println("File not Found");
                }catch (IOException e){
                    System.out.println("Error initialization stream");

                }


                break;
            case 2:
                flag = 1;
                wheelz="car";
                C1 = new car();
                C1.getvehicledetails();
                C1.settype(catstring);
                regnum= C1.getreg();
                mnum= C1.getmnum();
                vtype="Car";
                try{
                    FileOutputStream f = new FileOutputStream(new File("vehdetails.txt"));
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(C1);
                    o.close();


                }
                catch (FileNotFoundException e) {
                    System.out.println("File not Found");
                }catch (IOException e){
                    System.out.println("Error initialization stream");

                }

                break;
            case 3:
                flag = 1;
                wheelz="multi";
                M1 = new multiaxle();
                M1.getvehicledetails();
                M1.settype(catstring);
                regnum= M1.getreg();
                mnum= M1.getmnum();
                vtype="Multiaxle";
                try{
                    FileOutputStream f = new FileOutputStream(new File("vehdetails.txt"));
                    ObjectOutputStream o = new ObjectOutputStream(f);
                    o.writeObject(M1);
                    o.close();


                }
                catch (FileNotFoundException e) {
                    System.out.println("File not Found");
                }catch (IOException e){
                    System.out.println("Error initialization stream");

                }

                break;
            default:
                System.out.println("ENTER RIGHT CHOICE ");


        }


           Statemodel state= new Statemodel();
//
//        sc.close();
//        Scanner scan=new Scanner(System.in);
          state.list();
          //State list


        System.out.println("Enter the state where you want to travel");

        String statedec = sc.next();

        String buf=".txt";

        String statefile=statedec.concat(buf);
        System.out.println(statefile);

        System.out.println("WELCOME TO "+statedec+" ROADWAYS");
        System.out.println("SELECT THE CITY YOU WANT TO TRAVEL ENJOY THE TRIP ");


        switch (statedec){

            case "Uttar Pradesh":
                state.Uttarpradeshlist();
                break;
            case "Gujarat":
                state.Gujaratlist();
                break;
            case "Maharashtra":
                state.Maharashtralist();
                break;
            case "Karnataka":
                state.Karnatakalist();
                break;
            case "Madhya Pradesh":
                state.Madhyapradeshlist();
                break;
            default:
                System.out.println("bye");
        }



        String sourcecity="";
        String destinationcity="";
        String st="";
        int source = 0, destination = 0;
        int km=0;

        int adjacency_matrix[][];

        Scanner scan = new Scanner(System.in);
        try{

            Dijkstras_Shortest_Path1 dijkstrasAlgorithm = new Dijkstras_Shortest_Path1(6);

            adjacency_matrix = dijkstrasAlgorithm.read(6,statefile);

            System.out.println("Enter the source city ");
            source = scan.nextInt();

            System.out.println("Enter the destination city ");
            destination = scan.nextInt();

            switch (statedec) {

                case "Uttar Pradesh":
                    sourcecity = uplist.get(source - 1);
                    destinationcity = uplist.get(destination - 1);
                    st = "UP";
                    break;
                case "Gujarat":
                    sourcecity = glist.get(source - 1);
                    destinationcity = glist.get(destination - 1);
                    st = "GJ";
                    break;
                case "Maharashtra":
                    sourcecity = mlist.get(source - 1);
                    destinationcity = mlist.get(destination - 1);
                    st = "MH";
                    break;

                case "Karnataka":
                    sourcecity = klist.get(source - 1);
                    destinationcity = klist.get(destination - 1);
                    st = "KA";
                    break;
                case "Madhya Pradesh":
                    sourcecity = mplist.get(source - 1);
                    destinationcity = mplist.get(destination - 1);
                    st = "MP";
                    break;
                default:
                    System.out.println("bye");
            }


            dijkstrasAlgorithm.dijkstra_algorithm(adjacency_matrix, source);
            System.out.println("The Shorted Path from " + sourcecity + " to " + destinationcity + " is: ");
            for (int i = 1; i <= dijkstrasAlgorithm.distances.length - 1; i++)
            {
                if (i == destination) {
                    System.out.println(sourcecity + " to " + destinationcity + " is "
                            + dijkstrasAlgorithm.distances[i]);
                    km = dijkstrasAlgorithm.distances[i];
                }

            }
            } catch (InputMismatchException inputMismatch)
            {
                System.out.println("Wrong Input Format");
            }
            scan.close();

            String regnum1=regnum.substring(0,2);
            String travel="";

            if(regnum1.equals(st)){
                travel="Intra";

            }
            else
                travel="Inter";

        System.out.println("v"+travel);

            double fare=calculate(km,travel);
            double tax=0;

            







        System.out.println("DETAILS OF THE TRAVELLER ");
        P1.showpersonaldetails();
        System.out.println("DETAILS OF THE VEHICLE ");
        System.out.println("THE VEHICLE DETAILS ARE ");
        System.out.println("REGISTRATION NO : "+regnum);
        System.out.println("MODEL NAME : "+mnum);
        System.out.println("VEHICLE TYPE : "+vtype);

        if(catstring=="REN"){
            System.out.println("Your vehicle is rented so you will be charged extra amount");
            tax=2000;
        }
        else {
            System.out.println("YOUR vehicle is personal so you wont be charged extra");
        }

         fare=fare+tax;









            System.out.println("Your net fair to be paid is "+fare);



//        Listing l= new Listing();













    }
}







