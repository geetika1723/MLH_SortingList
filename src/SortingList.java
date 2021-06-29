import java.util.*;
public class SortingList 
{
	public void sort_hask(String h[],String d[])
	{
		for(int i=0;i<h.length-1;i++)
		{
			for(int j=0;j<h.length-1-i;j++)
			{
				if(h[j+1].compareTo(h[j])<0)
				{
					String temp1=h[j];
					h[j]=h[j+1];
					h[j+1]=temp1;
					String temp2=d[j];
					d[j]=d[j+1];
					d[j+1]=temp2;
				}
			}
		}
	}
	public void sort_hask_date(String h[],String d[])
	{
		for(int i=0;i<d.length-1;i++)
		{
			for(int j=0;j<d.length-1-i;j++)
			{
				if(d[j+1].compareTo(d[j])<0)
				{
					String temp1=h[j];
					h[j]=h[j+1];
					h[j+1]=temp1;
					String temp2=d[j];
					d[j]=d[j+1];
					d[j+1]=temp2;
				}
			}
		}
	}
	public void print(String h[],String d[])
	{
		for(int i=0;i<h.length;i++)
		{
			System.out.println(h[i]+"\t\t"+d[i]);
		}
	}
	public static void main(String args[])
	{
		String hack[]= {
				"CruzHacks",
                "Elle Hacks",
                "Hack the Northeast Beyond",
                "SB Hacks" ,
                "HackDavis" ,
                "Rose Hack" ,
                "BoilerMake" ,
                "Hack Your Portfolio",
                "QHacks",
                "TechTogether Seattle",
                "Cuny Hackathon",
                "Hack@Brown",
                "Hex Cambridge 2021",
                "QWER Hacks",
                "CuHacking",
                "Hoya Hacks",
                "Swamp Hacks",
                "Chackit",
                "HackViolet",
                "Hacklytics",
                "KU HackFest 2021",
                "Pearl Hacks",
                "BrickHack 7",
                "StormHacks"
		};
		String hack_dates[]= {
				"01/15/2021",
                "01/15/2021",
               "01/15/2021",
                "01/15/2021",
                "01/16/2021",
                "01/16/2021",
                 "01/22/2021",
                "01/22/2021",
                "01/22/2021",
                "01/22/2021",
                "01/23/2021",
                "01/23/2021",
                "01/23/2021",
                "01/23/2021",
                "01/29/2021",
                "01/29/2021",
                "01/29/2021",
                "01/30/2021",
                "01/30/2021",
                "02/5/2021",
                "02/19/2021",
                "02/19/2021",
                "02/20/2021",
                "02/20/2021"
		};
		SortingList it=new SortingList();
		it.sort_hask(hack, hack_dates);
		System.out.println("Sorted alphabetically");
		System.out.println();
		System.out.println();
		it.print(hack, hack_dates);
		it.sort_hask_date(hack, hack_dates);
		System.out.println("Sorted Date Wise");
		it.print(hack, hack_dates);
		
		
	}
}