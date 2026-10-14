package w4;

import a5.d;
import a5.f;
import android.content.Context;
import com.google.firebase.abt.component.AbtRegistrar;
import g6.g;
import v5.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b f37109b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b f37110c = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37111a;

    public /* synthetic */ b(int i10) {
        this.f37111a = i10;
    }

    @Override // a5.f
    public final Object a(d dVar) {
        switch (this.f37111a) {
            case 0:
                return AbtRegistrar.lambda$getComponents$0(dVar);
            default:
                return new v5.d((Context) dVar.a(Context.class), ((u4.d) dVar.a(u4.d.class)).c(), dVar.d(e.class), dVar.b(g.class));
        }
    }
}
