/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRC6;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Dataset{
    
    ArrayList <Integer> year = new ArrayList();
    ArrayList <Integer> month = new ArrayList();
    ArrayList <Float> tmax = new ArrayList();
    ArrayList <Float> tmin = new ArrayList();
    ArrayList <Integer> afdays = new ArrayList(); //Dias con Heladas
    ArrayList <Float> rain = new ArrayList();
    ArrayList <Float> sun = new ArrayList();
    
    public ArrayList<Float> getTmax() {
        return tmax;
    }

    public Dataset (String name)
    { 
        /*ArrayList <Integer> year = new ArrayList();
        ArrayList <Integer> month = new ArrayList();
        ArrayList <Float> tmax = new ArrayList();
        ArrayList <Float> tmin = new ArrayList();
        ArrayList <Integer> afdays = new ArrayList(); //Dias con Heladas
        ArrayList <Float> rain = new ArrayList();
        ArrayList <Float> sun = new ArrayList();*/
        /*
        ArrayList <String> cadenat = new ArrayList();
        cadenat = readURL(name);
        
        String year_t = "";
        String  month_t = "";
        String tmax_t = "";
        String tmin_t = "";
        String afdays_t = "";
        String rain_t = "";
        String sun_t = "";
        
        for (int i = 0; i < cadenat.size(); i++)
        {
            String cadena = cadenat.get(i);
            char aux1 = ' ';
            
            for(int j = 0; j < cadena.length(); j++)
            {
                if(cadena.charAt(j) != '#' ){
                   if(j<=8){
                        aux1 = cadena.charAt(j);
                        year_t = year_t +aux1;                           
                    }

                if(j>=8 && j<=12){
                        aux1 = cadena.charAt(j);
                        month_t = month_t +aux1; 
                    }

                if(j>=12 && j<=18){
                        aux1 = cadena.charAt(j);
                        tmax_t = tmax_t +aux1;
                    }
                
                if(j>=20 && j<=27){
                        aux1 = cadena.charAt(j);
                        tmin_t = tmin_t +aux1;
                    }
                if(j>=30 && j<=34){
                        aux1 = cadena.charAt(j);
                        afdays_t = afdays_t +aux1;
                    }
                if(j>=35 && j<=44){
                        aux1 = cadena.charAt(j);
                        rain_t = rain_t +aux1;
                    }
                if(j>=43 && j<=49){
                        aux1 = cadena.charAt(j);
                        sun_t = sun_t +aux1;
                    }
                
                aux1 = ' ';
                }
            }
            
        int auxi = 0;
        float auxd = 0;
        
        auxi = Integer.parseInt(year_t);    year_t = "";    //System.out.println(auxi);     
        year.add(auxi);//
        auxi = Integer.parseInt(month_t);   month_t = "";   //System.out.println(auxi);
        month.add(auxi);//
        auxd = Float.parseFloat(tmax_t);    tmax_t = "";    //System.out.println(auxd);
        tmax.add(auxd);//
        auxd = Float.parseFloat(tmin_t);    tmin_t = "";    //System.out.println(auxd);
        tmin.add(auxd);//
        auxi = Integer.parseInt(afdays_t);  afdays_t = "";  //System.out.println(auxi);
        afdays.add(auxi);//
        auxd = Float.parseFloat(rain_t);    rain_t = "";    //System.out.println(auxd);
        rain.add(auxd);//
        auxd = Float.parseFloat(sun_t);     sun_t = "";     //System.out.println(auxd);
        sun.add(auxd);//
      
        //this.get_tmax_m(year, tmax);
        
        }
        
        //print_tmax();*/
    }
    
    public void print_tmax()
    {
        for (int i = 0; i < tmax.size();i++)
        {
            System.out.println(i+": "+tmax.get(i));
        }
    }

    public ArrayList<Integer> getYear() {
        return year;
    }

    public ArrayList<Integer> getMonth() {
        return month;
    }

    public ArrayList<Float> getTmin() {
        return tmin;
    }

    public ArrayList<Integer> getAfdays() {
        return afdays;
    }

    public ArrayList<Float> getRain() {
        return rain;
    }

    public ArrayList<Float> getSun() {
        return sun;
    }
    
    public void print_sun()
    {
        for (int i = 0; i < tmax.size();i++)
        {
            System.out.println(i+": "+sun.get(i));
        }
    }
    
    
    public ArrayList readURL(String name)
    {
        ArrayList <String> Dataset = new ArrayList();
        try {
            URL link = new URL("http://www.metoffice.gov.uk/pub/data/weather/uk/climate/stationdata/"+name+"data.txt");
            URLConnection urlConnection = link.openConnection();
            DataInputStream dis = new DataInputStream(urlConnection.getInputStream());
            String inputLine;
            String Linea;
            
            int trash = 0;
            while ((inputLine = dis.readLine()) != null) {
                if(trash > 6)
                {
                    Linea = inputLine;
                    Linea = inputLine.replace(" ", "#").replace("---","##0").replace('*','#');
                    Dataset.add(Linea);
                }
                trash ++;
                //System.out.println(inputLine);
                //System.out.println(Cadena.get(i));
                //i++;
            }
            dis.close();
        } catch (MalformedURLException me) {
            System.out.println("MalformedURLException: " + me);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe);
        }
        
        return Dataset;
    } 
    
    public void crear_dataset (String name)
    {
        ArrayList <String> cadenat = new ArrayList();
        cadenat = readURL(name);
        
        String year_t = "";
        String  month_t = "";
        String tmax_t = "";
        String tmin_t = "";
        String afdays_t = "";
        String rain_t = "";
        String sun_t = "";
        
        for (int i = 0; i < cadenat.size(); i++)
        {
            String cadena = cadenat.get(i);
            char aux1 = ' ';
            
            for(int j = 0; j < cadena.length(); j++)
            {
                if(cadena.charAt(j) != '#' ){
                   if(j<=8){
                        aux1 = cadena.charAt(j);
                        year_t = year_t +aux1;                           
                    }

                if(j>=8 && j<=12){
                        aux1 = cadena.charAt(j);
                        month_t = month_t +aux1; 
                    }

                if(j>=12 && j<=18){
                        aux1 = cadena.charAt(j);
                        tmax_t = tmax_t +aux1;
                    }
                
                if(j>=20 && j<=27){
                        aux1 = cadena.charAt(j);
                        tmin_t = tmin_t +aux1;
                    }
                if(j>=30 && j<=34){
                        aux1 = cadena.charAt(j);
                        afdays_t = afdays_t +aux1;
                    }
                if(j>=35 && j<=44){
                        aux1 = cadena.charAt(j);
                        rain_t = rain_t +aux1;
                    }
                if(j>=43 && j<=49){
                        aux1 = cadena.charAt(j);
                        sun_t = sun_t +aux1;
                    }
                
                aux1 = ' ';
                }
            }
            
        int auxi = 0;
        float auxd = 0;
        
        auxi = Integer.parseInt(year_t);    year_t = "";    //System.out.println(auxi);     
        year.add(auxi);//
        auxi = Integer.parseInt(month_t);   month_t = "";   //System.out.println(auxi);
        month.add(auxi);//
        auxd = Float.parseFloat(tmax_t);    tmax_t = "";    //System.out.println(auxd);
        tmax.add(auxd);//
        auxd = Float.parseFloat(tmin_t);    tmin_t = "";    //System.out.println(auxd);
        tmin.add(auxd);//
        auxi = Integer.parseInt(afdays_t);  afdays_t = "";  //System.out.println(auxi);
        afdays.add(auxi);//
        auxd = Float.parseFloat(rain_t);    rain_t = "";    //System.out.println(auxd);
        rain.add(auxd);//
        auxd = Float.parseFloat(sun_t);     sun_t = "";     //System.out.println(auxd);
        sun.add(auxd);//
    }
    }
    
    public ArrayList get_tmax_m (ArrayList <Integer> y, ArrayList <Float> temp)
    {
        ArrayList <Float> retorno = new ArrayList();
        float media = 0;
        int cnt = 0;
        int a = y.get(0);
        for(int i = 0; i < y.size();i++)
        {
            a = y.get(i);
            if( y.get(i) == a)
            {
                media += temp.get(i);
                cnt++; 
            }
            else
            {
                retorno.add(media/cnt);
                media = 0;
                cnt = 0;
                a = y.get(i);
            }
        }
        
        return retorno;
    }
}
            
        


