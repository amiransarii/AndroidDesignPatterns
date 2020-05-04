package org.game.mvpdesignapplictaion2.model;

public interface GetQuoteInteractor {

    interface  OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
