package i8;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends androidx.recyclerview.widget.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k8.a f31312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<d> f31313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f31314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0.a f31315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31316e;

    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            fd.j0.i(view, "view");
            c.this.f31312a.getViewTreeObserver().addOnGlobalLayoutListener(c.this.f31314c);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            fd.j0.i(view, "view");
            c.this.f31312a.getViewTreeObserver().removeOnGlobalLayoutListener(c.this.f31314c);
            c.this.a();
        }
    }

    public static final class b implements k8.b.a {
        public b() {
        }

        @Override // k8.b.a
        public boolean a() {
            c cVar = c.this;
            if (!cVar.f31316e) {
                return false;
            }
            cVar.b(cVar.f31312a);
            cVar.a();
            return true;
        }
    }

    /* JADX INFO: renamed from: i8.c$c, reason: collision with other inner class name */
    public final class C0311c extends androidx.recyclerview.widget.a0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f31319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0311c(c cVar) {
            super(cVar);
            fd.j0.i(cVar, "this$0");
            this.f31319c = cVar;
        }

        @Override // androidx.recyclerview.widget.a0.a, p0.a
        public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
            fd.j0.i(view, "host");
            fd.j0.i(cVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            cVar.f34746a.setClassName(((vc.e) vc.b0.a(Button.class)).b());
            view.setImportantForAccessibility(this.f31319c.f31316e ? 1 : 4);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<View> f31320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f31321b;

        public d(WeakReference<View> weakReference, int i10) {
            fd.j0.i(weakReference, "view");
            this.f31320a = weakReference;
            this.f31321b = i10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k8.a aVar) {
        super(aVar);
        fd.j0.i(aVar, "recyclerView");
        this.f31312a = aVar;
        this.f31313b = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: i8.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c cVar = this.f31309c;
                fd.j0.i(cVar, "this$0");
                if (cVar.f31316e) {
                    if (cVar.f31312a.getVisibility() == 0) {
                        return;
                    }
                    cVar.a();
                }
            }
        };
        this.f31314c = onGlobalLayoutListener;
        if (aVar.isAttachedToWindow()) {
            aVar.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        aVar.addOnAttachStateChangeListener(new a());
        int i10 = 0;
        int childCount = aVar.getChildCount();
        if (childCount > 0) {
            while (true) {
                int i11 = i10 + 1;
                View childAt = aVar.getChildAt(i10);
                fd.j0.h(childAt, "getChildAt(index)");
                childAt.setImportantForAccessibility(this.f31316e ? 1 : 4);
                if (i11 >= childCount) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f31312a.setOnBackClickListener(new b());
    }

    public final void a() {
        d(false);
        for (d dVar : this.f31313b) {
            View view = dVar.f31320a.get();
            if (view != null) {
                view.setImportantForAccessibility(dVar.f31321b);
            }
        }
        this.f31313b.clear();
    }

    public final void b(View view) {
        View child;
        if ((view instanceof u8.g) && (child = ((u8.g) view).getChild()) != null) {
            view = child;
        }
        view.performAccessibilityAction(64, null);
        view.sendAccessibilityEvent(1);
    }

    public final void c(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null || fd.j0.d(viewGroup, viewGroup2.getRootView())) {
            return;
        }
        for (View view : (p0.i0.a) p0.i0.b(viewGroup2)) {
            if (!fd.j0.d(view, viewGroup) && view.getImportantForAccessibility() != 4) {
                this.f31313b.add(new d(new WeakReference(view), view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
        c(viewGroup2);
    }

    public final void d(boolean z10) {
        if (this.f31316e == z10) {
            return;
        }
        this.f31316e = z10;
        k8.a aVar = this.f31312a;
        int i10 = 0;
        int childCount = aVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            View childAt = aVar.getChildAt(i10);
            fd.j0.h(childAt, "getChildAt(index)");
            childAt.setImportantForAccessibility(this.f31316e ? 1 : 4);
            if (i11 >= childCount) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a0
    public p0.a getItemDelegate() {
        p0.a aVar = this.f31315d;
        if (aVar != null) {
            return aVar;
        }
        C0311c c0311c = new C0311c(this);
        this.f31315d = c0311c;
        return c0311c;
    }

    @Override // androidx.recyclerview.widget.a0, p0.a
    public void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        fd.j0.i(view, "host");
        fd.j0.i(cVar, "info");
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.f34746a.setClassName(((vc.e) vc.b0.a(this.f31316e ? RecyclerView.class : Button.class)).b());
        cVar.f34746a.addAction(16);
        cVar.f34746a.setClickable(true);
        cVar.f34746a.setImportantForAccessibility(true);
        if (Build.VERSION.SDK_INT >= 28) {
            cVar.f34746a.setScreenReaderFocusable(true);
        } else {
            cVar.l(1, true);
        }
        k8.a aVar = this.f31312a;
        int i10 = 0;
        int childCount = aVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        while (true) {
            int i11 = i10 + 1;
            View childAt = aVar.getChildAt(i10);
            fd.j0.h(childAt, "getChildAt(index)");
            childAt.setImportantForAccessibility(this.f31316e ? 1 : 4);
            if (i11 >= childCount) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    @Override // androidx.recyclerview.widget.a0, p0.a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        boolean z10;
        Object obj;
        int iA;
        fd.j0.i(view, "host");
        if (i10 == 16) {
            d(true);
            c(this.f31312a);
            dd.g<View> gVarB = p0.i0.b(this.f31312a);
            uc.l[] lVarArr = {i8.d.f31325c, e.f31328c};
            fd.j0.i(lVarArr, "selectors");
            fd.j0.i(gVarB, "<this>");
            p0.j0 j0Var = (p0.j0) ((p0.i0.a) gVarB).iterator();
            if (j0Var.hasNext()) {
                Object next = j0Var.next();
                while (j0Var.hasNext()) {
                    Object next2 = j0Var.next();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 2) {
                            iA = 0;
                            break;
                        }
                        uc.l lVar = lVarArr[i11];
                        iA = lc.a.a((Comparable) lVar.invoke(next), (Comparable) lVar.invoke(next2));
                        if (iA != 0) {
                            break;
                        }
                        i11++;
                    }
                    if (iA > 0) {
                        next = next2;
                    }
                }
                obj = next;
            } else {
                obj = null;
            }
            View view2 = (View) obj;
            if (view2 != null) {
                b(view2);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return super.performAccessibilityAction(view, i10, bundle) || z10;
    }
}
