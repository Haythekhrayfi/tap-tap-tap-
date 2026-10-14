package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1046Mn implements View.OnClickListener {
    public static byte[] A02;
    public final /* synthetic */ C1337Xw A00;
    public final /* synthetic */ C1048Mp A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-58, -57, -44, -38, -39, -97, -57, -47, -58, -45, -48, 20, 33, 18, 20, 22, 39, Ascii.FS, 41, Ascii.FS, 39, 44, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -60, -58, -41, -52, -46, -47, -111, -71, -84, -88, -70};
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
            if (!TextUtils.isEmpty(this.A01.A06) && !A00(0, 11, 35).equals(this.A01.A06)) {
                Intent intent = new Intent(A00(22, 26, 33), KW.A00(this.A01.A06));
                intent.addFlags(268435456);
                this.A00.A0E().A8V();
                try {
                    KJ.A0B(this.A00, intent);
                } catch (KH e10) {
                    Throwable cause = e10.getCause();
                    KH cause2 = e10;
                    if (cause != null) {
                        cause2 = e10.getCause();
                    }
                    this.A00.A07().A9K(A00(11, 11, 113), C06937v.A00, new C06947w(cause2));
                }
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    public ViewOnClickListenerC1046Mn(C1048Mp c1048Mp, C1337Xw c1337Xw) {
        this.A01 = c1048Mp;
        this.A00 = c1337Xw;
    }
}
