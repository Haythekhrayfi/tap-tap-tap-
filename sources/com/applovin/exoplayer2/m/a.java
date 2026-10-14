package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f7706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7711f;

    private a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f7706a = list;
        this.f7707b = i10;
        this.f7708c = i11;
        this.f7709d = i12;
        this.f7710e = f10;
        this.f7711f = str;
    }

    public static a a(y yVar) throws ai {
        float f10;
        String strA;
        int i10;
        try {
            yVar.e(4);
            int iH = (yVar.h() & 3) + 1;
            if (iH == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iH2 = yVar.h() & 31;
            for (int i11 = 0; i11 < iH2; i11++) {
                arrayList.add(b(yVar));
            }
            int iH3 = yVar.h();
            for (int i12 = 0; i12 < iH3; i12++) {
                arrayList.add(b(yVar));
            }
            int i13 = -1;
            if (iH2 > 0) {
                v.b bVarA = v.a((byte[]) arrayList.get(0), iH, ((byte[]) arrayList.get(0)).length);
                int i14 = bVarA.f7671e;
                int i15 = bVarA.f7672f;
                float f11 = bVarA.f7673g;
                strA = com.applovin.exoplayer2.l.e.a(bVarA.f7667a, bVarA.f7668b, bVarA.f7669c);
                i13 = i14;
                i10 = i15;
                f10 = f11;
            } else {
                f10 = 1.0f;
                strA = null;
                i10 = -1;
            }
            return new a(arrayList, iH, i13, i10, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ai.b("Error parsing AVC config", e10);
        }
    }

    private static byte[] b(y yVar) {
        int i10 = yVar.i();
        int iC = yVar.c();
        yVar.e(i10);
        return com.applovin.exoplayer2.l.e.a(yVar.d(), iC, i10);
    }
}
