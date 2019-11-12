/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import com.google.gson.JsonObject;
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
    
//public Map<String,String> getAllDataInParalelWithQueue() throws ProtocolException, IOException, InterruptedException, ExecutionException {
//        Map<String, String> results = new HashMap();
//        Queue<Future<Person>> queue = new ArrayBlockingQueue(Person.length);
//
//        ExecutorService workingJack = Executors.newCachedThreadPool();
//        for (String Person : Person) {
//            Future<person> future = workingJack.submit(() -> {
//                JsonObject jsonObject = new JsonParser().parse(getswapiData(Person)).getAsJsonObject();
//                Person cp = new Person(Person, jsonObject.get("price").getAsString());
//                return cp;
//            });
//            queue.add(future);
//        }
//        while (!queue.isEmpty()) {
//            Future<Person> cp = queue.poll();
//            if (cp.isDone()) {
//                results.put(cp.get().getName(), cp.get().getPrice());
//            } else {
//                queue.add(cp);
//            }
//        }
//        return results;
//    }
//
//    public String getswapiData(String Person) throws MalformedURLException, ProtocolException, IOException {
//        String fullUrl = URL + Person;
//        URL url = new URL(fullUrl);
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        con.setRequestMethod("GET");
//        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
//        try (Scanner scan = new Scanner(con.getInputStream())) {
//            String jsonStr = "";
//            while (scan.hasNext()) {
//                jsonStr += scan.nextLine();
//            }
//            return jsonStr;
//        }
//    }
}
