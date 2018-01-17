package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.mvc.Controller;
import play.mvc.Result;

public class BodyParserController extends Controller {

    public static Result index(){
        JsonNode json = request().body().asJson();

        return ok("get name  " + json.get("name").asText());
    }
}
