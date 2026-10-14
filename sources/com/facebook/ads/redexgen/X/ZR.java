package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ZR implements L7<Bundle> {
    public static byte[] A03;
    public final C2D A00;
    public final PX A01;
    public final List<ZQ> A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{126, 121, 108, 121, 100, 126, 121, 100, 110, 126, 106, 123, 109, 106, 109};
    }

    public ZR(List<C2B> list, Bundle bundle, PX px) {
        this.A02 = new ArrayList(list.size());
        this.A01 = px;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(A00(10, 5, 15));
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.A02.add(new ZQ(list.get(i10), (Bundle) parcelableArrayList.get(i10)));
        }
        this.A00 = (C2D) L1.A00(bundle.getByteArray(A00(0, 10, 28)));
    }

    public ZR(List<C2B> list, PX px) {
        this.A02 = new ArrayList(list.size());
        this.A01 = px;
        Iterator<C2B> it = list.iterator();
        while (it.hasNext()) {
            this.A02.add(new ZQ(it.next()));
        }
        this.A00 = new C2D();
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putByteArray(A00(0, 10, 28), L1.A01(this.A00));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.A02.size());
        Iterator<ZQ> it = this.A02.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = it.next().A05();
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(A00(10, 5, 15), arrayList);
        return bundle;
    }

    public final C2D A03() {
        return this.A00;
    }

    public final void A04() {
        this.A00.A03();
        Iterator<ZQ> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A06();
        }
    }

    public final void A05() {
        this.A00.A02();
    }

    public final void A06(double d10, double d11) {
        if (d11 >= 0.0d) {
            this.A00.A05(d10, d11);
        }
        double dA8A = this.A01.A8A();
        this.A00.A04(d10, dA8A);
        Iterator<ZQ> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A07(d10, dA8A);
        }
    }
}
