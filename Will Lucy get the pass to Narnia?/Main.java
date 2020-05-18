#include<iostream>
int main()
{
  int x,y,ch;
  std::cout<<"Enter first number :";
  std::cin>>x;
  std::cout<<" Enter second number :";
  std::cin>>y;
  std::cout<<" Menu";
  std::cout<<"\n1.Addition";
  std::cout<<"\n2.Subtraction";
  std::cout<<"\n3.Multiplication";
  std::cout<<"\n4.Division";
  std::cout<<"\n5.Remainder";
  std::cin>>ch;
  switch(ch)
  {
    case 1:
  std::cout<<"\n"<<(x+y);
  break;
  case 2:
  std::cout<<"\n"<<(x-y);
  break;
  case 3:
  std::cout<<"\n"<<(x*y);
  break;
  case 4:
  std::cout<<"\n"<<(x/y);
  break;
  case 5:
  std::cout<<"\n"<<(x%y);
  break;
    default:
    std::cout<<"\nInvalid operation";
  }
}

  