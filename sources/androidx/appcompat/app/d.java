package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: loaded from: classes.dex */
public class d extends CursorAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AlertController f663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AlertController.b bVar, Context context, Cursor cursor, boolean z10, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, z10);
        this.f664g = bVar;
        this.f662e = recycleListView;
        this.f663f = alertController;
        Cursor cursor2 = getCursor();
        this.f660c = cursor2.getColumnIndexOrThrow(bVar.K);
        this.f661d = cursor2.getColumnIndexOrThrow(bVar.L);
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f660c));
        this.f662e.setItemChecked(cursor.getPosition(), cursor.getInt(this.f661d) == 1);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f664g.f563b.inflate(this.f663f.M, viewGroup, false);
    }
}
