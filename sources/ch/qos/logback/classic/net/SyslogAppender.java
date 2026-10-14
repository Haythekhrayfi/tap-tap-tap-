package ch.qos.logback.classic.net;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.SyslogStartConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.util.LevelToSyslogSeverity;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.net.SyslogAppenderBase;
import ch.qos.logback.core.net.SyslogOutputStream;
import defpackage.a;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public class SyslogAppender extends SyslogAppenderBase<ILoggingEvent> {
    public static final String DEFAULT_STACKTRACE_PATTERN = "\t";
    public static final String DEFAULT_SUFFIX_PATTERN = "[%thread] %logger %msg";
    public PatternLayout stackTraceLayout = new PatternLayout();
    public String stackTracePattern = DEFAULT_STACKTRACE_PATTERN;
    public boolean throwableExcluded = false;

    private void handleThrowableFirstLine(OutputStream outputStream, IThrowableProxy iThrowableProxy, String str, boolean z10) throws IOException {
        StringBuilder sbA = a.a(str);
        if (!z10) {
            sbA.append(CoreConstants.CAUSED_BY);
        }
        sbA.append(iThrowableProxy.getClassName());
        sbA.append(": ");
        sbA.append(iThrowableProxy.getMessage());
        outputStream.write(sbA.toString().getBytes());
        outputStream.flush();
    }

    private void setupStackTraceLayout() {
        this.stackTraceLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        this.stackTraceLayout.setPattern(getPrefixPattern() + this.stackTracePattern);
        this.stackTraceLayout.setContext(getContext());
        this.stackTraceLayout.start();
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public Layout<ILoggingEvent> buildLayout() {
        PatternLayout patternLayout = new PatternLayout();
        patternLayout.getInstanceConverterMap().put("syslogStart", SyslogStartConverter.class.getName());
        if (this.suffixPattern == null) {
            this.suffixPattern = DEFAULT_SUFFIX_PATTERN;
        }
        patternLayout.setPattern(getPrefixPattern() + this.suffixPattern);
        patternLayout.setContext(getContext());
        patternLayout.start();
        return patternLayout;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public SyslogOutputStream createOutputStream() throws SocketException, UnknownHostException {
        return new SyslogOutputStream(getSyslogHost(), getPort());
    }

    public String getPrefixPattern() {
        StringBuilder sbA = a.a("%syslogStart{");
        sbA.append(getFacility());
        sbA.append("}%nopex{}");
        return sbA.toString();
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public int getSeverityForEvent(Object obj) {
        return LevelToSyslogSeverity.convert((ILoggingEvent) obj);
    }

    public String getStackTracePattern() {
        return this.stackTracePattern;
    }

    public boolean isThrowableExcluded() {
        return this.throwableExcluded;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase
    public void postProcess(Object obj, OutputStream outputStream) {
        ILoggingEvent iLoggingEvent;
        IThrowableProxy throwableProxy;
        if (this.throwableExcluded || (throwableProxy = (iLoggingEvent = (ILoggingEvent) obj).getThrowableProxy()) == null) {
            return;
        }
        String strDoLayout = this.stackTraceLayout.doLayout(iLoggingEvent);
        boolean z10 = true;
        while (throwableProxy != null) {
            StackTraceElementProxy[] stackTraceElementProxyArray = throwableProxy.getStackTraceElementProxyArray();
            try {
                handleThrowableFirstLine(outputStream, throwableProxy, strDoLayout, z10);
                for (StackTraceElementProxy stackTraceElementProxy : stackTraceElementProxyArray) {
                    outputStream.write((strDoLayout + stackTraceElementProxy).getBytes());
                    outputStream.flush();
                }
                throwableProxy = throwableProxy.getCause();
                z10 = false;
            } catch (IOException unused) {
                return;
            }
        }
    }

    public void setStackTracePattern(String str) {
        this.stackTracePattern = str;
    }

    public void setThrowableExcluded(boolean z10) {
        this.throwableExcluded = z10;
    }

    public boolean stackTraceHeaderLine(StringBuilder sb2, boolean z10) {
        return false;
    }

    @Override // ch.qos.logback.core.net.SyslogAppenderBase, ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        setupStackTraceLayout();
    }
}
