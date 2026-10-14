package com.applovin.exoplayer2.a;

import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.yandex.mobile.ads.impl.r80;
import com.yandex.mobile.ads.impl.x8;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements com.applovin.exoplayer2.l.p.a, SynchronizationGuard.CriticalSection, r80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3956c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3958e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3959f;

    public /* synthetic */ h(b.a aVar, Object obj, long j10) {
        this.f3957d = aVar;
        this.f3958e = obj;
        this.f3959f = j10;
    }

    public /* synthetic */ h(Uploader uploader, TransportContext transportContext, long j10) {
        this.f3957d = uploader;
        this.f3958e = transportContext;
        this.f3959f = j10;
    }

    public /* synthetic */ h(x8.a aVar, Object obj, long j10) {
        this.f3957d = aVar;
        this.f3958e = obj;
        this.f3959f = j10;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        return ((Uploader) this.f3957d).lambda$logAndUpdateState$8((TransportContext) this.f3958e, this.f3959f);
    }

    @Override // com.applovin.exoplayer2.l.p.a
    public void invoke(Object obj) {
        switch (this.f3956c) {
            case 0:
                ((b) obj).a((b.a) this.f3957d, this.f3958e, this.f3959f);
                break;
            default:
                Object obj2 = this.f3958e;
                long j10 = this.f3959f;
                Objects.requireNonNull((x8) obj);
                break;
        }
    }
}
