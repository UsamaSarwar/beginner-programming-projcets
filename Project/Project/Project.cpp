#include<iostream>
#include<fstream>
using namespace std;
float calgpa();
float calgpa4();
int game();
void intro();
int main()
{
	intro();
	system("cls");
	int c; char z;
	float cgpa;
again:
	system("color 2E");
	cout << "======================================================================\n";
	cout << "             ==========================================\n\n";
	cout << "\tPress 1 to calculate GPA in 1 subject (3 C.Hour):\n";
	cout << "\tPress 2 to calculate GPA in 1 subject (4 C.Hour):\n";
	cout << "\tPress 3 to calculate GPA in All Subjects:\n";
	cout << "\tPress 4 to calculate CGPA direct from GPA:\n";
	cout << "Enter your choice:\t";
	cin >> c;
	system("cls");
	switch (c)
	{
	case 1:
	{
			  system("color 0B");
			  cgpa = calgpa();
	}
		break;
	case 2:
	{
			  system("color 0B");
			  cgpa = calgpa4();
	}
		break;
	case 3:
	{
			  system("cls");
			  system("COLOR F3");
			  cout << "Enter marks in ECA:\n\n";
			  float gpa1 = calgpa4();
			  system("cls");
			  cout << "Enter marks in ICP:\n\n";
			  float gpa2 = calgpa4();
			  system("cls");
			  cout << "Enter marks in CAG:\n\n";
			  float gpa3 = calgpa();
			  system("cls");
			  cout << "Enter marks in ECC:\n\n";
			  float gpa4 = calgpa();
			  system("cls");
			  cout << "Enter marks in IS:\n\n";
			  float gpa5 = calgpa();
			  system("cls");
			  cout << "Enter marks in ITM:\n\n";
			  float gpa6 = calgpa();
			  cgpa = ((gpa1 * 4) + (gpa2 * 4) + (gpa3 * 3) + (gpa4 * 3) + (gpa5 * 3) + (gpa6 * 3)) / 20.0;
	}
		break;
	case 4:
	{
			  system("color 7C");
			  float gpa1, gpa2, gpa3, gpa4, gpa5, gpa6;
			  cout << "Enter GPA in ECA (Out of 4):\t";
			  cin >> gpa1;
			  cout << "Enter GPA in ICP (Out of 4):\t";
			  cin >> gpa2;
			  cout << "Enter GPA  in ECC (Out of 4):\t";
			  cin >> gpa3;
			  cout << "Enter GPA iN CAG (Out of 4):\t";
			  cin >> gpa4;
			  cout << "Enter GPA in ITM (Out of 4):\t";
			  cin >> gpa5;
			  cout << "Enter GPA in IS (Out of 4):\t";
			  cin >> gpa6;
			  cgpa = ((gpa1 * 4) + (gpa2 * 4) + (gpa3 * 3) + (gpa4 * 3) + (gpa5 * 3) + (gpa6 * 3)) / 20.0;
	}
		break;
	default:
	{
			   cout << "Invalid choice\nPress y to start again." << endl;
			   cin >> z;
			   if (z == 'y' || z == 'Y')
				   system("cls");
			   goto again;
	}
		break;
	}
	if (cgpa >= 3.5)
	{
		cout << "\aCongrats!!! You got CGPA " << cgpa << " , so enjoy the Tic Tac Toe Game!!!" << endl;
		system("pause");
		system("color B4");
		system("cls");
		game();
	}
	else
	{
		cout << "Your CGPA is:\t" << cgpa<<" (i.e less then 3.5)" << endl;
		cout << "So, you can not play the game." << endl;
	}
	system("pause");
}
float calgpa()
{
	float gpa, total, assign = 0, ass[5], quiz = 0, qu[5], ses, ses1, ses1t, ses2, ses2t, terminal, terminalt, c;
	char grade[3];
	cout << "Enter the no off Assignments:\t";
	cin >> c;
	cout << "Enter marks in " << c << " Assignments  (out of 10 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> ass[i];
	}
	for (int i = 0; i < c; i++)
	{
		assign += ass[i];
	}
	assign = assign / c;
	cout << "Enter the no off Quizes:\t";
	cin >> c;
	cout << "Enter marks in " << c << " Quizes  (out of 15 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> qu[i];
	}
	for (int i = 0; i < c; i++)
	{
		quiz += qu[i];
	}
	quiz = quiz / c;
	cout << "Enter marks in 1st Sessional  (Obtained and then total):\n";
	cin >> ses1 >> ses1t;
	ses1 = ses1t / ses1;
	ses1 = 10 / ses1;
	cout << "Enter marks in 2nd sessional  (Obtained and then total):\n";
	cin >> ses2 >> ses2t;
	ses2 = ses2t / ses2;
	ses2 = 15 / ses2;
	cout << "Enter Marks in Termainal Exam  (Obtained and then total):\n";
	cin >> terminal >> terminalt;
	terminal = terminalt / terminal;
	terminal = 50 / terminal;
	ses = ses1 + ses2 + terminal;
	total = assign + quiz + ses;
	cout << "Your marks in this subject:\t" << total << endl;
	if (total >= 90)
	{
		strcpy_s(grade, "A");
		gpa = 4.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 85 && total < 89)
	{
		strcpy_s(grade, "A-");
		gpa = 3.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 80 && total <= 84)
	{
		strcpy_s(grade, "B+");
		gpa = 3.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 75 && total <= 79)
	{
		strcpy_s(grade, "B");
		gpa = 3.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 70 && total <= 74)
	{
		strcpy_s(grade, "B-");
		gpa = 2.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 65 && total <= 69)
	{
		strcpy_s(grade, "C+");
		gpa = 2.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 60 && total <= 64)
	{
		strcpy_s(grade, "C");
		gpa = 2.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 55 && total <= 59)
	{
		strcpy_s(grade, "C-");
		gpa = 1.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 50 && total <= 54)
	{
		strcpy_s(grade, "D");
		gpa = 1.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total < 50)
	{
		strcpy_s(grade, "F");
		gpa = 0.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	cout << endl;
	return gpa;
}
float calgpa4()
{
	float gpa, total, totalt, assign = 0, ass[5], quiz = 0, qu[5], ses, ses1, ses1t, ses2, ses2t, terminal, terminalt, c;
	float lab, lassign = 0, lass[5], lquiz = 0, lqu[5], lses, lses1, lses1t, lses2, lses2t, lterminal, lterminalt;
	char grade[3];
	cout << "Enter the no of Assignments:\t";
	cin >> c;
	cout << "Enter marks in " << c << " Assignments  (out of 10 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> ass[i];
	}
	for (int i = 0; i < c; i++)
	{
		assign += ass[i];
	}
	assign = assign / c;
	cout << "Enter the no of Quizes:\t";
	cin >> c;
	cout << "Enter marks in " << c << " Quizes  (out of 15 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> qu[i];
	}
	for (int i = 0; i < c; i++)
	{
		quiz += qu[i];
	}
	quiz = quiz / c;
	cout << "Enter marks in 1st Sessional  (Obtained and then total):\n";
	cin >> ses1 >> ses1t;
	ses1 = ses1t / ses1;
	ses1 = 10 / ses1;
	cout << "Enter marks in 2nd sessiona  (Obtained and then total):\n";
	cin >> ses2 >> ses2t;
	ses2 = ses2t / ses2;
	ses2 = 15 / ses2;
	cout << "Enter Marks in Termainal Exam  (Obtained and then total):\n";
	cin >> terminal >> terminalt;
	terminal = terminalt / terminal;
	terminal = 50 / terminal;
	ses = ses1 + ses2 + terminal;
	totalt = assign + quiz + ses;
	cout << "Enter the no off lab Assignments:\t";
	cin >> c;
	cout << "Enter marks in " << c << " lab Assignments  (out of 10 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> lass[i];
	}
	for (int i = 0; i < c; i++)
	{
		lassign += lass[i];
	}
	lassign = lassign / c;
	cout << "Enter the no off lab Quizes:\t";
	cin >> c;
	cout << "Enter marks in " << c << " lab Quizes  (out of 15 in each):\n";
	for (int i = 0; i < c; i++)
	{
		cin >> lqu[i];
	}
	for (int i = 0; i < c; i++)
	{
		lquiz += lqu[i];
	}
	lquiz = lquiz / c;
	cout << "Enter marks in 1st lab Sessional  (Obtained and then total):\n";
	cin >> lses1 >> lses1t;
	lses1 = lses1t / lses1;
	lses1 = 10.0 / lses1;
	cout << "Enter marks in 2nd lab sessiona  (Obtained and then total):\n";
	cin >> lses2 >> lses2t;
	lses2 = lses2t / lses2;
	lses2 = 15.0 / lses2;
	cout << "Enter Marks in Termainal lab Exam  (Obtained and then total):\n";
	cin >> lterminal >> lterminalt;
	lterminal = lterminalt / lterminal;
	lterminal = 50.0 / lterminal;
	lses = lses1 + lses2 + lterminal;
	lab = lassign + lquiz + lses;
	total = ((totalt * 3) + (lab * 1)) / (3 + 1);
	cout << "Your total marks in this subject:\t" << total << endl;
	if (total >= 90)
	{
		strcpy_s(grade, "A");
		gpa = 4.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 85 && total < 89)
	{
		strcpy_s(grade, "A-");
		gpa = 3.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 80 && total <= 84)
	{
		strcpy_s(grade, "B+");
		gpa = 3.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 75 && total <= 79)
	{
		strcpy_s(grade, "B");
		gpa = 3.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 70 && total <= 74)
	{
		strcpy_s(grade, "B-");
		gpa = 2.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 65 && total <= 69)
	{
		strcpy_s(grade, "C+");
		gpa = 2.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 60 && total <= 64)
	{
		strcpy_s(grade, "C");
		gpa = 2.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 55 && total <= 59)
	{
		strcpy_s(grade, "C-");
		gpa = 1.7;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total >= 50 && total <= 54)
	{
		strcpy_s(grade, "D");
		gpa = 1.3;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	else if (total < 50)
	{
		strcpy_s(grade, "F");
		gpa = 0.0;
		cout << "Your grade is:\t" << grade << endl << "Your Gpa in this subject is:\t" << gpa;
	}
	cout << endl;
	return gpa;
}
char square[10] = { 'o', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

int checkwin();
void board();

int game()
{
	ofstream out("data.txt",ios::app);
	int c;
	cout << "Press 1 to Play the game\nPress 2 to view the record of previous games\n";
	cout << "Enter your choice:\t";
	cin >> c;
	switch (c)
	{
	case 2:
	{
			  const int max = 1000;
			  char disp[max];
			  ifstream in("data.txt");
			  while (!in.eof())
			  {
				  in.getline(disp, max);
				  cout << disp<<endl;
			  }
	}
		break;
	case 1:
	{
			  int player = 1, i, choice;
			  char name1[50], name2[50];
			  cin.sync();
			  cout << "Enter your name (Player 1):\t";
			  cin.getline(name1, 50);
			  out << "Player 1 is:\t" << name1 << endl;
			  cin.sync();
			  cout << "Enter your friend's name (Player 2):\t";
			  cin.getline(name2, 50);
			  out << "Player 2 is:\t" << name2 << endl;
			  char mark;
			  do
			  {
				  board();
				  player = (player % 2) ? 1 : 2;

				  cout << "Player " << player << ", enter a number:  ";
				  cin >> choice;

				  mark = (player == 1) ? 'X' : 'O';

				  if (choice == 1 && square[1] == '1')

					  square[1] = mark;
				  else if (choice == 2 && square[2] == '2')

					  square[2] = mark;
				  else if (choice == 3 && square[3] == '3')

					  square[3] = mark;
				  else if (choice == 4 && square[4] == '4')

					  square[4] = mark;
				  else if (choice == 5 && square[5] == '5')

					  square[5] = mark;
				  else if (choice == 6 && square[6] == '6')

					  square[6] = mark;
				  else if (choice == 7 && square[7] == '7')

					  square[7] = mark;
				  else if (choice == 8 && square[8] == '8')

					  square[8] = mark;
				  else if (choice == 9 && square[9] == '9')

					  square[9] = mark;
				  else
				  {
					  cout << "Invalid move ";

					  player--;
					  cin.ignore();
					  cin.get();
				  }
				  i = checkwin();

				  player++;
			  } while (i == -1);
			  board();
			  //ofstream out("data.txt");
			  if (i == 1)
			  {
				  cout << "==>\aPlayer " << --player << " win ";
				  if (player == 1)
				  {
					  cout << " (" << name1 << " wins)" << endl;
					  out << "Winner is:\t" << name1 << endl;
				  }
				  if (player == 2)
				  {
					  cout << " (" << name2 << " wins)" << endl;
					  out << "Winner is:\t" << name2 << endl;
				  }
			  }
			  else
			  {
				  cout << "==>\aGame draw" << endl;
				  out << "Game Draw" << endl;
			  }
	}
		break;
	default:
	{
			   cout << "Invalid choice."<<endl;
	}
	}

	//cin.ignore();
	//cin.get();
	return 0;
}

/*********************************************

FUNCTION TO RETURN GAME STATUS
1 FOR GAME IS OVER WITH RESULT
-1 FOR GAME IS IN PROGRESS
O GAME IS OVER AND NO RESULT
**********************************************/

int checkwin()
{
	if (square[1] == square[2] && square[2] == square[3])

		return 1;
	else if (square[4] == square[5] && square[5] == square[6])

		return 1;
	else if (square[7] == square[8] && square[8] == square[9])

		return 1;
	else if (square[1] == square[4] && square[4] == square[7])

		return 1;
	else if (square[2] == square[5] && square[5] == square[8])

		return 1;
	else if (square[3] == square[6] && square[6] == square[9])

		return 1;
	else if (square[1] == square[5] && square[5] == square[9])

		return 1;
	else if (square[3] == square[5] && square[5] == square[7])

		return 1;
	else if (square[1] != '1' && square[2] != '2' && square[3] != '3'
		&& square[4] != '4' && square[5] != '5' && square[6] != '6'
		&& square[7] != '7' && square[8] != '8' && square[9] != '9')

		return 0;
	else
		return -1;
}


/*******************************************************************
FUNCTION TO DRAW BOARD OF TIC TAC TOE WITH PLAYERS MARK
********************************************************************/


void board()
{
	system("cls");
	cout << "\n\n\tTic Tac Toe\n\n";

	cout << "Player 1 (X)  -  Player 2 (O)" << endl << endl;
	cout << endl;

	cout << "     |     |     " << endl;
	cout << "  " << square[1] << "  |  " << square[2] << "  |  " << square[3] << endl;

	cout << "_____|_____|_____" << endl;
	cout << "     |     |     " << endl;

	cout << "  " << square[4] << "  |  " << square[5] << "  |  " << square[6] << endl;

	cout << "_____|_____|_____" << endl;
	cout << "     |     |     " << endl;

	cout << "  " << square[7] << "  |  " << square[8] << "  |  " << square[9] << endl;

	cout << "     |     |     " << endl << endl;
}
void intro()
{
	system("color B4");
	cout << "------------------------------------------------------------\n";
	cout << "             --------------------------------\n\n";
	cout << "                     GPA Calculator\n\n";
	cout << "Made by:\n\n";
	cout << "1:\t\tAbdullah Siddique          (SP15-BCS-068-B)\n";
	cout << "2:\t\tHamza Yousaf               (SP15-BCS-056-B)\n";
	cout << "3:\t\tAasim Saeed                (SP15-BCS-065-B)\n";
	cout << "4:\t\tShamshad Hussain           (SP15-BCS-095-B)\n";
	system("pause");
}