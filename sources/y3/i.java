package y3;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class i<T extends View, Z> extends y3.a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f38055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f38056c;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Integer f38057e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f38058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<g> f38059b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ViewTreeObserverOnPreDrawListenerC0465a f38061d;

        /* JADX INFO: renamed from: y3.i$a$a, reason: collision with other inner class name */
        public static final class ViewTreeObserverOnPreDrawListenerC0465a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final WeakReference<a> f38062c;

            public ViewTreeObserverOnPreDrawListenerC0465a(a aVar) {
                this.f38062c = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f38062c.get();
                if (aVar == null || aVar.f38059b.isEmpty()) {
                    return true;
                }
                int iD = aVar.d();
                int iC = aVar.c();
                if (!aVar.e(iD, iC)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f38059b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).b(iD, iC);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.f38058a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.f38058a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f38061d);
            }
            this.f38061d = null;
            this.f38059b.clear();
        }

        public final int b(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f38060c && this.f38058a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f38058a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.f38058a.getContext();
            if (f38057e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f38057e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f38057e.intValue();
        }

        public final int c() {
            int paddingBottom = this.f38058a.getPaddingBottom() + this.f38058a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f38058a.getLayoutParams();
            return b(this.f38058a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int d() {
            int paddingRight = this.f38058a.getPaddingRight() + this.f38058a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f38058a.getLayoutParams();
            return b(this.f38058a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final boolean e(int i10, int i11) {
            if (i10 > 0 || i10 == Integer.MIN_VALUE) {
                return i11 > 0 || i11 == Integer.MIN_VALUE;
            }
            return false;
        }
    }

    public i(T t10) {
        Objects.requireNonNull(t10, "Argument must not be null");
        this.f38055b = t10;
        this.f38056c = new a(t10);
    }

    @Override // y3.h
    public void a(g gVar) throws Throwable {
        a aVar = this.f38056c;
        int iD = aVar.d();
        int iC = aVar.c();
        if (aVar.e(iD, iC)) {
            ((x3.g) gVar).b(iD, iC);
            return;
        }
        if (!aVar.f38059b.contains(gVar)) {
            aVar.f38059b.add(gVar);
        }
        if (aVar.f38061d == null) {
            ViewTreeObserver viewTreeObserver = aVar.f38058a.getViewTreeObserver();
            a.ViewTreeObserverOnPreDrawListenerC0465a viewTreeObserverOnPreDrawListenerC0465a = new a.ViewTreeObserverOnPreDrawListenerC0465a(aVar);
            aVar.f38061d = viewTreeObserverOnPreDrawListenerC0465a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0465a);
        }
    }

    @Override // y3.a, y3.h
    public void d(x3.b bVar) {
        this.f38055b.setTag(bVar);
    }

    @Override // y3.h
    public void e(g gVar) {
        this.f38056c.f38059b.remove(gVar);
    }

    @Override // y3.a, y3.h
    public void f(Drawable drawable) {
    }

    @Override // y3.a, y3.h
    public x3.b g() {
        Object tag = this.f38055b.getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof x3.b) {
            return (x3.b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // y3.a, y3.h
    public void h(Drawable drawable) {
        this.f38056c.a();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Target for: ");
        sbA.append(this.f38055b);
        return sbA.toString();
    }

    @Deprecated
    public i(T t10, boolean z10) {
        this(t10);
        if (z10) {
            this.f38056c.f38060c = true;
        }
    }
}
