import java.util.Scanner;             
public class Strassens {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


System.out.println("Enter elements for the first matrix (2x2):");
int[][] x = new int[2][2];
for(int i = 0; i < 2; i++) {
for(int j = 0; j < 2; j++) {
x[i][j] = scanner.nextInt();
}
}


System.out.println("Enter elements for the second matrix (2x2):");
int[][] y = new int[2][2];
for(int i = 0; i < 2; i++) {
for(int j = 0; j < 2; j++) {
y[i][j] = scanner.nextInt();
}
}



// Result matrix Z
int z[][] = new int[2][2];
int m1, m2, m3, m4 , m5, m6, m7;

// Printing the first matrix X
System.out.print("The first matrix is: ");
for(int i = 0; i<2; i++) {
System.out.println();//new line
for(int j = 0; j<2; j++) {
System.out.print(x[i][j] + "\t");
}
}

// Printing the second matrix Y
System.out.print("\nThe second matrix is: ");
for(int i = 0; i<2; i++) {
System.out.println();//new line
for(int j = 0; j<2; j++) {
System.out.print(y[i][j] + "\t");
}
}

// using Strassen's algorithm:
m1 = (x[0][0] + x[1][1]) * (y[0][0] + y[1][1]);
m2 = (x[1][0] + x[1][1]) * y[0][0];
m3 = x[0][0] * (y[0][1] - y[1][1]);
m4 = x[1][1] * (y[1][0] - y[0][0]);
m5 = (x[0][0] + x[0][1]) * y[1][1];
m6 = (x[1][0] - x[0][0]) * (y[0][0]+y[0][1]);
m7 = (x[0][1] - x[1][1]) * (y[1][0]+y[1][1]);

// Computing the result matrix Z
z[0][0] = m1 + m4- m5 + m7;
z[0][1] = m3 + m5;
z[1][0] = m2 + m4;
z[1][1] = m1 - m2 + m3 + m6;


System.out.print("\nProduct achieved using Strassen's algorithm: ");
for(int i = 0; i<2; i++) {
System.out.println();//new line
for(int j = 0; j<2; j++) {
System.out.print(z[i][j] + "\t");
}
}
}
}
