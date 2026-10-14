package ch.qos.logback.core.html;

import android.support.v4.media.c;
import androidx.activity.k;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;
import ch.qos.logback.core.pattern.Converter;
import ch.qos.logback.core.pattern.ConverterUtil;
import ch.qos.logback.core.pattern.parser.Parser;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ch.qos.logback.core.spi.ScanException;
import defpackage.a;
import j1.d;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import v.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class HTMLLayoutBase<E> extends LayoutBase<E> {
    public CssBuilder cssBuilder;
    public Converter<E> head;
    public String pattern;
    public String title = "Logback Log Messages";
    public long counter = 0;

    private void buildHeaderRowForTable(StringBuilder sb2) {
        sb2.append("<tr class=\"header\">");
        sb2.append(CoreConstants.LINE_SEPARATOR);
        for (Converter<E> next = this.head; next != null; next = next.getNext()) {
            if (computeConverterName(next) != null) {
                sb2.append("<td class=\"");
                sb2.append(computeConverterName(next));
                sb2.append("\">");
                sb2.append(computeConverterName(next));
                sb2.append("</td>");
                sb2.append(CoreConstants.LINE_SEPARATOR);
            }
        }
        sb2.append("</tr>");
        sb2.append(CoreConstants.LINE_SEPARATOR);
    }

    public String computeConverterName(Converter<E> converter) {
        String simpleName = converter.getClass().getSimpleName();
        int iIndexOf = simpleName.indexOf("Converter");
        return iIndexOf == -1 ? simpleName : simpleName.substring(0, iIndexOf);
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getContentType() {
        return "text/html";
    }

    public CssBuilder getCssBuilder() {
        return this.cssBuilder;
    }

    public abstract Map<String, String> getDefaultConverterMap();

    public Map<String, String> getEffectiveConverterMap() {
        Map map;
        HashMap map2 = new HashMap();
        Map<String, String> defaultConverterMap = getDefaultConverterMap();
        if (defaultConverterMap != null) {
            map2.putAll(defaultConverterMap);
        }
        Context context = getContext();
        if (context != null && (map = (Map) context.getObject(CoreConstants.PATTERN_RULE_REGISTRY)) != null) {
            map2.putAll(map);
        }
        return map2;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileFooter() {
        return k.a(new StringBuilder(), CoreConstants.LINE_SEPARATOR, "</body></html>");
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getFileHeader() {
        StringBuilder sbA = c.a("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"", " \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
        String str = CoreConstants.LINE_SEPARATOR;
        d.a(sbA, str, "<html>", str, "  <head>");
        sbA.append(str);
        sbA.append("    <title>");
        e.a(sbA, this.title, "</title>", str);
        this.cssBuilder.addCss(sbA);
        sbA.append(str);
        sbA.append("  </head>");
        sbA.append(str);
        return k.a(sbA, "<body>", str);
    }

    public String getPattern() {
        return this.pattern;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationFooter() {
        return "</table>";
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.Layout
    public String getPresentationHeader() {
        StringBuilder sbA = a.a("<hr/>");
        String str = CoreConstants.LINE_SEPARATOR;
        sbA.append(str);
        sbA.append("<p>Log session start time ");
        sbA.append(new Date());
        sbA.append("</p><p></p>");
        sbA.append(str);
        e.a(sbA, str, "<table cellspacing=\"0\">", str);
        buildHeaderRowForTable(sbA);
        return sbA.toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setCssBuilder(CssBuilder cssBuilder) {
        this.cssBuilder = cssBuilder;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // ch.qos.logback.core.LayoutBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        boolean z10;
        try {
            Parser parser = new Parser(this.pattern);
            parser.setContext(getContext());
            Converter<E> converterCompile = parser.compile(parser.parse(), getEffectiveConverterMap());
            this.head = converterCompile;
            ConverterUtil.startConverters(converterCompile);
            z10 = false;
        } catch (ScanException e10) {
            addError("Incorrect pattern found", e10);
            z10 = true;
        }
        if (z10) {
            return;
        }
        this.started = true;
    }

    public void startNewTableIfLimitReached(StringBuilder sb2) {
        if (this.counter >= AbstractComponentTracker.LINGERING_TIMEOUT) {
            this.counter = 0L;
            sb2.append("</table>");
            String str = CoreConstants.LINE_SEPARATOR;
            d.a(sb2, str, "<p></p>", "<table cellspacing=\"0\">", str);
            buildHeaderRowForTable(sb2);
        }
    }
}
