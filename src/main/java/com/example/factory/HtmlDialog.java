package com.example.factory;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
