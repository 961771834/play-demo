package controllers;

import controllers.actionComposition.VerboseAction;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.index;

public class Application extends Controller {


    @With(VerboseAction.class)
    public static Result index() {
        String message = flash("success");
        if(message == null){
            message = "Your new application is ready.";
        }
        return ok(index.render(message));
    }


    public  static Result save(){
        flash("success","The item has been created");
        return redirect("/");
    }

}
