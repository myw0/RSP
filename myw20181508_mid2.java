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
        ran[0] = "가위";
        ran[1] = "바위";
        ran[2] = "보";
        ran[3] = "종료";
        System.out.println("0. 가위, 1. 바위, 2. 보, 3.종료 \n숫자를 눌러 주세요");
        int me = sc.nextInt();
        int com = (int)(Math.random()*3);
        
        String result="";            
        if (me == 3) {
           	break;
           }
        if(com == me) {
             result="비겼습니다.";
        } else {
            if(com == 0) {            
                if(me == 1) result="플레이어가 이겼습니다.";
                else result="플레이어가 졌습니다.";
            }
            else if(com == 1) {      
                if(me==0) result="플레이어가 졌습니다.";
                else result="플레이어가 이겼습니다.";
            }
            else{          
                if(me==0) result="플레이어가 이겼습니다.";
                else result="플레이어가 졌습니다.";
            }
       } 
    
       System.out.println("플레이너는 "+ran[me]+"를 냈습니다.");
       System.out.println("컴퓨터는 "+ran[com]+"를 냈습니다.");
       System.out.println(result);
       
	}
	

	
	}
}
