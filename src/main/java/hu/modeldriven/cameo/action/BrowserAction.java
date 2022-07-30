package hu.modeldriven.cameo.action;

import com.nomagic.magicdraw.ui.browser.actions.DefaultBrowserAction;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import hu.modeldriven.cameo.ui.UnmarshallDialog;

import java.awt.event.ActionEvent;

public class BrowserAction extends DefaultBrowserAction {

    public BrowserAction(String id, String name) {
        super(id, name, null, null);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        var parent = MDDialogParentProvider.getProvider().getDialogParent(true);
        var dialog = new UnmarshallDialog(parent);
        dialog.setVisible(true);
    }
}
