package ch.qos.logback.classic.html;

import ch.qos.logback.core.html.CssBuilder;

/* JADX INFO: loaded from: classes.dex */
public class UrlCssBuilder implements CssBuilder {
    public String url = "http://logback.qos.ch/css/classic.css";

    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb2) {
        sb2.append("<link REL=StyleSheet HREF=\"");
        sb2.append(this.url);
        sb2.append("\" TITLE=\"Basic\" />");
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
