package practice2728;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
        Gson gson = new Gson();
        Worker worker = new Worker();
        Operation operation;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        ArrayList<Task> array = gson.fromJson(response.body(), new TypeToken<ArrayList<Task>>(){}.getType());
        List<Method> methods = Arrays.stream(Worker.class.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch(a -> a instanceof Operation))
                .collect(Collectors.toList());

        for (Task i : array) {
            for (Method j : methods) {
                    operation=j.getAnnotation(Operation.class);
                    if(i.getType().equals(operation.name())){
                       j.invoke(worker,i.getData());
                    }
                }
            }
        }
    }


