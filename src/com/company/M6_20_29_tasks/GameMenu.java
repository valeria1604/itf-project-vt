package com.company.M6_20_29_tasks;

public class GameMenu {
    public static abstract class MenuItem {
        abstract String getAction();
    }

    public static class Start extends MenuItem {
        @Override
        public String getAction() {
            return "start";
        }
    }

    public static class Options extends MenuItem {
        @Override
        public String getAction() {
            return "options";
        }
    }

    public static class Exit extends MenuItem {
        @Override
        public String getAction() {
            return "exit";
        }
    }

    public void act(MenuItem item) {
        System.out.println(item.getAction());
    }
}
