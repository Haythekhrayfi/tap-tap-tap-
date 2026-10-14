package ch.qos.logback.classic.android;

import android.util.Log;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class LogcatAppender extends UnsynchronizedAppenderBase<ILoggingEvent> {
    private static final int MAX_TAG_LENGTH = 23;
    private PatternLayoutEncoder encoder = null;
    private PatternLayoutEncoder tagEncoder = null;
    private boolean checkLoggable = false;

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase
    public void append(ILoggingEvent iLoggingEvent) {
        if (isStarted()) {
            String tag = getTag(iLoggingEvent);
            int i10 = iLoggingEvent.getLevel().levelInt;
            if (i10 == Integer.MIN_VALUE || i10 == 5000) {
                if (!this.checkLoggable || Log.isLoggable(tag, 2)) {
                    Log.v(tag, this.encoder.getLayout().doLayout(iLoggingEvent));
                    return;
                }
                return;
            }
            if (i10 == 10000) {
                if (!this.checkLoggable || Log.isLoggable(tag, 3)) {
                    Log.d(tag, this.encoder.getLayout().doLayout(iLoggingEvent));
                    return;
                }
                return;
            }
            if (i10 == 20000) {
                if (!this.checkLoggable || Log.isLoggable(tag, 4)) {
                    Log.i(tag, this.encoder.getLayout().doLayout(iLoggingEvent));
                    return;
                }
                return;
            }
            if (i10 == 30000) {
                if (!this.checkLoggable || Log.isLoggable(tag, 5)) {
                    Log.w(tag, this.encoder.getLayout().doLayout(iLoggingEvent));
                    return;
                }
                return;
            }
            if (i10 != 40000) {
                return;
            }
            if (!this.checkLoggable || Log.isLoggable(tag, 6)) {
                Log.e(tag, this.encoder.getLayout().doLayout(iLoggingEvent));
            }
        }
    }

    public boolean getCheckLoggable() {
        return this.checkLoggable;
    }

    public PatternLayoutEncoder getEncoder() {
        return this.encoder;
    }

    public String getTag(ILoggingEvent iLoggingEvent) {
        PatternLayoutEncoder patternLayoutEncoder = this.tagEncoder;
        String strDoLayout = patternLayoutEncoder != null ? patternLayoutEncoder.getLayout().doLayout(iLoggingEvent) : iLoggingEvent.getLoggerName();
        if (!this.checkLoggable || strDoLayout.length() <= 23) {
            return strDoLayout;
        }
        return strDoLayout.substring(0, 22) + Marker.ANY_MARKER;
    }

    public PatternLayoutEncoder getTagEncoder() {
        return this.tagEncoder;
    }

    public void setCheckLoggable(boolean z10) {
        this.checkLoggable = z10;
    }

    public void setEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.encoder = patternLayoutEncoder;
    }

    public void setTagEncoder(PatternLayoutEncoder patternLayoutEncoder) {
        this.tagEncoder = patternLayoutEncoder;
    }

    @Override // ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        StringBuilder sb2;
        String str;
        PatternLayoutEncoder patternLayoutEncoder = this.encoder;
        if (patternLayoutEncoder != null && patternLayoutEncoder.getLayout() != null) {
            PatternLayoutEncoder patternLayoutEncoder2 = this.tagEncoder;
            if (patternLayoutEncoder2 != null) {
                Layout<ILoggingEvent> layout = patternLayoutEncoder2.getLayout();
                if (layout == null) {
                    sb2 = new StringBuilder();
                    str = "No tag layout set for the appender named [";
                } else if (layout instanceof PatternLayout) {
                    String pattern = this.tagEncoder.getPattern();
                    if (!pattern.contains("%nopex")) {
                        this.tagEncoder.stop();
                        this.tagEncoder.setPattern(pattern + "%nopex");
                        this.tagEncoder.start();
                    }
                    ((PatternLayout) layout).setPostCompileProcessor(null);
                }
            }
            super.start();
            return;
        }
        sb2 = new StringBuilder();
        str = "No layout set for the appender named [";
        sb2.append(str);
        sb2.append(this.name);
        sb2.append("].");
        addError(sb2.toString());
    }
}
