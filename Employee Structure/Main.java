#include<iostream>
using namespace std;
struct employee
{
  char name[30];
    char designation[20];
  int ID,age, salary;
};
void details(employee);
int main()
{
  employee e;
  std::cout<<"Enter name:"<<"\n";
  std::cin>>e.name;
  std::cout<<"Enter ID:"<<"\n";
  std::cin>>e.ID;
  std::cout<<"Enter age:"<<"\n";
  std::cin>>e.age;
  std::cout<<"Enter designation:"<<"\n";
  std::cin>>e.designation;
  std::cout<<"Enter Salary:"<<"\n";
  std::cin>>e.salary;
  details(e);
  return 0;
}
void details (employee e)
{
  std::cout<<"Employee Details"<<"\n";
  std::cout<<"Name of the Employee : "<<e.name<<"\n";
  std::cout<<"ID of the Employee : "<<e.ID<<"\n";
  std::cout<<"Age of the Employee : "<<e.age<<"\n";
  std::cout<<"Designation of the Employee : "<<e.designation<<"\n";
  std::cout<<"Salary of the Employee : "<<e.salary<<"\n";
}