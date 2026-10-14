package l0;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f32095a;

    public h(Object obj) {
        this.f32095a = (LocaleList) obj;
    }

    @Override // l0.g
    public String a() {
        return this.f32095a.toLanguageTags();
    }

    @Override // l0.g
    public Object b() {
        return this.f32095a;
    }

    public boolean equals(Object obj) {
        return this.f32095a.equals(((g) obj).b());
    }

    @Override // l0.g
    public Locale get(int i10) {
        return this.f32095a.get(i10);
    }

    public int hashCode() {
        return this.f32095a.hashCode();
    }

    @Override // l0.g
    public boolean isEmpty() {
        return this.f32095a.isEmpty();
    }

    @Override // l0.g
    public int size() {
        return this.f32095a.size();
    }

    public String toString() {
        return this.f32095a.toString();
    }
}
