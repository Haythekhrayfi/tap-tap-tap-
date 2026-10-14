package u1;

import android.R;
import android.app.Activity;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfe;
import com.google.android.gms.internal.play_billing.zzff;
import com.google.android.gms.internal.play_billing.zzfh;
import com.google.android.gms.internal.play_billing.zzfj;
import com.google.android.material.snackbar.Snackbar;
import fd.j0;
import java.util.Arrays;
import java.util.Iterator;
import jc.g;
import m9.d;
import o8.e;
import o8.f;
import o8.i;
import o8.j;
import o8.k;
import o8.m;
import o8.n;
import o8.o;
import o8.r;
import o8.s;
import o8.t;
import o8.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.format.DateTimeFormat;
import p0.i0;
import r1.l;
import r1.p;
import r9.b;
import y9.e8;
import y9.f5;
import y9.n6;
import y9.o1;
import y9.s6;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String a(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            sb2.append(th.getMessage());
            th = th.getCause();
            if (th == null) {
                String string = sb2.toString();
                j0.h(string, "result.toString()");
                return string;
            }
            sb2.append('\n');
        }
    }

    public static final String b(e8 e8Var) {
        if (e8Var instanceof e8.a) {
            return ((e8.a) e8Var).f39902c.f38964a;
        }
        if (e8Var instanceof e8.f) {
            return ((e8.f) e8Var).f39906c.f42671a;
        }
        if (e8Var instanceof e8.g) {
            return ((e8.g) e8Var).f39907c.f43375a;
        }
        if (e8Var instanceof e8.h) {
            return ((e8.h) e8Var).f39908c.f43836a;
        }
        if (e8Var instanceof e8.b) {
            return ((e8.b) e8Var).f39903c.f39724a;
        }
        if (e8Var instanceof e8.i) {
            return ((e8.i) e8Var).f39909c.f44574a;
        }
        if (e8Var instanceof e8.e) {
            return ((e8.e) e8Var).f39905c.f40074a;
        }
        throw new g();
    }

    public static final ViewGroup.LayoutParams c(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 != null) {
            layoutParams.width = layoutParams2.width;
            layoutParams.height = layoutParams2.height;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
                marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
                marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
                marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
                if (marginLayoutParams2.isMarginRelative()) {
                    marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                    marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
                }
            }
            if ((layoutParams instanceof d) && (layoutParams2 instanceof d)) {
                d dVar = (d) layoutParams;
                d dVar2 = (d) layoutParams2;
                dVar.f33331h = dVar2.f33331h;
                dVar.f33330g = dVar2.f33330g;
            }
        }
        return layoutParams;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    public static final b d(s6.e eVar, DisplayMetrics displayMetrics, y7.a aVar, v9.d dVar) {
        int iU;
        Number numberValueOf;
        f5 f5Var;
        float fX;
        f5 f5Var2;
        float fX2;
        o1 o1Var;
        o1 o1Var2;
        long jLongValue = eVar.f42637a.b(dVar).longValue();
        n6 n6VarB = eVar.f42638b.b(dVar);
        j0.i(n6VarB, "unit");
        int i10 = l8.b.a.f32255a[n6VarB.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iU = l8.b.Q(Long.valueOf(jLongValue), displayMetrics);
            } else {
                if (i10 != 3) {
                    throw new g();
                }
                numberValueOf = Long.valueOf(jLongValue);
            }
            float fFloatValue = numberValueOf.floatValue();
            Typeface typefaceD = l8.b.D(eVar.f42639c.b(dVar), aVar);
            f5Var = eVar.f42640d;
            if (f5Var == null && (o1Var2 = f5Var.f39960a) != null) {
                fX = l8.b.X(o1Var2, displayMetrics, dVar);
            } else {
                fX = 0.0f;
            }
            f5Var2 = eVar.f42640d;
            if (f5Var2 == null && (o1Var = f5Var2.f39961b) != null) {
                fX2 = l8.b.X(o1Var, displayMetrics, dVar);
            } else {
                fX2 = 0.0f;
            }
            return new b(fFloatValue, typefaceD, fX, fX2, eVar.f42641e.b(dVar).intValue());
        }
        iU = l8.b.u(Long.valueOf(jLongValue), displayMetrics);
        numberValueOf = Integer.valueOf(iU);
        float fFloatValue2 = numberValueOf.floatValue();
        Typeface typefaceD2 = l8.b.D(eVar.f42639c.b(dVar), aVar);
        f5Var = eVar.f42640d;
        if (f5Var == null) {
            fX = 0.0f;
        } else {
            fX = l8.b.X(o1Var2, displayMetrics, dVar);
        }
        f5Var2 = eVar.f42640d;
        if (f5Var2 == null) {
            fX2 = 0.0f;
        } else {
            fX2 = l8.b.X(o1Var, displayMetrics, dVar);
        }
        return new b(fFloatValue2, typefaceD2, fX, fX2, eVar.f42641e.b(dVar).intValue());
    }

    public static void e(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final String f(DateTime dateTime) {
        String strPrint = DateTimeFormat.forPattern("dd.MM.yyyy HH:mm:ss ").print(dateTime);
        j0.h(strPrint, "forPattern(SHORT_DATE_TI…\n            .print(this)");
        return strPrint;
    }

    public static <T extends View> T g(View view, int i10) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            T t10 = (T) viewGroup.getChildAt(i11).findViewById(i10);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    public static final boolean h(int i10) {
        return View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE;
    }

    public static final boolean i(int i10) {
        return View.MeasureSpec.getMode(i10) == 1073741824;
    }

    public static boolean j(Uri uri) {
        return uri != null && AppLovinEventTypes.USER_VIEWED_CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean k(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static final boolean l(int i10) {
        return View.MeasureSpec.getMode(i10) == 0;
    }

    public static final int m(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
    }

    public static final int n(int i10) {
        return View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
    }

    public static final Snackbar o(Activity activity, int i10, int i11) {
        j0.i(activity, "<this>");
        Snackbar snackbarMake = Snackbar.make(activity.findViewById(R.id.content), activity.getString(i10), i11);
        j0.h(snackbarMake, "make(\n        this.findV…(textResId), length\n    )");
        return snackbarMake;
    }

    public static final int p() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public static final String q(long j10) {
        long j11 = 60;
        String str = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j10 / ((long) DateTimeConstants.MILLIS_PER_HOUR)) % ((long) 24)), Long.valueOf((j10 / ((long) DateTimeConstants.MILLIS_PER_MINUTE)) % j11), Long.valueOf((j10 / ((long) 1000)) % j11)}, 3));
        j0.h(str, "format(format, *args)");
        return str;
    }

    public static final void r(p pVar, Iterable<? extends l> iterable) {
        Iterator<? extends l> it = iterable.iterator();
        while (it.hasNext()) {
            pVar.b(it.next());
        }
    }

    public static void s(Activity activity, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        j0.i(activity, "<this>");
        Snackbar.make(activity.findViewById(R.id.content), activity.getString(i10), i11).show();
    }

    public static void t(Activity activity, String str, int i10, int i11) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        j0.i(str, "text");
        Snackbar.make(activity.findViewById(R.id.content), str, i10).show();
    }

    public static final void u(t tVar, View view) {
        j0.i(tVar, "<this>");
        j0.i(view, "view");
        if (view instanceof u) {
            tVar.p((u) view);
            Iterator<View> it = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                u(tVar, it.next());
            }
            return;
        }
        if (view instanceof o8.d) {
            tVar.b((o8.d) view);
            Iterator<View> it2 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it2.hasNext()) {
                u(tVar, it2.next());
            }
            return;
        }
        if (view instanceof f) {
            tVar.d((f) view);
            Iterator<View> it3 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it3.hasNext()) {
                u(tVar, it3.next());
            }
            return;
        }
        if (view instanceof j) {
            tVar.g((j) view);
            Iterator<View> it4 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it4.hasNext()) {
                u(tVar, it4.next());
            }
            return;
        }
        if (view instanceof o8.l) {
            tVar.i((o8.l) view);
            Iterator<View> it5 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it5.hasNext()) {
                u(tVar, it5.next());
            }
            return;
        }
        if (view instanceof m) {
            tVar.j((m) view);
            Iterator<View> it6 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it6.hasNext()) {
                u(tVar, it6.next());
            }
            return;
        }
        if (view instanceof r) {
            tVar.n((r) view);
            Iterator<View> it7 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it7.hasNext()) {
                u(tVar, it7.next());
            }
            return;
        }
        if (view instanceof t9.t) {
            tVar.q((t9.t) view);
            Iterator<View> it8 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it8.hasNext()) {
                u(tVar, it8.next());
            }
            return;
        }
        if (view instanceof o) {
            tVar.l((o) view);
            return;
        }
        if (view instanceof e) {
            tVar.c((e) view);
            return;
        }
        if (view instanceof o8.g) {
            tVar.e((o8.g) view);
            return;
        }
        if (view instanceof i) {
            tVar.f((i) view);
            return;
        }
        if (view instanceof k) {
            tVar.h((k) view);
            return;
        }
        if (view instanceof o8.p) {
            tVar.m((o8.p) view);
            return;
        }
        if (view instanceof n) {
            tVar.k((n) view);
            return;
        }
        if (view instanceof s) {
            tVar.o((s) view);
            return;
        }
        tVar.a(view);
        if (view instanceof ViewGroup) {
            Iterator<View> it9 = ((i0.a) i0.b((ViewGroup) view)).iterator();
            while (it9.hasNext()) {
                u(tVar, it9.next());
            }
        }
    }

    public static final f8.a v(y9.k kVar) {
        j0.i(kVar, "<this>");
        return new f8.a(kVar);
    }

    public static zzfb w(int i10, int i11, com.android.billingclient.api.n nVar) {
        zzfa zzfaVarZzv = zzfb.zzv();
        zzfh zzfhVarZzv = zzfj.zzv();
        zzfhVarZzv.zzj(nVar.f3848a);
        zzfhVarZzv.zzi(nVar.f3849b);
        zzfhVarZzv.zzk(i10);
        zzfaVarZzv.zzi(zzfhVarZzv);
        zzfaVarZzv.zzk(i11);
        return (zzfb) zzfaVarZzv.zzc();
    }

    public static zzff x(int i10) {
        zzfe zzfeVarZzv = zzff.zzv();
        zzfeVarZzv.zzj(i10);
        return (zzff) zzfeVarZzv.zzc();
    }
}
