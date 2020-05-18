#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  if(0<n<=200)
  {
    n*=0.5;
    std::cout<<"Rs."<<n;
  }
  else if(200<n<=400)
  {
    n*=0.65+100;
    std::cout<<"Rs."<<n;
  }
  else if(400<n<=600)
  {
    n*=0.80+200;
    std::cout<<"Rs."<<n;
  }
  else
  {
    n*=1.25+425;
    std::cout<<"Rs."<<n;

  }
}