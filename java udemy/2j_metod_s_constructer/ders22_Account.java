public class ders22_Account {
    private String hesapno;
    private double bakiye;
    private String isim;
    private String gmail;





public ders22_Account(String hesapno,double bakiye,String isim,String gmail){


    // şimdi bu bir constructerdır
    this.bakiye=bakiye;
    this.isim=isim;
    this.gmail=gmail;
    this.hesapno=hesapno;
}









public  void para_yatır(double miktar){

    bakiye+=miktar; // burda bakiye herhangir bir işlemle karışmadıgı için bu şekilde tanımlayabiliriz
    System.out.println("yeni bakiye "+bakiye);

}
public void paracekme(double miktar){

 if(miktar>1500){
    System.out.println("1500 tl den fazla cekemezsiniz");
 }

 else if(bakiye-miktar<0){

    System.out.println("bu kadar bakiyeniz bulunmamaktadır");
 }

}

public String gethesapno(){

    return this.hesapno;
}

public void sethesapno(String hesapno){

 this.hesapno=hesapno;

}

public String getisim(){

    return this.isim;
}

public void setisim(String isim){

 this.isim=isim;

}
public String getgmaill(){

    return this.gmail;
}

public void setgamail(String gmail){

 this.gmail=gmail;

}
public Double getbakiye(){

    return this.bakiye;
}

public void setbakiye(Double bakiye){

 this.bakiye=bakiye;

}

}