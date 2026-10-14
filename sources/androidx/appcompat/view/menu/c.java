package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import com.inscode.autoclicker.R;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LayoutInflater f839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ExpandedMenuView f841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f845j;

    public class a extends BaseAdapter {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f846c = -1;

        public a() {
            a();
        }

        public void a() {
            g expandedItem = c.this.f840e.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<g> nonActionItems = c.this.f840e.getNonActionItems();
                int size = nonActionItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (nonActionItems.get(i10) == expandedItem) {
                        this.f846c = i10;
                        return;
                    }
                }
            }
            this.f846c = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i10) {
            ArrayList<g> nonActionItems = c.this.f840e.getNonActionItems();
            Objects.requireNonNull(c.this);
            int i11 = i10 + 0;
            int i12 = this.f846c;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return nonActionItems.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f840e.getNonActionItems().size();
            Objects.requireNonNull(c.this);
            int i10 = size + 0;
            return this.f846c < 0 ? i10 : i10 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f839d.inflate(cVar.f843h, viewGroup, false);
            }
            ((j.a) view).initialize(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(int i10, int i11) {
        this.f843h = i10;
        this.f842g = i11;
    }

    public c(Context context, int i10) {
        this(i10, 0);
        this.f838c = context;
        this.f839d = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f845j == null) {
            this.f845j = new a();
        }
        return this.f845j;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean collapseItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean expandItemActionView(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public int getId() {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.i
    public void initForMenu(Context context, e eVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.f842g == 0) {
            if (this.f838c != null) {
                this.f838c = context;
                if (this.f839d == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.f840e = eVar;
            aVar = this.f845j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f842g);
        this.f838c = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.f839d = layoutInflaterFrom;
        this.f840e = eVar;
        aVar = this.f845j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void onCloseMenu(e eVar, boolean z10) {
        i.a aVar = this.f844i;
        if (aVar != null) {
            aVar.onCloseMenu(eVar, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f840e.performItemAction(this.f845j.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.i
    public void onRestoreInstanceState(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f841f.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable onSaveInstanceState() {
        if (this.f841f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f841f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean onSubMenuSelected(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        f fVar = new f(lVar);
        e eVar = fVar.f854c;
        androidx.appcompat.app.g.a aVar = new androidx.appcompat.app.g.a(eVar.getContext());
        c cVar = new c(aVar.getContext(), R.layout.abc_list_menu_item_layout);
        fVar.f856e = cVar;
        cVar.f844i = fVar;
        fVar.f854c.addMenuPresenter(cVar);
        aVar.setAdapter(fVar.f856e.a(), fVar);
        View headerView = eVar.getHeaderView();
        if (headerView != null) {
            aVar.setCustomTitle(headerView);
        } else {
            aVar.setIcon(eVar.getHeaderIcon()).setTitle(eVar.getHeaderTitle());
        }
        aVar.setOnKeyListener(fVar);
        androidx.appcompat.app.g gVarCreate = aVar.create();
        fVar.f855d = gVarCreate;
        gVarCreate.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f855d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f855d.show();
        i.a aVar2 = this.f844i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void setCallback(i.a aVar) {
        this.f844i = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public void updateMenuView(boolean z10) {
        a aVar = this.f845j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }
}
