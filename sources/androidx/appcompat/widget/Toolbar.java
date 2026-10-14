package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements p0.i {
    private static final String TAG = "Toolbar";
    private androidx.appcompat.view.menu.i.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    public int mButtonGravity;
    public ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private n0 mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    public View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    public androidx.appcompat.view.menu.e.a mMenuBuilderCallback;
    public final p0.l mMenuHostHelper;
    public ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    public h mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private a1 mWrapper;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1105d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1104c = parcel.readInt();
            this.f1105d = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1104c);
            parcel.writeInt(this.f1105d ? 1 : 0);
        }
    }

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    public class c implements androidx.appcompat.view.menu.e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.onMenuItemSelected(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            ActionMenuPresenter actionMenuPresenter = Toolbar.this.mMenuView.f997g;
            if (!(actionMenuPresenter != null && actionMenuPresenter.h())) {
                Toolbar.this.mMenuHostHelper.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.onMenuModeChange(eVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new androidx.activity.g(runnable, 1);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f1111d;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean collapseItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof i.b) {
                ((i.b) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f1111d = null;
            Toolbar.this.requestLayout();
            gVar.C = false;
            gVar.f870n.onItemsChanged(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean expandItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = gVar.getActionView();
            this.f1111d = gVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f657a = 8388611 | (toolbar4.mButtonGravity & 112);
                gVarGenerateDefaultLayoutParams.f1113b = 2;
                toolbar4.mExpandedActionView.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f870n.onItemsChanged(false);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof i.b) {
                ((i.b) callback).b();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean flagActionItems() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1110c;
            if (eVar2 != null && (gVar = this.f1111d) != null) {
                eVar2.collapseItemActionView(gVar);
            }
            this.f1110c = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable onSaveInstanceState() {
            return null;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void updateMenuView(boolean z10) {
            if (this.f1111d != null) {
                androidx.appcompat.view.menu.e eVar = this.f1110c;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f1110c.getItem(i10) == this.f1111d) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                collapseItemActionView(this.f1110c, this.f1111d);
            }
        }
    }

    public static class g extends androidx.appcompat.app.a.C0023a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1113b;

        public g(int i10) {
            this(-2, -1, i10);
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1113b = 0;
            this.f657a = 8388627;
        }

        public g(int i10, int i11, int i12) {
            super(i10, i11);
            this.f1113b = 0;
            this.f657a = i12;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1113b = 0;
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1113b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1113b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(androidx.appcompat.app.a.C0023a c0023a) {
            super(c0023a);
            this.f1113b = 0;
        }

        public g(g gVar) {
            super((androidx.appcompat.app.a.C0023a) gVar);
            this.f1113b = 0;
            this.f1113b = gVar.f1113b;
        }
    }

    public interface h {
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new p0.l(new z0(this, 0));
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Context context2 = getContext();
        int[] iArr = d.a.f28483y;
        y0 y0VarR = y0.r(context2, attributeSet, iArr, i10, 0);
        p0.e0.p(this, context, iArr, attributeSet, y0VarR.f1412b, i10, 0);
        this.mTitleTextAppearance = y0VarR.m(28, 0);
        this.mSubtitleTextAppearance = y0VarR.m(19, 0);
        this.mGravity = y0VarR.k(0, this.mGravity);
        this.mButtonGravity = y0VarR.k(2, 48);
        int iE = y0VarR.e(22, 0);
        iE = y0VarR.p(27) ? y0VarR.e(27, iE) : iE;
        this.mTitleMarginBottom = iE;
        this.mTitleMarginTop = iE;
        this.mTitleMarginEnd = iE;
        this.mTitleMarginStart = iE;
        int iE2 = y0VarR.e(25, -1);
        if (iE2 >= 0) {
            this.mTitleMarginStart = iE2;
        }
        int iE3 = y0VarR.e(24, -1);
        if (iE3 >= 0) {
            this.mTitleMarginEnd = iE3;
        }
        int iE4 = y0VarR.e(26, -1);
        if (iE4 >= 0) {
            this.mTitleMarginTop = iE4;
        }
        int iE5 = y0VarR.e(23, -1);
        if (iE5 >= 0) {
            this.mTitleMarginBottom = iE5;
        }
        this.mMaxButtonHeight = y0VarR.f(13, -1);
        int iE6 = y0VarR.e(9, Integer.MIN_VALUE);
        int iE7 = y0VarR.e(5, Integer.MIN_VALUE);
        int iF = y0VarR.f(7, 0);
        int iF2 = y0VarR.f(8, 0);
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        n0Var.f1309h = false;
        if (iF != Integer.MIN_VALUE) {
            n0Var.f1306e = iF;
            n0Var.f1302a = iF;
        }
        if (iF2 != Integer.MIN_VALUE) {
            n0Var.f1307f = iF2;
            n0Var.f1303b = iF2;
        }
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            n0Var.a(iE6, iE7);
        }
        this.mContentInsetStartWithNavigation = y0VarR.e(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = y0VarR.e(6, Integer.MIN_VALUE);
        this.mCollapseIcon = y0VarR.g(4);
        this.mCollapseDescription = y0VarR.o(3);
        CharSequence charSequenceO = y0VarR.o(21);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = y0VarR.o(18);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(y0VarR.m(17, 0));
        Drawable drawableG = y0VarR.g(16);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceO3 = y0VarR.o(15);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableG2 = y0VarR.g(11);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceO4 = y0VarR.o(12);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        if (y0VarR.p(29)) {
            setTitleTextColor(y0VarR.c(29));
        }
        if (y0VarR.p(20)) {
            setSubtitleTextColor(y0VarR.c(20));
        }
        if (y0VarR.p(14)) {
            inflateMenu(y0VarR.m(14, 0));
        }
        y0VarR.f1412b.recycle();
    }

    private void addCustomViewsWithGravity(List<View> list, int i10) {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        boolean z10 = p0.e0.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, p0.e0.e.d(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1113b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(gVar.f657a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1113b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(gVar2.f657a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z10) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f1113b = 1;
        if (!z10 || this.mExpandedActionView == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new n0();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView.f993c == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            eVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            ActionMenuView actionMenuView2 = this.mMenuView;
            androidx.appcompat.view.menu.i.a aVar = this.mActionMenuPresenterCallback;
            c cVar = new c();
            actionMenuView2.f998h = aVar;
            actionMenuView2.f999i = cVar;
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f657a = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new n(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f657a = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i10) {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        int iD = p0.e0.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, iD) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return iD == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(gVar.f657a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i11;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.mGravity & 112;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return p0.h.c(marginLayoutParams) + p0.h.b(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new i.g(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int measuredWidth = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i13 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int iMax = Math.max(0, i13);
            int iMax2 = Math.max(0, i14);
            int iMax3 = Math.max(0, -i13);
            int iMax4 = Math.max(0, -i14);
            measuredWidth += view.getMeasuredWidth() + iMax + iMax2;
            i12++;
            i11 = iMax4;
            i10 = iMax3;
        }
        return measuredWidth;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int childTop = getChildTop(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, iMax + measuredWidth, view.getMeasuredHeight() + childTop);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin + iMax;
    }

    private int layoutChildRight(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int childTop = getChildTop(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + iMax + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void measureChildConstrained(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.c(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override // p0.i
    public void addMenuProvider(p0.n nVar) {
        p0.l lVar = this.mMenuHostHelper;
        lVar.f34389b.add(nVar);
        lVar.f34388a.run();
    }

    public void addMenuProvider(p0.n nVar, androidx.lifecycle.p pVar) {
        this.mMenuHostHelper.a(nVar, pVar);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(p0.n nVar, androidx.lifecycle.p pVar, androidx.lifecycle.i.c cVar) {
        this.mMenuHostHelper.b(nVar, pVar, cVar);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.f996f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f1111d;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f997g) == null) {
            return;
        }
        actionMenuPresenter.e();
    }

    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            n nVar = new n(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.mCollapseButtonView = nVar;
            nVar.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f657a = 8388611 | (this.mButtonGravity & 112);
            gVarGenerateDefaultLayoutParams.f1113b = 2;
            this.mCollapseButtonView.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    @Override // android.view.ViewGroup
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0023a) {
            return new g((androidx.appcompat.app.a.C0023a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f1308g ? n0Var.f1302a : n0Var.f1303b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.mContentInsetEndWithActions;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f1302a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f1303b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        n0 n0Var = this.mContentInsets;
        if (n0Var != null) {
            return n0Var.f1308g ? n0Var.f1303b : n0Var.f1302a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.mContentInsetStartWithNavigation;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVar;
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && (eVar = actionMenuView.f993c) != null && eVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        return p0.e0.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        return p0.e0.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public b0 getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new a1(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f1111d == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f997g;
            if (actionMenuPresenter != null && actionMenuPresenter.f()) {
                return true;
            }
        }
        return false;
    }

    public void inflateMenu(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c  */
    public boolean isOverflowMenuShowPending() {
        boolean z10;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f997g;
            if (actionMenuPresenter == null) {
                z10 = false;
            } else {
                if (actionMenuPresenter.f981x != null || actionMenuPresenter.h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f997g;
            if (actionMenuPresenter != null && actionMenuPresenter.h()) {
                return true;
            }
        }
        return false;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i10 = 0; i10 < lineCount; i10++) {
            if (layout.getEllipsisCount(i10) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0239  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x025f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0281  */
    /* JADX WARN: Code duplicated, block: B:107:0x0284  */
    /* JADX WARN: Code duplicated, block: B:110:0x0297 A[LOOP:0: B:109:0x0295->B:110:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b9 A[LOOP:1: B:112:0x02b7->B:113:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f2 A[LOOP:2: B:121:0x02f0->B:122:0x02f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0123 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:56:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0147 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0160  */
    /* JADX WARN: Code duplicated, block: B:73:0x0164  */
    /* JADX WARN: Code duplicated, block: B:75:0x0176  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:83:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iLayoutChildLeft;
        int iLayoutChildRight;
        int iMax;
        int iMin;
        boolean zShouldLayout;
        boolean zShouldLayout2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        boolean z11;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iMax2;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int size;
        int i28;
        int i29;
        int size2;
        int i30;
        int i31;
        int i32;
        int size3;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
        boolean z12 = p0.e0.e.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i33 = width - paddingRight;
        int[] iArr = this.mTempMargins;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = p0.e0.d.d(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i13 - i11) : 0;
        if (shouldLayout(this.mNavButtonView)) {
            ImageButton imageButton2 = this.mNavButtonView;
            if (z12) {
                iLayoutChildRight = layoutChildRight(imageButton2, i33, iArr, iMin2);
                iLayoutChildLeft = paddingLeft;
            } else {
                iLayoutChildLeft = layoutChildLeft(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (shouldLayout(this.mCollapseButtonView)) {
                imageButton = this.mCollapseButtonView;
                if (z12) {
                    iLayoutChildRight = layoutChildRight(imageButton, iLayoutChildRight, iArr, iMin2);
                } else {
                    iLayoutChildLeft = layoutChildLeft(imageButton, iLayoutChildLeft, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mMenuView)) {
                actionMenuView = this.mMenuView;
                if (z12) {
                    iLayoutChildLeft = layoutChildLeft(actionMenuView, iLayoutChildLeft, iArr, iMin2);
                } else {
                    iLayoutChildRight = layoutChildRight(actionMenuView, iLayoutChildRight, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iLayoutChildLeft);
            iArr[1] = Math.max(0, currentContentInsetRight - (i33 - iLayoutChildRight));
            iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft);
            iMin = Math.min(iLayoutChildRight, i33 - currentContentInsetRight);
            if (shouldLayout(this.mExpandedActionView)) {
                view = this.mExpandedActionView;
                if (z12) {
                    iMin = layoutChildRight(view, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(view, iMax, iArr, iMin2);
                }
            }
            if (shouldLayout(this.mLogoView)) {
                imageView = this.mLogoView;
                if (z12) {
                    iMin = layoutChildRight(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = layoutChildLeft(imageView, iMax, iArr, iMin2);
                }
            }
            zShouldLayout = shouldLayout(this.mTitleTextView);
            zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
            if (zShouldLayout) {
                g gVar3 = (g) this.mTitleTextView.getLayoutParams();
                measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zShouldLayout2) {
                g gVar4 = (g) this.mSubtitleTextView.getLayoutParams();
                measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).topMargin + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zShouldLayout || zShouldLayout2) {
                if (zShouldLayout) {
                    textView = this.mTitleTextView;
                } else {
                    textView = this.mSubtitleTextView;
                }
                if (zShouldLayout2) {
                    textView2 = this.mSubtitleTextView;
                } else {
                    textView2 = this.mTitleTextView;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                z11 = (!zShouldLayout && this.mTitleTextView.getMeasuredWidth() > 0) || (zShouldLayout2 && this.mSubtitleTextView.getMeasuredWidth() > 0);
                i14 = this.mGravity & 112;
                i15 = paddingLeft;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i23 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i24 = this.mTitleMarginTop;
                    if (iMax2 < i23 + i24) {
                        iMax2 = i23 + i24;
                    } else {
                        i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i26 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i27 = this.mTitleMarginBottom;
                        if (i25 < i26 + i27) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i27) - i25));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
                }
                if (z12) {
                    if (z11) {
                        i20 = this.mTitleMarginStart;
                    } else {
                        i20 = 0;
                    }
                    int i34 = i20 - iArr[1];
                    iMin -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (zShouldLayout) {
                        g gVar5 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth = iMin - this.mTitleTextView.getMeasuredWidth();
                        int measuredHeight2 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i21 = measuredWidth - this.mTitleMarginEnd;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i21 = iMin;
                    }
                    if (zShouldLayout2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i35, iMin, this.mSubtitleTextView.getMeasuredHeight() + i35);
                        i22 = iMin - this.mTitleMarginEnd;
                    } else {
                        i22 = iMin;
                    }
                    if (z11) {
                        iMin = Math.min(i21, i22);
                    }
                    iMax = iMax;
                } else {
                    if (z11) {
                        i17 = this.mTitleMarginStart;
                        i16 = 0;
                    } else {
                        i16 = 0;
                        i17 = 0;
                    }
                    int i36 = i17 - iArr[i16];
                    iMax = Math.max(i16, i36) + iMax;
                    iArr[i16] = Math.max(i16, -i36);
                    if (zShouldLayout) {
                        g gVar6 = (g) this.mTitleTextView.getLayoutParams();
                        int measuredWidth2 = this.mTitleTextView.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                        this.mTitleTextView.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i18 = measuredWidth2 + this.mTitleMarginEnd;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i18 = iMax;
                    }
                    if (zShouldLayout2) {
                        int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                        this.mSubtitleTextView.layout(iMax, i37, measuredWidth3, this.mSubtitleTextView.getMeasuredHeight() + i37);
                        i19 = measuredWidth3 + this.mTitleMarginEnd;
                    } else {
                        i19 = iMax;
                    }
                    if (z11) {
                        iMax = Math.max(i18, i19);
                    }
                }
                addCustomViewsWithGravity(this.mTempViews, 3);
                size = this.mTempViews.size();
                for (i28 = i16; i28 < size; i28++) {
                    iMax = layoutChildLeft(this.mTempViews.get(i28), iMax, iArr, iMin2);
                }
                i29 = iMin2;
                addCustomViewsWithGravity(this.mTempViews, 5);
                size2 = this.mTempViews.size();
                for (i30 = i16; i30 < size2; i30++) {
                    iMin = layoutChildRight(this.mTempViews.get(i30), iMin, iArr, i29);
                }
                addCustomViewsWithGravity(this.mTempViews, 1);
                int viewListMeasuredWidth = getViewListMeasuredWidth(this.mTempViews, iArr);
                i31 = ((((width - i15) - paddingRight) / 2) + i15) - (viewListMeasuredWidth / 2);
                i32 = viewListMeasuredWidth + i31;
                if (i31 >= iMax) {
                    if (i32 > iMin) {
                        iMax = i31 - (i32 - iMin);
                    } else {
                        iMax = i31;
                    }
                }
                size3 = this.mTempViews.size();
                while (i16 < size3) {
                    iMax = layoutChildLeft(this.mTempViews.get(i16), iMax, iArr, i29);
                    i16++;
                }
                this.mTempViews.clear();
            }
            i15 = paddingLeft;
            iMin2 = iMin2;
            i16 = 0;
            addCustomViewsWithGravity(this.mTempViews, 3);
            size = this.mTempViews.size();
            while (i28 < size) {
                iMax = layoutChildLeft(this.mTempViews.get(i28), iMax, iArr, iMin2);
            }
            i29 = iMin2;
            addCustomViewsWithGravity(this.mTempViews, 5);
            size2 = this.mTempViews.size();
            while (i30 < size2) {
                iMin = layoutChildRight(this.mTempViews.get(i30), iMin, iArr, i29);
            }
            addCustomViewsWithGravity(this.mTempViews, 1);
            int viewListMeasuredWidth2 = getViewListMeasuredWidth(this.mTempViews, iArr);
            i31 = ((((width - i15) - paddingRight) / 2) + i15) - (viewListMeasuredWidth2 / 2);
            i32 = viewListMeasuredWidth2 + i31;
            if (i31 >= iMax) {
                if (i32 > iMin) {
                    iMax = i31 - (i32 - iMin);
                } else {
                    iMax = i31;
                }
            }
            size3 = this.mTempViews.size();
            while (i16 < size3) {
                iMax = layoutChildLeft(this.mTempViews.get(i16), iMax, iArr, i29);
                i16++;
            }
            this.mTempViews.clear();
        }
        iLayoutChildLeft = paddingLeft;
        iLayoutChildRight = i33;
        if (shouldLayout(this.mCollapseButtonView)) {
            imageButton = this.mCollapseButtonView;
            if (z12) {
                iLayoutChildRight = layoutChildRight(imageButton, iLayoutChildRight, iArr, iMin2);
            } else {
                iLayoutChildLeft = layoutChildLeft(imageButton, iLayoutChildLeft, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mMenuView)) {
            actionMenuView = this.mMenuView;
            if (z12) {
                iLayoutChildLeft = layoutChildLeft(actionMenuView, iLayoutChildLeft, iArr, iMin2);
            } else {
                iLayoutChildRight = layoutChildRight(actionMenuView, iLayoutChildRight, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iLayoutChildLeft);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i33 - iLayoutChildRight));
        iMax = Math.max(iLayoutChildLeft, currentContentInsetLeft2);
        iMin = Math.min(iLayoutChildRight, i33 - currentContentInsetRight2);
        if (shouldLayout(this.mExpandedActionView)) {
            view = this.mExpandedActionView;
            if (z12) {
                iMin = layoutChildRight(view, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(view, iMax, iArr, iMin2);
            }
        }
        if (shouldLayout(this.mLogoView)) {
            imageView = this.mLogoView;
            if (z12) {
                iMin = layoutChildRight(imageView, iMin, iArr, iMin2);
            } else {
                iMax = layoutChildLeft(imageView, iMax, iArr, iMin2);
            }
        }
        zShouldLayout = shouldLayout(this.mTitleTextView);
        zShouldLayout2 = shouldLayout(this.mSubtitleTextView);
        if (zShouldLayout) {
            g gVar7 = (g) this.mTitleTextView.getLayoutParams();
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zShouldLayout2) {
            g gVar8 = (g) this.mSubtitleTextView.getLayoutParams();
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).topMargin + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zShouldLayout) {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i14 = this.mGravity & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i24 = this.mTitleMarginTop;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i27 = this.mTitleMarginBottom;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.mTitleMarginStart;
                } else {
                    i20 = 0;
                }
                int i38 = i20 - iArr[1];
                iMin -= Math.max(0, i38);
                iArr[1] = Math.max(0, -i38);
                if (zShouldLayout) {
                    g gVar9 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth4 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight4 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i21 = measuredWidth4 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zShouldLayout2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i39, iMin, this.mSubtitleTextView.getMeasuredHeight() + i39);
                    i22 = iMin - this.mTitleMarginEnd;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.mTitleMarginStart;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i310 = i17 - iArr[i16];
                iMax = Math.max(i16, i310) + iMax;
                iArr[i16] = Math.max(i16, -i310);
                if (zShouldLayout) {
                    g gVar10 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth5 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i18 = measuredWidth5 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zShouldLayout2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i311, measuredWidth6, this.mSubtitleTextView.getMeasuredHeight() + i311);
                    i19 = measuredWidth6 + this.mTitleMarginEnd;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        } else {
            if (zShouldLayout) {
                textView = this.mTitleTextView;
            } else {
                textView = this.mSubtitleTextView;
            }
            if (zShouldLayout2) {
                textView2 = this.mSubtitleTextView;
            } else {
                textView2 = this.mTitleTextView;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            if (zShouldLayout) {
            }
            i14 = this.mGravity & 112;
            i15 = paddingLeft;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.mTitleMarginTop;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i23 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i24 = this.mTitleMarginTop;
                if (iMax2 < i23 + i24) {
                    iMax2 = i23 + i24;
                } else {
                    i25 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i26 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i27 = this.mTitleMarginBottom;
                    if (i25 < i26 + i27) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i27) - i25));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.mTitleMarginBottom) - measuredHeight;
            }
            if (z12) {
                if (z11) {
                    i20 = this.mTitleMarginStart;
                } else {
                    i20 = 0;
                }
                int i312 = i20 - iArr[1];
                iMin -= Math.max(0, i312);
                iArr[1] = Math.max(0, -i312);
                if (zShouldLayout) {
                    g gVar11 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth7 = iMin - this.mTitleTextView.getMeasuredWidth();
                    int measuredHeight6 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i21 = measuredWidth7 - this.mTitleMarginEnd;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i21 = iMin;
                }
                if (zShouldLayout2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    this.mSubtitleTextView.layout(iMin - this.mSubtitleTextView.getMeasuredWidth(), i313, iMin, this.mSubtitleTextView.getMeasuredHeight() + i313);
                    i22 = iMin - this.mTitleMarginEnd;
                } else {
                    i22 = iMin;
                }
                if (z11) {
                    iMin = Math.min(i21, i22);
                }
                iMax = iMax;
                i16 = 0;
            } else {
                if (z11) {
                    i17 = this.mTitleMarginStart;
                    i16 = 0;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i314 = i17 - iArr[i16];
                iMax = Math.max(i16, i314) + iMax;
                iArr[i16] = Math.max(i16, -i314);
                if (zShouldLayout) {
                    g gVar12 = (g) this.mTitleTextView.getLayoutParams();
                    int measuredWidth8 = this.mTitleTextView.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.mTitleTextView.getMeasuredHeight() + paddingTop;
                    this.mTitleTextView.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i18 = measuredWidth8 + this.mTitleMarginEnd;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i18 = iMax;
                }
                if (zShouldLayout2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.mSubtitleTextView.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.mSubtitleTextView.getMeasuredWidth() + iMax;
                    this.mSubtitleTextView.layout(iMax, i315, measuredWidth9, this.mSubtitleTextView.getMeasuredHeight() + i315);
                    i19 = measuredWidth9 + this.mTitleMarginEnd;
                } else {
                    i19 = iMax;
                }
                if (z11) {
                    iMax = Math.max(i18, i19);
                }
            }
        }
        addCustomViewsWithGravity(this.mTempViews, 3);
        size = this.mTempViews.size();
        while (i28 < size) {
            iMax = layoutChildLeft(this.mTempViews.get(i28), iMax, iArr, iMin2);
        }
        i29 = iMin2;
        addCustomViewsWithGravity(this.mTempViews, 5);
        size2 = this.mTempViews.size();
        while (i30 < size2) {
            iMin = layoutChildRight(this.mTempViews.get(i30), iMin, iArr, i29);
        }
        addCustomViewsWithGravity(this.mTempViews, 1);
        int viewListMeasuredWidth3 = getViewListMeasuredWidth(this.mTempViews, iArr);
        i31 = ((((width - i15) - paddingRight) / 2) + i15) - (viewListMeasuredWidth3 / 2);
        i32 = viewListMeasuredWidth3 + i31;
        if (i31 >= iMax) {
            if (i32 > iMin) {
                iMax = i31 - (i32 - iMin);
            } else {
                iMax = i31;
            }
        }
        size3 = this.mTempViews.size();
        while (i16 < size3) {
            iMax = layoutChildLeft(this.mTempViews.get(i16), iMax, iArr, i29);
            i16++;
        }
        this.mTempViews.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.mTempMargins;
        boolean zB = g1.b(this);
        int i12 = !zB ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i10, 0, i11, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth) + 0;
        iArr[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i10, iMax3, i11, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = Math.max(currentContentInsetEnd, measuredWidth2) + iMax3;
        iArr[i12] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i10, iMax4, i11, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f1113b == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i10, iMax4, i11, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i14 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i15 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i10, iMax4 + i15, i11, i14, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i10, iMax4 + i15, i11, measuredHeight + i14, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax4 + iMax2, getSuggestedMinimumWidth()), i10, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + Math.max(iMax, measuredHeight), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.f993c : null;
        int i10 = savedState.f1104c;
        if (i10 != 0 && this.mExpandedMenuPresenter != null && eVar != null && (menuItemFindItem = eVar.findItem(i10)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.f1105d) {
            postShowOverflowMenu();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        int i11;
        super.onRtlPropertiesChanged(i10);
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        boolean z10 = i10 == 1;
        if (z10 == n0Var.f1308g) {
            return;
        }
        n0Var.f1308g = z10;
        if (n0Var.f1309h) {
            if (z10) {
                int i12 = n0Var.f1305d;
                if (i12 == Integer.MIN_VALUE) {
                    i12 = n0Var.f1306e;
                }
                n0Var.f1302a = i12;
                i11 = n0Var.f1304c;
                if (i11 == Integer.MIN_VALUE) {
                }
            } else {
                int i13 = n0Var.f1304c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = n0Var.f1306e;
                }
                n0Var.f1302a = i13;
                i11 = n0Var.f1305d;
                if (i11 == Integer.MIN_VALUE) {
                }
            }
            n0Var.f1303b = i11;
        }
        n0Var.f1302a = n0Var.f1306e;
        i11 = n0Var.f1307f;
        n0Var.f1303b = i11;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (gVar = fVar.f1111d) != null) {
            savedState.f1104c = gVar.f857a;
        }
        savedState.f1105d = isOverflowMenuShowing();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1113b != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override // p0.i
    public void removeMenuProvider(p0.n nVar) {
        this.mMenuHostHelper.f(nVar);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.mBackInvokedCallbackEnabled != z10) {
            this.mBackInvokedCallbackEnabled = z10;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(e.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setCollapsible(boolean z10) {
        this.mCollapsible = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i10, int i11) {
        ensureContentInsets();
        n0 n0Var = this.mContentInsets;
        n0Var.f1309h = false;
        if (i10 != Integer.MIN_VALUE) {
            n0Var.f1306e = i10;
            n0Var.f1302a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            n0Var.f1307f = i11;
            n0Var.f1303b = i11;
        }
    }

    public void setContentInsetsRelative(int i10, int i11) {
        ensureContentInsets();
        this.mContentInsets.a(i10, i11);
    }

    public void setLogo(int i10) {
        setLogo(e.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setMenu(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        androidx.appcompat.view.menu.g gVar;
        if (eVar == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.e eVar2 = this.mMenuView.f993c;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            eVar2.removeMenuPresenter(this.mOuterActionMenuPresenter);
            eVar2.removeMenuPresenter(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        actionMenuPresenter.f977t = true;
        if (eVar != null) {
            eVar.addMenuPresenter(actionMenuPresenter, this.mPopupContext);
            eVar.addMenuPresenter(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            actionMenuPresenter.initForMenu(this.mPopupContext, null);
            f fVar = this.mExpandedMenuPresenter;
            androidx.appcompat.view.menu.e eVar3 = fVar.f1110c;
            if (eVar3 != null && (gVar = fVar.f1111d) != null) {
                eVar3.collapseItemActionView(gVar);
            }
            fVar.f1110c = null;
            actionMenuPresenter.updateMenuView(true);
            this.mExpandedMenuPresenter.updateMenuView(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(actionMenuPresenter);
        this.mOuterActionMenuPresenter = actionMenuPresenter;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.i.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.f998h = aVar;
            actionMenuView.f999i = aVar2;
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            b1.a(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(e.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.mOnMenuItemClickListener = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.mPopupTheme != i10) {
            this.mPopupTheme = i10;
            if (i10 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mSubtitleTextAppearance;
                if (i10 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextAppearance(Context context, int i10) {
        this.mSubtitleTextAppearance = i10;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.mTitleTextAppearance;
                if (i10 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleMargin(int i10, int i11, int i12, int i13) {
        this.mTitleMarginStart = i10;
        this.mTitleMarginTop = i11;
        this.mTitleMarginEnd = i12;
        this.mTitleMarginBottom = i13;
        requestLayout();
    }

    public void setTitleMarginBottom(int i10) {
        this.mTitleMarginBottom = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.mTitleMarginEnd = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.mTitleMarginStart = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.mTitleMarginTop = i10;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i10) {
        this.mTitleTextAppearance = i10;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f997g;
            if (actionMenuPresenter != null && actionMenuPresenter.i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0021  */
    void updateBackInvokedCallbackState() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            if (!hasExpandedActionView() || onBackInvokedDispatcherA == null) {
                z10 = false;
            } else {
                WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
                if (p0.e0.g.b(this) && this.mBackInvokedCallbackEnabled) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new z0(this, 1));
                }
                e.c(onBackInvokedDispatcherA, this.mBackInvokedCallback);
            } else {
                if (z10 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                    return;
                }
                e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
                onBackInvokedDispatcherA = null;
            }
            this.mBackInvokedDispatcher = onBackInvokedDispatcherA;
        }
    }
}
