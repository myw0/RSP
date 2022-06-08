package rsp;

import java.util.Scanner;

public class rsp1 
{

	public static void main(String[] args) 
	{
	while(true) 
	{
		System.out.println("\n가위~ 바위~ 보~!");
		Scanner sc = new Scanner(System.in);
		 {
			int com = (int)(Math.random()*3)+1;
			System.out.println("1. 가위, 2. 바위, 3. 보, 4.종료 \n숫자를 눌러 주세요");
			
		  	int me = sc.nextInt();
		  	if (me == 4) 
		  	{
		  		break;
		  	}
		  	System.out.print("플레이어는 ");
		  	if (me == 1)
		  	{
		  		System.out.print("가위");
		  	}
		  	else if(me == 2)
		  	{
		  		System.out.print("바위");
		  	}
		  	else  
		  	{
		  		System.out.print("보");
		  	}
		  	System.out.println("를 냈습니다.");
		  	System.out.print("컴퓨터는 ");
		  	if (com == 1) 
		  	{
		  	  	System.out.print("가위");
		  	}
		  	else if(com == 2)
		  	{
		  		System.out.print("바위");
		  	}
		  	else  
		  	{
		  		System.out.print("보");
		  	}
		  	System.out.println("를 냈습니다.");
		  	if(me == 1) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("비겼습니다.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("플레이어가 졌습니다");
		  		}
		  		else
		  		{
		  			System.out.print("플레이어가 이겼습니다.");
		  		}
		 		
		 	}
		  	if(me == 2) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("플레이어가 이겼습니다.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("비겼습니다");
		  		}
		  		else
		  		{
		  			System.out.print("플레이어가 졌습니다.");
		  		}
		 		
		 	}
		  	if(me == 3) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("플레이어가 졌습니다.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("플레이어가 이겼습니다.");
		  		}
		  		else
		  		{
		  			System.out.print("비겼습니다.");
		  		}
		 		
		 	}
		  	
		 }
		 	

	}
	
	}
}
