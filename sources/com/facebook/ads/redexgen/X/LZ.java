package com.facebook.ads.redexgen.X;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LZ {
    public static final int A00;
    public static final ExecutorService A01;
    public static volatile boolean A02;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        A00 = iAvailableProcessors;
        A01 = Executors.newFixedThreadPool(iAvailableProcessors);
        A02 = true;
    }
}
