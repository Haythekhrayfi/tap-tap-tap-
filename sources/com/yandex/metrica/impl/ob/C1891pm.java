package com.yandex.metrica.impl.ob;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1891pm extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sm<Context, Intent> f17144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorC1966sn f17145b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.pm$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f17146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f17147b;

        public a(Context context, Intent intent) {
            this.f17146a = context;
            this.f17147b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1891pm.this.f17144a.a(this.f17146a, this.f17147b);
        }
    }

    public C1891pm(Sm<Context, Intent> sm, InterfaceExecutorC1966sn interfaceExecutorC1966sn) {
        this.f17144a = sm;
        this.f17145b = interfaceExecutorC1966sn;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ((C1941rn) this.f17145b).execute(new a(context, intent));
    }
}
