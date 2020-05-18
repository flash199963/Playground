#include<iostream>
using namespace std;
struct calc
{
    float real;
    float img;
}s1,s2;

int main()
{
    float a,b;
    int ch;
    cin>>ch;
    cin>>s1.real;
    cin>>s1.img;
    cin>>s2.real;
    cin>>s2.img;
    
    switch(ch)
    {
        case 1:
        {
            	a=(s1.real)+(s2.real);
            	b=(s1.img)+(s2.img);
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
        
        case 2:
        {
            	a=(s1.real)-(s2.real);
                b=(s1.img)-(s2.img);
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
        
        case 3:
        {
            	a=((s1.real)*(s2.real))-((s1.img)*(s2.img));
                b=((s1.real)*(s2.img))+((s2.real)*(s1.img));
            	
            	if(b<0)
            	{
            	    cout<<a<<b<<"i";
            	}
            	else
            	    cout<<a<<"+"<<b<<"i";
          break;
        }
      default:
        {
          cout<<"Invalid choice";
          break;
        }
    }
}