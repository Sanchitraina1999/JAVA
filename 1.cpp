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
        vector<string>v1;


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
        
        count = ans.length();
        res = ans;
        
        for(auto i=0; i<=ans.; i++)
        {
            res = ans;
            res.insert(i,p);
            v1.push_back(res);
            res = '\0';
        }
        

        for (auto i = v1.begin(); i != v1.end(); ++i) 
        cout << *i << " "; 

        //cout << min_element(v1.begin(), v1.end());/
    }

    return 0;
}