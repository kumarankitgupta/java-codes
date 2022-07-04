/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        Interval[] ni = new Interval[n];
        Interval[] mi = new Interval[m];

        for (int i = 0; i < n; i++) {
            long start = s.nextLong();
            long end = s.nextLong();
            ni[i] = new Interval(start,end);
        }

        for (int i = 0; i < m; i++) {
            long start = s.nextLong();
            long end = s.nextLong();
            mi[i] = new Interval(start,end);
        }
        Arrays.sort(ni,Comparator.comparingLong(b -> b.start));
        Arrays.sort(mi,Comparator.comparingLong(b -> b.start));
        long ans = 0;
        int i = 0, j = 0;
        while(i<n&&j<m){
            /*if(ni[i].end<=mi[j].start){
                i++; // case 1
            }
            else if(ni[i].start>=mi[j].end){
                j++; // case 5
            }
            else if(ni[i].start<mi[j].start&&(ni[i].end>mi[j].start)&&(ni[i].end<mi[j].end)){
                ans += ni[i].end - mi[j].start;
                i++; // case 2
            }
            else if(ni[i].end>mi[j].end&&(ni[i].start>mi[j].start)&&(ni[i].start<mi[j].end)){
                ans += mi[j].end - ni[i].start;
                j++; // case 3
            }
            else if((ni[i].start<=mi[j].start)&&(ni[i].end>mi[j].end)){
                ans += mi[j].end - mi[j].start;
                j++; // case 4
            }
            else if((ni[i].start>=mi[j].start)&&(ni[i].end<mi[j].end)){
                ans += ni[i].end - ni[i].start;
                i++; // case 6
            }
            else if((ni[i].start==mi[j].start)&&(ni[i].end==mi[j].end)){
                ans += ni[i].end - ni[i].start;
                i++;
                j++; // case 7
            }
            else if((ni[i].start<mi[j].start)&&(ni[i].end==mi[j].end)){
                ans += mi[j].end - mi[j].start;
                i++;
                j++; // case 8
            }
            else if((ni[i].start>mi[j].start)&&(ni[i].end==mi[j].end)){
                ans += ni[i].end - ni[i].start;
                i++;
                j++; // case 9
            }
        }*/
        
        // Left bound for intersecting segment
            long l = max(ni[i].start, mi[j].start);

            // Right bound for intersecting segment
            long r = min(ni[i].end, mi[j].end);

            // If segment is valid print it
            if (l <= r)
                ans += r-l;

            // If i-th interval's right bound is
            // smaller increment i else increment j
            if (ni[i].end < mi[j].end)
                i++;
            else
                j++;
        }
        System.out.println(ans);
	}
	
	static long max(long a, long b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    static long min(long a, long b){
        if(a<b){
            return a;
        }else{
            return b;
        }
    }
	
	static class Interval{
        long start;
        long end;
        Interval(long s, long e){
            start = s;
            end = e;
        }
    }
}
