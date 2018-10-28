import java.util.ArrayList;
import java.util.Random;

public class Fixtures {

	public static ArrayList<String> teamNames= new ArrayList<String>();
	public static ArrayList<String> groupA= new ArrayList<>();
	public static ArrayList<String> groupB= new ArrayList<>();
	public static ArrayList<String> groupC= new ArrayList<>();
	public static ArrayList<String> groupD= new ArrayList<>();
	public static ArrayList<Integer> assigned= new ArrayList<>();
	
	public static ArrayList<String> matches=new ArrayList<String>();
	
	public static void main(String[] args) {
	
		teamNames.add("Mix11");
		teamNames.add("Block-8");
		teamNames.add("AIT CSE-BLOCK-14");
		teamNames.add("Ball Blasters");
		teamNames.add("CSE-11");
		teamNames.add("BLUE SMASHERS");
		teamNames.add("FURIOUS-11");
		teamNames.add("SUPERKINGS");
		teamNames.add("PYTHONS");
		teamNames.add("DISPENSARY SUPER KINGS");
		teamNames.add("ELEVEN KINGS");
		teamNames.add("VIKINGS");
		teamNames.add("MECH ROCKS");
		
		
		Random objectRandom= new Random();
		
		for(int i=0;i<4;i++)
		{
			int random=objectRandom.nextInt(13);
			while(assigned.contains(random))
			{
				random=objectRandom.nextInt(13);
			}
			groupA.add(teamNames.get(random));
			assigned.add(random);
		}
		
		for(int i=0;i<3;i++)
		{
			int random=objectRandom.nextInt(13);
			while(assigned.contains(random))
			{
				random=objectRandom.nextInt(13);
			}
			groupB.add(teamNames.get(random));
			assigned.add(random);
		}
		
		for(int i=0;i<3;i++)
		{
			int random=objectRandom.nextInt(13);
			while(assigned.contains(random))
			{
				random=objectRandom.nextInt(13);
			}
			groupC.add(teamNames.get(random));
			assigned.add(random);
		}
		
		
		for(int i=0;i<3;i++)
		{
			int random=objectRandom.nextInt(13);
			while(assigned.contains(random))
			{
				random=objectRandom.nextInt(13);
			}
			groupD.add(teamNames.get(random));
			assigned.add(random);
		}
		
		
		System.out.println("Group A teams");
		groupA.stream().forEach(arg0->System.out.println(arg0));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Group B teams");
		groupB.stream().forEach(arg0->System.out.println(arg0));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Group C teams");
		groupC.stream().forEach(arg0->System.out.println(arg0));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Group D teams");
		groupD.stream().forEach(arg0->System.out.println(arg0));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("----------Group A Matches---------");
		System.out.println("");
		System.out.println("Match 1 :  "+groupA.get(0)+" VS "+groupA.get(1));
		System.out.println("Match 2 :  "+groupA.get(2)+" VS "+groupA.get(3));
		System.out.println("Match 3 :  "+groupA.get(0)+" VS "+groupA.get(3));
		System.out.println("Match 4 :  "+groupA.get(2)+" VS "+groupA.get(1));
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("----------Group B Matches---------");
		System.out.println("");
		System.out.println("Match 1 :  "+groupB.get(0)+" VS "+groupB.get(1));
		System.out.println("Match 2 :  "+groupB.get(0)+" VS "+groupB.get(2));
		System.out.println("Match 3 :  "+groupB.get(1)+" VS "+groupB.get(2));
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("----------Group C Matches---------");
		System.out.println("");
		System.out.println("Match 1 :  "+groupC.get(0)+" VS "+groupC.get(1));
		System.out.println("Match 2 :  "+groupC.get(0)+" VS "+groupC.get(2));
		System.out.println("Match 3 :  "+groupC.get(1)+" VS "+groupC.get(2));
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println("----------Group D Matches---------");
		System.out.println("");
		System.out.println("Match 1 :  "+groupD.get(0)+" VS "+groupD.get(1));
		System.out.println("Match 2 :  "+groupD.get(0)+" VS "+groupD.get(2));
		System.out.println("Match 3 :  "+groupD.get(1)+" VS "+groupD.get(2));
		System.out.println("");
		System.out.println("");
		
		
		
		
	}  
	
	
}
