/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import entities.Spell;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.validation.constraints.Future;

/**
 *
 * @author artin
 */
public class fetchFacade {

//    public Map<String, String> getAllDataInParalelWithQueue() throws ProtocolException, IOException, InterruptedException, ExecutionException
//    {
//        Map<String, String> results = new HashMap();
//        Queue<Future<Person>> queue = new ArrayBlockingQueue(PERSONS.length);
//
//        ExecutorService workingJack = Executors.newCachedThreadPool();
//        for (String Spell : PERSONS)
//        {
//            Future<Person> future = workingJack.submit(() ->
//            {
//                JsonObject jsonObject = new JsonParser().parse(getSwapiData(Spell)).getAsJsonObject();
//                CoinPair cp = new CoinPair(coinPair, jsonObject.get("price").getAsDouble());
//           return cp ;
//            });
//            queue.add(future);
//        }
//        while (!queue.isEmpty())
//        {
//            Future<Person> cp = queue.poll();
//            if (cp.isDone())
//            {
//                results.put(cp.get().getName(), cp.get().getPrice());
//            }
//            else
//            {
//                queue.add(cp);
//            }
//        }
//        return results;
//    }
    
//    public Map<String, String> getAllDataInParalelWithQueue() throws ProtocolException, IOException, InterruptedException, ExecutionException
//    {
//        Map<String, String> results = new HashMap();
//        Queue<Future<Spell>> queue = new ArrayBlockingQueue(SPELLS.length);
//        
//        ExecutorService workingJack = Executors.newCachedThreadPool();
//        for (String Spell : SPELLS)
//        {
//            Future<Spell> future = workingJack.submit(() ->
//            {
//                JsonObject jsonObject = new JsonParser(),parse(getSwapiData(Spell)).getAsJsonObject();
//                Spell sp = new Spell(spell, jsonObject.get("idk").getAsString());
//                return sp;
//            });
//            queue.add(future);
//        }
//        while(!queue.isEmpty())
//        {
//            Future<Spell> sp = queue.poll();
//            if(sp.isDone())
//            {
//                results.put(sp.get().getName(), sp.get().getIndex,sp.get().getId(),sp.get.getDescription());
//            }
//            else
//            {
//                queue.add(sp);
//            }
//        }
//        return results;
//    }
//    
//    
    public String getSwapiData(String index) throws MalformedURLException, ProtocolException, IOException
    {
        String fullUrl = "http://dnd5eapi.co/api/spells/" + index;//"/?format=json";
        URL url = new URL(fullUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
        try (Scanner scan = new Scanner(con.getInputStream()))
        {
            String jsonStr = "";
            while (scan.hasNext())
            {
                jsonStr += scan.nextLine();
            }
            return jsonStr;
        }
    }

    public static void main(String[] args) throws ProtocolException, IOException
    {
        fetchFacade facade = new fetchFacade();
        String satan = facade.getSwapiData("1");
        
        System.out.println(facade.getSwapiData("1"));
    }
}
