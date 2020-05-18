#include<iostream>
using namespace std;
int main()
{
  char str[50];
  std::cin>>str;
  int i,count=0;
  for(i=0;str[i]!='\0';i++)
  {
    count++;
  }
  std::cout<<"The number of letters in the name is "<<count;
}