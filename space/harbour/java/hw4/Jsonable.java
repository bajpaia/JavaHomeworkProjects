package space.harbour.java.hw4;

import javax.json.*;

public interface Jsonable 
{

	JsonObject toJsonObject();
	String toJsonString();

}
