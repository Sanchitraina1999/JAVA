#include <bits/stdc++.h>
typedef long long ll;
#define forn(i, a, b) for (ll i = a; i < ll(b); i++)
#define MOD 1000000007
#define see(param) cerr << #param << " is : " << param << "\n";
#define all(x) (x).begin(), (x).end()
#define rev(x) reverse(all(x))
#define pb push_back
#define f first
#define s second
#define has(x, el) (find(all(x), el) != x.end())
#define FAST                          \
    ios_base::sync_with_stdio(false); \
    cin.tie(NULL);                    \
    cout.tie(NULL);
#define TC    \
    ll T;     \
    cin >> T; \
    while (T--)
using namespace std;
template <typename T>
ostream &operator<<(ostream &os, const map<T, T> &m)
{
    os << "\n{";
    string sep;
    for (const auto &x : m)
        os << sep << x.f << ":" << x.s, sep = "\n ";
    return os << '}';
}
template <typename T>
ostream &operator<<(ostream &os, const vector<T> &v)
{
    os << '{';
    string sep;
    for (const auto &x : v)
        os << sep << x, sep = ", ";
    return os << '}';
}
bool isPal(string str)
{
    string s = str;
    reverse(all(str));
    if (s == str)
        return true;
    return false;
}
bool isPrime(ll n)
{
    if (n == 1 or (n > 2 and n % 2 == 0))
        return false;
    else
    {
        for (ll i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
bool odd(ll n) { return n & 1; }
ll sumn(ll n) { return (n * (n + 1)) / 2; }
ll nc2(ll n) { return (n * (n - 1)) / 2; }
ll gcd(ll a, ll b) { return __gcd(a, b); }
ll lcm(ll a, ll b) { return (a * b) / (__gcd(a, b)); }
ll power(ll b, ll p)
{
    ll res = 1;
    while (p)
    {
        if (p & 1)
            res *= b;
        b = b * b;
        p /= 2;
    }
    return res;
}
ll powerMOD(ll b, ll p, ll mod = MOD)
{
    ll res = 1;
    while (p != 0)
    {
        if (p % 2 == 0)
        {
            b = (b * b) % mod;
            p /= 2;
        }
        else
        {
            res = (res * b) % mod;
            p--;
        }
    }
    return res;
}
ll powerStringMod(ll b, string p, ll mod = MOD)
{
    ll remB = 0;
    for (ll i = 0; i < p.length(); i++)
        remB = (remB * 10 + p[i] - '0') % (mod - 1);
    return powerMOD(b, remB, mod);
} //if mod is Prime
ll numOfSubsequences(string s, string t)
{
    vector<ll> dp(t.length() + 1, 0);
    dp[0] = 1;
    forn(C, 0, s.length())
    {
        for (ll X = t.length() - 1; ~X; X--)
        {
            if (t[X] == s[C])
            {
                dp[X + 1] += dp[X];
            }
        }
    }
    return dp[t.length()];
}
#define N 3
ll I[N][N];
void mul(ll I[][N], ll A[][N], ll dim)
{
    ll res[dim + 1][dim + 1];
    forn(i, 1, dim + 1)
    {
        forn(j, 1, dim + 1)
        {
            res[i][j] = 0;
            forn(k, 1, dim + 1) { res[i][j] += (I[i][k] * A[k][j]); }
        }
    }
    forn(i, 1, dim + 1)
    {
        forn(j, 1, dim + 1) { I[i][j] = res[i][j]; }
    }
}
void power(ll A[][N], ll dim, ll n)
{
    memset(I, 0, sizeof(I));
    forn(i, 1, dim + 1) { I[i][i] = 1; }
    while (n)
    {
        if (n & 1)
            mul(I, A, dim);
        if (n == 1)
            break;
        mul(A, A, dim);
        n /= 2;
    }
    forn(i, 1, dim + 1)
    {
        forn(j, 1, dim + 1) { A[i][j] = I[i][j]; }
    }
}

int32_t main()
{
    FAST;
    TC
    {
        ll n;
        cin>>n;
        ll a[n],sum[n];
        forn(i,0,n)cin>>a[i];
        sum[0]=a[0];
        map<vector<ll>,ll> occurrences;
        forn(i,0,n){
            vector<ll>x;
            forn(j,i,n){
                x.pb(a[j]);
                occurrences[x]++;
            }
        }
        // for(auto i: occurrences){
        //     cout<<"[";
        //     for(auto j: i.f){
        //         cout<<j<<",";
        //     }
        //     cout<<"]-> ";
        //     cout<<i.s<<"\n";
        // }
        forn(i,1,n)sum[i]=sum[i-1]+a[i];
        ll maxx=INT_MIN;
        forn(i,0,n){
            forn(j,i,n){
                if(==j){
                    maxx=max(maxx,a[j]);
                }
                else{
                    maxx=max(maxx,)
                }
            }
        }
    }
    return 0;
}