package a3;

import android.content.Context;
import android.content.ContextWrapper;
import g3.l;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k<?, ?> f36j = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h3.b f37a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f38b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3.e f39c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x3.e f40d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<x3.d<Object>> f41e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Class<?>, k<?, ?>> f42f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f43g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f44h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f45i;

    public e(Context context, h3.b bVar, h hVar, y3.e eVar, x3.e eVar2, Map<Class<?>, k<?, ?>> map, List<x3.d<Object>> list, l lVar, boolean z10, int i10) {
        super(context.getApplicationContext());
        this.f37a = bVar;
        this.f38b = hVar;
        this.f39c = eVar;
        this.f40d = eVar2;
        this.f41e = list;
        this.f42f = map;
        this.f43g = lVar;
        this.f44h = z10;
        this.f45i = i10;
    }
}
