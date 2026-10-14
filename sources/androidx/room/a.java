package androidx.room;

import android.content.Context;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1.d.c f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f2807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.d f2809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<g.b> f2810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g.c f2812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f2813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f2814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<Integer> f2818m;

    @Deprecated
    public a(Context context, String str, n1.d.c cVar, g.d dVar, List<g.b> list, boolean z10, g.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor2, z11, z12, z13, set, null, null);
    }

    public a(Context context, String str, n1.d.c cVar, g.d dVar, List<g.b> list, boolean z10, g.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f2806a = cVar;
        this.f2807b = context;
        this.f2808c = str;
        this.f2809d = dVar;
        this.f2810e = list;
        this.f2811f = z10;
        this.f2812g = cVar2;
        this.f2813h = executor;
        this.f2814i = executor2;
        this.f2815j = z11;
        this.f2816k = z12;
        this.f2817l = z13;
        this.f2818m = set;
    }

    @Deprecated
    public a(Context context, String str, n1.d.c cVar, g.d dVar, List<g.b> list, boolean z10, g.c cVar2, Executor executor, boolean z11, Set<Integer> set) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor, false, z11, false, set, null, null);
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f2817l) {
            return false;
        }
        return this.f2816k && ((set = this.f2818m) == null || !set.contains(Integer.valueOf(i10)));
    }
}
