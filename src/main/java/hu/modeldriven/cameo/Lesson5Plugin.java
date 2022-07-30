package hu.modeldriven.cameo;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.plugins.Plugin;
import hu.modeldriven.cameo.action.BrowserAction;
import hu.modeldriven.cameo.action.BrowserConfiguration;

public class Lesson5Plugin extends Plugin {

    @Override
    public void init() {
        var action = new BrowserAction("Lesson5BrowserAction", "Lesson 5 Browser action");
        var browserConfiguration = new BrowserConfiguration(action);
        ActionsConfiguratorsManager.getInstance().addContainmentBrowserContextConfigurator(browserConfiguration);
    }

    @Override
    public boolean close() {
        return true;
    }

    @Override
    public boolean isSupported() {
        return true;
    }
}
