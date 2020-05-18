#include<iostream>
#include<string.h>
#include<algorithm>
int main()
{
  std::string str;
  std::getline(std::cin,str);
  std::string btr;
  std::getline(std::cin,btr);
  std::reverse(btr.begin() , btr.end());
  if(str==btr)
  std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}