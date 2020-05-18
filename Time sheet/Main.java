#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sat,salary=0;
  //float salary=0.0;
  cin>>s>>m>>t>>w>>th>>f>>sat;
  cout<<fixed;
  if(s<=24 && s>=0)
    salary+=(s*100)+(s*50);
  if(m<=24)
  if(m>8)
    salary+=m*100+((m-8)*15);
   else
     salary+=m*100;
  if(t<=24)
  if(t>8)
    salary+=t*100+((t-8)*15);
  else
    salary+=t*100;
  if(w<=24)
  if(w>8)
    salary+=w*100+((w-8)*15);
  else
    salary+=w*100;
  if(th<=24)
  if(th>8)
    salary+=th*100+((th-8)*15);
  else
    salary+=th*100;
  if(f<=24)
  if(f>8)
    salary+=f*100+((f-8)*15);
  else
    salary+=f*100;
  if(sat<=24 && sat>=0)
    salary+=(sat*100)+(sat*25);
  if((s+m+t+w+th+f+sat)>=40 && s==0 && sat==0 )
    salary+=(((s+m+t+w+th+f+sat)-40)*25);
  cout<<salary;
}