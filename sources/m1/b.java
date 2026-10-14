package m1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.util.Iterator;
import java.util.Map;
import vc.g;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f33173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Recreator.b f33175e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.b<String, c> f33171a = new l.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f33176f = true;

    public interface a {
        void a(d dVar);
    }

    /* JADX INFO: renamed from: m1.b$b, reason: collision with other inner class name */
    public static final class C0353b {
        public C0353b() {
        }

        public C0353b(g gVar) {
        }
    }

    public interface c {
        Bundle a();
    }

    static {
        new C0353b(null);
    }

    public final Bundle a(String str) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        if (!this.f33174d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f33173c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f33173c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f33173c;
        boolean z10 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z10 = true;
        }
        if (!z10) {
            this.f33173c = null;
        }
        return bundle2;
    }

    public final c b(String str) {
        String str2;
        c cVar;
        Iterator<Map.Entry<String, c>> it = this.f33171a.iterator();
        do {
            l.b.e eVar = (l.b.e) it;
            if (!eVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            j0.h(entry, "components");
            str2 = (String) entry.getKey();
            cVar = (c) entry.getValue();
        } while (!j0.d(str2, str));
        return cVar;
    }

    public final void c(String str, c cVar) {
        j0.i(str, Action.KEY_ATTRIBUTE);
        j0.i(cVar, "provider");
        if (!(this.f33171a.f(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d(Class<? extends a> cls) {
        if (!this.f33176f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f33175e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f33175e = bVar;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.b bVar2 = this.f33175e;
            if (bVar2 != null) {
                bVar2.f2889a.add(cls.getName());
            }
        } catch (NoSuchMethodException e10) {
            StringBuilder sbA = defpackage.a.a("Class ");
            sbA.append(cls.getSimpleName());
            sbA.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbA.toString(), e10);
        }
    }
}
