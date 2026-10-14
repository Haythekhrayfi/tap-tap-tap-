package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.f0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.b f768f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f0 f769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f774l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f775m;

    public class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.f0
        public j.f b() {
            b bVar = ActionMenuItemView.this.f770h;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0
        public boolean c() {
            j.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f768f;
            return bVar != null && bVar.a(actionMenuItemView.f765c) && (fVarB = b()) != null && fVarB.a();
        }
    }

    public static abstract class b {
        public abstract j.f a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f771i = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.f28461c, i10, 0);
        this.f773k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f775m = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f774l = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return e() && this.f765c.getIcon() == null;
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f765c;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f766d);
        if (this.f767e != null) {
            if (!((this.f765c.f881y & 4) == 4) || (!this.f771i && !this.f772j)) {
                z10 = false;
            }
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f766d : null);
        CharSequence charSequence = this.f765c.f873q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z12 ? null : this.f765c.f861e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f765c.f874r;
        if (TextUtils.isEmpty(charSequence2)) {
            b1.a(this, z12 ? null : this.f765c.f861e);
        } else {
            b1.a(this, charSequence2);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void initialize(g gVar, int i10) {
        this.f765c = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f857a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f769g == null) {
            this.f769g = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f768f;
        if (bVar != null) {
            bVar.a(this.f765c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f771i = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zE = e();
        if (zE && (i12 = this.f774l) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f773k) : this.f773k;
        if (mode != 1073741824 && this.f773k > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zE || this.f767e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f767e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.f765c.hasSubMenu() && (f0Var = this.f769g) != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f772j != z10) {
            this.f772j = z10;
            g gVar = this.f765c;
            if (gVar != null) {
                gVar.f870n.onItemActionRequestChanged(gVar);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f767e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f775m;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(e.b bVar) {
        this.f768f = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f774l = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f770h = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f766d = charSequence;
        i();
    }
}
