public class RobotSim{
	public static void main(String[] args){
		int[] commands={4,-1,4,-2,4};
		int[][] obstacles={{2,4}};
		System.out.println(robotSim(commands,obstacles));
	}
	public static  int locx=0,locy=0;
	public static int robotSim(int[] commands,int[][] obstacles){
		int direction=0;//0,上，1下，2左，3右
	//	int locx=0,locy=0;
		for(int command:commands){
			if(command==-2)
				direction=solve1(command,direction);
			else if(command==-1)
				direction=solve2(command,direction);
			else
				solve3(command,direction,obstacles);
		}
		return locx*locx+locy*locy;
	}
	public static int solve1(int command,int direction){
		if(direction==0)
			return 2;
		else if(direction==1)
			return 3;
		else if(direction==2)
			return 1;
		else
			return 0;
	}
	public static int solve2(int command,int direction){
		if(direction==0)
			return 3;
		else if(direction==1)
			return 2;
		else if(direction==2)
			return 0;
		else 
			return 1;
	}
	public static void solve3(int command,int direction,int[][] obstacle){
		//先假设没有障碍
		if(direction==0)
			upward(command,obstacle);
		else if(direction==1)
			downward(command,obstacle);
		else if(direction==2)
			left(command,obstacle);
		else
			right(command,obstacle);
	}
	public static void upward(int command,int[][] obstacle){
		//locy+
		int temp_locy=locy+command;
		boolean flag=false;
		for(int[] obs:obstacle){
			if(obs[0]==locx && obs[1]>locy && obs[1]<temp_locy){
				flag=true;
				locy=obs[1]-1;
			}
		}
		if(flag)
			locy=locy;
		else
			locy+=command;
	}
	public static void downward(int command,int[][] obstacle){
		//locy-
		int temp_locy=locy-command;
		boolean flag=false;
		for(int[] obs:obstacle){
			if(obs[0]==locx && obs[1]<locy && obs[1]>temp_locy){
				flag=true;
				locy=obs[1]+1;
			}
		}
		if(flag)
			locy=locy;
		else
			locy-=command;
	}
	public static void left(int command,int[][] obstacle){
		//locx-
		int temp_locx=locx-command;
		boolean flag=false;
		for(int[] obs:obstacle){
			if(obs[1]==locy && obs[0]<locx && obs[0]>temp_locx){
				flag=true;
				locx=obs[0]+1;
			}
				
		}
		if(flag)
			locx=locx;
		else
			locx=locx-command;
        }
	public static void right(int command,int[][] obstacle){
		//locx+
		int temp_locx=locx+command;
		boolean flag=false;
		for(int[] obs:obstacle){
			if(obs[1]==locy && obs[0]<temp_locx && obs[0]>locx){
				flag=true;
				locx=obs[0]-1;
			}
		}
	        if(flag)
			locx=locx;
		else
			locx=locx+command;
	}

}
