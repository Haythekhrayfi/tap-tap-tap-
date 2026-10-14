package m0;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class g implements Callable<k.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f33140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f33141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f33142f;

    public g(String str, Context context, f fVar, int i10) {
        this.f33139c = str;
        this.f33140d = context;
        this.f33141e = fVar;
        this.f33142f = i10;
    }

    @Override // java.util.concurrent.Callable
    public k.a call() throws Exception {
        return k.a(this.f33139c, this.f33140d, this.f33141e, this.f33142f);
    }
}
