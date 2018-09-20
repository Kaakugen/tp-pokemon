package server;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.crypto.Data;
import shared.Pokemon;

public class TestDatabase {

    public static void main(String[] args) {



    ArrayList<Pokemon> list_poke = new ArrayList<Pokemon>();
    Pokemon Hitokage =new Pokemon("Hitokage");

            list_poke.add(Hitokage);
            Database poke_data = new Database("Listepoke.txt");

try{
    poke_data.savePokemons(list_poke);

} catch (IOException e) {
    e.printStackTrace();
}

    }


}
