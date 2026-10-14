package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class aw extends com.google.android.play.core.listener.b<AssetPackState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cp f11884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bw f11885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<w> f11886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bn f11887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bz f11888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.google.android.play.core.common.a f11889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f11890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.play.core.internal.cj<Executor> f11891j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Handler f11892k;

    public aw(Context context, cp cpVar, bw bwVar, com.google.android.play.core.internal.cj<w> cjVar, bz bzVar, bn bnVar, com.google.android.play.core.common.a aVar, com.google.android.play.core.internal.cj<Executor> cjVar2, com.google.android.play.core.internal.cj<Executor> cjVar3) {
        super(new com.google.android.play.core.internal.af("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f11892k = new Handler(Looper.getMainLooper());
        this.f11884c = cpVar;
        this.f11885d = bwVar;
        this.f11886e = cjVar;
        this.f11888g = bzVar;
        this.f11887f = bnVar;
        this.f11889h = aVar;
        this.f11890i = cjVar2;
        this.f11891j = cjVar3;
    }

    @Override // com.google.android.play.core.listener.b
    public final void a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f12305a.b("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f12305a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            this.f11889h.a(bundleExtra2);
        }
        final AssetPackState assetPackStateA = AssetPackState.a(bundleExtra, stringArrayList.get(0), this.f11888g, ay.f11902a);
        this.f12305a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", assetPackStateA);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f11887f.a(pendingIntent);
        }
        this.f11891j.a().execute(new Runnable(this, bundleExtra, assetPackStateA) { // from class: com.google.android.play.core.assetpacks.au

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final aw f11879a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Bundle f11880b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final AssetPackState f11881c;

            {
                this.f11879a = this;
                this.f11880b = bundleExtra;
                this.f11881c = assetPackStateA;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11879a.a(this.f11880b, this.f11881c);
            }
        });
        this.f11890i.a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.av

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final aw f11882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Bundle f11883b;

            {
                this.f11882a = this;
                this.f11883b = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11882a.a(this.f11883b);
            }
        });
    }

    public final /* synthetic */ void a(Bundle bundle) {
        if (this.f11884c.a(bundle)) {
            this.f11885d.a();
        }
    }

    public final /* synthetic */ void a(Bundle bundle, AssetPackState assetPackState) {
        if (this.f11884c.b(bundle)) {
            a(assetPackState);
            this.f11886e.a().a();
        }
    }

    public final void a(final AssetPackState assetPackState) {
        this.f11892k.post(new Runnable(this, assetPackState) { // from class: com.google.android.play.core.assetpacks.at

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final aw f11877a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final AssetPackState f11878b;

            {
                this.f11877a = this;
                this.f11878b = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11877a.a(this.f11878b);
            }
        });
    }
}
