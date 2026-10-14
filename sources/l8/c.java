package l8;

import android.net.Uri;
import java.util.LinkedHashMap;
import y9.o8;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hb.a<m7.d> f32289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f32290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32291c;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }
    }

    static {
        new a(null);
    }

    public c(hb.a<m7.d> aVar, boolean z10, boolean z11) {
        fd.j0.i(aVar, "sendBeaconManagerLazy");
        this.f32289a = aVar;
        this.f32290b = z10;
        this.f32291c = z11;
    }

    public void a(y9.q qVar, v9.d dVar) {
        fd.j0.i(qVar, "action");
        fd.j0.i(dVar, "resolver");
        v9.b<Uri> bVar = qVar.f42097b;
        Uri uriB = bVar == null ? null : bVar.b(dVar);
        if (!this.f32290b || uriB == null) {
            return;
        }
        m7.d dVar2 = this.f32289a.get();
        if (dVar2 == null) {
            int i10 = e9.a.f29114a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v9.b<Uri> bVar2 = qVar.f42100e;
        if (bVar2 != null) {
            String string = bVar2.b(dVar).toString();
            fd.j0.h(string, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", string);
        }
        dVar2.a(uriB, linkedHashMap, qVar.f42099d);
    }

    public void b(o8 o8Var, v9.d dVar) {
        fd.j0.i(o8Var, "action");
        fd.j0.i(dVar, "resolver");
        v9.b<Uri> bVar = o8Var.f41859f;
        Uri uriB = bVar == null ? null : bVar.b(dVar);
        if (!this.f32291c || uriB == null) {
            return;
        }
        m7.d dVar2 = this.f32289a.get();
        if (dVar2 == null) {
            int i10 = e9.a.f29114a;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v9.b<Uri> bVar2 = o8Var.f41858e;
        if (bVar2 != null) {
            String string = bVar2.b(dVar).toString();
            fd.j0.h(string, "referer.evaluate(resolver).toString()");
            linkedHashMap.put("Referer", string);
        }
        dVar2.a(uriB, linkedHashMap, o8Var.f41857d);
    }
}
