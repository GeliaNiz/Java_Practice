package practice2324;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import practice2122.Item;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    HttpClient client=HttpClient.newHttpClient();
    Gson gson=new Gson();
    final String worker="NizamutdinovaAngelina";
    ArrayList<JsonObject> tasks=new ArrayList<>();
    File file = new File("src\\main\\java\\practice2324\\db.json");
    FileWriter writer;
    FileReader reader;
    JsonReader jsonReader;
    List<Integer> ids= new ArrayList<>();
    Worker(){
        Type type = new TypeToken<List<Integer>>(){}.getType();
        try {
            writer=new FileWriter(file,true);
            reader=new FileReader(file);
            jsonReader= new JsonReader(reader);
            if(reader.read()==-1) {
                writer.write("[]");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ids=gson.fromJson(jsonReader,type);
    }
    void getAll() throws IllegalStateException, IOException, InterruptedException {
        tasks.clear();
        HttpRequest request =HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://80.87.199.76:3000/tasks"))
                .build();
        HttpResponse<String>response=client.send(request,HttpResponse.BodyHandlers.ofString());
        JsonArray jsar=gson.fromJson(response.body(),JsonArray.class);
        for(JsonElement i: jsar){
            tasks.add(i.getAsJsonObject());
        }
    }
    void performingAllOperations() throws IOException, InterruptedException {
        double res;
            for (JsonObject i : tasks) {
                if(!ids.contains(i.get("id").getAsInt())){
                    res=parseAndPerformOp(i.get("expression").getAsString());
                    ids.add(i.get("id").getAsInt());
                    addReport(i.get("id").getAsInt(),res);
                    System.out.println(i.get("taskDescription")+" performed");
                }
            }
            try(FileWriter writer=new FileWriter(file)) {
                writer.write("[");
                writer.write(gson.toJson(ids));
                writer.write("]");
                writer.flush();
            }
            catch (IOException e){
                e.printStackTrace();
            }
    }
    void addReport( int taskld, double result) throws IOException, InterruptedException {
        HttpClient client=HttpClient.newHttpClient();
        HttpRequest request =HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(new Report(0,taskld,worker,result))))
                .uri(URI.create("http://80.87.199.76:3000/reports"))
                .setHeader("Content-Type", "application/json")
                .build();
       try {
           HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
       }catch(IOException|InterruptedException e){
           e.printStackTrace();
       }

    }
    double parseAndPerformOp(String s){
        double scale=Math.pow(10,2);
        int a,b;
        String op;
        s=s.replace(" ","");
        String[]operation=s.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\D)|(?<=\\d\\D)(?=\\d)");
        a=Integer.parseInt(operation[0]);
        op=operation[1];
        b=Integer.parseInt(operation[2]);
        switch (op){
            case"+":
                return a+b;
            case"-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return Math.ceil((double)(a)/b*scale)/scale;
        }
        return 0;
    }
}


