package rsp;

import java.util.Scanner;

public class rsp2 
{

	public static void main(String[] args) 
	{
	while(true) 
	{
		
	
		Scanner sc = new Scanner(System.in);
		String[] ran = new String[4];
        ran[0] = "����";
        ran[1] = "����";
        ran[2] = "��";
        ran[3] = "����";
        System.out.println("0. ����, 1. ����, 2. ��, 3.���� \n���ڸ� ���� �ּ���");
        int me = sc.nextInt();
        int com = (int)(Math.random()*3);
        
        String result="";            
        if (me == 3) {
           	break;
           }
        if(com == me) {
             result="�����ϴ�.";
        } else {
            if(com == 0) {            
                if(me == 1) result="�÷��̾ �̰���ϴ�.";
                else result="�÷��̾ �����ϴ�.";
            }
            else if(com == 1) {      
                if(me==0) result="�÷��̾ �����ϴ�.";
                else result="�÷��̾ �̰���ϴ�.";
            }
            else{          
                if(me==0) result="�÷��̾ �̰���ϴ�.";
                else result="�÷��̾ �����ϴ�.";
            }
       } 
    
       System.out.println("�÷��̳ʴ� "+ran[me]+"�� �½��ϴ�.");
       System.out.println("��ǻ�ʹ� "+ran[com]+"�� �½��ϴ�.");
       System.out.println(result);
       
	}
	

	
	}
}
