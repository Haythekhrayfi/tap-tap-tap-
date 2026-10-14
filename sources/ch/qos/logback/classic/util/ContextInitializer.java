package ch.qos.logback.classic.util;

import androidx.activity.j;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.InfoStatus;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.Loader;
import ch.qos.logback.core.util.OptionHelper;
import ch.qos.logback.core.util.StatusListenerConfigHelper;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import y.q;

/* JADX INFO: loaded from: classes.dex */
public class ContextInitializer {
    public static final String AUTOCONFIG_FILE = "assets/logback.xml";
    public static final String CONFIG_FILE_PROPERTY = "logback.configurationFile";
    public final ClassLoader classLoader = Loader.getClassLoaderOfObject(this);
    public final LoggerContext loggerContext;

    public ContextInitializer(LoggerContext loggerContext) {
        this.loggerContext = loggerContext;
    }

    private URL findConfigFileFromSystemProperties(boolean z10) {
        URL url;
        String systemProperty = OptionHelper.getSystemProperty(CONFIG_FILE_PROPERTY);
        try {
            if (systemProperty != null) {
                try {
                    File file = new File(systemProperty);
                    if (file.exists() && file.isFile()) {
                        if (z10) {
                            statusOnResourceSearch(systemProperty, this.classLoader, systemProperty);
                        }
                        url = file.toURI().toURL();
                    } else {
                        url = new URL(systemProperty);
                    }
                    if (z10) {
                        statusOnResourceSearch(systemProperty, this.classLoader, url != null ? url.toString() : null);
                    }
                    return url;
                } catch (MalformedURLException unused) {
                    URL resource = Loader.getResource(systemProperty, this.classLoader);
                    if (resource != null) {
                        if (z10) {
                            statusOnResourceSearch(systemProperty, this.classLoader, resource.toString());
                        }
                        return resource;
                    }
                    if (z10) {
                        statusOnResourceSearch(systemProperty, this.classLoader, resource != null ? resource.toString() : null);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            if (z10) {
                statusOnResourceSearch(systemProperty, this.classLoader, null);
            }
            throw th;
        }
    }

    private URL findConfigFileURLFromAssets(boolean z10) {
        return getResource(AUTOCONFIG_FILE, this.classLoader, z10);
    }

    private URL getResource(String str, ClassLoader classLoader, boolean z10) {
        URL resource = classLoader.getResource(str);
        if (z10) {
            statusOnResourceSearch(str, classLoader, resource != null ? str : null);
        }
        return resource;
    }

    private void statusOnResourceSearch(String str, ClassLoader classLoader, String str2) {
        StatusManager statusManager = this.loggerContext.getStatusManager();
        if (str2 == null) {
            statusManager.add(new InfoStatus(j.a("Could NOT find resource [", str, "]"), this.loggerContext));
        } else {
            statusManager.add(new InfoStatus(q.a("Found resource [", str, "] at [", str2, "]"), this.loggerContext));
        }
    }

    public void autoConfig() throws JoranException {
        boolean z10;
        URL urlFindConfigFileURLFromAssets;
        StatusListenerConfigHelper.installIfAsked(this.loggerContext);
        new AndroidContextUtil().setupProperties(this.loggerContext);
        JoranConfigurator joranConfigurator = new JoranConfigurator();
        joranConfigurator.setContext(this.loggerContext);
        URL urlFindConfigFileFromSystemProperties = findConfigFileFromSystemProperties(true);
        if (urlFindConfigFileFromSystemProperties != null) {
            joranConfigurator.doConfigure(urlFindConfigFileFromSystemProperties);
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (urlFindConfigFileURLFromAssets = findConfigFileURLFromAssets(true)) == null) {
            return;
        }
        joranConfigurator.doConfigure(urlFindConfigFileURLFromAssets);
    }
}
