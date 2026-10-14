package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8D, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8D {
    public static byte[] A06;
    public C8E A01;
    public String A02;
    public String A03;
    public JSONObject A05;
    public int A00 = 0;
    public List<C8B> A04 = new ArrayList();

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 109);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{79, 88};
    }

    public C8D(C8E c8e, String str, String str2) {
        this.A01 = c8e;
        this.A03 = str;
        this.A02 = str2;
    }

    public final int A02() {
        return this.A04.size();
    }

    public final long A03() {
        C8E c8e = this.A01;
        if (c8e != null) {
            return c8e.A0C() + ((long) this.A01.A03());
        }
        return -1L;
    }

    public final C8B A04() {
        if (this.A00 < this.A04.size()) {
            int i10 = this.A00 + 1;
            this.A00 = i10;
            return this.A04.get(i10 - 1);
        }
        return null;
    }

    public final C8E A05() {
        return this.A01;
    }

    public final String A06() {
        return this.A02;
    }

    public final String A07() {
        int i10 = this.A00;
        if (i10 > 0 && i10 <= this.A04.size()) {
            return this.A04.get(this.A00 - 1).A04().optString(A00(0, 2, 65));
        }
        return null;
    }

    public final String A08() {
        return this.A03;
    }

    public final JSONObject A09() {
        return this.A05;
    }

    public final void A0A(C8B c8b) {
        this.A04.add(c8b);
    }

    public final void A0B(JSONObject jSONObject) {
        this.A05 = jSONObject;
    }

    public final boolean A0C() {
        return this.A01 == null || LF.A00() > this.A01.A0C() + ((long) this.A01.A03());
    }
}
