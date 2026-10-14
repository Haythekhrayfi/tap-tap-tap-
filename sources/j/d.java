package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements f, i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f31676c;

    public static int c(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) listAdapter;
        int count = dVar.getCount();
        int i11 = 0;
        int i12 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = dVar.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = dVar.getView(i13, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    public static boolean l(androidx.appcompat.view.menu.e eVar) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void b(androidx.appcompat.view.menu.e eVar);

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public abstract void d(View view);

    public abstract void e(boolean z10);

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    public abstract void f(int i10);

    public abstract void g(int i10);

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return 0;
    }

    public abstract void i(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, androidx.appcompat.view.menu.e eVar) {
    }

    public abstract void j(boolean z10);

    public abstract void k(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) listAdapter).f848c.performItemAction((MenuItem) listAdapter.getItem(i10), this, (this instanceof androidx.appcompat.view.menu.b) ^ true ? 0 : 4);
    }
}
