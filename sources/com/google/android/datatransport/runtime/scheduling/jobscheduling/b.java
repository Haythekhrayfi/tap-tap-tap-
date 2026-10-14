package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import h5.c0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SynchronizationGuard.CriticalSection, x5.a.InterfaceC0461a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f11664f;

    public /* synthetic */ b(Uploader uploader, Iterable iterable, TransportContext transportContext, long j10) {
        this.f11661c = uploader;
        this.f11662d = iterable;
        this.f11663e = transportContext;
        this.f11664f = j10;
    }

    public /* synthetic */ b(String str, String str2, long j10, c0 c0Var) {
        this.f11661c = str;
        this.f11662d = str2;
        this.f11664f = j10;
        this.f11663e = c0Var;
    }

    @Override // x5.a.InterfaceC0461a
    public void b(x5.b bVar) {
        ((c5.a) bVar.get()).d((String) this.f11661c, (String) this.f11662d, this.f11664f, (c0) this.f11663e);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f11661c).lambda$logAndUpdateState$4((Iterable) this.f11662d, (TransportContext) this.f11663e, this.f11664f);
    }
}
