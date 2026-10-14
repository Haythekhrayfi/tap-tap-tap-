package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class U9 implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C7N {
    public static byte[] A02;
    public final C1337Xw A00;
    public final /* synthetic */ U7 A01;

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, 11, 4, 4, 5, Ascii.RS, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, Ascii.CAN, 15, 74, 3, Ascii.RS, 74, 3, Ascii.EM, 74, Ascii.FS, 3, 15, Ascii.GS, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, Ascii.FS, 55, 38, 37, 61, 32, 57, 56, Ascii.EM, 86, 2, Ascii.EM, 3, 21, Ascii.RS, 86, 18, 23, 2, 23, 86, 4, 19, 21, Ascii.EM, 4, 18, 19, 18, 90, 86, 6, Ascii.SUB, 19, 23, 5, 19, 86, 19, Ascii.CAN, 5, 3, 4, 19, 86, 2, Ascii.EM, 3, 21, Ascii.RS, 86, 19, 0, 19, Ascii.CAN, 2, 5, 86, 4, 19, 23, 21, Ascii.RS, 86, 2, Ascii.RS, 19, 86, 23, 18, 86, 32, Ascii.US, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, Ascii.CAN, Ascii.US, Ascii.CAN, 17, 86, 16, 23, Ascii.SUB, 5, 19, 86, Ascii.US, 16, 86, 15, Ascii.EM, 3, 86, Ascii.US, Ascii.CAN, 2, 19, 4, 21, 19, 6, 2, 86, 2, Ascii.RS, 19, 86, 19, 0, 19, Ascii.CAN, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            boolean zA08 = this.A01.A0f.A08();
            String strA00 = A00(66, 17, 105);
            if (!zA08) {
                Log.e(strA00, A00(83, 115, 77));
            }
            int iA0G = IN.A0G(this.A01.A0c);
            if (iA0G >= 0 && this.A01.A0f.A03() < iA0G) {
                if (this.A01.A0f.A07()) {
                    Log.e(strA00, A00(41, 25, 58));
                    return;
                } else {
                    Log.e(strA00, A00(0, 41, 81));
                    return;
                }
            }
            if (this.A01.A0f.A09(this.A01.A0c)) {
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0N(A01());
                }
            } else {
                if (!IN.A1H(this.A01.A0c)) {
                    A05(A01());
                    return;
                }
                if (this.A01.A0a != null) {
                    this.A01.A0a.A0Q(A01());
                }
                Km.A00(new DialogInterfaceOnClickListenerC0957Ix(this), new DialogInterfaceOnClickListenerC0958Iy(this), ActivityUtils.A00());
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    public U9(U7 u10, C1337Xw c1337Xw) {
        this.A01 = u10;
        this.A00 = c1337Xw;
    }

    public /* synthetic */ U9(U7 u10, C1337Xw c1337Xw, UI ui) {
        this(u10, c1337Xw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        Map<String, String> mapA05 = new ND().A03(this.A01.A0R).A02(this.A01.A0f).A05();
        if (this.A01.A0I != null) {
            mapA05.put(A00(201, 3, 11), String.valueOf(this.A01.A0I.A04()));
        }
        if (this.A01.A0W) {
            mapA05.put(A00(198, 3, 116), String.valueOf(this.A01.A0W));
        }
        return mapA05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> extraData) {
        if (this.A01.A0a != null) {
            this.A01.A0a.A0M(extraData);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final C1337Xw A5o() {
        return this.A00;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.A01.A04 == null || this.A01.A0L == null) {
            return false;
        }
        this.A01.A0L.setBounds(0, 0, this.A01.A04.getWidth(), this.A01.A04.getHeight());
        this.A01.A0L.A0D(!this.A01.A0L.A0E());
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A01.A0f.A06(this.A01.A0c, motionEvent, this.A01.A04, view);
        return this.A01.A02 != null && this.A01.A02.onTouch(view, motionEvent);
    }
}
