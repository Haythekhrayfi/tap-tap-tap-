package t0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f35657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f35658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LayoutInflater f35659m;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f35658l = i10;
        this.f35657k = i10;
        this.f35659m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f35658l = i10;
        this.f35657k = i10;
        this.f35659m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f35658l = i10;
        this.f35657k = i10;
        this.f35659m = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // t0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f35659m.inflate(this.f35658l, viewGroup, false);
    }

    @Override // t0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f35659m.inflate(this.f35657k, viewGroup, false);
    }
}
