package practice2728;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    @Operation(name="sum")
    public void sum(Data data){
        int sum=0;
        for(int i=0;i<data.getNumbers().size();i++){
            sum+=data.getNumbers().get(i);
        }
        System.out.println(sum);
    }
    @Operation(name="print")
    public void print(Data data){
        for (int i=0;i<data.getWords().size();i++){
            if(i!=data.getWords().size()-1) {
                System.out.print(data.getWords().get(i) + data.getDelimeter());
            }
            else{
                System.out.print(data.getWords().get(i));
            }
        }
        System.out.println();
    }

    }

