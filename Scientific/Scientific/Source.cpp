#include <iostream>
#include <stdio.h>
#include <math.h>
using namespace std;
////////////////////////////////////////////////////////////////////////
double mc(double x, double y) //Multiply two numbers
{
	cout << "\n\n" << x << " times " << y << " equals ";
	return (x*y);
}
double ac(double a, double b) //Add two numbers
{
	cout << "\n\n" << a << " plus " << b << " equals ";
	return (a + b);
}
double sc(double z, double c) //Subtract two numbers
{
	cout << "\n\n" << z << " minus " << c << " equals ";
	return (z - c);
}
double dc(double o, double t) //Divide two numbers
{
	cout << "\n\n" << o << " divided by " << t << " equals ";
	return (o / t);
}
double sqrt(double d)
{
	cout << "\n\n" << "Square root of " << d << " equals ";
	return(sqrt(d));
}
double sq(double d)
{
	cout << "\n\n" << "Square of " << d << " equals ";
	return(pow(d, 2));
}
double logg(double f)
{
	cout << "\n\n" << "Log of " << f << " equals ";
	return(log(f));

}




void calc(char choice)
{
	double on, tw, thr;
	if (choice == '+') //This whole block checks what the user wants to calculate, and refers to the proper function to calculate it.
	{
		cout << "You selected " << choice << ". Please enter two numbers,\nsepperated by spaces,";
		cout << "that you want to add." << endl;//print instructions for the user
		cin >> on;//Get the value of variable on
		cin >> tw;//Get the value of variable tw
		thr = ac(on, tw);//Get the sum of on and tw, and assign that value to thr
		cout << thr << "\n\n\n\aThanks for using my calculator!";//Print a thank you message
	}
	else if (choice == '-')
	{
		cout << "You selected " << choice << ". Please enter two numbers,\nsepperated by spaces, that you want to subtract." << endl;
		cin >> on;
		cin >> tw;
		thr = sc(on, tw);
		cout << thr << "\n\n\n\aThanks for using my calculator!";
	}
	else if (choice == '*')
	{
		cout << "You selected " << choice << ". Please enter two numbers,\nsepperated by spaces, that you want to multiply." << endl;
		cin >> on;
		cin >> tw;
		thr = mc(on, tw);
		cout << thr << "\n\n\n\aThanks for using my calculator!";
	}
	else if (choice == '/')
	{
		cout << "You selected " << choice << ". Please enter two numbers,\nsepperated by spaces, that you want to divide." << endl;
		cin >> on;
		cin >> tw;
		thr = dc(on, tw);
		cout << thr << "\n\n\n\aThanks for using my calculator";
	}
	else if (choice == '2')
	{
		cout << "You selected Square." << "Please enter a number,\nthat you want to square. " << endl;
		cin >> on;
		thr = sq(on);
		cout << thr << "\n\n\n\aThanks for using my calculator";
	}
	else if (choice == '1')
	{
		cout << "You selected Square root." << "Please enter a number,\nthat you want the square root of. " << endl;
		cin >> on;
		thr = sqrt(on);
		cout << thr << "\n\n\n\aThanks for using my calculator";
	}

	else if (choice == 'L' || choice == 'l')
	{
		cout << "You selected Log to base 10." << "Please enter a number,\nthat you want the log of. " << endl;
		cin >> on;
		thr = logg(on);
		cout << thr << "\n\n\n\aThanks for using my calculator";
	}
	else if (choice == 'c' || choice == 'C')
	{
		cout << "You selected Cosine." << "Please enter a number,\nthat you want the cosine of. " << endl;
		cin >> on;
		thr = logg(on);
		cout << thr << "\n\n\n\aThanks for using my calculator";
	}
	else
	{
		cout << "\nPlease reenter that value.\n\a";
		cin >> choice;
		calc(choice);
	}
}

int main()
{
	double one, two, three;
	char choice;
	cin >> choice;
	while (choice != 'e')
	{
		cout << "\nPlease enter +,-,*, /, 2(for Square),L(for log base 10), c(for cosine) or 1(for square root) and then two numbers,\nsepperated by spaces, that you wish to\nadd,subtract,multiply,or divide.\nType e and press enter to exit.";
		cin >> choice;
		if (choice != 'e')
		{
			calc(choice);
		}
	}
	system("pause");
	return 0;
}
