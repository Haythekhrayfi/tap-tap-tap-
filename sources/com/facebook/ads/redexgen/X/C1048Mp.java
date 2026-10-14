package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1048Mp extends LinearLayout {
    public static byte[] A0A;
    public static String[] A0B = {"knq4crm7fvqQP", "POuWJNR6FFtqsTvB6KeDXgsqVDDrfXB5", "10LYd3PkBnL3JTlwXO74lkb8laVhyfxM", "yGvyB2PsIdOlgSHN7xWAdIyeKrkcUuSJ", "30OsfDGqNeLBXhmKwxFpv8WuoKRgKdOB", "v4mwmIuaROl", "LuFvPWZsJ2RrZ", "py7QobRXpH9AZVstdVJJOkEIejHuBaN9"};
    public static final int A0C;
    public static final int A0D;
    public static final Uri A0E;
    public static final View.OnTouchListener A0F;
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public ImageView A03;
    public InterfaceC1047Mo A04;
    public C1054Mv A05;
    public String A06;
    public boolean A07;
    public final WebView A08;
    public final InterfaceC1057My A09;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 39);
            String[] strArr = A0B;
            if (strArr[3].charAt(13) == strArr[1].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "2vQcPj1ELj1bu";
            strArr2[0] = "7aOELiI6quiDs";
            bArrCopyOfRange[i13] = b10;
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{80, 115, 113, 121, Ascii.ESC, 52, 55, 43, 61, 39, 14, 19, 22, 0, 19, 5, 14, 49, 36, 47, 97, 47, 32, 53, 40, 55, 36, 97, 35, 51, 46, 54, 50, 36, 51, 5, 6, 11, 17, 16, 94, 6, 8, 5, 10, 15, 18, Ascii.GS, 23, 1, Ascii.FS, Ascii.SUB, 23, 93, Ascii.SUB, Ascii.GS, 7, 22, Ascii.GS, 7, 93, 18, 16, 7, Ascii.SUB, Ascii.FS, Ascii.GS, 93, 37, 58, 54, 36, Ascii.ESC, 23, 21, 86, Ascii.EM, 22, Ascii.FS, 10, 23, 17, Ascii.FS, 86, Ascii.ESC, 16, 10, 23, 21, Ascii.GS, 80, 76, 76, 72, 2, 23, 23, 79, 79, 79, 22, 94, 89, 91, 93, 90, 87, 87, 83, 22, 91, 87, 85};
    }

    static {
        A07();
        A0C = Color.rgb(224, 224, 224);
        A0E = KW.A00(A05(90, 23, 31));
        A0F = new ViewOnTouchListenerC1042Mj();
        A0D = Color.argb(34, 0, 0, 0);
    }

    public C1048Mp(C1337Xw c1337Xw, WebView webView) {
        super(c1337Xw);
        this.A09 = new T9(this);
        this.A08 = webView;
        this.A07 = IO.A06(c1337Xw);
        A08(c1337Xw);
    }

    private void A08(C1337Xw c1337Xw) {
        float density = 50.0f * getResources().getDisplayMetrics().density;
        int i10 = (int) density;
        LO.A0M(this, -1);
        setGravity(16);
        ImageView imageView = new ImageView(c1337Xw);
        this.A01 = imageView;
        imageView.setContentDescription(A05(4, 5, 127));
        ViewGroup.LayoutParams closeButtonParams = new LinearLayout.LayoutParams(i10, i10);
        this.A01.setScaleType(ImageView.ScaleType.CENTER);
        this.A01.setImageBitmap(LX.A01(LW.BROWSER_CLOSE));
        ImageView imageView2 = this.A01;
        View.OnTouchListener onTouchListener = A0F;
        imageView2.setOnTouchListener(onTouchListener);
        this.A01.setOnClickListener(new ViewOnClickListenerC1043Mk(this));
        addView(this.A01, closeButtonParams);
        if (this.A07) {
            ImageView imageView3 = new ImageView(c1337Xw);
            this.A00 = imageView3;
            imageView3.setEnabled(false);
            this.A00.setAlpha(0.3f);
            this.A00.setContentDescription(A05(0, 4, 53));
            ViewGroup.LayoutParams closeButtonParams2 = new LinearLayout.LayoutParams(i10, i10);
            this.A00.setScaleType(ImageView.ScaleType.CENTER);
            this.A00.setImageBitmap(LX.A01(LW.BACK_ARROW));
            this.A00.setOnTouchListener(onTouchListener);
            this.A00.setOnClickListener(new ViewOnClickListenerC1044Ml(this));
            addView(this.A00, closeButtonParams2);
        }
        this.A05 = new C1054Mv(c1337Xw);
        LinearLayout.LayoutParams closeButtonParams3 = new LinearLayout.LayoutParams(0, -2);
        float density2 = this.A07 ? 0.5f : 1.0f;
        closeButtonParams3.weight = density2;
        this.A05.setGravity(17);
        addView(this.A05, closeButtonParams3);
        if (this.A07) {
            ImageView imageView4 = new ImageView(c1337Xw);
            this.A02 = imageView4;
            imageView4.setEnabled(false);
            this.A02.setAlpha(0.3f);
            this.A02.setContentDescription(A05(9, 7, 70));
            ViewGroup.LayoutParams closeButtonParams4 = new LinearLayout.LayoutParams(i10, i10);
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            this.A02.setImageBitmap(LX.A02(LW.BACK_ARROW));
            this.A02.setOnTouchListener(onTouchListener);
            this.A02.setOnClickListener(new ViewOnClickListenerC1045Mm(this));
            addView(this.A02, closeButtonParams4);
        }
        this.A03 = new ImageView(c1337Xw);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, i10);
        this.A03.setContentDescription(A05(16, 19, 102));
        this.A03.setScaleType(ImageView.ScaleType.CENTER);
        this.A03.setOnTouchListener(onTouchListener);
        this.A03.setOnClickListener(new ViewOnClickListenerC1046Mn(this, c1337Xw));
        addView(this.A03, layoutParams);
        setupDefaultNativeBrowser(c1337Xw);
    }

    public InterfaceC1057My getBrowserNavigationListener() {
        return this.A09;
    }

    public void setListener(InterfaceC1047Mo interfaceC1047Mo) {
        this.A04 = interfaceC1047Mo;
    }

    public void setTitle(String str) {
        this.A05.setTitle(str);
    }

    public void setUrl(String str) {
        this.A06 = str;
        if (TextUtils.isEmpty(str) || A05(35, 11, 67).equals(str)) {
            this.A05.setSubtitle(null);
            this.A03.setEnabled(false);
            this.A03.setColorFilter(new PorterDuffColorFilter(A0C, PorterDuff.Mode.SRC_IN));
        } else {
            this.A05.setSubtitle(str);
            this.A03.setEnabled(true);
            this.A03.setColorFilter((ColorFilter) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    private void setupDefaultNativeBrowser(C1337Xw c1337Xw) {
        Bitmap bitmapA01;
        List<ResolveInfo> listQueryIntentActivities = c1337Xw.getPackageManager().queryIntentActivities(new Intent(A05(46, 26, 84), A0E), 65536);
        if (listQueryIntentActivities.size() == 0) {
            this.A03.setVisibility(8);
            bitmapA01 = null;
        } else if (listQueryIntentActivities.size() == 1) {
            if (A05(72, 18, 95).equals(listQueryIntentActivities.get(0).activityInfo.packageName)) {
                LW lw = LW.BROWSER_LAUNCH_CHROME;
                if (A0B[5].length() == 31) {
                    throw new RuntimeException();
                }
                String[] strArr = A0B;
                strArr[6] = "ER9o4D5KfsgKq";
                strArr[0] = "PVCMoHz4n3Ffn";
                bitmapA01 = LX.A01(lw);
            } else {
                bitmapA01 = LX.A01(LW.BROWSER_LAUNCH_NATIVE);
            }
        } else {
            bitmapA01 = LX.A01(LW.BROWSER_LAUNCH_NATIVE);
        }
        this.A03.setImageBitmap(bitmapA01);
    }
}
