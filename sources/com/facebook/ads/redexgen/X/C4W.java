package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4W, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class C4W {
    public static byte[] A06;
    public static String[] A07 = {"wCFFy4v0UHolBGzubHhtaTK0KlaK5TU8", "WXL", "veTi", "n3", "rW28yUWMMTgiQlEcIz6smwE3e87Fn5Ax", "QU5acghFPGL2KQJts4swUt9W5A9MK8iM", "qIZlYUWuFA6tmX766BSANKSPkXlWbMWT", "RhPzJuizv3JTUr3AZhw4zLdz5ZpO"};
    public C4U A04 = null;
    public ArrayList<RecyclerView.ItemAnimator.ItemAnimatorFinishedListener> A05 = new ArrayList<>();
    public long A00 = 120;
    public long A03 = 120;
    public long A02 = 250;
    public long A01 = 250;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{85, 84, 123, 84, 83, 87, 91, 78, 83, 85, 84, 73, 124, 83, 84, 83, 73, 82, 95, 94};
    }

    public abstract boolean A0E(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2);

    public abstract boolean A0F(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2);

    public abstract boolean A0G(AbstractC06224s abstractC06224s, C4V c4v, C4V c4v2);

    public abstract boolean A0H(AbstractC06224s abstractC06224s, AbstractC06224s abstractC06224s2, C4V c4v, C4V c4v2);

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K(AbstractC06224s abstractC06224s);

    public abstract boolean A0L();

    static {
        A03();
    }

    public static int A00(AbstractC06224s abstractC06224s) {
        int i10 = abstractC06224s.A0C & 14;
        if (abstractC06224s.A0b()) {
            return 4;
        }
        int flags = i10 & 4;
        if (flags == 0) {
            int iA0J = abstractC06224s.A0J();
            int iA0G = abstractC06224s.A0G();
            String[] strArr = A07;
            String str = strArr[3];
            String str2 = strArr[1];
            int oldPos = str.length();
            int flags2 = str2.length();
            if (oldPos == flags2) {
                throw new RuntimeException();
            }
            A07[0] = "z6mPnscAmNwlAliMzxZ9cFQDVALsWjfG";
            if (iA0J != -1 && iA0G != -1 && iA0J != iA0G) {
                return i10 | 2048;
            }
            return i10;
        }
        return i10;
    }

    private final C4V A01() {
        return new C4V();
    }

    public final long A04() {
        return this.A00;
    }

    public final long A05() {
        return this.A01;
    }

    public final long A06() {
        return this.A02;
    }

    public final long A07() {
        return this.A03;
    }

    public final C4V A08(C06194p c06194p, AbstractC06224s abstractC06224s) {
        return A01().A01(abstractC06224s);
    }

    public final C4V A09(C06194p c06194p, AbstractC06224s abstractC06224s, int i10, List<Object> payloads) {
        return A01().A01(abstractC06224s);
    }

    public final void A0A() {
        int count = this.A05.size();
        if (0 < count) {
            this.A05.get(0);
            throw new NullPointerException(A02(0, 20, 16));
        }
        this.A05.clear();
    }

    public final void A0B(C4U c4u) {
        this.A04 = c4u;
    }

    public final void A0C(AbstractC06224s abstractC06224s) {
        C4U c4u = this.A04;
        if (c4u != null) {
            c4u.AAJ(abstractC06224s);
        }
    }

    public boolean A0D(AbstractC06224s abstractC06224s) {
        return true;
    }

    public boolean A0M(AbstractC06224s abstractC06224s, List<Object> payloads) {
        return A0D(abstractC06224s);
    }
}
