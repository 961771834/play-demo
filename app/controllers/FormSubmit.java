package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.form.form;
import views.html.form.home;
import web.User;

public class FormSubmit extends Controller {

    /**input form*/
    private Form<User>  addForm;
    public Result form (){
        flash().clear();
        User user = new User();
        addForm = Form.form(User.class);
        addForm = addForm.fill(user);
        return ok(form.render());
    }

    public Result add(){
        flash().clear();
        /*bind request*/
        Form<User> completeRequestForm =  addForm.bindFromRequest();
        User completedForm = completeRequestForm.get();
        addForm = addForm.fill(completedForm);
        if(completeRequestForm.hasErrors()){
            return badRequest("this is wrong");
        }

        return ok(home.render(addForm,true));
    }
}
