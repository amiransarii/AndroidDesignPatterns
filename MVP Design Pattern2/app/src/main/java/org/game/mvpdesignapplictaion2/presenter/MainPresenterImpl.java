package org.game.mvpdesignapplictaion2.presenter;

import org.game.mvpdesignapplictaion2.model.GetQuoteInteractor;
import org.game.mvpdesignapplictaion2.view.MainView;

/**
 * The above class implements the Presenter and nested interface from GetQuoteInteractor. Moreover it instantiates the MainView and GetQuoteInteractor
 * interfaces (View and Model respectively).
 * onButtonClick method would be triggered in the MainActivity class when the button is clicked and will display a progressBar while it gets the next random quote.
 * onDestroy() method would be invoked inside the lifecycle method onDestroy() of the MainActivity.
 * onFinished() method gets called when the handler is completed inside the GetQuoteInteractorImpl. It returns the string which will be displayed in the
 * TextView using the MainView’s instance.
 */


public class MainPresenterImpl implements MainPresenter, GetQuoteInteractor.OnFinishedListener {

    private MainView mainView;
    private GetQuoteInteractor getQuoteInteractor;

    public MainPresenterImpl(MainView mainView,GetQuoteInteractor getQuoteInteractor){
        this.mainView = mainView;
        this.getQuoteInteractor = getQuoteInteractor;
    }

    @Override
    public void onFinished(String string) {

        if(mainView != null){
            mainView.setQuote(string);
            mainView.hideProgress();
        }
    }

    @Override
    public void onButtonClick() {
       if(mainView != null){
           mainView.showProgress();
       }
       getQuoteInteractor.getNextQuote(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }
}
