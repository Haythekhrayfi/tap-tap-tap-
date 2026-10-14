package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f6120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f6121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.applovin.exoplayer2.g.a f6122l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f6123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f6124b;

        public a(long[] jArr, long[] jArr2) {
            this.f6123a = jArr;
            this.f6124b = jArr2;
        }
    }

    private p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, com.applovin.exoplayer2.g.a aVar2) {
        this.f6111a = i10;
        this.f6112b = i11;
        this.f6113c = i12;
        this.f6114d = i13;
        this.f6115e = i14;
        this.f6116f = a(i14);
        this.f6117g = i15;
        this.f6118h = i16;
        this.f6119i = b(i16);
        this.f6120j = j10;
        this.f6121k = aVar;
        this.f6122l = aVar2;
    }

    public p(byte[] bArr, int i10) {
        com.applovin.exoplayer2.l.x xVar = new com.applovin.exoplayer2.l.x(bArr);
        xVar.a(i10 * 8);
        this.f6111a = xVar.c(16);
        this.f6112b = xVar.c(16);
        this.f6113c = xVar.c(24);
        this.f6114d = xVar.c(24);
        int iC = xVar.c(20);
        this.f6115e = iC;
        this.f6116f = a(iC);
        this.f6117g = xVar.c(3) + 1;
        int iC2 = xVar.c(5) + 1;
        this.f6118h = iC2;
        this.f6119i = b(iC2);
        this.f6120j = xVar.d(36);
        this.f6121k = null;
        this.f6122l = null;
    }

    private static int a(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    private static com.applovin.exoplayer2.g.a a(List<String> list, List<com.applovin.exoplayer2.g.c.a> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrB = ai.b(str, "=");
            if (strArrB.length != 2) {
                com.applovin.exoplayer2.l.q.c("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new com.applovin.exoplayer2.g.c.b(strArrB[0], strArrB[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new com.applovin.exoplayer2.g.a(arrayList);
    }

    private static int b(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public long a() {
        long j10 = this.f6120j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f6115e);
    }

    public long a(long j10) {
        return ai.a((j10 * ((long) this.f6115e)) / 1000000, 0L, this.f6120j - 1);
    }

    public p a(a aVar) {
        return new p(this.f6111a, this.f6112b, this.f6113c, this.f6114d, this.f6115e, this.f6117g, this.f6118h, this.f6120j, aVar, this.f6122l);
    }

    public p a(List<String> list) {
        return new p(this.f6111a, this.f6112b, this.f6113c, this.f6114d, this.f6115e, this.f6117g, this.f6118h, this.f6120j, this.f6121k, a(a(list, (List<com.applovin.exoplayer2.g.c.a>) Collections.emptyList())));
    }

    public com.applovin.exoplayer2.g.a a(com.applovin.exoplayer2.g.a aVar) {
        com.applovin.exoplayer2.g.a aVar2 = this.f6122l;
        return aVar2 == null ? aVar : aVar2.a(aVar);
    }

    public com.applovin.exoplayer2.v a(byte[] bArr, com.applovin.exoplayer2.g.a aVar) {
        bArr[4] = -128;
        int i10 = this.f6114d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new com.applovin.exoplayer2.v.a().f("audio/flac").f(i10).k(this.f6117g).l(this.f6115e).a(Collections.singletonList(bArr)).a(a(aVar)).a();
    }

    public long b() {
        long j10;
        long j11;
        int i10 = this.f6114d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f6113c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f6111a;
            j10 = ((((i11 != this.f6112b || i11 <= 0) ? 4096L : i11) * ((long) this.f6117g)) * ((long) this.f6118h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public p b(List<com.applovin.exoplayer2.g.c.a> list) {
        return new p(this.f6111a, this.f6112b, this.f6113c, this.f6114d, this.f6115e, this.f6117g, this.f6118h, this.f6120j, this.f6121k, a(a((List<String>) Collections.emptyList(), list)));
    }
}
