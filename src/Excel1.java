import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Time;
import java.text.DateFormat;
import java.util.*;


import jdk.swing.interop.SwingInterOpUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Excel1
{   static Date zeng=new Date();
;

    public static void main(String[] args)
    {
        System.out.println("WELCOME TO THE EXCEL CALCULATOR...");
        System.out.println("PLEASE, ENTER NUMBER...");
        System.out.println("<<< 1.FIRST LESSON  >>>\n<<< 2.SECOND LESSON >>>\n<<< 3.THIRD LESSON  >>>");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();

        if(number==1){zeng.setHours(10);zeng.setMinutes(65);zeng.setSeconds(00);}
        else if(number==2){zeng.setHours(11);zeng.setMinutes(50);zeng.setSeconds(00);}
        else if(number==3){zeng.setHours(13);zeng.setMinutes(55);zeng.setSeconds(00);}
        else if(number==4){zeng.setHours(15);zeng.setMinutes(40);zeng.setSeconds(00);}
        System.out.println(zeng.getMinutes());
        List<String> list=new ArrayList<>();
        Mansirov_Orxan mansirov_orxan=new Mansirov_Orxan();
        Ashirova_Solmaz ashirova_solmaz=new Ashirova_Solmaz();
        Heyderova_Gulxanim heyderova_gulxanim=new Heyderova_Gulxanim();
        Fetullayev_Ilkin fetullayev_ilkin=new Fetullayev_Ilkin();
        Babazade_Hafiz babazade_hafiz=new Babazade_Hafiz();
        Agayev_Rovsen agayev_rovsen=new Agayev_Rovsen();
        Hesenov_Huseyn hesenov_huseyn=new Hesenov_Huseyn();
        Rehimli_Kamal rehimli_kamal=new Rehimli_Kamal();
        Xaneliyev_Elcin xaneliyev_elcin=new Xaneliyev_Elcin();
        Memmedli_Hevva memmedli_hevva=new Memmedli_Hevva();
        Huseynli_Teymur huseynli_teymur=new Huseynli_Teymur();
        Mustafayev_Anar mustafayev_anar=new Mustafayev_Anar();
        Huseynzade_Eli huseynzade_eli=new Huseynzade_Eli();
        Suleymanli_Rovsen suleymanli_rovsen=new Suleymanli_Rovsen();
        Abdullayeva_Gunel abdullayeva_gunel=new Abdullayeva_Gunel();
        Qasimova_Jale qasimova_jale=new Qasimova_Jale();

int agaa=0;
    int vaxtSolmaz=0,vaxtOrxan=0,vaxtGulxanim=0,vaxtIlkin=0,vaxtHafiz=0,vaxtAgayev=0,vaxtHuseyn=0,vaxtKamal=0,vaxtElcin=0,vaxtHevva=0,vaxtTeymur=0,vaxtAnar=0,vaxtEli=0,vaxtSuleymanli=0,vaxtGunel=0,vaxtJale=0;
    int vaxtSolmaz1=0,vaxtOrxan1=0,vaxtGulxanim1=0,vaxtIlkin1=0,vaxtHafiz1=0,vaxtAgayev1=0,vaxtHuseyn1=0,vaxtKamal1=0,vaxtElcin1=0,vaxtHevva1=0,vaxtTeymur1=0,vaxtAnar1=0,vaxtEli1=0,vaxtSuleymanli1=0,vaxtGunel1=0,vaxtJale1=0;
    int m=0,g=0,ik=0,a=0,h=0,ag=0,hu=0,ka=0,el=0,he=0,te=0,an=0,eli=0,su=0,gu=0,ja=0;
    int mm=0,aa=0,gg=0,ii=0,hh=0,aga=0,huu=0,kaa=0,ell=0,hee=0,tee=0,ann=0,elii=0,suu=0,guu=0,jaa=0;
    int daccik=1,s=0;
    int d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0,d8=0,d9=0,d10=0,d11=0,d12=0,d13=0,d14=0,d15=0,d16=0;
        try
        {
            File file = new File("C:\\Users\\orxan\\Desktop\\ada4.xlsx");   //creating a new file instance
            FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file
            //creating Workbook instance that refers to .xlsx file
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
            Iterator<Row> itr = sheet.iterator();    //iterating over excel file
            while (itr.hasNext())
            {
                Row row = itr.next();
                Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    list.add(cell.getStringCellValue());
                }
                System.out.println(" ");
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println(list);
            System.out.println();
            for(int i=0;i<list.size();i++)
            {
                if (list.get(i).equals("Orxan Mansirov"))
                {
                    mansirov_orxan.orxan_list(i, list);
                }
                if (list.get(i).equals("Solmaz Ashirova"))
                {
                    ashirova_solmaz.solmaz_list(i, list);
                }
                if (list.get(i).equals("Gülxanim Heydərova"))
                {
                    heyderova_gulxanim.gulxanim_list(i, list);
                }
                if (list.get(i).equals("İlki̇n Fətullayev"))
                {
                    fetullayev_ilkin.ilkin_list(i, list);
                }
                if (list.get(i).equals("Hafi̇z Babazadə"))
                {
                    babazade_hafiz.hafiz_list(i, list);
                }
                if (list.get(i).equals("Rövşən Ağayev"))
                {
                    agayev_rovsen.rovsen_list(i, list);

                }
                if (list.get(i).equals("Hüseyn Həsənov"))
                {
                    hesenov_huseyn.huseyn_list(i, list);
                }
                if (list.get(i).equals("Kamal Rəhi̇mli̇"))
                {
                    rehimli_kamal.kamal_list(i, list);
                }
                if (list.get(i).equals("Elçi̇n Xanəli̇yev"))
                {
                    xaneliyev_elcin.elcin_list(i,list);
                }
                if (list.get(i).equals("Həvva Məmmədli̇"))
                {
                    memmedli_hevva.hevva_list(i,list);
                }
                if (list.get(i).equals("Teymur Hüseynli̇"))
                {
                    huseynli_teymur.teymur_list(i,list);
                }
                if (list.get(i).equals("Anar Mustafayev"))
                {
                    mustafayev_anar.anar_list(i,list);
                }
                if (list.get(i).equals("Əli̇ Hüseynzadə"))
                {
                    huseynzade_eli.eli_list(i,list);
                }
                if (list.get(i).equals("Rövşən Süleymanli"))
                {
                    suleymanli_rovsen.suleymanli_list(i,list);
                }
                if (list.get(i).equals("Günel Abdullayeva"))
                {
                    abdullayeva_gunel.gunel_list(i,list);
                }
                if (list.get(i).equals("Jalə Qasimova"))
                {
                    qasimova_jale.jale_list(i,list);
                }
            }
///////////////////////////////////////////////////////////////////
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).equals("Solmaz Ashirova")&& list.get(i+1).equals("Joined"))
                {
                    vaxtSolmaz=ashirova_solmaz.joinList.get(m++).getMinutes()+vaxtSolmaz;
                    d6=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Solmaz Ashirova")&& list.get(i+1).equals("Left"))
                {
                    vaxtSolmaz1=ashirova_solmaz.leftList.get(mm++).getMinutes()+vaxtSolmaz1;
                    d6=0; //left vaxtlari liste yazir
                }




                if (list.get(i).equals("Orxan Mansirov") && list.get(i + 1).equals("Joined"))
                {
                    vaxtOrxan = mansirov_orxan.joinList.get(a++).getMinutes() + vaxtOrxan;
                    d1=1;
                }
                else if (list.get(i).equals("Orxan Mansirov") && list.get(i + 1).equals("Left"))
                {
                    vaxtOrxan1 = mansirov_orxan.leftList.get(aa++).getMinutes() + vaxtOrxan1;
                    d1=0;

                }


                if (list.get(i).equals("Gülxanim Heydərova") && list.get(i + 1).equals("Joined"))
                {
                    vaxtGulxanim = heyderova_gulxanim.joinList.get(g++).getMinutes() + vaxtGulxanim;
                    d3 = 1;//join vaxtlari liste yazir
                } else if (list.get(i).equals("Gülxanim Heydərova") && list.get(i + 1).equals("Left"))
                {
                    vaxtGulxanim1 = heyderova_gulxanim.leftList.get(gg++).getMinutes() + vaxtGulxanim1; //left vaxtlari liste yazir
                    d3=0;
                }


                if (list.get(i).equals("İlki̇n Fətullayev") && list.get(i + 1).equals("Joined"))
                {
                    vaxtIlkin = fetullayev_ilkin.joinList.get(ik++).getMinutes() + vaxtIlkin;
                    d12 = 1;//join vaxtlari liste yazir
                }
                else if (list.get(i).equals("İlkin Fətullayev") && list.get(i + 1).equals("Left"))
                {
                    vaxtIlkin1 = fetullayev_ilkin.leftList.get(ii++).getMinutes() + vaxtIlkin1;
                    d12=0; //left vaxtlari liste yazir
                }

                if(list.get(i).equals("Hafi̇z Babazadə")&& list.get(i+1).equals("Joined"))
                {
                    vaxtHafiz=babazade_hafiz.joinList.get(h++).getMinutes()+vaxtHafiz;
                    d8=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Hafi̇z Babazadə")&& list.get(i+1).equals("Left"))
                {
                    vaxtHafiz1=babazade_hafiz.leftList.get(hh++).getMinutes()+vaxtHafiz1;
                    d8=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Rövşən Ağayev")&& list.get(i+1).equals("Joined"))
                {
                    vaxtAgayev=agayev_rovsen.joinList.get(ag++).getMinutes()+vaxtAgayev;
                    d16=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Rövşən Ağayev")&& list.get(i+1).equals("Left"))
                {

                    vaxtAgayev1=agayev_rovsen.leftList.get(aga++).getMinutes()+vaxtAgayev1+s;s=0;
                    d16=0; //left vaxtlari liste yazir

                }
                if(list.get(i).equals("Hüseyn Həsənov")&& list.get(i+1).equals("Joined"))
                {
                    vaxtHuseyn=hesenov_huseyn.joinList.get(hu++).getMinutes()+vaxtHuseyn;
                    d7=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Hüseyn Həsənov")&& list.get(i+1).equals("Left"))
                {
                    vaxtHuseyn1=hesenov_huseyn.leftList.get(huu++).getMinutes()+vaxtHuseyn1;
                    d7=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Kamal Rəhi̇mli̇")&& list.get(i+1).equals("Joined"))
                {
                    vaxtKamal=rehimli_kamal.joinList.get(ka++).getMinutes()+vaxtKamal;
                    d10=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Kamal Rəhi̇mli̇")&& list.get(i+1).equals("Left"))
                {
                    vaxtKamal1=rehimli_kamal.leftList.get(kaa++).getMinutes()+vaxtKamal1;
                    d10=0; //left vaxtlari liste yazir
                }

                if(list.get(i).equals("Elçi̇n Xanəli̇yev")&& list.get(i+1).equals("Joined"))
                {
                    vaxtElcin=xaneliyev_elcin.joinList.get(el++).getMinutes()+vaxtElcin;
                    d15=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Elçi̇n Xanəli̇yev")&& list.get(i+1).equals("Left"))
                {
                    vaxtElcin1=xaneliyev_elcin.leftList.get(ell++).getMinutes()+vaxtElcin1;
                    d15=0; //left vaxtlari liste yazir
                }


                if(list.get(i).equals("Həvva Məmmədli̇")&& list.get(i+1).equals("Joined"))
                {
                    vaxtHevva=memmedli_hevva.joinList.get(he++).getMinutes()+vaxtHevva;
                    d11=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Həvva Məmmədli̇")&& list.get(i+1).equals("Left"))
                {
                    vaxtHevva1=memmedli_hevva.leftList.get(hee++).getMinutes()+vaxtHevva1;
                    d11=0; //left vaxtlari liste yazir
                }

                if(list.get(i).equals("Teymur Hüseynli̇")&& list.get(i+1).equals("Joined"))
                {
                    vaxtTeymur=huseynli_teymur.joinList.get(te++).getMinutes()+vaxtTeymur;
                    d5=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Teymur Hüseynli̇")&& list.get(i+1).equals("Left"))
                {
                    vaxtTeymur1=huseynli_teymur.leftList.get(tee++).getMinutes()+vaxtTeymur1;
                    d5=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Anar Mustafayev")&& list.get(i+1).equals("Joined"))
                {
                    vaxtAnar=mustafayev_anar.joinList.get(an++).getMinutes()+vaxtAnar;
                    d9=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Anar Mustafayev")&& list.get(i+1).equals("Left"))
                {
                    vaxtAnar1=mustafayev_anar.leftList.get(ann++).getMinutes()+vaxtAnar1;
                    d9=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Əli̇ Hüseynzadə")&& list.get(i+1).equals("Joined"))
                {
                    vaxtEli=huseynzade_eli.joinList.get(eli++).getMinutes()+vaxtEli;
                    d2=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Əli̇ Hüseynzadə")&& list.get(i+1).equals("Left"))
                {
                    vaxtEli1=huseynzade_eli.leftList.get(elii++).getMinutes()+vaxtEli1;
                    d2=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Rövşən Süleymanli")&& list.get(i+1).equals("Joined"))
                {
                    vaxtSuleymanli=suleymanli_rovsen.joinList.get(su++).getMinutes()+vaxtSuleymanli;
                    d14=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Rövşən Süleymanli")&& list.get(i+1).equals("Left"))
                {
                    vaxtSuleymanli1=suleymanli_rovsen.leftList.get(suu++).getMinutes()+vaxtSuleymanli1;
                    d14=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Günel Abdullayeva")&& list.get(i+1).equals("Joined"))
                {
                    vaxtGunel=abdullayeva_gunel.joinList.get(gu++).getMinutes()+vaxtGunel;
                    d13=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Günel Abdullayeva")&& list.get(i+1).equals("Left"))
                {
                    vaxtGunel1=abdullayeva_gunel.leftList.get(guu++).getMinutes()+vaxtGunel1;
                    d13=0; //left vaxtlari liste yazir
                }
                if(list.get(i).equals("Jalə Qasimova")&& list.get(i+1).equals("Joined"))
                {
                    vaxtJale=qasimova_jale.joinList.get(jaa++).getMinutes()+vaxtJale;
                    d4=1;//join vaxtlari liste yazir
                }
                else if(list.get(i).equals("Jalə Qasimova")&& list.get(i+1).equals("Left"))
                {
                    vaxtJale1=qasimova_jale.leftList.get(jaa++).getMinutes()+vaxtJale1;
                    d4=0; //left vaxtlari liste yazir
                }


            }
           mansirov_orxan.orxanprint(d1,vaxtOrxan,vaxtOrxan1);
           huseynzade_eli.eliprint(d2,vaxtEli,vaxtEli1);
           heyderova_gulxanim.gulxanimprint(d3,vaxtGulxanim,vaxtGulxanim1);
           qasimova_jale.jaleprint(d4,vaxtJale,vaxtJale1);
           huseynli_teymur.teymurprint(d5,vaxtTeymur,vaxtTeymur1);
           ashirova_solmaz.solmazprint(d6,vaxtSolmaz,vaxtSolmaz1);
           hesenov_huseyn.huseynprint(d7,vaxtHuseyn,vaxtHuseyn1);
           babazade_hafiz.hafizprint(d8,vaxtHafiz,vaxtHafiz1);
           mustafayev_anar.anarprint(d9,vaxtAnar,vaxtAnar1);
           rehimli_kamal.kamalprint(d10,vaxtKamal,vaxtKamal1);
           memmedli_hevva.hevvaprint(d11,vaxtHevva,vaxtHevva1);
           fetullayev_ilkin.ilkinprint(d12,vaxtIlkin,vaxtIlkin1);
           abdullayeva_gunel.gunelprint(d13,vaxtGunel,vaxtGunel1);
           suleymanli_rovsen.suleymanliprint(d14,vaxtSuleymanli,vaxtSuleymanli1);
           xaneliyev_elcin.elcinprint(d15,vaxtElcin,vaxtElcin1);
           agayev_rovsen.rovsenprint(d16,vaxtAgayev,vaxtAgayev1);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}  