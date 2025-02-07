import java.util.Scanner;

class Student{
    int rollno, mark1, mark2, mark3, total_mark;
    String name;
    static int strength = 0;

    public Student(Scanner sc){
        System.out.print("Enter the rollno: ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of student: ");
        name = sc.nextLine();
        System.out.print("Enter the marks of three subjects: ");
        mark1 = sc.nextInt();
        mark2 = sc.nextInt();
        mark3 = sc.nextInt();
        total_mark = mark1 + mark2 + mark3;
        strength ++;
    }

    public void displayStud(){
        System.out.println("\nRoll No: " + rollno + "\nName: " +name+ "\nMark1: " +mark1+ "\nMark2: " +mark2+ "\nMark3: " +mark3+ "\n");
    }

    public static void displayStrength(){
        System.out.println("Total strength: " + strength+ "\n");
    }
}

public class StudentDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student students[] = new Student[n];
        for(int i = 0; i < n; i++){
            students[i] = new Student(sc);
        }
        for(int i = 0; i < n; i++){
            students[i].displayStud();
        }
        Student.displayStrength();
        DisplayRank(students);
        sc.close();
    }
    
    public static void sortStud(Student [] students){
        for(int i = 0; i < Student.strength; i++){
            for(int j = i+1; j < Student.strength; j++){
                if(students[i].total_mark < students[j].total_mark){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public static void DisplayRank(Student [] students){
        sortStud(students);
        System.out.println("RankList");
        for(int i = 0; i < Student.strength; i++){
            System.out.println("Rank " +(i+1)+ "-" +students[i].name);
        }
    }
}
