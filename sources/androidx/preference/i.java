package androidx.preference;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i implements Preference.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PreferenceGroup f2366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2367b;

    public i(h hVar, PreferenceGroup preferenceGroup) {
        this.f2367b = hVar;
        this.f2366a = preferenceGroup;
    }

    @Override // androidx.preference.Preference.c
    public boolean a(Preference preference) {
        this.f2366a.L(Integer.MAX_VALUE);
        h hVar = this.f2367b;
        hVar.f2360g.removeCallbacks(hVar.f2361h);
        hVar.f2360g.post(hVar.f2361h);
        Objects.requireNonNull(this.f2366a);
        return true;
    }
}
