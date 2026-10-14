package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AsyncTaskC1212Sx extends AsyncTask<String, Void, Bitmap[]> implements C7N {
    public static byte[] A0A;
    public static String[] A0B = {"Y", "r8ye64eLoQHeOJVpmB1uxWw1zCCHhuzX", "pvZIfONmKv3cVbimQPa9", "RLgA2SApOIsDDawooMs2KL5D8ZiCWoW1", "kM6akDIqkvY", "0vJdyNO9qrz2JF8Kt31GcmRDql8haFQB", "b8N1ZLVb0I2QrMIKflin5UtA7D7V4D", "X"};
    public int A00;
    public int A01;
    public NC A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<NA> A06;
    public final WeakReference<C1337Xw> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 48);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-89, -91, -82, -91, -78, -87, -93};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final Bitmap[] A03(String... strArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            String str = strArr[0];
            Bitmap bitmapA0N = null;
            Bitmap bitmapA01 = null;
            C1337Xw c1337Xw = this.A07.get();
            if (c1337Xw == null) {
                return new Bitmap[]{null, null};
            }
            try {
                bitmapA0N = new C6O(c1337Xw).A0N(str, this.A00, this.A01);
                if (bitmapA0N != null && !this.A03) {
                    bitmapA01 = LV.A01(c1337Xw, bitmapA0N, this.A04, this.A05);
                }
            } catch (Throwable th) {
                c1337Xw.A07().A9K(A00(0, 7, 16), C06937v.A1V, new C06947w(th));
            }
            return new Bitmap[]{bitmapA0N, bitmapA01};
        } catch (Throwable th2) {
            C0979Jw.A00(th2, this);
            return null;
        }
    }

    static {
        A01();
    }

    public AsyncTaskC1212Sx(ViewGroup viewGroup, int i10, int i11, C1337Xw c1337Xw) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1337Xw);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i10;
        this.A05 = i11;
    }

    public AsyncTaskC1212Sx(ViewGroup viewGroup, C1337Xw c1337Xw) {
        this(viewGroup, 12, 16, c1337Xw);
    }

    public AsyncTaskC1212Sx(ImageView imageView, C1337Xw c1337Xw) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1337Xw);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC1212Sx(NA na2, C1337Xw c1337Xw) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c1337Xw);
        this.A06 = new WeakReference<>(na2);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) throws Throwable {
        NA na2;
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            WeakReference<ImageView> weakReference = this.A08;
            if (weakReference != null) {
                ImageView imageView = weakReference.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            WeakReference<NA> weakReference2 = this.A06;
            if (weakReference2 != null && (na2 = weakReference2.get()) != null) {
                na2.setImage(result[0], result[1]);
            }
            WeakReference<ViewGroup> weakReference3 = this.A09;
            if (weakReference3 != null && weakReference3.get() != null && result[1] != null) {
                LO.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            NC nc2 = this.A02;
            if (nc2 != null) {
                nc2.ABM(result[0] != null);
            }
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
        }
    }

    public final AsyncTaskC1212Sx A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC1212Sx A05(int i10, int i11) {
        this.A00 = i10;
        this.A01 = i11;
        return this;
    }

    public final AsyncTaskC1212Sx A06(NC nc2) {
        this.A02 = nc2;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            NC nc2 = this.A02;
            if (nc2 != null) {
                nc2.ABM(false);
                return;
            }
            return;
        }
        executeOnExecutor(LT.A06, str);
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final C1337Xw A5o() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) throws Throwable {
        if (C0979Jw.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            C0979Jw.A00(th, this);
            String[] strArr = A0B;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[0] = "X";
            strArr2[7] = "y";
        }
    }
}
