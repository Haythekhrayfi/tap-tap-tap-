package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.inscode.autoclicker.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a {
    public int A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f969l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f970m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f971n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f973p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f974q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f975r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f976s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f977t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseBooleanArray f978u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f979v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public a f980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f981x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f982y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f983z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f984c;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f984c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f984c);
        }
    }

    public class a extends androidx.appcompat.view.menu.h {
        public a(Context context, androidx.appcompat.view.menu.l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle);
            if (!((androidx.appcompat.view.menu.g) lVar.getItem()).g()) {
                View view2 = ActionMenuPresenter.this.f969l;
                this.f889f = view2 == null ? (View) ActionMenuPresenter.this.f803j : view2;
            }
            d(ActionMenuPresenter.this.f983z);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f980w = null;
            actionMenuPresenter.A = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.f a() {
            a aVar = ActionMenuPresenter.this.f980w;
            if (aVar != null) {
                return aVar.a();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f987c;

        public c(e eVar) {
            this.f987c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.appcompat.view.menu.e eVar = ActionMenuPresenter.this.f798e;
            if (eVar != null) {
                eVar.changeMenuMode();
            }
            View view = (View) ActionMenuPresenter.this.f803j;
            if (view != null && view.getWindowToken() != null && this.f987c.f()) {
                ActionMenuPresenter.this.f979v = this.f987c;
            }
            ActionMenuPresenter.this.f981x = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends f0 {
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            @Override // androidx.appcompat.widget.f0
            public j.f b() {
                e eVar = ActionMenuPresenter.this.f979v;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.f0
            public boolean c() {
                ActionMenuPresenter.this.i();
                return true;
            }

            @Override // androidx.appcompat.widget.f0
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f981x != null) {
                    return false;
                }
                actionMenuPresenter.f();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            b1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.i();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.b.f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, R.attr.actionOverflowMenuStyle);
            this.f890g = 8388613;
            d(ActionMenuPresenter.this.f983z);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            androidx.appcompat.view.menu.e eVar = ActionMenuPresenter.this.f798e;
            if (eVar != null) {
                eVar.close();
            }
            ActionMenuPresenter.this.f979v = null;
            super.c();
        }
    }

    public class f implements androidx.appcompat.view.menu.i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean a(androidx.appcompat.view.menu.e eVar) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (eVar == actionMenuPresenter.f798e) {
                return false;
            }
            actionMenuPresenter.A = ((androidx.appcompat.view.menu.l) eVar).getItem().getItemId();
            androidx.appcompat.view.menu.i.a aVar = ActionMenuPresenter.this.f800g;
            if (aVar != null) {
                return aVar.a(eVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.l) {
                eVar.getRootMenu().close(false);
            }
            androidx.appcompat.view.menu.i.a aVar = ActionMenuPresenter.this.f800g;
            if (aVar != null) {
                aVar.onCloseMenu(eVar, z10);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f978u = new SparseBooleanArray();
        this.f983z = new f();
    }

    @Override // androidx.appcompat.view.menu.a
    public void a(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j.a aVar) {
        aVar.initialize(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f803j);
        if (this.f982y == null) {
            this.f982y = new b();
        }
        actionMenuItemView.setPopupCallback(this.f982y);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean b(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f969l) {
            return false;
        }
        viewGroup.removeViewAt(i10);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public View c(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.f()) {
            actionView = super.c(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean d(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.g();
    }

    public boolean e() {
        return f() | g();
    }

    public boolean f() {
        Object obj;
        c cVar = this.f981x;
        if (cVar != null && (obj = this.f803j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f981x = null;
            return true;
        }
        e eVar = this.f979v;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f893j.dismiss();
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        int size;
        ArrayList<androidx.appcompat.view.menu.g> visibleItems;
        int i10;
        boolean z10;
        androidx.appcompat.view.menu.e eVar = this.f798e;
        if (eVar != null) {
            visibleItems = eVar.getVisibleItems();
            size = visibleItems.size();
        } else {
            size = 0;
            visibleItems = null;
        }
        int i11 = this.f976s;
        int i12 = this.f975r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f803j;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= size) {
                break;
            }
            androidx.appcompat.view.menu.g gVar = visibleItems.get(i13);
            int i16 = gVar.f881y;
            if ((i16 & 2) == 2) {
                i15++;
            } else if ((i16 & 1) == 1) {
                i14++;
            } else {
                z11 = true;
            }
            if (this.f977t && gVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (this.f972o && (z11 || i14 + i15 > i11)) {
            i11--;
        }
        int i17 = i11 - i15;
        SparseBooleanArray sparseBooleanArray = this.f978u;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            androidx.appcompat.view.menu.g gVar2 = visibleItems.get(i18);
            int i20 = gVar2.f881y;
            if ((i20 & 2) == i10 ? z10 : false) {
                View viewC = c(gVar2, null, viewGroup);
                viewC.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewC.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int i21 = gVar2.f858b;
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                gVar2.l(z10);
            } else {
                if ((i20 & 1) == z10 ? z10 : false) {
                    int i22 = gVar2.f858b;
                    boolean z12 = sparseBooleanArray.get(i22);
                    boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z10 : false;
                    if (z13) {
                        View viewC2 = c(gVar2, null, viewGroup);
                        viewC2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewC2.getMeasuredWidth();
                        i12 -= measuredWidth2;
                        if (i19 == 0) {
                            i19 = measuredWidth2;
                        }
                        z13 &= i12 + i19 > 0;
                    }
                    if (z13 && i22 != 0) {
                        sparseBooleanArray.put(i22, true);
                    } else if (z12) {
                        sparseBooleanArray.put(i22, false);
                        for (int i23 = 0; i23 < i18; i23++) {
                            androidx.appcompat.view.menu.g gVar3 = visibleItems.get(i23);
                            if (gVar3.f858b == i22) {
                                if (gVar3.g()) {
                                    i17++;
                                }
                                gVar3.l(false);
                            }
                        }
                    }
                    if (z13) {
                        i17--;
                    }
                    gVar2.l(z13);
                } else {
                    gVar2.l(false);
                }
                i18++;
                i10 = 2;
                z10 = true;
            }
            i18++;
            i10 = 2;
            z10 = true;
        }
        return z10;
    }

    public boolean g() {
        a aVar = this.f980w;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f893j.dismiss();
        return true;
    }

    public boolean h() {
        e eVar = this.f979v;
        return eVar != null && eVar.b();
    }

    public boolean i() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f972o || h() || (eVar = this.f798e) == null || this.f803j == null || this.f981x != null || eVar.getNonActionItems().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f797d, this.f798e, this.f969l, true));
        this.f981x = cVar;
        ((View) this.f803j).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f797d = context;
        LayoutInflater.from(context);
        this.f798e = eVar;
        Resources resources = context.getResources();
        if (!this.f973p) {
            this.f972o = true;
        }
        int i10 = 2;
        this.f974q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f976s = i10;
        int measuredWidth = this.f974q;
        if (this.f972o) {
            if (this.f969l == null) {
                d dVar = new d(this.f796c);
                this.f969l = dVar;
                if (this.f971n) {
                    dVar.setImageDrawable(this.f970m);
                    this.f970m = null;
                    this.f971n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f969l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f969l.getMeasuredWidth();
        } else {
            this.f969l = null;
        }
        this.f975r = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z10) {
        e();
        androidx.appcompat.view.menu.i.a aVar = this.f800g;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f984c) > 0 && (menuItemFindItem = this.f798e.findItem(i10)) != null) {
            onSubMenuSelected((androidx.appcompat.view.menu.l) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f984c = this.A;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.l lVar) {
        boolean z10 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.l lVar2 = lVar;
        while (lVar2.getParentMenu() != this.f798e) {
            lVar2 = (androidx.appcompat.view.menu.l) lVar2.getParentMenu();
        }
        MenuItem item = lVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f803j;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof androidx.appcompat.view.menu.j.a) && ((androidx.appcompat.view.menu.j.a) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.A = lVar.getItem().getItemId();
        int size = lVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item2 = lVar.getItem(i11);
            if (item2.isVisible() && item2.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.f797d, lVar, view);
        this.f980w = aVar;
        aVar.f891h = z10;
        j.d dVar = aVar.f893j;
        if (dVar != null) {
            dVar.e(z10);
        }
        if (!this.f980w.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        super.onSubMenuSelected(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        super.updateMenuView(z10);
        ((View) this.f803j).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f798e;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> actionItems = eVar.getActionItems();
            int size = actionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                p0.b bVar = actionItems.get(i10).A;
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f798e;
        ArrayList<androidx.appcompat.view.menu.g> nonActionItems = eVar2 != null ? eVar2.getNonActionItems() : null;
        if (this.f972o && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z11 = !nonActionItems.get(0).C;
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.f969l;
        if (z11) {
            if (dVar == null) {
                this.f969l = new d(this.f796c);
            }
            ViewGroup viewGroup = (ViewGroup) this.f969l.getParent();
            if (viewGroup != this.f803j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f969l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f803j;
                d dVar2 = this.f969l;
                ActionMenuView.c cVarD = actionMenuView.generateDefaultLayoutParams();
                cVarD.f1005a = true;
                actionMenuView.addView(dVar2, cVarD);
            }
        } else if (dVar != null) {
            Object parent = dVar.getParent();
            Object obj = this.f803j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.f969l);
            }
        }
        ((ActionMenuView) this.f803j).setOverflowReserved(this.f972o);
    }
}
