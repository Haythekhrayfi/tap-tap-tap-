package y1;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class h implements n1.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f38002a;

    public h(Context context) {
        this.f38002a = context;
    }

    @Override // n1.d.c
    public n1.d a(n1.d.b bVar) {
        Context context = this.f38002a;
        String str = bVar.f33611b;
        n1.d.a aVar = bVar.f33612c;
        new o1.d();
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new o1.c(context, str, aVar, true);
    }
}
