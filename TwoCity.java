import java.util.*;
public class TwoCity{
	public static void main(String[] args){
		int[][] costs={{10,20},{30,200},{400,50},{30,20}};
		int temp=twoCitySchedCost(costs);
		System.out.println(temp);
	}
/* public static int twoCitySchedCost(int[][] costs) {
      // Sort by a gain which company has 
      // by sending a person to city A and not to city B
      Arrays.sort(costs, new Comparator<int[]>() {
          @Override
          public int compare(int[] o1, int[] o2) {
              return o1[0] - o1[1] - (o2[0] - o2[1]);
          }
      });

      int total = 0;
      int n = costs.length / 2;
      // To optimize the company expenses,
      // send the first n persons to the city A
      // and the others to the city B
      for (int i = 0; i < n; ++i) total += costs[i][0] + costs[i + n][1];
      return total;
    }
*/
	public static int twoCitySchedCost(int[][] costs){
		int N=costs.length/2;
		int NA=N;
		int NB=N;
		Arrays.sort(costs,new Comparator<int[]>(){
			@Override
			public int compare(int[] a,int[] b){
				return Math.abs(a[0]-a[1])-Math.abs(b[0]-b[1]);	
			
		}
		}
			);
		for(int i=0;i<costs.length;i++)
			System.out.println(Arrays.toString(costs[i]));
		int sum=0;
		for(int i=0;i<2*N;i++){
			int index=costs.length-1-i;
			if(NA>0 && costs[index][0]<=costs[index][1]){
					NA--;
					sum+=costs[index][0];
			}
			else{
				NB--;
				sum+=costs[index][1];
			}
		}
		return sum;
	}

}

