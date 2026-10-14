package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class ja0 implements hc0, hc0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc0.b f22000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u8 f22002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private nc0 f22003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private hc0 f22004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private hc0.a f22005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f22006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22007i = -9223372036854775807L;

    public interface a {
        void a(nc0.b bVar);

        void a(nc0.b bVar, IOException iOException);
    }

    public ja0(nc0.b bVar, u8 u8Var, long j10) {
        this.f22000b = bVar;
        this.f22002d = u8Var;
        this.f22001c = j10;
    }

    public final long a() {
        return this.f22007i;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long a(long j10, q01 q01Var) {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.a(j10, q01Var);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long a(et[] etVarArr, boolean[] zArr, fz0[] fz0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f22007i;
        if (j12 == -9223372036854775807L || j10 != this.f22001c) {
            j11 = j10;
        } else {
            this.f22007i = -9223372036854775807L;
            j11 = j12;
        }
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.a(etVarArr, zArr, fz0VarArr, zArr2, j11);
    }

    public final void a(long j10) {
        this.f22007i = j10;
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void a(hc0.a aVar, long j10) {
        this.f22005g = aVar;
        hc0 hc0Var = this.f22004f;
        if (hc0Var != null) {
            long j11 = this.f22001c;
            long j12 = this.f22007i;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            hc0Var.a(this, j11);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hc0.a
    public final void a(hc0 hc0Var) {
        hc0.a aVar = this.f22005g;
        int i10 = da1.f19803a;
        aVar.a((hc0) this);
    }

    public final void a(nc0.b bVar) {
        long j10 = this.f22001c;
        long j11 = this.f22007i;
        if (j11 != -9223372036854775807L) {
            j10 = j11;
        }
        nc0 nc0Var = this.f22003e;
        Objects.requireNonNull(nc0Var);
        hc0 hc0VarA = nc0Var.a(bVar, this.f22002d, j10);
        this.f22004f = hc0VarA;
        if (this.f22005g != null) {
            hc0VarA.a(this, j10);
        }
    }

    public final void a(nc0 nc0Var) {
        pa.b(this.f22003e == null);
        this.f22003e = nc0Var;
    }

    @Override // com.yandex.mobile.ads.impl.y01.a
    public final void a(y01 y01Var) {
        hc0.a aVar = this.f22005g;
        int i10 = da1.f19803a;
        aVar.a(this);
    }

    public final long b() {
        return this.f22001c;
    }

    public final void c() {
        if (this.f22004f != null) {
            nc0 nc0Var = this.f22003e;
            Objects.requireNonNull(nc0Var);
            nc0Var.a(this.f22004f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean continueLoading(long j10) {
        hc0 hc0Var = this.f22004f;
        return hc0Var != null && hc0Var.continueLoading(j10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void discardBuffer(long j10, boolean z10) {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        hc0Var.discardBuffer(j10, z10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getBufferedPositionUs() {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long getNextLoadPositionUs() {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final i71 getTrackGroups() {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final boolean isLoading() {
        hc0 hc0Var = this.f22004f;
        return hc0Var != null && hc0Var.isLoading();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void maybeThrowPrepareError() throws IOException {
        try {
            hc0 hc0Var = this.f22004f;
            if (hc0Var != null) {
                hc0Var.maybeThrowPrepareError();
                return;
            }
            nc0 nc0Var = this.f22003e;
            if (nc0Var != null) {
                nc0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long readDiscontinuity() {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final void reevaluateBuffer(long j10) {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        hc0Var.reevaluateBuffer(j10);
    }

    @Override // com.yandex.mobile.ads.impl.hc0
    public final long seekToUs(long j10) {
        hc0 hc0Var = this.f22004f;
        int i10 = da1.f19803a;
        return hc0Var.seekToUs(j10);
    }
}
