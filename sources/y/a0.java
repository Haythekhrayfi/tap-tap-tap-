package y;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f37604a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashSet<View> f37606c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<z.a> f37608e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<z> f37605b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37607d = "ViewTransitionController";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList<z.a> f37609f = new ArrayList<>();

    public class a {
        public a(a0 a0Var, z zVar, int i10, boolean z10, int i11) {
        }
    }

    public a0(r rVar) {
        this.f37604a = rVar;
    }

    public final void a(z zVar, boolean z10) {
        int i10 = zVar.f37954u;
        int i11 = zVar.f37953t;
        z.e sharedValues = ConstraintLayout.getSharedValues();
        int i12 = zVar.f37954u;
        a aVar = new a(this, zVar, i10, z10, i11);
        HashSet<WeakReference<Object>> hashSet = sharedValues.f44960a.get(Integer.valueOf(i12));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            sharedValues.f44960a.put(Integer.valueOf(i12), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
