package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes3.dex */
public final class e9 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e9 f20127a = new e9();

    private e9() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        fd.j0.i(logRecord, "record");
        int i10 = d9.f19784c;
        String loggerName = logRecord.getLoggerName();
        fd.j0.h(loggerName, "record.loggerName");
        int iA = f9.a(logRecord);
        String message = logRecord.getMessage();
        fd.j0.h(message, "record.message");
        d9.a(loggerName, iA, message, logRecord.getThrown());
    }
}
