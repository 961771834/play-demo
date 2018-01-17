package controllers;


import controllers.actionComposition.customAnnotation.VerboseAnnotation;
import play.mvc.Controller;
import play.mvc.Result;

public class HandleDynamicRouterController extends Controller {

    @VerboseAnnotation(true)
    public static Result show(Integer id){
        return ok("request id"+id);
    }

    public static Result download(String name){
        return ok("request files are  "+ name);
    }

    public static Result showPage(String page){
        return ok("request page  "+page);
    }

    public static Result list(Integer id){
        return ok("request clients "+ id);
    }
}




