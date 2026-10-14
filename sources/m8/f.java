package m8;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;
import com.inscode.autoclicker.R;
import fd.j0;
import i8.q0;
import java.util.List;
import java.util.Set;
import jc.g;
import jc.i;
import p0.h;
import p0.i0;
import x1.q;
import y9.g0;
import y9.k;
import y9.t;
import y9.t2;
import y9.u;

/* JADX INFO: loaded from: classes2.dex */
public interface f {

    public static final class a implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f f33309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f33310e;

        public a(int i10, f fVar, int i11) {
            this.f33308c = i10;
            this.f33309d = fVar;
            this.f33310e = i11;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            j0.i(view, "view");
            view.removeOnLayoutChangeListener(this);
            if (this.f33308c == 0) {
                RecyclerView view2 = this.f33309d.getView();
                int i18 = this.f33310e;
                view2.scrollBy(-i18, -i18);
                return;
            }
            this.f33309d.getView().scrollBy(-this.f33309d.getView().getScrollX(), -this.f33309d.getView().getScrollY());
            RecyclerView.o layoutManager = this.f33309d.getView().getLayoutManager();
            View viewFindViewByPosition = layoutManager == null ? null : layoutManager.findViewByPosition(this.f33308c);
            y yVarA = y.a(this.f33309d.getView().getLayoutManager(), this.f33309d.v());
            while (viewFindViewByPosition == null && (this.f33309d.getView().canScrollVertically(1) || this.f33309d.getView().canScrollHorizontally(1))) {
                RecyclerView.o layoutManager2 = this.f33309d.getView().getLayoutManager();
                if (layoutManager2 != null) {
                    layoutManager2.requestLayout();
                }
                RecyclerView.o layoutManager3 = this.f33309d.getView().getLayoutManager();
                viewFindViewByPosition = layoutManager3 == null ? null : layoutManager3.findViewByPosition(this.f33308c);
                if (viewFindViewByPosition != null) {
                    break;
                } else {
                    this.f33309d.getView().scrollBy(this.f33309d.getView().getWidth(), this.f33309d.getView().getHeight());
                }
            }
            if (viewFindViewByPosition == null) {
                return;
            }
            int iE = (yVarA.e(viewFindViewByPosition) - yVarA.k()) - this.f33310e;
            ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
            int iC = iE + (layoutParams instanceof ViewGroup.MarginLayoutParams ? h.c((ViewGroup.MarginLayoutParams) layoutParams) : 0);
            this.f33309d.getView().scrollBy(iC, iC);
        }
    }

    static /* synthetic */ void d(f fVar, View view, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if ((i14 & 32) != 0) {
            z10 = false;
        }
        fVar.c(view, i10, i11, i12, i13, z10);
    }

    static /* synthetic */ void t(f fVar, View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        fVar.r(view, z10);
    }

    t2 a();

    void b(int i10, int i11);

    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    default void c(View view, int i10, int i11, int i12, int i13, boolean z10) {
        Object objF;
        int measuredWidth;
        int measuredHeight;
        u uVarB;
        t2.h hVarB;
        t tVarB;
        t2.h hVarB2;
        j0.i(view, "child");
        try {
            i.a aVar = i.f31813c;
            List<k> listP = p();
            Object tag = view.getTag(R.id.div_gallery_item_index);
            if (tag == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            objF = listP.get(((Integer) tag).intValue()).a();
            i.a aVar2 = i.f31813c;
            if (objF instanceof i.b) {
                objF = null;
            }
            g0 g0Var = (g0) objF;
            v9.d expressionResolver = j().getExpressionResolver();
            v9.b<t2.h> bVar = a().f42715i;
            int iV = v();
            if ((iV == 1 && view.getMeasuredWidth() == 0) || (iV == 0 && view.getMeasuredHeight() == 0)) {
                g(view, i10, i11, i12, i13);
                if (z10) {
                    return;
                }
                m().add(view);
                return;
            }
            if (iV != 1) {
                measuredWidth = 0;
            } else {
                v9.b<t> bVarK = g0Var == null ? null : g0Var.k();
                if (bVarK == null || (tVarB = bVarK.b(expressionResolver)) == null) {
                    hVarB2 = null;
                } else {
                    int i14 = e.f33306b[tVarB.ordinal()];
                    if (i14 == 1) {
                        hVarB2 = t2.h.START;
                    } else if (i14 == 2) {
                        hVarB2 = t2.h.CENTER;
                    } else {
                        if (i14 != 3) {
                            throw new g();
                        }
                        hVarB2 = t2.h.END;
                    }
                }
                if (hVarB2 == null) {
                    hVarB2 = bVar.b(expressionResolver);
                }
                measuredWidth = ((getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight()) - (i12 - i10);
                int i15 = e.f33305a[hVarB2.ordinal()];
                if (i15 == 1) {
                    measuredWidth = 0;
                } else if (i15 == 2) {
                    measuredWidth /= 2;
                } else if (i15 != 3) {
                    throw new g();
                }
            }
            if (iV != 0) {
                measuredHeight = 0;
            } else {
                v9.b<u> bVarO = g0Var == null ? null : g0Var.o();
                if (bVarO == null || (uVarB = bVarO.b(expressionResolver)) == null) {
                    hVarB = null;
                } else {
                    int i16 = e.f33307c[uVarB.ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        hVarB = t2.h.START;
                    } else if (i16 == 3) {
                        hVarB = t2.h.CENTER;
                    } else {
                        if (i16 != 4) {
                            throw new g();
                        }
                        hVarB = t2.h.END;
                    }
                }
                if (hVarB == null) {
                    hVarB = bVar.b(expressionResolver);
                }
                measuredHeight = ((getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom()) - (i13 - i11);
                int i17 = e.f33305a[hVarB.ordinal()];
                if (i17 == 1) {
                    measuredHeight = 0;
                } else if (i17 == 2) {
                    measuredHeight /= 2;
                } else if (i17 != 3) {
                    throw new g();
                }
            }
            g(view, i10 + measuredWidth, i11 + measuredHeight, i12 + measuredWidth, i13 + measuredHeight);
            t(this, view, false, 2, null);
            if (z10) {
                return;
            }
            m().remove(view);
        } catch (Throwable th) {
            i.a aVar3 = i.f31813c;
            objF = h9.d.f(th);
        }
    }

    int e();

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
    
        if (r6 == Integer.MAX_VALUE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0032, code lost:
    
        if (r6 == Integer.MAX_VALUE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return u1.a.m(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default int f(int r2, int r3, int r4, int r5, int r6, boolean r7) {
        /*
            r1 = this;
            int r2 = r2 - r4
            r4 = 0
            if (r2 >= 0) goto L5
            r2 = r4
        L5:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < 0) goto Ld
            if (r5 > r0) goto Ld
            r4 = 1
        Ld:
            if (r4 == 0) goto L14
            int r2 = u1.a.n(r5)
            goto L47
        L14:
            r4 = -1
            if (r5 != r4) goto L21
            if (r7 == 0) goto L1c
            if (r3 != 0) goto L1c
            goto L43
        L1c:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            goto L47
        L21:
            r4 = -2
            if (r5 != r4) goto L27
            if (r6 != r0) goto L35
            goto L43
        L27:
            r4 = -3
            if (r5 != r4) goto L43
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L3a
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L3a
            if (r6 != r0) goto L35
            goto L43
        L35:
            int r2 = u1.a.m(r6)
            goto L47
        L3a:
            int r2 = java.lang.Math.min(r2, r6)
            int r2 = u1.a.m(r2)
            goto L47
        L43:
            int r2 = u1.a.p()
        L47:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.f.f(int, int, int, int, int, boolean):int");
    }

    void g(View view, int i10, int i11, int i12, int i13);

    RecyclerView getView();

    void h(int i10);

    default void i(int i10, int i11) {
        RecyclerView view = getView();
        if (!q.k(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(i10, this, i11));
            return;
        }
        if (i10 == 0) {
            int i12 = -i11;
            getView().scrollBy(i12, i12);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.o layoutManager = getView().getLayoutManager();
        View viewFindViewByPosition = layoutManager == null ? null : layoutManager.findViewByPosition(i10);
        y yVarA = y.a(getView().getLayoutManager(), v());
        while (viewFindViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.o layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.requestLayout();
            }
            RecyclerView.o layoutManager3 = getView().getLayoutManager();
            viewFindViewByPosition = layoutManager3 == null ? null : layoutManager3.findViewByPosition(i10);
            if (viewFindViewByPosition != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (viewFindViewByPosition == null) {
            return;
        }
        int iE = (yVarA.e(viewFindViewByPosition) - yVarA.k()) - i11;
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        int iC = iE + (layoutParams instanceof ViewGroup.MarginLayoutParams ? h.c((ViewGroup.MarginLayoutParams) layoutParams) : 0);
        getView().scrollBy(iC, iC);
    }

    i8.k j();

    int k(View view);

    int l();

    Set<View> m();

    default void n(RecyclerView.v vVar) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            View childAt = view.getChildAt(i10);
            j0.h(childAt, "getChildAt(index)");
            r(childAt, true);
            if (i11 >= childCount) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    default void o(RecyclerView recyclerView, RecyclerView.v vVar) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            View childAt = recyclerView.getChildAt(i10);
            j0.h(childAt, "getChildAt(index)");
            r(childAt, true);
            if (i11 >= childCount) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    List<k> p();

    int q();

    default void r(View view, boolean z10) {
        j0.i(view, "child");
        int iK = k(view);
        if (iK == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        dd.g<View> gVarB = i0.b(viewGroup);
        j0.i(gVarB, "<this>");
        p0.j0 j0Var = (p0.j0) ((i0.a) gVarB).iterator();
        View view2 = (View) (j0Var.hasNext() ? j0Var.next() : null);
        if (view2 == null) {
            return;
        }
        k kVar = p().get(iK);
        if (z10) {
            q0 q0VarD = ((r7.a.b) j().getDiv2Component$div_release()).d();
            j0.h(q0VarD, "divView.div2Component.visibilityActionTracker");
            q0VarD.d(j(), null, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
            j().G(view2);
            return;
        }
        q0 q0VarD2 = ((r7.a.b) j().getDiv2Component$div_release()).d();
        j0.h(q0VarD2, "divView.div2Component.visibilityActionTracker");
        q0VarD2.d(j(), view2, kVar, (8 & 8) != 0 ? l8.b.A(kVar.a()) : null);
        j().p(view2, kVar);
    }

    default void s(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount <= 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            View childAt = recyclerView.getChildAt(i10);
            j0.h(childAt, "getChildAt(index)");
            t(this, childAt, false, 2, null);
            if (i11 >= childCount) {
                return;
            } else {
                i10 = i11;
            }
        }
    }

    default void u(RecyclerView.z zVar) {
        for (View view : m()) {
            c(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        m().clear();
    }

    int v();
}
