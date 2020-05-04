package org.game.mvpdesignapplictaion2.view;

//The MainView.java interface is defined below.

/**
 * showProgress() and hideProgress() would be used for displaying and hiding the progressBar while the next
 * random quote is fetched from the GetQuoteInteractorImpl class.
 * setQuote() will set the random string on the textView
 */
public interface MainView {
    void showProgress();
    void hideProgress();
    void setQuote(String string);
}
