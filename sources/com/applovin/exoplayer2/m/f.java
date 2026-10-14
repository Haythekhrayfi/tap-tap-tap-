package com.applovin.exoplayer2.m;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f7793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7795c;

    private f(List<byte[]> list, int i10, String str) {
        this.f7793a = list;
        this.f7794b = i10;
        this.f7795c = str;
    }

    public static f a(y yVar) throws ai {
        try {
            yVar.e(21);
            int iH = yVar.h() & 3;
            int iH2 = yVar.h();
            int iC = yVar.c();
            int i10 = 0;
            for (int i11 = 0; i11 < iH2; i11++) {
                yVar.e(1);
                int i12 = yVar.i();
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = yVar.i();
                    i10 += i14 + 4;
                    yVar.e(i14);
                }
            }
            yVar.d(iC);
            byte[] bArr = new byte[i10];
            int i15 = 0;
            String strA = null;
            for (int i16 = 0; i16 < iH2; i16++) {
                int iH3 = yVar.h() & 127;
                int i17 = yVar.i();
                for (int i18 = 0; i18 < i17; i18++) {
                    int i19 = yVar.i();
                    byte[] bArr2 = v.f7660a;
                    System.arraycopy(bArr2, 0, bArr, i15, bArr2.length);
                    int length = i15 + bArr2.length;
                    System.arraycopy(yVar.d(), yVar.c(), bArr, length, i19);
                    if (iH3 == 33 && i18 == 0) {
                        strA = com.applovin.exoplayer2.l.e.a(new z(bArr, length, length + i19));
                    }
                    i15 = length + i19;
                    yVar.e(i19);
                }
            }
            return new f(i10 == 0 ? null : Collections.singletonList(bArr), iH + 1, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ai.b("Error parsing HEVC config", e10);
        }
    }
}
