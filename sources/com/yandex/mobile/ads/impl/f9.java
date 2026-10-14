package com.yandex.mobile.ads.impl;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes3.dex */
public final class f9 {
    public static final int a(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
    }
}
