import java.util.*;
public class RobotResumeCLS {
	public static void main(String[] args){ 

			Scanner s= new Scanner(System.in);
	        String[] eduAchievementArray = new String[10];
	        String[] workExperienceArray = new String[10];
	        String[] skillsArray = new String[20];
	        String eduAll=null;
	        String workAll=null;
	        String skillAll=null;
	        String name, email, typeOfDegree, major, university, education,  position, nameOfEmployer, monthStart, dateLeft, monthLeft,duty1, duty2, experience, skillName, proficiency, skill;
	        int yearOfGrad,yearStart, yearLeft;
	        char yesOrNo;
	        System.out.println(" Enter your name: ");
	        name=s.next();
	        
	        do{
	        System.out.println(" Enter your email address:\n");
	        email=s.next();
	        if (email.indexOf('@')==-1 || email.indexOf('.')==-1){
	        System.out.print("please enter valid email: ");
	        email=null;
	        }
	        }while(email==null);
	        System.out.println(" EDUCATION\n You can add a maximum of 10 degrees");
	        
	        
	        int i=0;
	        do{
				
				System.out.println(" Enter the type of your degree: (eg: BA)");
				typeOfDegree=s.next();
				System.out.println(" Enter the major of your degree: ");
				major=s.next();
				System.out.println(" Enter the University you received the degree from: ");
				university=s.next();
				System.out.println(" Enter the year you received the degree (eg: 2002)");
				while(!s.hasNextInt()){
					System.out.println(" Enter the year you received the degree (eg: 2002)");
	                s.next();
	                }
				yearOfGrad=s.nextInt();
				education = String.format("%s in %s, \n%s, %d \n", typeOfDegree, major, university, yearOfGrad);
				eduAchievementArray[i]=education;
				eduAll+=education;
				i++;
				
					do{
						System.out.println(" Do you want to add another degree? (Y/N)");
						yesOrNo=s.next(".").charAt(0);
					}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
			}while(yesOrNo=='Y'||yesOrNo=='y'&&i<10);
		    
	        System.out.println(" Work experience.\n Start with your most recent job. \n You can add a maximum of 10 experiences ");
	        int a=0;
	        do{
	        	
	        	System.out.println(" Enter the position : ");
	        	position=s.next();
	            System.out.println(" Enter the name of the employer: ");
	            nameOfEmployer=s.next();
	            System.out.println(" Enter the month you began working (eg: May)");
	            while(s.hasNextInt()){
	            	System.out.println(" Enter the month in letters, not numbers. Enter the month you began working (eg: May)");
	                s.next();
	            }
	            monthStart=s.next();
	            
	            System.out.println(" Enter the year you began working at that job(eg: 2008)");
	            while(!s.hasNextInt()){
	            	System.out.println(" That was not an integer. Enter the year you began working at that job(eg: 2008)");
	            s.next();
	            }
	            yearStart=s.nextInt();
	            do{
	            	System.out.println(" Is this your current job? (Y/N)");
	    			yesOrNo=s.next(".").charAt(0);
	    			}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
	            if (yesOrNo=='Y'||yesOrNo=='y'){
	            	dateLeft="Present";
	            }else{
	            	System.out.println(" Enter the month you left that job (eg: May");
	            	while(s.hasNextInt()){
	            		System.out.println(" Enter the month in letters, not numbers. Enter the month you left that job (eg: May");
	                    s.next();
	                }
	                monthLeft= s.next();
	                System.out.println(" Enter the year you left that job");
	                while(!s.hasNextInt()){
	                	System.out.println(" That was not an integer. Enter the year you left that job");
	                    s.next();
	                    }
	                yearLeft=s.nextInt();
	                dateLeft = monthLeft+""+ Integer.toString(yearLeft);
	            }
	                       
	            System.out.println(" DUTIES\n Enter your first duty: ");
	            duty1=s.next();
	            System.out.println(" Enter your second duty: ");
	            duty2=s.next();
	                    
	            experience = String.format("%s \n %s, %s %d - %s \n -Duty 1: %s \n -Duty 2: %s \n ", position, nameOfEmployer, monthStart, yearStart, dateLeft, duty1, duty2);
	            workExperienceArray[a]=experience;
	            workAll+=experience;
	            a++;
	            

	            do{
	    			System.out.println(" Do you want to add another work experience? (Y/N)");
	    			yesOrNo=s.next(".").charAt(0);
	    			}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
	    	}while(yesOrNo=='Y'||yesOrNo=='y'&& a<10);
			
	        int b=0;
	        System.out.println(" SKILLS\n You can add a maximum of 20 skills. ");
			do{
				System.out.println("Add your skill: ");
				skillName=s.next();
				System.out.println("How proficient are you in this skill?(skilled/proficient/familiar)");
				proficiency=s.next();
				skill= String.format("%s, %s \n", skillName, proficiency);
				skillsArray[b]=skill;
				skillAll+=skill;
				b++;
					do{
	    			System.out.println(" Do you want to add another skill? (Y/N)");
	    			yesOrNo=s.next(".").charAt(0);
	    			}while(yesOrNo!='Y'&&yesOrNo!='y'&&yesOrNo!='N'&&yesOrNo!='n');
	    	}while(yesOrNo=='Y'||yesOrNo=='y'&& b<20);
			BasicIInfo ba=new BasicIInfo();
			ba.BasicMethod(name, email, eduAll, workAll, skillAll);
			System.out.println("====================================");
			System.out.println(name);
			System.out.println(email+ "\n");
			System.out.println("EDUCATION\n");
			
			for(String edu : eduAchievementArray){
				if (edu ==null){
					
				}else{
				System.out.println(edu);
				}
			}
			
			
			System.out.println("EXPERIENCE\n");
			for(String exp : workExperienceArray){
				if (exp ==null){
					
				}else{
				System.out.println(exp);
				}
			}
			
			System.out.println("SKILLS\n");
			for(String ski : skillsArray){
				
				if (ski ==null){
					
				}else{
				System.out.println(ski);
				}
			}
			s.close();
		}

	}
    
    	