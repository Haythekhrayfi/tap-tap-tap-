package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends com.google.android.play.core.listener.b<SplitInstallSessionState> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static t f12459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f12460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f12461e;

    public t(Context context, e eVar) {
        super(new com.google.android.play.core.internal.af("SplitInstallListenerRegistry"), new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        this.f12460d = new Handler(Looper.getMainLooper());
        this.f12461e = eVar;
    }

    public static synchronized t a(Context context) {
        if (f12459c == null) {
            f12459c = new t(context, l.f12442a);
        }
        return f12459c;
    }

    @Override // com.google.android.play.core.listener.b
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        SplitInstallSessionState splitInstallSessionStateA = SplitInstallSessionState.a(bundleExtra);
        this.f12305a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", splitInstallSessionStateA);
        f fVarA = this.f12461e.a();
        if (splitInstallSessionStateA.status() != 3 || fVarA == null) {
            a(splitInstallSessionStateA);
        } else {
            fVarA.a(splitInstallSessionStateA.c(), new r(this, splitInstallSessionStateA, intent, context));
        }
    }
}
