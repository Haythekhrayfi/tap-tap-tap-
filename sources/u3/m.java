package u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class m extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.a f35995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f35996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<m> f35997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f35998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a3.j f35999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f36000h;

    public class a implements k {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        this(new u3.a());
    }

    @SuppressLint({"ValidFragment"})
    public m(u3.a aVar) {
        this.f35996d = new a();
        this.f35997e = new HashSet();
        this.f35995c = aVar;
    }

    public final void b(androidx.fragment.app.n nVar) {
        c();
        j jVar = a3.c.b(nVar).f18h;
        Objects.requireNonNull(jVar);
        m mVarD = jVar.d(nVar.getSupportFragmentManager(), null, !nVar.isFinishing());
        this.f35998f = mVarD;
        if (equals(mVarD)) {
            return;
        }
        this.f35998f.f35997e.add(this);
    }

    public final void c() {
        m mVar = this.f35998f;
        if (mVar != null) {
            mVar.f35997e.remove(this);
            this.f35998f = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            b(getActivity());
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35995c.c();
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f36000h = null;
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f35995c.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35995c.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f36000h;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
