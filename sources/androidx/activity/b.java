package androidx.activity;

import android.content.Context;
import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f490a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f491b;

    public /* synthetic */ b(ComponentActivity componentActivity) {
        this.f491b = componentActivity;
    }

    public /* synthetic */ b(n nVar) {
        this.f491b = nVar;
    }

    @Override // b.b
    public final void a(Context context) {
        switch (this.f490a) {
            case 0:
                ((ComponentActivity) this.f491b).lambda$new$1(context);
                break;
            default:
                ((n) this.f491b).lambda$init$3(context);
                break;
        }
    }
}
