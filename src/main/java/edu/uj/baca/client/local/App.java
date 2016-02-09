package edu.uj.baca.client.local;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import edu.uj.baca.client.local.components.MainComponent;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by shybovycha on 09/02/16.
 */
@EntryPoint
public class App {
    @Inject private Instance<MainComponent> mainComponent;

    @PostConstruct
    public void init() {
        RootPanel.get().add(this.mainComponent.get());
    }
}
