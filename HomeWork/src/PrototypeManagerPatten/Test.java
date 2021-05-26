package PrototypeManagerPatten;

public class Test {
    public static void main(String[] args) {
        PrototypeManager prototypeManager = PrototypeManager.getPrototypeManager();

        OfficialDuctment officialDuctment;

/*        SRS srs1 = new SRS();
        srs1.setName("战士");
        srs1.setDate("now");
        System.out.println(srs1.getDate());
        System.out.println(srs1.getName());
        System.out.println("============================================");*/
        officialDuctment = prototypeManager.getOfficiaDuctment("SRS");

        Object obj = officialDuctment.clone();
//        SRS srs = (SRS) officialDuctment.clone();
/*        srs.setDate("after");
        System.out.println(srs.getDate());
        System.out.println(srs.getName());
        System.out.println(srs);*/

        officialDuctment.diplay();

        //验证
       /* SRS srs1 = new SRS();
        srs.diplay();
        System.out.println(srs1 == srs);*/
        //增加原型
        prototypeManager.addOfficialDuctment("AAD",new AAD());

        OfficialDuctment officialDuctment1;

        officialDuctment1 = prototypeManager.getOfficiaDuctment("AAD");
        Object obj2 = null;
        obj2 = officialDuctment1.clone();
        officialDuctment1.diplay();

    }
}
