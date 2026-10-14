package androidx.activity;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements m1.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f494a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f495b;

    public /* synthetic */ d(ComponentActivity componentActivity) {
        this.f495b = componentActivity;
    }

    public /* synthetic */ d(n nVar) {
        this.f495b = nVar;
    }

    @Override // m1.b.c
    public final Bundle a() {
        switch (this.f494a) {
            case 0:
                return ((ComponentActivity) this.f495b).lambda$new$0();
            case 1:
                return ((n) this.f495b).lambda$init$0();
            default:
                return ((FragmentManager) this.f495b).a0();
        }
    }
}
