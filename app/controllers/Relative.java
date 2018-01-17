package controllers;

import play.mvc.Controller;
import play.mvc.Result;

public class Relative extends Controller {

    public static Result helloView(){
         return ok(views.html.hello.view.render("bob",request()));
    }

    public static Result hello(String name) {
        return ok("Hello " + name + "!");
    }
}
