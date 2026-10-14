package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes.dex */
public class RestrictedEscapeUtil implements IEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c10, int i10) {
        if (str.indexOf(c10) < 0) {
            stringBuffer.append("\\");
        }
        stringBuffer.append(c10);
    }
}
