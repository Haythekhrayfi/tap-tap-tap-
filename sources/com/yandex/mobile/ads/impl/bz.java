package com.yandex.mobile.ads.impl;

import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
public final class bz {
    public static FutureTask a(String str) {
        fd.j0.i(str, "host");
        FutureTask futureTask = new FutureTask(new ez(str));
        new Thread(futureTask).start();
        return futureTask;
    }
}
