package t0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.s0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, t0.b.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35647d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Cursor f35648e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f35649f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f35650g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0415a f35651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DataSetObserver f35652i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0.b f35653j;

    /* JADX INFO: renamed from: t0.a$a, reason: collision with other inner class name */
    public class C0415a extends ContentObserver {
        public C0415a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f35647d || (cursor = aVar.f35648e) == null || cursor.isClosed()) {
                return;
            }
            aVar.f35646c = aVar.f35648e.requery();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f35646c = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f35646c = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        e(context, cursor, 1);
    }

    public a(Context context, Cursor cursor, int i10) {
        e(context, cursor, i10);
    }

    public a(Context context, Cursor cursor, boolean z10) {
        e(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor cursor2 = this.f35648e;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0415a c0415a = this.f35651h;
                if (c0415a != null) {
                    cursor2.unregisterContentObserver(c0415a);
                }
                DataSetObserver dataSetObserver = this.f35652i;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f35648e = cursor;
            if (cursor != null) {
                C0415a c0415a2 = this.f35651h;
                if (c0415a2 != null) {
                    cursor.registerContentObserver(c0415a2);
                }
                DataSetObserver dataSetObserver2 = this.f35652i;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f35650g = cursor.getColumnIndexOrThrow("_id");
                this.f35646c = true;
                notifyDataSetChanged();
            } else {
                this.f35650g = -1;
                this.f35646c = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public CharSequence b(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor c(CharSequence charSequence) {
        return this.f35648e;
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public void e(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f35647d = true;
        } else {
            this.f35647d = false;
        }
        boolean z10 = cursor != null;
        this.f35648e = cursor;
        this.f35646c = z10;
        this.f35649f = context;
        this.f35650g = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f35651h = new C0415a();
            bVar = new b();
        } else {
            bVar = null;
            this.f35651h = null;
        }
        this.f35652i = bVar;
        if (z10) {
            C0415a c0415a = this.f35651h;
            if (c0415a != null) {
                cursor.registerContentObserver(c0415a);
            }
            DataSetObserver dataSetObserver = this.f35652i;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return g(context, cursor, viewGroup);
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f35646c || (cursor = this.f35648e) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f35646c) {
            return null;
        }
        this.f35648e.moveToPosition(i10);
        if (view == null) {
            view = f(this.f35649f, this.f35648e, viewGroup);
        }
        d(view, this.f35649f, this.f35648e);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f35653j == null) {
            this.f35653j = new t0.b(this);
        }
        return this.f35653j;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f35646c || (cursor = this.f35648e) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f35648e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f35646c && (cursor = this.f35648e) != null && cursor.moveToPosition(i10)) {
            return this.f35648e.getLong(this.f35650g);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f35646c) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f35648e.moveToPosition(i10)) {
            throw new IllegalStateException(android.support.v4.media.a.a("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = g(this.f35649f, this.f35648e, viewGroup);
        }
        d(view, this.f35649f, this.f35648e);
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return !(this instanceof s0);
    }
}
