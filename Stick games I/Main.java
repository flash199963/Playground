#include<iostream>
using namespace std;
int main()
{
 int r,c;
  std::cin>>r>>c;
  if(r>c)
  {
  if(c%2==0)
  {
    std::cout<<"Mani Iyer";
  }
    else
    {
      std::cout<<"Arun Gupta";
    }
  }
  else
  {
      if(r%2==0)
      {
    std::cout<<"Mani Iyer";
      }
    else
    {
      std::cout<<"Arun Gupta";
    }
  }
}