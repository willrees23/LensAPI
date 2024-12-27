package dev.wand.settings;

public class APISettingsBuilder {

    private final APISettings settings;

    public APISettingsBuilder() {
        this.settings = new APISettings();
    }

    public APISettingsBuilder consolePrefix(String consolePrefix) {
        settings.setConsolePrefix(consolePrefix);
        return this;
    }

    public APISettingsBuilder chatPrefix(String chatPrefix) {
        settings.setChatPrefix(chatPrefix);
        return this;
    }

    public APISettings build() {
        return settings;
    }
}
