#include <iostream>
using namespace std;

class TollBooth{
       int PayCar,noPayCar;
       double ttax;
public:
       TollBooth()
       {
              ttax=0;
              PayCar=0;
              noPayCar=0;
       }
       void PayingCar(int a)
       {
       PayCar=PayCar+a;
       for(int i=0;i<=PayCar;i++)
       {
              ttax=ttax+0.50;
       }
       }
       void noPayingCar(int b)
       {
       noPayCar=noPayCar+b;
       }
       void display()
       {
       cout<<"Total No's of payed cars are : "<<PayCar<<endl;
       cout<<"Total tax Collected is : "<<ttax<<endl;
       cout<<"Total No's of not payed cars are : "<<noPayCar<<endl;
     
       }
};
int main()
{
       TollBooth tb;
       char press,input;
       int a,b;
 do{
     
       cout<<"Press 1 for Car pay Toll Tax "<<endl;
       cout<<"Press 2 for Car not pay Toll tax"<<endl;
       cout<<"Press 3 for Total tax and Exit"<<endl;
       cin>>press;

       switch(press)
       {
       case '1':
              {
                     cout<<"Enter No of the cars pay tax"<<endl;
                     cin>>a;
                     tb.PayingCar(a);
                     break;
              }
       case '2':
              {
                     cout<<"Enter No of cars not pay tax"<<endl;
                     cin>>b;
                     tb.noPayingCar(b);
                     break;
              }     
       }
       cout<<"Press y to continue and n for terminate"<<endl;
       cin>>input;
       }
       while(input=='y');
       tb.display();
    system("pause");
}
