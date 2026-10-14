package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.Status;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import defpackage.a;
import java.io.PrintStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class ConfigurationWatchListUtil {
    public static final ConfigurationWatchListUtil origin = new ConfigurationWatchListUtil();

    private ConfigurationWatchListUtil() {
    }

    public static void addInfo(Context context, String str) {
        addStatus(context, new InfoStatus(str, origin));
    }

    public static void addStatus(Context context, Status status) {
        if (context == null) {
            PrintStream printStream = System.out;
            StringBuilder sbA = a.a("Null context in ");
            sbA.append(ConfigurationWatchList.class.getName());
            printStream.println(sbA.toString());
            return;
        }
        StatusManager statusManager = context.getStatusManager();
        if (statusManager == null) {
            return;
        }
        statusManager.add(status);
    }

    public static void addToWatchList(Context context, URL url) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            addWarn(context, "Null ConfigurationWatchList. Cannot add " + url);
            return;
        }
        addInfo(context, "Adding [" + url + "] to configuration watch list.");
        configurationWatchList.addToWatchList(url);
    }

    public static void addWarn(Context context, String str) {
        addStatus(context, new WarnStatus(str, origin));
    }

    public static ConfigurationWatchList getConfigurationWatchList(Context context) {
        if (context == null) {
            return null;
        }
        return (ConfigurationWatchList) context.getObject(CoreConstants.CONFIGURATION_WATCH_LIST);
    }

    public static URL getMainWatchURL(Context context) {
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            return null;
        }
        return configurationWatchList.getMainURL();
    }

    public static void registerConfigurationWatchList(Context context, ConfigurationWatchList configurationWatchList) {
        context.putObject(CoreConstants.CONFIGURATION_WATCH_LIST, configurationWatchList);
    }

    public static void setMainWatchURL(Context context, URL url) {
        if (context == null) {
            return;
        }
        ConfigurationWatchList configurationWatchList = getConfigurationWatchList(context);
        if (configurationWatchList == null) {
            configurationWatchList = new ConfigurationWatchList();
            configurationWatchList.setContext(context);
            context.putObject(CoreConstants.CONFIGURATION_WATCH_LIST, configurationWatchList);
        } else {
            configurationWatchList.clear();
        }
        configurationWatchList.setMainURL(url);
    }
}
