package w6;

import android.content.SharedPreferences;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.l0;
import com.inscode.autoclicker.database.AppDatabase;
import com.inscode.autoclicker.ui.main.MainViewModel;
import fd.j0;
import vc.b0;
import y6.a3;
import y6.u2;
import z6.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uc.l<wd.b, fe.a> f37134a;

    public static final class a extends vc.l implements uc.l<fe.a, jc.w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f37135c = new a();

        public a() {
            super(1);
        }

        @Override // uc.l
        public jc.w invoke(fe.a aVar) throws je.d {
            fe.a aVar2 = aVar;
            j0.i(aVar2, "$this$module");
            d dVar = new d(aVar2);
            ge.c cVar = ge.c.Single;
            aVar2.f29647a.add(new ge.b<>("", b0.a(AccessibilityManager.class), null, null, cVar, false, false, null, dVar, 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(i7.d.class), null, null, cVar, false, false, null, new e(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(uc.a.class), null, null, cVar, false, false, null, g.f37118c, 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(SharedPreferences.class), null, null, cVar, false, false, null, new h(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(u2.class), null, null, cVar, false, false, null, new n(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(q6.b.class), null, null, cVar, false, false, null, new o(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(a3.class), null, null, cVar, false, false, null, new p(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(r6.e.class), null, null, cVar, false, false, null, new i(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(a7.i.class), null, null, cVar, false, false, null, new q(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(d7.o.class), null, null, cVar, false, false, null, new j(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(u0.class), null, null, cVar, false, false, null, new k(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(a7.a.class), null, null, cVar, false, false, null, new r(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(d7.g.class), null, null, cVar, false, false, null, new s(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(z6.r.class), null, null, cVar, false, false, null, new t(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(y6.s.class), null, null, cVar, false, false, null, new u(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(AppDatabase.class), null, null, cVar, false, false, null, new l(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(u6.b.class), null, null, cVar, false, false, null, new m(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(v6.b.class), null, null, cVar, false, false, null, new w6.a(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(t6.b.class), null, null, cVar, false, false, null, new b(aVar2), 140, null));
            aVar2.f29647a.add(new ge.b<>("", b0.a(i7.f.class), null, null, cVar, false, false, null, c.f37114c, 140, null));
            v vVar = new v(aVar2);
            ge.b<?> bVar = new ge.b<>("", b0.a(MainViewModel.class), null, null, ge.c.Factory, false, false, null, vVar, 140, null);
            aVar2.f29647a.add(bVar);
            bVar.a(b0.a(l0.class));
            return jc.w.f31842a;
        }
    }

    static {
        a aVar = a.f37135c;
        j0.j("", "path");
        j0.j(aVar, "definition");
        f37134a = new he.a("", false, false, aVar);
    }
}
