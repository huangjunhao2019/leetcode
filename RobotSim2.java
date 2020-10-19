import java.util.HashSet;
/**
 * 这个程序中，在检测两个坐标是否相等时采用了转换为字符串比较的方式，这是很好的
 * ，另外，在dx，dy中，也是非常好的表达方式
 *我觉得这道题和走迷宫的是一类题目，核心思想基本都在于如何表示几种移动
 */
public class RobotSim2{
	public static void main(String[] args){
		int[] commands={4,-1,4,-2,4};
		int[][] obstacle={{2,4}};
		System.out.println(robotSim(commands,obstacle));
	}
	public static int robotSim(int[] commands,int[][] obstacle){
		int[] dx={0,1,0,-1};
		int[] dy={1,0,-1,0};
		int direction=0;
		int locx=0;
		int locy=0;
		int max=0;
		HashSet<String> obs=new HashSet<>();
		for(int[] value:obstacle){
			String temp=value[0]+" "+value[1];
			obs.add(temp);
		}
	        for(int command:commands){
			if(command==-2)
				direction=(direction+3)%4;//这是一个好的地方，用顺时针表示方向
			else if(command==-1)
				direction=(direction+1)%4;
			else{
				for(int i=0;i<command;i++){
					int tempx=locx+dx[direction];
					int tempy=locy+dy[direction];
					String temploc=tempx+" "+tempy;
		//			if(obs.contains(temploc))
		//				System.out.println("yes");
					if(!obs.contains(temploc)){
						
						locx=tempx;
						locy=tempy;
						max=Math.max(max,locx*locx+locy*locy);
					}
				}
			}
		}
		return max;
	}
}
