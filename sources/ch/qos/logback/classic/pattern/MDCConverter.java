package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MDCConverter extends ClassicConverter {
    private String defaultValue = "";
    private String key;

    private String outputMDCForAllKeys(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        return sb2.toString();
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap == null) {
            return this.defaultValue;
        }
        String str = this.key;
        if (str == null) {
            return outputMDCForAllKeys(mDCPropertyMap);
        }
        String str2 = mDCPropertyMap.get(str);
        return str2 != null ? str2 : this.defaultValue;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String[] strArrExtractDefaultReplacement = OptionHelper.extractDefaultReplacement(getFirstOption());
        this.key = strArrExtractDefaultReplacement[0];
        if (strArrExtractDefaultReplacement[1] != null) {
            this.defaultValue = strArrExtractDefaultReplacement[1];
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.key = null;
        super.stop();
    }
}
