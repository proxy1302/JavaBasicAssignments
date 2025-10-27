package ASS1.com;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temp in Celcieus");
		int Celcius=sc.nextInt();
		
		int fer=convertTemp(Celcius);
		System.out.println(fer);
		
		
		
	}

	public  static  int convertTemp(int cel) {
	
		int Fer=(cel*9/5)+32;
		return Fer;
		
	}

}

//1. If-Else Conditions
//Formulas/Logic:
//C to F Conversion: F = (C * 9/5) + 32
//
//Area & Perimeter:
//
//Rectangle: Area = l * b, Perimeter = 2 * (l + b)
//
//Circle: Area = π * r², Circumference = 2 * π * r
//
//3-digit number:
//
//Sum of digits: sum = d1 + d2 + d3
//
//Reverse: reverse = d3*100 + d2*10 + d1
//
//Even/Odd: if (num % 2 == 0)
//
//Salary Calculation:
//
//c
//Copy
//Edit
//if (basic <= 5000) {
//    da = basic * 0.10;
//    ta = basic * 0.20;
//    hra = basic * 0.25;
//} else {
//    da = basic * 0.15;
//    ta = basic * 0.25;
//    hra = basic * 0.30;
//}
//total = basic + da + ta + hra;
//Marriage Eligibility:
//
//c
//Copy
//Edit
//if ((gender == 'M' && age >= 21) || (gender == 'F' && age >= 18))
//2. Nested If-Else
//Discount Based on Price:
//
//c
//Copy
//Edit
//if (price > 1000) discount = 0.20;
//else if (price > 500) discount = 0.10;
//else discount = 0.05;
//Greatest of 3:
//
//c
//Copy
//Edit
//if (a > b) {
//    if (a > c) → a is greatest;
//    else → c is greatest;
//} else {
//    if (b > c) → b is greatest;
//    else → c is greatest;
//}
//Menu Based Operations:
//Use if-else or switch for menu-based selections.
//
//3. Loop Based
//1 to 10: for(i = 1; i <= 10; i++)
//
//Table: for(i = 1; i <= 10; i++) → print(n*i)
//
//Sum of Range: for(i=start; i<=end; i++) sum+=i
//
//Prime Check: count divisors of n, if count==2
//
//Armstrong: sum of (digit^3) == number
//
//Perfect: sum of divisors == number
//
//Factorial: fact *= i from 1 to n
//
//Strong Number: sum of factorials of digits == number
//
//Palindrome: reverse the number or string and compare
//
//First + Last Digit:
//
//c
//Copy
//Edit
//last = num % 10;
//while(num > 9) num /= 10;
//first = num;
//4. Nested Loop for Range
//Loop from 1 to n and use previous logic inside.
//
//5. Functions
//Types of Functions:
//
//void fun() → no parameter, no return
//
//void fun(int) → with parameter
//
//int fun() → with return
//
//int fun(int) → both parameter & return
//
//Reuse loop/if logic inside function templates.
//
//6. Pointers
//Pass variable address (&var) to function and use *ptr to manipulate.
//
//Same as function logic, but using pointer parameters.
//
//7. Arrays
//Min/Max: Loop through array, compare elements.
//
//Search: Linear search
//
//Sum: sum += arr[i]
//
//Even/Odd: arr[i] % 2
//
//Prime: check each array element
//
//Addition: crr[i] = arr[i] + brr[i]
//
//Merge: Append one array to another
//
//Reverse: Swap from both ends
//
//Sort: Use Bubble/Selection sort
//
//8. Passing Array to Function
//Use:
//
//c
//Copy
//Edit
//void fun(int arr[], int size)
//9. String (Built-in functions)
//strlen, strcpy, strcmp, strcat, strchr, strstr, etc.
//
//10. User Defined String Functions
//Implement same as built-in, e.g.:
//
//mystrlen(char *s) → loop till '\0'
//
//mystrcpy(char *d, char *s) → copy char-by-char
//
//mystrrev(char *s) → swap characters from both ends
//
//11. String Programs
//Use loops and conditions to manipulate strings.
//
//Replace char: if(str[i]=='a') str[i]='$'
//
//Count vowels: check aeiou
//
//Remove char: shift string left
//
//Word count: increment on space
//
//12. Malloc
//int *arr = (int*) malloc(n * sizeof(int));
//
//13-14. Structures
//Define struct:
//
//c
//Copy
//Edit
//struct Student {
//    int roll;
//    char name[20];
//    float marks;
//};
//Create functions:
//
//Pass by value: void display(struct Student s)
//
//Pass by address: void update(struct Student *s)
//
//Other Key Concepts
//Switch Case: Based on menu-driven logic
//
//Searching/Sorting/Updation/Deletion in Array:
//
//Search: linear/binary
//
//Sort: bubble/selection
//
//Update: assign arr[i] = newVal
//
//Delete: shift elements left