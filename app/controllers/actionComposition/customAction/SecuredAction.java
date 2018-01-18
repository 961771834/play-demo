package controllers.actionComposition.customAction;

import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletionStage;

public class SecuredAction extends Action.Simple {

    @Override
    public CompletionStage<Result> call(Http.Context ctx) {
        String token = getTokenFromHeader(ctx);
        if (token != null) {
            /** do some action*/


        }
        return delegate.call(ctx);
    }

    private String getTokenFromHeader(Http.Context ctx) {
        String[] authTokenHeaderValues = ctx.request().headers().get("X-AUTH-TOKEN");
        if ((authTokenHeaderValues != null) && (authTokenHeaderValues.length == 1) && (authTokenHeaderValues[0] != null)) {
            return authTokenHeaderValues[0];
        }
        return null;
    }
}
