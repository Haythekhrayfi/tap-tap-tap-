package com.applovin.impl.sdk;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a0 f10163d = new a0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a0 f10164e = new a0(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10165c;

    public /* synthetic */ a0(int i10) {
        this.f10165c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10165c) {
            case 0:
                com.applovin.impl.sdk.utils.w.k();
                break;
            default:
                AlarmManagerSchedulerBroadcastReceiver.lambda$onReceive$0();
                break;
        }
    }
}
