package controllers.action;

import play.Logger;
import play.http.ActionCreator;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.lang.reflect.Method;
import java.util.concurrent.CompletionStage;

public class MyActionCreator implements ActionCreator {
    @Override
    public Action createAction(Http.Request request, Method actionMethod) {
        return new Action.Simple() {
            @Override
            public CompletionStage<Result> call(Http.Context ctx) {
                Logger.info("action creator....");
                return delegate.call(ctx);
            }
        };
    }
}
