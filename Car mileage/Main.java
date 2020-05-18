#include<iostream>
using namespace std;
int main()
{
  float mil;
  int l,d;
  std::cin>>mil>>l>>d;
  if((mil*l)>=d)
  {
    cout<<"Can reach";
  }
  else
    cout<<"Cannot reach";
}