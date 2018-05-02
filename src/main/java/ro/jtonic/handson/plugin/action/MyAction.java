package ro.jtonic.handson.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class MyAction extends AnAction {

  @Override
  public void actionPerformed(AnActionEvent e) {
    System.out.println("My action");
  }
}
