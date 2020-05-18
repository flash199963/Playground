#include<iostream> 
using namespace std; 
int f(int n) 
{ 
    if (n <= 1) 
        return n; 
    return f(n-1)+f(n-2); 
} 
  
int main () 
{ 
    int n;
  std::cin>>n;
  std::cout <<"The term "<<n<<" in the fibonacci series is "<<f(n-1);  
}