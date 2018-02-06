package com.codebender;

import javax.swing.*;

public class Menu {
    private JButton PLAYButton;
    private JButton helpButton;
    private JTabbedPane tabbedPane1;
    private JPanel menu;


    private void createUIComponents() {
    }

    public JButton getPLAYButton() {
        return PLAYButton;
    }

    public void setPLAYButton(JButton PLAYButton) {
        this.PLAYButton = PLAYButton;
    }

    public JButton getHelpButton() {
        return helpButton;
    }

    public void setHelpButton(JButton helpButton) {
        this.helpButton = helpButton;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JPanel getMenu() {
        return menu;
    }

    public void setMenu(JPanel menu) {
        this.menu = menu;
    }
}
