package RestAssured;

import java.io.FileReader;
import java.io.IOException;

import org.json.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParsingUseCase {

	// private static final String filePath = "employee.json";

	public static void main(String[] args) throws IOException, ParseException, JSONException {

		//jsonArrayFind();
		
		
		
		JSONObject obj=new JSONObject();
		obj.put("firstname", "Cat");
		JSONArray arr=new JSONArray();
		JSONObject lang1=new JSONObject();
		lang1.put("lang","en");
		lang1.put("knowledge","proficient");
		JSONObject lang2=new JSONObject();
		lang2.put("lang","Kan");
		lang2.put("knowledge","expert");
		arr.put(lang1);
		arr.put(lang2);
		obj.put("languages", arr);
		obj.put("id", 1);
		JSONObject job=new JSONObject();
		job.put("site","www.jav");
		job.put("name", "geeks");
		obj.put("job", job);
		
		System.out.println(obj.toString());
		
		
		String input=obj.toString();
		JSONObject json1=new JSONObject(input);
		System.out.println("firstName :: "+json1.get("firstname"));
		JSONArray arr1=obj.getJSONArray("languages");
		for(int i=0;i<arr1.length();i++) {
			JSONObject data1=arr1.getJSONObject(i);
			System.out.println("language : " + data1.get("lang"));
		}
		
		

	}

	public static void jsonArrayFind() throws IOException, ParseException, JSONException {

		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader("C:\\Users\\Shobha Gangaiah\\Desktop\\Shobha\\employee.json");
		Object obj = jsonParser.parse(reader);
		System.out.println(obj);

		JSONArray jsonArr = new JSONArray(obj.toString());
		System.out.println(jsonArr);
		for (int i = 0; i < jsonArr.length(); i++) {
			JSONObject jsonObj=jsonArr.getJSONObject(i);
			System.out.println(jsonObj);
			if(jsonObj.get("id").equals(2)) {
				JSONObject jsonObj1=jsonObj.getJSONObject("job");
				String jobName=jsonObj1.getString("name");
				System.out.println(jobName);
				
				JSONArray arr=jsonObj.getJSONArray("languages");
				JSONObject jsonObj2=arr.getJSONObject(0);
				/*
				 * if(jsonObj2.getString("lan")) {
				 * 
				 * }
				 */
			}
			

		}

	}

}
