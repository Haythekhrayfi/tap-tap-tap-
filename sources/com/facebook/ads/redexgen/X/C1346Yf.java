package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1346Yf implements InterfaceC1019Lm {
    public static String[] A01 = {"JdxG2e87fiw1QxhKtyp6wy4hCZ34K54h", "5l6PiVFmWkFi4LSRmzN6ZIbVVY4PyA16", "qh41B7qjlQhNnOsbjTqj3JtjZfsrgLHf", "L6JKyztUTZrhaC2oSi2AGhNMneOalgfU", "mLvzPn8zSeH", "6Oneq6t5dYPlbDhRy7qxaYTJsizasisX", "J8", "lXMgpjBtmdYXVX4s4nwhe"};
    public final WeakReference<C5H> A00;

    public C1346Yf(C5H c5h) {
        this.A00 = new WeakReference<>(c5h);
    }

    public /* synthetic */ C1346Yf(C5H c5h, C5D c5d) {
        this(c5h);
    }

    private void A00(C5H c5h) {
        PA pa2 = c5h.A0B;
        if (pa2 != null) {
            c5h.A06.bringChildToFront(pa2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void A3O(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        C5H c5h = this.A00.get();
        if (c5h != null) {
            c5h.A06.addView(view, i10, layoutParams);
            A00(c5h);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void A3P(View view, RelativeLayout.LayoutParams layoutParams) {
        C5H c5h = this.A00.get();
        if (c5h != null) {
            c5h.A06.addView(view, layoutParams);
            A00(c5h);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public void A3y(String str) {
        if (this.A00.get() != null) {
            this.A00.get().A0F(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public void A3z(String str, C8W c8w) {
        if (this.A00.get() != null) {
            this.A00.get().A0H(str, c8w);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void A96(String str, C1W c1w) {
        if (this.A00.get() != null) {
            C5H c5h = this.A00.get();
            String[] strArr = A01;
            if (strArr[0].charAt(19) != strArr[1].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "LaehfLm13EgRqqa58La6JsJDVjNkKsjm";
            strArr2[1] = "U7opStToMRhy5hKGwjx6Oh4Ofub1lgfJ";
            c5h.A0G(str, c1w);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1019Lm
    public final void AAa(int i10) {
        C5H activityApi = this.A00.get();
        if (activityApi != null) {
            activityApi.finish(i10);
        }
    }
}
