package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements o0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2097b;

    public /* synthetic */ m(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f2096a = 2;
        this.f2097b = onBackPressedDispatcher;
    }

    public /* synthetic */ m(n nVar, int i10) {
        this.f2096a = i10;
        this.f2097b = nVar;
    }

    @Override // o0.a
    public final void accept(Object obj) {
        switch (this.f2096a) {
            case 0:
                ((n) this.f2097b).lambda$init$1((Configuration) obj);
                break;
            case 1:
                ((n) this.f2097b).lambda$init$2((Intent) obj);
                break;
            default:
                OnBackPressedDispatcher onBackPressedDispatcher = (OnBackPressedDispatcher) this.f2097b;
                Objects.requireNonNull(onBackPressedDispatcher);
                if (l0.a.c()) {
                    onBackPressedDispatcher.c();
                }
                break;
        }
    }
}
