package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.y0;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import e.a;
import i.g;
import java.util.WeakHashMap;
import p0.e0;
import p0.m0;
import p0.s0;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationView extends ScrimInsetsFrameLayout {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    private int layoutGravity;
    public OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final RectF shapeClipBounds;
    private Path shapeClipPath;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public Bundle menuState;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.menuState);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.layoutGravity = 0;
        this.drawerLayoutCornerSize = 0;
        this.shapeClipBounds = new RectF();
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        y0 y0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i10, i11, new int[0]);
        int i12 = com.google.android.material.R.styleable.NavigationView_android_background;
        if (y0VarObtainTintedStyledAttributes.p(i12)) {
            Drawable drawableG = y0VarObtainTintedStyledAttributes.g(i12);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.q(this, drawableG);
        }
        this.drawerLayoutCornerSize = y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.layoutGravity = y0VarObtainTintedStyledAttributes.j(com.google.android.material.R.styleable.NavigationView_android_layout_gravity, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i10, i11).build();
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            e0.d.q(this, materialShapeDrawable);
        }
        int i13 = com.google.android.material.R.styleable.NavigationView_elevation;
        if (y0VarObtainTintedStyledAttributes.p(i13)) {
            setElevation(y0VarObtainTintedStyledAttributes.f(i13, 0));
        }
        setFitsSystemWindows(y0VarObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i14 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList colorStateListC = y0VarObtainTintedStyledAttributes.p(i14) ? y0VarObtainTintedStyledAttributes.c(i14) : null;
        int i15 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int iM = y0VarObtainTintedStyledAttributes.p(i15) ? y0VarObtainTintedStyledAttributes.m(i15, 0) : 0;
        if (iM == 0 && colorStateListC == null) {
            colorStateListC = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i16 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        ColorStateList colorStateListC2 = y0VarObtainTintedStyledAttributes.p(i16) ? y0VarObtainTintedStyledAttributes.c(i16) : createDefaultColorStateList(R.attr.textColorSecondary);
        int i17 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int iM2 = y0VarObtainTintedStyledAttributes.p(i17) ? y0VarObtainTintedStyledAttributes.m(i17, 0) : 0;
        int i18 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (y0VarObtainTintedStyledAttributes.p(i18)) {
            setItemIconSize(y0VarObtainTintedStyledAttributes.f(i18, 0));
        }
        int i19 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList colorStateListC3 = y0VarObtainTintedStyledAttributes.p(i19) ? y0VarObtainTintedStyledAttributes.c(i19) : null;
        if (iM2 == 0 && colorStateListC3 == null) {
            colorStateListC3 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableG2 = y0VarObtainTintedStyledAttributes.g(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (drawableG2 == null && hasShapeAppearance(y0VarObtainTintedStyledAttributes)) {
            drawableG2 = createDefaultItemBackground(y0VarObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(y0VarObtainTintedStyledAttributes, null)));
            }
        }
        int i20 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (y0VarObtainTintedStyledAttributes.p(i20)) {
            setItemHorizontalPadding(y0VarObtainTintedStyledAttributes.f(i20, 0));
        }
        int i21 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (y0VarObtainTintedStyledAttributes.p(i21)) {
            setItemVerticalPadding(y0VarObtainTintedStyledAttributes.f(i21, 0));
        }
        setDividerInsetStart(y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, 0));
        setDividerInsetEnd(y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, 0));
        setSubheaderInsetStart(y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, 0));
        setSubheaderInsetEnd(y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, 0));
        setTopInsetScrimEnabled(y0VarObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(y0VarObtainTintedStyledAttributes.a(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int iF = y0VarObtainTintedStyledAttributes.f(com.google.android.material.R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(y0VarObtainTintedStyledAttributes.j(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new e.a() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // androidx.appcompat.view.menu.e.a
            public boolean onMenuItemSelected(e eVar, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.e.a
            public void onMenuModeChange(e eVar) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (iM != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(iM);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListC);
        navigationMenuPresenter.setItemIconTintList(colorStateListC2);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (iM2 != 0) {
            navigationMenuPresenter.setItemTextAppearance(iM2);
        }
        navigationMenuPresenter.setItemTextColor(colorStateListC3);
        navigationMenuPresenter.setItemBackground(drawableG2);
        navigationMenuPresenter.setItemIconPadding(iF);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i22 = com.google.android.material.R.styleable.NavigationView_menu;
        if (y0VarObtainTintedStyledAttributes.p(i22)) {
            inflateMenu(y0VarObtainTintedStyledAttributes.m(i22, 0));
        }
        int i23 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (y0VarObtainTintedStyledAttributes.p(i23)) {
            inflateHeaderView(y0VarObtainTintedStyledAttributes.m(i23, 0));
        }
        y0VarObtainTintedStyledAttributes.f1412b.recycle();
        setupInsetScrimsListener();
    }

    private ColorStateList createDefaultColorStateList(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    private Drawable createDefaultItemBackground(y0 y0Var) {
        return createDefaultItemDrawable(y0Var, MaterialResources.getColorStateList(getContext(), y0Var, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(y0 y0Var, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), y0Var.m(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), y0Var.m(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, y0Var.f(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), y0Var.f(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), y0Var.f(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), y0Var.f(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(y0 y0Var) {
        return y0Var.p(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || y0Var.p(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i10, int i11) {
        if (!(getParent() instanceof DrawerLayout) || this.drawerLayoutCornerSize <= 0 || !(getBackground() instanceof MaterialShapeDrawable)) {
            this.shapeClipPath = null;
            this.shapeClipBounds.setEmpty();
            return;
        }
        MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
        ShapeAppearanceModel.Builder builder = materialShapeDrawable.getShapeAppearanceModel().toBuilder();
        int i12 = this.layoutGravity;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        if (Gravity.getAbsoluteGravity(i12, e0.e.d(this)) == 3) {
            builder.setTopRightCornerSize(this.drawerLayoutCornerSize);
            builder.setBottomRightCornerSize(this.drawerLayoutCornerSize);
        } else {
            builder.setTopLeftCornerSize(this.drawerLayoutCornerSize);
            builder.setBottomLeftCornerSize(this.drawerLayoutCornerSize);
        }
        materialShapeDrawable.setShapeAppearanceModel(builder.build());
        if (this.shapeClipPath == null) {
            this.shapeClipPath = new Path();
        }
        this.shapeClipPath.reset();
        this.shapeClipBounds.set(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD, i10, i11);
        ShapeAppearancePathProvider.getInstance().calculatePath(materialShapeDrawable.getShapeAppearanceModel(), materialShapeDrawable.getInterpolation(), this.shapeClipBounds, this.shapeClipPath);
        invalidate();
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z10 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z10);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z10 && navigationView2.isTopInsetScrimEnabled());
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    boolean z11 = activity.findViewById(R.id.content).getHeight() == NavigationView.this.getHeight();
                    boolean z12 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z11 && z12 && navigationView3.isBottomInsetScrimEnabled());
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.shapeClipPath == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.shapeClipPath);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i10) {
        return this.presenter.getHeaderView(i10);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    public View inflateHeaderView(int i10) {
        return this.presenter.inflateHeaderView(i10);
    }

    public void inflateMenu(int i10) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i10, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public void onInsetsChanged(s0 s0Var) {
        this.presenter.dispatchApplyWindowInsets(s0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMin = this.maxWidth;
            }
            super.onMeasure(i10, i11);
        }
        iMin = Math.min(View.MeasureSpec.getSize(i10), this.maxWidth);
        i10 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        maybeUpdateCornerSizeForDrawerLayout(i10, i11);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.bottomInsetScrimEnabled = z10;
    }

    public void setCheckedItem(int i10) {
        MenuItem menuItemFindItem = this.menu.findItem(i10);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((androidx.appcompat.view.menu.g) menuItemFindItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.presenter.setCheckedItem((androidx.appcompat.view.menu.g) menuItemFindItem);
    }

    public void setDividerInsetEnd(int i10) {
        this.presenter.setDividerInsetEnd(i10);
    }

    public void setDividerInsetStart(int i10) {
        this.presenter.setDividerInsetStart(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeUtils.setElevation(this, f10);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        Context context = getContext();
        Object obj = e0.a.f28964a;
        setItemBackground(e0.a.c.b(context, i10));
    }

    public void setItemHorizontalPadding(int i10) {
        this.presenter.setItemHorizontalPadding(i10);
    }

    public void setItemHorizontalPaddingResource(int i10) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(int i10) {
        this.presenter.setItemIconPadding(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(int i10) {
        this.presenter.setItemIconSize(i10);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.presenter.setItemMaxLines(i10);
    }

    public void setItemTextAppearance(int i10) {
        this.presenter.setItemTextAppearance(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i10) {
        this.presenter.setItemVerticalPadding(i10);
    }

    public void setItemVerticalPaddingResource(int i10) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i10);
        }
    }

    public void setSubheaderInsetEnd(int i10) {
        this.presenter.setSubheaderInsetStart(i10);
    }

    public void setSubheaderInsetStart(int i10) {
        this.presenter.setSubheaderInsetStart(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.topInsetScrimEnabled = z10;
    }
}
