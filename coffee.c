#include <stdio.h>

int main()
{

    int x,p,t=0;
    scanf("%d %d",&x,&p);
    while(x>1){
        t= t+x;
        x = x- (x*p/100);
    }
    if(x==1){
        t=t+x;
    }
    printf("%d\n",t);

    return 0;
}
