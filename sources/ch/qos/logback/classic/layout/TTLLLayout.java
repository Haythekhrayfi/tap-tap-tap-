package ch.qos.logback.classic.layout;

import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.util.CachingDateFormatter;

/* JADX INFO: loaded from: classes.dex */
public class TTLLLayout extends LayoutBase<ILoggingEvent> {
    public CachingDateFormatter cachingDateFormatter = new CachingDateFormatter("HH:mm:ss.SSS");
    public ThrowableProxyConverter tpc = new ThrowableProxyConverter();

    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        if (!isStarted()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.cachingDateFormatter.format(iLoggingEvent.getTimeStamp()));
        sb2.append(" [");
        sb2.append(iLoggingEvent.getThreadName());
        sb2.append("] ");
        sb2.append(iLoggingEvent.getLevel().toString());
        sb2.append(" ");
        sb2.append(iLoggingEvent.getLoggerName());
        sb2.append(" - ");
        sb2.append(iLoggingEvent.getFormattedMessage());
        sb2.append(CoreConstants.LINE_SEPARATOR);
        if (iLoggingEvent.getThrowableProxy() != null) {
            sb2.append(this.tpc.convert(iLoggingEvent));
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        this.tpc.start();
        super.start();
    }
}
