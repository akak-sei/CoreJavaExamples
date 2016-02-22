/**
 * Created by akak on 2/4/2016.
 */
package com.kak.corejavaexamples;

public class InnerClassButton {
    private String title;
    private OnClickListener onClickListener;

    public InnerClassButton(String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }

    public void setOnClickListener (OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick () {
        this.onClickListener.onClick (this.title);
    }

    public interface OnClickListener {
        public void onClick (String title);
    }
}
