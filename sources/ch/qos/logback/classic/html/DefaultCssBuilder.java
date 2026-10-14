package ch.qos.logback.classic.html;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.html.CssBuilder;
import j1.d;

/* JADX INFO: loaded from: classes.dex */
public class DefaultCssBuilder implements CssBuilder {
    @Override // ch.qos.logback.core.html.CssBuilder
    public void addCss(StringBuilder sb2) {
        sb2.append("<style  type=\"text/css\">");
        String str = CoreConstants.LINE_SEPARATOR;
        d.a(sb2, str, "table { margin-left: 2em; margin-right: 2em; border-left: 2px solid #AAA; }", str, "TR.even { background: #FFFFFF; }");
        d.a(sb2, str, "TR.odd { background: #EAEAEA; }", str, "TR.warn TD.Level, TR.error TD.Level, TR.fatal TD.Level {font-weight: bold; color: #FF4040 }");
        d.a(sb2, str, "TD { padding-right: 1ex; padding-left: 1ex; border-right: 2px solid #AAA; }", str, "TD.Time, TD.Date { text-align: right; font-family: courier, monospace; font-size: smaller; }");
        d.a(sb2, str, "TD.Thread { text-align: left; }", str, "TD.Level { text-align: right; }");
        d.a(sb2, str, "TD.Logger { text-align: left; }", str, "TR.header { background: #596ED5; color: #FFF; font-weight: bold; font-size: larger; }");
        d.a(sb2, str, "TD.Exception { background: #A2AEE8; font-family: courier, monospace;}", str, "</style>");
        sb2.append(str);
    }
}
