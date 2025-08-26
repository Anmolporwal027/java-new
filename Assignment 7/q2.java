import java.util.Scanner;
import javax.swing.*;
class Subject{
    int cnt;
    String name;
    int marks;
    // for subject name input
    void setSub(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name of subject "+(i+1)+" : ");
        name = sc.nextLine();
    }

    // for subject marks input 
    void setMar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the "+name+" out of 100 : ");
        marks = sc.nextInt();
        chkMar();
    }
    void chkMar(){
        if(marks < 0 || marks > 100){
            System.out.println("Please enter valid marks");
            setMar();
        }
    }
}

class Practical{
    String name;
    int marks;

    // for Practical name input
    void setPra(int i){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name of Practical "+(i+1)+" : ");
        name = sc.nextLine();
    }

    // for practial marks 
    void setMar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of the "+name+" out of 25 : ");
        marks = sc.nextInt();
        
        chkMar();
    }
    void chkMar(){
        if(marks < 0 || marks > 25){
            System.out.println("Please enter valid marks for practical ");
            setMar();
        }
    }
}
class TestMain{
          // ANSI color codes as constants
    static final String RED_TEXT = "\u001B[31m";
    static final String RESET = "\u001B[0m";
    static final String BLACK_TEXT = "\u001B[30m";
    static final String WHITE_BG = "\u001B[47m";
    static final String GREEN = "\u001B[102m";
    final static String BLUE_TEXT = "\u001B[44m";
    static final String WHITE_TEXT = "\u001B[37m";
    static final String LIGHT_BLUE_BG = "\u001B[104m";
    static final String VERY_LIGHT_BLUE_BG = "";

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Subject s[] = new Subject[5];
        Practical p[] = new Practical[2];

        System.out.println("Enter your name");
        String yname = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter your roll no");
        int rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Father name");
        String yfname = sc.nextLine();
        System.out.println("Enter your Mother name");
        String ymname = sc.nextLine();
        System.out.println("Enter your Course");
        String ycname = sc.nextLine();

        // Subject names 
        System.out.println("\nEnter names of your 5 subject ");
        for(int i=0; i<5; i++){
            s[i] = new Subject();
            s[i].setSub(i);
        }
        // Subject marks
        System.out.println("\nEnter Marks of your 5 subject ");
        for(int i=0; i<5; i++){
            s[i].setMar();
        }

        // Practical names
        System.out.println("\nEnter names of your 2 Practical ");
        for(int i=0; i<2; i++){
            p[i] = new Practical();
            p[i].setPra(i);
        }

        /// Practical marks
        System.out.println("\nEnter Marks of your 2 Practicals ");
        for(int i=0; i<2; i++){
            p[i].setMar();
        }

        int outoff = 100;
        int poutoff = 25;


        //  System.out.print(WHITE_BG + BLACK_TEXT);
        System.out.println((WHITE_BG + BLACK_TEXT)+"------------------------------------------------------------------------"+RESET);
        System.out.println((BLUE_TEXT + BLACK_TEXT)+"|                   Govt. ABC SCIENCE COLLEGE,INDORE                   |"+RESET);
        System.out.println((BLUE_TEXT + BLACK_TEXT)+"|                             MARKSHEET                                |"+RESET);
        System.out.println((BLUE_TEXT + BLACK_TEXT)+"|                     YEARLY EXAMINATION 2025-2026                     |"+RESET);
        System.out.println((WHITE_BG + BLACK_TEXT)+"|======================================================================|"+RESET);
        System.out.printf((GREEN + BLACK_TEXT)+"| %-7s %-29s %-9s %-12s |"+RESET+"%n","Name   : ",yname, "Course       : ",ycname);
        System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-9s %-29s %-10s %-12s |"+RESET+"%n","Roll no:",rno, "Father name  : ",yfname);
        System.out.printf((GREEN + BLACK_TEXT)+"| %-39s %-14s %-12s |"+RESET+"%n", "Year   :  1st year ", "Mother name  : ",ymname);
        System.out.println((WHITE_BG + BLACK_TEXT)+"|======================================================================|"+RESET);
        System.out.printf((BLUE_TEXT+WHITE_TEXT)+"| %-20s| %-14s| %-14s| %-14s |"+RESET+"%n", "Subject","Paper" ,"Out of", "Marks");
        System.out.println((WHITE_BG + BLACK_TEXT)+"|---------------------|---------------|---------------|----------------|"+RESET);
        String sr = "TH";
        for(int i=0; i<5; i++){
            System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s| %-14s| %-14d| %-14d |"+RESET+"%n", s[i].name,sr,100, s[i].marks);
        }
        // practical
        String pr = "PR";
        for(int i=0; i<2; i++){
            System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s| %-14s| %-14d| %-14d |"+RESET+"%n", p[i].name,pr,25, p[i].marks);
        }
        System.out.println((WHITE_BG + BLACK_TEXT)+"|----------------------------------------------------------------------|"+RESET);
        // getting total marks of practicals
        int totalPmark = 0;
        for(Practical a : p){
            totalPmark += a.marks;
        }
        int totalSmark = 0;
        for(Subject a : s){
            totalSmark += a.marks;
        }


        // TOTAL MARKS
        int totalmarks = totalSmark + totalPmark;
        float percentage = ((float)totalmarks)/5.5f;
        System.out.printf((LIGHT_BLUE_BG + BLACK_TEXT)+"| %-36s| %-14s| %-14s |"+RESET+"%n", "Total" ,"550", totalmarks);
        System.out.println((WHITE_BG + BLACK_TEXT)+"|======================================================================|"+RESET);
        System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47.2f |"+RESET+"%n", "Total Percentage :", percentage);

if(percentage >= 90){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","A+");
}
else if(percentage >= 80 && percentage < 90){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","A");
}
else if(percentage >= 70 && percentage < 80){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","B+");
}
else if(percentage >= 60 && percentage < 70){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","B");
}
else if(percentage >= 50 && percentage < 60){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","C");
}
else if(percentage >= 33 && percentage < 50){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","D");
}
else if(percentage < 33){
    System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Grade            :","E");
}
        // Checking for ATKT and YEAR BACK and total subject marks 
        int cnt=0;
        for(Subject a : s){
            if(a.marks < 33){
                cnt++;
            }
        }
         if(cnt >= 3){
            System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Result           :","Year Back");
        } else if(cnt > 0 && cnt < 3){
            System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Result           :","You got the ATKT in " + cnt + " subjects");
        } else {
            System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n", "Result           :","PASS");
        }

System.out.println((WHITE_BG + BLACK_TEXT)+"|======================================================================|"+RESET);
System.out.printf((WHITE_BG + BLACK_TEXT)+"| %-20s %-47s |"+RESET+"%n","Principle        : ","Suresh H Silawat ");
System.out.printf((WHITE_BG+ BLACK_TEXT)+"| %-68s |"+RESET+"%n", "Promoted to year :   2 ");
System.out.println((WHITE_BG+ BLACK_TEXT)+"------------------------------------------------------------------------"+RESET);
    }
}