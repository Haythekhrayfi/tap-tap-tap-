package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class U7 implements com.facebook.ads.Ad, NativeAdBaseApi, Repairable, J9 {
    public static C6O A0k;
    public static byte[] A0l;
    public static String[] A0m = {"Bl7Z7O36thNMsAQG86cT5hXAswukL2TU", "w0l3kgVUfrf8f1EzcfbBJ9JqF1JIQyF1", "3FYeVZ4P9Hva0brxRfDXnSutu97odoaf", "TkemScCQ72wM3yeu7V5OcaIZTlgQuG0T", "aV5nfdXEnoj7uvLi", "brDFWAS69jf159nGVdOYVvf", "WGIwYSb5Wjcv", "W7skGFSknqdZoaqu210O1mF"};
    public static final String A0n;
    public static final WeakHashMap<View, WeakReference<U7>> A0o;
    public long A00;
    public Drawable A01;
    public View.OnTouchListener A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public NativeAdLayout A07;
    public AnonymousClass10 A08;
    public C1409aI A09;
    public C0845Em A0A;
    public C1379Zo A0B;
    public C6U A0C;
    public C8E A0D;
    public EnumC0955Iv A0E;
    public U9 A0F;
    public U6 A0G;
    public J3 A0H;
    public J4 A0I;
    public JI A0J;
    public ME A0K;
    public NB A0L;
    public OX A0M;
    public PA A0N;
    public QQ A0O;
    public QQ A0P;
    public QR A0Q;
    public QR A0R;
    public String A0S;
    public String A0T;
    public WeakReference<C1347Yg> A0U;
    public WeakReference<QQ> A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C1419aS A0a;
    public final C6O A0b;
    public final C1337Xw A0c;
    public final J0 A0d;
    public final JB A0e;
    public final LG A0f;
    public final String A0g;
    public final String A0h;
    public final List<View> A0i;
    public volatile boolean A0j;

    public static String A0W(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0l, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0d() {
        A0l = new byte[]{86, -112, -100, -107, -108, -91, -85, -40, -90, -90, -90, -91, -38, -77, -28, -71, -75, -29, -30, -74, -27, -39, -41, -33, -38, 12, -38, -33, -35, 125, -96, 92, -86, -85, -80, 92, -88, -85, -99, -96, -95, -96, -67, -32, -48, -31, -23, -20, -24, -35, -16, -31, -100, -93, -95, -17, -93, -100, -27, -17, -100, -22, -21, -16, -100, -35, -100, -22, -35, -16, -27, -14, -31, -100, -35, -32, -105, -109, -110, -58, -75, -70, -74, -65, -76, -74, -97, -74, -59, -56, -64, -61, -68, -83, -56, -48, -45, -52, -53, -121, -37, -42, -121, -45, -42, -56, -53, -121, -76, -52, -53, -48, -56, -107, -96, -69, -61, -58, -65, -66, 122, -50, -55, 122, -55, -68, -50, -69, -61, -56, 122, -50, -65, -57, -54, -58, -69, -50, -65, 122, -93, -98, 122, -64, -52, -55, -57, 122, -68, -61, -66, 122, -54, -69, -45, -58, -55, -69, -66, 122, -127, Ascii.DEL, -51, -127, -79, -42, -36, -51, -38, -42, -55, -44, -120, -51, -38, -38, -41, -38, -106, 114, -47, -10, -2, -23, -12, -15, -20, -88, -5, -19, -4, -88, -9, -18, -88, -21, -12, -15, -21, -13, -23, -22, -12, -19, -88, -2, -15, -19, -1, -5, -73, -49, -50, -45, -53, -64, -45, -49, -31, -118, -48, -39, -36, -118, -45, -51, -39, -40, -118, -45, -35, -118, -45, -35, -118, -41, -45, -35, -35, -45, -40, -47, -104, -71, -47, -48, -43, -51, -62, -43, -47, -29, -116, -43, -33, -116, -39, -43, -33, -33, -43, -38, -45, -102, -117, -77, -79, -78, 94, -82, -80, -83, -76, -89, -94, -93, 94, -97, 94, -108, -89, -93, -75, -49, -30, -11, -22, -9, -26, -95, -62, -27, -95, -8, -30, -12, -95, -30, -19, -13, -26, -30, -27, -6, -95, -13, -26, -24, -22, -12, -11, -26, -13, -26, -27, -95, -8, -22, -11, -23, -95, -30, -95, -41, -22, -26, -8, -81, -95, -62, -10, -11, -16, -95, -10, -17, -13, -26, -24, -22, -12, -11, -26, -13, -22, -17, -24, -95, -30, -17, -27, -95, -15, -13, -16, -28, -26, -26, -27, -22, -17, -24, -81, -115, -96, -77, -88, -75, -92, 95, -96, -93, 95, -93, -92, -78, -77, -79, -82, -72, -92, -93, -40, -21, -2, -13, 0, -17, -86, -21, -18, -86, -10, -7, -21, -18, -86, -4, -17, -5, -1, -17, -3, -2, -17, -18, -115, -96, -100, -82, 87, -104, -93, -87, -100, -104, -101, -80, 87, -87, -100, -98, -96, -86, -85, -100, -87, -100, -101, 87, -82, -96, -85, -97, 87, -104, 87, -123, -104, -85, -96, -83, -100, 120, -101, 101, 87, 120, -84, -85, -90, 87, -84, -91, -87, -100, -98, -96, -86, -85, -100, -87, -96, -91, -98, 87, -104, -91, -101, 87, -89, -87, -90, -102, -100, -100, -101, -96, -91, -98, 101, -58, -39, -43, -25, -112, -34, -33, -28, -112, -30, -43, -41, -39, -29, -28, -43, -30, -43, -44, -112, -25, -39, -28, -40, -112, -28, -40, -39, -29, -112, -66, -47, -28, -39, -26, -43, -79, -44, -104, -101, 87, -92, -100, -101, -96, -104, 87, -85, -80, -89, -100, 87, -96, -86, 87, -91, -90, -85, 87, -86, -84, -89, -89, -90, -87, -85, -100, -101, 101, -116, -101, -108, -109, -108, -94, -93, -95, -98, -88, -94, -91, -105, -102, 119, -102, 7, 10, -4, -1, -36, -1, -61, -60, -69, -2, -4, 7, 7, 0, -1, -69, 8, 10, 13, 0, -69, 15, 3, -4, 9, -69, 10, 9, -2, 0, -17, -30, -11, -22, -9, -26};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0f(View view, View view2, List<View> list, boolean z10) {
        U6 u10;
        if (!A0q()) {
            this.A0c.A0E().AEC();
        }
        if (view == null) {
            String strA0W = A0W(264, 19, 22);
            if (!A0q()) {
                this.A0c.A0E().AEB(strA0W);
            }
            throw new IllegalArgumentException(strA0W);
        }
        if (list == null || list.size() == 0) {
            String strA0W2 = A0W(BaseTransientBottomBar.ANIMATION_FADE_DURATION, 30, 96);
            if (!A0q()) {
                this.A0c.A0E().AEB(strA0W2);
            }
            throw new IllegalArgumentException(strA0W2);
        }
        C1419aS c1419aSA0C = A0C();
        if (c1419aSA0C == null) {
            String strA0W3 = A0W(29, 13, 20);
            if (!A0q()) {
                this.A0c.A0E().AEB(strA0W3);
            }
            Log.e(A0n, strA0W3);
            JD jd2 = new JD(AdErrorType.NATIVE_AD_IS_NOT_LOADED, strA0W3);
            A11().A0E().A2h(LF.A01(this.A00), jd2.A03().getErrorCode(), jd2.A04());
            if (!IN.A2A(this.A0c) || (u10 = this.A0G) == null) {
                return;
            }
            u10.AB6(jd2);
            return;
        }
        String str = this.A0T;
        boolean z11 = view instanceof FrameLayout;
        String[] strArr = A0m;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[0] = "EctJGKY0XxsuqG0UQd3u1zsk6i1LiKEB";
        strArr2[2] = "xfmrtxxFdZMJNwdY4ICwqytBKlocc6OO";
        if (z11 && str != null) {
            A0g((FrameLayout) view, str);
        }
        NativeAdLayout nativeAdLayout = this.A07;
        if (nativeAdLayout != null) {
            ((YP) nativeAdLayout.getNativeAdLayoutApi()).A02();
        }
        C1347Yg c1347Yg = this.A0U.get();
        if (c1347Yg != null && c1419aSA0C.A08() == 1) {
            c1347Yg.A03(LW.AN_INFO_ICON);
        }
        if (view2 == null) {
            if (this.A0J == JI.A05) {
                AdErrorType adErrorType = AdErrorType.NO_MEDIAVIEW_IN_NATIVEAD;
                String strA0W4 = A0W(243, 21, 68);
                JD jd3 = new JD(adErrorType, strA0W4);
                A11().A0E().A2h(LF.A01(this.A00), jd3.A03().getErrorCode(), jd3.A04());
                U6 u11 = this.A0G;
                if (u11 != null) {
                    u11.AB6(jd3);
                }
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0n, strA0W4);
                    return;
                }
                return;
            }
            AdErrorType adErrorType2 = AdErrorType.NO_MEDIAVIEW_IN_NATIVEBANNERAD;
            String strA0W5 = A0W(210, 33, 66);
            JD jd4 = new JD(adErrorType2, strA0W5);
            A11().A0E().A2h(LF.A01(this.A00), jd4.A03().getErrorCode(), jd4.A04());
            U6 u12 = this.A0G;
            if (u12 != null) {
                u12.AB6(jd4);
            }
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0n, strA0W5);
                return;
            }
            return;
        }
        boolean z12 = (view2 instanceof AdNativeComponentView) && ((AdNativeComponentView) view2).getAdContentsView() != null;
        boolean z13 = z10 && (view2 instanceof ImageView);
        if (!z12 && !z13) {
            if (this.A0G != null) {
                JD jd5 = new JD(AdErrorType.UNSUPPORTED_AD_ASSET_NATIVEAD, A0W(519, 31, 15));
                A11().A0E().A2h(LF.A01(this.A00), jd5.A03().getErrorCode(), jd5.A04());
                this.A0G.AB6(jd5);
                return;
            }
            return;
        }
        if (this.A04 != null) {
            Log.w(A0n, A0W(283, 80, 89));
            String[] strArr3 = A0m;
            if (strArr3[7].length() != strArr3[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0m;
            strArr4[7] = "Yitqb4l5O5wHhToyiUZG328";
            strArr4[5] = "n4uNZUYEyoiQJdMJgH58rRy";
            unregisterView();
        }
        WeakHashMap<View, WeakReference<U7>> weakHashMap = A0o;
        if (weakHashMap.containsKey(view) && weakHashMap.get(view).get() != null) {
            Log.w(A0n, A0W(406, 75, 15));
            weakHashMap.get(view).get().unregisterView();
        }
        this.A0F = new U9(this, this.A0c, null);
        this.A04 = view;
        this.A06 = view2;
        if (view instanceof ViewGroup) {
            ME me2 = new ME(this.A0c, new UD(this));
            this.A0K = me2;
            ((ViewGroup) view).addView(me2);
        }
        if (c1419aSA0C.A0U()) {
            this.A0O = new UC(this);
            QR qr = new QR(view, 1, new WeakReference(this.A0O), this.A0c);
            this.A0Q = qr;
            qr.A0Y(false);
            this.A0Q.A0X(c1419aSA0C.A09());
            this.A0Q.A0U();
            this.A0c.A0E().A9y();
        }
        ArrayList arrayList = new ArrayList(list);
        View view3 = this.A05;
        if (view3 != null) {
            arrayList.add(view3);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A1K((View) it.next());
        }
        int iA00 = A00();
        this.A0P = new UB(this, view2, z13, c1419aSA0C);
        if (view2 instanceof AdNativeComponentView) {
            this.A03 = ((AdNativeComponentView) view2).getAdContentsView();
        } else {
            this.A03 = view2;
        }
        if (IN.A1W(this.A0c)) {
            String strA1B = A1B();
            InterfaceC0949Ip interfaceC0949IpA0A = A11().A0A();
            View view4 = this.A03;
            if (strA1B == null) {
                strA1B = A0W(0, 0, 21);
            }
            interfaceC0949IpA0A.AG0(view4, strA1B, view4 instanceof PW, true);
        }
        QR qr2 = new QR(this.A03, iA00, A03(), true, new WeakReference(this.A0P), this.A0c);
        this.A0R = qr2;
        qr2.A0Y(true ^ A0q());
        this.A0R.A0W(A01());
        this.A0R.A0X(A02());
        View view5 = this.A03;
        if (view5 instanceof N1) {
            ((N1) view5).A06(this.A0R);
        }
        C1409aI c1409aI = new C1409aI(this.A0c, new U8(this, null), this.A0R, this.A0a);
        this.A09 = c1409aI;
        c1409aI.A0D(arrayList);
        A0o.put(view, new WeakReference<>(this));
        if (Build.VERSION.SDK_INT < 18 || !IN.A11(this.A0c)) {
            return;
        }
        NB nb2 = new NB();
        this.A0L = nb2;
        nb2.A0C(this.A0g);
        this.A0L.A0B(this.A0c.getPackageName());
        this.A0L.A0A(this.A0R);
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null && c1419aS.A0E().A03() > 0) {
            AnonymousClass12 anonymousClass12A0E = this.A0a.A0E();
            this.A0L.A08(anonymousClass12A0E.A03(), anonymousClass12A0E.A04());
        }
        C8E c8e = this.A0D;
        if (c8e != null) {
            this.A0L.A09(c8e.A0C());
        } else {
            C0845Em c0845Em = this.A0A;
            if (c0845Em != null && c0845Em.A0G() != null) {
                this.A0L.A09(this.A0A.A0G().A0C());
            }
        }
        View view6 = this.A04;
        String[] strArr5 = A0m;
        if (strArr5[4].length() != strArr5[6].length()) {
            String[] strArr6 = A0m;
            strArr6[4] = "DFdj5aRKmThGOYGM";
            strArr6[6] = "4rU7VADNdisg";
            view6.getOverlay().add(this.A0L);
            return;
        }
        String[] strArr7 = A0m;
        strArr7[7] = "HovrQjOKGOU1glve9p8eAJs";
        strArr7[5] = "lnqkcQfVF9X2NaZpGo2NogE";
        view6.getOverlay().add(this.A0L);
    }

    static {
        A0d();
        A0n = U7.class.getSimpleName();
        A0o = new WeakHashMap<>();
    }

    public U7(Context context, String str, J0 j10, boolean z10) {
        this.A0h = UUID.randomUUID().toString();
        this.A0J = JI.A05;
        this.A0E = EnumC0955Iv.A04;
        this.A08 = AnonymousClass10.A03;
        this.A0U = new WeakReference<>(null);
        this.A0i = new ArrayList();
        this.A0f = new LG();
        this.A0Z = false;
        this.A0Y = false;
        this.A00 = -1L;
        if (context instanceof C1337Xw) {
            this.A0c = (C1337Xw) context;
        } else if (!z10) {
            this.A0c = C5O.A04(context);
        } else {
            this.A0c = C5O.A02(context);
        }
        this.A0c.A0H(this);
        this.A0g = str;
        this.A0d = j10;
        C6O c6o = A0k;
        if (c6o != null) {
            this.A0b = c6o;
        } else {
            this.A0b = new C6O(this.A0c);
        }
        this.A05 = new View(context);
        this.A0e = new JB(this.A0c, this);
    }

    public U7(U7 u10) {
        this((Context) u10.A0c, (String) null, u10.A0d, true);
        this.A0D = u10.A0D;
        this.A0a = u10.A0a;
        this.A0B = u10.A0B;
        this.A0j = true;
        this.A05 = new View(this.A0c);
    }

    public U7(C1337Xw c1337Xw, C1419aS c1419aS, C8E c8e, J0 j10) {
        this((Context) c1337Xw, (String) null, j10, true);
        this.A0a = c1419aS;
        this.A0D = c8e;
        this.A0j = true;
        this.A05 = new View(c1337Xw);
    }

    public U7(C1337Xw c1337Xw, C1419aS c1419aS, C8E c8e, J0 j10, C1379Zo c1379Zo) {
        this(c1337Xw, c1419aS, c8e, j10);
        this.A0B = c1379Zo;
    }

    private int A00() {
        C8E c8e = this.A0D;
        if (c8e != null) {
            return c8e.A04();
        }
        C0845Em c0845Em = this.A0A;
        if (c0845Em == null || c0845Em.A0G() == null) {
            return 1;
        }
        return this.A0A.A0G().A04();
    }

    private int A01() {
        C8E c8e = this.A0D;
        if (c8e != null) {
            return c8e.A07();
        }
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null) {
            int iA0C = c1419aS.A0C();
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "EUscbuPuA5cZxxPx7y6ncGc";
            strArr2[5] = "07NrZ6juCFttxvE5hiFlF8c";
            return iA0C;
        }
        C0845Em c0845Em = this.A0A;
        if (c0845Em != null && c0845Em.A0G() != null) {
            return this.A0A.A0G().A07();
        }
        return 0;
    }

    private int A02() {
        C8E c8e = this.A0D;
        if (c8e != null) {
            return c8e.A08();
        }
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null) {
            int iA0D = c1419aS.A0D();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "wlXrbCoONy6aNPfJSLZ4JGG9g8lWOQWJ";
            strArr2[3] = "zMDzXw8vWIk5v34E7N5RdIcOKoPIh5je";
            return iA0D;
        }
        C0845Em c0845Em = this.A0A;
        String[] strArr3 = A0m;
        if (strArr3[4].length() != strArr3[6].length()) {
            String[] strArr4 = A0m;
            strArr4[7] = "IJhE7OuQr9AUmHg0gZAU0NE";
            strArr4[5] = "Tpbr9nnLmrgR8Cas3OKWnYo";
            if (c0845Em == null) {
                return 1000;
            }
        } else {
            String[] strArr5 = A0m;
            strArr5[0] = "x7i9CQzVOJPdqJX1dHOWNRL80PPtBuUS";
            strArr5[2] = "xh5QtfSCbDAINUU48h4MV8p0ljd4aaCa";
            if (c0845Em == null) {
                return 1000;
            }
        }
        if (c0845Em.A0G() != null) {
            return this.A0A.A0G().A08();
        }
        return 1000;
    }

    private int A03() {
        C8E c8e = this.A0D;
        if (c8e != null) {
            return c8e.A09();
        }
        C0845Em c0845Em = this.A0A;
        if (c0845Em == null || c0845Em.A0G() == null) {
            return 0;
        }
        return this.A0A.A0G().A09();
    }

    public static Drawable A05(C1337Xw c1337Xw, Bitmap bitmap, boolean z10, String str) {
        BitmapDrawable bitmapDrawableA00;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c1337Xw.getResources(), bitmap);
        if (z10 && (bitmapDrawableA00 = P9.A00(c1337Xw, str)) != null) {
            Drawable iconViewDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawableA00});
            return iconViewDrawable;
        }
        return bitmapDrawable;
    }

    public static NativeAdBase A0A(Context context, String str, String str2) throws JE {
        JI jiA00 = JN.A00(str2);
        if (jiA00 != null) {
            JI ji = JI.A04;
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "9sjWaS9CbZxjWOFrlYfgckD2h0ahWze6";
            strArr2[2] = "CgLfFBC4KJYZcdRIWMiGUMQeYT9XpqO1";
            if (jiA00 == ji) {
                return new NativeBannerAd(context, str);
            }
            JI template = JI.A05;
            if (jiA00 == template) {
                return new NativeAd(context, str);
            }
            throw new JE(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(42, 34, 84), jiA00));
        }
        throw new JE(AdErrorType.BID_PAYLOAD_ERROR, String.format(Locale.US, A0W(114, 50, 50), str2));
    }

    private final C1419aS A0C() {
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null && c1419aS.A0T()) {
            return c1419aS;
        }
        return null;
    }

    private AnonymousClass12 A0F() {
        return A0G(false);
    }

    private AnonymousClass12 A0G(boolean z10) {
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null && c1419aS.A0T()) {
            if (z10) {
                this.A0a.A0I();
            }
            C1419aS c1419aS2 = this.A0a;
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "bGIdjP48JCmqHZjd8yMcvy0";
            strArr2[5] = "TixE3qv3ULKos9kbBUakVg1";
            return c1419aS2.A0E();
        }
        return new AnonymousClass12();
    }

    public static UA A0K() {
        return new UA();
    }

    public static U7 A0L(NativeAdBaseApi nativeAdBaseApi) {
        if (nativeAdBaseApi instanceof Proxy) {
            return (U7) ((AnonymousClass57) Proxy.getInvocationHandler(nativeAdBaseApi)).A04();
        }
        return (U7) nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public final J1 getAdChoicesIcon() {
        return A0F().A0E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final J2 getAdStarRating() {
        return A0F().A0H();
    }

    private AdPlacementType A0R() {
        if (this.A0J == JI.A05) {
            return AdPlacementType.NATIVE;
        }
        return AdPlacementType.NATIVE_BANNER;
    }

    private void A0Z() {
        for (View v10 : this.A0i) {
            v10.setOnClickListener(null);
            v10.setOnTouchListener(null);
            v10.setOnLongClickListener(null);
        }
        this.A0i.clear();
    }

    private void A0a() {
        if (!TextUtils.isEmpty(getAdChoicesLinkUrl())) {
            KV.A0L(new KV(), this.A0c, KW.A00(getAdChoicesLinkUrl()), A1B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0b() {
        this.A0f.A05();
        this.A0e.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0c() {
        QR qr = this.A0Q;
        if (qr != null) {
            qr.A0V();
            this.A0c.A0E().A9z();
            this.A0Q = null;
        }
    }

    public static void A0e(Drawable drawable, ImageView imageView) {
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(null);
        } else {
            imageView.setBackgroundDrawable(null);
        }
    }

    private void A0g(FrameLayout frameLayout, String str) {
        View view = this.A0N;
        if (view != null) {
            frameLayout.removeView(view);
        }
        PA paA01 = P9.A01(C5O.A02(this.A0c), str);
        this.A0N = paA01;
        if (paA01 != null) {
            frameLayout.addView(paA01, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(this.A0N);
        }
    }

    private void A0h(C1419aS c1419aS, boolean z10) {
        if (c1419aS == null) {
            return;
        }
        boolean zEquals = this.A0E.equals(EnumC0955Iv.A04);
        String strA0W = A0W(596, 6, 89);
        if (zEquals) {
            AnonymousClass12 anonymousClass12A0E = c1419aS.A0E();
            String clientToken = c1419aS.A6M();
            if (!TextUtils.isEmpty(clientToken)) {
                this.A0b.A0d(new C0945Il(clientToken, this.A0c.A09()));
            }
            if (anonymousClass12A0E.A0G() != null) {
                C6M c6m = new C6M(anonymousClass12A0E.A0G().getUrl(), anonymousClass12A0E.A0G().getHeight(), anonymousClass12A0E.A0G().getWidth(), c1419aS.A0G(), A0W(596, 6, 89));
                c6m.A00 = this.A0C;
                this.A0b.A0V();
                this.A0b.A0b(c6m);
            }
            if (!this.A0J.equals(JI.A04)) {
                if (anonymousClass12A0E.A0F() != null) {
                    this.A0b.A0b(new C6M(anonymousClass12A0E.A0F().getUrl(), anonymousClass12A0E.A0F().getHeight(), anonymousClass12A0E.A0F().getWidth(), c1419aS.A0G(), A0W(596, 6, 89)));
                }
                List<U7> listA0H = c1419aS.A0H();
                String[] strArr = A0m;
                if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "BiVeVWtUTguxpSjeMqAkCwQXeKWOVTz4";
                strArr2[3] = "8sdR9nWPZ664Gt9BvBocaDJi5It1hBkX";
                if (listA0H != null) {
                    for (U7 u10 : c1419aS.A0H()) {
                        if (u10.getAdCoverImage() != null) {
                            this.A0b.A0b(new C6M(u10.getAdCoverImage().getUrl(), u10.getAdCoverImage().getHeight(), u10.getAdCoverImage().getWidth(), c1419aS.A0G(), A0W(596, 6, 89)));
                        }
                    }
                }
                String strA0d = anonymousClass12A0E.A0d();
                if (!TextUtils.isEmpty(strA0d)) {
                    this.A0b.A0a(new C6K(strA0d, c1419aS.A0G(), A0W(596, 6, 89), anonymousClass12A0E.A0A()));
                }
            }
            AbstractC1404aD abstractC1404aDA0D = anonymousClass12A0E.A0D();
            if (abstractC1404aDA0D != null && abstractC1404aDA0D.A0c()) {
                C6K c6k = new C6K(abstractC1404aDA0D.A0H(), abstractC1404aDA0D.A0M(), strA0W);
                c6k.A04 = true;
                c6k.A03 = A0W(0, 5, 0);
                this.A0b.A0X(c6k);
            }
        }
        this.A0b.A0W(new UE(this, c1419aS, z10), new C6H(c1419aS.A0G(), strA0W));
    }

    private void A0i(AnonymousClass13 anonymousClass13) {
        C1419aS c1419aS = this.A0a;
        if (c1419aS == null) {
            return;
        }
        c1419aS.A0K(anonymousClass13);
    }

    public static void A0j(NativeAdImageApi nativeAdImageApi, ImageView imageView, C1337Xw c1337Xw) {
        if (nativeAdImageApi != null && imageView != null) {
            new AsyncTaskC1212Sx(imageView, c1337Xw).A05(nativeAdImageApi.getHeight(), nativeAdImageApi.getWidth()).A07(nativeAdImageApi.getUrl());
        }
    }

    private final void A0m(U6 u10) {
        this.A0G = u10;
    }

    private final void A0n(String str) {
        this.A0S = str;
    }

    private void A0o(List<View> list, View view) {
        J0 j10 = this.A0d;
        if (j10 != null && j10.AFO(view)) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                String[] strArr = A0m;
                String str = strArr[7];
                String str2 = strArr[5];
                int i11 = str.length();
                if (i11 != str2.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[1] = "SQxDsveS3BVeMl0nUnJayKxDlwKiSRwM";
                strArr2[3] = "CPUPH8uU8pe6dd8URnD7AGDEQ4lKFlLs";
                A0o(list, childAt);
            }
            return;
        }
        list.add(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0p() {
        return A18() == J6.A05 || A18() == J6.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0q() {
        return A0F().A0h();
    }

    public final long A0x() {
        return this.A00;
    }

    public final C1419aS A0y() {
        return this.A0a;
    }

    public final AbstractC1404aD A0z() {
        return A0F().A0D();
    }

    public final C6O A10() {
        return this.A0b;
    }

    public final C1337Xw A11() {
        return this.A0c;
    }

    public final U9 A12() {
        return this.A0F;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A13, reason: merged with bridge method [inline-methods] */
    public final J1 getAdCoverImage() {
        return A0F().A0F();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    /* JADX INFO: renamed from: A14, reason: merged with bridge method [inline-methods] */
    public final J1 getAdIcon() {
        return A0F().A0G();
    }

    public final U6 A15() {
        return this.A0G;
    }

    public final J3 A16() {
        return this.A0H;
    }

    public final J4 A17() {
        return this.A0I;
    }

    public final J6 A18() {
        return A0F().A0I();
    }

    public final LG A19() {
        return this.A0f;
    }

    public final QR A1A() {
        return this.A0R;
    }

    public final String A1B() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A6M();
    }

    public final String A1C() {
        return this.A0T;
    }

    public final String A1D() {
        return A0G(true).A0O();
    }

    public final String A1E() {
        return A0G(true).A0P();
    }

    public final String A1F() {
        return A0F().A0c();
    }

    public final String A1G() {
        C1419aS c1419aS = this.A0a;
        if (c1419aS == null || TextUtils.isEmpty(c1419aS.A0E().A0d())) {
            return null;
        }
        return this.A0b.A0S(this.A0a.A0E().A0d());
    }

    public final List<U7> A1H() {
        if (this.A0a == null || !isAdLoaded()) {
            return null;
        }
        return this.A0a.A0H();
    }

    public final void A1I() {
        if (!C2F.A00(this.A0c.A01()).A0O(this.A0c, false)) {
            A0a();
            return;
        }
        C1337Xw c1337Xw = this.A0c;
        MK mkA01 = ML.A01(c1337Xw, c1337Xw.A09(), A1B(), this.A07);
        if (mkA01 == null) {
            A0a();
        } else {
            ((YP) this.A07.getNativeAdLayoutApi()).A03(mkA01);
            mkA01.A0K();
        }
    }

    public final void A1J(Drawable drawable) {
        this.A01 = drawable;
        A1c(drawable != null, true);
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[4] = "Q96JEqttX0oIb74l";
        strArr2[6] = "mqYIcYUMJzEb";
    }

    public final void A1K(View view) {
        this.A0i.add(view);
        view.setOnClickListener(this.A0F);
        view.setOnTouchListener(this.A0F);
        if (Build.VERSION.SDK_INT >= 18) {
            boolean zA11 = IN.A11(view.getContext());
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "GeTsVetQiODT9yUx";
            strArr2[6] = "UPeG8QvAHkrx";
            if (zA11) {
                view.setOnLongClickListener(this.A0F);
            }
        }
    }

    public final void A1L(View view, ImageView imageView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, imageView, arrayList, true);
    }

    public final void A1M(View view, ImageView imageView, List<View> clickableViews) {
        A0f(view, imageView, clickableViews, true);
    }

    public final void A1N(View view, AdNativeComponentView adNativeComponentView) {
        ArrayList arrayList = new ArrayList();
        A0o(arrayList, view);
        A0f(view, adNativeComponentView, arrayList, false);
    }

    public final void A1O(View view, AdNativeComponentView adNativeComponentView, List<View> clickableViews) {
        A0f(view, adNativeComponentView, clickableViews, false);
    }

    public final void A1P(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Y = true;
        }
    }

    public final void A1Q(MediaView mediaView) {
        if (mediaView != null) {
            this.A0Z = true;
        }
    }

    public final void A1R(NativeAdBase nativeAdBase, NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        A0m(new C0757Aj(nativeAdListener, nativeAdBase));
    }

    public final void A1S(NativeAdLayout nativeAdLayout) {
        this.A07 = nativeAdLayout;
    }

    public final void A1T(C1419aS c1419aS) {
        A0h(c1419aS, true);
        if (this.A0G != null) {
            List<U7> listA0H = c1419aS.A0H();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[0] = "OfB2JsewzcYgCxMvn97l0AOaUV28WOmd";
            strArr2[2] = "fN7XzjPm8qHCAEGwTiZWrbsVWAwnjwvJ";
            if (listA0H != null) {
                UG ug = new UG(this);
                Iterator<U7> it = c1419aS.A0H().iterator();
                while (it.hasNext()) {
                    it.next().A0i(ug);
                }
            }
        }
    }

    public final void A1U(C1347Yg c1347Yg) {
        this.A0U = new WeakReference<>(c1347Yg);
    }

    public final void A1V(EnumC0955Iv enumC0955Iv, String str, C6U c6u) {
        if (str == null) {
            this.A0c.A0E().A2k();
        } else {
            this.A0c.A0E().A2j();
        }
        this.A00 = System.currentTimeMillis();
        if (this.A0j) {
            AdSettings.IntegrationErrorMode integrationErrorModeA00 = C05471s.A00(this.A0c);
            String strA0W = A0W(566, 30, 115);
            AdSettings.IntegrationErrorMode integrationErrorMode = AdSettings.IntegrationErrorMode.INTEGRATION_ERROR_CRASH_DEBUG_MODE;
            if (!integrationErrorMode.equals(integrationErrorModeA00)) {
                JD jd2 = new JD(AdErrorType.LOAD_AD_CALLED_MORE_THAN_ONCE, A0W(566, 30, 115));
                A11().A0E().A2h(LF.A01(this.A00), jd2.A03().getErrorCode(), jd2.A04());
                U6 u10 = this.A0G;
                if (u10 != null) {
                    u10.AB6(jd2);
                } else {
                    Log.e(A0W(76, 17, 41), strA0W);
                }
                C06947w c06947w = new C06947w(strA0W);
                A11().A07().A9K(A0W(550, 3, 3), C06937v.A0c, c06947w);
            } else {
                throw new C05521x(strA0W);
            }
        }
        this.A0j = true;
        this.A0E = enumC0955Iv;
        if (enumC0955Iv.equals(EnumC0955Iv.A05)) {
            this.A08 = AnonymousClass10.A05;
        }
        this.A0C = c6u;
        C05451q c05451q = new C05451q(this.A0g, this.A0J, A0R(), null, 1);
        c05451q.A05(enumC0955Iv);
        c05451q.A06(this.A0S);
        c05451q.A07(this.A0T);
        C0845Em c0845Em = new C0845Em(this.A0c, c05451q);
        this.A0A = c0845Em;
        c0845Em.A0O(new UH(this));
        this.A0A.A0R(str);
    }

    public final void A1W(J3 j10) {
        this.A0H = j10;
    }

    public final void A1X(J4 j10) {
        this.A0I = j10;
    }

    public final void A1Y(JI ji) {
        if (!A0q()) {
            if (JI.A04.equals(ji)) {
                C1337Xw c1337Xw = this.A0c;
                String[] strArr = A0m;
                if (strArr[7].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0m;
                strArr2[7] = "er71GFUENUkH6mVEmd80tsw";
                strArr2[5] = "eRFgtOOg0hnVr16Te1PNaNs";
                c1337Xw.A0E().A2n(AdPlacementType.NATIVE_BANNER.toString(), this.A0g);
            } else {
                this.A0c.A0E().A2n(AdPlacementType.NATIVE.toString(), this.A0g);
            }
        }
        this.A0J = ji;
    }

    public final void A1Z(QQ qq) {
        this.A0V = new WeakReference<>(qq);
    }

    public final void A1a(boolean z10) {
        this.A0W = z10;
    }

    public final void A1b(boolean z10) {
        this.A0X = z10;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    public final void A1c(boolean z10, boolean z11) {
        String strA0W;
        U6 u10;
        if (z10) {
            boolean zEquals = this.A0E.equals(EnumC0955Iv.A05);
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "JLY2qeoxINM9b6rKgxvdoo5";
            strArr2[5] = "SO3TgjdXtMDnoN5cYw5MldE";
            if (zEquals && !A0q() && (u10 = this.A0G) != null) {
                u10.ABs();
            }
            QR qr = this.A0R;
            if (qr != null) {
                qr.A0U();
                this.A0e.A09();
                return;
            }
            return;
        }
        if (this.A0R != null) {
            C1419aS c1419aSA0y = A0y();
            String[] strArr3 = A0m;
            if (strArr3[7].length() != strArr3[5].length()) {
                String[] strArr4 = A0m;
                strArr4[7] = "USSBWMStI3ylD2K7nffeYBb";
                strArr4[5] = "raKwme25MGMDEpiUbEFBbTJ";
                if (c1419aSA0y != null) {
                    strA0W = c1419aSA0y.A0G();
                } else {
                    strA0W = A0W(0, 0, 21);
                }
            } else {
                String[] strArr5 = A0m;
                strArr5[0] = "bG4PdUDVMluUNyK8pZyXt2dq2VQBZyfQ";
                strArr5[2] = "sHMyAJzOe9OYyidAIXRm3TyTiII6Suie";
                if (c1419aSA0y != null) {
                    strA0W = c1419aSA0y.A0G();
                } else {
                    strA0W = A0W(0, 0, 21);
                }
            }
            this.A0e.A0C(this.A0c, strA0W);
            this.A0R.A0V();
        }
        U6 u11 = this.A0G;
        String[] strArr6 = A0m;
        if (strArr6[4].length() != strArr6[6].length()) {
            String[] strArr7 = A0m;
            strArr7[0] = "FypWWsEn8bqXdPqUiIsc7hG8qhiMqauF";
            strArr7[2] = "IXlSBRmtDoTZUwhzIwgkgymkT50eT72S";
            if (u11 == null) {
                return;
            }
        } else if (u11 == null) {
            return;
        }
        if (!z11) {
            return;
        }
        JD jdA01 = JD.A01(AdErrorType.BROKEN_MEDIA_ERROR, A0W(93, 21, 63));
        A11().A0E().A2h(LF.A01(this.A00), jdA01.A03().getErrorCode(), jdA01.A04());
        this.A0G.AB6(jdA01);
    }

    public final boolean A1d() {
        return this.A07 == null;
    }

    @Override // com.facebook.ads.redexgen.X.J9
    public final int A6V() {
        View view = this.A06;
        if (view instanceof AdNativeComponentView) {
            View videoView = ((AdNativeComponentView) view).getAdContentsView();
            if (videoView instanceof PW) {
                return ((PW) videoView).getCurrentPosition();
            }
            return -1;
        }
        return -1;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final NativeAdBase.NativeAdLoadConfigBuilder buildLoadAdConfig(NativeAdBase nativeAdBase) {
        return new J7(this, nativeAdBase);
    }

    @Override // com.facebook.ads.Ad
    public final void destroy() {
        JR.A05(A0W(553, 7, 7), A0W(363, 19, 23), A0W(13, 8, 89));
        if (IN.A1W(this.A0c)) {
            A11().A0A().AFo(this.A03);
        }
        if (!A0q()) {
            this.A0c.A0E().A2o();
        }
        C0845Em c0845Em = this.A0A;
        if (c0845Em != null) {
            c0845Em.A0T(true);
            this.A0A = null;
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void downloadMedia() {
        if (this.A0E.equals(EnumC0955Iv.A05)) {
            this.A08 = AnonymousClass10.A04;
        }
        this.A0E = EnumC0955Iv.A04;
        A0h(this.A0a, false);
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdBodyText() {
        return A0G(true).A0J();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdCallToAction() {
        return A0G(true).A0X();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesImageUrl() {
        if (getAdChoicesIcon() == null) {
            return null;
        }
        J1 adChoicesIcon = getAdChoicesIcon();
        String[] strArr = A0m;
        if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[7] = "MRTmAh7YnfwjJHGdoro5GGF";
        strArr2[5] = "5NAjexdbITBZf7E7VHPXfXw";
        return adChoicesIcon.getUrl();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesLinkUrl() {
        return A0F().A0K();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdChoicesText() {
        return A0F().A0L();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdHeadline() {
        return A0G(true).A0M();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdLinkDescription() {
        return A0G(true).A0N();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdSocialContext() {
        return A0G(true).A0R();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdTranslation() {
        return A0G(true).A0U();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdUntrimmedBodyText() {
        return A0G(true).A0V();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getAdvertiserName() {
        return A0G(true).A0W();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final float getAspectRatio() {
        C1419aS c1419aS = this.A0a;
        if (c1419aS != null) {
            AnonymousClass12 anonymousClass12A0E = c1419aS.A0E();
            String[] strArr = A0m;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "Gk0JtmCCXYpL8dPDyrRdSPBqQO7pSw2M";
            strArr2[3] = "hZFl2ZrFl9W40ZKmdwMt57qcTxbjzHrP";
            J1 nativeAdImage = anonymousClass12A0E.A0F();
            if (nativeAdImage != null) {
                int width = nativeAdImage.getWidth();
                int height = nativeAdImage.getHeight();
                return height > 0 ? width / height : StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
            }
        }
        return StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getId() {
        if (!isAdLoaded()) {
            return null;
        }
        String str = this.A0h;
        String[] strArr = A0m;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0m;
        strArr2[7] = "iawtn5ImZtHDfKUJHK1ePg9";
        strArr2[5] = "61vZsTsWUXSHOR043CjOsZn";
        return str;
    }

    @Override // com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A0g;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final Drawable getPreloadedIconViewDrawable() {
        J1 j1A0G;
        Bitmap bitmapA0M;
        C1419aS adapter = this.A0a;
        if (adapter != null && (j1A0G = A0F().A0G()) != null && (bitmapA0M = this.A0b.A0M(j1A0G.getUrl())) != null) {
            C1337Xw c1337XwA11 = A11();
            boolean zA1d = A1d();
            String[] strArr = A0m;
            if (strArr[0].charAt(5) == strArr[2].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[4] = "5rXv1LFjMRKkpcU7";
            strArr2[6] = "SFgDKFOuseBk";
            return A05(c1337XwA11, bitmapA0M, zA1d, A1C());
        }
        return null;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getPromotedTranslation() {
        return A0G(true).A0Q();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final String getSponsoredTranslation() {
        return A0G(true).A0S();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean hasCallToAction() {
        C1419aS c1419aS = this.A0a;
        return c1419aS != null && c1419aS.A0S();
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean zA0A = true;
        C0845Em c0845Em = this.A0A;
        if (c0845Em != null) {
            zA0A = c0845Em.A0U();
        } else {
            C1379Zo c1379Zo = this.A0B;
            String[] strArr = A0m;
            if (strArr[1].charAt(16) == strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[7] = "v5uFzvuQ32LyebguaenlI2Y";
            strArr2[5] = "nsJGpwd0QPZOfVeZMyNRGWR";
            if (c1379Zo != null) {
                zA0A = c1379Zo.A0A();
            }
        }
        this.A0c.A0E().A4n(zA0A);
        return zA0A;
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final boolean isAdLoaded() {
        C1419aS c1419aS = this.A0a;
        return c1419aS != null && c1419aS.A0T();
    }

    @Override // com.facebook.ads.Ad
    public final void loadAd() {
        JR.A05(A0W(560, 6, 14), A0W(382, 24, 98), A0W(5, 8, 76));
        A1V(EnumC0955Iv.A00(NativeAdBase.MediaCacheFlag.ALL), null, new C6U(false, -1, -1));
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void loadAd(NativeAdBase.NativeLoadAdConfig nativeLoadAdConfig) {
        JR.A05(A0W(560, 6, 14), A0W(382, 24, 98), A0W(21, 8, 126));
        ((J7) nativeLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void onCtaBroadcast() {
        View view = this.A05;
        if (view != null) {
            view.performClick();
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        View view = this.A04;
        if (view != null) {
            view.post(new UI(this));
        }
        String str = A0W(164, 16, 64) + L6.A03(this.A0c, th);
        A11().A0E().A2h(LF.A01(this.A00), AdError.INTERNAL_ERROR_CODE, str);
        U6 u10 = this.A0G;
        if (u10 != null) {
            u10.AB6(new JD(AdError.INTERNAL_ERROR_CODE, str));
        }
    }

    @Override // com.facebook.ads.Ad
    public final void setExtraHints(ExtraHints extraHints) {
        if (extraHints == null) {
            return;
        }
        A0n(extraHints.getHints());
        this.A0T = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.A02 = onTouchListener;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    @Override // com.facebook.ads.internal.api.NativeAdBaseApi
    public final void unregisterView() {
        ME me2;
        PA pa2 = this.A0N;
        if (pa2 != null) {
            ViewParent parent = pa2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(pa2);
            }
            this.A0N = null;
        }
        if (this.A04 == null || this.A06 == null) {
            return;
        }
        if (!A0q()) {
            C0S c0sA0E = this.A0c.A0E();
            String[] strArr = A0m;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0m;
            strArr2[1] = "cYEHlIHF7Qe4IYNxEGisZavvdYqfT1NQ";
            strArr2[3] = "IvkWoeS5LcA5RnG3xI5yLmU1spuVl7qW";
            c0sA0E.unregisterView();
        }
        C1337Xw c1337Xw = this.A0c;
        String[] strArr3 = A0m;
        if (strArr3[1].charAt(16) != strArr3[3].charAt(16)) {
            String[] strArr4 = A0m;
            strArr4[0] = "MOnirYFFQGBOpDM1usFuy9dITQXNjsmg";
            strArr4[2] = "BENjy9ISBGpLCtRbprsy2gYEceZw0rIm";
            if (IN.A1W(c1337Xw)) {
                A11().A0A().AFo(this.A03);
            }
        } else if (IN.A1W(c1337Xw)) {
            A11().A0A().AFo(this.A03);
        }
        WeakHashMap<View, WeakReference<U7>> weakHashMap = A0o;
        if (weakHashMap.containsKey(this.A04) && weakHashMap.get(this.A04).get() == this) {
            View view = this.A04;
            boolean z10 = view instanceof ViewGroup;
            String[] strArr5 = A0m;
            if (strArr5[4].length() != strArr5[6].length()) {
                String[] strArr6 = A0m;
                strArr6[0] = "lVWmVGygxw0UbRbggHe19cSptvLLteak";
                strArr6[2] = "yD1YSLWVotW9RM3Ng5RpEu8J61bKeSm7";
                if (z10) {
                    me2 = this.A0K;
                    if (me2 != null) {
                        ((ViewGroup) view).removeView(me2);
                        this.A0K = null;
                    }
                }
            } else if (z10) {
                me2 = this.A0K;
                if (me2 != null) {
                    ((ViewGroup) view).removeView(me2);
                    this.A0K = null;
                }
            }
            C1419aS c1419aS = this.A0a;
            if (c1419aS != null) {
                c1419aS.A0J();
            }
            if (Build.VERSION.SDK_INT >= 18 && this.A0L != null && IN.A11(this.A0c)) {
                this.A0L.A07();
                this.A04.getOverlay().remove(this.A0L);
            }
            weakHashMap.remove(this.A04);
            A0Z();
            this.A04 = null;
            this.A06 = null;
            QR qr = this.A0R;
            if (qr != null) {
                qr.A0V();
                this.A0R = null;
            }
            A0c();
            this.A09 = null;
            return;
        }
        throw new IllegalStateException(A0W(481, 38, 72));
    }
}
