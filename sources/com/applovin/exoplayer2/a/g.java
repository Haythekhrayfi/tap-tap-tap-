package com.applovin.exoplayer2.a;

import com.applovin.exoplayer2.ab;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements com.applovin.exoplayer2.l.p.a, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3955e;

    public /* synthetic */ g(b.a aVar, ab abVar, int i10) {
        this.f3953c = aVar;
        this.f3954d = abVar;
        this.f3955e = i10;
    }

    public /* synthetic */ g(Uploader uploader, TransportContext transportContext, int i10) {
        this.f3953c = uploader;
        this.f3954d = transportContext;
        this.f3955e = i10;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f3953c).lambda$upload$0((TransportContext) this.f3954d, this.f3955e);
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        ((b) obj).a((b.a) this.f3953c, (ab) this.f3954d, this.f3955e);
    }
}
