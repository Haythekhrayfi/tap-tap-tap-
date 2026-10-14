package com.applovin.exoplayer2.i.i;

import android.text.TextUtils;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f7124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7125b;

    public g() {
        super("WebvttDecoder");
        this.f7124a = new y();
        this.f7125b = new c();
    }

    private static int a(y yVar) {
        int iC = 0;
        int i10 = -1;
        while (i10 == -1) {
            iC = yVar.c();
            String strC = yVar.C();
            if (strC == null) {
                i10 = 0;
            } else if ("STYLE".equals(strC)) {
                i10 = 2;
            } else {
                i10 = strC.startsWith("NOTE") ? 1 : 3;
            }
        }
        yVar.d(iC);
        return i10;
    }

    private static void b(y yVar) {
        while (!TextUtils.isEmpty(yVar.C())) {
        }
    }

    @Override // com.applovin.exoplayer2.i.d
    public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
        e eVarA;
        this.f7124a.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.a(this.f7124a);
            while (!TextUtils.isEmpty(this.f7124a.C())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iA = a(this.f7124a);
                if (iA == 0) {
                    return new i(arrayList2);
                }
                if (iA == 1) {
                    b(this.f7124a);
                } else if (iA == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new com.applovin.exoplayer2.i.h("A style block was found after the first cue.");
                    }
                    this.f7124a.C();
                    arrayList.addAll(this.f7125b.a(this.f7124a));
                } else if (iA == 3 && (eVarA = f.a(this.f7124a, arrayList)) != null) {
                    arrayList2.add(eVarA);
                }
            }
        } catch (ai e10) {
            throw new com.applovin.exoplayer2.i.h(e10);
        }
    }
}
