package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f929k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CharSequence f930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f932n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f938t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f939u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f940v;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i.a f941c;

        public a(ActionBarContextView actionBarContextView, i.a aVar) {
            this.f941c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f941c.a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        super(context, attributeSet, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28462d, i10, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : e.a.b(context, resourceId);
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        p0.e0.d.q(this, drawable);
        this.f937s = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f938t = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f1144g = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f940v = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    public void f(i.a aVar) {
        View viewInflate;
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuPresenter actionMenuPresenter2;
        androidx.appcompat.view.menu.j jVar;
        androidx.appcompat.view.menu.j jVar2;
        View view = this.f931m;
        if (view != null) {
            if (view.getParent() == null) {
                viewInflate = this.f931m;
            }
            View viewFindViewById = this.f931m.findViewById(R.id.action_mode_close_button);
            this.f932n = viewFindViewById;
            viewFindViewById.setOnClickListener(new a(this, aVar));
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) aVar.c();
            actionMenuPresenter = this.f1143f;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.e();
            }
            ActionMenuPresenter actionMenuPresenter3 = new ActionMenuPresenter(getContext());
            this.f1143f = actionMenuPresenter3;
            actionMenuPresenter3.f972o = true;
            actionMenuPresenter3.f973p = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            eVar.addMenuPresenter(this.f1143f, this.f1141d);
            actionMenuPresenter2 = this.f1143f;
            jVar = actionMenuPresenter2.f803j;
            if (jVar == null) {
                androidx.appcompat.view.menu.j jVar3 = (androidx.appcompat.view.menu.j) actionMenuPresenter2.f799f.inflate(actionMenuPresenter2.f801h, (ViewGroup) this, false);
                actionMenuPresenter2.f803j = jVar3;
                jVar3.initialize(actionMenuPresenter2.f798e);
                actionMenuPresenter2.updateMenuView(true);
            }
            jVar2 = actionMenuPresenter2.f803j;
            if (jVar != jVar2) {
                ((ActionMenuView) jVar2).setPresenter(actionMenuPresenter2);
            }
            ActionMenuView actionMenuView = (ActionMenuView) jVar2;
            this.f1142e = actionMenuView;
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            p0.e0.d.q(actionMenuView, null);
            addView(this.f1142e, layoutParams);
        }
        viewInflate = LayoutInflater.from(getContext()).inflate(this.f940v, (ViewGroup) this, false);
        this.f931m = viewInflate;
        addView(viewInflate);
        View viewFindViewById2 = this.f931m.findViewById(R.id.action_mode_close_button);
        this.f932n = viewFindViewById2;
        viewFindViewById2.setOnClickListener(new a(this, aVar));
        androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) aVar.c();
        actionMenuPresenter = this.f1143f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.e();
        }
        ActionMenuPresenter actionMenuPresenter4 = new ActionMenuPresenter(getContext());
        this.f1143f = actionMenuPresenter4;
        actionMenuPresenter4.f972o = true;
        actionMenuPresenter4.f973p = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        eVar2.addMenuPresenter(this.f1143f, this.f1141d);
        actionMenuPresenter2 = this.f1143f;
        jVar = actionMenuPresenter2.f803j;
        if (jVar == null) {
            androidx.appcompat.view.menu.j jVar4 = (androidx.appcompat.view.menu.j) actionMenuPresenter2.f799f.inflate(actionMenuPresenter2.f801h, (ViewGroup) this, false);
            actionMenuPresenter2.f803j = jVar4;
            jVar4.initialize(actionMenuPresenter2.f798e);
            actionMenuPresenter2.updateMenuView(true);
        }
        jVar2 = actionMenuPresenter2.f803j;
        if (jVar != jVar2) {
            ((ActionMenuView) jVar2).setPresenter(actionMenuPresenter2);
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) jVar2;
        this.f1142e = actionMenuView2;
        WeakHashMap<View, p0.m0> weakHashMap2 = p0.e0.f34354a;
        p0.e0.d.q(actionMenuView2, null);
        addView(this.f1142e, layoutParams2);
    }

    public final void g() {
        if (this.f934p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f934p = linearLayout;
            this.f935q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f936r = (TextView) this.f934p.findViewById(R.id.action_bar_subtitle);
            if (this.f937s != 0) {
                this.f935q.setTextAppearance(getContext(), this.f937s);
            }
            if (this.f938t != 0) {
                this.f936r.setTextAppearance(getContext(), this.f938t);
            }
        }
        this.f935q.setText(this.f929k);
        this.f936r.setText(this.f930l);
        boolean z10 = !TextUtils.isEmpty(this.f929k);
        boolean z11 = !TextUtils.isEmpty(this.f930l);
        int i10 = 0;
        this.f936r.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f934p;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f934p.getParent() == null) {
            addView(this.f934p);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.b
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f930l;
    }

    public CharSequence getTitle() {
        return this.f929k;
    }

    public void h() {
        removeAllViews();
        this.f933o = null;
        this.f1142e = null;
        this.f1143f = null;
        View view = this.f932n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1143f;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.f();
            this.f1143f.g();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = g1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f931m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f931m.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = zB ? paddingRight - i14 : paddingRight + i14;
            int iD = i16 + d(this.f931m, i16, paddingTop, paddingTop2, zB);
            paddingRight = zB ? iD - i15 : iD + i15;
        }
        int iD2 = paddingRight;
        LinearLayout linearLayout = this.f934p;
        if (linearLayout != null && this.f933o == null && linearLayout.getVisibility() != 8) {
            iD2 += d(this.f934p, iD2, paddingTop, paddingTop2, zB);
        }
        int i17 = iD2;
        View view2 = this.f933o;
        if (view2 != null) {
            d(view2, i17, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1142e;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f1144g;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f931m;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f931m.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1142e;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f1142e, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f934p;
        if (linearLayout != null && this.f933o == null) {
            if (this.f939u) {
                this.f934p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f934p.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f934p.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f933o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f933o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f1144g <= 0) {
            int childCount = getChildCount();
            size2 = 0;
            for (int i16 = 0; i16 < childCount; i16++) {
                int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > size2) {
                    size2 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // androidx.appcompat.widget.b
    public void setContentHeight(int i10) {
        this.f1144g = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f933o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f933o = view;
        if (view != null && (linearLayout = this.f934p) != null) {
            removeView(linearLayout);
            this.f934p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f930l = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f929k = charSequence;
        g();
        p0.e0.r(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f939u) {
            requestLayout();
        }
        this.f939u = z10;
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
