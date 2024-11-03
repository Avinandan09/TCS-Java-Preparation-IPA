import java.util.*;
public class IPA51Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Beach[] bch = new Beach[4];
        for (int i=0; i<bch.length; i++){
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            int rating = sc.nextInt();sc.nextLine();
            int cost = sc.nextInt();sc.nextLine();
            bch[i] = new Beach(id,name,rating,cost);
        }
        String p1 = sc.nextLine();
        int p2 = sc.nextInt();
        int ans = findLeastRatingWithName(bch,p1,p2);
        if(ans!=0){
            System.out.println("Output"+ans);
        }
        else{
            System.out.println("No beach found");
        }
    }
    public static int findLeastRatingWithName(Beach[] bch, String p1, int p2){
        int[] rate = new int[0];
        for (int i=0;i<bch.length;i++){
            if(bch[i].getBeachName().equalsIgnoreCase(p1) && bch[i].getBeachCost()>p2){
                rate = Arrays.copyOf(rate, rate.length+1);
                rate[rate.length-1] = bch[i].getbeachRating();
            }
        }
        Arrays.sort(rate);
        if(rate.length>0){
            return rate[0];
        }
        else{
            return 0;
        }

    }
}

class Beach{
    private int beachId,beachRating,beachCost;
    private String beachName;
    public Beach(int beachId,String beachName,int beachRating,int beachCost){
        this.beachId = beachId;
        this.beachName = beachName;
        this.beachRating = beachRating;
        this.beachCost = beachCost;
    }
    public int getBeachId(){
        return beachId;
    }
    public String getBeachName(){
        return beachName;
    }
    public int getbeachRating(){
        return beachRating;
    }
    public int getBeachCost(){
        return beachCost;
    }
    public void setBeachId(int beachId){
        this.beachId = beachId;
    }
    public void setBeachName(String beachName){
        this.beachName = beachName;
    }
    public void setBeachRating(int beachRating){
        this.beachRating = beachRating;
    }
    public void setBeachCost(int beachCost){
        this.beachCost = beachCost;
    }

}
