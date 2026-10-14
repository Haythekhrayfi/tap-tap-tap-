package com.applovin.exoplayer2.k;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f7549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f7551c = Uri.EMPTY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, List<String>> f7552d = Collections.emptyMap();

    public z(i iVar) {
        this.f7549a = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int iA = this.f7549a.a(bArr, i10, i11);
        if (iA != -1) {
            this.f7550b += (long) iA;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        this.f7551c = lVar.f7392a;
        this.f7552d = Collections.emptyMap();
        long jA = this.f7549a.a(lVar);
        this.f7551c = (Uri) com.applovin.exoplayer2.l.a.b(a());
        this.f7552d = b();
        return jA;
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f7549a.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f7549a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f7549a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        this.f7549a.c();
    }

    public long d() {
        return this.f7550b;
    }

    public Uri e() {
        return this.f7551c;
    }

    public Map<String, List<String>> f() {
        return this.f7552d;
    }
}
