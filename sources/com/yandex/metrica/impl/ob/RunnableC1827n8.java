package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ac.CrashpadServiceHelper;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC1827n8 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        CrashpadServiceHelper.deleteCompletedReports();
    }
}
