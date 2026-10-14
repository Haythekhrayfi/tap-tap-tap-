package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f1140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionMenuView f1142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionMenuPresenter f1143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p0.m0 f1145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1147j;

    public class a implements p0.n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1148a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1149b;

        public a() {
        }

        @Override // p0.n0
        public void a(View view) {
            this.f1148a = true;
        }

        @Override // p0.n0
        public void b(View view) {
            if (this.f1148a) {
                return;
            }
            b bVar = b.this;
            bVar.f1145h = null;
            b.super.setVisibility(this.f1149b);
        }

        @Override // p0.n0
        public void c(View view) {
            b.super.setVisibility(0);
            this.f1148a = false;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1140c = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1141d = context;
        } else {
            this.f1141d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int d(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iA = androidx.appcompat.widget.a.a(i12, measuredHeight, 2, i11);
        if (z10) {
            view.layout(i10 - measuredWidth, iA, i10, measuredHeight + iA);
        } else {
            view.layout(i10, iA, i10 + measuredWidth, measuredHeight + iA);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public p0.m0 e(int i10, long j10) {
        p0.m0 m0Var = this.f1145h;
        if (m0Var != null) {
            m0Var.b();
        }
        if (i10 != 0) {
            p0.m0 m0VarB = p0.e0.b(this);
            m0VarB.a(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
            m0VarB.c(j10);
            a aVar = this.f1140c;
            b.this.f1145h = m0VarB;
            aVar.f1149b = i10;
            View view = m0VarB.f34395a.get();
            if (view != null) {
                m0VarB.e(view, aVar);
            }
            return m0VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        p0.m0 m0VarB2 = p0.e0.b(this);
        m0VarB2.a(1.0f);
        m0VarB2.c(j10);
        a aVar2 = this.f1140c;
        b.this.f1145h = m0VarB2;
        aVar2.f1149b = i10;
        View view2 = m0VarB2.f34395a.get();
        if (view2 != null) {
            m0VarB2.e(view2, aVar2);
        }
        return m0VarB2;
    }

    public int getAnimatedVisibility() {
        return this.f1145h != null ? this.f1140c.f1149b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1144g;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, d.a.f28459a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1143f;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f797d.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
                i10 = 5;
            } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
                i10 = 4;
            } else {
                i10 = i11 >= 360 ? 3 : 2;
            }
            actionMenuPresenter.f976s = i10;
            androidx.appcompat.view.menu.e eVar = actionMenuPresenter.f798e;
            if (eVar != null) {
                eVar.onItemsChanged(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1147j = false;
        }
        if (!this.f1147j) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1147j = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1147j = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1146i = false;
        }
        if (!this.f1146i) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f1146i = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1146i = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            p0.m0 m0Var = this.f1145h;
            if (m0Var != null) {
                m0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
