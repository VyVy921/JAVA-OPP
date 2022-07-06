package lesson06;

public class MayGatDapLienHop {

    /*
    * Class: 1 template, blueprint de design tung Object
    * public class MayGatDapLienHop: ban thiet ke
    * public void catLua(String cayLua): ban thiet ke
    * public void xayLua(String hatLua) : ban thiet ke
    * public void: access modifier
    * catLua: ten
    * String cayLua: kieu du lieu input
    * /

    /* public static void main(String[] args):Object | Instance
    * Object | Instance: doi tuong cua ban thiet ke
    * Cach tao 1 object trong class:
    * MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
    * MayGatDapLienHop(); : default constructor
    * call constructor => new constructor
    * */
    public void catLua(String cayLua) {

        System.out.println("Dang cat " + cayLua);
    }

    public void xayLua(String hatLua) {
        System.out.println("Dang xay " + hatLua);

    }

    public static void main(String[] args) {
        MayGatDapLienHop mayGatDapLienHop = new MayGatDapLienHop();
       mayGatDapLienHop.catLua("Cay lua");
       mayGatDapLienHop.xayLua("Hat lua");


    }
}

