#include <iostream>
using namespace std;

int
main () 
{
  
int n, count = 1;
  
cin >> n;
  
for (int i = 1; i <= n; ++i)
    
    {
      
for (int j = 1; j <= i; ++j)
	
	{
	  
if (j == 1)
	    
	    {
	      
std::cout << count;
	    
}
	  
	  else
	    
	    {
	      
std::cout << "*" << count;
	    
}
	
}
      
count++;
      
std::cout << "\n";
    
}
  
for (int i = n; i >= 1; --i)
    
    {
      
for (int j = 1; j <= i; ++j)
	
	{
	  
if (j == 1)
	    
	    {
	      
std::cout<<count-1;
	    
}
	  
	  else
	    
	    {
	      
std::cout<<"*"<<count-1;
	    
}
	
}
      
--count;
      
std::cout <<"\n";
    
}

}