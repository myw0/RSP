package rsp;

import java.util.Scanner;

public class rsp1 
{

	public static void main(String[] args) 
	{
	while(true) 
	{
		System.out.println("\n����~ ����~ ��~!");
		Scanner sc = new Scanner(System.in);
		 {
			int com = (int)(Math.random()*3)+1;
			System.out.println("1. ����, 2. ����, 3. ��, 4.���� \n���ڸ� ���� �ּ���");
			
		  	int me = sc.nextInt();
		  	if (me == 4) 
		  	{
		  		break;
		  	}
		  	System.out.print("�÷��̾�� ");
		  	if (me == 1)
		  	{
		  		System.out.print("����");
		  	}
		  	else if(me == 2)
		  	{
		  		System.out.print("����");
		  	}
		  	else  
		  	{
		  		System.out.print("��");
		  	}
		  	System.out.println("�� �½��ϴ�.");
		  	System.out.print("��ǻ�ʹ� ");
		  	if (com == 1) 
		  	{
		  	  	System.out.print("����");
		  	}
		  	else if(com == 2)
		  	{
		  		System.out.print("����");
		  	}
		  	else  
		  	{
		  		System.out.print("��");
		  	}
		  	System.out.println("�� �½��ϴ�.");
		  	if(me == 1) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("�����ϴ�.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("�÷��̾ �����ϴ�");
		  		}
		  		else
		  		{
		  			System.out.print("�÷��̾ �̰���ϴ�.");
		  		}
		 		
		 	}
		  	if(me == 2) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("�÷��̾ �̰���ϴ�.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("�����ϴ�");
		  		}
		  		else
		  		{
		  			System.out.print("�÷��̾ �����ϴ�.");
		  		}
		 		
		 	}
		  	if(me == 3) 
		 	{
		  		if(com == 1)
		  		{
		  			System.out.print("�÷��̾ �����ϴ�.");
		  		}
		  		else if(com == 2)
		  		{
		  			System.out.print("�÷��̾ �̰���ϴ�.");
		  		}
		  		else
		  		{
		  			System.out.print("�����ϴ�.");
		  		}
		 		
		 	}
		  	
		 }
		 	

	}
	
	}
}
