package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.e.b, androidx.appcompat.view.menu.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f996f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionMenuPresenter f997g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.appcompat.view.menu.i.a f998h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.view.menu.e.a f999i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f1004n;

    public interface a {
        boolean b();

        boolean c();
    }

    public static class b implements androidx.appcompat.view.menu.i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public boolean a(androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }
    }

    public static class c extends LinearLayoutCompat.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f1007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f1009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1010f;

        public c(int i10, int i11) {
            super(i10, i11);
            this.f1005a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f1005a = cVar.f1005a;
        }
    }

    public class d implements androidx.appcompat.view.menu.e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean zOnMenuItemSelected;
            e eVar2 = ActionMenuView.this.f1004n;
            if (eVar2 != null) {
                Toolbar.a aVar = (Toolbar.a) eVar2;
                if (Toolbar.this.mMenuHostHelper.d(menuItem)) {
                    zOnMenuItemSelected = true;
                } else {
                    Toolbar.h hVar = Toolbar.this.mOnMenuItemClickListener;
                    zOnMenuItemSelected = hVar != null ? androidx.appcompat.app.v.this.f708b.onMenuItemSelected(0, menuItem) : false;
                }
                if (zOnMenuItemSelected) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f999i;
            if (aVar != null) {
                aVar.onMenuModeChange(eVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f1002l = (int) (56.0f * f10);
        this.f1003m = (int) (f10 * 4.0f);
        this.f994d = context;
        this.f995e = 0;
    }

    public static int g(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.e();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (!cVar.f1005a && z11) {
            z10 = true;
        }
        cVar.f1008d = z10;
        cVar.f1006b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.f993c.performItemAction(gVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public boolean f(int i10) {
        boolean zB = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zB = false | ((a) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zB : zB | ((a) childAt2).c();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f993c == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f993c = eVar;
            eVar.setCallback(new d());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f997g = actionMenuPresenter;
            actionMenuPresenter.f972o = true;
            actionMenuPresenter.f973p = true;
            androidx.appcompat.view.menu.i.a bVar = this.f998h;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter.f800g = bVar;
            this.f993c.addMenuPresenter(actionMenuPresenter, this.f994d);
            ActionMenuPresenter actionMenuPresenter2 = this.f997g;
            actionMenuPresenter2.f803j = this;
            this.f993c = actionMenuPresenter2.f798e;
        }
        return this.f993c;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f997g;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f969l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f971n) {
            return actionMenuPresenter.f970m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f995e;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public void initialize(androidx.appcompat.view.menu.e eVar) {
        this.f993c = eVar;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f997g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.f997g.h()) {
                this.f997g.f();
                this.f997g.i();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f997g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.e();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.f1000j) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = g1.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1005a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    f(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1005a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1005a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax + i27;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        ?? r10;
        androidx.appcompat.view.menu.e eVar;
        boolean z11 = this.f1000j;
        boolean z12 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f1000j = z12;
        if (z11 != z12) {
            this.f1001k = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f1000j && (eVar = this.f993c) != null && size != this.f1001k) {
            this.f1001k = size;
            eVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (!this.f1000j || childCount <= 0) {
            for (int i13 = 0; i13 < childCount; i13++) {
                c cVar = (c) getChildAt(i13).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i14 = size2 - paddingRight;
        int i15 = this.f1002l;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = (i17 / i16) + i15;
        int childCount2 = getChildCount();
        int i19 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i20 = 0;
        int i21 = 0;
        boolean z13 = false;
        long j10 = 0;
        while (i21 < childCount2) {
            View childAt = getChildAt(i21);
            int i22 = size3;
            int i23 = i14;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i24 = i19 + 1;
                if (z14) {
                    int i25 = this.f1003m;
                    r10 = 0;
                    childAt.setPadding(i25, 0, i25, 0);
                } else {
                    r10 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f1010f = r10;
                cVar2.f1007c = r10;
                cVar2.f1006b = r10;
                cVar2.f1008d = r10;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = r10;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = r10;
                cVar2.f1009e = z14 && ((ActionMenuItemView) childAt).e();
                int iG = g(childAt, i18, cVar2.f1005a ? 1 : i16, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iG);
                if (cVar2.f1008d) {
                    i20++;
                }
                if (cVar2.f1005a) {
                    z13 = true;
                }
                i16 -= iG;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iG == 1) {
                    j10 |= (long) (1 << i21);
                }
                i19 = i24;
            }
            i21++;
            size3 = i22;
            i14 = i23;
        }
        int i26 = i14;
        int i27 = size3;
        boolean z15 = z13 && i19 == 2;
        boolean z16 = false;
        while (true) {
            if (i20 <= 0 || i16 <= 0) {
                i12 = iMax;
                z10 = z16;
                break;
            }
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j11 = 0;
            while (i29 < childCount2) {
                int i31 = iMax;
                c cVar3 = (c) getChildAt(i29).getLayoutParams();
                boolean z17 = z16;
                if (cVar3.f1008d) {
                    int i32 = cVar3.f1006b;
                    if (i32 < i28) {
                        j11 = 1 << i29;
                        i28 = i32;
                        i30 = 1;
                    } else if (i32 == i28) {
                        i30++;
                        j11 |= 1 << i29;
                    }
                }
                i29++;
                z16 = z17;
                iMax = i31;
            }
            i12 = iMax;
            z10 = z16;
            j10 |= j11;
            if (i30 > i16) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                c cVar4 = (c) childAt2.getLayoutParams();
                int i35 = i20;
                long j12 = 1 << i34;
                if ((j11 & j12) == 0) {
                    if (cVar4.f1006b == i33) {
                        j10 |= j12;
                    }
                    z15 = z15;
                } else {
                    if (z15 && cVar4.f1009e && i16 == 1) {
                        int i36 = this.f1003m;
                        childAt2.setPadding(i36 + i18, 0, i36, 0);
                    }
                    cVar4.f1006b++;
                    cVar4.f1010f = true;
                    i16--;
                }
                i34++;
                i20 = i35;
                z15 = z15;
            }
            iMax = i12;
            z16 = true;
        }
        boolean z18 = !z13 && i19 == 1;
        if (i16 > 0 && j10 != 0 && (i16 < i19 - 1 || z18 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j10);
            if (!z18) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1009e) {
                    fBitCount -= 0.5f;
                }
                int i37 = childCount2 - 1;
                if ((j10 & ((long) (1 << i37))) != 0 && !((c) getChildAt(i37).getLayoutParams()).f1009e) {
                    fBitCount -= 0.5f;
                }
            }
            int i38 = fBitCount > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? (int) ((i16 * i18) / fBitCount) : 0;
            for (int i39 = 0; i39 < childCount2; i39++) {
                if ((j10 & ((long) (1 << i39))) != 0) {
                    View childAt3 = getChildAt(i39);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f1007c = i38;
                        cVar5.f1010f = true;
                        if (i39 == 0 && !cVar5.f1009e) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i38) / 2;
                        }
                        z10 = true;
                    } else if (cVar5.f1005a) {
                        cVar5.f1007c = i38;
                        cVar5.f1010f = true;
                        ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i38) / 2;
                        z10 = true;
                    } else {
                        if (i39 != 0) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = i38 / 2;
                        }
                        if (i39 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = i38 / 2;
                        }
                    }
                }
            }
        }
        if (z10) {
            for (int i40 = 0; i40 < childCount2; i40++) {
                View childAt4 = getChildAt(i40);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f1010f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f1006b * i18) + cVar6.f1007c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i26, mode != 1073741824 ? i12 : i27);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f997g.f977t = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1004n = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f997g;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f969l;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f971n = true;
            actionMenuPresenter.f970m = drawable;
        }
    }

    public void setOverflowReserved(boolean z10) {
        this.f996f = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f995e != i10) {
            this.f995e = i10;
            if (i10 == 0) {
                this.f994d = getContext();
            } else {
                this.f994d = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f997g = actionMenuPresenter;
        actionMenuPresenter.f803j = this;
        this.f993c = actionMenuPresenter.f798e;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
