package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C5Z extends AsyncTask<C06315b, Void, Drawable> {
    public static byte[] A03;
    public static String[] A04 = {"1BJo9noXfKND6AuvSNdcB1V3GCwIAiOG", "Zj7TA2K", "dGMOiNue98uIHvh7voSV0LAZFWXYzfEv", "CcnxrNYo5kyWzKS3XGCDqe4PQiCtH", "knheqnusZFI0swerek9wKwEDBcdWqhKt", "XjDOSOe9Ixcmw73z7hfuGI1aFjWKj", "M2ugdIZCKbhB2vBaVocVLhBvD0BsDTY5", "metH7Y2aXkNKgtpuuGKiPWqQd6SU"};
    public final InterfaceC06305a A00;
    public final C1337Xw A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Drawable A00(C06315b... c06315bArr) throws Throwable {
        if (!C0979Jw.A02(this) && c06315bArr != null) {
            try {
                if (c06315bArr.length >= 1) {
                    String str = c06315bArr[0].A01;
                    String str2 = c06315bArr[0].A00;
                    Bitmap bitmapA0N = null;
                    try {
                        bitmapA0N = new C6O(this.A01).A0N(str, -1, -1);
                    } catch (Throwable th) {
                        this.A01.A07().A9K(A01(0, 7, 42), C06937v.A1V, new C06947w(th));
                    }
                    if (bitmapA0N != null) {
                        return U7.A05(this.A01, bitmapA0N, this.A02, str2);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                C0979Jw.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{59, 57, 50, 57, 46, 53, 63};
    }

    static {
        A02();
    }

    public C5Z(C1337Xw c1337Xw, InterfaceC06305a interfaceC06305a, boolean z10) {
        this.A01 = c1337Xw;
        this.A00 = interfaceC06305a;
        this.A02 = z10;
    }

    public /* synthetic */ C5Z(C1337Xw c1337Xw, InterfaceC06305a interfaceC06305a, boolean z10, YI yi) {
        this(c1337Xw, interfaceC06305a, z10);
    }

    private final void A03(Drawable drawable) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            this.A00.ABN(drawable);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Drawable doInBackground(C06315b[] c06315bArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return A00(c06315bArr);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Drawable drawable) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            String[] strArr = A04;
            if (strArr[0].charAt(5) != strArr[4].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[1] = "H4qVqfS";
            strArr2[7] = "3NPSPTmKkS9byZNXvPXu57LevjUG";
        }
    }
}
