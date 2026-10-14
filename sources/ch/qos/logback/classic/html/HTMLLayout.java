package ch.qos.logback.classic.html;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.pattern.MDCConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.helpers.Transform;
import ch.qos.logback.core.html.HTMLLayoutBase;
import ch.qos.logback.core.html.IThrowableRenderer;
import ch.qos.logback.core.pattern.Converter;
import java.util.Locale;
import java.util.Map;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public class HTMLLayout extends HTMLLayoutBase<ILoggingEvent> {
    public static final String DEFAULT_CONVERSION_PATTERN = "%date%thread%level%logger%mdc%msg";
    public IThrowableRenderer<ILoggingEvent> throwableRenderer;

    public HTMLLayout() {
        this.pattern = DEFAULT_CONVERSION_PATTERN;
        this.throwableRenderer = new DefaultThrowableRenderer();
        this.cssBuilder = new DefaultCssBuilder();
    }

    private void appendEventToBuffer(StringBuilder sb2, Converter<ILoggingEvent> converter, ILoggingEvent iLoggingEvent) {
        sb2.append("<td class=\"");
        sb2.append(computeConverterName(converter));
        sb2.append("\">");
        sb2.append(Transform.escapeTags(converter.convert(iLoggingEvent)));
        sb2.append("</td>");
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase
    public String computeConverterName(Converter<ILoggingEvent> converter) {
        if (!(converter instanceof MDCConverter)) {
            return super.computeConverterName(converter);
        }
        String firstOption = ((MDCConverter) converter).getFirstOption();
        return firstOption != null ? firstOption : "MDC";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ch.qos.logback.core.Layout
    public String doLayout(ILoggingEvent iLoggingEvent) {
        StringBuilder sb2 = new StringBuilder();
        startNewTableIfLimitReached(sb2);
        long j10 = this.counter;
        this.counter = j10 + 1;
        boolean z10 = (j10 & 1) != 0;
        String lowerCase = iLoggingEvent.getLevel().toString().toLowerCase(Locale.US);
        String str = CoreConstants.LINE_SEPARATOR;
        e.a(sb2, str, "<tr class=\"", lowerCase);
        sb2.append(z10 ? " odd\">" : " even\">");
        sb2.append(str);
        for (Converter next = this.head; next != null; next = next.getNext()) {
            appendEventToBuffer(sb2, next, iLoggingEvent);
        }
        sb2.append("</tr>");
        sb2.append(CoreConstants.LINE_SEPARATOR);
        if (iLoggingEvent.getThrowableProxy() != null) {
            this.throwableRenderer.render(sb2, iLoggingEvent);
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase
    public Map<String, String> getDefaultConverterMap() {
        return PatternLayout.defaultConverterMap;
    }

    public IThrowableRenderer<ILoggingEvent> getThrowableRenderer() {
        return this.throwableRenderer;
    }

    public void setThrowableRenderer(IThrowableRenderer<ILoggingEvent> iThrowableRenderer) {
        this.throwableRenderer = iThrowableRenderer;
    }

    @Override // ch.qos.logback.core.html.HTMLLayoutBase, ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z10;
        if (this.throwableRenderer == null) {
            addError("ThrowableRender cannot be null.");
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        super.start();
    }
}
