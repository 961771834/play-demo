package controllers.actionComposition.customAnnotation;

import play.Logger;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;


public class VerboseAnnotationAction extends Action<VerboseAnnotation> {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        System.out.println(configuration);
        if (configuration.value()) {
            Logger.info("Calling action for {}", ctx);
        }
        return delegate.call(ctx);
    }
}
