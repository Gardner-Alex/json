package json;
import java.util.HashMap;

import org.json.simple.JSONObject;


public class jsonexample{


@SuppressWarnings("unchecked")
public static void main(String[] args) {
	//creates a jsonobject named videogame
	JSONObject videogame = new JSONObject();
	
	//assigns keys and values to videogame
	videogame.put("Character","Link");
	videogame.put("Game","The Legend of Zelda");
	videogame.put("Position","Hero of Time");
	videogame.put("World","Hyrule");

	//prints out the videogame jsonobject
	System.out.println(videogame);
	
	//prints out how long the videogame object is
	System.out.println(videogame.size());
	
	//Looking for the key "Position" inside of videogame
	System.out.println(videogame.containsKey("Position"));
	
	//Looking for the value instead of key will not work.
	System.out.println(videogame.containsKey("Link"));
	System.out.println();
	
	HashMap<String, String> gameMap = new HashMap<String, String>();
	gameMap = videogame;
	
	System.out.println(gameMap);
	

}

}