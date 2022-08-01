package ee.informaatik.jokeapp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChuckNorriseNaljad {



    private List<String> quotes;

    /**
     * Default constructor - loads quotes
     */
    public ChuckNorriseNaljad() {

        quotes = Arrays.asList(
                "Kui lastel on Supermani pidžaama, siis Supermanil on Chuck Norrise pidžaama.",
                "Chuck Norris saab jagada nulliga.",
                "Chuck Norris ei roni puude otsa – ta tõmbab need maha ning kõnnib nende otsas.",
                "Chuck Norris suudab ühe kärbsega tappa kaks hoopi.",
                "Kosmos eksisteerib, kuna see kardab viibida Chuck Norrisega samal planeedil.",
                "Chuck Norris luges lõpmatuseni – kolm korda.",
                "Chuck Norris suudab pöördukse pauguga kinni lüüa.",
                "Kumb oli enne, muna või kana? Chuck Norris.",
                "Evolutsiooniteooriat ei eksisteeri. Eksisteerib vaid nimekiri olenditest, kel Chuck Norris on lubanud ellu jääda.",
                "Chuck Norris ei kirjuta raamatuid. Sõnad koonduvad ise suurest hirmust.",
                "Chuck Norris on nii kiire, et ta suudab joosta ümber maakera ning iseendale kuklasse lüüa.",
                "Chuck Norris magab öölambiga. Mitte seetõttu, et Norris kardaks pimedat, vaid seetõttu, et pimedus kardab Chuck Norrist.",
                "Chuck Norris külastas kord Neitsisaari. Nende nimi on nüüd Saared.",
                "Chuck Norris ei loe raamatuid. Ta jõllitab neid senikaua, kuni saab informatsiooni, mida vajab.",
                "Kui sul on viis eurot ja Chuck Norrisel on viis eurot, siis Chuck Norrisel on rohkem raha kui sul.",
                "Chuck Norris ei kanna käekella. Ta lihtsalt otsustab, mis kell on.",
                "Kui Chuck Norris teeb kätekõverdusi, siis ta mitte ei lükka end üles, vaid lükkab Maad endast eemale.",
                "Chuck Norris on käinud Marsil – sellepärast pole seal elu.",
                "Chuck Norris suudab tuld kustutada liitri bensiiniga.",
                "Chuck Norris kuuleb viipekeelt.",
                "Kobra salvas kord Chuck Norrise jalga. Pärast viit päeva piinlemist heitis kobra hinge.",
                "Kui Chuck Norris sündis, sõidutas ta oma ema haiglast koju.",
                "Kui Chuck Norris viilutab sibulat, nutab sibul.",
                "Gripp peab saama igal aastal Chuck Norrise vaktsiini.",
                "Chuck Norris alustab lõket, hõõrudes kokku kaht jääkuubikut.",
                "Chuck Norris tegi kord valedetektoritesti – masin tunnistas kõik üles.",
                "Kui Alexander Bell leiutas telefoni, oli tal kolm vastamata kõnet – Chuck Norriselt.",
                "Chuck Norrisel on kodus põrandal grislikaru vaip. Karu pole surnud, ta lihtsalt ei julge liigutada.",
                "Chuck Norris ei helista valel numbril. Sa lihtsalt vastad valele telefonile.",
                "Chuck Norris suri 20 aastat tagasi, kuid Surm kogub veel julgust, et talle seda öelda.",
                "Chuck Norris ei maga. Ta ootab."
        );
    }

    /**
     * Returns a random joke.
     *
     * @return Chuck Norris Joke
     */
    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(0, quotes.size()));
    }

}
