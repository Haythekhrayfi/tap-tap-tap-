package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qo implements r81.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<yv> f24547b;

    public qo() {
        this(com.yandex.mobile.ads.embedded.guava.collect.p.i());
    }

    public qo(List list) {
        this.f24546a = 0;
        this.f24547b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4 */
    private List<yv> a(r81.b bVar) {
        String str;
        int i10;
        if (a(32)) {
            return this.f24547b;
        }
        mp0 mp0Var = new mp0(bVar.f24630c);
        ArrayList arrayList = this.f24547b;
        while (mp0Var.a() > 0) {
            int iT = mp0Var.t();
            int iD = mp0Var.d() + mp0Var.t();
            if (iT == 134) {
                arrayList = new ArrayList();
                int iT2 = mp0Var.t() & 31;
                for (int i11 = 0; i11 < iT2; i11++) {
                    String strA = mp0Var.a(3, qh.f24496c);
                    int iT3 = mp0Var.t();
                    boolean z10 = (iT3 & 128) != 0;
                    if (z10) {
                        i10 = iT3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte bT = (byte) mp0Var.t();
                    mp0Var.f(1);
                    List<byte[]> listSingletonList = null;
                    if (z10) {
                        listSingletonList = Collections.singletonList((bT & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    arrayList.add(new yv.a().f(str).e(strA).a(i10).a(listSingletonList).a());
                }
            }
            mp0Var.e(iD);
            arrayList = arrayList;
        }
        return arrayList;
    }

    private boolean a(int i10) {
        return (i10 & this.f24546a) != 0;
    }

    @Override // com.yandex.mobile.ads.impl.r81.c
    public final SparseArray<r81> a() {
        return new SparseArray<>();
    }

    @Override // com.yandex.mobile.ads.impl.r81.c
    public final r81 a(int i10, r81.b bVar) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new fq0(new qf0(bVar.f24628a));
            }
            if (i10 == 21) {
                return new fq0(new p10());
            }
            if (i10 == 27) {
                if (a(4)) {
                    return null;
                }
                return new fq0(new ky(new u01(a(bVar)), a(1), a(8)));
            }
            if (i10 == 36) {
                return new fq0(new ly(new u01(a(bVar))));
            }
            if (i10 == 89) {
                return new fq0(new hr(bVar.f24629b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new fq0(new k(bVar.f24628a));
                }
                if (i10 == 257) {
                    return new o01(new wp0("application/vnd.dvb.ait"));
                }
                if (i10 == 134) {
                    if (a(16)) {
                        return null;
                    }
                    return new o01(new wp0("application/x-scte35"));
                }
                if (i10 != 135) {
                    switch (i10) {
                        case 15:
                            if (a(2)) {
                                return null;
                            }
                            return new fq0(new j7(bVar.f24628a, false));
                        case 16:
                            return new fq0(new jy(new ca1(a(bVar))));
                        case 17:
                            if (a(2)) {
                                return null;
                            }
                            return new fq0(new y70(bVar.f24628a));
                        default:
                            switch (i10) {
                                case 128:
                                    break;
                                case 129:
                                    break;
                                case 130:
                                    if (!a(64)) {
                                        return null;
                                    }
                                    break;
                                default:
                                    return null;
                            }
                            break;
                    }
                }
                return new fq0(new h(bVar.f24628a));
            }
            return new fq0(new yq(bVar.f24628a));
        }
        return new fq0(new iy(new ca1(a(bVar))));
    }
}
