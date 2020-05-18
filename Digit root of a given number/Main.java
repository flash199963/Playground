#include<iostream>

int f(int n)
{
 
if(n<=9)
{

return n;
}
 int s=(n%10)+f(n/10);
  return f(s);
}
 
int main()
{
int n;
std::cin>>n;
  std::cout<<f(n);


}