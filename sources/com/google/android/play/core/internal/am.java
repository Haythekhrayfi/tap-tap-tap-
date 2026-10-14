package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class am extends ag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IBinder f12248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ao f12249b;

    public am(ao aoVar, IBinder iBinder) {
        this.f12249b = aoVar;
        this.f12248a = iBinder;
    }

    @Override // com.google.android.play.core.internal.ag
    public final void a() {
        ap apVar = this.f12249b.f12251a;
        apVar.f12263l = (IInterface) apVar.f12259h.a(this.f12248a);
        ap.f(this.f12249b.f12251a);
        this.f12249b.f12251a.f12257f = false;
        Iterator it = this.f12249b.f12251a.f12256e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f12249b.f12251a.f12256e.clear();
    }
}
