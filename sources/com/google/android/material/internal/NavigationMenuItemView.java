package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.b1;
import g0.f;
import java.util.WeakHashMap;
import p0.a;
import p0.e0;
import p0.m0;
import q0.c;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements j.a {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final a accessibilityDelegate;
    private FrameLayout actionArea;
    public boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    private g itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // p0.a
            public void onInitializeAccessibilityNodeInfo(View view, c cVar) {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
                cVar.f34746a.setCheckable(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.material.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.material.R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        e0.q(checkedTextView, aVar);
    }

    private void adjustAppearance() {
        LinearLayoutCompat.a aVar;
        int i10;
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout == null) {
                return;
            }
            aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
            i10 = -1;
        } else {
            this.textView.setVisibility(0);
            FrameLayout frameLayout2 = this.actionArea;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            i10 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i10;
        this.actionArea.setLayoutParams(aVar);
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(com.google.android.material.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        g gVar = this.itemData;
        return gVar.f861e == null && gVar.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.itemData;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void initialize(g gVar, int i10) {
        this.itemData = gVar;
        int i11 = gVar.f857a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            StateListDrawable stateListDrawableCreateDefaultBackground = createDefaultBackground();
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.q(this, stateListDrawableCreateDefaultBackground);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f861e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f873q);
        b1.a(this, gVar.f874r);
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.itemData;
        if (gVar != null && gVar.isCheckable() && this.itemData.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.checkable != z10) {
            this.checkable = z10;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.textView.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                androidx.core.graphics.drawable.a.b.h(drawable, this.iconTintList);
            }
            int i10 = this.iconSize;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Resources resources = getResources();
                int i11 = com.google.android.material.R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = f.f29675a;
                Drawable drawableA = f.a.a(resources, i11, theme);
                this.emptyDrawable = drawableA;
                if (drawableA != null) {
                    int i12 = this.iconSize;
                    drawableA.setBounds(0, 0, i12, i12);
                }
            }
            drawable = this.emptyDrawable;
        }
        androidx.core.widget.j.b.e(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.textView.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.iconSize = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        g gVar = this.itemData;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.textView.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.needsEmptyIcon = z10;
    }

    public void setShortcut(boolean z10, char c10) {
    }

    public void setTextAppearance(int i10) {
        this.textView.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }
}
