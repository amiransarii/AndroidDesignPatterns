package org.game.mvpdesignapplictaion2.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import android.os.Handler;

/**
 * It contains a nested interface onFinishedListener. We’ll be using a handler inside our
 * GetQuoteInteractorImpl.java below. On completion of the handler, the above onFinished method would be triggered
 */
public class GetQuoteInteractorImpl implements GetQuoteInteractor {

    private List<String> arrayList = Arrays.asList(
            "Be yourself. everyone else is already taken.",
            "A room without books is like a body without a soul.",
            "You only live once, but if you do it right, once is enough.",
            "Be the change that you wish to see in the world.",
            "If you tell the truth, you don't have to remember anything.");

    @Override
    public void getNextQuote(final OnFinishedListener listener) {

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 listener.onFinished(getRandomString());
             }
         },1200);
    }

    private String getRandomString() {

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        return arrayList.get(index);
    }
}
