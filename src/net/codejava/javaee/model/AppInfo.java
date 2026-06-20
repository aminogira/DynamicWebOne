package net.codejava.javaee.model;

public class AppInfo {
    private String applicationName = "Multi Git Test Project";
    private String version = "1.0.0";

    public AppInfo() {
    }

    public AppInfo(String applicationName, String version) {
        this.applicationName = applicationName;
        this.version = version;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AppInfo [applicationName=" + applicationName + ", version=" + version + "]";
    }
}
