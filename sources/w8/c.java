package w8;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.j0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements u9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9.e f37166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Exception> f37167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w9.e<u9.b<?>> f37168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u9.e f37169d;

    public c(u9.c cVar) {
        j0.i(cVar, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f37166a = cVar.a();
        this.f37167b = new ArrayList();
        this.f37168c = cVar.b();
        this.f37169d = new u9.e() { // from class: w8.b
            @Override // u9.e
            public final void b(Exception exc) {
                c cVar2 = this.f37165b;
                j0.i(cVar2, "this$0");
                j0.i(exc, "e");
                cVar2.f37167b.add(exc);
                cVar2.f37166a.b(exc);
            }
        };
    }

    @Override // u9.c
    public u9.e a() {
        return this.f37169d;
    }

    @Override // u9.c
    public w9.e<u9.b<?>> b() {
        return this.f37168c;
    }
}
