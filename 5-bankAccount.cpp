#include <iostream>
#include <iomanip>
using namespace std;
class bank
{
char name[20];
int acno;
char actype[20];
int bal;
public :
void openAccount();
void deposit();
void withdraw();
void display();
};

void bank :: openAccount()
{
cout<<endl<<endl;
cout<<"Enter Name :-";
cin>>name;
cout<<"Enter A/c no. :-";
cin>>acno;
cout<<"Enter A/c Type :-";
cin>>actype;
cout<<"Enter Opening Balance:-";
cin>>bal;
}
void bank :: deposit()
{
cout<<"Enter Deposit amount :-";
int deposit=0;
cin>>deposit;
deposit=deposit+bal;
cout<<"\nDeposit Balance = "<<deposit;
bal=deposit;
}
void bank :: withdraw()
{
int withdraw;
cout<<"\nBalance Amount = "<<bal;
cout<<"\nEnter Withdraw Amount :-";
cin>>withdraw;
bal=bal-withdraw;
cout<<"After Withdraw Balance is "<<bal;
}

void bank :: display()
{
cout<<endl<<endl<<endl;
cout<<setw(30)<<"DETAILS\n"<<endl;
cout<<setw(30)<<"Name : "<<name<<endl;
cout<<setw(30)<<"A/c. No. : "<<acno<<endl;
cout<<setw(30)<<"A/c Type : "<<actype<<endl;
cout<<setw(30)<<"Balance : "<<bal<<endl;
}

int main()
{
bank obj1;
int choice;
do
{
cout<<"\n\nChoice List\n\n";
cout<<"1) To assign Initial Value\n";
cout<<"2) To Deposit\n";
cout<<"3) To Withdraw\n";
cout<<"4) To Display All Details\n";
cout<<"5) EXIT\n";
cout<<"Enter your choice :-";
cin>>choice;
switch(choice)
{
case 1: obj1.openAccount();
break;
case 2: obj1.deposit();
break;
case 3: obj1.withdraw();
break;
case 4: obj1.display();
break;
}
}while(choice>0 && choice<5);
cout<<endl;

system("pause");
}
