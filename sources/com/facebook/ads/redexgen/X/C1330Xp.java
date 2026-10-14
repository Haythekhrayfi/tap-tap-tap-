package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1330Xp implements C7h {
    public static byte[] A04;
    public static String[] A05 = {"D3PJ2GNcgNGI4MtKfCaHjqEOfdHoPcVQ", "EJL0aGmI3i0Imoz4UWgpTxwTxGm9WRxT", "tfWCUNw0WGkvc5ldnWfg2BDK3aY0ceq2", "VYnzwe", "FWw4Dif8pFGferaZg4Cc6MDYh6zRU5", "BYQArfMrHiqwTG3fAjpcYjBOCFZN2nO4", "ZJiZak5asVL", "k4pPkd4ODWsyAa7ylPFb6IMORyuDH4"};
    public Context A00;
    public final InterfaceC06807g A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public C06787e A01 = A00();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{107, Ascii.DEL, 96, 112, 124, 106, 123, 123, 102, 97, 104, 124, 112, 100, 106, 118};
    }

    static {
        A03();
    }

    public C1330Xp(Context context, InterfaceC06807g interfaceC06807g) {
        this.A00 = context;
        this.A02 = interfaceC06807g;
    }

    private C06787e A00() {
        return C06787e.A00(C0972Jp.A00(this.A00).getString(A01(0, 16, 81), null));
    }

    private void A02() {
        this.A02.A9v(new C1331Xq(this));
    }

    public final void A04(String[] strArr, Integer num, Integer num2) {
        C06787e c06787e = new C06787e(strArr, num, num2);
        C06787e newSettings = this.A01;
        if (c06787e.equals(newSettings)) {
            return;
        }
        this.A01 = c06787e;
        this.A03.set(true);
        SharedPreferences sharedPreferencesA00 = C0972Jp.A00(this.A00);
        if (A05[2].charAt(16) != 'n') {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[7] = "txsFPtaRD11LyA3dzoyK5U0Vbdrctz";
        strArr2[4] = "NLpqiEYsaOJ6LGl2A1qehjxsg53G43";
        SharedPreferences.Editor editorEdit = sharedPreferencesA00.edit();
        C06787e newSettings2 = this.A01;
        editorEdit.putString(A01(0, 16, 81), newSettings2.A07()).apply();
    }

    @Override // com.facebook.ads.redexgen.X.C7h
    public final C06787e A6b() {
        A02();
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C7h
    public final boolean A90() {
        A02();
        if (this.A01 == null) {
            return false;
        }
        Set<String> setA0Z = IN.A0Z(this.A00);
        String identifier = this.A01.A07();
        Iterator<String> it = setA0Z.iterator();
        while (it.hasNext()) {
            if (identifier.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C7h
    public final boolean AFN() {
        A02();
        return this.A03.getAndSet(false);
    }
}
