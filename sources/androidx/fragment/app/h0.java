package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2059g;

    public h0(i0 i0Var, int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2055c = i10;
        this.f2056d = arrayList;
        this.f2057e = arrayList2;
        this.f2058f = arrayList3;
        this.f2059g = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i10 = 0; i10 < this.f2055c; i10++) {
            View view = (View) this.f2056d.get(i10);
            String str = (String) this.f2057e.get(i10);
            WeakHashMap<View, p0.m0> weakHashMap = p0.e0.f34354a;
            p0.e0.i.v(view, str);
            p0.e0.i.v((View) this.f2058f.get(i10), (String) this.f2059g.get(i10));
        }
    }
}
