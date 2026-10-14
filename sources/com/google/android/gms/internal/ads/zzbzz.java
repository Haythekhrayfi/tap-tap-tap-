package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzbzz extends ScheduledThreadPoolExecutor {
    public zzbzz(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
