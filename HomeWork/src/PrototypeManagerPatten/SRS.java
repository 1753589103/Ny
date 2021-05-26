package PrototypeManagerPatten;

class SRS implements OfficialDuctment{
/*
        private String name;
        private String date;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
*/

    @Override
    public OfficialDuctment clone() {
        Object officialDuctment = null;
        try {
            officialDuctment = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDuctment) officialDuctment;
    }

    @Override
    public void diplay() {
        System.out.println("SRS");
    }
}
