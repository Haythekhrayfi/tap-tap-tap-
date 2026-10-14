package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ad.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f5823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.applovin.exoplayer2.v> f5824b;

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, com.applovin.exoplayer2.common.a.s.g());
    }

    public g(int i10, List<com.applovin.exoplayer2.v> list) {
        this.f5823a = i10;
        this.f5824b = list;
    }

    private z a(ad.b bVar) {
        return new z(c(bVar));
    }

    private boolean a(int i10) {
        return (i10 & this.f5823a) != 0;
    }

    private af b(ad.b bVar) {
        return new af(c(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    private List<com.applovin.exoplayer2.v> c(ad.b bVar) {
        String str;
        int i10;
        if (a(32)) {
            return this.f5824b;
        }
        com.applovin.exoplayer2.l.y yVar = new com.applovin.exoplayer2.l.y(bVar.f5751d);
        ArrayList arrayList = this.f5824b;
        while (yVar.a() > 0) {
            int iH = yVar.h();
            int iC = yVar.c() + yVar.h();
            if (iH == 134) {
                arrayList = new ArrayList();
                int iH2 = yVar.h() & 31;
                for (int i11 = 0; i11 < iH2; i11++) {
                    String strF = yVar.f(3);
                    int iH3 = yVar.h();
                    boolean z10 = (iH3 & 128) != 0;
                    if (z10) {
                        i10 = iH3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bH = (byte) yVar.h();
                    yVar.e(1);
                    List<byte[]> listA = null;
                    if (z10) {
                        listA = com.applovin.exoplayer2.l.e.a((bH & 64) != 0);
                    }
                    arrayList.add(new com.applovin.exoplayer2.v.a().f(str).c(strF).p(i10).a(listA).a());
                }
            }
            yVar.d(iC);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public SparseArray<ad> a() {
        return new SparseArray<>();
    }

    @Override // com.applovin.exoplayer2.e.i.ad.c
    public ad a(int i10, ad.b bVar) {
        if (i10 == 2) {
            return new t(new k(b(bVar)));
        }
        if (i10 == 3 || i10 == 4) {
            return new t(new q(bVar.f5749b));
        }
        if (i10 == 21) {
            return new t(new o());
        }
        if (i10 == 27) {
            if (a(4)) {
                return null;
            }
            return new t(new m(a(bVar), a(1), a(8)));
        }
        if (i10 == 36) {
            return new t(new n(a(bVar)));
        }
        if (i10 == 89) {
            return new t(new i(bVar.f5750c));
        }
        if (i10 != 138) {
            if (i10 == 172) {
                return new t(new d(bVar.f5749b));
            }
            if (i10 == 257) {
                return new y(new s("application/vnd.dvb.ait"));
            }
            if (i10 != 129) {
                if (i10 != 130) {
                    if (i10 == 134) {
                        if (a(16)) {
                            return null;
                        }
                        return new y(new s("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                if (a(2)) {
                                    return null;
                                }
                                return new t(new f(false, bVar.f5749b));
                            case 16:
                                return new t(new l(b(bVar)));
                            case 17:
                                if (a(2)) {
                                    return null;
                                }
                                return new t(new p(bVar.f5749b));
                            default:
                                return null;
                        }
                    }
                } else if (!a(64)) {
                    return null;
                }
            }
            return new t(new b(bVar.f5749b));
        }
        return new t(new h(bVar.f5749b));
    }
}
