package com.facebook.ads.redexgen.X;

import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1190Sb extends AbstractC1072Nn {
    public static byte[] A0g;
    public static String[] A0h = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0i;
    public static final int A0j;
    public static final int A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public View A09;
    public InputMethodManager A0A;
    public LinearLayout A0B;
    public LinearLayout A0C;
    public RelativeLayout A0D;
    public TextView A0E;
    public AbstractC1404aD A0F;
    public C1048Mp A0G;
    public C1049Mq A0H;
    public T8 A0I;
    public ViewOnClickListenerC1207Ss A0J;
    public C1076Nr A0K;
    public OB A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public final View A0a;
    public final AbstractC05100g A0b;
    public final C0945Il A0c;
    public final NX A0d;
    public final NY A0e;
    public final JY A0f;

    public static String A0H(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0g, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0T() {
        A0g = new byte[]{125, 20, 51, 46, 41, 60, 49, 49, 125, Ascii.RS, 41, 60, 125, Ascii.CAN, 51, 60, 63, 49, 56, 57, 103, 45, 12, 5, 8, 16, 73, 15, Ascii.ESC, 6, 4, 73, 58, Ascii.GS, 8, Ascii.ESC, Ascii.GS, 73, 83, 59, 9, 14, 76, 37, 2, Ascii.US, Ascii.CAN, 13, 0, 0, 76, 14, Ascii.EM, Ascii.CAN, Ascii.CAN, 3, 2, 76, 37, 2, Ascii.CAN, 9, Ascii.RS, 15, 9, Ascii.FS, Ascii.CAN, 86, 102, 105, 108, 102, 110, 90, 118, 106, 112, 119, 102, 96, Ascii.US, Ascii.GS, 12, 42, Ascii.EM, 15, 48, Ascii.GS, 17, Ascii.US, 16, 12, 120, Ascii.DEL, 97, 100, 101, 78, 124, 116, 101, 121, 126, 117, 2, 20, 1, 22, Ascii.GS, 42, 20, Ascii.ESC, 17, 42, Ascii.FS, Ascii.ESC, 6, 1, 20, Ascii.EM, Ascii.EM, 42, 17, 16, Ascii.EM, 20, 12, 42, 19, 7, Ascii.SUB, Ascii.CAN, 42, 6, 1, 20, 7, 1, Ascii.DEL, 105, 124, 107, 96, 87, 105, 102, 108, 87, 97, 102, 123, 124, 105, 100, 100, 87, Ascii.DEL, 109, 106, 87, 97, 102, 123, 124, 105, 100, 100, 87, 97, 102, 124, 109, 122, 107, 109, 120, 124, 4, Ascii.SUB, Ascii.GS, 23, Ascii.FS, 4, 108, 117, 114, 68, 120, 111, 122, 68, 121, 110, 111, 111, 116, 117, 35, 58, 61, 11, 35, 49, 54, 11, 61, 58, 39, 32, 53, 56, 56, 11, 54, 33, 32, 32, 59, 58, 126};
    }

    static {
        A0T();
        A0l = (int) (Kn.A02 * 26.0f);
        A0i = (int) (Kn.A02 * 4.0f);
        A0n = (int) (Kn.A02 * 8.0f);
        A0j = (int) (Kn.A02 * 24.0f);
        A0k = C05562b.A01(-1, 77);
        A0m = (int) (Kn.A02 * 12.0f);
    }

    public C1190Sb(C1076Nr c1076Nr) {
        super(c1076Nr, true);
        this.A0W = false;
        this.A02 = -1;
        this.A0X = false;
        this.A03 = 0;
        this.A0M = false;
        this.A0T = false;
        this.A0V = false;
        this.A0U = false;
        this.A0Y = false;
        this.A0Q = false;
        this.A0S = false;
        this.A0R = false;
        this.A0P = false;
        this.A08 = 0;
        this.A01 = 0;
        this.A0O = false;
        this.A0Z = false;
        this.A0A = (InputMethodManager) c1076Nr.A05().getSystemService(A0H(92, 12, 107));
        this.A0K = c1076Nr;
        this.A0F = c1076Nr.A04();
        this.A0c = new C0945Il(c1076Nr.A04().A0s(), c1076Nr.A06());
        JY jyA0A = this.A0K.A0A();
        this.A0f = jyA0A;
        if (jyA0A != null) {
            LO.A0K(jyA0A);
        }
        View viewA03 = this.A0K.A03();
        this.A0a = viewA03;
        this.A0b = C05110h.A01(c1076Nr.A05(), c1076Nr.A06(), c1076Nr.A04().A0s(), KW.A00(c1076Nr.A04().A0n().A0F().A05()), new HashMap(), false, true);
        C1066Nh.A00(c1076Nr.A05(), this, c1076Nr.A04().A0n().A0D().A07());
        setupLayoutConfiguration(false);
        A0P();
        A0L();
        postDelayed(new C1194Sf(this), 1000L);
        A0S();
        C1193Se c1193Se = new C1193Se(this);
        this.A0d = c1193Se;
        RN rn = this.A0K.A02() instanceof RN ? (RN) this.A0K.A02() : null;
        this.A0e = new NY(c1076Nr, this.A0F, rn, this.A0K.A09(), c1193Se, this.A0E, this.A0L, jyA0A, viewA03);
        if (rn != null && IN.A18(getAdContextWrapper())) {
            NG.A00(rn.getVideoImplView(), IN.A19(getAdContextWrapper()), new O4(this));
        } else if (this.A09 != null && IN.A16(getAdContextWrapper())) {
            NG.A00(this.A09, IN.A17(getAdContextWrapper()), new O5(this));
        }
        this.A0D = null;
        this.A0J = null;
    }

    public C1190Sb(C1076Nr c1076Nr, boolean z10) {
        this(c1076Nr);
        this.A0W = z10;
        AbstractC1404aD abstractC1404aDA04 = c1076Nr.A04();
        this.A0X = this.A0W && abstractC1404aDA04.A0e();
        if (this.A0W) {
            int iA0B = abstractC1404aDA04.A0B();
            this.A02 = iA0B;
            if (iA0B == 0) {
                A0z();
            } else if (iA0B > 0 && iA0B <= 10000) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.Ny
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.A00.A0z();
                    }
                }, this.A02);
            }
            HashMap map = new HashMap();
            map.put(A0H(104, 34, 15), A0H(21, 18, 19) + this.A02 + A0H(0, 21, 39) + this.A0X);
            map.put(A0H(138, 39, 114), A0H(39, 29, 22) + abstractC1404aDA04.A0d());
            this.A0c.A04(EnumC0944Ik.A0y, map);
            this.A0Z = KV.A0J(c1076Nr.A05(), abstractC1404aDA04.A0s());
        }
    }

    public static /* synthetic */ int A03(C1190Sb c1190Sb) {
        int i10 = c1190Sb.A01;
        c1190Sb.A01 = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int A05(C1190Sb c1190Sb) {
        int i10 = c1190Sb.A08;
        c1190Sb.A08 = i10 + 1;
        return i10;
    }

    private void A0I() {
        LO.A0J(this.A0C);
        LinearLayout linearLayout = new LinearLayout(this.A0K.A05());
        this.A0C = linearLayout;
        LO.A0R(linearLayout, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0M ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(12);
        this.A0C.setLayoutParams(layoutParams);
        addView(this.A0C, 2);
    }

    private void A0J() {
        LI.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.Nz
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0K, reason: merged with bridge method [inline-methods] */
    public void A0z() {
        if (!this.A0O) {
            A0Y(((FF) this.A0b).A0G().toString());
            A0a(true);
        }
    }

    private void A0L() {
        LO.A0J(this.A0B);
        LinearLayout linearLayout = new LinearLayout(this.A0K.A05());
        this.A0B = linearLayout;
        linearLayout.setOrientation(1);
        LO.A0K(this.A0B);
        A0Q();
        this.A0B.setBackgroundColor(-1);
        addView(this.A0B);
    }

    private void A0M() {
        View view = this.A0a;
        if (view != null) {
            LO.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC1072Nn.A08, AbstractC1072Nn.A08);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC1072Nn.A07, this.A07, AbstractC1072Nn.A07, AbstractC1072Nn.A07);
            addView(this.A0a, layoutParams);
        }
    }

    private void A0N() {
        JY jy = this.A0f;
        if (jy != null) {
            LO.A0J(jy);
            JY jy2 = this.A0f;
            int i10 = A0m;
            jy2.setPadding(i10, i10, i10, i10);
            this.A0f.A06(-1, A0k);
            this.A0f.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0l);
            layoutParams.addRule(12);
            addView(this.A0f, layoutParams);
        }
    }

    private void A0O() {
        AbstractC1018Ll abstractC1018LlA08 = this.A0K.A08();
        if (abstractC1018LlA08 == null) {
            return;
        }
        abstractC1018LlA08.setPageDetailsVisible((this.A0N || abstractC1018LlA08.A07()) ? false : true);
    }

    private void A0P() {
        View viewA02 = this.A0K.A02();
        this.A09 = viewA02;
        LO.A0J(viewA02);
        LO.A0K(this.A09);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A09, 1, layoutParams);
        TextView textView = new TextView(this.A0K.A05());
        this.A0E = textView;
        LO.A0K(textView);
        this.A0E.setGravity(17);
        this.A0E.setTextColor(getColors().A05(true));
        this.A0E.setEllipsize(TextUtils.TruncateAt.END);
        this.A0E.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i10 = A0n;
        layoutParams2.setMargins(i10, i10 / 2, i10, this.A0f == null ? i10 : A0l);
        addView(this.A0E, layoutParams2);
        LO.A0K(this.A0E);
        C1076Nr c1076Nr = this.A0K;
        OB ob2 = new OB(c1076Nr, c1076Nr.A04().A0n().A0F().A04(), getColors(), new C1192Sd(this));
        this.A0L = ob2;
        ob2.setAutoClickTime(this.A0K.A04(), this.A0K.A08());
        LO.A0G(1001, this.A0L);
        addView(this.A0L);
        A0R();
        A0I();
        if (IN.A0z(this.A0K.A05())) {
            this.A0C.setOnClickListener(new O6(this));
            if (this.A0K.A08() != null) {
                this.A0K.A08().setCTAClickListener(new O7(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A05);
        if (A12()) {
            layoutParams.setMargins(0, this.A05 / 5, 0, 0);
            layoutParams.addRule(12);
            String[] strArr = A0h;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0h;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            this.A0B.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A05 + 1, 0, 0);
        }
        this.A0B.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        this.A0B.setLayoutParams(layoutParams);
    }

    private void A0R() {
        C1M c1mA00;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0M ? this.A04 / 4 : this.A04 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A0E.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0L.setLayoutParams(layoutParams);
        if (this.A0X && this.A0J != null) {
            boolean z10 = this.A0M;
            if (A0h[5].charAt(10) == 'N') {
                throw new RuntimeException();
            }
            A0h[2] = "dOHlU7mObztTib9yLp7cTgFqT8sjFKca";
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(z10 ? -2 : -1, -2);
            layoutParams2.addRule(12);
            layoutParams2.addRule(14);
            int i10 = A0j;
            layoutParams2.setMargins(i10, 0, i10, i10);
            if (getContext().getResources().getConfiguration().orientation == 1) {
                c1mA00 = this.A0K.A04().A0m().A01();
            } else {
                c1mA00 = this.A0K.A04().A0m().A00();
            }
            this.A0J.setUpButtonColors(c1mA00);
            if (this.A0M) {
                this.A0J.setPadding(i10, 0, i10, 0);
            }
            this.A0J.setLayoutParams(layoutParams2);
        }
    }

    private void A0S() {
        A0N();
        A0M();
        A0O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x013c  */
    /* JADX WARN: Code duplicated, block: B:32:0x014d  */
    /* JADX WARN: Code duplicated, block: B:34:0x015b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0199  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:41:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0210  */
    /* JADX WARN: Code duplicated, block: B:49:0x021f  */
    /* JADX WARN: Code duplicated, block: B:52:0x022a  */
    /* JADX WARN: Code duplicated, block: B:57:0x026e  */
    public void A0Y(String str) {
        T8 t10;
        C1M c1mA00;
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss;
        C1M c1mA01;
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss2;
        String[] strArr;
        if (this.A0X) {
            LO.A0J(this.A0D);
            LO.A0J(this.A0J);
        }
        LO.A0J(this.A0I);
        C1196Sh c1196Sh = new C1196Sh(this);
        if (this.A0K.A05().A0D() == null) {
            this.A0K.A05().A0E().A8T();
        }
        if (!IO.A02(this.A0K.A05()) && this.A0K.A05().A0D() != null) {
            t10 = new T8(this.A0K.A05(), this.A0K.A05().A0D(), c1196Sh);
        } else {
            t10 = new T8(this.A0K.A05(), c1196Sh);
        }
        this.A0I = t10;
        if (this.A0F.A0d() && Build.VERSION.SDK_INT > 16) {
            this.A0I.addJavascriptInterface(new C1068Nj(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Nw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A10(view);
                }
            }, this.A0I, new InterfaceC1067Ni() { // from class: com.facebook.ads.redexgen.X.Si
                @Override // com.facebook.ads.redexgen.X.InterfaceC1067Ni
                public final void AAf() {
                    this.A00.A0w();
                }
            }), C1068Nj.A01());
        }
        this.A0I.setOnTouchListener(new O1(this));
        setUpBrowserControls(this.A0I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        if (!this.A0X) {
            boolean zA0d = this.A0F.A0d();
            if (A0h[2].charAt(2) != 'l') {
                String[] strArr2 = A0h;
                strArr2[3] = "ABeDdDwfUa0cXy9D";
                strArr2[0] = "6t4j8";
                if (zA0d) {
                }
                if (this.A0X) {
                    viewOnClickListenerC1207Ss = this.A0J;
                    if (A0h[5].charAt(10) != 'N') {
                        String[] strArr3 = A0h;
                        strArr3[7] = "XdsVxMjv9c";
                        strArr3[4] = "2Kt0D4";
                        if (viewOnClickListenerC1207Ss != null) {
                            this.A0D = new RelativeLayout(getContext());
                            this.A0D.addView(this.A0I, new RelativeLayout.LayoutParams(-1, -1));
                            LO.A0K(this.A0J);
                            this.A0J.setRoundedCornersEnabled(A00());
                            this.A0J.setViewShowsOverMedia(A0D());
                            if (getContext().getResources().getConfiguration().orientation == 1) {
                                c1mA01 = this.A0K.A04().A0m().A01();
                            } else {
                                c1mA01 = this.A0K.A04().A0m().A00();
                            }
                            viewOnClickListenerC1207Ss2 = this.A0J;
                            strArr = A0h;
                            if (strArr[3].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0h;
                            strArr4[3] = "e6c97G8btJ0VwcAi";
                            strArr4[0] = "7mcrT";
                            viewOnClickListenerC1207Ss2.setUpButtonColors(c1mA01);
                            if (this.A0M) {
                                ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss3 = this.A0J;
                                int i10 = A0j;
                                viewOnClickListenerC1207Ss3.setPadding(i10, 0, i10, 0);
                            }
                            this.A0J.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Nx
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.A00.A11(view);
                                }
                            });
                            RelativeLayout.LayoutParams webViewLayoutParams = new RelativeLayout.LayoutParams(this.A0M ? -2 : -1, -2);
                            webViewLayoutParams.addRule(12);
                            webViewLayoutParams.addRule(14);
                            int i11 = A0j;
                            webViewLayoutParams.setMargins(i11, 0, i11, i11);
                            this.A0D.addView(this.A0J, webViewLayoutParams);
                            this.A0B.addView(this.A0D, layoutParams);
                        } else {
                            this.A0B.addView(this.A0I, layoutParams);
                        }
                    } else {
                        A0h[5] = "KiolHF518TFwtpngBAjBytS4QancDjmi";
                        if (viewOnClickListenerC1207Ss != null) {
                            this.A0D = new RelativeLayout(getContext());
                            this.A0D.addView(this.A0I, new RelativeLayout.LayoutParams(-1, -1));
                            LO.A0K(this.A0J);
                            this.A0J.setRoundedCornersEnabled(A00());
                            this.A0J.setViewShowsOverMedia(A0D());
                            if (getContext().getResources().getConfiguration().orientation == 1) {
                                c1mA01 = this.A0K.A04().A0m().A01();
                            } else {
                                c1mA01 = this.A0K.A04().A0m().A00();
                            }
                            viewOnClickListenerC1207Ss2 = this.A0J;
                            strArr = A0h;
                            if (strArr[3].length() != strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr5 = A0h;
                            strArr5[3] = "e6c97G8btJ0VwcAi";
                            strArr5[0] = "7mcrT";
                            viewOnClickListenerC1207Ss2.setUpButtonColors(c1mA01);
                            if (this.A0M) {
                                ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss4 = this.A0J;
                                int i12 = A0j;
                                viewOnClickListenerC1207Ss4.setPadding(i12, 0, i12, 0);
                            }
                            this.A0J.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Nx
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    this.A00.A11(view);
                                }
                            });
                            RelativeLayout.LayoutParams webViewLayoutParams2 = new RelativeLayout.LayoutParams(this.A0M ? -2 : -1, -2);
                            webViewLayoutParams2.addRule(12);
                            webViewLayoutParams2.addRule(14);
                            int i13 = A0j;
                            webViewLayoutParams2.setMargins(i13, 0, i13, i13);
                            this.A0D.addView(this.A0J, webViewLayoutParams2);
                            this.A0B.addView(this.A0D, layoutParams);
                        } else {
                            this.A0B.addView(this.A0I, layoutParams);
                        }
                    }
                } else {
                    this.A0B.addView(this.A0I, layoutParams);
                }
                this.A0I.loadUrl(str);
            }
            throw new RuntimeException();
        }
        C1337Xw c1337XwA05 = this.A0K.A05();
        String strA0G = this.A0K.A04().A0G();
        if (this.A0K.A00() == 1) {
            c1mA00 = this.A0K.A04().A0m().A01();
        } else {
            AnonymousClass19 anonymousClass19A0m = this.A0K.A04().A0m();
            if (A0h[2].charAt(2) != 'l') {
                A0h[2] = "ITNOZndla8FkUtBGhiX7sRo788OGYoEp";
                c1mA00 = anonymousClass19A0m.A00();
            }
            throw new RuntimeException();
        }
        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss5 = new ViewOnClickListenerC1207Ss(c1337XwA05, strA0G, c1mA00, this.A0K.A04().A0n().A0F().A06(), this.A0K.A06(), this.A0K.A09(), this.A0K.A0B(), this.A0K.A07());
        this.A0J = viewOnClickListenerC1207Ss5;
        viewOnClickListenerC1207Ss5.setCta(this.A0K.A04().A0n().A0F(), this.A0K.A04().A0s(), new HashMap());
        if (this.A0X) {
            viewOnClickListenerC1207Ss = this.A0J;
            if (A0h[5].charAt(10) != 'N') {
                String[] strArr6 = A0h;
                strArr6[7] = "XdsVxMjv9c";
                strArr6[4] = "2Kt0D4";
                if (viewOnClickListenerC1207Ss != null) {
                    this.A0D = new RelativeLayout(getContext());
                    this.A0D.addView(this.A0I, new RelativeLayout.LayoutParams(-1, -1));
                    LO.A0K(this.A0J);
                    this.A0J.setRoundedCornersEnabled(A00());
                    this.A0J.setViewShowsOverMedia(A0D());
                    if (getContext().getResources().getConfiguration().orientation == 1) {
                        c1mA01 = this.A0K.A04().A0m().A01();
                    } else {
                        c1mA01 = this.A0K.A04().A0m().A00();
                    }
                    viewOnClickListenerC1207Ss2 = this.A0J;
                    strArr = A0h;
                    if (strArr[3].length() != strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr7 = A0h;
                    strArr7[3] = "e6c97G8btJ0VwcAi";
                    strArr7[0] = "7mcrT";
                    viewOnClickListenerC1207Ss2.setUpButtonColors(c1mA01);
                    if (this.A0M) {
                        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss6 = this.A0J;
                        int i14 = A0j;
                        viewOnClickListenerC1207Ss6.setPadding(i14, 0, i14, 0);
                    }
                    this.A0J.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Nx
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.A00.A11(view);
                        }
                    });
                    RelativeLayout.LayoutParams webViewLayoutParams3 = new RelativeLayout.LayoutParams(this.A0M ? -2 : -1, -2);
                    webViewLayoutParams3.addRule(12);
                    webViewLayoutParams3.addRule(14);
                    int i15 = A0j;
                    webViewLayoutParams3.setMargins(i15, 0, i15, i15);
                    this.A0D.addView(this.A0J, webViewLayoutParams3);
                    this.A0B.addView(this.A0D, layoutParams);
                } else {
                    this.A0B.addView(this.A0I, layoutParams);
                }
            } else {
                A0h[5] = "KiolHF518TFwtpngBAjBytS4QancDjmi";
                if (viewOnClickListenerC1207Ss != null) {
                    this.A0D = new RelativeLayout(getContext());
                    this.A0D.addView(this.A0I, new RelativeLayout.LayoutParams(-1, -1));
                    LO.A0K(this.A0J);
                    this.A0J.setRoundedCornersEnabled(A00());
                    this.A0J.setViewShowsOverMedia(A0D());
                    if (getContext().getResources().getConfiguration().orientation == 1) {
                        c1mA01 = this.A0K.A04().A0m().A01();
                    } else {
                        c1mA01 = this.A0K.A04().A0m().A00();
                    }
                    viewOnClickListenerC1207Ss2 = this.A0J;
                    strArr = A0h;
                    if (strArr[3].length() != strArr[0].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr8 = A0h;
                    strArr8[3] = "e6c97G8btJ0VwcAi";
                    strArr8[0] = "7mcrT";
                    viewOnClickListenerC1207Ss2.setUpButtonColors(c1mA01);
                    if (this.A0M) {
                        ViewOnClickListenerC1207Ss viewOnClickListenerC1207Ss7 = this.A0J;
                        int i16 = A0j;
                        viewOnClickListenerC1207Ss7.setPadding(i16, 0, i16, 0);
                    }
                    this.A0J.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.Nx
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.A00.A11(view);
                        }
                    });
                    RelativeLayout.LayoutParams webViewLayoutParams4 = new RelativeLayout.LayoutParams(this.A0M ? -2 : -1, -2);
                    webViewLayoutParams4.addRule(12);
                    webViewLayoutParams4.addRule(14);
                    int i17 = A0j;
                    webViewLayoutParams4.setMargins(i17, 0, i17, i17);
                    this.A0D.addView(this.A0J, webViewLayoutParams4);
                    this.A0B.addView(this.A0D, layoutParams);
                } else {
                    this.A0B.addView(this.A0I, layoutParams);
                }
            }
        } else {
            this.A0B.addView(this.A0I, layoutParams);
        }
        this.A0I.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Z(String str) {
        if (this.A0F.A0k() > 0) {
            if (this.A0F.A0z() && this.A0P) {
                return;
            }
            this.A0P = true;
            new ND().A03(null).A02(null).A05().put(A0H(68, 12, 127), str);
            InterfaceC0937Id adEventManager = getAdEventManager();
            String strA0s = this.A0F.A0s();
            Map<String, String> extraData = new ND().A03(null).A02(null).A05();
            adEventManager.A9S(strA0s, extraData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat;
        this.A0N = z10;
        if (z10) {
            this.A0O = true;
        }
        if (z10) {
            this.A01 = 0;
            this.A08 = 0;
            this.A0Q = false;
            this.A0R = false;
            this.A0S = false;
            this.A0P = false;
        }
        postDelayed(new C1195Sg(this, z10), 250L);
        String strA0H = A0H(219, 1, 125);
        if (z10) {
            OB ob2 = this.A0L;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(ob2, strA0H, ob2.getY(), this.A05 / 5);
        } else {
            objectAnimatorOfFloat = null;
        }
        LinearLayout linearLayout = this.A0B;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i10 = this.A05;
        if (z10) {
            i10 /= 5;
        }
        fArr[1] = i10;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, strA0H, fArr);
        objectAnimatorOfFloat2.setDuration(500L);
        View view = this.A09;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, strA0H, view.getY(), StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        browserTransAnim.setDuration(500L);
        int[] iArr = new int[2];
        iArr[0] = this.A09.getHeight();
        int i11 = this.A05;
        if (z10) {
            i11 /= 5;
        }
        iArr[1] = i11;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new O2(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, browserTransAnim, duration);
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setDuration(500L);
            animatorSet.playTogether(objectAnimatorOfFloat);
        }
        animatorSet.addListener(new O3(this, z10));
        animatorSet.start();
    }

    private void A0b(boolean z10) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z10);
        LO.A0J(this.A09);
        View viewA02 = this.A0K.A02();
        this.A09 = viewA02;
        LO.A0K(viewA02);
        if (this.A0N) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A05 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            if (IN.A16(getAdContextWrapper()) && getResources().getConfiguration().orientation == 2 && !(this.A09 instanceof RN)) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            }
            layoutParams.addRule(13);
            A0L();
        }
        this.A09.setTranslationY(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        String[] strArr = A0h;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0h;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A09, 1, layoutParams);
        A0I();
        A0R();
    }

    private boolean A0c() {
        if (this.A0F.A0n().A0D().A0A()) {
            boolean z10 = this.A0U;
            String[] strArr = A0h;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0h;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z10 && !this.A0Y && !this.A0V) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0o() {
        super.A0o();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0p() {
        AbstractC1018Ll abstractC1018LlA08 = this.A0K.A08();
        if (abstractC1018LlA08 != null) {
            abstractC1018LlA08.setPageDetailsVisible((A12() || abstractC1018LlA08.A07()) ? false : true);
        }
        this.A0U = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0q() {
        if (this.A0K.A08() != null) {
            AbstractC1018Ll abstractC1018LlA08 = this.A0K.A08();
            String[] strArr = A0h;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0h;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            abstractC1018LlA08.setPageDetailsVisible(false);
        }
        this.A0U = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0r() {
        this.A0V = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0s() {
        this.A0V = this.A0F.A0n().A0D().A03() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0017  */
    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final void A0t(C1D c1d, String str, double d10, Bundle bundle) {
        super.A0t(c1d, str, d10, bundle);
        String strA05 = c1d.A0E().A05();
        if (strA05 != null) {
            String description = strA05.trim();
            if (description.length() == 0) {
                LO.A0N(this.A0C, 8);
            } else {
                this.A0E.setText(strA05);
            }
        } else {
            LO.A0N(this.A0C, 8);
        }
        if (d10 > 0.0d) {
            this.A03 = (int) (((double) this.A06) / d10);
        }
        this.A03 = this.A0M ? this.A04 : this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0u() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public final boolean A0v(boolean z10) {
        if (A12()) {
            A0a(false);
            return true;
        }
        if (!A0c()) {
            return false;
        }
        this.A0e.A07(this);
        return true;
    }

    public final /* synthetic */ void A0w() {
        this.A0c.A04(EnumC0944Ik.A0w, null);
    }

    public final /* synthetic */ void A0x() {
        if (this.A0J != null) {
            if (this.A0Z) {
                A0a(false);
            }
            this.A0c.A04(EnumC0944Ik.A0x, null);
            this.A0J.A09(A0H(183, 14, 97));
        }
    }

    public final /* synthetic */ void A0y() {
        if (this.A0J != null) {
            if (this.A0Z) {
                A0a(false);
            }
            this.A0J.A09(A0H(197, 22, 46));
        }
    }

    public final /* synthetic */ void A10(View view) {
        A0J();
    }

    public final /* synthetic */ void A11(View view) {
        LI.A00(new Runnable() { // from class: com.facebook.ads.redexgen.X.O0
            @Override // java.lang.Runnable
            public final void run() {
                this.A00.A0x();
            }
        });
    }

    public final boolean A12() {
        return this.A0N;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn
    public int getCloseButtonStyle() {
        if (A12()) {
            return 3;
        }
        if (this.A0V) {
            return 2;
        }
        if (this.A0F.A0n().A0D().A0A()) {
            return 1;
        }
        if (!this.A0U) {
            return super.getCloseButtonStyle();
        }
        if (A0h[5].charAt(10) == 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A0h;
        strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
        strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
        return 4;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1072Nn, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0b(A12());
        A0S();
        setupLayoutConfiguration(A12());
        A0Q();
    }

    private void setUpBrowserControls(T8 t10) {
        LO.A0J(this.A0G);
        C1048Mp c1048Mp = new C1048Mp(this.A0K.A05(), t10);
        this.A0G = c1048Mp;
        t10.setBrowserNavigationListener(c1048Mp.getBrowserNavigationListener());
        LO.A0K(this.A0G);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0G.setListener(new C1191Sc(this));
        this.A0G.setOnTouchListener(new O8(this));
        this.A0B.addView(this.A0G, layoutParams);
        LO.A0J(this.A0H);
        this.A0H = new C1049Mq(this.A0K.A05(), null, R.attr.progressBarStyleHorizontal);
        this.A0B.addView(this.A0H, new LinearLayout.LayoutParams(-1, A0i));
    }

    private void setupLayoutConfiguration(boolean z10) {
        this.A0M = getResources().getConfiguration().orientation == 2;
        this.A07 = this.A0K.A08() == null ? 0 : this.A0K.A08().getToolbarHeight();
        this.A0N = z10;
        this.A04 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A06 = Resources.getSystem().getDisplayMetrics().widthPixels;
        Point point = new Point();
        WindowManager windowManager = (WindowManager) getAdContextWrapper().getSystemService(A0H(177, 6, 9));
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                point.y = currentWindowMetrics.getBounds().bottom - currentWindowMetrics.getBounds().top;
            } else {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                if (Build.VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealSize(point);
                } else {
                    try {
                        Integer num = (Integer) Display.class.getMethod(A0H(80, 12, 2), new Class[0]).invoke(defaultDisplay, new Object[0]);
                        point.y = num != null ? num.intValue() : 0;
                    } catch (Exception unused) {
                    }
                }
            }
        }
        this.A05 = point.y > 0 ? point.y : this.A04;
        this.A03 = this.A04;
    }
}
