package com.applovin.exoplayer2.h;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class i implements com.applovin.exoplayer2.k.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.exoplayer2.k.i f6566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f6568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f6569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f6570e;

    public interface a {
        void a(com.applovin.exoplayer2.l.y yVar);
    }

    public i(com.applovin.exoplayer2.k.i iVar, int i10, a aVar) {
        com.applovin.exoplayer2.l.a.a(i10 > 0);
        this.f6566a = iVar;
        this.f6567b = i10;
        this.f6568c = aVar;
        this.f6569d = new byte[1];
        this.f6570e = i10;
    }

    private boolean d() throws IOException {
        if (this.f6566a.a(this.f6569d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f6569d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int iA = this.f6566a.a(bArr, i12, i11);
            if (iA == -1) {
                return false;
            }
            i12 += iA;
            i11 -= iA;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f6568c.a(new com.applovin.exoplayer2.l.y(bArr, i10));
        }
        return true;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f6570e == 0) {
            if (!d()) {
                return -1;
            }
            this.f6570e = this.f6567b;
        }
        int iA = this.f6566a.a(bArr, i10, Math.min(this.f6570e, i11));
        if (iA != -1) {
            this.f6570e -= iA;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.k.i
    public long a(com.applovin.exoplayer2.k.l lVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        return this.f6566a.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(com.applovin.exoplayer2.k.aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f6566a.a(aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        return this.f6566a.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() {
        throw new UnsupportedOperationException();
    }
}
