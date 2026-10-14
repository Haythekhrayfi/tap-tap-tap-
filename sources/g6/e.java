package g6;

import android.content.Context;
import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements a5.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30016a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30018c;

    public /* synthetic */ e(String str, a5.c cVar) {
        this.f30017b = str;
        this.f30018c = cVar;
    }

    public /* synthetic */ e(String str, f.a aVar) {
        this.f30017b = str;
        this.f30018c = aVar;
    }

    @Override // a5.f
    public final Object a(a5.d dVar) {
        switch (this.f30016a) {
            case 0:
                return new a(this.f30017b, ((f.a) this.f30018c).d((Context) dVar.a(Context.class)));
            default:
                String str = this.f30017b;
                a5.c cVar = (a5.c) this.f30018c;
                try {
                    Trace.beginSection(str);
                    return cVar.f84f.a(dVar);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
