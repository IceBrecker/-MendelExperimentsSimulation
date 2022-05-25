/*
孟德尔的实验模拟
2017-3
v1.6.3
谨以此向孟德尔致敬
*/
import java.util.*;
public class HybridSimulation{
	public static void main(String[] args){
		
		String answer;
		Scanner input=new Scanner(System.in);
		System.out.println("孟德尔的实验模拟");
		
		do{
			System.out.println("请输入模拟实验类型：\n1:一对相对性状的杂交实验（分离定律）\n2:一对相对性状的测交实验\n3:两对相对性状的杂交实验（自由组合定律）\n4:两对相对性状的测交实验");
			int choice=input.nextInt();
			switch(choice){
				
				case 1:
					System.out.println("请输入子代数目：");
					int num1=input.nextInt();
					int i01=0;
					int a1=0;//DD
					int b1=0;//Dd
					int c1=0;//dd
					while(i01<num1){
						int i1=0;
						int flag1=0;
							while(i1<2){
								int random=(int)(Math.random()*10);
								if(random%2==0){
									flag1++;
								}
								i1++;
							}
						if(flag1==0){
							a1++;
						}else if(flag1==1){
							b1++;
						}else{
							c1++;
						}
						i01++;	
					}
					System.out.println("DD:Dd:dd=\n"+a1+":"+b1+":"+c1);
					System.out.println("高茎:矮茎=\n"+(a1+b1)+":"+c1);
					break;
								
				case 2:
					System.out.println("请输入子代数目：");
					int num2=input.nextInt();
					int i02=0;
					int a2=0;//Dd
					int b2=0;//dd
					while(i02<num2){
						int random=(int)(Math.random()*10);
							if(random%2==0){
								a2++;
							}else{
								b2++;
							}
						i02++;	
					}
					System.out.println("DD:Dd=\n"+a2+":"+b2);
					System.out.println("高茎:矮茎=\n"+a2+":"+b2);
					break;
				
				case 3:
					System.out.println("请输入子代数目：");
					int num3=input.nextInt();
					int i03=0;
					int a3=0;//YYyy
					int b3=0;//YyRR
					int c3=0;//yyRR
					int d3=0;//YYRr
					int e3=0;//YyRr
					int f3=0;//yyRr
					int g3=0;//YYrr
					int h3=0;//Yyrr
					int i3=0;//yyrr	
					
					while(i03<num3){
						int i13=0;
						int flag31=0;
						int flag32=0;
						while(i13<2){
							int random=(int)(Math.random()*10);
							if(random%2==0){
								flag31++;
							}
							i13++;
						}
						while(i13<4 && i13>=2){
							int random1=(int)(Math.random()*10);
							if(random1%2==0){
								flag32++;
							}
							i13++;
						}
						if(flag31==0){
							if(flag32==0){
								a3++;
							}else if(flag32==1){
								d3++;
							}else if(flag32==2){
								g3++;
							}
						}
						if(flag31==1){
							if(flag32==0){
								b3++;
							}else if(flag32==1){
								e3++;
							}else if(flag32==2){
								h3++;
							}	
						}
						if(flag31==2){
							if(flag32==0){
								c3++;
							}else if(flag32==1){
								f3++;
							}else{
								i3++;
							}
						}
						i03++;	
					}
					System.out.println("YYRR:YyRR:yyRR:YYRr:YyRr:yyRr:YYrr:Yyrr:yyrr=\n"+a3+":"+b3+":"+c3+":"+d3+":"+e3+":"+f3+":"+g3+":"+h3+":"+i3);	
					System.out.println("黄色圆粒:黄色皱粒:绿色圆粒:绿色皱粒=\n"+(a3+b3+d3+e3)+":"+(g3+h3)+":"+(c3+f3)+":"+i3);	
					break;
				
				case 4:
					System.out.println("请输入子代数目：");
					int num4=input.nextInt();
					int i04=0;
					int a4=0;//YyRr
					int b4=0;//Yyrr
					int c4=0;//yyYy
					int d4=0;//yyrr
					while(i04<num4){
						int flag41=0;
						int flag42=0;
							int random=(int)(Math.random()*10);
							if(random%2==0){
								flag41++;
							}
							int random1=(int)(Math.random()*10);
							if(random1%2==0){
								flag42++;
							}
						if(flag41==0){
							if(flag42==0){
								a4++;
							}else{
								b4++;
							}	
						}else{
							if(flag42==0){
								c4++;
							}else{
								d4++;
							}	
						}
						i04++;	
					}
				System.out.println("YyRr:Yyrr:yyRr:yyrr=\n"+a4+":"+b4+":"+c4+":"+d4);	
				System.out.println("黄色圆粒:黄色皱粒:绿色圆粒:绿色皱粒=\n"+a4+":"+b4+":"+c4+":"+d4);	
				break;
			}						
		
		System.out.println("是否返回选择实验（y/n）");
		answer=input.next();
		}while(answer.equals("y"));
		System.out.println("感谢使用本程序");
	
	}
}
