package ro.jtonic.handson.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class MyAction extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    System.out.println("e.isFromActionToolbar() = " + e.isFromActionToolbar());
    Messages.showMessageDialog("Hello World!!!", "Message", Messages.getInformationIcon());
  }
}
