package vd;

import android.util.Log;
import fd.j0;
import ke.b;
import vc.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37009b;

    public a() {
        this(false, 1, null);
    }

    public a(boolean z10) {
        this.f37009b = z10;
        this.f37008a = "KOIN";
    }

    public /* synthetic */ a(boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // ke.b
    public void a(String str) {
        j0.j(str, "msg");
        Log.e(this.f37008a, "[ERROR] - " + str);
    }

    @Override // ke.b
    public void debug(String str) {
        j0.j(str, "msg");
        if (this.f37009b) {
            Log.d(this.f37008a, str);
        }
    }

    @Override // ke.b
    public void info(String str) {
        j0.j(str, "msg");
        Log.i(this.f37008a, str);
    }
}
