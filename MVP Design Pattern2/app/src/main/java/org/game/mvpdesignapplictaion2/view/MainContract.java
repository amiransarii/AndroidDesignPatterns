package org.game.mvpdesignapplictaion2.view;

//The code for the MainContract.java interface is given below
public class MainContract {

    interface MainView {
        void showProgress();

        void hideProgress();

        void setQuote(String string);
    }

    interface GetQuoteInteractor {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener onFinishedListener);
    }

    interface Presenter {
        void onButtonClick();

        void onDestroy();
    }
}
