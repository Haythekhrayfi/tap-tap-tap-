package p0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0 f34403b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f34404a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f34405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f34406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f34407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f34408d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f34405a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f34406b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f34407c = declaredField3;
                declaredField3.setAccessible(true);
                f34408d = true;
            } catch (ReflectiveOperationException e10) {
                StringBuilder sbA = defpackage.a.a("Failed to get visible insets from AttachInfo ");
                sbA.append(e10.getMessage());
                Log.w("WindowInsetsCompat", sbA.toString(), e10);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f34409a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            this.f34409a = i10 >= 30 ? new e() : i10 >= 29 ? new d() : new c();
        }

        public b(s0 s0Var) {
            int i10 = Build.VERSION.SDK_INT;
            this.f34409a = i10 >= 30 ? new e(s0Var) : i10 >= 29 ? new d(s0Var) : new c(s0Var);
        }

        public s0 a() {
            return this.f34409a.b();
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static Field f34410d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static boolean f34411e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Constructor<WindowInsets> f34412f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static boolean f34413g;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WindowInsets f34414b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h0.g f34415c;

        public c() {
            this.f34414b = e();
        }

        public c(s0 s0Var) {
            super(s0Var);
            this.f34414b = s0Var.i();
        }

        public static WindowInsets e() {
            if (!f34411e) {
                try {
                    f34410d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f34411e = true;
            }
            Field field = f34410d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f34413g) {
                try {
                    f34412f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f34413g = true;
            }
            Constructor<WindowInsets> constructor = f34412f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // p0.s0.f
        public s0 b() {
            a();
            s0 s0VarJ = s0.j(this.f34414b);
            s0VarJ.f34404a.q(null);
            s0VarJ.f34404a.t(this.f34415c);
            return s0VarJ;
        }

        @Override // p0.s0.f
        public void c(h0.g gVar) {
            this.f34415c = gVar;
        }

        @Override // p0.s0.f
        public void d(h0.g gVar) {
            WindowInsets windowInsets = this.f34414b;
            if (windowInsets != null) {
                this.f34414b = windowInsets.replaceSystemWindowInsets(gVar.f30459a, gVar.f30460b, gVar.f30461c, gVar.f30462d);
            }
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsets.Builder f34416b;

        public d() {
            this.f34416b = new WindowInsets.Builder();
        }

        public d(s0 s0Var) {
            super(s0Var);
            WindowInsets windowInsetsI = s0Var.i();
            this.f34416b = windowInsetsI != null ? new WindowInsets.Builder(windowInsetsI) : new WindowInsets.Builder();
        }

        @Override // p0.s0.f
        public s0 b() {
            a();
            s0 s0VarJ = s0.j(this.f34416b.build());
            s0VarJ.f34404a.q(null);
            return s0VarJ;
        }

        @Override // p0.s0.f
        public void c(h0.g gVar) {
            this.f34416b.setStableInsets(gVar.d());
        }

        @Override // p0.s0.f
        public void d(h0.g gVar) {
            this.f34416b.setSystemWindowInsets(gVar.d());
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(s0 s0Var) {
            super(s0Var);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f34417a;

        public f() {
            this(new s0((s0) null));
        }

        public f(s0 s0Var) {
            this.f34417a = s0Var;
        }

        public final void a() {
        }

        public s0 b() {
            throw null;
        }

        public void c(h0.g gVar) {
            throw null;
        }

        public void d(h0.g gVar) {
            throw null;
        }
    }

    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f34418h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f34419i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class<?> f34420j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f34421k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f34422l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f34423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public h0.g[] f34424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h0.g f34425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public s0 f34426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public h0.g f34427g;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f34425e = null;
            this.f34423c = windowInsets;
        }

        public g(s0 s0Var, g gVar) {
            this(s0Var, new WindowInsets(gVar.f34423c));
        }

        @SuppressLint({"PrivateApi"})
        public static void y() {
            try {
                f34419i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f34420j = cls;
                f34421k = cls.getDeclaredField("mVisibleInsets");
                f34422l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f34421k.setAccessible(true);
                f34422l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder sbA = defpackage.a.a("Failed to get visible insets. (Reflection error). ");
                sbA.append(e10.getMessage());
                Log.e("WindowInsetsCompat", sbA.toString(), e10);
            }
            f34418h = true;
        }

        @Override // p0.s0.l
        public void d(View view) {
            h0.g gVarX = x(view);
            if (gVarX == null) {
                gVarX = h0.g.f30458e;
            }
            r(gVarX);
        }

        @Override // p0.s0.l
        public void e(s0 s0Var) {
            s0Var.f34404a.s(this.f34426f);
            s0Var.f34404a.r(this.f34427g);
        }

        @Override // p0.s0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f34427g, ((g) obj).f34427g);
            }
            return false;
        }

        @Override // p0.s0.l
        public h0.g g(int i10) {
            return u(i10, false);
        }

        @Override // p0.s0.l
        public h0.g h(int i10) {
            return u(i10, true);
        }

        @Override // p0.s0.l
        public final h0.g l() {
            if (this.f34425e == null) {
                this.f34425e = h0.g.b(this.f34423c.getSystemWindowInsetLeft(), this.f34423c.getSystemWindowInsetTop(), this.f34423c.getSystemWindowInsetRight(), this.f34423c.getSystemWindowInsetBottom());
            }
            return this.f34425e;
        }

        @Override // p0.s0.l
        public s0 n(int i10, int i11, int i12, int i13) {
            b bVar = new b(s0.j(this.f34423c));
            bVar.f34409a.d(s0.g(l(), i10, i11, i12, i13));
            bVar.f34409a.c(s0.g(j(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // p0.s0.l
        public boolean p() {
            return this.f34423c.isRound();
        }

        @Override // p0.s0.l
        public void q(h0.g[] gVarArr) {
            this.f34424d = gVarArr;
        }

        @Override // p0.s0.l
        public void r(h0.g gVar) {
            this.f34427g = gVar;
        }

        @Override // p0.s0.l
        public void s(s0 s0Var) {
            this.f34426f = s0Var;
        }

        @SuppressLint({"WrongConstant"})
        public final h0.g u(int i10, boolean z10) {
            h0.g gVarA = h0.g.f30458e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    gVarA = h0.g.a(gVarA, v(i11, z10));
                }
            }
            return gVarA;
        }

        public h0.g v(int i10, boolean z10) {
            h0.g gVarJ;
            int i11;
            if (i10 == 1) {
                return z10 ? h0.g.b(0, Math.max(w().f30460b, l().f30460b), 0, 0) : h0.g.b(0, l().f30460b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    h0.g gVarW = w();
                    h0.g gVarJ2 = j();
                    return h0.g.b(Math.max(gVarW.f30459a, gVarJ2.f30459a), 0, Math.max(gVarW.f30461c, gVarJ2.f30461c), Math.max(gVarW.f30462d, gVarJ2.f30462d));
                }
                h0.g gVarL = l();
                s0 s0Var = this.f34426f;
                gVarJ = s0Var != null ? s0Var.f34404a.j() : null;
                int iMin = gVarL.f30462d;
                if (gVarJ != null) {
                    iMin = Math.min(iMin, gVarJ.f30462d);
                }
                return h0.g.b(gVarL.f30459a, 0, gVarL.f30461c, iMin);
            }
            if (i10 == 8) {
                h0.g[] gVarArr = this.f34424d;
                gVarJ = gVarArr != null ? gVarArr[m.a(8)] : null;
                if (gVarJ != null) {
                    return gVarJ;
                }
                h0.g gVarL2 = l();
                h0.g gVarW2 = w();
                int i12 = gVarL2.f30462d;
                if (i12 > gVarW2.f30462d) {
                    return h0.g.b(0, 0, 0, i12);
                }
                h0.g gVar = this.f34427g;
                return (gVar == null || gVar.equals(h0.g.f30458e) || (i11 = this.f34427g.f30462d) <= gVarW2.f30462d) ? h0.g.f30458e : h0.g.b(0, 0, 0, i11);
            }
            if (i10 == 16) {
                return k();
            }
            if (i10 == 32) {
                return i();
            }
            if (i10 == 64) {
                return m();
            }
            if (i10 != 128) {
                return h0.g.f30458e;
            }
            s0 s0Var2 = this.f34426f;
            p0.d dVarF = s0Var2 != null ? s0Var2.f34404a.f() : f();
            if (dVarF == null) {
                return h0.g.f30458e;
            }
            int i13 = Build.VERSION.SDK_INT;
            return h0.g.b(i13 >= 28 ? p0.d.a.d(dVarF.f34351a) : 0, i13 >= 28 ? p0.d.a.f(dVarF.f34351a) : 0, i13 >= 28 ? p0.d.a.e(dVarF.f34351a) : 0, i13 >= 28 ? p0.d.a.c(dVarF.f34351a) : 0);
        }

        public final h0.g w() {
            s0 s0Var = this.f34426f;
            return s0Var != null ? s0Var.f34404a.j() : h0.g.f30458e;
        }

        public final h0.g x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f34418h) {
                y();
            }
            Method method = f34419i;
            if (method != null && f34420j != null && f34421k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f34421k.get(f34422l.get(objInvoke));
                    if (rect != null) {
                        return h0.g.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    StringBuilder sbA = defpackage.a.a("Failed to get visible insets. (Reflection error). ");
                    sbA.append(e10.getMessage());
                    Log.e("WindowInsetsCompat", sbA.toString(), e10);
                }
            }
            return null;
        }
    }

    public static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public h0.g f34428m;

        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f34428m = null;
        }

        public h(s0 s0Var, h hVar) {
            super(s0Var, hVar);
            this.f34428m = null;
            this.f34428m = hVar.f34428m;
        }

        @Override // p0.s0.l
        public s0 b() {
            return s0.j(this.f34423c.consumeStableInsets());
        }

        @Override // p0.s0.l
        public s0 c() {
            return s0.j(this.f34423c.consumeSystemWindowInsets());
        }

        @Override // p0.s0.l
        public final h0.g j() {
            if (this.f34428m == null) {
                this.f34428m = h0.g.b(this.f34423c.getStableInsetLeft(), this.f34423c.getStableInsetTop(), this.f34423c.getStableInsetRight(), this.f34423c.getStableInsetBottom());
            }
            return this.f34428m;
        }

        @Override // p0.s0.l
        public boolean o() {
            return this.f34423c.isConsumed();
        }

        @Override // p0.s0.l
        public void t(h0.g gVar) {
            this.f34428m = gVar;
        }
    }

    public static class i extends h {
        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public i(s0 s0Var, i iVar) {
            super(s0Var, iVar);
        }

        @Override // p0.s0.l
        public s0 a() {
            return s0.j(this.f34423c.consumeDisplayCutout());
        }

        @Override // p0.s0.g, p0.s0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f34423c, iVar.f34423c) && Objects.equals(this.f34427g, iVar.f34427g);
        }

        @Override // p0.s0.l
        public p0.d f() {
            DisplayCutout displayCutout = this.f34423c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new p0.d(displayCutout);
        }

        @Override // p0.s0.l
        public int hashCode() {
            return this.f34423c.hashCode();
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public h0.g f34429n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public h0.g f34430o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public h0.g f34431p;

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f34429n = null;
            this.f34430o = null;
            this.f34431p = null;
        }

        public j(s0 s0Var, j jVar) {
            super(s0Var, jVar);
            this.f34429n = null;
            this.f34430o = null;
            this.f34431p = null;
        }

        @Override // p0.s0.l
        public h0.g i() {
            if (this.f34430o == null) {
                this.f34430o = h0.g.c(this.f34423c.getMandatorySystemGestureInsets());
            }
            return this.f34430o;
        }

        @Override // p0.s0.l
        public h0.g k() {
            if (this.f34429n == null) {
                this.f34429n = h0.g.c(this.f34423c.getSystemGestureInsets());
            }
            return this.f34429n;
        }

        @Override // p0.s0.l
        public h0.g m() {
            if (this.f34431p == null) {
                this.f34431p = h0.g.c(this.f34423c.getTappableElementInsets());
            }
            return this.f34431p;
        }

        @Override // p0.s0.g, p0.s0.l
        public s0 n(int i10, int i11, int i12, int i13) {
            return s0.j(this.f34423c.inset(i10, i11, i12, i13));
        }

        @Override // p0.s0.h, p0.s0.l
        public void t(h0.g gVar) {
        }
    }

    public static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final s0 f34432q = s0.j(WindowInsets.CONSUMED);

        public k(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        public k(s0 s0Var, k kVar) {
            super(s0Var, kVar);
        }

        @Override // p0.s0.g, p0.s0.l
        public final void d(View view) {
        }

        @Override // p0.s0.g, p0.s0.l
        public h0.g g(int i10) {
            return h0.g.c(this.f34423c.getInsets(n.a(i10)));
        }

        @Override // p0.s0.g, p0.s0.l
        public h0.g h(int i10) {
            return h0.g.c(this.f34423c.getInsetsIgnoringVisibility(n.a(i10)));
        }
    }

    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s0 f34433b = new b().a().f34404a.a().f34404a.b().a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f34434a;

        public l(s0 s0Var) {
            this.f34434a = s0Var;
        }

        public s0 a() {
            return this.f34434a;
        }

        public s0 b() {
            return this.f34434a;
        }

        public s0 c() {
            return this.f34434a;
        }

        public void d(View view) {
        }

        public void e(s0 s0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && o0.b.a(l(), lVar.l()) && o0.b.a(j(), lVar.j()) && o0.b.a(f(), lVar.f());
        }

        public p0.d f() {
            return null;
        }

        public h0.g g(int i10) {
            return h0.g.f30458e;
        }

        public h0.g h(int i10) {
            if ((i10 & 8) == 0) {
                return h0.g.f30458e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return o0.b.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public h0.g i() {
            return l();
        }

        public h0.g j() {
            return h0.g.f30458e;
        }

        public h0.g k() {
            return l();
        }

        public h0.g l() {
            return h0.g.f30458e;
        }

        public h0.g m() {
            return l();
        }

        public s0 n(int i10, int i11, int i12, int i13) {
            return f34433b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public void q(h0.g[] gVarArr) {
        }

        public void r(h0.g gVar) {
        }

        public void s(s0 s0Var) {
        }

        public void t(h0.g gVar) {
        }
    }

    public static final class m {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a("type needs to be >= FIRST and <= LAST, type=", i10));
        }
    }

    public static final class n {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        f34403b = Build.VERSION.SDK_INT >= 30 ? k.f34432q : l.f34433b;
    }

    public s0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f34404a = i10 >= 30 ? new k(this, windowInsets) : i10 >= 29 ? new j(this, windowInsets) : i10 >= 28 ? new i(this, windowInsets) : new h(this, windowInsets);
    }

    public s0(s0 s0Var) {
        if (s0Var == null) {
            this.f34404a = new l(this);
            return;
        }
        l lVar = s0Var.f34404a;
        int i10 = Build.VERSION.SDK_INT;
        this.f34404a = (i10 < 30 || !(lVar instanceof k)) ? (i10 < 29 || !(lVar instanceof j)) ? (i10 < 28 || !(lVar instanceof i)) ? lVar instanceof h ? new h(this, (h) lVar) : lVar instanceof g ? new g(this, (g) lVar) : new l(this) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    public static h0.g g(h0.g gVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, gVar.f30459a - i10);
        int iMax2 = Math.max(0, gVar.f30460b - i11);
        int iMax3 = Math.max(0, gVar.f30461c - i12);
        int iMax4 = Math.max(0, gVar.f30462d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? gVar : h0.g.b(iMax, iMax2, iMax3, iMax4);
    }

    public static s0 j(WindowInsets windowInsets) {
        return k(windowInsets, null);
    }

    public static s0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        s0 s0Var = new s0(windowInsets);
        if (view != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            if (e0.g.b(view)) {
                s0Var.f34404a.s(e0.j.a(view));
                s0Var.f34404a.d(view.getRootView());
            }
        }
        return s0Var;
    }

    @Deprecated
    public s0 a() {
        return this.f34404a.c();
    }

    public h0.g b(int i10) {
        return this.f34404a.g(i10);
    }

    @Deprecated
    public int c() {
        return this.f34404a.l().f30462d;
    }

    @Deprecated
    public int d() {
        return this.f34404a.l().f30459a;
    }

    @Deprecated
    public int e() {
        return this.f34404a.l().f30461c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return o0.b.a(this.f34404a, ((s0) obj).f34404a);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.f34404a.l().f30460b;
    }

    public boolean h() {
        return this.f34404a.o();
    }

    public int hashCode() {
        l lVar = this.f34404a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public WindowInsets i() {
        l lVar = this.f34404a;
        if (lVar instanceof g) {
            return ((g) lVar).f34423c;
        }
        return null;
    }
}
