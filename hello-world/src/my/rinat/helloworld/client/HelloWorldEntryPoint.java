package my.rinat.helloworld.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class HelloWorldEntryPoint implements EntryPoint {
    public void onModuleLoad() {
        Label greeting = new Label("Hello World");
        RootPanel.get().add(greeting);
    }
}
