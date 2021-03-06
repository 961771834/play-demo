package controllers.actionComposition;

import play.Logger;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;


/** custom action Can be used to verify */

/** A simple action with no configuration.*/
public class VerboseAction extends Action.Simple {
    @Override
    public CompletionStage<Result> call(Http.Context ctx) {


        Logger.info("Calling action for {}",ctx);
        return  delegate.call(ctx);
    }
}
