package com.applovin.exoplayer2.i.i;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends com.applovin.exoplayer2.i.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f7074a;

    public a() {
        super("Mp4WebvttDecoder");
        this.f7074a = new y();
    }

    private static com.applovin.exoplayer2.i.a a(y yVar, int i10) throws com.applovin.exoplayer2.i.h {
        CharSequence charSequenceA = null;
        com.applovin.exoplayer2.i.a.C0095a c0095aA = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new com.applovin.exoplayer2.i.h("Incomplete vtt cue box header found.");
            }
            int iQ = yVar.q();
            int iQ2 = yVar.q();
            int i11 = iQ - 8;
            String strA = ai.a(yVar.d(), yVar.c(), i11);
            yVar.e(i11);
            i10 = (i10 - 8) - i11;
            if (iQ2 == 1937011815) {
                c0095aA = f.a(strA);
            } else if (iQ2 == 1885436268) {
                charSequenceA = f.a((String) null, strA.trim(), (List<d>) Collections.emptyList());
            }
        }
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        return c0095aA != null ? c0095aA.a(charSequenceA).e() : f.a(charSequenceA);
    }

    @Override // com.applovin.exoplayer2.i.d
    public com.applovin.exoplayer2.i.f a(byte[] bArr, int i10, boolean z10) throws com.applovin.exoplayer2.i.h {
        this.f7074a.a(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f7074a.a() > 0) {
            if (this.f7074a.a() < 8) {
                throw new com.applovin.exoplayer2.i.h("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iQ = this.f7074a.q();
            if (this.f7074a.q() == 1987343459) {
                arrayList.add(a(this.f7074a, iQ - 8));
            } else {
                this.f7074a.e(iQ - 8);
            }
        }
        return new b(arrayList);
    }
}
