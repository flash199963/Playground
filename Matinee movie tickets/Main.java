#include<iostream>
int main()
{
  int age;
  float time;
  std::cin>>age;
  std::cin>>time;
  if(time<=12.00)
  {
    if(age>13)
    {
      std::cout<<"$"<<"8.00";
    }
    else
    {
      std::cout<<"$"<<"4.00";
    }
  }
   if(time>12.00)
    {
      if(age>13)
    {
      std::cout<<"$5.00";
    }
    else
    {
      std::cout<<"$2.00";
    }
    }
}