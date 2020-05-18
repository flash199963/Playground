#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>b;
  std::cin>>a;
  std::cin>>c;
  if(b>(a*75+c*30))
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
   
}