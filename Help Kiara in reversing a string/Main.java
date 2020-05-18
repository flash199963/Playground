#include<iostream>
int main()
{
char str[100];  
std::cin.getline(str,100);
int count=0,i;    
std::cin>>str;
  for(i=0;str[i]!='\0';i++)
  {
    count++;
  }
  for(i=count-1;i>=0;i--)
  {
    std::cout<<str[i];
  }
}