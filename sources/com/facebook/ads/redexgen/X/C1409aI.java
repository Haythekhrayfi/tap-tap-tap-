package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.MediaView;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1409aI extends AbstractC05190q {
    public static byte[] A0E;
    public static String[] A0F = {"AssHqLhhTyxVt8qn53NKh99glOkg76Zu", "x1ztYNG5B8Yh1fFD9IH28HNLftAJV3DA", "znnjTlsCkULP275jnLAB9UeCHu0mwbQ7", "ZnygQwUKP9vcdRc0ZykdXWpZHZyK4mhg", "TpC7jOiqrQiocH3FafzZC3NFqv5kOY4I", "3gx5dg94KuTf2YQxiOsayTUTecU9lJlq", "0JsvRjae8Zudzo37ubyWjxcMew8uJTBn", "UifaSDkpcUGfPYHJ0LY2wgaMbKOuGMMh"};
    public View A00;
    public View A01;
    public AnonymousClass10 A02;
    public AnonymousClass11 A03;
    public J4 A04;
    public String A05;
    public List<View> A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C1419aS A0D;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{-57, -16, -20, -21, -99, -30, -11, -32, -30, -19, -15, -26, -20, -21, -30, -11, -12, -12, -17, -18, -27, -18, -29, -11, -11, -53, -44, -47, -53, -45, -55, -54, -44, -51, -42, -23, -27, -29, -46, -48, -39, -38, -33, -27, -28, -53, -58, -80, -76, -88, -82, -84, -35, -38, -28, -27, -21, -29, -30, -25, -33, -12, -25, -29, -11, -97, -110, -98, -103, -86, -99, -87, -77, -44, -57, -40, -57, -40, -23, -35, -14, -28, -15, -36, -42, -31, -26, -31, -18, -19, -20, -11, -86, -87, -78, -99, -84, -10, -4, -15, -18, -15, -24, -26, -24, -19, -96, -94, -107, -109, -111, -109, -104, -107, -113, -99, -107, -108, -103, -111, -120, 126, -113, 122, -38, -43, -56, -41, -38, -49, -42, -37, -2, -17, 2, -2, -114, -109, -118, Ascii.DEL, -44, -62, -43, -47, -36, -43, -46, -43, -42, -34, -43, -103, -116, -120, -102, -114, -127, 125, -113, Ascii.DEL, -118, -121, -115, -120, -77, -96, 114, 93, -100, 100, 88, -81, 114, 93, -100, -75, -2, -5, -67, -88, -25, -81, -93, -4, -67, -88, -25, 0};
    }

    static {
        A05();
    }

    public C1409aI(C1337Xw c1337Xw, AbstractC05200r abstractC05200r, QR qr, C1419aS c1419aS) {
        super(c1337Xw, abstractC05200r, qr);
        this.A02 = AnonymousClass10.A03;
        this.A03 = null;
        this.A0D = c1419aS;
    }

    private String A02(View view) {
        try {
            JSONObject json = A04(view);
            return json.toString();
        } catch (JSONException unused) {
            return A01(0, 14, 110);
        }
    }

    private String A03(View view) {
        int width = view.getWidth();
        String strA01 = A01(0, 0, 124);
        if (width <= 0 || view.getHeight() <= 0) {
            return strA01;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setDensity(view.getResources().getDisplayMetrics().densityDpi);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, this.A0D.A0A(), byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Exception unused) {
            return strA01;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0150  */
    /* JADX WARN: Code duplicated, block: B:30:0x015e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0162  */
    /* JADX WARN: Code duplicated, block: B:33:0x016e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0172  */
    private JSONObject A04(View view) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(A01(45, 2, 83), Integer.valueOf(view.getId()));
        jSONObject.putOpt(A01(20, 5, 115), view.getClass());
        boolean z10 = false;
        jSONObject.putOpt(A01(100, 6, 112), String.format(Locale.US, A01(SyslogConstants.LOG_LOCAL6, 12, 116), Integer.valueOf(view.getTop()), Integer.valueOf(view.getLeft())));
        jSONObject.putOpt(A01(120, 4, 6), String.format(Locale.US, A01(164, 12, 41), Integer.valueOf(view.getHeight()), Integer.valueOf(view.getWidth())));
        List<View> list = this.A06;
        if (list != null && list.contains(view)) {
            z10 = true;
        }
        jSONObject.putOpt(A01(25, 9, 89), Boolean.valueOf(z10));
        String strA01 = A01(SyslogConstants.LOG_LOCAL2, 7, 88);
        if (view instanceof Button) {
            strA01 = A01(14, 6, 113);
        } else {
            boolean z11 = view instanceof TextView;
            String[] strArr = A0F;
            String str = strArr[7];
            String type = strArr[1];
            if (str.charAt(8) != type.charAt(8)) {
                A0F[4] = "a1U0qc751PlbEJJxfXyB6O6M8jnkJmpE";
                if (!z11) {
                    boolean z12 = view instanceof ImageView;
                    String[] strArr2 = A0F;
                    String str2 = strArr2[3];
                    String type2 = strArr2[2];
                    if (str2.charAt(11) != type2.charAt(11)) {
                        String[] strArr3 = A0F;
                        strArr3[7] = "4Gk3naybi5dFEHdfNJUEACWbr8WBlccD";
                        strArr3[1] = "aD4fSpDvJi0UhN8txhrN3IJ83C3CHKuE";
                        if (z12) {
                            strA01 = A01(47, 5, 56);
                        } else if (view instanceof MediaView) {
                            strA01 = A01(56, 9, 111);
                        } else if (view instanceof ViewGroup) {
                            strA01 = A01(155, 9, 9);
                        }
                    } else if (z12) {
                        strA01 = A01(47, 5, 56);
                    } else if (view instanceof MediaView) {
                        strA01 = A01(56, 9, 111);
                    } else if (view instanceof ViewGroup) {
                        strA01 = A01(155, 9, 9);
                    }
                } else if (A0F[0].charAt(27) != 'G') {
                    A0F[4] = "nZrAcFVvb29oE4Mlbld53maAIoqkDe3s";
                    strA01 = A01(132, 4, 123);
                }
            }
            throw new RuntimeException();
        }
        jSONObject.putOpt(A01(SyslogConstants.LOG_LOCAL1, 4, 11), strA01);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            JSONArray list2 = new JSONArray();
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                JSONObject data = A04(viewGroup.getChildAt(i10));
                list2.put(data);
            }
            jSONObject.putOpt(A01(52, 4, 98), list2);
        }
        return jSONObject;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05190q
    public final void A06(Map<String, String> map) {
        if (this.A0D == null) {
            return;
        }
        J4 j10 = this.A04;
        if (j10 != null) {
            map.put(A01(97, 3, 121), String.valueOf(j10.A04()));
        }
        if (this.A07) {
            map.put(A01(83, 3, 95), Boolean.TRUE.toString());
        }
        if (this.A0B) {
            map.put(A01(89, 3, 112), Boolean.TRUE.toString());
        }
        if (this.A08) {
            map.put(A01(92, 5, 45), Boolean.TRUE.toString());
        }
        if (this.A00 != null && this.A0D.A0V()) {
            map.put(A01(151, 4, 20), A02(this.A00));
        }
        if (this.A00 != null && this.A0D.A0W()) {
            map.put(A01(124, 8, 88), A03(this.A00));
        }
        if (this.A0A) {
            map.put(A01(86, 3, 105), Boolean.TRUE.toString());
        }
        AnonymousClass10 anonymousClass10 = this.A02;
        if (anonymousClass10 != null) {
            map.put(A01(106, 14, 33), anonymousClass10.toString());
        }
        if (this.A09) {
            map.put(A01(140, 4, 80), Boolean.TRUE.toString());
        }
        View view = this.A01;
        if (A0F[0].charAt(27) == 'G') {
            throw new RuntimeException();
        }
        A0F[0] = "P6MGDEoKncCrYirOOQ1jmq4l0Ss52l96";
        if (view != null) {
            map.put(A01(69, 4, 45), String.valueOf((int) (view.getWidth() / Kn.A02)));
            map.put(A01(65, 4, 34), String.valueOf((int) (this.A01.getHeight() / Kn.A02)));
        }
        AnonymousClass11 anonymousClass11 = this.A03;
        if (anonymousClass11 != null) {
            map.put(A01(73, 5, 87), anonymousClass11.toString());
        }
        String str = this.A05;
        if (str != null) {
            map.put(A01(34, 11, 98), str);
        }
        if (this.A0C) {
            map.put(A01(78, 5, 108), Boolean.TRUE.toString());
        }
        this.A0D.A0O(map);
    }

    public final void A07(View view) {
        this.A01 = view;
    }

    public final void A08(View view) {
        this.A00 = view;
    }

    public final void A09(AnonymousClass10 anonymousClass10) {
        this.A02 = anonymousClass10;
    }

    public final void A0A(AnonymousClass11 anonymousClass11) {
        this.A03 = anonymousClass11;
    }

    public final void A0B(J4 j10) {
        this.A04 = j10;
    }

    public final void A0C(String str) {
        this.A05 = str;
    }

    public final void A0D(List<View> clickableViews) {
        this.A06 = clickableViews;
    }

    public final void A0E(boolean z10) {
        this.A07 = z10;
    }

    public final void A0F(boolean z10) {
        this.A08 = z10;
    }

    public final void A0G(boolean z10) {
        this.A09 = z10;
    }

    public final void A0H(boolean z10) {
        this.A0A = z10;
    }

    public final void A0I(boolean z10) {
        this.A0B = z10;
    }

    public final void A0J(boolean z10) {
        this.A0C = z10;
    }
}
