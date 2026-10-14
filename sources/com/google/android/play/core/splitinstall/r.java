package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: classes2.dex */
final class r implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SplitInstallSessionState f12451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f12452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f12453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f12454d;

    public r(t tVar, SplitInstallSessionState splitInstallSessionState, Intent intent, Context context) {
        this.f12454d = tVar;
        this.f12451a = splitInstallSessionState;
        this.f12452b = intent;
        this.f12453c = context;
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a() {
        t tVar = this.f12454d;
        tVar.f12460d.post(new s(tVar, this.f12451a, 5, 0));
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void a(@SplitInstallErrorCode int i10) {
        t tVar = this.f12454d;
        tVar.f12460d.post(new s(tVar, this.f12451a, 6, i10));
    }

    @Override // com.google.android.play.core.splitinstall.d
    public final void b() {
        if (this.f12452b.getBooleanExtra("triggered_from_app_after_verification", false)) {
            this.f12454d.f12305a.b("Splits copied and verified more than once.", new Object[0]);
        } else {
            this.f12452b.putExtra("triggered_from_app_after_verification", true);
            this.f12453c.sendBroadcast(this.f12452b);
        }
    }
}
