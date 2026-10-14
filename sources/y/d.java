package y;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37610a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37611b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37612c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashMap<String, androidx.constraintlayout.widget.a> f37614e;

    public abstract void a(HashMap<String, x.d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract d clone();

    public d c(d dVar) {
        this.f37610a = dVar.f37610a;
        this.f37611b = dVar.f37611b;
        this.f37612c = dVar.f37612c;
        this.f37613d = dVar.f37613d;
        this.f37614e = dVar.f37614e;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> map) {
    }
}
