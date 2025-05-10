import java.util.*;
class ActivitySelection{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //yaha pee sumjo sort nhi hua rehta tha toh kese karte the okk
        int activity[][] = new int[start.length][3];

        for(int i=0; i< start.length; i++){
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        // lamda function -> Short form 

        Arrays.sort(activity , Comparator.comparingDouble(o -> o[2]));
        //ending time kee basis pee sort kardo vala thing okk 
    //end time basis mein sort hua hee

        int maxAct = 0;  //it will act like count variable here

        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity perform karni he hai 
        maxAct = 1;
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];

        for(int i=1; i< end.length; i++){
            //activity selection step 
            if(activity[i][1]>= lastEnd){
              maxAct++;
              ans.add(activity[i][0]);
              lastEnd = activity[i][2];  
            }

        }

        System.out.println("The maxActivity are" + " " + maxAct);

        //Now printing the ans arrayList

        for(int i =0; i< ans.size(); i++){
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();



    }
}