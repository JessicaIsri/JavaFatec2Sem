package lp;

public class Lugar {
    private String adress;
    private String country;
    private String description;
    private String bands;
    private String tourist_spot;
    private int stars;

    public Lugar() {

        this.stars = 0;
        this.country = "";
        System.out.println("teste");

    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars){
        this.stars = stars;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void showMore(String pais){

        if (pais.equals("Brasil")){
            this.description = "O Brasil, um vasto país sul-americano, estende-se da Bacia Amazônica, no norte, até os vinhedos " +
                    "e as gigantescas Cataratas do Iguaçu, no sul.";
        }
        else if (pais.equals("Suecia")){
            this.description = "A Suécia é uma nação escandinava com milhares de ilhas costeiras e lagos interiores, além de vastas " +
                    "florestas boreais e montanhas glaciais.";
        }
        else if (pais.equals("Irlanda")){
            this.description = "A República da Irlanda ocupa a maior parte da ilha da Irlanda, perto da costa da Inglaterra e do País de Gales. " +
                    "Sua capital, Dublin, é berço de escritores como Oscar Wilde e local de origem da cerveja Guinness. ";
        }
        else if (pais.equals("Alemanha")){
            this.description = "A Alemanha é um país situado na Europa Ocidental com uma paisagem de florestas, rios," +
                    " cordilheiras e praias do Mar do Norte.";
        }
        else if (pais.equals("Noruega")){
            this.description = "A Noruega é um país escandinavo que abrange montanhas, geleiras e fiordes litorâneos profundos. " +
                    "Oslo, a capital, é uma cidade cheia de áreas verdes e museus.";
        }
        System.out.println(this.description);
    }

    public void showTouristSpot(String pais){

        if (pais.equals("Brasil")){
            this.tourist_spot = "Pão de Açucar || Cataratas do Iguaçu || Ilha Bela ";
        }
        else if (pais.equals("Suecia")){
            this.tourist_spot = "Gamla Stan || Museu do Vasa || Palacio Reald de Estocolmo";
        }
        else if (pais.equals("Irlanda")){
            this.tourist_spot = "Guiness Storehouse || Temple Bar || Falésias de Moher";
        }
        else if (pais.equals("Alemanha")){
            this.tourist_spot = "Portão de Brandemburgo || Palacio de Reichstag || Castelo Neuschwanstein";
        }
        else if (pais.equals("Noruega")){
            this.tourist_spot = "Muralha de Cracóvia || Castelo real de Wawel || Caastelo real de Varsóvia";
        }
        System.out.println(this.tourist_spot);
    }

    public void showMetalBand(String pais){
        String text = "";
        if (pais.equals("Brasil")){
            this.bands = "Sepultura";
        }
        else if (pais.equals("Suecia")){
            this.bands = "Sabaton";
        }
        else if (pais.equals("Irlanda")){
            this.bands = "U2";
        }
        else if (pais.equals("Alemanha")){
            this.bands = "Powerwolf";
        }
        else if (pais.equals("Noruega")){
            this.bands = "Dimmu Borgir";
        }
        System.out.println(this.bands);
    }


}
