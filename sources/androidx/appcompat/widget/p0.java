package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.inscode.autoclicker.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f1319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayoutCompat f1320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Spinner f1321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1322f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1323g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1326j;

    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f1320d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((b) p0.this.f1320d.getChildAt(i10)).f1328c;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view != null) {
                b bVar = (b) view;
                bVar.f1328c = ((b) p0.this.f1320d.getChildAt(i10)).f1328c;
                bVar.a();
                return view;
            }
            p0 p0Var = p0.this;
            androidx.appcompat.app.a.c cVar = ((b) p0Var.f1320d.getChildAt(i10)).f1328c;
            Objects.requireNonNull(p0Var);
            b bVar2 = p0Var.new b(p0Var.getContext(), cVar, true);
            bVar2.setBackgroundDrawable(null);
            bVar2.setLayoutParams(new AbsListView.LayoutParams(-1, p0Var.f1325i));
            return bVar2;
        }
    }

    public class b extends LinearLayout {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.app.a.c f1328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f1329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f1330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public View f1331f;

        public b(Context context, androidx.appcompat.app.a.c cVar, boolean z10) {
            int resourceId;
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.f1328c = cVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.actionBarTabStyle, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : e.a.b(context, resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
            if (z10) {
                setGravity(8388627);
            }
            a();
        }

        public void a() {
            androidx.appcompat.app.a.c cVar = this.f1328c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1331f = viewB;
                TextView textView = this.f1329d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1330e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1330e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1331f;
            if (view != null) {
                removeView(view);
                this.f1331f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1330e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1330e = appCompatImageView;
                }
                this.f1330e.setImageDrawable(drawableC);
                this.f1330e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1330e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1330e.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(charSequenceD);
            if (z10) {
                if (this.f1329d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1329d = appCompatTextView;
                }
                this.f1329d.setText(charSequenceD);
                this.f1329d.setVisibility(0);
            } else {
                TextView textView2 = this.f1329d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1329d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1330e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            b1.a(this, z10 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (p0.this.f1323g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = p0.this.f1323g;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1333a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1333a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1333a) {
                return;
            }
            Objects.requireNonNull(p0.this);
            p0.this.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            p0.this.setVisibility(0);
            this.f1333a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public p0(Context context) {
        super(context);
        new c();
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.a.f28459a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        layoutDimension = context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1324h = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f1320d = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final boolean a() {
        Spinner spinner = this.f1321e;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f1321e);
        addView(this.f1320d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1321e.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1319c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, d.a.f28459a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1324h = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1319c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((b) view).f1328c.e();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1320d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1323g = -1;
        } else {
            if (childCount > 2) {
                this.f1323g = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1323g = View.MeasureSpec.getSize(i10) / 2;
            }
            this.f1323g = Math.min(this.f1323g, this.f1324h);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1325i, 1073741824);
        if (!z10 && this.f1322f) {
            this.f1320d.measure(0, iMakeMeasureSpec);
            if (this.f1320d.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                Spinner spinner = this.f1321e;
                if (!(spinner != null && spinner.getParent() == this)) {
                    if (this.f1321e == null) {
                        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.f1321e = appCompatSpinner;
                    }
                    removeView(this.f1320d);
                    addView(this.f1321e, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f1321e.getAdapter() == null) {
                        this.f1321e.setAdapter((SpinnerAdapter) new a());
                    }
                    Runnable runnable = this.f1319c;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f1319c = null;
                    }
                    this.f1321e.setSelection(this.f1326j);
                }
            } else {
                a();
            }
        } else {
            a();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i10, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z10 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1326j);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1322f = z10;
    }

    public void setContentHeight(int i10) {
        this.f1325i = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1326j = i10;
        int childCount = this.f1320d.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1320d.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                View childAt2 = this.f1320d.getChildAt(i10);
                Runnable runnable = this.f1319c;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                o0 o0Var = new o0(this, childAt2);
                this.f1319c = o0Var;
                post(o0Var);
            }
            i11++;
        }
        Spinner spinner = this.f1321e;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
