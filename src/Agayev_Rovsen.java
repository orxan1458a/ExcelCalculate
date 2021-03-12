import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Agayev_Rovsen {
    List<Date> joinList=new ArrayList<>();
    List<Date>leftList=new ArrayList<>();
static boolean sorgu=true;

    public void rovsen_list(int i, List<String> list) throws ParseException
    {


        if ("Joined".equals(list.get(i + 1)))
        {
            System.out.println("Agayev Rovsen qosuldu");
            System.out.println(list.get(i+2));
            String list1=list.get(i+2);
            // new SimpleDateFormat("hh:mm:ss a").parse(list1);
            Date qaq=new SimpleDateFormat("MM/DD/YY,hh:mm:ss a").parse(list1);
            joinList.add(qaq);



        }
        else if("Left".equals(list.get(i + 1)))
        {
            System.out.println("Agayev Rovsen terk etdi");
            System.out.println(list.get(i+2));
            String list2=list.get(i+2);
            Date qaq1=new SimpleDateFormat("MM/DD/YY,hh:mm:ss a").parse(list2);
            leftList.add(qaq1);




        }

    }
    public void rovsenprint(int d16,int vaxt,int vaxt1)
    {int agaa=0,s=0;


        if (d16==0)
        {for (int i=0;i<leftList.size();i++)
        {
            if (joinList.get(i).getHours()<leftList.get(i).getHours() && leftList.get(i).getMinutes()!=0){s=60+s;
                sorgu=false;}
        }
        if(sorgu==false){System.out.println("Agayevin Rovsenin dersde istirak deqiqesi : "+(s+vaxt1-vaxt));}
            else System.out.println("Agayevin Rovsenin dersde istirak deqiqesi : "+(vaxt1-vaxt));
        }

        else if(d16==1)
        {
            if((vaxt1-vaxt)!=0)
            {
                for (int i=0;i<leftList.size();i++)
                {
                    if (joinList.get(i).getHours()<leftList.get(i).getHours() && leftList.get(i).getMinutes()!=0)
                    {s=60+s;
                    sorgu=false;
                    }
                }
                if(sorgu==false)
                {
                    System.out.println("AGAYEV ROVSENIN DERSDE ISTIRAK DEQIQESI : " + (s + Excel1.zeng.getMinutes() + vaxt1 - vaxt));
                }
                else if(joinList.get(joinList.size()-1).getHours()<Excel1.zeng.getHours())  System.out.println("JALENIN DERSDE ISTIRAK DEQIQESI : " + (60+ Excel1.zeng.getMinutes() + vaxt1 - vaxt));

                else  System.out.println("AGAYEV ROVSENIN DERSDE ISTIRAK DEQIQESI : " + ( Excel1.zeng.getMinutes() + vaxt1 - vaxt));
            }else System.out.println("AGAYEV ROVSENIN DERSDE ISTIRAK DEQIQESI : 0...");
        }
    }
}
