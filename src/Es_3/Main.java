package Es_3;


public class Main {
    static void main(String[] args) {

        Rubrica.insertContatto("luca", "08111122335555666");
        Rubrica.insertContatto("antonio", "0811112233");
        Rubrica.insertContatto("paolo", "444444");

        Rubrica.searchContattoByNumber("08111122335555666");
        Rubrica.searchContattoByName("antonio");

    }


}
