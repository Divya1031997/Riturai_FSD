/* Ritu bala Rai
 Q3. Dvdplayer and Television is sub class and Media is base class Inheritance and overriding concept
*/

class Media{                    // Base Class

private String mediaType;

public String getMediaType()
{
return mediaType;
}
 public void setMediaType(String mediaType)
{
this.mediaType = mediaType;
}

public void Buy()
{
System.out.println("Successfully Purchased");
}
}


class Television extends Media{
public String tvModel;
public float tvPrice;
public String compName;
Television(){}

public String getTvModel()
{
return tvModel;
}
public void setTvModel(String tvModel)
{
this.tvModel= tvModel;
}

public float getTvPrice()
{
return tvPrice;
}

public void setTvPrice(float tvPrice)
{
this.tvPrice= tvPrice;
}

public String getcompName()
{
return compName;
}

public void setcompName(String compName)
{
this.compName= compName;
}

public void Buy()                   // Method Overriding Buy Method of Media class
{
System.out.println("TV Successfully Purchased");
}

public void Play()
{
System.out.println("Television On");
}

public void Close(){
System.out.println("Television Close");
}
}

class Dvdplayer extends Media{
public String dvdName;
public String getDvdName()
{return dvdName;
}
public void setDvdName(String dvdName){
this.dvdName= dvdName;
}
public void Insertcd()
{
System.out.println("CD Inserted Successfully");
}
public void Ejectcd()
{
System.out.println("CD ejected Successfully");
}
public static void main(String args[])
{Dvdplayer d= new Dvdplayer();
 Media Dv= new Dvdplayer();
 Television Tv= new Television();
 Dv.Buy();
 d.Insertcd();
 d.setDvdName("Sony Dvd Player");
 System.out.println(d.getDvdName());
 d.Ejectcd();
 Tv.setTvModel("LED");
 Tv.setTvPrice(1000);
 Tv.setcompName("LG");
 System.out.println("TV MODEL: "+ " " + Tv.getTvModel() + " TV PRICE :" +Tv.getTvPrice() + " Tv COMPANY : " +Tv.getcompName());
 Tv.Buy();
 Tv.Play();
 Tv.Close();}
}

/* Output:- 
C:\Users\HP\Desktop>java Dvdplayer
Successfully Purchased
CD Inserted Successfully
Sony Dvd Player
CD ejected Successfully
TV MODEL:  LED TV PRICE :1000.0 Tv COMPANY : LG
TV Successfully Purchased
Television On
Television Close
*/