package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends h0 implements i0 {
    public static Method E;
    public i0 D;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z10) {
            popupWindow.setTouchModal(z10);
        }
    }

    public static class c extends d0 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f1277o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f1278p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public i0 f1279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MenuItem f1280r;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z10) {
            super(context, z10);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f1277o = 21;
                this.f1278p = 22;
            } else {
                this.f1277o = 22;
                this.f1278p = 21;
            }
        }

        @Override // androidx.appcompat.widget.d0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            int iPointToPosition;
            int i10;
            if (this.f1279q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) adapter;
                androidx.appcompat.view.menu.g item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = iPointToPosition - headersCount) >= 0 && i10 < dVar.getCount()) {
                    item = dVar.getItem(i10);
                }
                MenuItem menuItem = this.f1280r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVar = dVar.f848c;
                    if (menuItem != null) {
                        this.f1279q.g(eVar, menuItem);
                    }
                    this.f1280r = item;
                    if (item != null) {
                        this.f1279q.d(eVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1277o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i10 != this.f1278p) {
                return super.onKeyDown(i10, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).f848c.close(false);
            return true;
        }

        public void setHoverListener(i0 i0Var) {
            this.f1279q = i0Var;
        }

        @Override // androidx.appcompat.widget.d0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public j0(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.appcompat.widget.i0
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.D;
        if (i0Var != null) {
            i0Var.d(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i0 i0Var = this.D;
        if (i0Var != null) {
            i0Var.g(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.h0
    public d0 o(Context context, boolean z10) {
        c cVar = new c(context, z10);
        cVar.setHoverListener(this);
        return cVar;
    }
}
