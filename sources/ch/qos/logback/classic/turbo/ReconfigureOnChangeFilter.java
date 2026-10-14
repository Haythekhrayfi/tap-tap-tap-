package ch.qos.logback.classic.turbo;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.classic.joran.ReconfigureOnChangeTask;
import ch.qos.logback.core.android.AndroidContextUtil;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.net.URL;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    public ConfigurationWatchList configurationWatchList;
    public URL mainConfigurationURL;
    public volatile long nextCheck;
    public long refreshPeriod = 60000;
    private long invocationCounter = 0;
    private volatile long mask = 15;
    private volatile long lastMaskCheck = System.currentTimeMillis();

    public class a implements Runnable {
        public a() {
        }

        public final void a(LoggerContext loggerContext, List<SaxEvent> list, URL url) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(loggerContext);
            if (list == null) {
                ReconfigureOnChangeFilter.this.addWarn("No previous configuration to fall back on.");
                return;
            }
            ReconfigureOnChangeFilter.this.addWarn("Falling back to previously registered safe configuration.");
            try {
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                GenericConfigurator.informContextOfURLUsedForConfiguration(loggerContext, url);
                joranConfigurator.doConfigure(list);
                ReconfigureOnChangeFilter.this.addInfo(ReconfigureOnChangeTask.RE_REGISTERING_PREVIOUS_SAFE_CONFIGURATION);
                joranConfigurator.registerSafeConfiguration(list);
            } catch (JoranException e10) {
                ReconfigureOnChangeFilter.this.addError("Unexpected exception thrown by a configuration considered safe.", e10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (reconfigureOnChangeFilter.mainConfigurationURL == null) {
                reconfigureOnChangeFilter.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) reconfigureOnChangeFilter.context;
            ReconfigureOnChangeFilter reconfigureOnChangeFilter2 = ReconfigureOnChangeFilter.this;
            StringBuilder sbA = defpackage.a.a("Will reset and reconfigure context named [");
            sbA.append(ReconfigureOnChangeFilter.this.context.getName());
            sbA.append("]");
            reconfigureOnChangeFilter2.addInfo(sbA.toString());
            if (ReconfigureOnChangeFilter.this.mainConfigurationURL.toString().endsWith("xml")) {
                JoranConfigurator joranConfigurator = new JoranConfigurator();
                joranConfigurator.setContext(loggerContext);
                StatusUtil statusUtil = new StatusUtil(loggerContext);
                List<SaxEvent> listRecallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
                URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(loggerContext);
                loggerContext.reset();
                new AndroidContextUtil().setupProperties(loggerContext);
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    joranConfigurator.doConfigure(ReconfigureOnChangeFilter.this.mainConfigurationURL);
                    if (statusUtil.hasXMLParsingErrors(jCurrentTimeMillis)) {
                        a(loggerContext, listRecallSafeConfiguration, mainWatchURL);
                    }
                } catch (JoranException unused) {
                    a(loggerContext, listRecallSafeConfiguration, mainWatchURL);
                }
            }
        }
    }

    private void updateMaskIfNecessary(long j10) {
        long j11;
        long j12 = j10 - this.lastMaskCheck;
        this.lastMaskCheck = j10;
        if (j12 < 100 && this.mask < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j11 = (this.mask << 1) | 1;
        } else if (j12 <= MASK_DECREASE_THRESHOLD) {
            return;
        } else {
            j11 = this.mask >>> 2;
        }
        this.mask = j11;
    }

    public boolean changeDetected(long j10) {
        if (j10 < this.nextCheck) {
            return false;
        }
        updateNextCheck(j10);
        return this.configurationWatchList.changeDetected();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        long j10 = this.invocationCounter;
        this.invocationCounter = 1 + j10;
        if ((j10 & this.mask) != this.mask) {
            return FilterReply.NEUTRAL;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.configurationWatchList) {
            updateMaskIfNecessary(jCurrentTimeMillis);
            if (changeDetected(jCurrentTimeMillis)) {
                disableSubsequentReconfiguration();
                detachReconfigurationToNewThread();
            }
        }
        return FilterReply.NEUTRAL;
    }

    public void detachReconfigurationToNewThread() {
        StringBuilder sbA = defpackage.a.a("Detected change in [");
        sbA.append(this.configurationWatchList.getCopyOfFileWatchList());
        sbA.append("]");
        addInfo(sbA.toString());
        this.context.getScheduledExecutorService().submit(new a());
    }

    public void disableSubsequentReconfiguration() {
        this.nextCheck = RecyclerView.FOREVER_NS;
    }

    public long getRefreshPeriod() {
        return this.refreshPeriod;
    }

    public void setRefreshPeriod(long j10) {
        this.refreshPeriod = j10;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        this.configurationWatchList = configurationWatchList;
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        URL mainURL = configurationWatchList.getMainURL();
        this.mainConfigurationURL = mainURL;
        if (mainURL == null) {
            addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        addInfo("Will scan for changes in [" + this.configurationWatchList.getCopyOfFileWatchList() + "] every " + (this.refreshPeriod / 1000) + " seconds. ");
        synchronized (this.configurationWatchList) {
            updateNextCheck(System.currentTimeMillis());
        }
        super.start();
    }

    public String toString() {
        return o2.a.a(defpackage.a.a("ReconfigureOnChangeFilter{invocationCounter="), this.invocationCounter, '}');
    }

    public void updateNextCheck(long j10) {
        this.nextCheck = j10 + this.refreshPeriod;
    }
}
