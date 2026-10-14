package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyDefiner;

/* JADX INFO: loaded from: classes.dex */
public abstract class PropertyDefinerBase extends ContextAwareBase implements PropertyDefiner {
    public static String booleanAsStr(boolean z10) {
        return (z10 ? Boolean.TRUE : Boolean.FALSE).toString();
    }
}
