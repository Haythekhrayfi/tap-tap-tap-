package com.yandex.metrica.impl.ob;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1989tl {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final List<Class> f17475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final List<Class> f17476m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeSet<Float> f17477a = new TreeSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<El> f17478b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1541bl f17479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<Fl> f17480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<Rk> f17481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1766km f17482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Tk f17483g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final C1542bm f17484h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1592dm f17485i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Xl f17486j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C1816mm f17487k;

    static {
        ArrayList arrayList = new ArrayList();
        f17475l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f17476m = arrayList2;
        arrayList.add(ListView.class);
        arrayList.add(GridView.class);
        a(arrayList, "androidx.recyclerview.widget.RecyclerView");
        a(arrayList, "androidx.viewpager.widget.ViewPager");
        a(arrayList, "androidx.viewpager2.widget.ViewPager2");
        a(arrayList2, "androidx.coordinatorlayout.widget.CoordinatorLayout");
        a(arrayList2, "androidx.drawerlayout.widget.DrawerLayout");
        a(arrayList2, "androidx.slidingpanelayout.widget.SlidingPaneLayout");
        a(arrayList2, "androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        a(arrayList2, "androidx.core.widget.NestedScrollView");
        a(arrayList2, "androidx.constraintlayout.widget.ConstraintLayout");
        a(arrayList2, "androidx.appcompat.widget.ContentFrameLayout");
        arrayList2.add(AbsoluteLayout.class);
        arrayList2.add(FrameLayout.class);
        arrayList2.add(LinearLayout.class);
        arrayList2.add(RelativeLayout.class);
        arrayList2.add(TableLayout.class);
        arrayList2.add(ScrollView.class);
        arrayList2.add(GridLayout.class);
    }

    public C1989tl(C1542bm c1542bm, C1766km c1766km, Tk tk, C1541bl c1541bl, List<Fl> list, List<Rk> list2, C1592dm c1592dm, Xl xl, C1816mm c1816mm) {
        this.f17484h = c1542bm;
        this.f17482f = c1766km;
        this.f17483g = tk;
        this.f17479c = c1541bl;
        this.f17480d = list;
        this.f17481e = list2;
        this.f17485i = c1592dm;
        this.f17486j = xl;
        this.f17487k = c1816mm;
    }

    private Wl a(TextView textView, String str, String str2, int i10, boolean z10, Wl.a aVar) throws Throwable {
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        El.b bVar;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        CharSequence text = textView.getText();
        String string = text == null ? "" : text.toString();
        boolean z11 = textView.getVisibility() == 0;
        try {
            DisplayMetrics displayMetrics = textView.getContext().getResources().getDisplayMetrics();
            fValueOf = Float.valueOf(textView.getTextSize());
            try {
                fValueOf2 = Float.valueOf(fValueOf.floatValue() / displayMetrics.density);
                try {
                    fValueOf3 = Float.valueOf(fValueOf.floatValue() / displayMetrics.scaledDensity);
                } catch (Throwable unused) {
                    fValueOf3 = null;
                }
            } catch (Throwable unused2) {
                fValueOf2 = null;
            }
        } catch (Throwable unused3) {
            fValueOf = null;
            fValueOf2 = null;
        }
        Float f10 = fValueOf;
        Float f11 = fValueOf2;
        if (f10 != null && this.f17484h.f15850e) {
            this.f17477a.add(f10);
        }
        int iA = this.f17482f.a(textView);
        TextUtils.TruncateAt ellipsize = textView.getEllipsize();
        if (ellipsize == null) {
            bVar = El.b.NONE;
        } else {
            int i11 = El.a.f13939a[ellipsize.ordinal()];
            if (i11 == 1) {
                bVar = El.b.START;
            } else if (i11 == 2) {
                bVar = El.b.END;
            } else if (i11 != 3) {
                bVar = i11 != 4 ? El.b.UNKNOWN : El.b.MARQUEE;
            } else {
                bVar = El.b.MIDDLE;
            }
        }
        El.b bVar2 = bVar;
        Typeface typeface = textView.getTypeface();
        if (typeface == null && !U2.a(20)) {
            typeface = Typeface.create(Typeface.DEFAULT, 0);
        }
        if (typeface != null) {
            boolValueOf = Boolean.valueOf(typeface.isBold());
            boolValueOf2 = Boolean.valueOf(typeface.isItalic());
        } else {
            boolValueOf = null;
            boolValueOf2 = null;
        }
        El el = new El(str, str2, null, i10, z10, aVar, string, f10, f11, fValueOf3, Integer.toHexString(textView.getCurrentTextColor()), boolValueOf, boolValueOf2, z11, iA, bVar2);
        Iterator<Rk> it = this.f17481e.iterator();
        while (it.hasNext()) {
            it.next().a(el);
        }
        this.f17478b.add(el);
        return el;
    }

    private C1939rl a(Wl wl, View view, int i10) {
        Wl.a aVar;
        Wl.b bVarA;
        Wl.b bVar;
        Wl.b bVarA2;
        String name = view.getClass().getName();
        boolean z10 = wl != null && (wl.f15409e || wl.f15411g == Wl.a.LIST);
        String hexString = Integer.toHexString(view.getId());
        Wl.c cVar = view instanceof ViewGroup ? Wl.c.VIEW_CONTAINER : Wl.c.VIEW;
        if (a(f17475l, view)) {
            aVar = Wl.a.LIST;
        } else if (view instanceof ImageView) {
            aVar = Wl.a.IMAGE;
        } else if (view instanceof WebView) {
            aVar = Wl.a.WEBVIEW;
        } else if (a(f17476m, view)) {
            aVar = Wl.a.CONTAINER;
        } else if (view instanceof Button) {
            aVar = Wl.a.BUTTON;
        } else {
            boolean z11 = view instanceof TextView;
            if (z11 && ((TextView) view).getInputType() != 0) {
                aVar = Wl.a.INPUT;
            } else {
                if (U2.a(21) ? view instanceof Toolbar : false) {
                    aVar = Wl.a.TOOLBAR;
                } else {
                    aVar = (z11 && ((TextView) view).getInputType() == 0) ? Wl.a.LABEL : Wl.a.OTHER;
                }
            }
        }
        Wl.a aVar2 = aVar;
        Wl wlA = null;
        if (view instanceof TextView) {
            try {
                TextView textView = (TextView) view;
                Iterator<Fl> it = this.f17480d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bVarA = null;
                        break;
                    }
                    Fl next = it.next();
                    if (next.a(textView)) {
                        bVarA = next.a();
                        break;
                    }
                    this.f17485i.a("ui_parsing_text_view", th);
                    bVar = bVarA;
                }
                if (bVarA == null) {
                    try {
                        CharSequence text = textView.getText();
                        bVarA2 = this.f17479c.a(text == null ? null : text.toString());
                    } catch (Throwable th) {
                        th = th;
                    }
                } else {
                    bVarA2 = bVarA;
                }
                if (bVarA2 == null) {
                    try {
                        wlA = a(textView, name, hexString, i10, z10, aVar2);
                    } catch (Throwable th2) {
                        th = th2;
                        bVarA = bVarA2;
                        this.f17485i.a("ui_parsing_text_view", th);
                        bVar = bVarA;
                    }
                }
                bVar = bVarA2;
            } catch (Throwable th3) {
                th = th3;
                bVarA = null;
            }
        } else if (view instanceof WebView) {
            WebView webView = (WebView) view;
            C1841nm c1841nm = new C1841nm(name, hexString, null, i10, z10);
            C1816mm c1816mm = this.f17487k;
            Objects.requireNonNull(c1816mm);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            try {
                webView.post(new RunnableC1791lm(c1816mm, c1841nm, webView, countDownLatch));
                countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
            bVar = null;
            wlA = c1841nm;
        } else {
            bVar = null;
        }
        if (wlA == null) {
            wlA = new Wl(name, hexString, bVar, i10, z10, cVar, aVar2);
        }
        Wl wl2 = wlA;
        this.f17483g.a(wl2);
        return new C1939rl(wl2);
    }

    private static void a(List<Class> list, String str) {
        Class clsB = B2.b(str);
        if (clsB != null) {
            list.add(clsB);
        }
    }

    private boolean a(List<Class> list, View view) {
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public List<View> a(View view, int i10) {
        ArrayList arrayList = new ArrayList();
        try {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(this.f17483g.a(i10), viewGroup.getChildCount());
                for (int i11 = 0; i11 < iMin; i11++) {
                    arrayList.add(viewGroup.getChildAt(i11));
                }
            }
        } catch (Throwable th) {
            this.f17485i.a("ui_parsing_children", th);
        }
        return arrayList;
    }

    public TreeSet<Float> a() {
        return this.f17477a;
    }

    public C1939rl b(Wl wl, View view, int i10) {
        try {
            if (this.f17486j.a(view)) {
                return null;
            }
            return a(wl, view, i10);
        } catch (Throwable th) {
            this.f17485i.a("ui_parsing_view", th);
            return null;
        }
    }

    public final List<El> b() {
        return this.f17478b;
    }
}
