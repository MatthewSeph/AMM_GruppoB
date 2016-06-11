/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.models;

import java.util.ArrayList;

/**
 *
 * @author Matth
 */
    public class OggettiFactory {
        private static OggettiFactory singleton;
        public static OggettiFactory getInstance(){
        if (singleton == null){
            singleton = new OggettiFactory();
        }
        return singleton;
    }
    
    public static UtentiFactory singleton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     private ArrayList<Oggetti> listaOggetti = new ArrayList<Oggetti>();
     
     //Costruttore
    public OggettiFactory(){
     
     //Oggetti
        Oggetti oggetto_1 = new Oggetti();
        oggetto_1.setId(0);
        oggetto_1.setNome("Tokyo Ghoul");
        oggetto_1.setDescrizione("A Tokyo si verificano una serie di strani e cruenti omicidi dovuti alla presenza di ghoul, mostri che vedono gli umani solo come prede e che si possono cibare unicamente della loro carne. Ken Kaneki è uno studente universitario, dedito allo studio e alla lettura, che un giorno conosce in un bar Rize, sua affascinante coetanea: in realtà anche la ragazza è un ghoul e Ken diventerà ben presto la sua preda. Rize infatti, con un pretesto, attira Ken in un luogo isolato dove lo ferisce gravemente con dei ripetuti attacchi, ma prima di poterlo divorare, muore colpita da una serie di travi d'acciaio, che precipitano fortunatamente da un edificio in costruzione nei paraggi. Il ragazzo viene quindi portato d'urgenza in un ospedale dove il chirurgo della sua operazione, in un gesto disperato, decide di sottoporlo a un trapianto di organi, presi proprio dal corpo di Rize. Sopravvissuto all'impossibile, Ken inizia presto a capire però di essere diventato anche lui una specie di ghoul in una città sparsa di questi mostri, dove ciascuno, per mangiare, deve \"cacciare\" nel proprio territorio.");
        oggetto_1.setImageURL("img/tokyoghoul.jpg");
        oggetto_1.setPrezzo(14.99);
        oggetto_1.setQuantita(22);
        listaOggetti.add(oggetto_1);
        
        Oggetti oggetto_2 = new Oggetti();
        oggetto_2.setId(1);
        oggetto_2.setNome("Shingeki no Kyojin");
        oggetto_2.setDescrizione("Nell'anno 845 compare un gigante alto circa 60 metri, che con un calcio crea una breccia nella cinta esterna del Muro Maria, presso la città di Shiganshina. I giganti sciamano al suo interno divorando quanti più umani possibili, mentre questi cercano inutilmente di difendersi e trasferire più gente possibile all'interno della seconda cerchia di mura; ma prima che gli uomini riescano a chiudere la porta interna delle mura, un gigante corazzato la sfonda con un colpo e gli umani sono costretti a ripiegare sul Muro Rose. In seguito tentano una disperata riconquista del territorio perduto, circa un terzo del totale, che fallisce miseramente. L'enorme perdita di uomini contribuisce per lo meno ad attenuare la carestia di cibo creatasi per la perdita di una porzione territoriale così grande. Il gigante colossale e quello corazzato spariscono misteriosamente dopo aver spianato la strada ai loro simili.");
        oggetto_2.setImageURL("img/shingeki.png");
        oggetto_2.setPrezzo(4.99);
        oggetto_2.setQuantita(14);
        listaOggetti.add(oggetto_2);
     
        Oggetti oggetto_3 = new Oggetti();
        oggetto_3.setId(2);
        oggetto_3.setNome("Mirai Nikki");
        oggetto_3.setDescrizione("Il protagonista, Yukiteru Amano, è un ragazzo asociale, chiuso in sé stesso ed isolato che tiene un diario sul suo cellulare nel quale annota tutto ciò che gli accade attorno. Yukiteru pensa di avere un amico immaginario, chiamato Deus Ex Machina, il signore del tempo. Un giorno Deus decide di organizzare un gioco e riconsegna a Yukiteru il suo cellulare, dopo averlo modificato personalmente, ma il ragazzo si accorge presto di alcune stranezze. Il diario invece di contenere le informazioni scritte da lui, riporta fatti non ancora accaduti: il cellulare riesce a prevedere il futuro. Questa \"modifica\" però ben presto verrà applicata ai cellulari di altre undici persone, oltre a Yukiteru (il primo). Il gioco consiste in un \"survival game\" dove i partecipanti devono cercare di uccidersi a vicenda o di distruggere i diari del futuro degli avversari (cosa che li uccide, essendo i diari del futuro direttamente collegati al futuro del proprietario). Chi sopravviverà allo scontro prenderà il posto di Deus nel diventare dio del tempo e dello spazio.");
        oggetto_3.setImageURL("images/mirainikki.jpg");
        oggetto_3.setPrezzo(6.99);
        oggetto_3.setQuantita(5);
        listaOggetti.add(oggetto_3);
        
        Oggetti oggetto_4 = new Oggetti();
        oggetto_4.setId(3);
        oggetto_4.setNome("Death Parade");
        oggetto_4.setDescrizione("l Quindecim (クィーン・デキム Kuīn Dekimu?) è un misterioso bar dove lavora un barista solitario di nome Decim. Ogni volta che due persone sulla Terra muoiono allo stesso tempo, esse sono mandate a uno dei molti misteriosi bar come il Quindecim, dove saranno costrette a partecipare al Death Game (デスゲーム Desu Gēmu?), un gioco mortale nel corso del quale i segreti che le hanno portate lì e il loro destino saranno svelati: Decim è infatti uno dei giudici che deciderà se la loro anima sarà reincarnata o finirà nel vuoto.");
        oggetto_4.setImageURL("images/deathparade.jpg");
        oggetto_4.setPrezzo(4.49);
        oggetto_4.setQuantita(41);
        listaOggetti.add(oggetto_4);
        
        Oggetti oggetto_5 = new Oggetti();
        oggetto_5.setId(4);
        oggetto_5.setNome("Naruto");
        oggetto_5.setDescrizione("Naruto Uzumaki è un ninja dodicenne del Villaggio della Foglia con il sogno di diventare Hokage, il ninja più importante del villaggio. Naruto ha passato l'infanzia nell'emarginazione e, durante uno scontro con Mizuki, un ninja traditore, viene a scoprirne il motivo: dentro di lui è sigillata la Volpe a Nove Code, uno dei nove cercoteri, giganteschi demoni sovrannaturali. Dopo avere sconfitto Mizuki, Naruto viene promosso all'accademia ninja e viene integrato nel gruppo sette composto, oltre a lui, da Sasuke Uchiha, Sakura Haruno e il maestro Kakashi Hatake[3][4]. Dopo varie avventure, Sasuke decide di abbandonare il villaggio per allenarsi con Orochimaru ed ottenere il potere necessario per uccidere suo fratello Itachi con lo scopo di vendicare il suo clan, da lui apparentemente sterminato senza un chiaro movente[4]. Con il tentativo fallito di redimere Sasuke e la sua conseguente fuga dal paese, Naruto decide di abbandonare il Villaggio della Foglia e intraprendere con il maestro Jiraiya un lungo allenamento");
        oggetto_5.setImageURL("images/naruto.jpg");
        oggetto_5.setPrezzo(8.99);
        oggetto_5.setQuantita(13);
        listaOggetti.add(oggetto_5);

    }
    
    public ArrayList<Oggetti>getOggettiList(){
        return listaOggetti;
    }
    public Oggetti getOggetto(int id){
        for(Oggetti u: listaOggetti){
            if(u.id == id)
                return u;
        }
        return null;
    }
}
