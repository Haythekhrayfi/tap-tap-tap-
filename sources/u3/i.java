package u3;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class i extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.a f35979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f35980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<i> f35981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a3.j f35982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f35983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f35984h;

    public class a implements k {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + i.this + "}";
        }
    }

    public i() {
        u3.a aVar = new u3.a();
        this.f35980d = new a();
        this.f35981e = new HashSet();
        this.f35979c = aVar;
    }

    public final void a(Activity activity) {
        b();
        j jVar = a3.c.b(activity).f18h;
        Objects.requireNonNull(jVar);
        i iVarC = jVar.c(activity.getFragmentManager(), null, !activity.isFinishing());
        this.f35983g = iVarC;
        if (equals(iVarC)) {
            return;
        }
        this.f35983g.f35981e.add(this);
    }

    public final void b() {
        i iVar = this.f35983g;
        if (iVar != null) {
            iVar.f35981e.remove(this);
            this.f35983g = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35979c.c();
        b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f35979c.d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35979c.e();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f35984h;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
