package u4;

import a5.j;
import a5.u;
import android.content.Context;
import java.util.Objects;
import v5.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements x5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36005a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f36006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f36007c;

    public /* synthetic */ c(j jVar, a5.c cVar) {
        this.f36006b = jVar;
        this.f36007c = cVar;
    }

    public /* synthetic */ c(Context context, String str) {
        this.f36007c = context;
        this.f36006b = str;
    }

    public /* synthetic */ c(d dVar, Context context) {
        this.f36006b = dVar;
        this.f36007c = context;
    }

    @Override // x5.b
    public final Object get() {
        switch (this.f36005a) {
            case 0:
                d dVar = (d) this.f36006b;
                return new c6.a((Context) this.f36007c, dVar.c(), (u5.c) dVar.f36014d.a(u5.c.class));
            case 1:
                j jVar = (j) this.f36006b;
                a5.c cVar = (a5.c) this.f36007c;
                int i10 = j.f102h;
                Objects.requireNonNull(jVar);
                return cVar.f84f.a(new u(cVar, jVar));
            default:
                Context context = (Context) this.f36007c;
                String str = (String) this.f36006b;
                int i11 = v5.d.f36685f;
                return new i(context, str);
        }
    }
}
