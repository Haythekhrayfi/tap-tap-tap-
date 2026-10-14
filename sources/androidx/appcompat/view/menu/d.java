package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f849d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f851f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LayoutInflater f852g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f853h;

    public d(e eVar, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f851f = z10;
        this.f852g = layoutInflater;
        this.f848c = eVar;
        this.f853h = i10;
        a();
    }

    public void a() {
        g expandedItem = this.f848c.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<g> nonActionItems = this.f848c.getNonActionItems();
            int size = nonActionItems.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (nonActionItems.get(i10) == expandedItem) {
                    this.f849d = i10;
                    return;
                }
            }
        }
        this.f849d = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g getItem(int i10) {
        ArrayList<g> nonActionItems = this.f851f ? this.f848c.getNonActionItems() : this.f848c.getVisibleItems();
        int i11 = this.f849d;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return nonActionItems.get(i10);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> nonActionItems = this.f851f ? this.f848c.getNonActionItems() : this.f848c.getVisibleItems();
        int i10 = this.f849d;
        int size = nonActionItems.size();
        return i10 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f852g.inflate(this.f853h, viewGroup, false);
        }
        int i11 = getItem(i10).f858b;
        int i12 = i10 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f848c.isGroupDividerEnabled() && i11 != (i12 >= 0 ? getItem(i12).f858b : i11));
        j.a aVar = (j.a) view;
        if (this.f850e) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
