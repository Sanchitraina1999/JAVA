#include<bits/stdc++.h>
using namespace std;

int main()
{
    long long t,count;
    cin>>t;

    while(t--)
    {
        string s,p,ans,res;
        cin>>s>>p;

        map<char,long long>mp;


         for(auto it : s)
        {
            mp[it]++;
        }

        for(auto it : p)
        {
            mp[it]--;
        }
        
         for (auto itr: mp) 
         { 
            ans+=string(itr.second,itr.first);
        }
        res = ans;
        string least=ans+p;
        for(auto i=0; i<=ans.length(); i++)
        {
            res = ans;
            res.insert(i,p);
            least=min(least,res);
        }

        cout << least<<"\n";
    }
    return 0;
}