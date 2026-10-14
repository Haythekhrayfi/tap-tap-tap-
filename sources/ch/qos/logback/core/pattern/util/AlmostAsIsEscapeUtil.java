package ch.qos.logback.core.pattern.util;

/* JADX INFO: loaded from: classes.dex */
public class AlmostAsIsEscapeUtil extends RestrictedEscapeUtil {
    @Override // ch.qos.logback.core.pattern.util.RestrictedEscapeUtil, ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c10, int i10) {
        super.escape("%)", stringBuffer, c10, i10);
    }
}
