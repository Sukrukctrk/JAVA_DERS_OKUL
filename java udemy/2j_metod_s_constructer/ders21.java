public class ders21 {
        // klaslara public yaptıgımız zaman direk erişebiliriz bu da tehlikelere yol açabilir
        // herkes bun projeye erişebilir ve anlamsız şeylerle karşılaşılabilir

        private String model;
        private String renk;
        private int teker;


        public void setModel(String model){

           this.model=model; //bu model gibi

        }

        public String getModel(){

            return this.model;
        }

        public String getmodel(){
            return this.renk;
        }

        public int gettmodel(){

            return this.teker;
        }
    }
    
