import com.google.gson.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    private static ArrayList<JsonObject> tier1 = new ArrayList<JsonObject>();
    private static ArrayList<JsonObject> tier2 = new ArrayList<JsonObject>();
    private static ArrayList<JsonObject> tier3 = new ArrayList<JsonObject>();
    private static ArrayList<String> ref1 = new ArrayList<String>();
    private static ArrayList<String> ref2 = new ArrayList<String>();
    private static String keyword;

    public static void main(String[] args) throws IOException {
        keyword = key.readfromconsole("Enter keyword to search for: ");
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\jofeb\\Documents\\Software engi\\assigment5\\src\\main\\resources\\test1.txt"))) {

            stream.forEach(Main::parse1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ref1 = References(tier1);
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\jofeb\\Documents\\Software engi\\assigment5\\src\\main\\resources\\test1.txt"))) {

            stream.forEach(Main::parse2);

        } catch (IOException e) {
            e.printStackTrace();
        }
        ref2 = References(tier2);
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\jofeb\\Documents\\Software engi\\assigment5\\src\\main\\resources\\test1.txt"))) {

            stream.forEach(Main::parse3);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void parse1(String linea) {

        JsonObject object;
        try {
            object = JsonParser.parseString(linea).getAsJsonObject();
        } catch (IllegalStateException e) {
            System.out.print("Skipping line.");
            return;
        }
        JsonElement title = object.get("title");
        if (title.getAsString().contains(Main.keyword)){
            tier1.add(object);
        }

    }
    public static void parse2(String linea) {

        JsonObject object;
        try {
            object = JsonParser.parseString(linea).getAsJsonObject();
        } catch (IllegalStateException e) {
            System.out.print("Skipping line.");
            return;
        }
        JsonElement id = object.get("id");
        if (ref1.contains(id.getAsString())){
            tier2.add(object);
        }
    }
    public static void parse3(String linea) {

        JsonObject object;
        try {
            object = JsonParser.parseString(linea).getAsJsonObject();
        } catch (IllegalStateException e) {
            System.out.print("Skipping line.");
            return;
        }
        JsonElement id = object.get("id");
        if (ref2.contains(id.getAsString())){
            tier3.add(object);
        }
    }
    public static ArrayList<String> References (ArrayList<JsonObject> line) {
        ArrayList<String> arr = new ArrayList<String>();
        for (JsonObject ref : line) {
            try {
                JsonArray arr2 = ref.get("references").getAsJsonArray();
                for (JsonElement ele : arr2) {
                    String ID = ele.getAsString();
                    arr.add(ID);
                }
            } catch (Exception e) {
            }
        }
        return arr;
    }
}
