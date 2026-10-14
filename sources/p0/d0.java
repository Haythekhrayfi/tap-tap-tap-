package p0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class d0 extends e0.b<Boolean> {
    public d0(int i10, Class cls, int i11) {
        super(i10, cls, i11);
    }

    @Override // p0.e0.b
    public Boolean b(View view) {
        return Boolean.valueOf(e0.m.c(view));
    }

    @Override // p0.e0.b
    public void c(View view, Boolean bool) {
        e0.m.g(view, bool.booleanValue());
    }

    @Override // p0.e0.b
    public boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
