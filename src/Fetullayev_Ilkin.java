import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fetullayev_Ilkin {
    List<Date>joinList=new ArrayList<>();
    List<Date>leftList=new ArrayList<>();

    public void ilkin_list(int i, List<String> list) throws ParseException
    {


        if ("Joined".equals(list.get(i + 1)))
        {
            System.out.println("Ilkin qosuldu");
            System.out.println(list.get(i+2));
            String list1=list.get(i+2);
            // new SimpleDateFormat("hh:mm:ss a").parse(list1);
            joinList.add(new SimpleDateFormat("MM/DD/YY,hh:mm:ss a").parse(list1));

        }
        else if("Left".equals(list.get(i + 1)))
        {   System.out.println("Ilkin terk etdi");
            System.out.println(list.get(i+2));
            String list2=list.get(i+2);
            leftList.add((new SimpleDateFormat("MM/DD/YY,hh:mm:ss a").parse(list2)));

        }

    }
    public void ilkinprint(int d12,int vaxt,int vaxt1)
    {int s=0;
    boolean sorgu=true;
        if (d12==0)
        {for (int i=0;i<leftList.size();i++)
        {
            if (joinList.get(i).getHours()<leftList.get(i).getHours() && leftList.get(i).getMinutes()!=0){s=60+s;
                sorgu=false;}
        }
            if(sorgu==false){System.out.println("Ilkinin dersde istirak deqiqesi : "+(s+vaxt1-vaxt));}
            else System.out.println("Ilkinin dersde istirak deqiqesi : "+(vaxt1-vaxt));
        }

        else if(d12==1)
        {
            Date zengvaxti=new Date("3/5/2021, 09:59:00 AM\n");
            if ((65+vaxt1-vaxt)!=65){
                for (int i=0;i<leftList.size();i++)
                {
                    if (joinList.get(i).getHours()<leftList.get(i).getHours() && leftList.get(i).getMinutes()!=0)
                    {s=60+s;
                        sorgu=false;
                    }
                }
                if(sorgu==false)
                {
                    System.out.println("ILKININ DERSDE ISTIRAK DEQIQESI : " + (s + Excel1.zeng.getMinutes() + vaxt1 - vaxt));
                }
                else if(joinList.get(joinList.size()-1).getHours()<Excel1.zeng.getHours())  System.out.println("JALENIN DERSDE ISTIRAK DEQIQESI : " + (60+ Excel1.zeng.getMinutes() + vaxt1 - vaxt));

                else  System.out.println("ILKININ DERSDE ISTIRAK DEQIQESI : " + ( Excel1.zeng.getMinutes() + vaxt1 - vaxt));
            }else System.out.println("ILKININ DERSDE ISTIRAK DEQIQESI : 0...");
        }
    }
}

