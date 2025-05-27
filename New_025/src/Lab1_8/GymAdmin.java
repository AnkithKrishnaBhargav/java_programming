import java.util.Scanner;
public class GymAdmin {
    
    String Name;
    int Age;
    int Duration;
    int Fee;
    int calulateFee(int duration){
        int pdfee = 15;
        return  pdfee * duration;
        // Assuming fee is $15 per month
    }
    void displayMemberInfo(GymAdmin member){
        System.out.println("Member Name: " + member.Name);
        System.out.println("Member Age: " + member.Age);
        System.out.println("Membership Duration: " + member.Duration + " months");
        System.out.println("Membership Fee: $" + member.Fee);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Gym Management System");
        System.out.println("Please enter the number of members:");
        int numberOfMembers = scanner.nextInt();
        scanner.nextLine(); 
        GymAdmin[] members = new GymAdmin[numberOfMembers];
        for (int i = 0; i < numberOfMembers; i++) {
            members[i] = new GymAdmin();
            System.out.println("Enter details for member " + (i + 1) + ":");
            System.out.print("Name: ");
            members[i].Name = scanner.nextLine();
            System.out.print("Age: ");
            members[i].Age = scanner.nextInt();
            System.out.print("Membership Duration (in months): ");
            members[i].Duration = scanner.nextInt();
            members[i].Fee = members[i].calulateFee(members[i].Duration);
            scanner.nextLine(); 

        }
        System.out.println("-----------------------------");
        System.out.println("\nMember Details:\n");
        System.out.println("-----------------------------");
        for (int i = 0; i < numberOfMembers; i++) {
            members[i].displayMemberInfo(members[i]);
            System.out.println("-----------------------------");
        }
        scanner.close();
        
    }
}
